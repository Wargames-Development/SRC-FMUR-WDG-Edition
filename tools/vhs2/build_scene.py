"""Blender half of build_vhs2_custom.py; coordinates are X length, Z height."""
import json
import struct
from pathlib import Path

import bpy
import bmesh
import numpy as np
from mathutils import Vector

ROOT = Path(__file__).resolve().parents[2]
OUT = ROOT / 'development_assets/vhs2_custom'
WORK = ROOT / 'build/vhs2-check'
bpy.ops.object.select_all(action='SELECT')
bpy.ops.object.delete(use_global=False)


def material(name, texture):
    mat = bpy.data.materials.new(name)
    mat.use_nodes = True
    tex = mat.node_tree.nodes.new('ShaderNodeTexImage')
    tex.image = bpy.data.images.load(str(texture), check_existing=True)
    tex.image.pack()
    tex.interpolation = 'Closest'
    mat.node_tree.links.new(tex.outputs['Color'],mat.node_tree.nodes.get('Principled BSDF').inputs['Base Color'])
    mat.node_tree.nodes.get('Principled BSDF').inputs['Roughness'].default_value = .82
    return mat


MAT = material('VHS2 single diffuse atlas', OUT/'VHS2_Custom.png')
source = np.load(WORK/'source.npz')
metadata = json.loads((WORK/'source.json').read_text())
reference = bpy.data.collections.new('REFERENCE - supplied VHS2, unreduced')
bpy.context.scene.collection.children.link(reference)
final = bpy.data.collections.new('FMUR - native animated parts')
bpy.context.scene.collection.children.link(final)
groups = {0:[],1:[],2:[],3:[],4:[]}
stats = []


def mesh_object(name, points, triangles, uvs, collection):
    mesh = bpy.data.meshes.new(name)
    mesh.from_pydata(points,[],triangles)
    mesh.update()
    uv = mesh.uv_layers.new(name='UVMap')
    for loop in mesh.loops:
        uv.data[loop.index].uv = uvs[loop.vertex_index]
    obj = bpy.data.objects.new(name,mesh)
    collection.objects.link(obj)
    mesh.materials.append(MAT)
    return obj


def reduce_mesh(obj, ratio):
    # Weld glTF's duplicated positions, keeping the UVs as face-corner data.
    bm = bmesh.new()
    bm.from_mesh(obj.data)
    bmesh.ops.remove_doubles(bm, verts=list(bm.verts), dist=.00001)
    bm.to_mesh(obj.data)
    bm.free()
    bpy.context.view_layer.objects.active = obj
    mod = obj.modifiers.new('FMUR surface reduction','DECIMATE')
    mod.ratio = ratio
    mod.use_collapse_triangulate = True
    bpy.ops.object.modifier_apply(modifier=mod.name)
    for poly in obj.data.polygons:
        poly.use_smooth = False


for i,item in enumerate(metadata):
    name = item['name'].split('_01')[0]
    points,uvs,faces = source['p%d'%i],source['uv%d'%i],source['f%d'%i]
    original = mesh_object(name+' reference',points,faces,uvs,reference)
    original.hide_render = True
    original.hide_set(True)
    split = [(0,faces)]
    if name.startswith('Magazine'): split = [(1,faces)]
    elif name.startswith('ChargingHandle'): split = [(2,faces)]
    elif name == 'Barrel':
        cap = points[faces][:,:,0].mean(axis=1) > 10.48
        split = [(0,faces[~cap]),(3,faces[cap])]
    ratio = .48
    if name.startswith(('PlusScrew','CirclePin','CircleDetail')): ratio = .20
    elif name in ('Barrel','Siderails','BottomRail','Rail'): ratio = .34
    elif name in ('Body','UpperReciever','Handguard','Grip','StockFront','Magazine_Low'): ratio = .62
    for group,triangles in split:
        if not len(triangles): continue
        obj = mesh_object(name+(' muzzle' if group==3 else ''),points,triangles,uvs,final)
        reduce_mesh(obj,ratio)
        groups[group].append(obj)
        obj['fmur_group'] = ('body','magazine','charging handle','default muzzle','default irons')[group]
        stats.append({'name':obj.name,'source':len(triangles),'triangles':sum(len(p.vertices)-2 for p in obj.data.polygons)})


# Fit the pack's actual HK416 front/rear sights, retaining their texture strip.
# Register each assembly to its white marks so the tilted rear plate still
# shares one level line with the front blade. All mounts seat on the same rail.
SIGHT_BASE=6.66
SIGHT_HEIGHT=7.33
SIGHT_WIDTH_SCALE=1.0
rear_x,front_x=-2.40,9.26
hk_parts=json.loads((WORK/'hk_sights.json').read_text())
registration={}
for front,white_id,target_x in [(False,'31',rear_x),(True,'30',front_x)]:
    aim=np.array([v[:3] for p in hk_parts[white_id] for v in p])
    aim_center=(aim.min(0)+aim.max(0))/2
    assembly=np.array([v[:3] for polys in hk_parts.values()
        if (np.mean([v[0] for p in polys for v in p])>5)==front
        for p in polys for v in p])
    base=assembly[:,1].min()
    registration[front]=(target_x,aim_center,base,(SIGHT_HEIGHT-SIGHT_BASE)/(aim_center[1]-base))
for index,polygons in hk_parts.items():
    front=np.mean([v[0] for p in polygons for v in p])>5
    target_x,aim,base,height_scale=registration[front]
    if index in ('30','31','32'):
        # Keep the pack's three white marks square and level; the original
        # rear HK plate tilts its tiny marks in opposite directions.
        side=np.mean([v[2] for p in polygons for v in p])
        mark_x=target_x if front else target_x-.08
        bpy.ops.mesh.primitive_cube_add(size=1,location=(mark_x,side*SIGHT_WIDTH_SCALE,SIGHT_HEIGHT))
        obj=bpy.context.object
        obj.name='HK416 white sight mark '+index
        obj.dimensions=(.10,.05*SIGHT_WIDTH_SCALE,.05)
        bpy.ops.object.transform_apply(location=False,rotation=False,scale=True)
        for collection in list(obj.users_collection): collection.objects.unlink(obj)
        final.objects.link(obj)
        obj.data.materials.append(MAT)
        uv=obj.data.uv_layers.active
        for p in obj.data.polygons:
            for j,li in enumerate(p.loop_indices):
                a,b=((.2,.2),(.8,.2),(.8,.8),(.2,.8))[j%4]
                uv.data[li].uv=((256+a*64)/2048,b*64/2048)
        obj['fmur_group']='default irons'
        groups[4].append(obj)
        continue
    points,faces,uvs=[],[],[]
    for polygon in polygons:
        start=len(points)
        for j,(x,y,z,u,v) in enumerate(polygon):
            points.append((target_x+x-aim[0],z*SIGHT_WIDTH_SCALE,SIGHT_BASE+(y-base)*height_scale))
            uvs.append(((384+u*256)/2048,1-(1984+v*256-64)/2048))
        faces.append(tuple(reversed(range(start,len(points)))))
    name='HK416 %s sight %s'%('front' if front else 'rear',index)
    obj=mesh_object(name,points,faces,uvs,final)
    obj['fmur_group']='default irons'
    groups[4].append(obj)


bpy.context.view_layer.update()
objects = [obj for group in groups.values() for obj in group]


def triangles(mesh):
    mesh.calc_loop_triangles()
    result=[]
    for tri in mesh.loop_triangles:
        a,b,c=(mesh.vertices[i].co for i in tri.vertices)
        if (b-a).cross(c-a).length > 1e-9:
            result.append(tri)
    return result


binary = ROOT/'src/main/resources/assets/flansmod/models/vhs2_custom.bin'
binary.parent.mkdir(parents=True,exist_ok=True)
tri_count = 0
with binary.open('wb') as file:
    file.write(struct.pack('>iii',0x56485332,1,len(objects)))
    for group,parts in groups.items():
        for obj in parts:
            mesh=obj.data
            faces=triangles(mesh)
            name=obj.name.encode('ascii')
            file.write(struct.pack('>H',len(name))+name)
            file.write(struct.pack('>Bi',group,len(faces)))
            for tri in faces:
                file.write(struct.pack('>B',3))
                # Mapping Blender XYZ -> native XZY reflects handedness.
                for li in reversed(tri.loops):
                    p=obj.matrix_world @ mesh.vertices[mesh.loops[li].vertex_index].co
                    uv=mesh.uv_layers.active.data[li].uv
                    file.write(struct.pack('>5f',p.x,p.z,p.y,uv.x,1-uv.y))
                tri_count+=1
(OUT/'vhs2_custom.bin').write_bytes(binary.read_bytes())


def export_obj(path, objects):
    vi=ui=0
    with path.open('w',encoding='ascii') as file:
        file.write('mtllib VHS2_Custom.mtl\nusemtl VHS2_Custom\n')
        for obj in objects:
            mesh=obj.data
            faces=triangles(mesh)
            file.write('o '+obj.name.replace(' ','_')+'\n')
            for v in mesh.vertices:
                p=obj.matrix_world @ v.co
                file.write('v %.6f %.6f %.6f\n'%tuple(p))
            for loop in mesh.uv_layers.active.data:
                file.write('vt %.6f %.6f\n'%tuple(loop.uv))
            for tri in faces:
                file.write('f '+' '.join('%d/%d'%(vi+mesh.loops[li].vertex_index+1,ui+li+1) for li in tri.loops)+'\n')
            vi+=len(mesh.vertices)
            ui+=len(mesh.loops)


export_obj(OUT/'VHS2_Custom.obj',[o for g in (0,2,3,4) for o in groups[g]])
export_obj(OUT/'VHS2_Custom_magazine.obj',groups[1])
(OUT/'VHS2_Custom.mtl').write_text('newmtl VHS2_Custom\nKd 1 1 1\nmap_Kd VHS2_Custom.png\n')


# Explicit empties make the native attachment coordinates editable and visible.
anchors = {
    'scope':(1.7,0,6.78),'grip':(7.1,0,3.46),
    'barrel':(10.48,0,4.5),'gadget':(7.0,-1.134,4.36),
    'accessory':(5.7,-1.134,4.36),'casing':(-2.8,1.0395,4.7),
}
for name,point in anchors.items():
    obj=bpy.data.objects.new('ATTACH_'+name,None)
    final.objects.link(obj)
    obj.empty_display_type='ARROWS'
    obj.empty_display_size=.5
    obj.location=point
    obj.hide_render=True


scene=bpy.context.scene
scene.render.engine='BLENDER_WORKBENCH'
scene.display.shading.color_type='TEXTURE'
scene.display.shading.light='STUDIO'
scene.display.shading.studiolight_rotate_z=.5
scene.display.shading.show_shadows=True
scene.display.shading.show_cavity=True
scene.display.shading.cavity_type='BOTH'
scene.display.shading.curvature_ridge_factor=1.2
scene.display.shading.curvature_valley_factor=1.0
scene.render.film_transparent=True
scene.render.image_settings.file_format='PNG'
bpy.ops.object.camera_add()
camera=bpy.context.object
camera.data.type='ORTHO'
scene.camera=camera


def render(name, position, target, scale, width=1600, height=800):
    camera.location=position
    camera.rotation_euler=(Vector(target)-camera.location).to_track_quat('-Z','Y').to_euler()
    camera.data.ortho_scale=scale
    scene.render.resolution_x=width
    scene.render.resolution_y=height
    scene.render.resolution_percentage=100
    scene.render.filepath=str(OUT/name)
    bpy.ops.render.render(write_still=True)


render('VHS2_Custom_preview.png',(17,-27,14),(1.5,0,3.2),27,1600,900)
render('VHS2_left.png',(1.6,-40,3.1),(1.6,0,3.1),25.4)
render('VHS2_right.png',(1.6,40,3.1),(1.6,0,3.1),25.4)
render('VHS2_Custom_Icon.png',(1.6,-40,3.1),(1.6,0,3.1),25.0,256,256)
render('VHS2_iron_sight_alignment.png',(-7.5,0,SIGHT_HEIGHT),(front_x,0,SIGHT_HEIGHT),1.15,1400,800)
render('VHS2_rail_fit.png',(rear_x-1.6,-3,9),(rear_x,0,7.0),2.3,1200,800)


def reference_gun(name, height, model_scale, texture=None, exclude=()):
    path=WORK/(name+'.mesh')
    if not path.exists(): return []
    mat=material(name+' pack texture', ROOT/('eclipse/Flan/BFMC Gun Pack/assets/flansmod/skins/'+(texture or name)+'.png'))
    verts,faces,uvs=[],[],[]
    for line in path.read_text().splitlines()[1:]:
        if line.split('\t')[0] in exclude: continue
        row=[list(map(float,v.split(','))) for v in line.split('\t')[1:]]
        if len(row)<3: continue
        faces.append(tuple(range(len(verts),len(verts)+len(row))))
        for x,y,z,u,v in row:
            verts.append((x*model_scale-((4.1*model_scale-1.6) if name=='M4A1' else 0),z*model_scale,y*model_scale+height))
            uvs.append((u,1-v))
    obj=mesh_object(name,verts,faces,uvs,bpy.context.scene.collection)
    obj.data.materials.clear()
    obj.data.materials.append(mat)
    return [obj]


references=reference_gun('M4A1',22,1.15)+reference_gun('FAMAS',11,1.0)
render('FMUR_scale_comparison.png',(1.6,-50,14),(1.6,0,14),35,1400,1400)
for obj in references:
    obj.hide_render=True
    obj.hide_set(True)
render('VHS2_Custom_preview.png',(17,-27,14),(1.5,0,3.2),27,1600,900)

# Render actual Java-loaded TMT polygons with the pack's actual attachment
# meshes and scales, rather than a schematic of where the mounts should be.
if (WORK/'5MWLaser.mesh').exists():
    for obj in objects: obj.hide_render=True
    fitted=reference_gun('VHS2',0,1,'VHS2_Custom',('defaultScopeModel',))
    for name in ('HOLO','VerticalGrip','5MWLaser'):
        fitted+=reference_gun(name,0,1)
    render('VHS2_attachments.png',(17,-27,14),(1.5,0,3.2),27,1600,900)
    for obj in fitted:
        obj.hide_render=True
        obj.hide_set(True)
    for obj in objects: obj.hide_render=False
image=next(i for i in bpy.data.images if i.name.startswith('VHS2_Custom.png'))
image.pack()
report={'triangles':tri_count,'objects':len(objects),'parts':stats,'anchors':anchors,
        'length':22.8,'m4a1_length':23.4,'famas_length':22.8,'texture':[2048,2048],
        'sight_height':SIGHT_HEIGHT,'sight_base':SIGHT_BASE,'rear_sight_x':rear_x,
        'sight_width_scale':SIGHT_WIDTH_SCALE,
        'sight_width':1.2*SIGHT_WIDTH_SCALE,'body_width_scale':1.35,
        'rail_width':1.2,'runtime_forward_offset':1.5}
(OUT/'measurements.json').write_text(json.dumps(report,indent=2))
bpy.context.preferences.filepaths.save_version=0
bpy.ops.wm.save_as_mainfile(filepath=str(OUT/'VHS2_Custom.blend'))
print('Native VHS2:',tri_count,'triangles in',len(objects),'parts')
