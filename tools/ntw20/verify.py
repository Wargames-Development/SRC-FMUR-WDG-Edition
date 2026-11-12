"""Check the exported NTW-20 against Java-loaded geometry and installed assets.

Run with Blender 5.2's bundled Python after checkNTW20Geometry.
"""
import hashlib
import json
from collections import Counter
from pathlib import Path

import numpy as np
import OpenImageIO as oiio

ROOT = Path(__file__).resolve().parents[2]
OUT = ROOT / 'development_assets/ntw20/remodel'
PACK = ROOT / 'eclipse/Flan/BFMC Gun Pack'
GROUPS = {'gunModel': 'remodel', 'ammoModel': 'magazine',
          'defaultScopeModel': 'scope', 'defaultBarrelModel': 'muzzle'}


def digest(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def read_obj(path):
    positions, uvs, normals, result, seen = [], [], [], [], set()
    for line in path.read_text().splitlines():
        w = line.split()
        if not w:
            continue
        if w[0] == 'v':
            x,y,z = map(float,w[1:]); positions.append((x*.1+.5,z*.1+.5,-y*.1))
        elif w[0] == 'vt':
            u,v = map(float,w[1:]); uvs.append((u,1-v))
        elif w[0] == 'vn':
            x,y,z = map(float,w[1:]); normals.append((x,z,y))
        elif w[0] == 'f':
            refs = [tuple(int(i)-1 for i in c.split('/')) for c in w[1:]]
            p = np.array([positions[v] for v,t,n in refs])
            uv = np.array([uvs[t] for v,t,n in refs])
            n = np.array([normals[n] for v,t,n in refs])
            cross = np.cross(p[1]-p[0],p[2]-p[0])
            assert np.linalg.norm(cross) > 1e-8, path
            assert np.all(n @ cross > 0), ('loaded normal opposes winding',path)
            assert np.isfinite(p).all() and np.isfinite(uv).all()
            assert ((uv >= 0) & (uv <= 1)).all(), ('UV out of bounds',path)
            key = tuple(sorted(map(tuple,p.round(5))))
            assert key not in seen, ('duplicate triangle',path)
            seen.add(key); result.append(np.column_stack((p,uv)))
    return np.array(result)


def intersections(triangles, origin, direction):
    p = triangles[:,:,:3]
    edge1,edge2 = p[:,1]-p[:,0],p[:,2]-p[:,0]
    h = np.cross(direction,edge2); det = (edge1*h).sum(1)
    valid = abs(det) > 1e-9
    inv = np.zeros_like(det); inv[valid] = 1/det[valid]
    s = np.array(origin)-p[:,0]
    u = (s*h).sum(1)*inv
    q = np.cross(s,edge1); v = (q*direction).sum(1)*inv
    distance = (edge2*q).sum(1)*inv
    return distance[valid & (u>=0) & (v>=0) & (u+v<=1) & (distance>1e-5)]


def main():
    geometry = json.loads((OUT/'geometry.json').read_text())
    _,*rows = (ROOT/'build/ntw20-check/CUSTOM_SR_NTW20.mesh').read_text().splitlines()
    loaded = {group: [] for group in GROUPS}
    for row in rows:
        group,*corners = row.split('\t')
        if group in loaded:
            loaded[group].append([list(map(float,c.split(','))) for c in corners])
    atlas = np.asarray(oiio.ImageBuf(str(OUT/'NTW20.png')).get_pixels(oiio.UINT8))
    assert atlas.shape == (1024,2048,4)
    all_faces = []
    for group,suffix in GROUPS.items():
        filename = f'NTW20_{suffix}.obj'
        expected = read_obj(OUT/filename)
        actual = np.array(loaded[group])
        assert expected.shape == actual.shape, (group,expected.shape,actual.shape)
        assert np.allclose(expected,actual,atol=2e-6,rtol=0), (group,'Java loader differs')
        uv = actual[:,:,3:].reshape(-1,2)
        x = np.minimum((uv[:,0]*2048).astype(int),2047)
        y = np.minimum((uv[:,1]*1024).astype(int),1023)
        assert (atlas[y,x,3] == 255).all(), (group,'transparent occupied UV')
        assert digest(OUT/filename) == digest(ROOT/'eclipse/Flan/BFMCpack'/filename)
        print(group, len(expected),'triangles; Java positions/UVs, normals and installed hash PASS')
        all_faces.extend(actual)
    assert digest(OUT/'NTW20.png') == digest(PACK/'assets/flansmod/skins/NTW20.png')
    asset = OUT.parent
    definition = 'guns/CUSTOM_SR_NTW20.txt'
    assert digest(asset/'definitions'/definition) == digest(PACK/definition)
    assert digest(asset/'original/NTW-20_icon.png') == digest(PACK/'assets/flansmod/textures/items/NTW-20.png')
    original = (asset/'original/CUSTOM_SR_NTW20.txt').read_text().splitlines()
    current = (PACK/definition).read_text().splitlines()
    added = ('PictureInPicture ', 'PictureInPictureAutoDepth ', 'PictureInPictureReticle ', 'Magnification ')
    assert [line for line in current if not line.startswith(added)] == original, 'unrequested definition change'
    fields = dict(line.split(None,1) for line in current if line.strip() and not line.startswith('//') and len(line.split(None,1)) == 2)
    assert fields['Magnification'] == '8.0' and fields['PictureInPictureAutoDepth'] == 'true'
    assert fields['PictureInPictureReticle'] == 'PIP\\RifleScope'
    assert (PACK/'assets/flansmod/gui/PIP/RifleScope.png').is_file()
    lens = np.array(list(map(float,fields['PictureInPicture'].split()))) * .1
    scope = np.array(loaded['defaultScopeModel'])[:,:,:3]
    assert 0 < scope[:,:,0].min()-lens[0] < .01, 'PiP lens must sit just behind the rear eyepiece'
    assert .50 < lens[3] < .60, 'PiP aperture escaped the rear eyepiece'
    assert np.array(loaded['gunModel'])[:,:,0].max() <= 32.800002, 'body protrudes past muzzle seat'
    body = np.array(loaded['gunModel'])
    shoulder_edges = Counter()
    for triangle in body[:,:,:3]:
        for a,b in zip(triangle,np.roll(triangle,-1,axis=0)):
            if abs(a[0]-12.8) < 1e-5 and abs(b[0]-12.8) < 1e-5:
                shoulder_edges[tuple(sorted((tuple(a.round(5)),tuple(b.round(5)))))] += 1
    assert shoulder_edges and all(n == 2 for n in shoulder_edges.values()), 'open or overlapping barrel shoulder'
    for radius in (.60,.75,.88):
        for angle in np.linspace(0,2*np.pi,65)[:-1]:
            hits = intersections(body,(13.2,5.745834+radius*np.cos(angle),radius*np.sin(angle)),(-1,0,0))
            assert len(hits) and abs(hits.min()-.4) < 1e-5, 'background gap around barrel root'
    centers,uv = body[:,:,:3].mean(1),body[:,:,3:].mean(1)
    def sampled_color(mask):
        t = uv[mask]
        return np.median(atlas[(t[:,1]*1024).astype(int),(t[:,0]*2048).astype(int),:3],axis=0)
    collar = sampled_color((centers[:,0]>10.7)&(centers[:,0]<12.8)&(centers[:,1]>4.9)&(uv[:,0]<.5))
    barrel = sampled_color((centers[:,0]>15)&(centers[:,0]<30))
    assert np.max(abs(barrel-collar)) <= 4, ('barrel finish differs from receiver collar',barrel,collar)
    print('PASS: welded closed shoulder; 192 gap rays; barrel/collar RGB',barrel.tolist(),collar.tolist())
    all_faces = np.array(all_faces)
    dimensions = np.ptp(all_faces[:,:,:3],axis=(0,1))
    assert np.allclose(dimensions,geometry['dimensions'],atol=2e-6,rtol=0)
    # Test the full width of the actual loaded brake, including off-center rays.
    muzzle = np.array(loaded['defaultBarrelModel'])
    for x in (33.65,33.85,34.02,34.52,34.72,34.89,35.39,35.59,35.76):
        for dy in (-.03,0,.03):
            assert not len(intersections(muzzle,(x,5.745834+dy,-5),(0,0,1))), 'blocked brake port'
    assert not len(intersections(muzzle,(40,5.745834,0),(-1,0,0))), 'blocked muzzle bore'
    assert len(intersections(muzzle,(40,6.12,.6),(-1,0,0))), 'missing muzzle front ring'
    definitions = [p for p in (PACK/'guns').glob('*.txt')
                   if any(l.strip().lower() == 'shortname ntw20' for l in p.read_text(encoding='latin1').splitlines())]
    assert len(definitions) == 1, ('duplicate NTW20 binding',definitions)
    print('PASS: one item binding; occupied opaque UVs; installed atlas; open brake ports and bore')
    print('Effective dimensions:',dimensions.tolist())


if __name__ == '__main__':
    main()
