"""Prepare a probe using CURRENT sources and the existing isolated validation instance.

Run with Python, then gradlew.bat -I tools/c7a2/live.gradle runClient --offline.
Does not inject hooks into production source files or alter a player's world.
"""
from pathlib import Path
import shutil

ROOT = Path(__file__).resolve().parents[2]
WORK = ROOT / 'build/c7a2-check'
PROBE = WORK / 'probe'
INSTANCE = ROOT / 'build/m240-check/instance'
if not (INSTANCE/'Flan/BFMC Gun Pack').is_dir():
    raise RuntimeError('Existing isolated validation instance is required')
PROBE.mkdir(parents=True,exist_ok=True)
s=(ROOT/'src/main/java/com/flansmod/client/FlansModClient.java').read_text(encoding='utf-8')
needle='public static void tick() {'
assert s.count(needle)==1
s=s.replace(needle,needle+' com.flansmod.client.model.C7A2Probe.tick(minecraft);',1)
(PROBE/'FlansModClient.java').write_text(s,encoding='utf-8')
s=(ROOT/'src/main/java/com/flansmod/client/model/RenderGun.java').read_text(encoding='utf-8')
needle='if (!offHand && scope == gunType && model.ironSightOffset != null && actualZoomProgress > 0F) {'
assert s.count(needle)==1
s=s.replace(needle,'C7A2Probe.base(model); '+needle,1)
needle='// Load Arm texture'
assert s.count(needle)==1
s=s.replace(needle,'C7A2Probe.measure(model); '+needle,1)
(PROBE/'RenderGun.java').write_text(s,encoding='utf-8')
shutil.copy2(ROOT/'tools/c7a2/C7A2Probe.java',PROBE/'C7A2Probe.java')
for source in (ROOT/'development_assets/c7a2/model').glob('*.obj'):
    shutil.copy2(source,INSTANCE/'Flan/BFMCpack'/source.name)
for name in ('guns/CA_AR_C7A2.txt','attachments/SCOPE_C79.txt','assets/flansmod/skins/C7A2.png',
             'assets/flansmod/textures/items/C7A2.png','assets/flansmod/textures/items/C79.png',
             'assets/flansmod/gui/PIP/C79.png'):
    dest=INSTANCE/'Flan/BFMC Gun Pack'/name
    dest.parent.mkdir(parents=True,exist_ok=True)
    shutil.copy2(ROOT/'eclipse/Flan/BFMC Gun Pack'/name,dest)
