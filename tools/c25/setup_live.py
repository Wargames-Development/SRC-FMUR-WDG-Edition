"""Prepare a probe using CURRENT sources and the existing isolated validation instance.

Run with Python, then gradlew.bat -I tools/c25/live.gradle runClient --offline.
Does not inject hooks into production source files or alter a player's world.
"""
from pathlib import Path
import shutil

ROOT = Path(__file__).resolve().parents[2]
WORK = ROOT / 'build/c25-check'
PROBE = WORK / 'probe'
INSTANCE = ROOT / 'build/m240-check/instance'
if not (INSTANCE/'Flan/BFMC Gun Pack').is_dir():
    raise RuntimeError('Existing isolated validation instance is required')
PROBE.mkdir(parents=True,exist_ok=True)
s=(ROOT/'src/main/java/com/flansmod/client/FlansModClient.java').read_text(encoding='utf-8')
needle='public static void tick() {'
assert s.count(needle)==1
s=s.replace(needle,needle+' com.flansmod.client.model.C25Probe.tick(minecraft);',1)
(PROBE/'FlansModClient.java').write_text(s,encoding='utf-8')
s=(ROOT/'src/main/java/com/flansmod/client/model/RenderGun.java').read_text(encoding='utf-8')
needle='if (!offHand && scope == gunType && model.ironSightOffset != null && actualZoomProgress > 0F) {'
assert s.count(needle)==1
s=s.replace(needle,'C25Probe.base(model); '+needle,1)
needle='// Load Arm texture'
assert s.count(needle)==1
s=s.replace(needle,'C25Probe.measure(model); '+needle,1)
(PROBE/'RenderGun.java').write_text(s,encoding='utf-8')
shutil.copy2(ROOT/'tools/c25/C25Probe.java',PROBE/'C25Probe.java')
for source in (ROOT/'development_assets/c25/model').glob('*.obj'):
    shutil.copy2(source,INSTANCE/'Flan/BFMCpack'/source.name)
for name in ('guns/CA_AR_C25.txt','attachments/SCOPE_C25.txt','assets/flansmod/skins/C25.png',
             'assets/flansmod/textures/items/C25.png','assets/flansmod/textures/items/C25Scope.png',
             'assets/flansmod/gui/PIP/C25Scope.png','assets/flansmod/lang/en_US.lang'):
    dest=INSTANCE/'Flan/BFMC Gun Pack'/name
    dest.parent.mkdir(parents=True,exist_ok=True)
    source=ROOT/'eclipse/Flan/BFMC Gun Pack'/name
    if name.endswith('.lang'):
        old=dest.read_text(encoding='utf-8') if dest.exists() else ''
        lines=[line for line in old.splitlines() if not line.startswith(('item.c25.name=','item.c25scope.name='))]
        dest.write_text('\n'.join(lines)+'\n'+source.read_text(),encoding='utf-8')
    else:shutil.copy2(source,dest)
