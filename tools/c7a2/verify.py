"""Verify exports, the actual Java OBJ loader, installed hashes and pack bindings.

Run with Blender's bundled Python after checkC7A2Geometry.
"""
from pathlib import Path
import hashlib
import json
import re

import numpy as np
import OpenImageIO as oiio

ROOT=Path(__file__).resolve().parents[2]
ASSET=ROOT/'development_assets/c7a2'
OUT=ASSET/'model'
PACK=ROOT/'eclipse/Flan/BFMC Gun Pack'
CHECK=ROOT/'build/c7a2-check'
GROUPS={'gunModel':'C7A2','ammoModel':'C7A2_magazine','slideModel':'C7A2_bolt',
        'defaultScopeModel':'C7A2_irons','defaultBarrelModel':'C7A2_muzzle','attachmentModel':'C79'}


def digest(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def obj(path,scale):
    positions,uvs,normals,faces=[],[],[],[]
    for line in path.read_text().splitlines():
        w=line.split()
        if not w:continue
        if w[0]=='v':positions.append(np.array(list(map(float,w[1:])))*scale)
        elif w[0]=='vt':
            u,v=map(float,w[1:]);uvs.append((u,1-v))
        elif w[0]=='vn':normals.append(np.array(list(map(float,w[1:])))*(1,-1,1))
        elif w[0]=='f':
            refs=[tuple(int(i)-1 for i in token.split('/')) for token in w[1:]]
            assert len(refs)==3
            p=np.array([positions[i] for i,t,n in refs]);uv=np.array([uvs[t] for i,t,n in refs])
            n=np.array([normals[n] for i,t,n in refs])
            cross=np.cross(p[1]-p[0],p[2]-p[0]);length=np.linalg.norm(cross)
            assert length>1e-8 and np.isfinite(p).all() and np.isfinite(uv).all()
            assert ((uv>=0)&(uv<=1)).all()
            assert np.min(n@(cross/length))>.9999, 'Normal/winding mismatch'
            faces.append(np.concatenate((p,uv),axis=1))
    assert faces
    return np.array(faces)


def main():
    report={'geometry':{},'installed':{},'identity':{},'donor_sha256':{}}
    texture=np.asarray(oiio.ImageBuf(str(OUT/'C7A2.png')).get_pixels(oiio.UINT8))
    for filename in ('C7A2','C79'):
        groups={}
        for line in (CHECK/(filename+'.mesh')).read_text().splitlines():
            w=line.split();key=w[0].split('#')[0]
            groups.setdefault(key,[]).append([list(map(float,v.split(','))) for v in w[1:]])
        for group,loaded in groups.items():
            name=GROUPS[group];source=obj(OUT/(name+'.obj'),1 if name=='C79' else 1.15)
            loaded=np.array(loaded)
            assert source.shape==loaded.shape,(name,source.shape,loaded.shape)
            error=float(np.max(np.abs(source-loaded)))
            assert error<.00002,(name,error)
            uv=source[:,:,3:];x=np.minimum((uv[:,:,0]*texture.shape[1]).astype(int),texture.shape[1]-1)
            y=np.minimum((uv[:,:,1]*256).astype(int),255)
            assert (texture[y,x,3]==255).all(),name+' transparent material'
            report['geometry'][name]={'triangles':len(source),'maximum_java_error':error}
    copies={OUT/(name+'.obj'):ROOT/'eclipse/Flan/BFMCpack'/(name+'.obj') for name in GROUPS.values()}
    copies.update({OUT/'C7A2.png':PACK/'assets/flansmod/skins/C7A2.png',
                   OUT/'C7A2Icon.png':PACK/'assets/flansmod/textures/items/C7A2.png',
                   OUT/'C79Icon.png':PACK/'assets/flansmod/textures/items/C79.png',
                   OUT/'C79_reticle.png':PACK/'assets/flansmod/gui/PIP/C79.png'})
    for path in (ASSET/'definitions').rglob('*.txt'):
        copies[path]=PACK/path.relative_to(ASSET/'definitions')
    for source,dest in copies.items():
        assert digest(source)==digest(dest),str(dest)
        report['installed'][str(dest.relative_to(ROOT))]=digest(dest)
    for shortname,folder in (('c7a2','guns'),('c79','attachments')):
        found=[]
        for pack in (ROOT/'eclipse/Flan').iterdir():
            for path in (pack/folder).glob('*.txt'):
                if re.search(r'^ShortName\s+'+shortname+r'\s*$',path.read_text(errors='replace'),re.M|re.I):found.append(str(path))
        assert len(found)==1,(shortname,found)
        report['identity'][shortname]=found
    r=np.asarray(oiio.ImageBuf(str(OUT/'C79_reticle.png')).get_pixels(oiio.UINT8))
    assert r.shape==(512,512,4) and (r[0,:,3]==0).all() and r[256,256,3]==255
    assert np.mean(r[:,:,3]==0)>.97, 'Reticle must preserve the live feed'
    assert (r[r[:,:,3]>0,:3]==0).all(), 'Reticle marks must be black'
    definition=(ASSET/'definitions/guns/CA_AR_C7A2.txt').read_text()
    for flag in ('AllowAllAttachments','AllowBarrelAttachments','AllowGripAttachments',
                 'AllowGadgetAttachments','AllowLaserPointerAttachments','AllowScopeAttachments'):
        assert re.search(r'^'+flag+r' True$',definition,re.M),flag
    body=obj(OUT/'C7A2.obj',1.15)[:,:,:3]
    muzzle=obj(OUT/'C7A2_muzzle.obj',1.15)[:,:,:3]
    assert abs(np.max(body[:,:,0])-19.4)<1e-5
    assert abs(np.min(muzzle[:,:,0])-19.4)<1e-5 and abs(np.max(muzzle[:,:,0])-20.55)<1e-5
    for icon in ('C7A2Icon','C79Icon'):
        p=np.asarray(oiio.ImageBuf(str(OUT/(icon+'.png'))).get_pixels(oiio.UINT8))
        assert p.shape==(32,32,4) and set(np.unique(p[:,:,3]))=={0,255}
    for path in (ASSET/'original').iterdir():report['donor_sha256'][path.name]=digest(path)
    (ASSET/'validation').mkdir(exist_ok=True)
    (ASSET/'validation/checks.json').write_text(json.dumps(report,indent=2)+'\n')
    print('PASS: Java-loaded geometry, winding/normals, opacity, installation, unique IDs, icons and reticle')


if __name__=='__main__':main()
