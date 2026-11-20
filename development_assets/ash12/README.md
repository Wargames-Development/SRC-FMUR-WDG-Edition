# Existing ASH-12 model replacement

The user requested replacement of the existing `ash12`, using their textured
Toolbox archive. No additional gun, ammo, registry entry or gameplay system was
created. The v12 modeling package was workflow/reference guidance; its examples
of new guns, new optics and handoff boards did not expand this request.

## Files and provenance

- `original/ASH12.mtb`: exact user-supplied `ASH-12 textured (1).mtb`.
  SHA-256: `19b3249c8773ebc796e10b420affd34647f31235c14042844fac5ef8a83196b5`.
  The source author/license fields were empty; no attribution was invented.
- `original/ModelASH12.java`, `ASH12.png`, `RU_AR_ASH-12.txt`: previous model,
  texture and development-pack definition, archived before replacement.
- `model/`: reproducible native Java, supplied 512x512 texture with a white-paint tile,
  replacement definition, and source-to-animation-group manifest.
- `ASH12.blend`: editable scene built from actual Java-loaded geometry with
  the texture packed. `validation/` contains studio renders and live evidence;
  `initial/` retains the evidence before the magazine/sight corrections.
- `../../tools/build_ash12.py`: converter/installer for this replacement only.
  `../../tools/ash12/` and `../../tools/ash12_geometry.gradle`: focused checks,
  live probe, sight solver and preview renderer. Production renderers are untouched.

## Fit and compatibility

The current revision retains 344 supplied shape boxes and replaces four square
aperture pieces with a rectangular plate around a 16-segment circular opening,
plus three white indicators (363 total). Original outer shoulders are restored.
The other supplied dimensions, corner offsets and UVs are preserved.
MTB axis-major corner offsets use the existing armor importer's decoding.
The whole model translates `(4, -1.5, -1)` before native `flipAll()`.
The source's detached magazine assembly (element indices 293–347) moves -1.5
source X and -7.5 source Y into the magwell and becomes `ammoModel` (55 parts). Source
groups 1, 2 and 6 become factory muzzle (29), carry handle/front sight (now 72)
and slide (10). Static body has 197 parts. The carry handle and irons remain
visible with an optic fitted; only the factory muzzle swaps out. The existing
attached-scope group shares the transformed carry assembly, without a second
geometry copy or a shared renderer change.

The rear aperture keeps the previous aiming center and .30 raw-unit inner
radius. The plate restores the original envelope (source Y -20.5..-19,
Z .5..1.5, X -7..-6.75), surrounded by the original source shoulders and
supported by the original pedestal. Its outside is square, with a circular
hole inside, matching the user's latest photo. Rear white
marks sit beside the inner opening, at source Z .56 and 1.44, rather than near
the outside edge. Front-blade paint is unchanged. Two unused atlas tiles supply opaque dark steel
([500:508,488:496]) and white ([500:508,500:508]); donor pixels outside them
are unchanged. The firing bolt stroke is
now `gunSlideDistance=.15`, matching nearby BFMC rifles: 2.4 raw geometry pixels
(0.864 effective pack units) at maximum animation, down from 40 raw pixels.
The shared bullpup reload clip and timing are unchanged.

First- and third-person bindings use `BFMCpack.ASH12`, skin `ASH12`, scale .36.
The effective fitted bounds are in `geometry_validation.json`. The source's
.29 editor scale is not an installed gun definition: .36 fits the replacement
to the old rifle's approximate overall pack length. Native coordinates remain
editable. Socket positions and muzzle flash follow the fitted geometry.

The current sight socket is (7,20.3,0)/16 and grip socket is
(20,7.277778,0)/16 before definition scale. These seat standard sight base
undersides at the higher carry-handle rail Y 7.308 and the VerticalGrip deck at
the underside rail Y 2.52, in effective pack units. The scoped-only Y hold
offset is -.808, compensating for the higher sight mount; bare ADS is untouched.
The native checker also loads HOLO, Reflex and VerticalGrip geometry. Current
studio views ending in `-mounted` show actual HOLO/VerticalGrip combinations,
with the carry handle/irons retained as in the game. The editable scene includes these
devices hidden by default; their textures are packed too.

The rear aperture center is source `(-6.875, -20, 1)` and front blade tip is
`(25.375, -20, 1)`. Their effective positions are `(-1.035, 7.74, 0)` and
`(10.575, 7.74, 0)`. The per-model bare ADS correction was solved using the
actual first live run's matrices; it does not affect an attached optic.
`validation/bare_matrices.json` preserves that input rather than a corrected frame.

Only four presentation definition keys change: `ModelScale`, `3rdModel`,
`3rdModelScale`, `3rdTexture`. `ash12`, ammunition IDs, damage, timing, sounds,
attachment permissions, reload animation and inventory icon remain unchanged.
No packet/NBT/save format changes, common-side changes, commits or deployment
to an external game installation. The editable source archive is preserved.

The active development pack under `eclipse/` is Git-ignored. Keep this durable
asset directory and rerun the installer to restore its texture and definition;
updating only the Java class in another installation is insufficient.

## Reproduce

From the repository root, with Blender 5.2's bundled Python:

```powershell
$ashPython = 'C:/Program Files/Blender Foundation/Blender 5.2/5.2/python/bin/python.exe'
& $ashPython tools/build_ash12.py --install
.\gradlew.bat compileJava -I tools/ash12_geometry.gradle checkASH12Geometry --offline
& $ashPython tools/ash12/verify.py
& 'C:/Program Files/Blender Foundation/Blender 5.2/blender.exe' -b --factory-startup --python-exit-code 1 --python tools/ash12/render.py
```

Optional live probe (requires the existing disposable `build/m240-check/instance`):

```powershell
& $ashPython tools/ash12/setup_live.py
.\gradlew.bat -I tools/ash12/live.gradle runClient --offline
```

This instruments Java copies under `build/`, uses a dedicated `ASH12 Presentation`
creative world, verifies the existing gun/ammo binding, captures hip, bare ADS,
client-driven reload, third-person and Reflex ADS, then exits. Launch prerequisites
may refresh the local validation JAR through existing `jar`/`reobf` tasks.
This is presentation evidence, not normal-input combat testing.

## Manual regression checklist

Restart the matching client to clear model/texture caches. Equip an existing
ASH-12 and a fresh one: both must show this replacement, with no duplicate gun.
Check hip/ADS, firing, tactical/empty reload and the magazine seating/return.
Fit/remove a Reflex, grip, gadget and muzzle device; check swaps, clearances and
flash/tracer origin. Check dropped/item-frame views, saved attachments and another
player's held view. Normal-input firing/reload, all hand contacts, multiplayer,
dedicated-server startup, unusual FOV and shader variants remain manual checks.
