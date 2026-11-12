"""Verify exports, the actual Java OBJ loader, installed hashes and pack bindings.

Run with Blender's bundled Python after checkC25Geometry.
"""
from pathlib import Path
import hashlib
import json
import re

import numpy as np
import OpenImageIO as oiio

ROOT=Path(__file__).resolve().parents[2]
ASSET=ROOT/'development_assets/c25'
OUT=ASSET/'model'
PACK=ROOT/'eclipse/Flan/BFMC Gun Pack'
CHECK=ROOT/'build/c25-check'
GROUPS={'gunModel':'C25','ammoModel':'C25_magazine','slideModel':'C25_bolt',
        'defaultScopeModel':'C25_scope','defaultBarrelModel':'C25_muzzle','attachmentModel':'C25Scope'}


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
    texture=np.asarray(oiio.ImageBuf(str(OUT/'C25.png')).get_pixels(oiio.UINT8))
    for filename in ('C25','C25Scope'):
        groups={}
        for line in (CHECK/(filename+'.mesh')).read_text().splitlines():
            w=line.split();key=w[0].split('#')[0]
            groups.setdefault(key,[]).append([list(map(float,v.split(','))) for v in w[1:]])
        for group,loaded in groups.items():
            name=GROUPS[group];source=obj(OUT/(name+'.obj'),1 if name=='C25Scope' else 1.15)
            loaded=np.array(loaded)
            assert source.shape==loaded.shape,(name,source.shape,loaded.shape)
            error=float(np.max(np.abs(source-loaded)))
            assert error<.00002,(name,error)
            uv=source[:,:,3:];x=np.minimum((uv[:,:,0]*texture.shape[1]).astype(int),texture.shape[1]-1)
            y=np.minimum((uv[:,:,1]*texture.shape[0]).astype(int),255)
            assert (texture[y,x,3]==255).all(),name+' transparent material'
            report['geometry'][name]={'triangles':len(source),'maximum_java_error':error}
    copies={OUT/(name+'.obj'):ROOT/'eclipse/Flan/BFMCpack'/(name+'.obj') for name in GROUPS.values()}
    copies.update({OUT/'C25.png':PACK/'assets/flansmod/skins/C25.png',
                   OUT/'C25Icon.png':PACK/'assets/flansmod/textures/items/C25.png',
                   OUT/'C25ScopeIcon.png':PACK/'assets/flansmod/textures/items/C25Scope.png',
                   OUT/'C25Scope_reticle.png':PACK/'assets/flansmod/gui/PIP/C25Scope.png'})
    for path in (ASSET/'definitions').rglob('*'):
        if not path.is_file():continue
        copies[path]=PACK/path.relative_to(ASSET/'definitions')
    for source,dest in copies.items():
        if source.suffix == '.lang':
            assert all(line in dest.read_text(encoding='utf-8').splitlines()
                       for line in source.read_text().splitlines())
        else:
            assert digest(source)==digest(dest),str(dest)
        report['installed'][str(dest.relative_to(ROOT))]=digest(dest)
    for shortname,folder in (('c25','guns'),('c25scope','attachments')):
        found=[]
        for pack in (ROOT/'eclipse/Flan').iterdir():
            for path in (pack/folder).glob('*.txt'):
                if re.search(r'^ShortName\s+'+shortname+r'\s*$',path.read_text(errors='replace'),re.M|re.I):found.append(str(path))
        assert len(found)==1,(shortname,found)
        report['identity'][shortname]=found
    r=np.asarray(oiio.ImageBuf(str(OUT/'C25Scope_reticle.png')).get_pixels(oiio.UINT8))
    assert r.shape==(1024,1024,4) and (r[0,:,3]==0).all() and r[512,512,3]==255
    assert np.mean(r[:,:,3]==0)>.97, 'Reticle must preserve the live feed'
    assert (r[r[:,:,3]>0,:3]==0).all(), 'Reticle marks must be black'
    assert r[100,500,3]==255 and r[100,499,3]==0
    assert r[512,100,3]==255 and r[499,100,3]==0
    assert r[970,500,3]==255 and r[940,500,3]==0
    assert r[571,522,3]==255 and r[541,522,3]==0
    attachment=(ASSET/'definitions/attachments/SCOPE_C25.txt').read_text()
    assert 'Name Colt Optics VMR [1-6x]' in attachment
    assert 'Magnification 1.0' in attachment and 'Magnification2 6.0' in attachment
    definition=(ASSET/'definitions/guns/CA_AR_C25.txt').read_text()
    for flag in ('AllowAllAttachments','AllowBarrelAttachments','AllowGripAttachments',
                 'AllowGadgetAttachments','AllowLaserPointerAttachments','AllowScopeAttachments'):
        assert re.search(r'^'+flag+r' True$',definition,re.M),flag
    body=obj(OUT/'C25.obj',1.15)[:,:,:3]
    muzzle=obj(OUT/'C25_muzzle.obj',1.15)[:,:,:3]
    assert abs(np.max(body[:,:,0])-15.6)<1e-5
    assert abs(np.min(muzzle[:,:,0])-15.6)<1e-5 and abs(np.max(muzzle[:,:,0])-18.9)<1e-5
    def covers(triangles,x,y):
        p=triangles[:,:,:2]
        a,b,c=p[:,0],p[:,1],p[:,2]
        cross=lambda u,v:u[:,0]*v[:,1]-u[:,1]*v[:,0]
        area=cross(b-a,c-a)
        active=np.abs(area)>1e-8
        a,b,c,area=a[active],b[active],c[active],area[active]
        q=np.array((x,y))
        u=cross(b-q,c-q)/area;v=cross(c-q,a-q)/area
        return bool(np.any((u>1e-5)&(v>1e-5)&(u+v<1-1e-5)))
    for x,y in ((-7.2,3.25),(-6.6,3.45)):
        assert not covers(body,x,y),'Stock opening filled'
    side=body[np.max(body[:,:,2],axis=1)<-.62]
    for bottom,top,count in ((4.28,4.70,6),(4.70,5.48,5),(5.48,5.91,6)):
        for i in range(count):
            x=5.04+(i+.5)*(13.35-5.04)/count
            # The rear fastening collar and short gadget rail intentionally mask some holes.
            if 8.5<x<9.7 and bottom<5.2:continue
            assert not covers(side,x,(bottom+top)/2),'Handguard slot filled'
    assert 'Magnification 1.0' in definition and 'Magnification2 6.0' in definition and 'PictureInPictureAutoDepth true' in definition
    assert 'PictureInPictureReticle PIP\\C25Scope' in definition
    scope=obj(OUT/'C25_scope.obj',1.15)
    standalone=obj(OUT/'C25Scope.obj',1)
    assert np.max(np.abs(scope[:,:,:3]-standalone[:,:,:3]-(1.5,6.43,0)))<2e-6
    for icon in ('C25Icon','C25ScopeIcon'):
        p=np.asarray(oiio.ImageBuf(str(OUT/(icon+'.png'))).get_pixels(oiio.UINT8))
        assert p.shape==(32,32,4) and set(np.unique(p[:,:,3]))=={0,255}
    for path in (ASSET/'original').iterdir():report['donor_sha256'][path.name]=digest(path)
    (ASSET/'validation').mkdir(exist_ok=True)
    (ASSET/'validation/checks.json').write_text(json.dumps(report,indent=2)+'\n')
    print('PASS: Java-loaded geometry, winding/normals, opacity, installation, unique IDs, icons and reticle')


if __name__=='__main__':main()
