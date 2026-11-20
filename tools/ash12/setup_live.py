"""Instrument build copies only; use the existing disposable validation instance."""
from pathlib import Path
import shutil

ROOT = Path(__file__).resolve().parents[2]
PROBE = ROOT / 'build/ash12-check/probe'
INSTANCE = ROOT / 'build/m240-check/instance'
assert (INSTANCE / 'Flan/BFMC Gun Pack').is_dir()
PROBE.mkdir(parents=True, exist_ok=True)
s = (ROOT / 'src/main/java/com/flansmod/client/FlansModClient.java').read_text(encoding='utf-8')
needle = 'public static void tick() {'
assert s.count(needle) == 1
s = s.replace(needle, needle + ' com.flansmod.client.model.ASH12Probe.tick(minecraft);', 1)
(PROBE / 'FlansModClient.java').write_text(s, encoding='utf-8')
s = (ROOT / 'src/main/java/com/flansmod/client/model/RenderGun.java').read_text(encoding='utf-8')
needle = 'if (!offHand && scope == gunType && model.ironSightOffset != null && actualZoomProgress > 0F) {'
assert s.count(needle) == 1
s = s.replace(needle, 'ASH12Probe.base(model); ' + needle, 1)
needle = '// Load Arm texture'
assert s.count(needle) == 1
s = s.replace(needle, 'ASH12Probe.measure(model); ' + needle, 1)
(PROBE / 'RenderGun.java').write_text(s, encoding='utf-8')
shutil.copy2(ROOT / 'tools/ash12/ASH12Probe.java', PROBE / 'ASH12Probe.java')
for name in ('guns/RU_AR_ASH-12.txt', 'assets/flansmod/skins/ASH12.png',
             'assets/flansmod/textures/items/ASH12.png'):
    shutil.copy2(ROOT / 'eclipse/Flan/BFMC Gun Pack' / name, INSTANCE / 'Flan/BFMC Gun Pack' / name)
print('ASH12 probe prepared; only build copies and the disposable instance were changed.')
