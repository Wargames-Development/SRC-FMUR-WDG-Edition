"""Run after checkASH12Geometry with Blender's bundled Python."""
from pathlib import Path
import collections
import json
import zipfile
import numpy as np
import OpenImageIO as oiio

ROOT = Path(__file__).resolve().parents[2]
ASSET = ROOT / 'development_assets/ash12'
PACK = ROOT / 'eclipse/Flan/BFMC Gun Pack'
OUT = ASSET / 'model'


def main():
    loaded = collections.defaultdict(list)
    loaded_uvs = collections.defaultdict(list)
    for line in (ROOT / 'build/ash12-check/ASH12.mesh').read_text().splitlines():
        words = line.split()
        loaded[words[0]].extend([list(map(float, w.split(',')))[:3] for w in words[1:]])
        loaded_uvs[words[0]].extend([list(map(float, w.split(',')))[3:] for w in words[1:]])
    manifest = json.loads((OUT / 'parts.json').read_text())
    with zipfile.ZipFile(ASSET / 'original/ASH12.mtb') as z:
        elements = [l.split('|') for l in z.read('Model.txt').decode('utf-8-sig').splitlines()
                    if l.startswith('Element|')]
        original_texture = z.read('Model.png')
    original_png = ROOT / 'build/ash12-check/source-texture.png'
    original_png.write_bytes(original_texture)
    original_pixels = oiio.ImageBuf(str(original_png)).get_pixels(oiio.UINT8)
    pixels = oiio.ImageBuf(str(OUT / 'ASH12.png')).get_pixels(oiio.UINT8)
    assert (pixels[500:508,500:508] == 255).all()
    preserved_pixels = pixels.copy()
    preserved_pixels[500:508,500:508] = original_pixels[500:508,500:508]
    preserved_pixels[500:508,488:496] = original_pixels[500:508,488:496]
    assert np.array_equal(preserved_pixels, original_pixels), 'Unrelated atlas pixels changed'
    # Independently decode each source corner, then compare to Java's real TMT faces.
    signs = np.array([[-1,-1,-1], [1,-1,-1], [1,-1,1], [-1,-1,1],
                      [-1,1,-1], [1,1,-1], [1,1,1], [-1,1,1]])
    assert len(loaded) == len(manifest) == 363
    error = 0
    for part in manifest:
        if part['source_index'] is None:
            continue
        fields = elements[part['source_index']]
        vals = lambda seq: np.array([float(v.replace(',', '.')) for v in seq])
        offsets = vals(fields[20:44]).reshape(3, 8).T
        expected = vals(fields[6:9]) + (signs + 1) / 2 * vals(fields[9:12]) + signs * offsets
        if part['group'] == 'ammoModel':
            expected[:, 0] -= 1.5
            expected[:, 1] -= 7.5
        expected = (expected + (4, -1.5, -1)) * (1, -1, -1) * .36
        actual = np.array(loaded[part['group'] + '#' + str(part['index'])])
        distances = np.linalg.norm(expected[:, None, :] - actual[None, :, :], axis=2)
        error = max(error, distances.min(axis=0).max(), distances.min(axis=1).max())
    assert error < .00001, error
    mounts = json.loads((ROOT / 'build/ash12-check/mounts.json').read_text())
    body = np.concatenate([np.array(v) for k,v in loaded.items() if k.startswith('gunModel#')])
    carry = np.concatenate([np.array(v) for k,v in loaded.items() if k.startswith('defaultScopeModel#')])
    assembly = np.concatenate((body,carry))
    top_rail = assembly[abs(assembly[:,0]-mounts['scope'][0])<1.5,1].max()
    bottom_rail = body[abs(body[:,0]-mounts['grip'][0])<.7,1].min()
    # HOLO/Reflex main base undersides are at local Y=0; their jaws extend below.
    assert abs(mounts['scope'][1]-top_rail) < .00001, 'Sight base buried in rail'
    grip_deck = []
    for line in (ROOT/'build/ash12-check/VerticalGrip.mesh').read_text().splitlines():
        words = line.split()
        if words[0]=='attachmentModel#0':
            grip_deck.extend(float(w.split(',')[1]) for w in words[1:])
    assert abs(mounts['grip'][1]+max(grip_deck)-bottom_rail) < .00001, 'Grip deck buried in rail'
    assert abs(mounts['scope'][1]+mounts['scopedOffsetY']-6.5) < .00001, 'Scoped aim height drifted'
    neck = np.concatenate([np.array(loaded['ammoModel#'+str(i)]) for i in range(7,15)])
    well = np.array(loaded['gunModel#8'])
    assert neck[:,0].max() < well[:,0].max(), 'Magazine neck protrudes past magwell front'
    # Lower stacked cartridges remain inside the magazine shell; the top round
    # must be inside the receiver rather than visible above the installed neck.
    rounds = np.concatenate([np.array(loaded['ammoModel#'+str(i)]) for i in range(19,31)])
    assert rounds[:,1].min() > well[:,1].min(), 'Rounds exposed beneath magwell'
    # Original rectangular plate envelope around the circular opening.
    for index in range(53,69):
        vertices = np.array(loaded['defaultScopeModel#' + str(index)])
        raw_yz = vertices[:,1:] / -.36 + (1.5,1)
        relative = raw_yz - (-20,1)
        radii = np.linalg.norm(relative, axis=1)
        outside = np.maximum(abs(relative[:,1])/.5,
                             abs(relative[:,0])/np.where(relative[:,0]>=0,1,.5))
        assert np.max(np.minimum(abs(radii-.30), abs(outside-1))) < .00001
    lower = np.concatenate([np.array(loaded['defaultScopeModel#'+str(i)]) for i in range(53,69)])
    lower_raw = lower[:,1:] / -.36 + (1.5,1)
    flat = lower_raw[abs(lower_raw[:,0]+19) < .00001]
    assert abs(flat[:,1].min()-.5) < .00001 and abs(flat[:,1].max()-1.5) < .00001
    assert abs(lower_raw[:,0].min()+20.5) < .00001
    # Marks sit beside the inner opening, fully supported by the rear face.
    for index, center_z in [(69,.56),(70,1.44)]:
        raw = np.array(loaded['defaultScopeModel#'+str(index)])[:,1:] / -.36 + (1.5,1)
        assert abs((raw[:,1].min()+raw[:,1].max())/2-center_z) < .00001
        assert np.linalg.norm(raw-(-20,1),axis=1).min() > .30
    for index in range(69,72):
        assert 'defaultScopeModel#' + str(index) in loaded
    for index in range(53,72):
        uv = np.array(loaded_uvs['defaultScopeModel#' + str(index)])
        texels = pixels[(uv[:,1]*512).astype(int), (uv[:,0]*512).astype(int)]
        assert (texels[:,3] == 255).all(), 'Transparent sight geometry'
        if index >= 69:
            assert (texels[:,:3] == 255).all(), 'White marker outside paint tile'
    original = (ASSET / 'original/RU_AR_ASH-12.txt').read_text().splitlines()
    current = (OUT / 'RU_AR_ASH-12.txt').read_text().splitlines()
    allowed = {'ModelScale', '3rdModel', '3rdModelScale', '3rdTexture'}
    unchanged = lambda lines: [l for l in lines if not l.split() or l.split()[0] not in allowed]
    assert unchanged(original) == unchanged(current), 'Gameplay definition changed'
    for source, destination in [(OUT / 'ASH12.png', PACK / 'assets/flansmod/skins/ASH12.png'),
                                (OUT / 'RU_AR_ASH-12.txt', PACK / 'guns/RU_AR_ASH-12.txt'),
                                (OUT / 'ModelASH12.java', ROOT / 'src/main/java/com/flansmod/client/model/BFMCpack/ModelASH12.java')]:
        assert source.read_bytes() == destination.read_bytes(), str(destination)
    bindings = [p for p in (PACK / 'guns').glob('*.txt')
                if any(l.strip().lower() == 'shortname ash12' for l in p.read_text(errors='replace').splitlines())]
    assert len(bindings) == 1, bindings
    all_positions = np.concatenate([np.array(p) for p in loaded.values()])
    report = {'parts': len(manifest), 'maximum_source_error': float(error),
              'effective_bounds': [all_positions.min(axis=0).tolist(), all_positions.max(axis=0).tolist()],
              'dimensions': np.ptp(all_positions, axis=0).tolist(),
              'groups': dict(collections.Counter(p['group'] for p in manifest)),
              'unique_ash12_binding': str(bindings[0].relative_to(ROOT)),
              'gameplay_definition_unchanged': True, 'installed_assets_match': True,
              'mounts': mounts, 'top_rail_y':float(top_rail), 'bottom_rail_y':float(bottom_rail),
              'magazine_neck_front_clearance':float(well[:,0].max()-neck[:,0].max())}
    (ASSET / 'geometry_validation.json').write_text(json.dumps(report, indent=2) + '\n')
    print(json.dumps(report, indent=2))


if __name__ == '__main__':
    main()
