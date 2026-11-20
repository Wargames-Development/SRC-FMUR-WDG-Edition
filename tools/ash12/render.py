"""Blender: render actual Java-loaded native geometry and save an editable scene."""
from pathlib import Path
import math
import json
import bpy
from mathutils import Vector

ROOT = Path(__file__).resolve().parents[2]
ASSET = ROOT / 'development_assets/ash12'
OUT = ASSET / 'validation'
OUT.mkdir(exist_ok=True)
bpy.ops.object.select_all(action='SELECT')
bpy.ops.object.delete(use_global=False)
texture = bpy.data.images.load(str(ASSET / 'model/ASH12.png'))
texture.pack()
material = bpy.data.materials.new('Supplied ASH-12 atlas')
material.use_nodes = True
material.use_backface_culling = True
nodes = material.node_tree.nodes
image = nodes.new('ShaderNodeTexImage')
image.image = texture
image.interpolation = 'Closest'
material.node_tree.links.new(image.outputs['Color'], nodes.get('Principled BSDF').inputs['Base Color'])
nodes.get('Principled BSDF').inputs['Roughness'].default_value = .85
groups = {}
for line in (ROOT / 'build/ash12-check/ASH12.mesh').read_text().splitlines():
    words = line.split()
    group = words[0].split('#')[0]
    groups.setdefault(group, []).append([list(map(float, w.split(','))) for w in words[1:]])
for group, polygons in groups.items():
    vertices, faces, uvs = [], [], []
    for polygon in polygons:
        faces.append(tuple(range(len(vertices), len(vertices) + len(polygon))))
        # Native X forward, Y up -> Blender X forward, Z up (proper rotation).
        vertices.extend((v[0], -v[2], v[1]) for v in polygon)
        uvs.extend((v[3], 1 - v[4]) for v in polygon)
    mesh = bpy.data.meshes.new(group)
    mesh.from_pydata(vertices, [], faces)
    mesh.uv_layers.new()
    for loop in mesh.loops:
        mesh.uv_layers.active.data[loop.index].uv = uvs[loop.vertex_index]
    obj = bpy.data.objects.new(group, mesh)
    bpy.context.collection.objects.link(obj)
    obj.data.materials.append(material)
scene = bpy.context.scene
scene.render.engine = 'CYCLES'
scene.cycles.samples = 24
scene.render.resolution_x = 1400
scene.render.resolution_y = 800
scene.render.resolution_percentage = 100
scene.world.color = (.35, .35, .35)
scene.view_settings.view_transform = 'Standard'
for location, power, size in [((0,-12,24), 9000, 18), ((-10,10,15), 6500, 15), ((15,5,5), 3500, 10)]:
    bpy.ops.object.light_add(type='AREA', location=location)
    light = bpy.context.object
    light.data.energy, light.data.shape, light.data.size = power, 'DISK', size
    light.rotation_euler = (Vector((0,0,1)) - light.location).to_track_quat('-Z','Y').to_euler()
bpy.ops.object.camera_add()
camera = bpy.context.object
scene.camera = camera
camera.data.type = 'ORTHO'
camera.data.ortho_scale = 31
for label, location in [('profile', (0,-45,2)), ('three-quarter', (28,-42,22)), ('opposite', (-22,42,16))]:
    camera.location = location
    camera.rotation_euler = (Vector((0,0,1)) - camera.location).to_track_quat('-Z','Y').to_euler()
    scene.render.filepath = str(OUT / (label + '.png'))
    bpy.ops.render.render(write_still=True)

# Check the same mounted native HOLO and VerticalGrip used by the live probe.
mounts = json.loads((ROOT/'build/ash12-check/mounts.json').read_text())
for device, socket, skin in [('HOLO','scope','HOLO'), ('VerticalGrip','grip','VerticalGrip')]:
    vertices, faces, uvs = [], [], []
    for line in (ROOT/'build/ash12-check'/ (device+'.mesh')).read_text().splitlines():
        words=line.split()
        polygon=[list(map(float,w.split(','))) for w in words[1:]]
        faces.append(tuple(range(len(vertices),len(vertices)+len(polygon))))
        for v in polygon:
            p=[v[i]+mounts[socket][i] for i in range(3)]
            vertices.append((p[0],-p[2],p[1]));uvs.append((v[3],1-v[4]))
    mesh=bpy.data.meshes.new(device);mesh.from_pydata(vertices,[],faces);mesh.uv_layers.new()
    for loop in mesh.loops:mesh.uv_layers.active.data[loop.index].uv=uvs[loop.vertex_index]
    obj=bpy.data.objects.new(device,mesh);bpy.context.collection.objects.link(obj)
    mat=material.copy();mat.name=device+' actual atlas'
    mat.node_tree.nodes.get(image.name).image=bpy.data.images.load(str(ROOT/'eclipse/Flan/BFMC Gun Pack/assets/flansmod/skins'/(skin+'.png')))
    obj.data.materials.append(mat)
# Optics mount above the permanent carry handle; keep its higher rail visible.
bpy.data.objects['defaultScopeModel'].hide_render=False
for label, location in [('profile-mounted',(0,-45,2)), ('three-quarter-mounted',(28,-42,22)),
                        ('underside-mounted',(24,-40,-16))]:
    camera.location=location
    camera.rotation_euler=(Vector((0,0,1))-camera.location).to_track_quat('-Z','Y').to_euler()
    scene.render.filepath=str(OUT/(label+'.png'));bpy.ops.render.render(write_still=True)
for device in ('HOLO','VerticalGrip'):bpy.data.objects[device].hide_render=True
bpy.data.objects['defaultScopeModel'].hide_render=False
bpy.ops.file.pack_all()
bpy.ops.wm.save_as_mainfile(filepath=str(ASSET / 'ASH12.blend'))
