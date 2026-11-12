# NTW-20 BFMC remodel

This is a bounded refit of the existing BFMC NTW-20, including its built-in 8x
picture-in-picture optic. It preserves `ntw20`, all three ammunition IDs, stats,
sounds, reload timings, inventory icon, model scale, skin key and GLTF binding.

## Sources and construction

`original/` archives the installed NTW-20 OBJ body, magazine, 1024x1024 atlas,
gun definition and icon before this task. The existing pack did not supply an
author or license alongside this asset. These remain legacy BFMC assets; this
refit does not claim their original authorship or invent a new license.

The donor supplies the receiver/frame, stock opening, controls, recoil buffer,
scope, carrying handle and deployed bipod. The buttpad, grip, magazine, tapered
barrel and three-port brake are authored in `tools/build_ntw20.py`. This is a
donor refit, not a scratch rebuild of the complete rifle. Component selections,
source hashes, palette, bounds and group counts are recorded in
`remodel/geometry.json`.

The visual reference is Denel's NTW 20 brochure, 20x82 configuration:
https://admin.denel.co.za/uploads/NTW_20x82.pdf
No third-party model or photographic texture was downloaded or incorporated.
The supplied FMUR reference sheet guided pack finish and validation.

The new diffuse atlas is 2048x1024: the regraded donor atlas occupies the left
1024x1024 rectangle, U 0-0.5, and new 256-pixel material tiles occupy the right.
The exporter retains donor UV detail, writes opaque steel at old transparent
padding, and records the legacy loader's position/normal conversions explicitly.
The modeled stock, guard and brake openings remain real openings.

Effective dimensions are **44.750 x 12.327 x 8.284 pack units**, length x height x
width, including the scope, carry handle, magazine and deployed bipod. The
archived donor length is 44.7505. The BFMC M82A3 measures 35.305 in length at its
configured scale; `pack-scale-comparison.png` uses the same framing for both.
There are 5,984 exported triangles across body, magazine, scope and brake.

`remodel/NTW20.blend` is the editable scene with its diffuse atlas packed.
`tools/build_ntw20.py` is the authoritative procedural source and exporter.
Exported OBJ coordinates retain the original 0.1 model scale and Java
`translateAll(5, 5, 0)` convention, including the existing reload coordinate frame.
The barrel ends at its 32.8-unit brake seat; flash/tracer origin is at the fitted
brake's 36.575-unit tip. The factory scope and brake have separate default groups.
Third-person mirroring is disabled to preserve the authored hardware sides.

## Built-in PiP scope

`definitions/guns/CUSTOM_SR_NTW20.txt` adds only presentation settings:

```text
PictureInPicture 26.55 81.84612 0.01599 5.35
PictureInPictureAutoDepth true
PictureInPictureReticle PIP\RifleScope
Magnification 8.0
```

Coordinates are post-loader, post-translation model pixels, before the 0.1 scale.
The rear lens plane is at effective X 2.655, immediately behind the eyepiece's
X 2.65917 face; its effective radius is 0.535. It uses the pack's existing
transparent RifleScope reticle and integral-scope PiP renderer. Automatic depth
uses the renderer's standard lens size. Optical magnification remains 8x, with
the peripheral view at 1x. The old `Scope GUI\RifleScope` entry remains for
compatibility; PiP supersedes the full-screen overlay through the existing path.

## Rebuild and install

From the repository root, with Blender 5.2 and Java 8 available:

```powershell
& 'C:/Program Files/Blender Foundation/Blender 5.2/blender.exe' -b --factory-startup --python-exit-code 1 --python tools/build_ntw20.py -- --install
.\gradlew.bat compileJava
.\gradlew.bat --offline -I tools/ntw20_geometry.gradle checkNTW20Geometry
& 'C:/Program Files/Blender Foundation/Blender 5.2/5.2/python/bin/python.exe' tools/ntw20/verify.py
```

The installer copies four OBJ files to `eclipse/Flan/BFMCpack/`, the diffuse atlas
to the existing `BFMC Gun Pack/assets/flansmod/skins/NTW20.png` key, and the durable
definition to the existing gun file. It leaves the icon untouched. The general
Sketchfab installer does not own this legacy NTW binding.

Use matching compiled mod classes and these external pack assets together, then
restart Minecraft to clear the OBJ cache. Copying the skin alone does not select
the new mesh. No commit, push, upload or release was performed.

## Validation and review

Completed November 11, 2026:

- `gradlew.bat compileJava`: PASS under Java 8.
- `checkNTW20Geometry`: PASS, loading the installed OBJ files through the actual
  Java model and TMT loader. It also exports the M82A3 comparison.
- `tools/ntw20/verify.py`: PASS for Java/source triangle positions and UVs,
  nondegenerate unique triangles, normals matching winding, occupied opaque UVs,
  all installed geometry/atlas/definition hashes, unchanged icon, one `ntw20`
  binding, and exact preservation of original definition lines outside the four
  authorized PiP additions. Rays verify the bore and nine positions across the
  three brake windows, including small off-axis offsets.
- Culled software renders of Java-loaded meshes were inspected from both sides,
  three-quarter and underside views in `java-loaded-culled.png`. Blender preview
  images are separate studio views, not Minecraft captures.
- An isolated Forge 1.7.10 client and integrated server ran successfully with
  the installed definition, compiled model and assets. A temporary client probe
  loaded the existing three-round magazine and captured hip, ADS blend, full
  ADS, a client-driven reload and held third-person views at 1600x900. Final PiP
  captures are in `validation/`. They show the integral lens feed and reticle
  with a visible peripheral view.
- The firing hand's regular pose was refitted against live arm measurements.
  Final palm: (1.000, 2.399, 1.850) effective pack units. Grip and trigger-side
  contact points map near the vanilla arm's inside face at hand-space Z -1.999
  and -2.199; the trigger falls near the end of the hand at Y 10.694. The inherited
  support palm measured (10.995, 2.787, -1.482). GLTF reload arm tracks are retained.

Review findings addressed: **B1**, brake-window reveal winding; **B2**, transparent
legacy UV edge pixels. Final bounded review: **ACCEPTABLE**, with the manual
coverage limits below. All runtime code changes are in the existing client model;
no networking, persistence, registry, ammunition or server gameplay code changed.

The first live probe stopped because it incorrectly required a separate
`thirdPersonModel` field. The NTW definition only declares `Model`; the active
renderer uses that model for held views. The corrected probe passed. Early
wrapper compilation required access to the existing Gradle cache. Live launch
also ran the project's `jar`/`reobf` tasks and refreshed the local X206 validation
JAR; the build number remained 206. Preexisting unrelated workspace edits remain.

## Manual regression checklist and limits

1. Restart the matching development client. Equip an existing saved NTW-20 and
   a newly obtained one; verify the unchanged icon and magazine compatibility.
2. Aim normally. Confirm the 8x magnified view and red reticle stay in the physical
   eyepiece, with peripheral vision visible. Check entry/exit blending, crouch,
   different FOV settings and normal sway.
3. Fire ordinary and tracer magazines. Check recoil, post-shot lens recovery,
   flash/tracer position at the brake tip and the original sounds/timings.
4. Test empty and tactical reloads with normal controls. Inspect the side-magazine
   seat and hands throughout the full animation, not only the supplied frame.
5. Observe held, dropped and item-frame views, plus another player on a dedicated
   server. Check the carry handle, mag side and deployed bipod orientation.
6. Exercise any attachments the existing pack actually permits, including a
   saved attached optic or barrel device, and verify replacement group visibility.

Normal-input combat/reload behavior, exhaustive animation contact, attachment
variants, dropped/item-frame views, broad FOV/recoil coverage and a dedicated-server
launch remain unverified. The retained GLTF reload was not redesigned into a new
mechanism-accurate animation. The PiP test used the ordinary development renderer;
shader-pack/Angelica variants were not tested. Legacy donor internals were not
certified free of every partial coplanar overlap. No save-format migration is
required.

## Barrel connection and finish correction

The user's dropped-item screenshot exposed an uncovered annulus at the receiver
cut: its radius was approximately 0.931, while the replacement barrel started at
0.55. The exporter now bridges the actual sixteen donor boundary vertices to the
barrel root, uses a matching sixteen-sided barrel, and integrates the small raised
lip into one continuous shell. The redundant internal root cap was removed.

The previous barrel swatch was RGB 65/68/69, noticeably lighter than the occupied
receiver-collar median of 43/44/44. Dedicated barrel and brake swatches now use
43/44/44, with restrained 50/51/51 brake-edge highlights. Other materials, the
existing PiP scope, gameplay definitions and model anchors are unchanged.

The exporter, OBJ body/brake, atlas, packed Blender scene, metadata and studio
renders were regenerated and installed. `tools/ntw20/verify.py` now checks that
every edge on the shoulder plane has exactly two incident triangles, casts 192
rays across the annulus, and compares sampled barrel/collar colors. All checks
passed against the actual Java-loaded geometry, including the existing UV,
normal, hash, definition, icon and brake-opening checks. The sampled barrel and
collar medians both measured 43/44/44. The focused Gradle loader task passed;
`compileJava` was up-to-date because this correction changes no Java source.

`remodel/barrel-joint-before-after.png` shows the prior joint on the left and the
corrected joint on the right, rendered with culling from Java-loaded meshes.
`remodel/barrel-joint.png` and the full culled sheet show the final geometry.
Earlier live PiP captures in `validation/` predate this correction; a fresh live
client capture was not repeated for this asset-only repair. Restart Minecraft
to clear its OBJ/texture caches, then inspect the dropped gun from the supplied
screenshot's angle and from the opposite side. Confirm that the receiver has no
background-visible ring around the barrel and that the barrel/brake finish fits
the frame in the same lighting. Recheck normal hip/ADS/PiP views.
