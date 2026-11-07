"""Run with Blender -b -t 4 -P tools/build_mg36_custom.py. No external downloads.

Adapt the bundled MG36's measured Java polygons, retaining its body UV islands.
Blender X points toward the muzzle, Z points up, and Y is negative native Z.
"""
import gzip
import json
import math
import struct
import sys
from pathlib import Path

import bpy
import bmesh
import numpy as np
from mathutils import Vector

ROOT = Path(__file__).resolve().parents[1]
sys.dont_write_bytecode = True
sys.path.insert(0, str(ROOT / 'tools/mg36'))
from planar_cleanup import remove_overlaps

OUT = ROOT / 'development_assets/mg36_custom'
WORK = ROOT / 'build/mg36-check'
WORK.mkdir(parents=True, exist_ok=True)
bpy.ops.object.select_all(action='SELECT')
bpy.ops.object.delete(use_global=False)

# Preserve the original islands and selector colors. Use the clean stepped
# charcoal and steel values sampled from the M4A1, HK416, and FAMAS atlases.
image = bpy.data.images.load(str(OUT / 'source_atlas.png'))
pixels = np.array(image.pixels[:], dtype=np.float32).reshape(1024, 1024, 4)
rgb = pixels[:, :, :3]
gray = rgb[:, :, 0] * 255
neutral = (np.ptp(rgb, axis=2) < .02) & (gray > 6) & (gray < 100)
charcoal_steps = np.array([26, 36, 41, 51, 65, 77])
shade = np.digitize(gray[neutral], [38, 49, 55, 68, 83])
rgb[neutral] = charcoal_steps[shade, None] / 255
# Tile coordinates below use the image's lower-left origin.
tiles = {'polymer': (32, 100, 224, 292, 36),
         'steel': (256, 100, 448, 292, 51),
         'rubber': (480, 100, 672, 292, 26),
         'white': (704, 100, 800, 196, 235),
         'label': (704, 240, 1008, 304, 41),
         'silver': (32, 328, 992, 464, 122),
         'rail': (32, 488, 224, 584, 55)}
for name, (x0, y0, x1, y1, value) in tiles.items():
    t = np.linspace(0, 1, y1-y0)
    if name == 'silver':
        # A cool gray base, a broad reflection, and two fine machined edges.
        ramp = np.interp(t, [.06, .10, .14, .29, .64, .81, .89, .94],
                        [99, 129, 109, 120, 140, 163, 190, 161])
        pixels[y0:y1, x0:x1, :3] = (ramp[:, None, None] + [-3, 0, 3]) / 255
    elif name in ('steel', 'rail', 'polymer'):
        contrast = 6 if name == 'polymer' else 14
        band = np.interp(t, [.06, .22, .48, .79, .90, .95], [-.55, -.3, .12, .48, 1, .5])
        pixels[y0:y1, x0:x1, :3] = (value + contrast*band[:, None, None]) / 255
    else:
        pixels[y0:y1, x0:x1, :3] = value / 255
    pixels[y0:y1, x0:x1, 3] = 1
# Small atlas lettering, kept as texture detail rather than text geometry.
glyphs = {'G':['01110','10001','10000','10111','10001','10001','01110'],
          '3':['11110','00001','00001','01110','00001','00001','11110'],
          '6':['01110','10000','10000','11110','10001','10001','01110'],
          '5':['11111','10000','10000','11110','00001','00001','11110'],
          '.':['00000']*6+['00100'], ' ':['00000']*7}
for i, char in enumerate('G36 5.56'):
    for row, bits in enumerate(glyphs[char]):
        for col, bit in enumerate(bits):
            if bit == '1':
                x, y = 749+i*28+col*4, 258+(6-row)*4
                pixels[y:y+4, x:x+4, :3] = 112/255
# Pack the HK416 sight strip into free atlas space at its original resolution.
hk_x, hk_y = 320, 504
hk_top, hk_height = 64, 16
hk_image = bpy.data.images.load(str(ROOT / 'eclipse/Flan/BFMC Gun Pack/assets/flansmod/skins/HK416.png'))
hk_pixels = np.array(hk_image.pixels[:], dtype=np.float32).reshape(256, 256, 4)
hk_strip = pixels[hk_y:hk_y+hk_height, hk_x:hk_x+256]
hk_strip[:, :, :3] = hk_pixels[256-hk_top-hk_height:256-hk_top, :, :3]
hk_strip[:, :, 3] = 1
atlas = bpy.data.images.new('MG36_Custom.png', width=1024, height=1024)
atlas.pixels.foreach_set(pixels.ravel())
atlas.filepath_raw = str(OUT / 'MG36_Custom.png')
atlas.file_format = 'PNG'
atlas.save()
# Render from the saved PNG so Blender and the game sample identical pixels.
bpy.data.images.remove(atlas)
atlas = bpy.data.images.load(str(OUT / 'MG36_Custom.png'))
atlas.pack()
mat = bpy.data.materials.new('MG36 one diffuse atlas')
mat.use_nodes = True
tex = mat.node_tree.nodes.new('ShaderNodeTexImage')
tex.image = atlas
mat.node_tree.links.new(tex.outputs['Color'], mat.node_tree.nodes.get('Principled BSDF').inputs['Base Color'])
mat.node_tree.nodes.get('Principled BSDF').inputs['Roughness'].default_value = .8
groups = {i: [] for i in range(5)}


def finish(obj, group=0, tile='polymer', bevel=0):
    bpy.context.view_layer.objects.active = obj
    bpy.ops.object.transform_apply(location=False, rotation=False, scale=True)
    if bevel:
        mod = obj.modifiers.new('Small manufactured edge', 'BEVEL')
        mod.width, mod.segments = bevel, 1
        bpy.ops.object.modifier_apply(modifier=mod.name)
    obj.data.materials.clear()
    obj.data.materials.append(mat)
    if tile:
        # Per-face planar islands occupy a padded material tile, with UV extent
        # on both axes. Existing imported body islands bypass this projection.
        uv = obj.data.uv_layers.active or obj.data.uv_layers.new()
        x0, y0, x1, y1, _ = tiles[tile]
        for face in obj.data.polygons:
            axis = max(range(3), key=lambda i: abs(face.normal[i]))
            axes = [i for i in range(3) if i != axis]
            coords = [obj.data.vertices[obj.data.loops[li].vertex_index].co for li in face.loop_indices]
            low = [min(p[a] for p in coords) for a in axes]
            high = [max(p[a] for p in coords) for a in axes]
            for li, p in zip(face.loop_indices, coords):
                u, v = [(p[a]-lo)/max(hi-lo, .00001) for a, lo, hi in zip(axes, low, high)]
                uv.data[li].uv = ((x0+8+u*(x1-x0-16))/1024, (y0+8+v*(y1-y0-16))/1024)
    obj['fmur_group'] = group
    groups[group].append(obj)
    return obj


def box(name, center, size, group=0, tile='polymer', bevel=.025):
    bpy.ops.mesh.primitive_cube_add(size=1, location=center)
    obj = bpy.context.object
    obj.name, obj.dimensions = name, size
    return finish(obj, group, tile, bevel)


def cylinder(name, center, radius, length, group=0, tile='steel', axis='X', segments=24):
    bpy.ops.mesh.primitive_cylinder_add(vertices=segments, radius=radius, depth=length, location=center)
    obj = bpy.context.object
    obj.name = name
    obj.rotation_euler[1 if axis == 'X' else 0] = math.pi/2
    return finish(obj, group, tile, .025)


def rail_run(name, start, end, y, z, angle=0):
    """Slotted rail with a narrow web and angled clamp shoulders."""
    profile = [(-.42, 0), (.42, 0), (.60, .073), (.60, .112),
               (.48, .18), (-.48, .18), (-.60, .112), (-.60, .073)]
    web = [(-.39, -.075), (.39, -.075), (.43, .035), (-.43, .035)]

    def section(label, x0, x1, outline):
        c, s = math.cos(angle), math.sin(angle)
        points = [(x, y+width*c-height*s, z+width*s+height*c)
                  for x in (x0, x1) for width, height in outline]
        n = len(outline)
        faces = [tuple(reversed(range(n))), tuple(range(n, 2*n))]
        for i in range(n):
            j = (i+1)%n
            faces.append((i, j, j+n, i+n))
        mesh = bpy.data.meshes.new(label)
        mesh.from_pydata(points, [], faces)
        mesh.update()
        obj = bpy.data.objects.new(label, mesh)
        bpy.context.collection.objects.link(obj)
        finish(obj, tile='rail')

    section(name+' web', start, end, web)
    for x in np.arange(start+.16, end-.10, .34):
        section(name+' lug', x-.102, x+.102, profile)


# Retain receiver, grip, trigger guard, stock, real ventilation openings and
# controls. Replace the narrow rail, square barrel, deployed bipod and drums.
parts = {}
for line in gzip.decompress((OUT / 'source_mg36.mesh.gz').read_bytes()).decode().splitlines()[1:]:
    fields = line.split('\t')
    parts.setdefault(fields[0], []).append([list(map(float, v.split(','))) for v in fields[1:]])
for key, faces in parts.items():
    kind, index = key.split('#')
    index = int(index)
    if kind not in ('gunModel', 'slideModel'):
        continue
    if kind == 'gunModel' and (index >= 484 or 471 <= index <= 476 or 300 <= index <= 307):  # bipod and replaced rail
        continue
    raw = [v for face in faces for v in face]
    if min(v[0] for v in raw) >= 157.5:  # replace square barrel
        continue
    points, polygons, uvs = [], [], []
    for face in faces:
        start = len(points)
        for x, y, z, u, v in face:
            width = 1.56 if y*.1 >= 4.8 else 1.872
            points.append((x*.1, -z*.1*width, y*.1+1.2))
            uvs.append((u, 1-v))
        polygons.append(tuple(range(start, len(points))))
    mesh = bpy.data.meshes.new(key)
    mesh.from_pydata(points, [], polygons)
    mesh.update()
    uv = mesh.uv_layers.new()
    for loop in mesh.loops:
        uv.data[loop.index].uv = uvs[loop.vertex_index]
    # Fit the silver UVs to the actual receiver shoulders and fore-end panels.
    if kind == 'gunModel' and index in (66, 128, 129, 457, 459, 460):
        fore_end = index in (128, 129)
        x0, x1 = (6.45, 15.8) if fore_end else (-.85, 8.2)
        z0, z1 = (4.1, 5.0) if fore_end else (4.55, 5.05)
        for face in mesh.polygons:
            if abs(face.normal.y) < .65 or face.area < .40:
                continue
            for i in face.loop_indices:
                x, _, z = mesh.vertices[mesh.loops[i].vertex_index].co
                u = max(0, min(1, (x-x0)/(x1-x0)))
                v = max(0, min(1, (z-z0)/(z1-z0)))
                uv.data[i].uv = ((40+944*u)/1024, (336+120*v)/1024)
    obj = bpy.data.objects.new(key, mesh)
    bpy.context.collection.objects.link(obj)
    finish(obj, 2 if kind == 'slideModel' else 0, None)

# Run the barrel from the receiver through a seat inside the handguard.
cylinder('Rifle barrel', (11.25, 0, 4.5), .205, 10.3)
box('Barrel front seat', (15.1, 0, 4.2), (.58, 1.2, .94), tile='steel')
cylinder('Muzzle collar', (16.4, 0, 4.5), .31, .2, 3)
for i in range(6):
    angle = i*math.tau/6
    obj = box('Flash hider tine', (17.15, .29*math.cos(angle), 4.5+.29*math.sin(angle)),
              (1.4, .13, .13), 3, 'steel', .015)
    obj.rotation_euler.x = angle

# A slim polymer magazine seats in the existing well and curves toward the muzzle.
magazine_profile = [(3.75, 3.02), (3.75, 1.84), (3.86, .82), (4.12, -.20), (4.48, -1.26)]
vertices = [(x+dx, y, z) for x, z in magazine_profile
            for dx, y in [(-.94, -.46), (.94, -.46), (.94, .46), (-.94, .46)]]
faces = [(0, 1, 2, 3), (19, 18, 17, 16)]
for row in range(len(magazine_profile)-1):
    for i in range(4):
        a, b = row*4+i, row*4+(i+1)%4
        faces.append((a, a+4, b+4, b))
mesh = bpy.data.meshes.new('G36 curved magazine')
mesh.from_pydata(vertices, [], faces)
mesh.update()
obj = bpy.data.objects.new(mesh.name, mesh)
bpy.context.collection.objects.link(obj)
obj.select_set(True)
finish(obj, 1, 'polymer', .045)
box('Magazine floorplate', (4.48, 0, -1.29), (2.04, 1.02, .18), 1, 'rubber')
for side in (-1, 1):
    for x, z in magazine_profile[1:-1]:
        box('Magazine molded rib', (x, side*.47, z-.20), (1.53, .085, .12), 1, 'polymer')
    cylinder('Magazine coupling stud', (3.77, side*.49, 1.45), .14, .12, 1, 'steel', 'Y', 12)

# Preserve the attachment contact planes and 1.2-unit clamp width.
rail_run('Carry Picatinny', -.9, 8.8, 0, 6.23)
rail_run('Lower Picatinny', 10.2, 13.2, 0, 3.58, math.pi)
for side in (-1, 1):
    rail_run('Side Picatinny', 10.45, 13.55, side*1.21, 4.25, -side*math.pi/2)

# Fit both pack HK416 assemblies at full clamp width and register their marks
# to the G36's existing sight line, as with the VHS-2 adaptation.
hk_parts = {}
hk_source = (OUT / 'source_hk416_sights.mesh.gz').read_bytes()
for line in gzip.decompress(hk_source).decode().splitlines():
    name, *corners = line.split('\t')
    index = int(name.split('#')[1])
    hk_parts.setdefault(index, []).append([tuple(map(float, v.split(','))) for v in corners])
assert len(hk_parts) == 51
for mark, target_x in [(31, -.11), (30, 8.04)]:
    front = mark == 30
    assembly = {i: faces for i, faces in hk_parts.items()
                if (np.mean([v[0] for face in faces for v in face]) > 5) == front}
    mark_points = np.array([v[:3] for face in hk_parts[mark] for v in face])
    mark_center = (mark_points.min(0) + mark_points.max(0)) / 2
    base = min(v[1] for faces in assembly.values() for face in faces for v in face)
    height_scale = (7.12-6.41)/(mark_center[1]-base)
    points, polygons, uvs = [], [], []
    for i, faces in assembly.items():
        if i in (30, 31, 32):
            # Keep the witness marks level on the angled rear sight plate.
            side = np.mean([v[2] for face in faces for v in face])
            box('HK416 witness mark', (target_x if front else target_x-.08, -side, 7.12),
                (.10, .05, .05), 4, 'white', 0)
            continue
        for face in faces:
            start = len(points)
            for x, y, z, u, v in face:
                points.append((target_x+x-mark_center[0], -z, 6.41+(y-base)*height_scale))
                uvs.append(((hk_x+u*256)/1024, (hk_y+hk_height-(v*256-hk_top))/1024))
            polygons.append(tuple(range(start, len(points))))
    mesh = bpy.data.meshes.new('HK416 front sight' if front else 'HK416 rear sight')
    mesh.from_pydata(points, [], polygons)
    mesh.update()
    uv = mesh.uv_layers.new()
    for loop in mesh.loops:
        uv.data[loop.index].uv = uvs[loop.vertex_index]
    obj = bpy.data.objects.new(mesh.name, mesh)
    bpy.context.collection.objects.link(obj)
    finish(obj, 4, None)
# One outward-facing decal on the left receiver panel, at positive native Z.
mesh = bpy.data.meshes.new('G36 receiver marking')
mesh.from_pydata([(x, -.851, z) for x, z in [(-.12, 4.11), (2.32, 4.11),
                                            (2.32, 4.45), (-.12, 4.45)]], [], [(0, 1, 2, 3)])
mesh.update()
obj = bpy.data.objects.new(mesh.name, mesh)
bpy.context.collection.objects.link(obj)
finish(obj, tile='label')

# Merge by animation ownership, weld shared corners and remove collapsed source
# faces before triangulation. This replaces hundreds of per-box TMT parts.
objects = []
clipped_faces = 0
for group, parts in groups.items():
    bpy.ops.object.select_all(action='DESELECT')
    for obj in parts:
        obj.select_set(True)
    bpy.context.view_layer.objects.active = parts[0]
    bpy.ops.object.join()
    obj = bpy.context.object
    obj.name = ('Receiver_stock_rails', 'Curved_magazine', 'Charging_handle', 'Default_muzzle', 'Default_iron_sights')[group]
    bm = bmesh.new()
    bm.from_mesh(obj.data)
    bmesh.ops.remove_doubles(bm, verts=list(bm.verts), dist=.000001)
    bmesh.ops.dissolve_degenerate(bm, edges=list(bm.edges), dist=.000001)
    bmesh.ops.triangulate(bm, faces=list(bm.faces))
    bm.to_mesh(obj.data)
    bm.free()
    obj.data.update()
    mesh = obj.data
    uv = mesh.uv_layers.active.data
    faces = [tuple((*mesh.vertices[mesh.loops[i].vertex_index].co, *uv[i].uv)
                   for i in face.loop_indices) for face in mesh.polygons]
    # The inherited shape boxes contain overlapping faces at the same depth.
    # Cut away the shared patches before TMT draws the triangles in-game.
    faces, clipped = remove_overlaps(faces)
    clipped_faces += clipped
    if clipped:
        points, indices, polygons = [], {}, []
        for face in faces:
            polygon = []
            for vertex in face:
                point = vertex[:3]
                if point not in indices:
                    indices[point] = len(points)
                    points.append(point)
                polygon.append(indices[point])
            polygons.append(polygon)
        clean = bpy.data.meshes.new(obj.name)
        clean.from_pydata(points, [], polygons)
        clean.update()
        uv = clean.uv_layers.new()
        for face, polygon in zip(faces, clean.polygons):
            for vertex, i in zip(face, polygon.loop_indices):
                uv.data[i].uv = vertex[3:]
        clean.materials.append(mat)
        obj.data = clean
        bpy.data.meshes.remove(mesh)
    objects.append((group, obj))

binary = ROOT / 'src/main/resources/assets/flansmod/models/mg36_custom.bin'
triangles = 0
with binary.open('wb') as file:
    file.write(struct.pack('>iii', 0x4D473336, 1, len(objects)))
    for group, obj in objects:
        name = obj.name.encode('ascii')
        file.write(struct.pack('>H', len(name)) + name)
        file.write(struct.pack('>Bi', group, len(obj.data.polygons)))
        for face in obj.data.polygons:
            file.write(struct.pack('>B', 3))
            # X,Z,-Y is a rotation, preserving outward winding and text.
            for li in face.loop_indices:
                p = obj.matrix_world @ obj.data.vertices[obj.data.loops[li].vertex_index].co
                u, v = obj.data.uv_layers.active.data[li].uv
                file.write(struct.pack('>5f', p.x, p.z, -p.y, u, 1-v))
            triangles += 1

anchors = {'scope': (3.2, 0, 6.41), 'grip': (11.5, 0, 3.4),
           'barrel': (16.3, 0, 4.5), 'gadget': (12, 1.39, 4.25),
           'accessory': (10.8, 1.39, 4.25), 'casing': (3, -.86, 4.6)}
for name, point in anchors.items():
    obj = bpy.data.objects.new('ATTACH_' + name, None)
    bpy.context.collection.objects.link(obj)
    obj.location, obj.empty_display_size = point, .5

scene = bpy.context.scene
scene.render.engine = 'BLENDER_WORKBENCH'
scene.display.shading.color_type = 'TEXTURE'
scene.display.shading.light = 'STUDIO'
scene.display.shading.show_cavity = True
scene.display.shading.cavity_type = 'BOTH'
scene.display.shading.show_shadows = False
scene.display.shading.show_backface_culling = True
scene.display.shading.background_type = 'WORLD'
scene.world.color = (.055, .065, .072)
scene.render.image_settings.file_format = 'PNG'
bpy.ops.object.camera_add()
camera = bpy.context.object
camera.data.type = 'ORTHO'
scene.camera = camera


def render(name, position, target, scale, width=1600, height=800):
    scene.render.film_transparent = name == 'MG36_icon.png'
    camera.location = position
    camera.rotation_euler = (Vector(target)-camera.location).to_track_quat('-Z', 'Y').to_euler()
    camera.data.ortho_scale = scale
    scene.render.resolution_x, scene.render.resolution_y = width, height
    scene.render.resolution_percentage = 100
    scene.render.filepath = str(OUT / name)
    bpy.ops.render.render(write_still=True)


render('MG36_preview.png', (21, -34, 17), (5, 0, 3.3), 32, 1600, 900)
render('MG36_left.png', (5, -40, 3.2), (5, 0, 3.2), 31)
render('MG36_right.png', (5, 40, 3.2), (5, 0, 3.2), 31)
render('MG36_icon.png', (5, -40, 3.2), (5, 0, 3.2), 31, 256, 256)
render('MG36_sight_line.png', (-1.7, 0, 7.12), (8, 0, 7.12), 1.5)
render('MG36_rail_fit.png', (-2.7, -4, 8.7), (-.2, 0, 6.6), 3.5)
render('MG36_mounts.png', (20, -12, 1.7), (14, 0, 3.9), 10)


def loaded_mesh(name, texture, scale=1, height=0, exclude=()):
    """Use checkMG36Geometry's real posed Java faces and configured scales."""
    path = WORK / (name + '.mesh')
    if not path.exists():
        return None
    points, faces, uvs = [], [], []
    for line in path.read_text().splitlines()[1:]:
        fields = line.split('\t')
        if fields[0] in exclude:
            continue
        row = [list(map(float, v.split(','))) for v in fields[1:]]
        start = len(points)
        for x, y, z, u, v in row:
            points.append((x*scale, -z*scale, y*scale+height))
            uvs.append((u, 1-v))
        faces.append(tuple(range(start, len(points))))
    mesh = bpy.data.meshes.new(name + ' Java loaded')
    mesh.from_pydata(points, [], faces)
    mesh.update()
    uv = mesh.uv_layers.new()
    for loop in mesh.loops:
        uv.data[loop.index].uv = uvs[loop.vertex_index]
    obj = bpy.data.objects.new(name + ' Java loaded', mesh)
    bpy.context.collection.objects.link(obj)
    m = bpy.data.materials.new(name + ' pack diffuse')
    m.use_nodes = True
    node = m.node_tree.nodes.new('ShaderNodeTexImage')
    image_path = OUT / 'MG36_Custom.png' if name == 'MG36' else ROOT / ('eclipse/Flan/BFMC Gun Pack/assets/flansmod/skins/' + texture + '.png')
    node.image = bpy.data.images.load(str(image_path), check_existing=True)
    node.image.pack()
    m.node_tree.links.new(node.outputs['Color'], m.node_tree.nodes.get('Principled BSDF').inputs['Base Color'])
    mesh.materials.append(m)
    return obj


# These views require the Java check after generation. Run this script again
# after checkMG36Geometry to regenerate the fitted views from current exports.
if (WORK / 'KXFlashHider.mesh').exists():
    for _, obj in objects:
        obj.hide_render = True
    fitted = [loaded_mesh('MG36', '', exclude=('defaultScopeModel', 'defaultBarrelModel'))]
    for name in ('HOLO', 'VerticalGrip', '5MWLaser', 'KXFlashHider'):
        fitted.append(loaded_mesh(name, name))
    render('MG36_attachments.png', (21, 34, 17), (5, 0, 3.3), 32, 1600, 900)
    render('MG36_attachment_fit.png', (10, 14, 11), (7, 0, 4.5), 18)
    for obj in fitted:
        obj.hide_render = True
        obj.hide_set(True)
    for _, obj in objects:
        obj.hide_render = False
    refs = [loaded_mesh('M4A1', 'M4A1', 1.15, 30),
            loaded_mesh('HK416', 'HK416', 1.15, 20), loaded_mesh('FAMAS', 'FAMAS', 1, 10)]
    render('MG36_scale_comparison.png', (4, -50, 18), (4, 0, 18), 41, 1600, 1700)
    for obj in refs:
        if obj is None:
            continue
        obj.hide_render = True
        obj.hide_set(True)

camera.location = (21, -34, 17)
camera.rotation_euler = (Vector((5, 0, 3.3))-camera.location).to_track_quat('-Z', 'Y').to_euler()
camera.data.ortho_scale = 32
bpy.context.preferences.filepaths.save_version = 0
bpy.ops.wm.save_as_mainfile(filepath=str(OUT / 'MG36_Custom.blend'))
(OUT / 'measurements.json').write_text(json.dumps({'triangles': triangles, 'groups': 5,
    'source_faces_with_overlap': clipped_faces,
    'anchors_blender': anchors, 'sight_line_native_y': 7.12, 'rail_width': 1.2,
    'model_scale': 1, 'atlas': [1024, 1024]}, indent=2))
print('MG36 native export:', triangles, 'triangles;', clipped_faces, 'overlapping faces resolved')


