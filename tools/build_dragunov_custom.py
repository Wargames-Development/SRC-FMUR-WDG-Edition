"""Generate the editable Dragunov, runtime atlas and native TMT mesh in Blender."""
import math
import struct
import sys
from pathlib import Path

import bmesh
import bpy
import numpy as np
from mathutils import Vector

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / 'development_assets/dragunov_custom'
MODELS = ROOT / 'src/main/resources/assets/flansmod/models'
SIZE = 512
MODEL_SCALE = 1.35
GROUPS = {name: [] for name in ('Receiver and furniture', 'Magazine', 'Bolt', 'Iron sights')}


def export_geometry(groups):
    # (x, z, -y) is a proper rotation from Blender to TMT, so retain winding.
    output = bytearray(struct.pack('>2i', 0x53564431, 1))
    for name, objects in groups.items():
        triangles = []
        for obj in objects:
            obj.data.calc_loop_triangles()
            uv = obj.data.uv_layers.active.data
            mirrored = obj.matrix_world.to_3x3().determinant() < 0
            for tri in obj.data.loop_triangles:
                assert tri.area > 1e-9, f'Degenerate triangle in {obj.name}'
                corners = list(zip(tri.vertices, tri.loops))
                for vertex, loop in reversed(corners) if mirrored else corners:
                    point = obj.matrix_world @ obj.data.vertices[vertex].co
                    x, y, z = point / MODEL_SCALE
                    u, v = uv[loop].uv
                    assert 0 < u < 1 and 0 < v < .5, f'UV outside atlas tiles in {obj.name}'
                    triangles.append(struct.pack('>5f', x, z, -y, u, 1 - v))
        count = len(triangles) // 3
        assert 0 < count <= 12000, f'Invalid triangle count for {name}'
        output.extend(struct.pack('>i', count))
        output.extend(b''.join(triangles))
        print(f'{name}: {count} triangles')
    (MODELS / 'dragunov_custom.bin').write_bytes(output)


if '--export-only' in sys.argv:
    export_geometry({name: bpy.data.collections[name].objects for name in GROUPS})
    sys.exit(0)

bpy.ops.wm.read_factory_settings(use_empty=True)
collections = {name: bpy.data.collections.new(name) for name in GROUPS}
for collection in collections.values():
    bpy.context.scene.collection.children.link(collection)

# Bottom-origin atlas. Keep sampling inside each tile, including on bevels.
palette = {'laminate': (76, 42, 30), 'steel': (54, 54, 53), 'blued': (39, 40, 40),
           'rubber': (38, 34, 32), 'bolt': (77, 77, 74), 'inset': (24, 24, 24),
           'selector': (102, 44, 34), 'edge': (71, 71, 69)}
pixels = np.ones((SIZE, SIZE, 4), dtype=np.float32)
tiles = {}
row, col = np.mgrid[0:128, 0:128] / 127
for index, (name, rgb) in enumerate(palette.items()):
    x, y = index % 4 * 128, index // 4 * 128
    tiles[name] = (x, y)
    ramp = np.interp(row, [0, .16, .5, .84, 1], [-9, -5, 0, 7, 10])
    if name == 'laminate':
        # The VSS furniture uses dark red-brown midtones and soft amber highlights.
        # Vary the stain subtly along the length without repeating bright stripes.
        grain = np.sin(97 * row + 3 * np.sin(7 * col + 11 * row))
        mottle = np.sin(13 * col + 23 * row) * np.sin(29 * col - 17 * row)
        ramp = .58 * ramp + 1.4 * grain + 1.6 * mottle
    pixels[y:y + 128, x:x + 128, :3] = np.clip((np.array(rgb) + ramp[..., None]) / 255, 0, 1)
atlas_path = OUT / 'DragunovSVD.png'
atlas = bpy.data.images.new('DragunovSVD.png', SIZE, SIZE, alpha=False)
atlas.pixels.foreach_set(pixels.ravel())
atlas.filepath_raw = str(atlas_path)
atlas.file_format = 'PNG'
atlas.save()
bpy.data.images.remove(atlas)
atlas = bpy.data.images.load(str(atlas_path))
atlas.pack()
material = bpy.data.materials.new('Dragunov diffuse atlas')
material.use_nodes = True
material.use_backface_culling = True
shader = material.node_tree.nodes.get('Principled BSDF')
shader.inputs['Roughness'].default_value = .86
image_node = material.node_tree.nodes.new('ShaderNodeTexImage')
image_node.image = atlas
material.node_tree.nodes.active = image_node
material.node_tree.links.new(image_node.outputs['Color'], shader.inputs['Base Color'])


def activate(obj):
    bpy.context.view_layer.objects.active = obj
    bpy.ops.object.select_all(action='DESELECT')
    obj.select_set(True)


def mesh(name, vertices, faces):
    data = bpy.data.meshes.new(name)
    data.from_pydata(vertices, [], faces)
    bm = bmesh.new()
    bm.from_mesh(data)
    bmesh.ops.recalc_face_normals(bm, faces=list(bm.faces))
    bm.to_mesh(data)
    bm.free()
    data.update()
    obj = bpy.data.objects.new(name, data)
    bpy.context.scene.collection.objects.link(obj)
    return obj


def finish(obj, tile, bevel, group):
    activate(obj)
    if bevel:
        mod = obj.modifiers.new('Machined edge', 'BEVEL')
        mod.width, mod.segments = bevel, 1
        bpy.ops.object.modifier_apply(modifier=mod.name)
        # Tight corners around cutouts can leave coincident bevel vertices.
        bm = bmesh.new()
        bm.from_mesh(obj.data)
        bmesh.ops.remove_doubles(bm, verts=list(bm.verts), dist=1e-6)
        bm.to_mesh(obj.data)
        bm.free()
    data = obj.data
    data.materials.append(material)
    layer = data.uv_layers.new()
    tile_x, tile_y = tiles[tile]
    coords = np.array([tuple(v.co) for v in data.vertices])
    low, high = coords.min(axis=0), coords.max(axis=0)
    for face in data.polygons:
        horizontal, vertical = ((0, 2) if abs(face.normal.y) >= .5
                                else (1, 2) if abs(face.normal.x) >= .5 else (0, 1))
        for loop in face.loop_indices:
            point = coords[data.loops[loop].vertex_index]
            fraction = (point - low) / np.maximum(high - low, 1e-6)
            layer.data[loop].uv = ((tile_x + 8 + 111 * fraction[horizontal]) / SIZE,
                                   (tile_y + 8 + 111 * fraction[vertical]) / SIZE)
    collections[group].objects.link(obj)
    bpy.context.scene.collection.objects.unlink(obj)
    GROUPS[group].append(obj)
    return obj


def profile_mesh(name, outline, thickness, lateral=0, hole=None):
    count = len(outline)
    sides = (lateral - thickness / 2, lateral + thickness / 2)
    vertices = [(x, side, z) for side in sides for x, z in outline]
    faces = [(i, (i + 1) % count, (i + 1) % count + count, i + count) for i in range(count)]
    if hole is None:
        faces += [tuple(range(count)), tuple(range(count, 2 * count))]
    else:
        vertices += [(x, side, z) for side in sides for x, z in hole]
        for i in range(count):
            j = (i + 1) % count
            for side in (0, count):
                faces.append(tuple(side + k for k in (i, j, 2 * count + j, 2 * count + i)))
            faces.append(tuple(2 * count + k for k in (i, j, count + j, count + i)))
    return mesh(name, vertices, faces)


def profile(name, outline, thickness, tile='steel', bevel=.06, group='Receiver and furniture',
            lateral=0, hole=None, cuts=()):
    obj = profile_mesh(name, outline, thickness, lateral, hole)
    cut_openings(obj, cuts)
    return finish(obj, tile, bevel, group)


def box(name, bounds, tile='steel', bevel=.025, group='Receiver and furniture'):
    x0, x1, y0, y1, z0, z1 = bounds
    outline = [(x0, z0), (x1, z0), (x1, z1), (x0, z1)]
    if tile is None:
        return profile_mesh(name, outline, y1 - y0, (y0 + y1) / 2)
    return profile(name, outline, y1 - y0, tile, bevel, group, (y0 + y1) / 2)


def cut_openings(obj, cutters):
    for cutter in cutters:
        mod = obj.modifiers.new('Machined opening', 'BOOLEAN')
        mod.object = cutter
        activate(obj)
        bpy.ops.object.modifier_apply(modifier=mod.name)
        bpy.data.objects.remove(cutter, do_unlink=True)


def slot(x0, x1, z, radius, width, lateral=0):
    outline = [(x + radius * math.cos(i * math.pi / 6), z + radius * math.sin(i * math.pi / 6))
               for x, start in ((x1, -3), (x0, 3)) for i in range(start, start + 7)]
    return profile_mesh('Temporary slot', outline, width, lateral)


def loft(name, rings, tile, closed=False, cuts=(), count=16):
    # Cross sections are (x, center height, half width, half height).
    vertices = [(x, ry * math.cos(i * math.tau / count), z + rz * math.sin(i * math.tau / count))
                for x, z, ry, rz in rings for i in range(count)]
    faces = []
    for ring in range(len(rings) if closed else len(rings) - 1):
        a, b = ring * count, ((ring + 1) % len(rings)) * count
        faces.extend((a + i, a + (i + 1) % count, b + (i + 1) % count, b + i) for i in range(count))
    if not closed:
        faces += [tuple(range(count)), tuple(range(len(vertices) - count, len(vertices)))]
    obj = mesh(name, vertices, faces)
    cut_openings(obj, cuts)
    return finish(obj, tile, 0, 'Receiver and furniture')


def tube(name, sections, tile='blued', height=5.86, inner=(), cuts=()):
    # A return path through the bore leaves an open muzzle.
    return loft(name, [(x, height, r, r) for x, r in [*sections, *inner]], tile, bool(inner), cuts)


# Trace the supplied left profile at 28.25 effective pack units from butt to muzzle.
profile('Laminate thumbhole stock', [(-10.13, 2.91), (-9.63, 2.99), (-8.55, 3.26), (-7.35, 3.37),
        (-5.74, 3.42), (-5.41, 3.30), (-5.22, 3.06), (-4.45, 2.86), (-3.97, 2.87),
        (-3.88, 3.11), (-3.73, 4.01), (-3.33, 4.25), (-3.30, 4.78), (-4.66, 5.49),
        (-6.85, 5.52), (-8.81, 5.44), (-10.06, 5.43), (-10.19, 5.31)],
        1.04, 'laminate', .12, cuts=[
            profile_mesh('Thumbhole', [(-7.33, 3.63), (-6.96, 3.59), (-5.55, 3.72),
                (-5.20, 3.79), (-5.06, 3.94), (-4.90, 4.59), (-4.96, 4.84),
                (-5.15, 4.99), (-7.21, 5.00), (-7.40, 4.90), (-7.49, 4.69),
                (-7.46, 3.80)], 1.50),
            profile_mesh('Sling opening', [(-9.56, 3.52), (-9.30, 3.59), (-8.14, 4.60),
                (-8.15, 4.83), (-8.31, 4.94), (-9.43, 4.89), (-9.61, 4.73),
                (-9.64, 3.72)], 1.50)])
profile('Thin butt plate', [(-10.20, 2.92), (-10.06, 2.92), (-10.01, 3.10), (-10.00, 5.31),
        (-10.11, 5.43), (-10.20, 5.30)], 1.07, 'blued', .040)
profile('Leather cheek pad', [(-8.60, 5.25), (-8.61, 5.63), (-8.49, 5.86), (-8.25, 5.97),
        (-6.05, 6.02), (-5.81, 5.90), (-5.72, 5.59), (-5.85, 5.33)], 1.17, 'rubber', .13)

profile('Milled receiver', [(-4.63, 4.75), (-4.52, 4.93), (-3.50, 4.73), (-1.92, 4.73),
        (-.77, 4.74), (-.56, 4.91), (1.35, 5.02), (1.56, 5.12), (2.38, 5.12),
        (2.40, 5.92), (-4.33, 5.88), (-4.59, 5.66)], 1.16, bevel=.044, cuts=[
            slot(-3.33, -2.81, 5.18, .075, .26, .61),
            slot(-2.62, 1.42, 5.63, .057, .25, .62),
            slot(1.44, 2.22, 5.36, .078, .26, .61),
            box('Ejection pocket', (.06, 1.88, -.72, -.40, 5.39, 5.78), tile=None)])
loft('Rounded stamped dust cover', [(-4.61, 5.65, .43, .06), (-4.49, 5.76, .50, .17),
        (-4.28, 5.88, .53, .29), (-3.99, 5.91, .54, .34), (2.15, 5.94, .54, .34),
        (2.35, 5.95, .50, .29)], 'blued')
box('Ejection pocket liner', (.09, 1.86, -.419, -.396, 5.40, 5.76), 'inset', .008)
box('Bolt face', (1.03, 1.85, -.57, -.413, 5.43, 5.73), 'bolt', .025, 'Bolt')
box('Charging stem', (1.01, 1.29, -.74, -.55, 5.49, 5.64), 'blued', .032, 'Bolt')
profile('Rounded charging handle', [(.95, 5.47), (1.22, 5.46), (1.36, 5.53), (1.34, 5.68),
        (1.15, 5.72), (.97, 5.67)], .16, 'steel', .04, 'Bolt', -.75)
profile('Selector lever', [(-3.33, 5.00), (-3.23, 4.93), (-.27, 5.33), (-.19, 5.41),
        (-.23, 5.51), (-3.17, 5.18)], .077, 'blued', .018, lateral=-.59)
box('Selector witness', (-3.0, -2.80, -.596, -.570, 4.88, 4.92), 'selector', .006)

# Each upright meets a real PSO-1 clamp. The gap between them leaves the receiver visible.
profile('Left dovetail rail', [(-2.98, 5.07), (-2.83, 4.99), (.16, 4.99), (.27, 5.09),
        (.17, 5.26), (-2.87, 5.26)], .17, 'blued', .025, lateral=.60)
for x in (-2.32, -.23):
    profile('PSO clamp upright', [(x-.22, 5.10), (x+.18, 5.08), (x+.23, 5.26),
            (x+.19, 6.21), (x-.21, 6.21), (x-.25, 5.96)],
            .22, 'steel', .038, lateral=.634)
    for z in (5.23, 5.43):
        profile('Clamp pin', [(x + .066 * math.cos(i * math.tau / 10),
                z + .066 * math.sin(i * math.tau / 10)) for i in range(10)],
                .047, 'edge', .013, lateral=.734)

profile('Slim trigger bow', [(-3.43, 4.78), (-3.43, 4.31), (-3.29, 4.03), (-2.99, 3.88),
        (-2.46, 3.84), (-2.10, 3.90), (-1.92, 4.10), (-1.91, 4.58), (-1.74, 4.75)],
        .29, 'blued', .016, hole=[(-3.29, 4.69), (-3.32, 4.33), (-3.20, 4.10),
        (-2.95, 3.97), (-2.48, 3.93), (-2.15, 3.98), (-2.01, 4.15), (-2.00, 4.61),
        (-1.91, 4.69)])
profile('Trigger', [(-2.72, 4.77), (-2.79, 4.54), (-2.82, 4.34), (-2.72, 4.14),
        (-2.86, 4.21), (-2.91, 4.36), (-2.89, 4.63), (-2.83, 4.77)], .16, 'steel', .018)
profile('Magazine catch', [(-1.03, 4.81), (-.76, 4.86), (-.87, 4.17), (-1.03, 4.04)],
        .28, 'steel', .028)
profile('Short curved 10-round magazine', [(-.76, 4.96), (1.25, 5.09), (1.37, 4.88),
        (1.27, 4.45), (1.24, 3.78), (1.34, 3.39), (1.39, 3.23), (-.48, 2.77),
        (-.64, 2.82), (-.78, 3.62), (-.81, 4.30)], .93, 'blued', .055, 'Magazine')
profile('Magazine floorplate', [(-.63, 2.84), (1.38, 3.34), (1.46, 3.22), (-.60, 2.71)],
        1.00, 'steel', .028, 'Magazine')
for y in (-.462, .462):
    for x in (-.42, .02, .45, .88):
        z = 3.18 + .22 * (x + .42)
        profile('Pressed magazine rib', [(x-.06, 4.80), (x+.07, 4.81), (x+.052, 4.14),
                (x+.11, z+.06), (x+.02, z), (x-.028, z+.12), (x-.09, 4.14)],
                .057, 'steel', .025, 'Magazine', y)

loft('Rounded vented laminate handguard', [(2.21, 5.81, .54, .71), (2.38, 5.80, .64, .75),
        (2.74, 5.81, .64, .74), (3.79, 5.84, .62, .70), (5.02, 5.91, .60, .63),
        (7.70, 5.96, .57, .59), (8.47, 5.96, .56, .58), (8.72, 5.96, .48, .52)],
        'laminate', cuts=[slot(x, x + .44, z, .082, 1.6) for x, z in
                ((5.32, 6.08), (6.58, 6.10), (7.82, 6.11), (4.69, 5.76), (5.93, 5.77), (7.17, 5.79))])
box('Handguard liner', (4.44, 8.46, -.27, .27, 5.64, 6.25), 'inset', .036)
loft('Rear handguard ferrule', [(2.13, 5.81, .58, .70), (2.23, 5.81, .61, .73),
        (2.36, 5.81, .65, .75)], 'blued')
loft('Front handguard ferrule', [(8.55, 5.96, .53, .58), (8.71, 5.96, .52, .57),
        (8.89, 5.92, .38, .47)], 'blued')
tube('Slender stepped barrel', [(2.00, .255), (8.90, .255), (10.81, .207), (15.76, .183),
        (16.22, .186)])
tube('Raised gas tube', [(8.53, .171), (9.39, .166), (9.49, .197), (10.52, .197)],
        height=6.28)
profile('Gas block', [(10.38, 5.66), (10.91, 5.65), (11.13, 5.80), (10.84, 6.10),
        (10.60, 6.43), (10.37, 6.46), (10.27, 6.29), (10.38, 5.96)], .49, 'steel', .048)
profile('Front sling swivel', [(10.32, 5.56), (10.23, 5.76), (10.30, 5.91), (10.49, 5.93),
        (10.60, 5.81), (10.56, 5.61)], .07, 'steel', .010, lateral=.245,
        hole=[(10.37, 5.62), (10.29, 5.76), (10.34, 5.85), (10.46, 5.86),
              (10.54, 5.80), (10.50, 5.66)])
profile('Pierced front sight tower', [(15.27, 5.57), (15.50, 5.45), (15.76, 5.45),
        (15.76, 6.92), (15.64, 6.99), (15.45, 6.95), (15.44, 6.63), (15.37, 6.28),
        (15.23, 6.02)], .43, 'steel', .034, cuts=[slot(15.49, 15.52, 6.24, .106, .75),
        box('Front sight fork', (15.1, 16.0, -.091, .091, 6.49, 7.12), tile=None)])
tube('Narrow slotted flash hider', [(15.92, .186), (16.19, .224), (17.94, .203), (18.05, .167)],
     'steel', inner=[(18.05, .10), (15.92, .10)],
     cuts=[box('Flash hider slot', (16.45, 17.57, -.50, .50, 5.818, 5.90), tile=None)])
profile('Rear tangent sight ramp', [(1.66, 6.21), (2.45, 6.35), (2.38, 6.58), (2.21, 6.62),
        (1.62, 6.51)], .45, 'steel', .030)
for y in (-.15, .15):
    box('Rear notch shoulder', (1.65, 1.82, y-.057, y+.057, 6.48, 6.72),
        'steel', .018, 'Iron sights')
box('Front blade', (15.51, 15.67, -.057, .057, 6.47, 6.73), 'steel', .012, 'Iron sights')
export_geometry(GROUPS)
for screen in bpy.data.screens:
    for area in screen.areas:
        if area.type == 'VIEW_3D':
            view = area.spaces.active
            view.shading.color_type = 'TEXTURE'
            view.region_3d.view_location = (4, 0, 4.4)
            view.region_3d.view_distance = 32
            view.region_3d.view_rotation = Vector((-10, -35, -12)).to_track_quat('-Z', 'Y')
bpy.context.preferences.filepaths.save_version = 0
bpy.ops.wm.save_as_mainfile(filepath=str(OUT / 'DragunovSVD.blend'))

