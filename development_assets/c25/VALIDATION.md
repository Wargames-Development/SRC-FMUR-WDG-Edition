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
