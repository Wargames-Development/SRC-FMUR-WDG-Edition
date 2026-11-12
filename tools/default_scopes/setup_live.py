"""Prepare the existing disposable Forge fixture for default-scope regression checks."""
from pathlib import Path
import re
import shutil

ROOT=Path(__file__).resolve().parents[2]
PROBE=ROOT/'build/default-scopes/probe'
INSTANCE=ROOT/'build/m240-check/instance'
if not (INSTANCE/'Flan/BFMC Gun Pack').is_dir():
    raise RuntimeError('Existing isolated validation instance is required')
PROBE.mkdir(parents=True,exist_ok=True)
source=(ROOT/'src/main/java/com/flansmod/client/FlansModClient.java').read_text(encoding='utf-8')
needle='public static void tick() {'
assert source.count(needle)==1
source=source.replace(needle,needle+' com.flansmod.client.model.DefaultScopesProbe.tick(minecraft);',1)
(PROBE/'FlansModClient.java').write_text(source,encoding='utf-8')
for name in ('DefaultScopesProbe','DefaultScopeCheck'):
    shutil.copy2(ROOT/'tools/default_scopes'/(name+'.java'),PROBE/(name+'.java'))
for name in ('CA_AR_C7A2.txt','DragunovSVD.txt'):
    shutil.copy2(ROOT/'eclipse/Flan/BFMC Gun Pack/guns'/name,INSTANCE/'Flan/BFMC Gun Pack/guns'/name)
for shortname in ('c79','pso1','acogta01'):
    matches=[p for p in (ROOT/'eclipse/Flan/BFMC Gun Pack/attachments').glob('*.txt')
             if re.search(r'^ShortName\s+'+shortname+r'\s*$',p.read_text(errors='replace'),re.M)]
    if len(matches)!=1:raise RuntimeError('Expected one optic definition for '+shortname)
    shutil.copy2(matches[0],INSTANCE/'Flan/BFMC Gun Pack/attachments'/matches[0].name)
