"""Author C7A2/C79 native-pack assets with Blender 5.2; pass -- --install.

Geometry is Y-up, X-forward in effective pack pixels. No downloaded mesh or
photographic texture is used. See development_assets/c7a2/README.md.
"""
import argparse
import json
import math
from pathlib import Path
import shutil
import sys

import bpy
import numpy as np
import OpenImageIO as oiio
from mathutils import Vector
from mathutils.geometry import tessellate_polygon

ROOT = Path(__file__).resolve().parents[1]
ASSET = ROOT / 'development_assets/c7a2'
OUT = ASSET / 'model'
PACK = ROOT / 'eclipse/Flan/BFMC Gun Pack'
PALETTE = {'steel': (49, 51, 50), 'edge': (64, 66, 63),
           'olive': (79, 86, 60), 'rib': (86, 93, 66),
           'dark': (27, 30, 28), 'mag': (94, 96, 89),
           'mag_rib': (77, 80, 74), 'glass': (30, 49, 49)}
DONOR_UV = {}
M4_UV = {}
STOCK_UV = {}


def uv_for(material,p):
    if material in DONOR_UV:
        uv=DONOR_UV[material].copy();uv[:,0]/=4
        return uv
    if material in M4_UV:
        uv=M4_UV[material].copy();uv[:,0]=(2+uv[:,0])/4
        return uv
    if material in STOCK_UV:
        uv=STOCK_UV[material].copy();uv[:,0]=(3+uv[:,0])/4
        return uv
    n=np.cross(p[1]-p[0],p[2]-p[0]);axes=((2,1),(0,2),(0,1))[abs(n).argmax()]
    tile=list(PALETTE).index(material)
    uv=((tile%2*128+8,tile//2*64+8)+(p[:,axes]%4)/4*(112,48))/256
    uv[:,0]=(1+uv[:,0])/4
    return uv


def donor():
    groups={}
    for line in (ASSET/'original/M16A4.mesh').read_text().splitlines():
        words=line.split();p=np.array([list(map(float,w.split(','))) for w in words[1:]])
        groups.setdefault(words[0],[]).append(p)
    meshes={name:Mesh() for name in ('body','mag','bolt')}
    selected=[]
    for key,faces in groups.items():
        points=np.concatenate(faces)[:,:3]
        if key.startswith('gunModel') and points[:,0].min()>=-3 and points[:,0].max()<=5.1:
            target='body'
        elif key.startswith('ammoModel'):
            target='mag'
        elif key.startswith('slideModel'):
            target='bolt'
        else:
            continue
        selected.append(key)
        grip=key.startswith('gunModel') and int(key.split('#')[1])>=403
        for face in faces:
            for j in range(1,len(face)-1):
                tri=face[[0,j,j+1]];name='donor_'+str(len(DONOR_UV))
                if np.linalg.norm(np.cross(tri[1,:3]-tri[0,:3],tri[2,:3]-tri[0,:3]))<1e-8:
                    continue
                DONOR_UV[name]=tri[:,3:5]
                meshes[target].faces.append(('olive' if grip else name,tri[:,:3].copy()))
    (OUT/'donor_selection.json').write_text(json.dumps(selected,indent=2)+'\n')
    return meshes


def m4_sights():
    front,rear=Mesh(),Mesh()
    selected=[]
    for line in (ASSET/'original/M4A1.mesh').read_text().splitlines():
        words=line.split();group,index=words[0].split('#');index=int(index)
        if group=='defaultScopeModel':
            target,offset=rear,np.zeros(3)
        elif group=='gunModel' and (147<=index<=157 or 167<=index<=186):
            target,offset=front,np.array((2,0,0))
        else:
            continue
        if words[0] not in selected:selected.append(words[0])
        face=np.array([list(map(float,w.split(','))) for w in words[1:]])
        for j in range(1,len(face)-1):
            tri=face[[0,j,j+1]];p=tri[:,:3]+offset
            if np.linalg.norm(np.cross(p[1]-p[0],p[2]-p[0]))<1e-8:continue
            name='m4_'+str(len(M4_UV));M4_UV[name]=tri[:,3:5]
            target.faces.append((name,p))
    (OUT/'m4_sight_selection.json').write_text(json.dumps(selected,indent=2)+'\n')
    return front,rear


def m4_stock():
    stock=Mesh()
    # Keep the rubber buttplate and release hardware in the original dark finish.
    dark={3,4,6,7,8,9,11,12,13,21,22,23,24}
    for line in (ASSET/'original/M4A1.mesh').read_text().splitlines():
        words=line.split()
        if not words[0].startswith('defaultStockModel#'):continue
        index=int(words[0].split('#')[1])
        face=np.array([list(map(float,w.split(','))) for w in words[1:]])
        for j in range(1,len(face)-1):
            tri=face[[0,j,j+1]];p=tri[:,:3]+(0,.135,0)
            if np.linalg.norm(np.cross(p[1]-p[0],p[2]-p[0]))<1e-8:continue
            table=M4_UV if index in dark else STOCK_UV
            name=('m4_' if index in dark else 'stock_')+str(len(table))
            table[name]=tri[:,3:5];stock.faces.append((name,p))
    (OUT/'m4_stock_selection.json').write_text(json.dumps({
        'group':'defaultStockModel','parts':list(range(31)),
        'translation':[0,.135,0],'dark_parts':sorted(dark),
        'olive_base':PALETTE['olive']},indent=2)+'\n')
    return stock


class Mesh:
    def __init__(self):
        self.faces = []

    def face(self, material, points):
        points = np.asarray(points, float)
        for tri in tessellate_polygon([[Vector(p) for p in points]]):
            p = points[list(tri)]
            if np.linalg.norm(np.cross(p[1]-p[0], p[2]-p[0])) > 1e-8:
                self.faces.append((material, p))

    def bridge(self, material, a, b):
        for i in range(len(a)):
            j = (i+1) % len(a)
            self.face(material, (a[i], a[j], b[j], b[i]))

    def profile(self, material, outline, z0, z1):
        if sum(a[0]*b[1]-b[0]*a[1] for a,b in zip(outline, (*outline[1:],outline[0]))) < 0:
            outline = outline[::-1]
        a,b = [[(x,y,z) for x,y in outline] for z in (z0,z1)]
        self.face(material, a[::-1]); self.face(material, b)
        self.bridge(material, a,b)

    def box(self, material, low, high):
        x,y,z = low; X,Y,Z = high
        self.profile(material, ((x,y),(X,y),(X,Y),(x,Y)), z,Z)

    def tube(self, material, rings, y=4.6, z=0, inner=None, segments=16):
        def ring(x,r):
            return [(x,y+r*math.cos(a),z+r*math.sin(a))
                    for a in np.linspace(0,2*math.pi,segments,endpoint=False)]
        loops = [ring(x,r) for x,r in rings]
        for a,b in zip(loops,loops[1:]):
            self.bridge(material,a,b)
        if inner is None:
            self.face(material,loops[0][::-1]); self.face(material,loops[-1])
        else:
            a,b = ring(rings[0][0],inner),ring(rings[-1][0],inner)
            self.bridge('dark',b,a)
            self.bridge(material,a,loops[0])
            self.bridge(material,loops[-1],b)


def rifle():
    body,muzzle = Mesh(),Mesh()
    # Retain the receiver extension; the M4 stock is fitted in loaded coordinates below.
    body.tube('steel', ((-6.7,.35),(-1.45,.35)),y=4.62)
    # Rifle-length round ribbed handguard, distinct delta ring and end cap.
    body.box('steel',(4.98,3.86,-.75),(5.08,5.52,.75))
    body.tube('dark', ((5.05,.63),(5.72,.72),(6.0,.70)))
    rings=[(5.85,.69),(6.15,.80)]
    for x in np.linspace(6.18,14.18,24):
        r = .80-(x-6.18)*.014
        rings.extend(((x,r),(x+.045,r+.035),(x+.13,r+.035),(x+.175,r)))
    rings.extend(((14.4,.68),(14.6,.56)))
    body.tube('olive',rings)
    body.tube('steel', ((14.5,.57),(14.72,.57)))
    # Continuous barrel seated in the fore-end; flash hider has an actual bore.
    body.tube('steel', ((14.5,.22),(19.4,.22)),inner=.10)
    muzzle.tube('steel', ((19.4,.30),(20.55,.30)),inner=.11)
    for z in (-.301,.28):
        for x in (19.65,19.95,20.25):
            muzzle.box('dark',(x,4.52,z),(x+.11,4.69,z+.02))
    # Short Picatinny sections: narrow web, angled shoulders and separated teeth.
    body.box('steel',(7.3,3.62,-.34),(11.8,3.92,.34))
    body.box('steel',(10.4,4.22,-.88),(13.8,4.98,-.58))
    for x in np.arange(7.35,11.7,.40):
        body.profile('edge',((x,3.62),(x+.24,3.62),(x+.24,3.49),(x+.20,3.41),
                             (x+.04,3.41),(x,3.49)),-.59,.59)
    for x in np.arange(10.45,13.7,.40):
        body.profile('edge',((x,4.07),(x+.24,4.07),(x+.24,5.13),(x,5.13)),-1.10,-.88)
    # Preserve the loaded M16 family's receiver, magazine, bolt and firing-grip fit.
    for mesh in (body,muzzle):
        for _,p in mesh.faces:p[:,1]+=.69
    old=donor();body.faces.extend(old['body'].faces)
    front,irons=m4_sights();body.faces.extend(front.faces)
    body.faces.extend(m4_stock().faces)
    return {'C7A2':body,'C7A2_magazine':old['mag'],'C7A2_bolt':old['bolt'],
            'C7A2_irons':irons,'C7A2_muzzle':muzzle}


def optic():
    m = Mesh()
    m.box('steel',(-1.6,0,-.49),(1.9,.36,.49))
    m.profile('steel', ((-1.25,.35),(-.95,1.05),(1.85,1.05),(2.1,.35)),-.38,.38)
    for z in (-.62,.49):
        m.box('edge',(-1.55,.04,z),(1.85,.26,z+.13))
    # Open eyepiece and objective. PiP disc is just behind the rear rim.
    m.tube('olive', ((-2.10,.72),(-1.85,.77),(-1.55,.65),(1.55,.65),
                     (1.8,.76),(2.55,.76)), y=1.65,inner=.52,segments=24)
    for a in np.linspace(0,2*math.pi,12,endpoint=False):
        y,z = 1.65+.64*math.cos(a),.64*math.sin(a)
        m.tube('rib', ((-1.45,.065),(1.40,.065)),y=y,z=z,segments=6)
    m.box('olive',(-1.65,2.32,-.12),(-1.3,2.46,.12))
    m.box('olive',(1.9,2.38,-.12),(2.2,2.51,.12))
    m.box('steel',(-1.35,.38,-.72),(-.55,.56,-.40))
    m.box('edge',(-1.3,.56,-.69),(-.6,.65,-.43))
    return m


def png(name,pixels):
    h,w,c = pixels.shape
    buf = oiio.ImageBuf(oiio.ImageSpec(w,h,c,oiio.UINT8))
    buf.set_pixels(oiio.ROI(0,w,0,h,0,1,0,c),pixels)
    if not buf.write(str(OUT/name)):
        raise RuntimeError(buf.geterror())


def textures():
    pixels = np.full((256,1024,4),255,np.uint8)
    source=oiio.ImageBuf(str(ASSET/'original/M16A4.png'))
    pixels[:,:256]=np.asarray(source.get_pixels(oiio.UINT8))
    pixels[:,:256,3]=255
    source=oiio.ImageBuf(str(ASSET/'original/M4A1.png'))
    source=np.asarray(source.get_pixels(oiio.UINT8))
    pixels[:,512:768]=source;pixels[:,512:768,3]=255
    # Recolor only a separate stock copy of the donor atlas; preserve its shaded detail.
    samples=np.concatenate(list(STOCK_UV.values()))
    sx=np.clip((samples[:,0]*256).astype(int),0,255)
    sy=np.clip((samples[:,1]*256).astype(int),0,255)
    gray=source[:,:,:3]@np.array((.25,.60,.15))
    median=float(np.median(gray[sy,sx]))
    shade=np.clip(gray-median,-25,35)
    pixels[:,768:,:3]=np.clip(np.array(PALETTE['olive'])+shade[:,:,None]*.65,0,255)
    y,x = np.mgrid[:64,:128]
    for i,color in enumerate(PALETTE.values()):
        shade = 1.2*np.sin(x/23+y/31) + np.interp(y,(0,63),(2,-3))
        pixels[i//2*64:(i//2+1)*64,256+i%2*128:256+(i%2+1)*128,:3] = np.clip(
            np.array(color)+shade[:,:,None],0,255)
    png('C7A2.png',pixels)
    # Reference-inspired reticle; transparent surroundings preserve the live feed.
    r = np.zeros((512,512,4),np.uint8)
    pale=post=(0,0,0,255)
    r[254:257,42:111]=pale; r[254:257,166:246]=pale
    r[254:257,268:343]=pale; r[254:257,401:470]=pale
    r[270:273,271:343]=pale
    r[269:392,251:262]=post
    for row in range(256,269):
        half=max(1,(row-256)//2)
        r[row,256-half:257+half]=post
    png('C79_reticle.png',r)
    # Crisp native inventory art is generated from editable pixel primitives.
    for name in ('C7A2Icon','C79Icon'):
        p=np.zeros((32,32,4),np.uint8)
        def rect(x,y,X,Y,c): p[y:Y,x:X]=(*PALETTE[c],255)
        if name=='C7A2Icon':
            rect(1,13,7,17,'olive');rect(6,14,10,15,'steel')
            rect(9,13,16,17,'steel');rect(15,13,25,16,'olive')
            rect(25,14,31,15,'edge');rect(25,11,26,15,'steel')
            rect(10,17,12,21,'olive');rect(14,17,17,22,'mag')
            rect(15,21,18,23,'mag');rect(10,12,15,13,'edge')
            for x in range(16,25,2):rect(x,13,x+1,16,'rib')
        else:
            rect(6,13,25,21,'olive');rect(5,12,9,22,'rib')
            rect(23,12,27,22,'rib');rect(9,21,24,24,'steel')
            rect(12,13,22,14,'rib');rect(7,14,9,20,'dark')
            rect(10,24,24,25,'edge')
        png(name+'.png',p)


def export(name,mesh,scale):
    lines=['# Authored FMUR C7A2/C79 geometry; tools/build_c7a2.py']
    for i,(mat,p) in enumerate(mesh.faces):
        n=np.cross(p[1]-p[0],p[2]-p[0]);n/=np.linalg.norm(n)
        uv=uv_for(mat,p)
        for q,(u,v) in zip(p,uv):
            lines.extend(('v %.7f %.7f %.7f'%tuple(q/scale),
                          'vt %.7f %.7f'%(u,1-v),
                          'vn %.7f %.7f %.7f'%tuple(n*(1,-1,1))))
        lines.append('f '+' '.join(f'{i*3+j}/{i*3+j}/{i*3+j}' for j in (1,2,3)))
    (OUT/(name+'.obj')).write_text('\n'.join(lines)+'\n',encoding='ascii')


def scene(parts):
    bpy.ops.object.select_all(action='SELECT');bpy.ops.object.delete(use_global=False)
    mat=bpy.data.materials.new('BFMC olive and charcoal');mat.use_nodes=True
    mat.use_backface_culling=True
    tex=mat.node_tree.nodes.new('ShaderNodeTexImage')
    tex.image=bpy.data.images.load(str(OUT/'C7A2.png'));tex.interpolation='Closest'
    shader=mat.node_tree.nodes.get('Principled BSDF');shader.inputs['Roughness'].default_value=.88
    mat.node_tree.links.new(tex.outputs['Color'],shader.inputs['Base Color'])
    for name,mesh in parts.items():
        offset=np.array((1.5,6.47,0)) if name=='C79' else np.zeros(3)
        data=bpy.data.meshes.new(name)
        points=[(q[0],-q[2],q[1]) for _,p in mesh.faces for q in p+offset]
        data.from_pydata(points,[],[tuple(range(i,i+3)) for i in range(0,len(points),3)])
        data.materials.append(mat);data.uv_layers.new()
        for poly,(material,p) in zip(data.polygons,mesh.faces):
            uv=uv_for(material,p)
            for loop,(u,v) in zip(poly.loop_indices,uv):data.uv_layers.active.data[loop].uv=(u,1-v)
        ob=bpy.data.objects.new(name,data);bpy.context.collection.objects.link(ob)
    s=bpy.context.scene;s.render.engine='CYCLES';s.cycles.samples=16
    s.render.resolution_x=1600;s.render.resolution_y=600;s.render.resolution_percentage=100
    s.world.color=(.19,.21,.23);s.view_settings.view_transform='Standard'
    for pos,power in (((2,-15,22),5000),((8,12,15),3500)):
        light=bpy.data.lights.new('Softbox','AREA');light.energy=power;light.size=18
        ob=bpy.data.objects.new('Softbox',light);s.collection.objects.link(ob);ob.location=pos
        ob.rotation_euler=(Vector((5,0,3))-ob.location).to_track_quat('-Z','Y').to_euler()
    cam=bpy.data.objects.new('Camera',bpy.data.cameras.new('Camera'));s.collection.objects.link(cam);s.camera=cam
    cam.data.type='ORTHO';cam.data.ortho_scale=33
    for name,pos in (('profile',(6,-55,3)),('preview',(24,-48,22)),('opposite',(5,55,12)),
                     ('underside',(15,-45,-18)),('bare-profile',(6,-55,3))):
        bpy.data.objects['C79'].hide_render=name=='bare-profile'
        bpy.data.objects['C7A2_irons'].hide_render=name!='bare-profile'
        cam.location=pos;cam.rotation_euler=(Vector((6,0,3))-cam.location).to_track_quat('-Z','Y').to_euler()
        target=OUT/(name+'.png')
        target.unlink(missing_ok=True)
        s.render.filepath=str(target);bpy.ops.render.render(write_still=True)
    tex.image.pack();bpy.context.preferences.filepaths.save_version=0
    bpy.data.objects['C79'].hide_render=False
    bpy.data.objects['C7A2_irons'].hide_render=True
    (OUT/'C7A2.blend').unlink(missing_ok=True)
    bpy.ops.wm.save_as_mainfile(filepath=str(OUT/'C7A2.blend'))


def main():
    parser=argparse.ArgumentParser(description=__doc__);parser.add_argument('--install',action='store_true')
    args=parser.parse_args(sys.argv[sys.argv.index('--')+1:] if '--' in sys.argv else [])
    OUT.mkdir(parents=True,exist_ok=True)
    parts=rifle();parts['C79']=optic();textures()
    report={}
    for name,mesh in parts.items():
        export(name,mesh,1 if name=='C79' else 1.15)
        p=np.concatenate([p for _,p in mesh.faces])
        report[name]={'triangles':len(mesh.faces),'bounds':[p.min(0).tolist(),p.max(0).tolist()]}
    (OUT/'geometry.json').write_text(json.dumps(report,indent=2)+'\n')
    scene(parts)
    if args.install:
        copies={OUT/(name+'.obj'):ROOT/'eclipse/Flan/BFMCpack'/(name+'.obj') for name in parts}
        copies.update({OUT/'C7A2.png':PACK/'assets/flansmod/skins/C7A2.png',
                       OUT/'C7A2Icon.png':PACK/'assets/flansmod/textures/items/C7A2.png',
                       OUT/'C79Icon.png':PACK/'assets/flansmod/textures/items/C79.png',
                       OUT/'C79_reticle.png':PACK/'assets/flansmod/gui/PIP/C79.png'})
        for source in (ASSET/'definitions').rglob('*'):
            if source.is_file():copies[source]=PACK/source.relative_to(ASSET/'definitions')
        for source,dest in copies.items():
            dest.parent.mkdir(parents=True,exist_ok=True);shutil.copy2(source,dest)
    print(json.dumps(report,indent=2))


if __name__=='__main__':
    main()
