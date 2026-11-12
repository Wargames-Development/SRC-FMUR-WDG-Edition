"""Refit Ri-Ri's Thunder for BFMC; run with Blender 5.2 --python, then -- --install.

The archived donor remains untouched. Native output is Y-up, in pack units.
"""
import argparse
from collections import defaultdict
import json
from pathlib import Path
import shutil
import sys

import bpy
from mathutils import Vector
import numpy as np
import OpenImageIO as oiio

ROOT = Path(__file__).resolve().parents[1]
ASSET = ROOT / 'development_assets/triple_action_thunder'
OUT = ASSET / 'remodel'
PACK = ROOT / 'eclipse/Flan/BFMC Gun Pack'
TRANSFORM = np.array((1.31, 1.10, 1.05))
OFFSET = np.array((1.0, 4.6, 0.0))


def image(path):
    buf = oiio.ImageBuf(str(path))
    pixels = buf.get_pixels(oiio.UINT8)
    if pixels is None:
        raise RuntimeError(buf.geterror())
    return np.asarray(pixels)


def atlas():
    source = image(ASSET / 'game_ready/TripleActionThunder.png')[:, :, :3].astype(float)
    reference = image(PACK / 'assets/flansmod/skins/VSS.png')[:, :, :3].reshape(-1, 3)
    wood = reference[(reference[:, 0] > reference[:, 1] * 1.3) &
                     (reference[:, 1] > reference[:, 2] * 1.05) & (reference[:, 0] > 35)]
    if len(wood) == 0:
        raise RuntimeError('VSS walnut reference pixels not found')
    walnut = np.median(wood, axis=0)
    y, x = np.mgrid[:source.shape[0], :source.shape[1]]
    warm = (source[:, :, 0] > source[:, :, 1] * 1.3) & (source[:, :, 0] > 40)
    # Compress the donor's baked orange grain; keep only quiet, irregular stain.
    stain = 2 * np.sin(y / 87 + np.sin(x / 143)) + 1.2 * np.sin(x / 9 + y / 62)
    grain = np.clip((source.mean(2) - 65) * .045, -2, 2) + stain
    pixels = 40 + source * .43
    pixels[source.min(2) > 230] = (189, 190, 184)
    pixels[warm] = walnut + grain[warm, None]
    pixels = np.clip(pixels, 0, 255).astype(np.uint8)
    # This donor island maps atlas V along the bore; reverse its mirrored marking.
    pixels[700:940, 20:140] = pixels[700:940, 20:140][::-1].copy()
    # Reserved corner swatches for newly built steel and sight paint.
    pixels[:24, -48:-24] = (48, 50, 50)
    pixels[:24, -24:] = (232, 231, 219)
    buf = oiio.ImageBuf(oiio.ImageSpec(pixels.shape[1], pixels.shape[0], 3, oiio.UINT8))
    buf.set_pixels(oiio.ROI(0, pixels.shape[1], 0, pixels.shape[0], 0, 1, 0, 3), pixels)
    if not buf.write(str(OUT / 'TripleActionThunder.png')):
        raise RuntimeError(buf.geterror())
    return walnut.tolist()


def donor():
    vertices, uvs, normals, faces = [], [], [], []
    for line in (ASSET / 'game_ready/TripleActionThunder.obj').read_text().splitlines():
        w = line.split()
        if not w:
            continue
        if w[0] == 'v':
            vertices.append(tuple(map(float, w[1:])))
        elif w[0] == 'vt':
            u, v = map(float, w[1:])
            uvs.append((u, 1 - v))
        elif w[0] == 'vn':
            normals.append(tuple(map(float, w[1:])))
        elif w[0] == 'f':
            ids = [tuple(int(i) - 1 for i in c.split('/')) for c in w[1:]]
            for i in range(1, len(ids) - 1):
                ids3 = (ids[0], ids[i], ids[i + 1])
                points = np.array([vertices[v] for v, _, _ in ids3])
                uv = np.array([uvs[t] for _, t, _ in ids3])
                # The archived donor already compensated normals for the legacy loader.
                n = np.mean([normals[n] for _, _, n in ids3], axis=0) * (1, -1, 1)
                if np.cross(points[1] - points[0], points[2] - points[0]) @ n < 0:
                    points, uv = points[[0, 2, 1]], uv[[0, 2, 1]]
                faces.append((points, uv))
    # Identify complete connected assemblies across material seams.
    edges, keys = defaultdict(list), []
    for i, (points, _) in enumerate(faces):
        a, b, c = map(tuple, points.round(4))
        keys.append([tuple(sorted(e)) for e in ((a, b), (b, c), (c, a))])
        for e in keys[-1]:
            edges[e].append(i)
    pending, result = set(range(len(faces))), []
    for i in range(len(faces)):
        if i not in pending:
            continue
        queue = [i]
        pending.remove(i)
        for j in queue:
            for e in keys[j]:
                for neighbor in edges[e]:
                    if neighbor in pending:
                        pending.remove(neighbor)
                        queue.append(neighbor)
        points = np.concatenate([faces[j][0] for j in queue])
        lo, hi = points.min(0), points.max(0)
        # Replace the donor's uneven rear sight and open front ramp as whole shells.
        if lo[1] > 1.42 and (hi[0] < -2.4 or lo[0] > 2.4):
            continue
        result.extend((faces[j][0] * TRANSFORM + OFFSET, faces[j][1]) for j in queue)
    return result


def box(mesh, low, high, paint=False):
    x, y, z = low
    X, Y, Z = high
    corners = np.array(((x,y,z),(X,y,z),(X,Y,z),(x,Y,z),
                        (x,y,Z),(X,y,Z),(X,Y,Z),(x,Y,Z)))
    uv = np.tile((2040 / 2048 if paint else 2010 / 2048, 12 / 1024), (3, 1))
    for face in ((0,3,2,1),(4,5,6,7),(0,1,5,4),(3,7,6,2),(0,4,7,3),(1,2,6,5)):
        for a, b, c in ((0,1,2),(0,2,3)):
            mesh.append((corners[[face[a], face[b], face[c]]], uv.copy()))


def sights(mesh):
    box(mesh, (-3.02, 6.19, -.36), (-2.30, 6.40, .36))
    for z0, z1 in ((-.36, -.12), (.12, .36)):
        box(mesh, (-2.94, 6.40, z0), (-2.67, 6.70, z1))
        box(mesh, (-2.943, 6.51, (z0+z1)/2-.038),
            (-2.940, 6.60, (z0+z1)/2+.038), True)
    box(mesh, (6.45, 6.14, -.18), (6.98, 6.28, .18))
    box(mesh, (6.63, 6.28, -.075), (6.85, 6.60, .075))
    box(mesh, (6.627, 6.43, -.060), (6.630, 6.595, .060), True)


def export(mesh):
    lines, seen, clean = ['# Ri-Ri, CC BY 4.0; FMUR refit. See ATTRIBUTION.txt.'], set(), []
    for points, uv in mesh:
        normal = np.cross(points[1] - points[0], points[2] - points[0])
        length = np.linalg.norm(normal)
        key = tuple(sorted(map(tuple, points.round(5))))
        if length < 1e-8 or key in seen:
            continue
        seen.add(key)
        normal /= length
        ids = []
        for point, (u, v) in zip(points, uv):
            i = len(clean) * 3 + len(ids) + 1
            # Legacy OBJ normals swap axes without the position sign inversion.
            lines.extend(('v %.6f %.6f %.6f' % tuple(point), 'vt %.7f %.7f' % (u, 1-v),
                          'vn %.6f %.6f %.6f' % (normal[0], -normal[1], normal[2])))
            ids.append(f'{i}/{i}/{i}')
        lines.append('f ' + ' '.join(ids))
        clean.append((points, uv))
    (OUT / 'TripleActionThunder.obj').write_text('\n'.join(lines)+'\n', encoding='ascii')
    return clean


def scene(mesh):
    bpy.ops.object.select_all(action='SELECT')
    bpy.ops.object.delete(use_global=False)
    vertices = [tuple(p[[0, 2, 1]] * (1, -1, 1)) for points, _ in mesh for p in points]
    data = bpy.data.meshes.new('Thunder refit')
    data.from_pydata(vertices, [], [tuple(range(i, i+3)) for i in range(0, len(vertices), 3)])
    data.uv_layers.new()
    for polygon, (_, uv) in zip(data.polygons, mesh):
        for loop, (u, v) in zip(polygon.loop_indices, uv):
            data.uv_layers.active.data[loop].uv = (u, 1-v)
    obj = bpy.data.objects.new('Triple Action Thunder', data)
    bpy.context.collection.objects.link(obj)
    material = bpy.data.materials.new('BFMC stainless and VSS walnut')
    material.use_nodes = True
    tex = material.node_tree.nodes.new('ShaderNodeTexImage')
    tex.image = bpy.data.images.load(str(OUT / 'TripleActionThunder.png'))
    tex.interpolation = 'Closest'
    shader = material.node_tree.nodes.get('Principled BSDF')
    material.node_tree.links.new(tex.outputs['Color'], shader.inputs['Base Color'])
    shader.inputs['Roughness'].default_value = .78
    data.materials.append(material)
    bpy.context.view_layer.objects.active = obj
    obj.select_set(True)
    s = bpy.context.scene
    s.render.engine = 'CYCLES'
    s.cycles.samples = 24
    s.render.resolution_x, s.render.resolution_y, s.render.resolution_percentage = 1400, 650, 100
    s.world.color = (.22, .25, .28)
    s.view_settings.view_transform = 'Standard'
    for name, position, power, size in [('Key', (0,-8,15), 1800, 10), ('Fill',(4,8,10),1100,8)]:
        lamp = bpy.data.lights.new(name, 'AREA')
        lamp.energy, lamp.shape, lamp.size = power, 'DISK', size
        ob = bpy.data.objects.new(name, lamp)
        bpy.context.collection.objects.link(ob)
        ob.location = position
        ob.rotation_euler = (Vector((2,0,4.6))-ob.location).to_track_quat('-Z','Y').to_euler()
    camera = bpy.data.objects.new('Camera', bpy.data.cameras.new('Camera'))
    bpy.context.collection.objects.link(camera)
    s.camera = camera
    camera.data.type, camera.data.ortho_scale = 'ORTHO', 15.5
    for name, position in [('profile',(2,-28,4.6)), ('preview',(11,-28,15))]:
        camera.location = position
        camera.rotation_euler = (Vector((2.2,0,4.6))-camera.location).to_track_quat('-Z','Y').to_euler()
        s.render.filepath = str(OUT / (name+'.png'))
        bpy.ops.render.render(write_still=True)
    tex.image.pack()
    bpy.context.preferences.filepaths.save_version = 0
    bpy.ops.wm.save_as_mainfile(filepath=str(OUT / 'TripleActionThunder.blend'))


def install():
    shutil.copy2(OUT / 'TripleActionThunder.obj', ROOT / 'eclipse/Flan/BFMCpack/TripleActionThunder.obj')
    for destination in (PACK / 'assets/flansmod/skins/TripleActionThunder.png',
                        ASSET / 'definitions/assets/flansmod/skins/TripleActionThunder.png'):
        shutil.copy2(OUT / 'TripleActionThunder.png', destination)


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--install', action='store_true')
    args = parser.parse_args(sys.argv[sys.argv.index('--')+1:] if '--' in sys.argv else [])
    OUT.mkdir(parents=True, exist_ok=True)
    palette = atlas()
    mesh = donor()
    sights(mesh)
    mesh = export(mesh)
    points = np.concatenate([p for p, _ in mesh])
    report = dict(triangles=len(mesh), bounds=[points.min(0).tolist(), points.max(0).tolist()],
                  dimensions=np.ptp(points, axis=0).tolist(), walnut_rgb=palette,
                  front_sight=[6.627,6.60,0], rear_sight=[-2.943,6.60,0])
    (OUT / 'geometry.json').write_text(json.dumps(report, indent=2)+'\n')
    shutil.copy2(ASSET / 'game_ready/ATTRIBUTION.txt', OUT / 'ATTRIBUTION.txt')
    scene(mesh)
    if args.install:
        install()
    print(json.dumps(report))
