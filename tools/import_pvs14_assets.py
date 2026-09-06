"""Import supplied PVS-14 meshes/textures and render inventory icons from their geometry.
Usage: python tools/import_pvs14_assets.py <directory containing supplied files>
Requires Pillow and numpy for the offline inventory icon rendering only.
"""
from pathlib import Path
import json
import shutil
import sys
import numpy as np
from PIL import Image

source = Path(sys.argv[1])
assets = Path(__file__).resolve().parents[1] / 'src/main/resources/assets/flansmod'
model_dir = assets / 'models/pvs14'
model_dir.mkdir(parents=True, exist_ok=True)

def forge_float(token):
    """Forge 1.7.10's OBJ parser accepts decimal notation, but not exponents."""
    value = float(token)
    if abs(value) < 0.000000000000005:
        return '0'
    return ('%.15f' % value).rstrip('0').rstrip('.')

model = json.loads((source / 'PVS-14.bbmodel').read_text(encoding='utf-8'))
names = {element['uuid']: element['name'] for element in model['elements']}
static = {names[uuid] for uuid in model['outliner'][0]['children']}
assert next(g for g in model['groups'] if g['name'] == 'NVG_FLIP_ASSEMBLY')['origin'] == [5.5, 4.88, 0]
vertices, uvs, normals, faces = [], [], [], []
for line in (source / 'PVS-14_Flip.obj').read_text().splitlines():
    fields = line.split()
    if not fields:
        continue
    if fields[0] == 'v': vertices.append([forge_float(value) for value in fields[1:]])
    elif fields[0] == 'vt': uvs.append([forge_float(value) for value in fields[1:]])
    elif fields[0] == 'vn': normals.append([forge_float(value) for value in fields[1:]])
    elif fields[0] == 'o': group = fields[1]
    elif fields[0] == 'f':
        # Forge 1.7.10 cannot mix triangles and quads within an OBJ group.
        for i in range(2, len(fields) - 1):
            faces.append((group, [fields[1], fields[i], fields[i + 1]]))
assert static <= {group for group, _ in faces}
for piece in ('Mount', 'Flip'):
    # The item renderer binds the equipped variant's texture. Do not retain the
    # supplied MTL reference because both source MTLs hard-code the WP texture.
    lines = ['# PVS-14: supplied geometry, split by Blockbench animation groups; triangulated.']
    for prefix, records in [('v', vertices), ('vt', uvs), ('vn', normals)]:
        lines += [prefix + ' ' + ' '.join(record) for record in records]
    previous = None
    selected = [(g, f) for g, f in faces if (g in static) == (piece == 'Mount')]
    assert selected
    for group, face in selected:
        if group != previous:
            lines.append('o ' + group)
            previous = group
        lines.append('f ' + ' '.join(face))
    (model_dir / ('PVS-14_' + piece + '_runtime.obj')).write_text('\n'.join(lines) + '\n')

# Orthographic textured rendering of the original mesh, without repainting its textures.
vertices = np.array(vertices, dtype=float)
uvs = np.array(uvs, dtype=float)
right = np.array([0.65, 0, -0.76]); right /= np.linalg.norm(right)
view = np.array([0.76, 0.40, 0.65]); view /= np.linalg.norm(view)
up = np.cross(view, right); up /= np.linalg.norm(up)
points = np.column_stack((vertices @ right, -vertices @ up, vertices @ view))
low, high = points[:, :2].min(axis=0), points[:, :2].max(axis=0)
size = 128
points[:, :2] = (points[:, :2] - (low + high) / 2) * ((size - 12) / max(high - low)) + size / 2
variants = {
    'pvs14': 'PVS-14_1.png', 'pvs14_wp': 'PVS-14WP_1.png',
    'pvs14_amber': 'PVS-14_AM_1.png', 'pvs14_black': 'PVS-14BLACK_1.png',
    'pvs14_wp_black': 'PVS-14WPBLACK_1.png', 'pvs14_amber_black': 'PVS-14AMBLACK_1.png',
}
for icon, filename in variants.items():
    shutil.copyfile(source / filename, assets / 'armor' / filename)
    texture = np.array(Image.open(source / filename).convert('RGBA'))
    height, width = texture.shape[:2]
    canvas = np.zeros((size, size, 4), dtype=np.uint8)
    depth = np.full((size, size), -np.inf)
    for group, face in faces:
        indices = [[int(v) - 1 for v in ref.split('/')] for ref in face]
        tri = points[[i[0] for i in indices]]
        tex = uvs[[i[1] for i in indices]]
        a, b, c = tri
        denominator = (b[1]-c[1])*(a[0]-c[0]) + (c[0]-b[0])*(a[1]-c[1])
        if abs(denominator) < 1e-8: continue
        x0, y0 = np.maximum(0, np.floor(tri[:, :2].min(axis=0))).astype(int)
        x1, y1 = np.minimum(size-1, np.ceil(tri[:, :2].max(axis=0))).astype(int)
        yy, xx = np.mgrid[y0:y1+1, x0:x1+1]
        wa = ((b[1]-c[1])*(xx+0.5-c[0]) + (c[0]-b[0])*(yy+0.5-c[1])) / denominator
        wb = ((c[1]-a[1])*(xx+0.5-c[0]) + (a[0]-c[0])*(yy+0.5-c[1])) / denominator
        wc = 1-wa-wb
        z = wa*a[2]+wb*b[2]+wc*c[2]
        uv = wa[...,None]*tex[0]+wb[...,None]*tex[1]+wc[...,None]*tex[2]
        tx = np.clip((uv[...,0]*width).astype(int), 0, width-1)
        ty = np.clip(((1-uv[...,1])*height).astype(int), 0, height-1)
        color = texture[ty,tx].copy()
        normal = np.array(normals[indices[0][2]], dtype=float)
        shade = 0.65 + 0.35 * abs(np.dot(normal, view))
        color[...,:3] = (color[...,:3]*shade).astype(np.uint8)
        visible = (wa>=-1e-6)&(wb>=-1e-6)&(wc>=-1e-6)&(z>depth[yy,xx])&(color[...,3]>0)
        canvas[yy[visible],xx[visible]] = color[visible]
        depth[yy[visible],xx[visible]] = z[visible]
    Image.fromarray(canvas).resize((32,32), Image.Resampling.LANCZOS).save(assets / 'textures/items' / (icon+'.png'))
print('Imported two triangulated meshes, six unchanged textures, and six rendered icons.')
