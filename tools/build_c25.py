"""Build the photo-reference C25 conversion. Blender 5.2: -- --install.

Uses the C7A2 export primitives and archived M16 donor; no C7A2 output is edited.
"""
import json
import math
import shutil
import sys
from pathlib import Path

import bpy
import numpy as np
import OpenImageIO as oiio
from mathutils import Vector

sys.path.insert(0, str(Path(__file__).resolve().parent))
sys.dont_write_bytecode = True
import build_c7a2 as base

ROOT = base.ROOT
ASSET = ROOT / 'development_assets/c25'
OUT = ASSET / 'model'
PACK = base.PACK
base.ASSET, base.OUT = ASSET, OUT
base.PALETTE = {'steel': (133, 119, 96), 'edge': (153, 139, 114),
                'olive': (144, 129, 104), 'rib': (160, 145, 119),
                'dark': (43, 45, 43), 'mag': (137, 122, 98),
                'mag_rib': (113, 101, 83), 'glass': (28, 43, 41)}
Mesh = base.Mesh


def uv_for(material, p):
    # C25 owns a three-column atlas independently of later C7A2 revisions.
    if material in base.DONOR_UV:
        uv=base.DONOR_UV[material].copy();uv[:,0]/=3
        return uv
    if material in base.M4_UV:
        uv=base.M4_UV[material].copy();uv[:,0]=(2+uv[:,0])/3
        return uv
    n=np.cross(p[1]-p[0],p[2]-p[0]);axes=((2,1),(0,2),(0,1))[abs(n).argmax()]
    tile=list(base.PALETTE).index(material)
    uv=((tile%2*128+8,tile//2*64+8)+(p[:,axes]%4)/4*(112,48))/256
    uv[:,0]=(1+uv[:,0])/3
    return uv


base.uv_for=uv_for


def stock():
    m = Mesh()
    selected = []
    for line in (ASSET/'original/MCX.mesh').read_text().splitlines():
        words=line.split()
        if not words[0].startswith('defaultStockModel#'):
            continue
        # Keep the detailed cheekpiece, buttpad and latch; replace the filled
        # lower web with the reference's open triangular frame.
        if 24 <= int(words[0].split('#')[1]) <= 40:
            continue
        face=np.array([list(map(float,w.split(','))) for w in words[1:]])
        # Archive is at 1.15; MCX's installed definition uses 0.1.
        p=face[:,:3]*(.1/1.15)
        p[:,0]=(p[:,0]+10.6)*(6.06/7)-8.66
        p[:,1]=(p[:,1]-2.35)*(4.39/3.75)+1.55
        p[:,2]*=.95
        if words[0] not in selected:selected.append(words[0])
        for j in range(1,len(face)-1):
            ids=[0,j,j+1];tri=p[ids]
            if np.linalg.norm(np.cross(tri[1]-tri[0],tri[2]-tri[0]))<1e-8:continue
            key='stock_'+str(len(base.M4_UV));base.M4_UV[key]=face[ids,3:5]
            m.faces.append((key,tri))
    (OUT/'stock_selection.json').write_text(json.dumps(selected,indent=2)+'\n')
    outline=((-8.32,1.68),(-3.30,4.22),(-4.06,4.22),(-8.32,2.06))
    m.profile('olive',outline,-.34,.34)
    for z in (-.365,.34):
        m.profile('rib',((-8.20,1.86),(-3.68,4.16),(-4.02,4.16),(-8.20,2.04)),z,z+.025)
    return m


def vent_row(m, bottom, top, count, length, height, stagger=0):
    """Extrude contiguous wall cells around actual capsule-shaped openings."""
    left,right=5.04,13.35
    step=(right-left)/count
    radius=height/2
    center=(bottom+top)/2+stagger
    for side in (-1,1):
        z0,z1=sorted((side*.63,side*.75))
        for i in range(count):
            L,R=left+i*step,left+(i+1)*step
            a,b=(L+R-length)/2,(L+R+length)/2
            m.box('olive',(L,bottom,z0),(a,top,z1))
            m.box('olive',(b,bottom,z0),(R,top,z1))
            xs=sorted(set([a,b,a+radius,b-radius]+
                          [a+radius-radius*math.cos(t) for t in np.linspace(0,math.pi/2,6)]+
                          [b-radius+radius*math.sin(t) for t in np.linspace(0,math.pi/2,6)]))
            def edge(x):
                d=max(a+radius-x,0,x-(b-radius))
                return math.sqrt(max(0,radius*radius-d*d))
            for x,X in zip(xs,xs[1:]):
                if X-x<1e-7:continue
                h,H=edge(x),edge(X)
                m.profile('olive',((x,center+h),(X,center+H),(X,top),(x,top)),z0,z1)
                m.profile('olive',((x,bottom),(X,bottom),(X,center-H),(x,center-h)),z0,z1)


def handguard():
    m=Mesh()
    vent_row(m,4.28,4.70,6,1.03,.14)
    vent_row(m,4.70,5.48,5,1.28,.27)
    vent_row(m,5.48,5.91,6,1.03,.14)
    # Roof/floor chamfers join the thin side walls around the barrel channel.
    # Longitudinal chamfers are profiles in Y/Z, extruded along X.
    for profile in (((5.91,-.75),(6.10,-.50),(6.10,.50),(5.91,.75),
                     (5.91,.63),(5.98,.46),(5.98,-.46),(5.91,-.63)),
                    ((4.28,-.75),(4.28,-.63),(4.20,-.46),(4.20,.46),
                     (4.28,.63),(4.28,.75),(4.08,.50),(4.08,-.50))):
        section=Mesh();section.profile('olive',profile,5.04,13.35)
        for mat,p in section.faces:
            m.faces.append((mat,p[:,[2,0,1]]))
    # Full-height rear fastening collar, with small inset dark screw heads.
    for z in (-.77,.75):
        m.box('steel',(5.04,4.30,z),(5.47,5.89,z+.02))
        for y in (4.48,5.69):m.box('dark',(5.19,y,z-.002),(5.30,y+.10,z+.023))
    return m


def rifle():
    donor = base.donor()
    body, muzzle = donor['body'], Mesh()
    # Retain the pack MCX's detailed open stock at the C25's existing envelope.
    body.faces.extend(stock().faces)
    body.tube('dark', ((-2.65,.34),(-1.5,.34)), y=5.29)
    body.faces.extend(handguard().faces)
    body.tube('dark', ((4.95,.23),(15.6,.23)), y=5.29, inner=.095)
    # Full-length top rail; teeth have angled shoulders and separated slots.
    body.box('steel',(-1.4,6.04,-.33),(13.35,6.18,.33))
    for x in np.arange(-1.4,13.3,.39):
        body.profile('edge',((x,6.18),(x+.22,6.18),(x+.27,6.30),
                            (x+.22,6.43),(x,6.43),(x-.05,6.30)),-.57,.57)
    # Compact lower and side accessory rails use existing pack slots.
    for x in np.arange(7.5,10.7,.40):
        body.box('steel',(x,3.91,-.55),(x+.23,4.10,.55))
    for x in (8.6,9.0,9.4):
        body.box('steel',(x,4.68,-.94),(x+.23,5.16,-.75))
    # Factory tan muzzle shroud is replaceable as a complete default-barrel group.
    muzzle.tube('olive',((15.6,.37),(15.9,.57),(16.1,.73),(18.65,.73),
                        (18.9,.58)),y=5.29,inner=.16,segments=12)
    for z in (-.737,.716):
        for x in (16.35,17.05,17.75):
            muzzle.box('mag_rib',(x,5.11,z),(x+.45,5.43,z+.02))
    fixed_scope=optic()
    for _,p in fixed_scope.faces:p+=np.array((1.5,6.43,0))
    return {'C25':body,'C25_magazine':donor['mag'],'C25_bolt':donor['bolt'],
            'C25_scope':fixed_scope,'C25_muzzle':muzzle}


def optic():
    m = Mesh()
    # Cantilever mount and rings follow the supplied side photo.
    m.box('steel',(-1.8,0,-.48),(2.4,.24,.48))
    m.profile('olive',((-1.65,.24),(-1.65,1.35),(-1.36,1.35),
                       (-1.36,.56),(2.18,.56),(2.18,1.35),(2.45,1.35),(2.45,.24)), -.28,.28)
    m.tube('olive',((-3.0,.62),(-2.65,.62),(2.8,.62),(3.0,.76),
                     (5.05,.76)),y=1.65,inner=.49,segments=24)
    for x in (-1.65,2.08):
        m.tube('rib',((x,.74),(x+.44,.74)),y=1.65,inner=.63,segments=16)
        m.box('olive',(x,2.27,-.54),(x+.44,2.58,.54))
        for z in (-.57,.54):m.box('dark',(x+.10,2.31,z),(x+.30,2.45,z+.03))
    # Turret stacks and eyepiece knurling stay restrained at pack scale.
    m.box('steel',(-.25,1.70,-.75),(.75,2.51,.75))
    m.box('rib',(-.35,2.51,-.61),(.85,2.69,.61))
    turret = Mesh()
    turret.tube('rib',((.70,.46),(.92,.46)),y=0,segments=16)
    for material,p in turret.faces:
        # Turn the axial cylinder onto the camera-facing windage axis.
        m.faces.append((material,np.column_stack((p[:,1]+.25,-p[:,2]+1.95,-p[:,0]))))
    for x in (3.12,3.30):m.tube('rib',((x,.79),(x+.10,.79)),y=1.65,inner=.76)
    return m


def textures():
    # Preserve the donor's fine diffuse detail, recoloring its occupied steel tan.
    pixels = np.full((256,768,4),255,np.uint8)
    donor = np.asarray(oiio.ImageBuf(str(ASSET/'original/M16A4.png')).get_pixels(oiio.UINT8))
    lum = donor[:,:,:3].mean(2)
    for i,mid in enumerate((139,124,100)):
        pixels[:,:256,i] = np.clip(mid+(lum-65)*.40,18,205)
    y,x=np.mgrid[:64,:128]
    for i,color in enumerate(base.PALETTE.values()):
        shade=1.1*np.sin(x/23+y/31)+np.interp(y,(0,63),(2,-3))
        pixels[i//2*64:(i//2+1)*64,256+i%2*128:256+(i%2+1)*128,:3]=np.clip(np.array(color)+shade[:,:,None],0,255)
    # Keep the 1024px MCX stock atlas at native resolution in the right third.
    pixels=np.repeat(np.repeat(pixels,4,axis=0),4,axis=1)
    stock_pixels=np.asarray(oiio.ImageBuf(str(ASSET/'original/MCX.png')).get_pixels(oiio.UINT8))
    assert stock_pixels.shape[:2]==(1024,1024)
    lum=stock_pixels[:,:,:3].mean(2)
    for i,mid in enumerate((144,129,104)):
        pixels[:,2048:,i]=np.clip(np.where(lum<30,lum*.8+10,mid+(lum-100)*.50),0,255)
    base.png('C25.png',pixels)
    # Trace the supplied VMR diagram. The model rim supplies the lens boundary;
    # leave the white reference background transparent for the live PiP feed.
    r=np.zeros((1024,1024,4),np.uint8)
    black=(0,0,0,255)
    r[510:514,8:1016]=black
    r[8:1016,510:514]=black
    r[8:248,500:524]=black
    r[500:524,8:248]=black
    r[500:524,776:1016]=black
    r[952:1016,500:524]=black
    for step in range(1,15):
        half=11 if step%2==0 else 5
        offset=round(step*29.3)
        y=512+offset
        r[y-2:y+2,512-half:512+half]=black
        if step<=8:
            y=512-offset
            r[y-2:y+2,512-half:512+half]=black
            for x in (512-offset,512+offset):
                r[512-half:512+half,x-2:x+2]=black
    base.png('C25Scope_reticle.png',r)
    for name in ('C25','C25Scope'):
        p=np.zeros((32,32,4),np.uint8)
        def rect(x,y,X,Y,c):p[y:Y,x:X]=(*base.PALETTE[c],255)
        if name=='C25':
            rect(1,12,8,15,'olive');rect(1,15,3,19,'olive')
            for i in range(5):rect(3+i,18-i,5+i,19-i,'olive')
            rect(8,12,16,17,'steel');rect(10,17,12,21,'olive')
            rect(14,17,17,22,'mag');rect(15,21,18,23,'mag')
            rect(16,12,26,16,'olive');rect(26,14,29,15,'dark');rect(28,12,32,16,'olive')
            for x in (17,20,23):rect(x,14,x+2,15,'dark')
            rect(8,11,26,12,'edge')
        else:
            rect(3,12,29,18,'olive');rect(22,11,30,19,'rib')
            rect(8,11,10,20,'rib');rect(18,11,20,20,'rib')
            rect(12,10,16,13,'edge');rect(8,20,22,23,'steel')
        base.png(name+'Icon.png',p)


def scene(parts):
    bpy.ops.object.select_all(action='SELECT');bpy.ops.object.delete(use_global=False)
    mat=bpy.data.materials.new('BFMC C25 tan');mat.use_nodes=True
    mat.use_backface_culling=True
    tex=mat.node_tree.nodes.new('ShaderNodeTexImage')
    tex.image=bpy.data.images.load(str(OUT/'C25.png'));tex.interpolation='Closest'
    shader=mat.node_tree.nodes.get('Principled BSDF');shader.inputs['Roughness'].default_value=.88
    mat.node_tree.links.new(tex.outputs['Color'],shader.inputs['Base Color'])
    for name,mesh in parts.items():
        offset=np.array((1.5,6.43,0)) if name=='C25Scope' else np.zeros(3)
        data=bpy.data.meshes.new(name)
        points=[(q[0],-q[2],q[1]) for _,p in mesh.faces for q in p+offset]
        data.from_pydata(points,[],[tuple(range(i,i+3)) for i in range(0,len(points),3)])
        data.materials.append(mat);data.uv_layers.new()
        for poly,(material,p) in zip(data.polygons,mesh.faces):
            uv=base.uv_for(material,p)
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
    cam.data.type='ORTHO';cam.data.ortho_scale=34
    for name,pos in (('profile',(6,-55,3)),('preview',(24,-48,22)),('opposite',(5,55,12)),
                     ('underside',(15,-45,-18)),('bare-profile',(6,-55,3))):
        bpy.data.objects['C25Scope'].hide_render=True
        bpy.data.objects['C25_scope'].hide_render=name=='bare-profile'
        cam.location=pos;cam.rotation_euler=(Vector((5,0,4.6))-cam.location).to_track_quat('-Z','Y').to_euler()
        target=OUT/(name+'.png')
        target.unlink(missing_ok=True)
        s.render.filepath=str(target);bpy.ops.render.render(write_still=True)
    tex.image.pack();bpy.context.preferences.filepaths.save_version=0
    bpy.data.objects['C25Scope'].hide_render=True
    bpy.data.objects['C25_scope'].hide_render=False
    (OUT/'C25.blend').unlink(missing_ok=True)
    bpy.ops.wm.save_as_mainfile(filepath=str(OUT/'C25.blend'))


def main():
    OUT.mkdir(parents=True,exist_ok=True)
    parts=rifle();parts['C25Scope']=optic();textures()
    report={}
    for name,mesh in parts.items():
        base.export(name,mesh,1 if name=='C25Scope' else 1.15)
        path=OUT/(name+'.obj')
        path.write_text(path.read_text().replace('Authored FMUR C7A2/C79 geometry; tools/build_c7a2.py',
                                               'FMUR C25 donor conversion; tools/build_c25.py'))
        p=np.concatenate([p for _,p in mesh.faces])
        report[name]={'triangles':len(mesh.faces),'bounds':[p.min(0).tolist(),p.max(0).tolist()]}
    (OUT/'geometry.json').write_text(json.dumps(report,indent=2)+'\n')
    scene(parts)
    if '--install' in sys.argv:
        copies={OUT/(name+'.obj'):ROOT/'eclipse/Flan/BFMCpack'/(name+'.obj') for name in parts}
        copies[OUT/'C25.png']=PACK/'assets/flansmod/skins/C25.png'
        for name in ('C25','C25Scope'):
            copies[OUT/(name+'Icon.png')]=PACK/('assets/flansmod/textures/items/'+name+'.png')
        copies[OUT/'C25Scope_reticle.png']=PACK/'assets/flansmod/gui/PIP/C25Scope.png'
        for path in (ASSET/'definitions').rglob('*'):
            if path.is_file():copies[path]=PACK/path.relative_to(ASSET/'definitions')
        for src,dst in copies.items():
            dst.parent.mkdir(parents=True,exist_ok=True)
            if src.suffix == '.lang':
                old=dst.read_text(encoding='utf-8') if dst.exists() else ''
                lines=[line for line in old.splitlines()
                       if not line.startswith(('item.c25.name=','item.c25scope.name='))]
                dst.write_text('\n'.join(lines)+'\n'+src.read_text(),encoding='utf-8')
            else:
                shutil.copy2(src,dst)
    print(json.dumps(report,indent=2))


if __name__=='__main__':main()
