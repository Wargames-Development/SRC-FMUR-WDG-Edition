"""Refit the existing BFMC NTW-20. Run with Blender 5.2 --python, then -- --install.

The archived legacy mesh supplies the frame, controls, scope, handle and bipod.
New geometry is authored in effective pack units, X forward, Y up, Z right.
"""
import argparse
from collections import defaultdict
import hashlib
import json
from pathlib import Path
import shutil
import sys

import bpy
import numpy as np
import OpenImageIO as oiio
from mathutils import Vector
from mathutils.geometry import tessellate_polygon

ROOT = Path(__file__).resolve().parents[1]
ASSET = ROOT / 'development_assets/ntw20'
OUT = ASSET / 'remodel'
PACK = ROOT / 'eclipse/Flan/BFMC Gun Pack'
COLORS = {'steel': (65, 68, 69), 'edge': (77, 80, 80), 'rubber': (35, 37, 36),
          'grip': (46, 48, 45), 'recess': (28, 30, 30), 'magazine': (57, 61, 58),
          'barrel': (43, 44, 44), 'barrel_edge': (50, 51, 51)}
BORE = 5.745834


def atlas():
    image = oiio.ImageBuf(str(ASSET / 'original/NTW20.png'))
    source = np.asarray(image.get_pixels(oiio.UINT8))
    assert source.shape == (1024, 1024, 4)
    pixels = np.full((1024, 2048, 4), 255, np.uint8)
    # Keep occupied donor detail; suppress its blue glare and lift the near-black steel.
    gray = source[:, :, :3] @ np.array((.25, .60, .15))
    pixels[:, :1024, :3] = np.clip(24 + gray[:, :, None] * .53 + (0, 1, 1), 0, 255)
    # Legacy islands touch transparent padding; keep modeled steel opaque at UV edges.
    y, x = np.mgrid[:256, :256]
    for i, color in enumerate(COLORS.values()):
        shade = .8 * np.sin(x / 37 + y / 61) + .45 * np.sin(y / 9)
        shade += np.interp(y, (0, 24, 190, 255), (2, 1, -1, -2))
        pixels[(i//4)*256:(i//4+1)*256, 1024+(i%4)*256:1280+(i%4)*256, :3] = np.clip(
            np.asarray(color) + shade[:, :, None], 0, 255)
    buf = oiio.ImageBuf(oiio.ImageSpec(2048, 1024, 4, oiio.UINT8))
    buf.set_pixels(oiio.ROI(0, 2048, 0, 1024, 0, 1, 0, 4), pixels)
    if not buf.write(str(OUT / 'NTW20.png')):
        raise RuntimeError(buf.geterror())


class Mesh:
    def __init__(self):
        self.faces = []

    def face(self, material, points):
        points = np.array(points, float)
        normal = np.cross(points[1]-points[0], points[2]-points[0])
        axes = ((2, 1), (0, 2), (0, 1))[abs(normal).argmax()]
        uv = (points[:, axes] % 8) / 8
        tile = list(COLORS).index(material)
        uv = ((1024 + tile%4*256 + 8, tile//4*256 + 8) + uv*240) / (2048, 1024)
        for ids in tessellate_polygon([[Vector(p) for p in points]]):
            self.faces.append((points[list(ids)], uv[list(ids)]))

    def bridge(self, material, a, b):
        for i in range(len(a)):
            j = (i+1) % len(a)
            self.face(material, (a[i], a[j], b[j], b[i]))

    def profile(self, material, outline, z0, z1):
        # Positive area produces outward front faces and a closed extrusion.
        if sum(a[0]*b[1]-b[0]*a[1] for a,b in zip(outline, (*outline[1:], outline[0]))) < 0:
            outline = outline[::-1]
        a, b = [[(x,y,z) for x,y in outline] for z in (z0,z1)]
        self.face(material, a[::-1]); self.face(material, b)
        self.bridge(material, a, b)

    def box(self, material, low, high):
        x,y,z = low; X,Y,Z = high
        self.profile(material, ((x,y),(X,y),(X,Y),(x,Y)), z,Z)

    def tube(self, rings, material='steel', segments=12):
        loops = [[(x, BORE+r*np.cos(a), r*np.sin(a))
                  for a in np.linspace(0, 2*np.pi, segments+1)[:-1]] for x,r in rings]
        for a,b in zip(loops, loops[1:]):
            self.bridge(material, a,b)
        # The receiver shoulder closes the root; avoid an internal coplanar cap there.
        self.face('recess', loops[-1])


def donor():
    vertices, uv, faces = [], [], []
    for line in (ASSET / 'original/NTW-20.obj').read_text().splitlines():
        w = line.split()
        if not w:
            continue
        if w[0] == 'v':
            x,y,z = map(float,w[1:4]); vertices.append((x*.1+.5,z*.1+.5,-y*.1))
        elif w[0] == 'vt':
            u,v = map(float,w[1:3]); uv.append((u*.5,1-v))
        elif w[0] == 'f':
            ids = [tuple(int(i)-1 for i in corner.split('/')[:2]) for corner in w[1:]]
            faces.append((np.array([vertices[v] for v,t in ids]),np.array([uv[t] for v,t in ids])))
    neighbors = defaultdict(list)
    for i,(p,_) in enumerate(faces):
        for v in p:
            neighbors[tuple(v.round(4))].append(i)
    pending, components = set(range(len(faces))), []
    while pending:
        queue = [min(pending)]; pending.remove(queue[0])
        for i in queue:
            for v in faces[i][0]:
                for j in neighbors[tuple(v.round(4))]:
                    if j in pending:
                        pending.remove(j); queue.append(j)
        points = np.concatenate([faces[i][0] for i in queue])
        components.append((points.min(0),points.max(0),queue))
    components.sort(key=lambda c: tuple(c[0]))
    result = {key: Mesh() for key in ('body','scope','muzzle','magazine')}
    selection = []
    for index,(lo,hi,ids) in enumerate(components):
        if index in (0,9):
            selection.append(dict(component=index, action='replaced pad or grip'))
            continue
        group = 'scope' if index in (17,25,26,27,28,29,30,31,32,33,36) else 'body'
        selection.append(dict(component=index, group=group, bounds=[lo.tolist(),hi.tolist()]))
        for i in ids:
            points, uv = faces[i]
            if index == 1:
                # Clip crossing barrel polygons at the new seat, retaining original winding/UVs.
                polygon = list(zip(points,uv)); clipped = []
                for (p,t),(q,s) in zip(polygon,polygon[1:]+polygon[:1]):
                    if p[0] <= 12.8:
                        clipped.append((p,t))
                    if (p[0] <= 12.8) != (q[0] <= 12.8):
                        fraction = (12.8-p[0])/(q[0]-p[0])
                        clipped.append((p+(q-p)*fraction,t+(s-t)*fraction))
                if len(clipped) < 3:
                    continue
                points,uv = map(np.array,zip(*clipped))
            for ids3 in tessellate_polygon([[Vector(p) for p in points]]):
                result[group].faces.append((points[list(ids3)],uv[list(ids3)]))
    return result, selection


def rebuild(parts):
    body,mag,brake = (parts[k] for k in ('body','magazine','muzzle'))
    body.profile('rubber', ((-8.175,3.08),(-7.86,3.03),(-7.59,3.22),
                          (-7.59,6.14),(-7.86,6.34),(-8.175,6.29)), -.61,.61)
    body.profile('grip', ((-.05,1.13),(.14,.91),(.98,.87),(1.09,1.09),
                         (1.87,3.45),(1.57,3.70),(.83,3.70)), -.35,.35)
    for side in (-1,1):
        body.profile('rubber', ((.22,1.23),(.83,1.06),(1.55,3.23),(.96,3.33)),
                     *sorted((side*.353,side*.379)))
        for i in range(5):
            y=1.40+i*.32; x=.36+i*.108
            body.profile('grip', ((x,y),(x+.49,y-.10),(x+.53,y+.01),(x+.04,y+.11)),
                         *sorted((side*.380,side*.392)))
    # Close the actual sixteen-sided donor cut, rather than leaving an open annulus.
    cut = {tuple(p) for points,uv in body.faces for p,t in zip(points,uv)
           if abs(p[0]-12.8) < 1e-6 and t[0] < .5}
    if len(cut) != 16:
        raise ValueError('NTW receiver cut no longer has sixteen shoulder vertices')
    center_z = (min(p[2] for p in cut)+max(p[2] for p in cut))/2
    outer = sorted(cut, key=lambda p: round(np.arctan2(p[2]-center_z,p[1]-BORE)*8/np.pi) % 16)
    inner = [(12.8,BORE+.55*np.cos(a),.55*np.sin(a))
             for a in np.linspace(0,2*np.pi,17)[:-1]]
    body.bridge('barrel',outer,inner)
    # Sampled collar median is RGB 43/44/44. Keep the lip in the same continuous shell.
    body.tube(((12.8,.55),(12.82,.55),(12.82,.57),(13.04,.57),(13.04,.55),
               (13.06,.55),(13.32,.42),(31.95,.31),(32.80,.31)), 'barrel', segments=16)
    # Side-feed box retains the archived magazine's insertion seat and three-round profile.
    mag.profile('magazine', ((1.63,5.37),(1.79,5.315),(6.03,5.315),(6.189,5.46),
                             (6.189,6.04),(6.04,6.166),(1.76,6.166),(1.63,6.03)), -2.91,-.666)
    mag.box('edge',(1.60,5.30,-3.012),(6.22,6.18,-2.91))
    for x in (2.12,3.42,4.72,5.72):
        mag.box('steel',(x,5.48,-3.038),(x+.08,6.00,-3.012))
    # Rectangular NTW brake: three genuine side windows, a continuous bore and chamber reveals.
    outer = ((-.37,-1.10),(.37,-1.10),(.525,-.90),(.525,.90),
             (.37,1.10),(-.37,1.10),(-.525,.90),(-.525,-.90))
    angles = np.array([np.arctan2(z,y) for y,z in outer])
    inner = [(.19*np.cos(a),.19*np.sin(a)) for a in angles]
    intervals = ((32.80,33.55,False),(33.55,34.12,True),(34.12,34.42,False),
                 (34.42,34.99,True),(34.99,35.29,False),(35.29,35.86,True),(35.86,36.575,False))
    for x0,x1,window in intervals:
        a,b = [[(x,BORE+y,z) for y,z in outer] for x in (x0,x1)]
        ia,ib = [[(x,BORE+y,z) for y,z in inner] for x in (x0,x1)]
        for i in range(8):
            j=(i+1)%8
            if window and i in (0,4):
                continue
            brake.face('barrel',(a[i],a[j],b[j],b[i]))
            brake.face('recess',(ib[i],ib[j],ia[j],ia[i]))
        if not window:
            brake.bridge('barrel_edge',ia,a); brake.bridge('barrel_edge',b,ib)
        else:
            # Reveal walls meet the bore at the edges of each side window.
            for i,reverse in ((0,True),(1,False),(4,True),(5,False)):
                p=(a[i],b[i],ib[i],ia[i])
                brake.face('recess',p[::-1] if reverse else p)


def export(mesh, name):
    clean,seen,lines = [],set(),['# BFMC legacy NTW-20 refit; see ../README.md.']
    for points,uv in mesh.faces:
        cross=np.cross(points[1]-points[0],points[2]-points[0]); length=np.linalg.norm(cross)
        key=tuple(sorted(map(tuple,points.round(5))))
        if length < 1e-8 or key in seen:
            continue
        seen.add(key); n=cross/length; ids=[]
        for p,(u,v) in zip(points,uv):
            i=len(clean)*3+len(ids)+1
            # Inverse of the actual legacy position and normal loaders; Java keeps translateAll(5,5,0).
            x,y,z=p
            lines.extend(('v %.7f %.7f %.7f' % (10*x-5,-10*z,10*y-5),
                          'vt %.7f %.7f' % (u,1-v), 'vn %.7f %.7f %.7f' % (n[0],n[2],n[1])))
            ids.append(f'{i}/{i}/{i}')
        lines.append('f '+' '.join(ids));clean.append((points,uv))
    mesh.faces=clean
    (OUT/name).write_text('\n'.join(lines)+'\n',encoding='ascii')


def scene(parts):
    bpy.ops.object.select_all(action='SELECT');bpy.ops.object.delete(use_global=False)
    material=bpy.data.materials.new('BFMC charcoal steel');material.use_nodes=True
    material.surface_render_method='DITHERED';material.use_backface_culling=True
    texture=material.node_tree.nodes.new('ShaderNodeTexImage')
    texture.image=bpy.data.images.load(str(OUT/'NTW20.png'));texture.interpolation='Closest'
    shader=material.node_tree.nodes.get('Principled BSDF');shader.inputs['Roughness'].default_value=.84
    material.node_tree.links.new(texture.outputs['Color'],shader.inputs['Base Color'])
    for name,mesh in parts.items():
        vertices=[(p[0],-p[2],p[1]) for points,_ in mesh.faces for p in points]
        data=bpy.data.meshes.new(name);data.from_pydata(vertices,[],[tuple(range(i,i+3)) for i in range(0,len(vertices),3)])
        data.uv_layers.new();data.materials.append(material)
        for polygon,(_,uv) in zip(data.polygons,mesh.faces):
            for loop,(u,v) in zip(polygon.loop_indices,uv):data.uv_layers.active.data[loop].uv=(u,1-v)
        ob=bpy.data.objects.new(name,data);bpy.context.collection.objects.link(ob)
    s=bpy.context.scene;s.render.engine='CYCLES';s.cycles.samples=24
    s.render.resolution_x=1800;s.render.resolution_y=700;s.render.resolution_percentage=100
    s.world.color=(.20,.23,.25);s.view_settings.view_transform='Standard'
    for position,power in (((9,-18,30),9000),((17,18,20),6500)):
        lamp=bpy.data.lights.new('Softbox','AREA');lamp.energy=power;lamp.shape='DISK';lamp.size=22
        ob=bpy.data.objects.new('Softbox',lamp);s.collection.objects.link(ob);ob.location=position
        ob.rotation_euler=(Vector((12,0,4))-ob.location).to_track_quat('-Z','Y').to_euler()
    cam=bpy.data.objects.new('Camera',bpy.data.cameras.new('Camera'));s.collection.objects.link(cam);s.camera=cam
    cam.data.type='ORTHO';cam.data.ortho_scale=49
    for name,position in (('profile',(14,-65,4.2)),('preview',(35,-65,26)),('opposite',(14,65,12)),('underside',(20,-50,-22))):
        cam.location=position;cam.rotation_euler=(Vector((14,0,4.2))-cam.location).to_track_quat('-Z','Y').to_euler()
        s.render.filepath=str(OUT/(name+'.png'));bpy.ops.render.render(write_still=True)
    texture.image.pack();bpy.context.preferences.filepaths.save_version=0
    bpy.ops.wm.save_as_mainfile(filepath=str(OUT/'NTW20.blend'))


def main():
    parser=argparse.ArgumentParser(description=__doc__);parser.add_argument('--install',action='store_true')
    args=parser.parse_args(sys.argv[sys.argv.index('--')+1:] if '--' in sys.argv else [])
    OUT.mkdir(parents=True,exist_ok=True);atlas();parts,selection=donor();rebuild(parts)
    filenames={'body':'NTW20_remodel.obj','scope':'NTW20_scope.obj','muzzle':'NTW20_muzzle.obj','magazine':'NTW20_magazine.obj'}
    report={'parts':{},'donor_selection':selection,'muzzle':[36.575,BORE,0],
            'scale':.1,'legacy_translation':[5,5,0],'palette':COLORS}
    for group,mesh in parts.items():
        export(mesh,filenames[group]);p=np.concatenate([p for p,_ in mesh.faces])
        report['parts'][group]={'triangles':len(mesh.faces),'bounds':[p.min(0).tolist(),p.max(0).tolist()]}
    p=np.concatenate([p for mesh in parts.values() for p,_ in mesh.faces])
    report['dimensions']=np.ptp(p,axis=0).tolist()
    report['donor_sha256']={p.name:hashlib.sha256(p.read_bytes()).hexdigest() for p in (ASSET/'original').iterdir()}
    (OUT/'geometry.json').write_text(json.dumps(report,indent=2)+'\n')
    scene(parts)
    if args.install:
        for filename in filenames.values():shutil.copy2(OUT/filename,ROOT/'eclipse/Flan/BFMCpack'/filename)
        shutil.copy2(OUT/'NTW20.png',PACK/'assets/flansmod/skins/NTW20.png')
        shutil.copy2(ASSET/'definitions/guns/CUSTOM_SR_NTW20.txt',PACK/'guns/CUSTOM_SR_NTW20.txt')
    print(json.dumps(report['parts'],indent=2));print('Effective dimensions:',report['dimensions'])


if __name__ == '__main__':
    main()
