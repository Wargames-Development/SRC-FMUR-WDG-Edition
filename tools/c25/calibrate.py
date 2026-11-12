"""Solve bare ADS against the two matrices recorded by the isolated live probe."""
from pathlib import Path
import json
import math
import numpy as np

ROOT=Path(__file__).resolve().parents[2]
matrices=json.loads((ROOT/'development_assets/c25/validation/bare_matrices.json').read_text())
def read(label):
    return np.array(matrices[label]).reshape(4,4).T
base,view,projection=read('BASE'),read('VIEW'),read('PROJ')
tail=np.linalg.inv(base)@view
points=np.array([[-.65/16,7.23/16,0,1],[12.45/16,7.23/16,0,1]]).T
def evaluate(parameters):
    ty,tz,pitch,yaw=parameters
    a,b=map(math.radians,(pitch,yaw))
    rz=np.array([[math.cos(a),-math.sin(a),0,0],[math.sin(a),math.cos(a),0,0],[0,0,1,0],[0,0,0,1]])
    ry=np.array([[math.cos(b),0,math.sin(b),0],[0,1,0,0],[-math.sin(b),0,math.cos(b),0],[0,0,0,1]])
    t=np.eye(4);t[:3,3]=(0,ty,tz)
    p=projection@base@t@rz@ry@tail@points
    return (p[:2]/p[3]).T.flatten()
x=np.zeros(4)
for _ in range(12):
    f=evaluate(x)
    jac=np.column_stack([(evaluate(x+np.eye(4)[i]*1e-5)-f)/1e-5 for i in range(4)])
    x-=np.linalg.solve(jac,f)
assert np.max(np.abs(evaluate(x)))<1e-8
report=dict(zip(('offsetY','offsetZ','pitch','yaw'),map(float,x)))
print(json.dumps(report,indent=2))
(ROOT/'development_assets/c25/validation/bare_alignment.json').write_text(json.dumps(report,indent=2)+'\n')
