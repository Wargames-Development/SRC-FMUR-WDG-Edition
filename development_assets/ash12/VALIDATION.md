# ASH-12 replacement validation — 2026-11-17

The original replacement report below is historical. The latest revision is
the bolt/sight follow-up at the end of this document; it supersedes the original
348-part and unchanged-texture descriptions. Current studio renders and the
packed scene include that follow-up.

## Implementer report

- Replaced the existing `ModelASH12.java` with native TMT geometry from the
  supplied archive. All 348 shape boxes and the original texture are retained.
- Updated only presentation values in the existing ASH-12 development-pack
  definition: scale, third-person model/scale and third-person skin.
- Preserved the original archive, prior assets, converted outputs, packed
  editable Blender scene, source-part manifest, installer and focused checks.
- `ash12`, ammo, stats, sounds, icon, reload timings/clip, allowed attachments,
  registry entries and saved-data formats are unchanged.

## Reviewer and fixer reports

Two bounded review/fix passes were performed sequentially in this session.

- **B1 — supplied magazine detached:** the source left the magazine below the
  receiver and in the body group. All 55 pieces, including feed lips and ribs,
  now move together into the magwell by -6 raw source Y and use `ammoModel`.
  This is a rigid fit correction, not a deformation of the supplied geometry.
- **B2 — inherited ADS fit:** the first live frame hid the front blade behind
  the rear sight. The existing bare-only correction aligns the actual rear
  aperture center and front blade tip. A new live frame verifies the result.
- **B3 — muzzle effects:** the flash base is the muzzle-device seat; the
  factory-only offset reaches the imported brake's actual tip, X 13.05 in
  effective pack units. Java asserts this anchor. Attached devices retain their
  existing offset path. Normal-input firing remains a manual check.
- **B4 — low Reflex ADS hold:** the second live capture showed its dot above
  the clear window. The model's existing scoped-only `gunOffset` is now 1.1;
  the final live frame places the aiming dot inside the window. No shared
  renderer or scope definition was changed.
- Dedicated-server/common code, packets, persistence and registration were
  untouched. The definition comparison permits only four presentation keys.

Final verdict: **ACCEPTABLE**, with the manual coverage limits below.

## Test report

Passed:

```text
gradlew.bat compileJava --offline
gradlew.bat compileJava -I tools/ash12_geometry.gradle checkASH12Geometry --offline
Blender bundled Python tools/ash12/verify.py
Blender --background --factory-startup --python-exit-code 1 --python tools/ash12/render.py
gradlew.bat compileJava -I tools/ash12_geometry.gradle -I tools/ash12/live.gradle checkASH12Geometry runClient --offline
git diff --check -- src/main/java/com/flansmod/client/model/BFMCpack/ModelASH12.java
```

- Native Java-loaded corner positions match the source plus documented rigid
  transforms within 0.000001 effective units. All UVs are finite and inside
  0–1. All 348 source parts have exactly one mapping. Installed assets match
  durable outputs, and there is exactly one `ShortName ash12` gun definition.
- Effective fitted dimensions: 25.686 × 12.78 × 1.98 pack units, including
  magazine and factory sights/muzzle. The tall magazine silhouette is supplied
  source geometry; it was seated without reshaping it.
- The final 1600×900 stationary live frame projects both measured iron-sight
  landmarks within 0.0002 pixels of screen center. This is one neutral frame,
  not a claim of that precision during sway/recoil or at other FOVs.
- Live binding assertions pass for the existing `ash12` and `127x5520rdmag`.
  Captures show hip, bare ADS, client-driven reload, held third-person and
  attached Reflex ADS. The final Reflex frame has the original dot in its
  clear window and the factory handle/sights swapped out.
- `validation/live.log`, `ASH12.mesh`, `final_alignment.json` and the final
  `ash12-*.png` files record the latest run. Studio renders are explicitly
  separate from genuine Forge screenshots. `initial/` and `second/` retain
  prior fit evidence. The packed scene uses the final seated geometry.

The first sandboxed Gradle call failed on its external cache lock. Approved
cache-backed runs succeeded. Existing pack logs contain unrelated missing
assets/definition warnings. The Blender scene and all renders saved; its
optional external thumbnail-cache write was denied. Live launch prerequisites
refreshed the local X210 JAR via the existing jar/reobf tasks. Build number
remained 210. Nothing was committed, pushed, released or uploaded.

## Remaining manual coverage

Normal-input firing, tactical/empty reload end-to-end, every hand contact,
all grip/gadget/muzzle combinations, tracer origin during firing, dropped and
item-frame views, existing saved-item reload, multiplayer, dedicated-server
launch, unusual FOV and shader variants were not exhaustively exercised.
Use the checklist in README.md. No automated claim covers these scenarios.

## Follow-up: bolt travel, rounded rear sight and white indicators

Implemented the user's three requested refinements through the existing
generator and `ModelASH12.java`, then regenerated the model/atlas, manifest,
editable scene and development-pack assets. No gameplay values or shared
render/animation code changed.

- Firing bolt travel changes from 2.5 to .15, consistent with the pack's AK74M
  and FAMAS. The render path translates in model render units, so this is
  2.4 raw geometry pixels instead of 40 (94% shorter). The focused Java check
  asserts that maximum stroke; the live probe also captures a held-open state.
- Six square rear aperture/shoulder pieces are replaced with a 16-segment
  round ring, preserving its aiming center and support. Inner/outer radii are
  .30/1.0 raw units. Three shallow white marks face the camera: two on the
  rear ring, one on the front post. Current total: 361 parts, including 70
  `defaultScopeModel` parts. Factory sight replacement behavior is preserved.
- Review found **B5**: the first new ring mapped to transparent source pixels
  and vanished in Minecraft despite its studio appearance. Fixed with an
  opaque dark tile, and added loaded-UV opacity checks for every new part.
  White marks use a separate opaque white tile. All donor pixels outside the
  two unused 8x8 tiles remain exactly unchanged. Existing unmodified source
  geometry still matches within 0.000001 effective units.

Validation commands: the same combined `compileJava`, `checkASH12Geometry`,
and disposable `runClient` command above; `tools/ash12/verify.py`; Blender
`tools/ash12/render.py`; and the model's `git diff --check`.
Latest screenshots/logs and loaded geometry are under `validation/sights/`.
All listed follow-up checks passed, including the final fresh Forge run after
B5. Visual review confirms the round aperture and all three white indicators.
The unchanged sight centers still project within 0.0002 pixels of center in
the measured stationary frame. Review verdict: ACCEPTABLE. The local validation
JAR was refreshed by launch prerequisites; build number remained 210.
The probe drives presentation states, not normal-input combat. Shared reload
clip/timing, ammo, identity and save compatibility remain unchanged. Manual
firing/reload feel and broader compatibility coverage still need the checklist.

## Follow-up: straight rear-sight base and inward marks

The user's screenshot identified the ring's point contact with the pedestal.
The lower outer contour now has straight sides and a flat bottom at source
Y -19, spanning Z 0–2. It joins the existing pedestal across its full width;
the circular aperture, rounded crown and calibrated aiming center are retained.
The two rear white marks move from Z .15/1.85 to .56/1.44, beside the inner
opening. No extra parts, texture changes, bolt changes or gameplay changes.

Changed the local generator and regenerated both Java copies, part manifest,
packed scene and previews. Extended the focused verifier to check the lower
contour, full-width bottom contact and the inward marker positions/clearance.
The same compile, native geometry, asset and disposable live presentation
checks are used. Evidence for this revision is in `validation/straight-base/`.
Compilation, native geometry/UV checks, the asset verifier, Blender regeneration,
diff whitespace checks and the fresh Forge presentation run all passed. Hip
and ADS screenshots confirm the flat connection and inward marks. Launch
prerequisites refreshed the local validation JAR; build number remained 210.
Review found no additional issue in this bounded change. Normal-input combat,
multiplayer and other manual coverage limits above still apply.

## Latest reference: original square sight with circular hole

The latest user photo supersedes the rounded outer housing. Restored the two
original outer shoulder pieces (source elements 207 and 208). Replaced only
the four square-opening pieces (209–212) with a rectangular plate matching
their original envelope and thickness: X -7..-6.75, Y -20.5..-19, Z .5..1.5.
Its hole remains circular, radius .30 at the unchanged center. The segmentation
includes the rectangular corners explicitly. Rear white marks remain inward,
with their backing plane fitted to the restored plate and width reduced to
.10 to keep them entirely on the face. Front paint and bolt stroke unchanged.

Current total is 363 parts: 344 retained source parts, 16 plate segments and
three white indicators; factory sights use 72 parts. The generator, both Java
copies, manifest, verifier, native group assertion, editable scene and previews
were updated. Existing shoulder geometry is covered by the source-preservation
check. The plate envelope, round opening and paint opacity have focused checks.
The initial envelope check caught missing lower corner vertices; adding the
exact corner angles corrected the outline before final validation.

Fresh evidence is under `validation/square-plate/`. Use the latest section and
README.md for current geometry; preceding sections describe earlier iterations.
Compilation, native geometry/UV checks, the asset verifier, Blender generation,
diff checks and a fresh Forge presentation run all passed. Visual review of
the final ADS frame confirms the original square shoulders surrounding the
circular hole, with the white indicators inward. Build number remained 210;
launch prerequisites refreshed the local validation JAR. Normal-input combat
and multiplayer remain manual coverage. Final review verdict: ACCEPTABLE.
No aim-center, gameplay, identity, ammo, persistence or shared-renderer changes.

## Latest fit correction: magazine, foregrip and sight mounts

User screenshots showed an exposed magazine top and attachment bases embedded
in their rails. Diagnosis used the actual loaded gun, VerticalGrip, HOLO and
Reflex geometry and the production attachment transform. The local generator
now moves the complete magazine assembly -1.5 source X and -7.5 source Y
(previously 0,-6), seating its neck rearward and deeper without deformation.
Its front edge clears the magwell front by .072 effective units; the top round
is above the receiver underside. Lower stacked rounds remain inside the shell.

The grip socket Y changes from 8.5/16 to 7.277778/16. With the existing .36 gun
and .1 VerticalGrip scales, its top deck now meets the underside rail at Y 2.52.
The scope socket Y changes from 15/16 to 16.1/16, putting HOLO/Reflex main base
undersides on the upper teeth at Y 5.796. Their side jaws still extend below
the rail top as designed. The scoped-only hold offset changes from 1.1 to .704
to compensate for the .396 effective-unit mount rise; bare ADS, sight shape,
white marks, bolt stroke and gameplay remain unchanged.

Updated generator/native model copies, geometry/asset checks, probe, preview
renderer, packed scene and documentation. Native checks dump actual attachment
meshes plus model socket coordinates; the verifier checks rail contact, scope
hold compensation, magazine-neck clearance, top-round coverage and unchanged
source geometry outside the documented rigid transform. The preview renderer
uses those actual meshes and textures and hides swapped factory sights. The
live probe now combines HOLO and VerticalGrip, with separate ADS and hip frames,
reload and third-person, followed by Reflex ADS. No production render hooks
or shared animation clip changed. Evidence belongs in `validation/mount-fit/`.

Other attachment variants, normal-input reload/firing feel, unusual FOV,
multiplayer and dedicated-server launches remain manual regression coverage.

For this fit correction, compilation, native geometry checks, the updated
asset/contact verifier, Blender previews/packed scene, diff checks and the
fresh combined Forge presentation run passed. HOLO ADS, separate combined hip,
reload and Reflex ADS frames were visually reviewed alongside profile and
underside mounted previews. The local validation JAR was refreshed by launch
prerequisites; build number remained 210. Review verdict: ACCEPTABLE within
the tested device combination and stated coverage limits.

## Latest correction: optics on the carry-handle rail

The user clarified that optics belong on the higher rail above the carry
handle, not the receiver rail. Moved the scope socket to (7,20.3,0)/16,
putting standard optic base undersides at effective Y 7.308. Both the native
contact test and mounted preview use the carry rail's actual loaded teeth.
The scoped-only hold offset becomes -.808, preserving the previously checked
optic aiming height (socket Y plus hold offset remains 6.5 effective units).
The bare iron-sight correction, grip and magazine fit remain unchanged.

The model now shares `defaultScopeModel` with the existing renderer's
mutually exclusive `attachmentScopeModel` path. The alias is assigned after
translation/flip so geometry is transformed once. Thus the original handle,
upper rail and irons remain present with or without optics, without changing
the shared renderer or duplicating the geometry. Native/live assertions check
the binding; mounted studio renders retain the same assembly too.

Updated the generator/native model copies, verifier, native checker, live
probe, preview renderer, packed scene and notes. Current evidence is under
`validation/upper-rail/`. Previous receiver-rail descriptions are historical.
No identity, gameplay, ammo, save-format or networking changes. Other devices,
normal-input combat and multiplayer remain manual coverage as above.

For the upper-rail revision, compilation, native geometry/contact/alias checks,
asset verification, Blender regeneration, diff checks and a fresh Forge run
passed. The mounted profile shows the optic on the higher rail with the handle
retained; HOLO and Reflex ADS frames keep their reticles clear above the front
iron. Final review verdict: ACCEPTABLE. Build number remained 210; launch
prerequisites refreshed the local validation JAR. Other scope models and
multiplayer were not exhaustively tested.
