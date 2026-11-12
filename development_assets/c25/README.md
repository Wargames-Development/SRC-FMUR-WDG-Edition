# C25 with factory tan scope

The revised C25 uses a detailed BFMC MCX stock conversion, retains a genuinely
open triangular lower frame, and has a continuous chamfered handguard with
three rows of rounded through-slots. The MCX cheekpiece, buttpad, adjustment
latch and surface detail replace the original plain stock. Its filled lower
web is replaced by an authored diagonal frame to preserve the reference's hole.

The iron sights are removed. The Colt Optics VMR [1-6x] PiP scope is now the default scope on a
fresh C25: no separate attachment is needed. It uses the existing gun-level
PiP path and transparent black hash-mark reticle from the user's supplied diagram. Fitting an optional sight replaces
the factory scope through the normal defaultScopeModel swap. The independent
c25scope attachment remains available, preserving existing saved items.
The requested magnification range uses FMUR's existing two-position selector: 1x or 6x. Press Switch Scope Magnification (default Z) to toggle while aiming. Continuous intermediate zoom is not part of that existing control.

The M16A4 receiver, controls, firing grip, magazine and bolt remain. Weapon
length, mounts, ammo IDs, sounds, damage, RPM and reload are unchanged. The
factory muzzle is still replaceable. The loose sling is omitted.

## Files and provenance

- tools/build_c25.py: editable procedural source and dedicated installer.
  It imports Mesh/export primitives from tools/build_c7a2.py but owns its
  three-column UV mapping independently of that model's later atlas revisions.
- src/main/java/com/flansmod/client/model/BFMCpack/ModelC25.java: binds the
  factory scope group, with no iron-sight group or bare-iron pose correction.
- definitions/guns/CA_AR_C25.txt: gun-level 4x PiP settings.
- original/M16A4.mesh and M16A4.png: archived BFMC receiver donor.
- original/MCX.mesh and MCX.png: actual Java-loaded BFMC stock donor and atlas.
  The archive is recorded at scale 1.15; MCX's installed definition is 0.1.
  Stock conversion applies 0.1/1.15, fits X from [-10.6,-3.6] to [-8.66,-2.6],
  Y from [2.35,6.1] to [1.55,5.94], and scales Z by .95.
- model/stock_selection.json: retained MCX defaultStockModel parts 0-23 and
  41-80. Parts 24-40 are replaced by the authored hollow lower frame.
- model/donor_selection.json: retained M16A4 receiver, magazine and bolt IDs.
- model/: editable packed C25.blend, six OBJ exports, atlas, inventory icons,
  VMR reticle, measurements and five studio renders. C25_scope is fitted in gun
  coordinates; C25Scope is the independently usable attachment export.
- references/: both user-supplied C25 photos, for reference only. Their
  authorship/license was not supplied, and they are not projected as textures.

The original BFMC pack credits TV90/BFMC. Individual donor authorship/license
was not supplied. ModelMCX.java contains the modeling-tool copyright header
and an empty Model Creator field; no new license or personal author is asserted.

The 3072x1024 diffuse atlas has three equal columns: preserved M16 detail,
authored material tiles, and the MCX stock at its native 1024px resolution.
The first two columns are nearest-neighbor upscales, preserving their original
pixel treatment. Donor steel/polymer is recolored tan, with dark buttpad pixels.
Legacy OBJ V/normal compensation follows the existing verified loader path.

## Rebuild and install

From the repository root, in PowerShell:

```powershell
& 'C:/Program Files/Blender Foundation/Blender 5.2/blender.exe' -b --factory-startup --python-exit-code 1 --python tools/build_c25.py -- --install
.\gradlew.bat compileJava -I tools/c25_geometry.gradle checkC25Geometry --offline
& 'C:/Program Files/Blender Foundation/Blender 5.2/5.2/python/bin/python.exe' tools/c25/verify.py
```

The installer copies native OBJ files to eclipse/Flan/BFMCpack and definitions,
textures and merged English names to eclipse/Flan/BFMC Gun Pack. Deploy Java
classes and pack assets together, then restart Minecraft to clear loader caches.
It does not change other gun definitions or the general pack installer.

The factory scope's effective rim is X -1.5, center Y 8.08, clear radius .49.
Its disc is at X -1.511 with radius .48; gun-level PiP settings divide those
values by the rifle model scale 1.15. Attachment-scale scope settings retain
their independent coordinates. Optional optics replace the whole factory scope.

For a disposable Forge presentation check:

```powershell
& 'C:/Program Files/Blender Foundation/Blender 5.2/5.2/python/bin/python.exe' tools/c25/setup_live.py
.\gradlew.bat -I tools/c25/live.gradle runClient --offline
```

This requires the existing build/m240-check/instance, generates instrumented
copies under build/c25-check, and uses its own C25 Presentation world.
See VALIDATION.md for current results. validation/initial preserves the earlier
iron-sight version's evidence; its calibration and captures are historical.

In game, restart, obtain C25, load an existing 5.56x45 STANAG magazine and aim.
The factory scope should be fitted immediately. Fit another sight to check
replacement, then remove it to restore the factory scope. Check the stock hole
and rounded fore-end slots from both sides and during a normal reload.
