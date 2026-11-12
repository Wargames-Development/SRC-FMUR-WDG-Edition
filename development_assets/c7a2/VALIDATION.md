# C7A2 / C79 validation

## Optional default optic revision

The current C7A2 uses `DefaultScope c79`: an empty scope slot supplies C79
virtually, a fitted compatible optic replaces it, and removal restores C79.
This supersedes the earlier empty-slot bare-sight behavior documented below.
The Dragunov now uses the same optional-default behavior for PSO-1 with a
sights-only allow-list. See `docs/DEFAULT_SCOPES.md` for code, regression checks,
current captures and save compatibility. The older C7A2 presentation probe's
forced bare-sight stages assume no default optic; use the dedicated default-scope
probe for current behavior. All model/texture and stock revisions remain intact.

## Stock revision: green M4A1 stock

- Replaced the procedural stock with all 31 actual BFMC M4A1
  `defaultStockModel` parts. Preserved donor geometry and translated it +0.135
  effective Y units to align with the existing C7A2 receiver extension.
- Added a fourth atlas column containing an olive regrade of the donor's shaded
  texture detail. Buttpad and adjustment hardware use the original dark finish.
  Recorded part selection, material groups and transform in
  `model/m4_stock_selection.json`; refreshed the archived M4A1 loaded mesh.
- Updated `tools/build_c7a2.py`, the geometry extraction helper, editable scene,
  native exports, atlas, previews and documentation. Production Java model
  bindings, definitions, sights, attachments, reticle and gameplay are unchanged.
- Export/install and the actual Java-loader check passed. Existing `verify.py`
  passed for installed hashes, loaded geometry, normal/winding consistency and
  occupied opacity. A focused before/after comparison confirmed identical
  non-stock geometry and identical pixels in all three previous atlas columns.
- A fresh isolated Forge run passed with the revised stock, capturing hip,
  blend, C79 ADS, reload, held third person, bare ADS and irons-only views.
  Inspected scoped and bare ADS for new stock intrusion; neither view showed it.
  This remains a scripted presentation check, not normal-input combat testing.

The silhouette is 0.12 effective units longer at the butt; the complete rifle
with factory muzzle measures 29.29 units in length. Existing IDs and saved
attachments remain compatible. Build number stays X206. Normal-input combat,
multiplayer and dedicated-server coverage remain as listed below.

## Follow-up revision: black reticle, M4A1 sights and attachment rails

- Exporter/atlas: changed all opaque C79 reticle marks to black; kept their
  shape, alpha and PiP settings. Imported the pack M4A1 carry-handle rear sight
  and front sight assembly with original donor UV detail. The front assembly
  moves +2 effective X units for the rifle fore-end. Added bottom and side rail
  sections and separated the factory muzzle into `C7A2_muzzle.obj`.
- `ModelC7A2.java`: added the default-barrel group, bottom grip and side gadget
  anchors, moved the muzzle-attachment seat to the flash-hider root, and
  recalibrated bare ADS using the M4A1 aperture and post landmarks.
- Rifle definition: enabled standard optics, grips, gadget/laser and muzzle
  attachment slots. Preserved the rifle/optic IDs, ammunition, stats and reload.
  The optic definition's description now names the black reticle.
- Verification tools: cover black reticle pixels, the new muzzle group, slot
  flags, saved grip/laser/suppressor lookup and actual Java-loaded geometry.
  The live probe equips the existing Vertical Grip, 1MW Laser and Silencer
  together with C79, then removes them to capture the M4A1 irons alone.
- README, donor archives, selection manifests, Blender scene, atlas, exports,
  studio images and validation captures are updated to match this revision.

Revision verification: exporter/install, Java compile through
`checkC7A2Geometry`, Python `verify.py` and the isolated Forge launch all passed.
The seven current screenshots include the black C79 reticle, the combined
grip/laser/suppressor fit, and M4A1 irons after the attachments are removed.
Both measured M4A1 sight landmarks are within 0.002 pixel of center in the
stationary 1600x900 probe frame. The laser spot was visible on nearby terrain/
entities. See `validation/runtime.json`, `checks.json` and `bare_verified.json`.
Build number stayed X206; the launch refreshed the local validation JAR.

Compatibility: existing `c7a2` and `c79` item stacks continue to use the same IDs
and NBT. No gameplay, networking or renderer implementation changed. Existing
C7A2 stacks gain the new attachment options. The carry handle disappears with
an optic and the factory flash hider disappears with a muzzle device.

## Implementer report

- Added `ModelC7A2.java` and `ModelC79.java`: native client model bindings,
  independent magazine/bolt/backup-sight groups, mount/effect sockets, inherited
  AR poses and reload, dedicated bare-ADS calibration and third-person parity.
- Added durable rifle and optic definitions: new IDs `c7a2` and `c79`, existing
  5.56 magazines and sounds, auto/semi modes, and 3.4x C79 PiP settings.
- Added `tools/build_c7a2.py` and `development_assets/c7a2/`: archived donor and
  references, selected donor part list, editable Blender scene, reproducible
  native meshes/atlas/reticle/icons, measured bounds and studio previews.
- Added `tools/c7a2/` and `tools/c7a2_geometry.gradle`: actual Java-loader checks,
  installation/geometry verification and isolated runtime presentation probe.
- Existing workspace modifications were left intact. No common gameplay,
  renderer, networking or persistence source changes were needed.

## Reviewer / fixer report

Scope: new models, definitions, authored assets, installer, actual loader,
resource resolution, first-/third-person bindings and scope presentation.

- **B1, fixed:** first live ADS showed the missing-texture checkerboard because
  the reticle was installed in the inventory texture tree. Corrected the exporter
  and isolated-instance setup to `assets/flansmod/gui/PIP/C79.png`. A fresh live
  launch confirmed the transparent reticle over the real PiP feed.
- **B2, fixed:** initial backup geometry placed a solid bar on the sight line.
  Replaced it with a hollow rear aperture centered on the front post height.
  Measured neutral ADS matrices and applied the existing model-specific bare
  correction, without changing the optic path.
- **B3, fixed:** default idle casing coordinates could expose a casing at the
  model origin. Set its scale and origin using the renderer's actual transform
  order, inside the receiver at zero progress.
- **T1, manual:** normal-input empty/tactical reload, sustained firing, casing
  motion, moving aim/recoil, unusual FOV, multiplayer and dedicated-server launch.

Client-only classes remain under the existing client boundary. The definitions
use established server-owned firing and reload logic. No network fields, IDs,
NBT keys, ammo identities or existing content definitions were changed.
Inherited reload assets are used; a new mechanism-specific animation is not
claimed. Final verdict: **ACCEPTABLE**, with T1 retained as manual regression
coverage rather than a claim of exhaustive gameplay validation.

## Test report

- `gradlew.bat compileJava --offline`: passed.
- `gradlew.bat -I tools/c7a2_geometry.gradle checkC7A2Geometry --offline`: passed.
  The Forge bootstrap emits existing vanilla Ore Dictionary warnings; the
  focused assertions complete successfully.
- Blender 5.2 exporter with `--install`: passed; generated scoped profile,
  three-quarter, opposite-side, underside and bare profile views and a packed editable scene. Blender's
  optional user thumbnail write is denied by the sandbox; the actual scene and
  assets save successfully.
- Blender bundled Python `tools/c7a2/verify.py`: passed. It checks source vs
  Java-loaded triangle positions/UVs, finite geometry, outward authored normals,
  opaque occupied atlas pixels, installed hashes, unique IDs across development
  packs, transparent reticle and crisp 32x32 icons. See `validation/checks.json`.
- Isolated Forge `runClient`: verified model and magazine binding, separate C79
  binding, full PiP ADS, hip, ADS blend, client-driven reload and held third person.
  The reticle is visible and the exterior world remains visible around the optic.
  These are scripted presentation checks, not normal gameplay input tests.
- The final fresh launch includes the compiled bare-sight correction and casing
  anchor. Both bare sight landmarks project within 0.1 pixel of viewport center
  in the measured stationary frame at 1600x900. See `validation/bare_verified.json`
  and the final hip, blend, ADS, reload, third-person, bare and irons-only screenshots.
  `bare_matrices.json` preserves the pre-correction calibration input; the solver
  can be rerun without the ignored build logs.
- The isolated instance also logs unrelated inherited missing-model errors
  (including `ransya.ModelMP7`) and missing `None`/`CorpseSpawner` item textures.
  C7A2/C79 bindings and the C79 reticle load successfully in the final capture.
- No tests/framework dependencies added. Build number remains X206. The live
  launch runs the existing jar/reobf prerequisites and refreshes the local X206
  validation JAR; no release was published or uploaded.

## Manual in-game regression checklist

1. Restart with the new mod classes and matching external development pack.
   Obtain `flansmod:c7a2`, `flansmod:c79` and an existing 30-round 5.56 magazine.
2. Attach C79 in the sights slot. Aim at a detailed target: post tip should be
   centered, its black bars should match the supplied pattern, and the target
   should magnify only through the physical lens. Sweep ADS in and out.
3. Remove C79. Check the M4A1 carry-handle aperture/front post, hip carry, support sleeve,
   firing grip and muzzle flash while firing semi and full-auto at a safe target.
4. Perform empty and tactical reloads with normal controls. Check magazine
   separation/return and both hands throughout the GLTF animation, including
   alternate supported magazine stacks.
5. Check casing ejection while firing and ensure no casing floats while idle.
   Fit a grip and laser on their rails and a suppressor/flash hider on the muzzle.
   Confirm all three can coexist, persist after save/load, and occupy their mounts.
   Remove the muzzle device and confirm the factory flash hider returns.
6. Check held third person from the side, dropped and item-frame views, and
   another player's view on a dedicated server. Confirm save/reload of a fitted
   C79 and loaded magazine. Test alternate FOV, recoil and shader/Angelica paths.

Remaining risks: inherited pose/reload contact across every animation frame,
normal-input combat, moving aim, broad FOV and shader variants have not been
exhaustively tested. New item IDs require the matching pack on both sides.
