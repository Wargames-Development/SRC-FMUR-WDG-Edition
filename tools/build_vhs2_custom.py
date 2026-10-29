"""Build the supplied VHS-2 reference into a native FMUR model.

Run with Python, numpy and Pillow; Blender performs mesh reduction and renders.
"""
import io
import json
import shutil
import subprocess
from pathlib import Path

import numpy as np
from PIL import Image, ImageDraw, ImageFont
from inspect_sketchfab_guns import load_archive, scene_meshes

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / 'development_assets' / 'vhs2_custom'
WORK = ROOT / 'build' / 'vhs2-check'
BLENDER = Path(r'C:\Program Files\Blender Foundation\Blender 5.2\blender.exe')


def prepare():
    OUT.mkdir(parents=True, exist_ok=True)
    WORK.mkdir(parents=True, exist_ok=True)
    archive, gltf, binary = load_archive('hs_produkt_vhs-2_rifle')
    meshes = list(scene_meshes(gltf, binary))
    image = Image.open(io.BytesIO(archive.read('textures/01_-_Default_baseColor.png'))).convert('RGBA')
    atlas = Image.new('RGBA', (2048, 2048), (38, 41, 43, 255))
    atlas.paste(image.resize((1984, 1984), Image.Resampling.LANCZOS), (0, 0))
    # Preserve the source islands; reserve a border for the new iron sights.
    draw = ImageDraw.Draw(atlas)
    for i, color in enumerate(((28,31,33),(55,60,62),(91,97,99),(155,160,157),(255,255,255))):
        draw.rectangle((i*64,1984,(i+1)*64-1,2047),fill=color+(255,))
    # The HK416 sight islands all occupy rows 64..80 of its 256px atlas.
    # Keep that strip at full resolution in the existing unused border.
    hk_texture=ROOT/'eclipse/Flan/BFMC Gun Pack/assets/flansmod/skins/HK416.png'
    atlas.paste(Image.open(hk_texture).convert('RGBA').crop((0,64,256,80)),(384,1984))
    atlas.save(OUT / 'VHS2_Custom.png')
    (OUT / 'ATTRIBUTION.txt').write_bytes(archive.read('license.txt') +
        b'\r\nFMUR adaptation also uses the existing BFMC Gun Pack HK416 iron-sight geometry and texture strip.\r\n')

    # Use FAMAS's measured 22.8-unit span and the M4's barrel height.
    positions = np.concatenate([m[2] for m in meshes])
    scale = 22.8 / np.ptp(positions[:,2])
    length_center = (positions[:,2].min()+positions[:,2].max())/2
    barrel = next(m for m in meshes if m[0].startswith('Barrel_'))[2]
    barrel_height = (barrel[:,1].min()+barrel[:,1].max())/2
    arrays, metadata = {}, []
    for i,(name,material,pos,normal,uv,triangles) in enumerate(meshes):
        # Blender is X muzzle, Y width, Z up; export maps to native TMT.
        points = np.column_stack((-(pos[:,2]-length_center)*scale+1.6,
                                  pos[:,0]*scale,(pos[:,1]-barrel_height)*scale+4.5))
        # Match the pack's bullpup body width while keeping the bore circular.
        # Rails use the full HK mount width independently of the receiver.
        if name.startswith(('Rail_', 'BottomRail_')):
            points[:,1] *= 1.2 / np.ptp(points[:,1])
        elif not name.startswith('Barrel_'):
            points[:,1] *= 1.35
        if name.startswith('Siderails_'):
            rail_axis=(points[:,2].min()+points[:,2].max())/2
            points[:,2]=rail_axis+(points[:,2]-rail_axis)*1.2/np.ptp(points[:,2])
        normals = np.column_stack((-normal[:,2],normal[:,0],normal[:,1]))
        uv = np.column_stack((uv[:,0]*1984/2048, 1-uv[:,1]*1984/2048))
        triangles = triangles.copy()
        for face in triangles:
            a,b,c = points[face]
            if np.dot(np.cross(b-a,c-a),normals[face].mean(0)) < 0:
                face[1],face[2] = face[2],face[1]
        arrays['p%d'%i],arrays['uv%d'%i],arrays['f%d'%i] = points,uv,triangles
        metadata.append({'name':name,'triangles':len(triangles)})
    np.savez(WORK / 'source.npz',**arrays)
    (WORK / 'source.json').write_text(json.dumps(metadata),encoding='utf-8')
    hk_parts={}
    hk_mesh=WORK/'HK416.mesh'
    if not hk_mesh.exists():
        raise RuntimeError('Run gradlew.bat -I tools/vhs2_geometry.gradle checkVHS2Geometry to extract HK416 sights')
    for line in hk_mesh.read_text().splitlines()[1:]:
        fields=line.split('\t')
        if not fields[0].startswith('defaultScopeModel#'): continue
        index=fields[0].split('#')[1]
        polygon=[list(map(float,v.split(',')))[:5] for v in fields[1:]]
        if any(not 64 <= v[4]*256 <= 80 for v in polygon):
            raise ValueError('HK416 sight UVs escaped the reserved texture strip')
        hk_parts.setdefault(index,[]).append(polygon)
    if len(hk_parts)!=51: raise ValueError('Unexpected HK416 iron sight layout')
    (WORK/'hk_sights.json').write_text(json.dumps(hk_parts))
    print('Prepared %d parts; %d source triangles' %
          (len(meshes),sum(m['triangles'] for m in metadata)),flush=True)


def install():
    pack = ROOT / 'eclipse' / 'Flan' / 'BFMC Gun Pack'
    if not pack.is_dir():
        raise RuntimeError('Existing BFMC Gun Pack is missing')
    for source,target in [
        (OUT/'VHS2_Custom.png',pack/'assets/flansmod/skins/VHS2_Custom.png'),
        (OUT/'VHS2_Custom_Icon.png',pack/'assets/flansmod/textures/items/VHS2_Custom.png'),
        (OUT/'ATTRIBUTION.txt',pack/'licenses/Sketchfab/VHS2_Custom.txt'),
        (ROOT/'development_assets/sketchfab_guns/definitions/guns/VHS2.txt',pack/'guns/VHS2.txt')]:
        target.parent.mkdir(parents=True,exist_ok=True)
        shutil.copy2(source,target)


def decorate_previews():
    font=ImageFont.truetype(r'C:\Windows\Fonts\segoeui.ttf',24)
    for name in ('VHS2_Custom_preview.png','VHS2_left.png','VHS2_right.png',
                 'FMUR_scale_comparison.png','VHS2_attachments.png','VHS2_iron_sight_alignment.png','VHS2_rail_fit.png'):
        path=OUT/name
        if not path.exists(): continue
        im=Image.open(path).convert('RGBA')
        background=Image.new('RGBA',im.size,(62,69,72,255))
        background.alpha_composite(im)
        draw=ImageDraw.Draw(background)
        if name=='FMUR_scale_comparison.png':
            labels=[(35,'M4A1: 23.4 units, pack scale 1.15'),
                    (490,'FAMAS: 22.8 units, pack scale 1.0'),
                    (940,'VHS-2: 22.8 units, pack scale 1.0')]
        else:
            text='VHS-2 | supplied tan finish | native FMUR mesh'
            if name=='VHS2_attachments.png': text='VHS-2 | pack HOLO, vertical grip and 5MW laser'
            if name=='VHS2_iron_sight_alignment.png': text='VHS-2 | HK416 sights with level white markings'
            if name=='VHS2_rail_fit.png': text='VHS-2 | HK416 sights fitted to the rail width'
            labels=[(24,text)]
        for y,text in labels: draw.text((32,y),text,font=font,fill=(227,231,230))
        background.convert('RGB').save(path)


if __name__ == '__main__':
    prepare()
    subprocess.run([str(BLENDER),'-b','-P',str(ROOT/'tools/vhs2/build_scene.py')],check=True)
    decorate_previews()
    install()
    print('Installed VHS-2 assets and attribution into BFMC Gun Pack')
