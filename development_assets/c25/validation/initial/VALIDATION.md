# C25 validation and handoff

## Implementer report

- Added `ModelC25.java` and `ModelC25Scope.java` for native client model
  loading, separate magazine/bolt/sights/muzzle groups, existing AR hand and
  reload poses, mount/effect points and bare-only sight calibration.
- Added `tools/build_c25.py`, procedural source and dedicated installer;
  `development_assets/c25/` retains the reference, donor archive, definitions,
  attribution, editable Blender scene, exports, diffuse atlas, pixel icons,
  crosshair, renders and evidence. Added only the two C25 English labels.
- Added `tools/c25_geometry.gradle` and `tools/c25/` for loader checks, Python
  verification, isolated client preparation, presentation probe and calibration.
- Uses the existing C7A2 export helpers and M16-family balance/reload. The new
  optic has 4x game magnification; actual optic model/spec and reticle were not
  supplied. The sling is omitted. Existing gameplay and saved IDs are preserved.

## Reviewer and fixer report

Read-only review covered the new source, definitions, loaded geometry, studio
views and first Forge run. Existing workspace edits were left intact.

- **B1, fixed — names:** first-run hip capture exposed `item.c25.name`.
  The two English entries now install by merging into the existing language
  file. The final hip screenshot displays C25 correctly.
- **B2, fixed — bare ADS:** first-run rear aperture and front post were below
  center. `ModelC25.java` now applies the correction solved from the actual
  stationary first-person matrices, only on the established bare-sight path.
- **B3, fixed — effect origin:** the copied pose's nominal flash vector did
  not account for the renderer's flashScale-before-translation order. C25 now
  uses the scaled muzzle root plus a separate factory-tip offset. The Java
  geometry check asserts the effective root (15.6, 5.29, 0) and tip X 18.9.
- **S1, fixed — studio framing:** the first preview cropped the scope.
  Studio framing now includes the whole assembly. The turned windage turret
  uses a rotation with positive determinant to preserve outward winding.
- **T1, open manual coverage:** normal-input firing, empty/tactical reload,
  every hand contact and attachment combination, saved-world reload, dropped
  items, dedicated-server launch, multiplayer and unusual FOV/shaders remain
  untested. No new test framework was introduced.

Final review: **ACCEPTABLE WITH MINOR ISSUES**, with T1 as the explicit manual
backlog. No common/server code, protocol, registry ordering, existing ammo,
existing weapon definition or save format changed. Client-only model loading
uses the established content-pack boundary. No gameplay authority moved.

## Test and verification report

Commands actually run successfully:

- Blender 5.2 `-b --factory-startup --python-exit-code 1 --python
  tools/build_c25.py -- --install`: generated and installed final assets.
- `gradlew.bat compileJava -I tools/c25_geometry.gradle checkC25Geometry
  --offline`: compiled Java and checked actual loaded meshes, UV validity,
  handedness, attachment root and scaled flash/tracer origins.
- Blender's bundled Python `tools/c25/verify.py`: passed source/Java triangle
  comparison, winding/normal checks, occupied opacity, installed asset hashes,
  unique ShortNames, icons, transparent black crosshair, slot flags and
  factory-muzzle separation. Language verification checks the merged entries.
- Bundled Python `tools/c25/setup_live.py`, followed by `gradlew.bat -I
  tools/c25/live.gradle runClient --offline`: two successful isolated Forge
  runs, including a fresh run after calibration and final asset installation.

The final presentation probe asserted C25 model, 5.56 ammo, 4x PiP binding,
enabled slots, attachment compatibility and saved-NBT lookup for C25 Scope +
Vertical Grip + 1MW Laser + Silencer together. It captured hip, ADS blend,
full PiP ADS, client-driven reload, held third person, bare ADS with devices
and irons-only after removing the devices, then exited successfully.
The PiP image shows real magnified scenery through the transparent crosshair.
These are scripted presentation checks, not normal-input gameplay tests.

At 1600x900, final measured rear aperture and front post error is below .001
pixels per axis. `validation/bare_matrices.json` retains the original solver
input; `bare_alignment.json` stores the solution; `final_alignment.json`
stores fresh-run matrices and measured pixel errors. This is stationary frame
evidence; sway, recoil and other FOVs are not covered by that precision claim.

`validation/` retains seven real Minecraft screenshots, final compilation,
export and launch logs, geometry/hash results and alignment evidence. Studio
renders live separately in `model/`. The fixture logs include pre-existing
other-pack warnings; C25 assertions and both Gradle launches passed.

The initial sandboxed wrapper attempt could not acquire the user's Gradle
cache lock. The permitted run using that cache succeeded. Launch prerequisites
refreshed the local X206 validation JAR; the build number remained 206.
Nothing was committed, pushed, published or uploaded.

## Manual in-game checklist

1. Restart the matching development client. Find C25 and C25 Scope [4x] in
   creative inventory. Confirm their names/icons and load an existing STANAG
   magazine; expected capacity and compatibility match that magazine.
2. Aim bare, then fit the scope in sights. Check front-post alignment bare,
   clear PiP feed/crosshair scoped, and the ADS transition while moving.
3. Fire auto and semi with ordinary and tracer magazines; check damage/ammo
   on the server and casing/flash/tracer origins visually.
4. Perform empty and tactical reload with normal controls. Inspect magazine
   exchange, charging motion and both hands throughout the animation.
5. Fit/remove a grip, laser and muzzle device. Confirm mount contact and that
   default sights/muzzle do not stack with replacements. Check held/dropped
   views and reload the saved item/world.
6. Repeat firing/reload/attachment tests with a second player and a matching
   dedicated server; verify authoritative ammo/damage and remote appearance.
