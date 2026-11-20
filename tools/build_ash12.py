"""Convert the supplied Toolbox ASH-12 replacement; run with --install.

Uses the same axis-major MTB corner decoding as import_tap_armor.py.
Only presentation keys in the existing definition are changed.
"""
import argparse
import collections
import hashlib
import json
import math
from pathlib import Path
import shutil
import zipfile

ROOT = Path(__file__).resolve().parents[1]
ASSET = ROOT / 'development_assets/ash12'
PACK = ROOT / 'eclipse/Flan/BFMC Gun Pack'
JAVA = ROOT / 'src/main/java/com/flansmod/client/model/BFMCpack/ModelASH12.java'


def number(value):
    return float(value.replace(',', '.'))


def literal(value):
    return format(float(value), '.8g') + 'F'


def sight_parts():
    """Original rectangular sight plate with a round hole and witness paint."""
    result = []

    def prism(name, x0, x1, yz, white=False):
        # Shape-box corner order follows the Toolbox axis-major convention.
        vertices = [(x, *yz[j]) for x, j in
                    [(x0, 0), (x1, 0), (x1, 1), (x0, 1),
                     (x0, 3), (x1, 3), (x1, 2), (x0, 2)]]
        signs = [(-1,-1,-1), (1,-1,-1), (1,-1,1), (-1,-1,1),
                 (-1,1,-1), (1,1,-1), (1,1,1), (-1,1,1)]
        offsets = [[(vertices[i][a] - (signs[i][a]+1)/2) / signs[i][a]
                    for i in range(8)] for a in range(3)]
        fields = ['Element', '0', '0', name, '2', 'Shapebox']
        fields += ['0']*3 + ['1']*3 + ['0']*6
        fields += ['500', '500'] if white else ['488', '500']
        fields += [str(v) for axis in offsets for v in axis]
        result.append(fields)

    angles = [i * math.tau / 16 for i in range(17)]
    # Include the lower rectangular corners exactly despite the off-center hole.
    angles[1], angles[15] = math.atan(.5), math.tau - math.atan(.5)
    for i, (a, b) in enumerate(zip(angles, angles[1:])):
        point = lambda r, t: (-20 + r*math.cos(t), 1 + r*math.sin(t))
        def outer(t):
            # Match the original center plate: Y -20.5..-19, Z .5..1.5.
            # The original outer shoulders are retained as source geometry.
            c, s = math.cos(t), math.sin(t)
            radius = 1 / max(abs(s)/.5, abs(c)/(1 if c >= 0 else .5))
            return point(radius, t)
        prism('Square rear plate with round hole ' + str(i), -7, -6.75,
              [point(.30,a), point(.30,b), outer(b), outer(a)])
    for name, x, y, z, height, width in [
            ('Left rear white mark', -7.002, -20, .56, .14, .10),
            ('Right rear white mark', -7.002, -20, 1.44, .14, .10),
            ('Front blade white mark', 25.248, -19.625, 1, .74, .19)]:
        prism(name, x, x+.001,
              [(y-height/2,z-width/2), (y-height/2,z+width/2),
               (y+height/2,z+width/2), (y+height/2,z-width/2)], True)
    return result


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--install', action='store_true')
    args = parser.parse_args()
    out = ASSET / 'model'
    out.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(ASSET / 'original/ASH12.mtb') as archive:
        records = archive.read('Model.txt').decode('utf-8-sig').splitlines()
        texture = archive.read('Model.png')
    assert 'TexSizeX|512' in records and 'TexSizeY|512' in records
    groups = collections.defaultdict(list)
    manifest = []
    for source_index, record in enumerate(r for r in records if r.startswith('Element|')):
        fields = record.split('|')
        if source_index in (209, 210, 211, 212):
            continue  # Replace the square hole; preserve the original shoulders.
        if fields[5] != 'Shapebox' or any(number(v) for v in fields[12:18]):
            raise ValueError('Unsupported shape/transform: ' + fields[3])
        # The source left its complete magazine in the static body group.
        # This contiguous assembly includes the neck, ribs and floorplate.
        if source_index >= 293:
            assert fields[4] == '0' and -17 <= number(fields[6]) <= -4
            group = 'ammoModel'
        else:
            group = {'0': 'gunModel', '1': 'defaultBarrelModel',
                     '2': 'defaultScopeModel', '6': 'slideModel'}[fields[4]]
        manifest.append({'source_index': source_index, 'name': fields[3],
                         'group': group, 'index': len(groups[group])})
        groups[group].append(fields)
    assert {k: len(v) for k, v in groups.items()} == {
        'gunModel': 197, 'defaultBarrelModel': 29, 'defaultScopeModel': 53,
        'slideModel': 10, 'ammoModel': 55}
    for fields in sight_parts():
        manifest.append({'source_index': None, 'name': fields[3],
                         'group': 'defaultScopeModel', 'index': len(groups['defaultScopeModel'])})
        groups['defaultScopeModel'].append(fields)
    lines = ['// Generated from the user-supplied ASH12.mtb by tools/build_ash12.py.',
             '// Source author/license were not supplied; original archive is preserved.',
             'package com.flansmod.client.model.BFMCpack;', '',
             'import com.flansmod.client.model.EnumAnimationType;',
             'import com.flansmod.client.model.ModelGun;',
             'import com.flansmod.client.tmt.ModelRendererTurbo;',
             'import com.flansmod.common.vector.Vector3f;', '',
             'public class ModelASH12 extends ModelGun {',
             '    public ModelASH12() {']
    for group in groups:
        lines.append('        init' + group[0].upper() + group[1:] + '();')
    original = (ASSET / 'original/ModelASH12.java').read_text()
    settings = original[original.index('        leftArmPos ='):original.index('        hasFlash = true;\n        flashScale')]
    settings = settings.replace('gunSlideDistance = 3.5F', 'gunSlideDistance = 0.15F')
    # Compensate the higher carry-handle mount through the existing scoped hold.
    settings = settings.replace('gunOffset = -0.58F', 'gunOffset = -0.808F')
    settings = settings.replace('translateAll(7F, -2.5F, 0F)', 'translateAll(4F, -1.5F, -1F)')
    # Socket coordinates include the whole-model translation and Y/Z flip.
    lines += ['        barrelAttachPoint = new Vector3f(31.25F / 16F, 12F / 16F, 0F);',
              '        scopeAttachPoint = new Vector3f(7F / 16F, 20.3F / 16F, 0F);',
              '        gripAttachPoint = new Vector3f(20F / 16F, 7.277778F / 16F, 0F);',
              '        gadgetAttachPoint = new Vector3f(23F / 16F, 12F / 16F, -2F / 16F);',
              settings.rstrip(), '        flashScale = 10F;',
              '        // Calibrated rear aperture and front blade; applies only to bare ADS.',
              '        ironSightOffset = new Vector3f(0F, -0.01140609F, 0.00085109F);',
              '        ironSightPitch = 0.48093978F;',
              '        ironSightYaw = -0.01892998F;',
              '        muzzleFlashPoint = new Vector3f(31.25F / (16F * flashScale),',
              '                12F / (16F * flashScale), 0F);',
              '        defaultBarrelFlashPoint = new Vector3f(5F / (16F * flashScale), 0F, 0F);',
              '        flipAll();',
              '        // The optic sits on the carry handle; retain the same assembly',
              '        // in the renderer\'s mutually exclusive attached-scope path.',
              '        // Alias after transforms so its parts are transformed only once.',
              '        attachmentScopeModel = defaultScopeModel;', '    }']
    for group, elements in groups.items():
        lines += ['', '    private void init' + group[0].upper() + group[1:] + '() {',
                  f'        {group} = new ModelRendererTurbo[{len(elements)}];']
        for index, fields in enumerate(elements):
            name = f'{group}[{index}]'
            offsets = [number(v) for v in fields[20:44]]
            corners = [literal(offsets[i + axis * 8]) for i in range(8) for axis in range(3)]
            shape = ['0F', '0F', '0F'] + fields[9:12] + ['0F'] + corners
            position = [number(v) for v in fields[6:9]]
            # The supplied archive has the complete magazine displayed below
            # the magwell. Seat its feed lips without deforming the source mesh.
            if group == 'ammoModel':
                position[0] -= 1.5
                position[1] -= 7.5
            pos = ', '.join(literal(v) for v in position)
            lines += [f'        // Source {fields[3]}',
                      f'        {name} = new ModelRendererTurbo(this, {fields[18]}, {fields[19]}, 512, 512);',
                      f'        {name}.addShapeBox({", ".join(shape)});',
                      f'        {name}.setRotationPoint({pos});']
        lines += ['    }']
    lines += ['}', '']
    (out / 'ModelASH12.java').write_text('\n'.join(lines))
    # An unused atlas tile supplies opaque white paint without changing donor UVs.
    import OpenImageIO as oiio
    (out / 'ASH12.png').write_bytes(texture)
    image = oiio.ImageBuf(str(out / 'ASH12.png'))
    pixels = image.get_pixels(oiio.UINT8)
    pixels[500:508, 500:508] = 255
    pixels[500:508, 488:496, :3] = (22, 23, 25)
    if pixels.shape[2] == 4:
        pixels[500:508, 488:496, 3] = 255
    painted = oiio.ImageBuf(oiio.ImageSpec(512, 512, pixels.shape[2], oiio.UINT8))
    painted.set_pixels(oiio.ROI(0,512,0,512), pixels)
    if not painted.write(str(out / 'ASH12.png')):
        raise RuntimeError(painted.geterror())
    definition = (ASSET / 'original/RU_AR_ASH-12.txt').read_text()
    replacements = {'ModelScale 0.26': 'ModelScale 0.36',
                    '3rdModel ransya.A91': '3rdModel BFMCpack.ASH12',
                    '3rdModelScale 0.3': '3rdModelScale 0.36',
                    '3rdTexture 3rd/A91': '3rdTexture ASH12'}
    for old, new in replacements.items():
        assert definition.count(old) == 1
        definition = definition.replace(old, new)
    (out / 'RU_AR_ASH-12.txt').write_text(definition)
    (out / 'parts.json').write_text(json.dumps(manifest, indent=2) + '\n')
    if args.install:
        shutil.copy2(out / 'ModelASH12.java', JAVA)
        shutil.copy2(out / 'ASH12.png', PACK / 'assets/flansmod/skins/ASH12.png')
        shutil.copy2(out / 'RU_AR_ASH-12.txt', PACK / 'guns/RU_AR_ASH-12.txt')
    print('ASH-12: short bolt travel, rounded rear aperture and white indicators installed.')
    print('Source SHA256:', hashlib.sha256((ASSET / 'original/ASH12.mtb').read_bytes()).hexdigest())


if __name__ == '__main__':
    main()
