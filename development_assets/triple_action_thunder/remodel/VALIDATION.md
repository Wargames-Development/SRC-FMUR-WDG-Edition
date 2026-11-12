# Thunder refit validation — November 10, 2026

## Implementer report

- Changed `ModelTripleActionThunder.java`: corrected hand poses, muzzle and
  sight anchors, stationary bare ADS, culling and third-person handedness.
- Added `tools/build_triple_action_thunder.py` and the `remodel/` source/assets:
  reshaped credited donor, subdued atlas, new irons and editable Blender scene.
- Updated the durable definition skin and Thunder branch of
  `tools/install_sketchfab_guns.py`; both install routes select the same assets.
- Updated the parent README with regeneration, dimensions and manual checks.
- Preserved the donor archive, inventory sprite, gun/ammo definitions and all
  unrelated preexisting workspace changes. No gameplay or registration changes.

## Reviewer and fixer report

- B1, exporter donor-normal decoding: archived normals already compensate the
  legacy loader. Decoding them as ordinary OBJ normals reversed some faces.
  Fixed by undoing the donor Y-normal compensation before checking winding.
- B2, model firing/support arms: copied Deagle poses put the hands forward of
  the grip. Fixed both rest poses using the actual vanilla arm transform;
  retained the firing pose during reload.
- B3, model bare ADS: uncorrected rear/front landmarks missed screen center by
  approximately 19.25 and 3.34 vertical pixels. Fixed model-specific translation,
  pitch and yaw using the live matrix, with 0.230 camera-space rear depth.
- B4, donor atlas: receiver lettering was mirrored in the culled opposite-side
  render. Fixed V orientation only inside its occupied marking region. Checked
  the final atlas on the Java-loaded geometry with culling enabled.
- Client/server, networking, persistence and compatibility review: changes are
  client presentation and asset tooling; identifiers and definitions unchanged.
- Verdict: ACCEPTABLE WITH MINOR ISSUES. T1 below remains manual coverage;
  the existing static breech and generic reload are documented limitations.

## Test report

- Blender 5.2 background exporter with `--install`: passed. Saved OBJ, PNG,
  packed editable scene, geometry report and both preview renders.
- `gradlew.bat -I build/thunder-check/export.gradle compileJava exportReference --offline`:
  passed; final build log is `build/thunder-check/final-compile.log`.
- Java-loaded dimensions: 13.60120 length, 4.56141 height, 1.49067 width.
- `build/thunder-check/verify.py` with Blender's bundled Python: passed on the
  final exports, 6,085 nondegenerate unique triangles, matching geometric and
  decoded normals, valid UV ranges, installed OBJ/atlas hashes, preserved icon
  and definition hashes. This is not a full partial-overlap/intersection audit.
- Thunder branch of the bulk installer: passed against isolated destinations;
  unrelated copy operations, language and ammo installers were stubbed.
- Temporary Forge client probe: two successful launches, first/third model and
  ammunition bindings, hip, ADS blend, stationary full ADS, client-driven reload
  and front third-person captures. Probe sources remain outside production in
  `build/thunder-check/probe/`. Log: `build/thunder-check/live-final.log`.
- Stationary full ADS at 1600 × 900: rear and front landmarks each within 0.001
  pixels of center. Rear depth 0.2300, front depth 0.5889. Three paint marks
  visible; corrected receiver/barrel surfaces intact in the live viewport.
- Measured rest palms: right (-1.449, 3.650, 1.552), left (-0.900, 3.300, -1.250)
  in effective pack units. Screenshot review covered hip, ADS and reload.
- Final marking-only atlas correction was checked offline with the saved PNG
  and Java-loaded UVs; geometry and pose did not change after the last client run.
- `git diff --check` on the changed tracked text: passed.
- `modBuildNumber` remained 206. No release JAR built, commit or push performed.

T1: normal-input firing/reloading, tactical reload, saved-stack behavior,
multiplayer observation, dropped item, broad FOV/sway/recoil regression and
dedicated-server launch were not exercised. Use the parent's in-game checklist.
The unchanged reload does not animate the scissor breech or show a cartridge.
