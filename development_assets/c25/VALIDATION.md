# Reviewed inventory icon restoration

The model exporter incorrectly regenerated its retired placeholder icons and
reset the Icon fields, overwriting the reviewed presentation added afterward.
Restored the canonical pixel_c25.png (and the catalog-owned VMR icon) from
development_assets/item_presentation/icons. Updated the durable definitions
to Icon pixel_c25 / pixel_c25scope and restored both canonical and legacy
texture paths in the development pack and disposable test instance.

tools/build_c25.py now copies the reviewed catalog artwork instead of drawing
placeholder sprites. Both its model outputs and install paths use that artwork.
tools/c25/verify.py now compares the source, generated and installed icon hashes
and checks both source/runtime Icon bindings against the presentation catalog.
The icon-generation function was actually executed in Blender; the complete
Python asset verification and git diff --check passed afterward. No Java or
model geometry changed for this correction, so no compilation/client launch
was needed. Restart the client to refresh cached textures as the manual check.
No commits, pushes or publishing. The previous modeling reports follow.

---

# Bottom rail correction — November 26

B1, fixed: the old rail teeth ended at Y 4.10, below the refitted SPEAR
underside/lips at about Y 4.337. The missing mounting web left a visible gap.

Changed tools/build_c25.py to add a continuous steel rail web from X 7.5 to
10.55, Y 4.10 to 4.36, Z +/- .40. It joins the teeth to the handguard's lower
lips. The grip attachment plane and all existing gameplay/optic settings stay
unchanged. Regenerated/installed the body OBJ, packed scene and studio views.
Added three web-occupancy regression samples in tools/c25/verify.py.

Blender exporter/install, gradlew.bat -I tools/c25_geometry.gradle
checkC25Geometry --offline (including compileJava prerequisites) and bundled
Python tools/c25/verify.py all passed. The opposite-side studio render was
inspected and shows the rail connected. Verdict: ACCEPTABLE for this bounded
geometry fix. Evidence is in validation/nov26-rail/. No new live client run
was performed for this small correction. Restart the client, inspect the
underside and fit a grip as the remaining in-game check. No IDs, mounts,
network/save formats or gameplay behavior changed; no commit/push was made.

---

# November 26 — SPEAR handguard and VMR housing revision

## Implementer report

Requested scope: improve the C25 handguard using MCX SPEAR, M4A1 and HK416
pack references, and rebuild the VMR housing/mount from the supplied photos.

Files changed and why:
- tools/build_c25.py: replaced the authored flat fore-end with selected actual
  Java-loaded BFMC MCX SPEAR fore-end parts. Refit its native angled vents,
  forward slot rows, facets and underside to the existing C25 interfaces.
  Added collar fasteners and rebuilt the optic as stepped ocular/main tube/
  objective, round turret drums, curved rings, zoom band, ring-top rails,
  clamp bolts and an open shaped cantilever bridge.
- tools/c25/C25GeometryCheck.java: added the actual HK416 to donor extraction
  for comparison with M4A1 and MCX. This task changed no production Java.
- tools/c25/verify.py: updated vent samples for the SPEAR geometry and added
  projected clear-bore rays and ocular/objective proportion checks.
- development_assets/c25/README.md: documents the final construction,
  handguard selection/transforms and current 1x/6x settings.
- development_assets/c25/model/: regenerated body, fitted/standalone optic,
  packed editable Blender scene, measurements and five studio renders;
  added handguard_selection.json. Other exported groups, atlas, icons and
  reticle were regenerated deterministically and remain unchanged in Git.
- references/VMR-housing-1.png through -3.png: archived the user references.
  Their authorship/license was not supplied; they are not projected textures.
- This report and validation/nov26/: current results, live/baseline captures,
  reference renders and logs. validation/nov26-before preserves prior studio
  views and bounds. Earlier reports below are historical.

Donor selection: MCX gunModel 412-507, 522-728 and 807-811. First undo its
1.15 dump scale and apply configured .1 model scale. Effective source X
[6.7,16.7] maps to C25 [5.04,13.35], Y [4,6.45] maps to [4.08,6.18], and Z
scales by 1.04. Retain original donor UVs in the existing right atlas column.
Exclude the source rail teeth, irons, barrel and gas block. Keep the C25 rail,
barrel and accessory anchors. These part IDs are specific to this archive.
The retained MCX archive/pack provenance remains TV90/BFMC, with no supplied
individual donor license or named model creator.

Stock, receiver, grip/magazine/bolt, gameplay stats/ammo/reload, saved item IDs,
reticle, 1x/6x endpoint behavior, lens-disc location/radius and scope swaps
remain unchanged. The rear housing is wider while the clear opening remains
.49 radius; therefore the visible rim is thicker in ADS. Flip caps were not
added, leaving the lens open as in the first supplied scope photograph.

## Reviewer / fixer report

B1 — fixed: first-pass mount upright tops entered the clear bore. Their
seats now terminate below the clear aperture; turret bases sit outside the
main tube's exterior. Center and perimeter-ray projection tests now pass.
The visual review also reduced the mount's continuous lower bulk to the
open bridge and separate clamps seen in the photos.

B2 — observed existing presentation issue: horizontal sky bands appeared in
PiP during the new-model run. A second launch used only the previous committed
C25_scope.obj and C25Scope.obj in the disposable fixture, keeping the same
current definitions/reticle/renderer. It reproduced the same sky bands.
This isolates the issue from the new optic geometry; no shared rendering
code was changed to conceal it. The latest asset set was restored afterward.
Baseline captures and log are saved alongside new-model evidence.

T1 — manual backlog retained: ordinary physical zoom-key input, normal-input
firing and empty/tactical reload, every hand contact/device combination,
saved-world reload, dropped/item-frame views, dedicated-server/multiplayer
and unusual FOV/shader/Angelica configurations remain untested here.

Verdict: ACCEPTABLE WITH MINOR ISSUES (B2 existing PiP presentation and T1).
No common/server source, network protocol, registry IDs, NBT format, gameplay
authority or existing pack definitions changed. Existing workspace edits in
other models and shared rendering/gameplay classes were preserved.

## Test / verification report

Commands actually run successfully:
- Blender 5.2 -b --factory-startup --python-exit-code 1 --python
  tools/build_c25.py -- --install, including the final bore-clearance fix.
- gradlew.bat -I tools/c25_geometry.gradle checkC25Geometry --offline.
  This includes compileJava and the focused checker compilation prerequisites.
- Blender bundled Python tools/c25/verify.py, including the final run after
  restoring the disposable instance to the new model.
- Bundled Python tools/c25/setup_live.py, then gradlew.bat -I
  tools/c25/live.gradle runClient --offline (new model).
- A second identical runClient invocation for the old-model sky-band comparison.
- git diff --check on the changed source and README.

Focused checks passed for actual Java-loaded versus exported geometry,
normal/winding consistency, occupied UVs/opacity, installed hashes, unique IDs,
reticle/icon checks, stock opening, new handguard vent samples, clear optic
bore, larger-ocular/smaller-objective proportions, fitted/standalone optic
placement, factory-muzzle separation and effective flash/tracer origins.
Both live launches finished BUILD SUCCESSFUL. The new-model run passed fresh
factory-scope selection, 1x/6x getter checks for factory and attachment scopes,
model/ammo/combined-device compatibility and saved attachment lookup. It
captured hip, ADS blend, both zoom endpoints, scripted reload, held third
person and factory restoration after removal of the optional scope/devices.
Hip, reload, studio opposite/underside and PiP captures were visually reviewed.
The scripted run does not establish normal-input gameplay acceptance.

New model evidence is in validation/nov26/; baseline-* files show the older
optic comparison and should not be mistaken for the final housing. Raw scene
slimes remain visible in some captures. The test runs refreshed the local
validation JAR at build number 246; gradle.properties stayed at 246.
Nothing was committed, pushed, published or uploaded.

## In-game regression steps

Restart the matching development client to clear cached meshes. Obtain C25
and inspect the SPEAR-style fore-end and VMR from hip, reload and held views.
Aim with its factory scope and use Switch Scope Magnification (default Z)
for 1x/6x. Fit another optic and remove it to confirm the factory scope swaps
back. Check grip/laser/muzzle fit and normal empty/tactical reload/firing.
Repeat on matching multiplayer/dedicated-server packs when available.

---

Earlier reports below describe previous versions and historical test runs.

# Colt Optics VMR [1-6x] reticle and zoom update

## Implementer report

- tools/build_c25.py: replaced the plain crosshair with a 1024x1024
  transparent black reticle traced from references/VMR-reticle.png. It has
  thick top/side posts, the short bottom post, fine central crosshair and
  alternating major/minor hashes. The model rim supplies the circular lens
  boundary; the reference white background is transparent in the game texture.
- definitions/attachments/SCOPE_C25.txt and the two-entry English language
  fragment: renamed the attachment to Colt Optics VMR [1-6x]. Its internal
  c25scope ID, model, icon and texture paths remain unchanged.
- definitions/guns/CA_AR_C25.txt and the attachment definition both use
  Magnification 1.0 and Magnification2 6.0. The built-in scope remains fitted
  by default, and the separate attachment uses the same reticle/zoom settings.
- tools/c25/verify.py checks the new texture, thick-post/hash landmarks,
  display name and both endpoint declarations. C25Probe.java asserts actual
  low/high getZoomFactor() results and captures both endpoints for both scopes.
- README.md documents the control and two-position limitation; regenerated
  exports/packed scene/installed assets and archived the supplied reference.

## Review, fix and test report

Review verdict: ACCEPTABLE. The existing scope selector is binary and uses
Switch Scope Magnification (default Z). This update provides 1x and 6x
positions; it does not introduce continuous intermediate magnifications.
The reticle stays the same angular screen size through the existing renderer.
No production Java, shared renderer, gameplay stats, ammo, packet or saved
item IDs changed. Reticle reference authorship/license was not supplied.

Successfully ran Blender 5.2 tools/build_c25.py -- --install, bundled Python
 tools/c25/verify.py, bundled Python tools/c25/setup_live.py and
 gradlew.bat -I tools/c25/live.gradle runClient --offline.
The launch included its compileJava/probe compilation prerequisites and
finished BUILD SUCCESSFUL. The Python checks passed against the actual
Java-loaded geometry from the furniture validation as well as the newly
installed texture, definitions and language entries.

The Forge probe asserted 1x with switchedFOV=false and 6x with
switchedFOV=true for both the gun-level factory scope and attachment.
Screenshots were visually reviewed at all four combinations. The live
magnified feed is visible under the reticle at both endpoints, and fitting
then removing the attachment restores the factory scope. These are scripted
selection checks; pressing the user's physical Z key is a manual check.

Evidence: validation/vmr-1-6/ contains the four current captures, export and
launch logs and asset-check manifest. The local validation JAR was refreshed;
build number remained 206. Nothing was committed, pushed or published.

In game: restart to clear texture/definition caches, aim the C25 (or fit the
Colt Optics VMR attachment), then use Switch Scope Magnification, default Z,
to toggle 1x/6x. Confirm both zooms, the reticle and the displayed scope name.
Normal-input firing/reload, multiplayer and shader variants remain manual.

---

The following report records the earlier furniture/factory-scope revision,
before this reticle/zoom update. Its 4x references are historical.

# C25 furniture revision and factory scope

## Implementer report

Scope: replace the plain stock and ladder-like handguard using the user's
new reference, remove irons, and provide the tan scope by default.

Files changed:
- tools/build_c25.py: selected actual MCX stock geometry, fitted/recolored it,
  authored its hollow lower frame, rebuilt the chamfered slotted handguard,
  shortened the side rail, generated the fitted factory scope export and a
  native-resolution stock atlas. C25 now owns its UV column mapping, keeping
  it independent of concurrent revisions to the C7A2 helper's atlas layout.
- ModelC25.java: defaultScopeModel loads C25_scope instead of C25_irons;
  removed the obsolete bare-iron offset/pitch/yaw. Other poses/mounts remain.
- definitions/guns/CA_AR_C25.txt: added gun-level 4x PiP with auto depth,
  black crosshair and 1x peripheral FOV. Updated the description.
- tools/c25/C25GeometryCheck.java: extracts the M4, MCX and Honey Badger
  donors including stock groups for actual-model comparison.
- tools/c25/verify.py: maps the factory scope group, samples atlas opacity
  at its current dimensions, checks the open stock/rounded handguard holes,
  factory PiP fields and fitted versus standalone optic geometry.
- tools/c25/C25Probe.java: asserts fresh items use the gun-level scope with
  no scope attachment. Captures factory-scope and factory-only views after
  removing the optional sight and other devices.
- development_assets/c25/: archived MCX donor/reference, selected-part
  manifest, generated models/atlas/editable Blender scene/renders, README
  and current evidence. The older iron-sight evidence is under validation/initial.

Decisions: retained MCX stock parts 0-23 and 41-80; replaced its filled lower
web (24-40) with a slim diagonal frame. Retained the independent c25scope
attachment for existing saved items and optional use. The built-in scope
uses the existing default-group replacement behavior. Ammo, damage, RPM,
reload, length, effect anchors, item IDs and shared renderer are unchanged.
No commits, pushes, publications or uploads.

## Reviewer and fixer report

- B1, fixed: MCX's original lower web obscured the requested triangular hole.
  Selective removal and an authored diagonal frame preserve the detailed
  cheekpiece/latch/buttpad while clearing the opening on both sides.
- B2, fixed: the shared C7A2 helper's UV layout changed concurrently to four
  columns. A private C25 UV function now consistently maps its three-column
  atlas. Final studio views and Java-loaded opacity/UV checks passed.
- B3, fixed: the initial C25 factory group contained irons. It now contains
  only the fitted scope; the model no longer loads an iron-sight group.
  Default gun-level PiP coordinates are derived from the actual fitted lens.
- T1, retained manual backlog: normal-input firing, empty/tactical reload,
  every hand contact, multiplayer/dedicated-server launch, dropped/item-frame
  views, shader/Angelica variants and unusual FOV remain untested.

Final verdict: ACCEPTABLE WITH MINOR ISSUES (T1 manual coverage).
Client model changes use the existing side boundary. No common/server code,
network protocol, persistence format or registry ID changes. Existing saved
C25 items gain the factory scope when the sights slot is empty; existing
attached optics continue replacing it. No item migration is required.

## Test and verification report

Successfully ran:
1. Blender 5.2 --background --factory-startup --python-exit-code 1
   --python tools/build_c25.py -- --install.
2. gradlew.bat compileJava --offline.
3. gradlew.bat -I tools/c25_geometry.gradle checkC25Geometry --offline.
4. Blender bundled Python tools/c25/verify.py.
5. Bundled Python tools/c25/setup_live.py, then gradlew.bat -I
   tools/c25/live.gradle runClient --offline.

Focused verification passed: source versus actual Java-loaded triangles,
normal/winding consistency, UV range/occupied opacity, installed hashes,
unique IDs, icons, reticle, factory-muzzle split and scaled effect origins.
New checks sample the stock opening and visible rounded fore-end slots;
they also compare fitted scope geometry with the standalone optic plus its
mount displacement and verify the gun-level PiP declaration.

The fresh Forge launch passed model/ammo/attachment/PiP bindings and the
assertion that a fresh C25 selects the factory scope with an empty sights slot.
It captured hip, blend, optional scoped ADS, scripted reload and held third
person with scope/grip/laser/silencer. After removing the optional sight it
captured the factory 4x feed; after removing other devices it captured the
factory-only scope. The magnified view and transparent black crosshair are
visible. Stock/fore-end opposite-side and underside studio views were reviewed.
The world contained nearby slimes in the factory captures; they are scene
objects, not weapon geometry. All current logs/captures are in validation/.

The probe is scripted client presentation coverage, not normal-input firing
or complete reload-contact validation. It uses the disposable C25 Presentation
world in build/m240-check/instance and instrumented current-class copies under
build/c25-check. Production renderer sources and user worlds are not patched.

Launch prerequisites refreshed the local X206 validation JAR. Build number
remained 206. Unrelated pre-existing pack warnings remain in the launch log;
the C25 assertions and launch completed successfully.

## Manual regression checklist

1. Restart the matching client and obtain C25. The scope must be fitted and
   usable immediately, with no attachment item needed and no iron sights.
2. Aim, move and reload. Check factory PiP and the entire ADS transition.
3. Fit another sight; expect one scope only. Remove it; expect the factory
   scope to return. Reload the saved item/world and repeat.
4. Inspect both stock sides and the fore-end at hip fire, during reload and
   in held/dropped views. The triangular stock opening and capsule-shaped
   handguard vents must remain open.
5. Check normal empty/tactical reload and firing with ordinary/tracer ammo,
   plus grip/laser/muzzle attachment fit. Repeat on a matching dedicated
   server with another player to verify authority and remote appearance.
