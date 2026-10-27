# Thermal and PiP correction — FMUR X178

This follow-up addresses the reported shader-enabled opaque/flickering lenses and
thermal binocular side strips. The user confirmed ordinary PiP and thermal sights
work without shaders on Windows, and the no-shader path works on the M4 Mac.
Native shader-enabled testing remains an acceptance gate after this correction.

## Implementation report

Three concrete presentation defects were corrected:

1. The final lens compositor used fixed-function texturing (`glUseProgram(0)`).
   Enabled texture units from a shader pack can multiply unrelated images into
   that draw; inherited fog, scissor, stencil and color-write state can tint or
   suppress it. The compositor now uses an explicit GLSL 1.20 texture-copy pass
   with sampler 0 only and sets the required draw state. The copied image has
   already been rendered/processed; it is sampled without another thermal pass,
   lighting or shader-pack tone mapping.
2. The compositor restored draw-buffer attributes before restoring the caller's
   framebuffer. A window's FRONT/BACK draw state is invalid on a texture FBO.
   It now restores separate read/draw FBO bindings before popping those attributes.
   The viewport uses the actual destination framebuffer dimensions.
3. The binocular shader used a fixed rectangle, leaving colored strips outside
   it. Standalone binocular mode now selects full-viewport thermal coverage,
   including the side edges, independently of vehicle-camera mode.

Generic PiP optics now record their projected aperture before checking whether a
lens texture is ready. This lets the first completed shader lens frame composite
inside the physical aperture rather than waiting for a previous image to exist.
The existing camera capture, optical magnification and frame scheduling remain
in place. No shader/non-shader fallback or image-cropping substitute was added.

### Files changed in this correction

All paths are relative to FMUR's repository root. Preexisting work was preserved.

| File | Why |
| --- | --- |
| `src/main/java/com/flansmod/client/ThermalScopeEffect.java` | Explicit final lens shader, known draw state, FBO restoration order, target viewport and testable graphics boundary. |
| `src/main/java/com/flansmod/client/ThermalCamera.java` | Select full-viewport coverage for binocular mode. |
| `src/main/java/com/flansmod/client/model/RenderGun.java` | Capture the first-frame aperture before an image exists. |
| `tools/player_lod_checks/java/com/flansmod/client/ThermalGpuChecks.java` | Exercise the actual final lens graphics renderer and standalone binocular edges. |
| `gradle.properties` | X177 to X178, identifying this correction. |
| `docs/THERMAL_RENDERING.md` | Current implementation, review and validation report. |

**Only FMUR needs replacing for this correction. Keep the current MCHR jar.**
The shared thermal API and MCHR integration did not change. No server authority,
hit registration, packets, saved data, entity IDs or configuration keys changed.
The existing player LOD default range of 512, smoke transmission, particle-alpha
fixes and requested temporary player WGMap occlusion bypass remain in effect.
No MCHR/DH/WGMap sources were edited in this follow-up. No commits, pushes,
releases or instance installation were performed.

## Review / fixer report

- B1 — Final lens draw inherited unrelated fixed-function texture/fog/clipping
  state. Addressed with an explicit sampler shader and explicit draw-state setup.
- B2 — Window draw-buffer attributes could be restored while a texture FBO was
  bound. Addressed with read/draw FBO restoration before attribute restoration.
- B3 — Binocular coverage depended on a fixed rectangle. Addressed with full
  viewport selection for standalone binocular mode.
- B4 — First shader PiP aperture depended on an already-valid image. Addressed by
  moving aperture capture ahead of the texture-readiness check.
- T1 — Full shader-enabled gameplay on Windows and native M4 macOS still needs
  retesting. Offscreen graphics fixtures cannot establish complete shader-pack,
  temporal-history or platform behavior.

Code/GPU verdict: **ACCEPTABLE WITH MINOR ISSUES**, with T1 as the runtime
acceptance gate. Review confirmed client-only ownership, Java 8 compatibility,
unchanged gameplay/network state and a bounded change to final presentation.
The installed Angelica shader/render hooks and vanilla 1.7.10 framebuffer/frame
ordering were inspected; no new Minecraft API or dependency was assumed.

## Test report

Successful final command with Eclipse Adoptium Java 8.0.462 on Windows:

```powershell
./gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks playerLodGpuChecks playerLodServerChecks playerLodChecks '-PlwjglNatives=build/player-lod-checks/natives' '-PmchrRuntime=../SRC-MCHELI-R-WDG-Edition/build/classes/java/main' '-PwgmapRuntime=../WGMap/build/classes/java/main' build
```

- **279 thermal/lens GPU assertions** passed.
- The production `renderLensImage` graphics renderer was run for six frames with
  unrelated black samplers on units 1–3, fog, scissor/stencil rejection and disabled
  color writes. Its exact image colors remained visible inside the aperture;
  outside pixels remained untouched. Window FBO, active unit and caller state
  were restored without GL errors. This directly tests the final lens stage
  that the earlier sensor-only fixtures missed.
- Standalone binocular mode was tested with vehicle and model modes off, using
  a colored scene at three viewport shapes. Every edge/corner became grayscale.
- Existing smoke, transparent sprite, cannon renderer, packed-depth, sun/cover,
  villager/player model and player/MCHR precision-layer tests still passed.
- **46 native player LOD GPU scenarios**, **21,039 packet/projection/appearance/
  WGMap assertions**, and the server-class API audit/visibility checks passed.
- Production compilation, jar/reobfuscation and `git diff --check` passed. Existing
  Unsafe/deprecation warnings remain in test/build output. MCHR's build/test
  suite was not rerun because no companion production code changed.

These tests run in a Windows OpenGL compatibility context, with capability-path
emulation for core/ARB/EXT selection. They do not launch Minecraft or a complete
Iris shader pack, and they do not execute natively on macOS. No performance claim
for a full 10v10 scene is established. The final lens pass reuses an existing
small shader and adds no world render, chunk loading or pixel readback.

## In-game acceptance checklist

1. Replace FMUR with **X178**, keeping the current MCHR jar. On Windows with the
   same shader pack as screenshots 3/4, test both ordinary PiP and CNVD-T. Enter
   and leave ADS repeatedly: the lens should show its image inside the physical
   aperture, without a flat opaque surface or alternating dark frames.
2. Repeat on the M4 Mac with the shader configuration from screenshot 1. Turn,
   move, fire and switch between optics. Check startup/first ADS as well as a
   settled frame. Repeat across GUI scales, window sizes and fullscreen/Retina
   configurations.
3. Test thermal binoculars with and without shaders on both platforms. Thermal
   coverage should extend behind the entire overlay, with no colored side strips.
   Check FLIR-off mode returns the color scene.
4. Recheck the already-working no-shader color PiP and thermal scope paths.
   Confirm normal/LOD heat targets, smoke screens, cannon sprite transparency,
   sun bloom and DH terrain remain functional.
5. Check resize, resource reload, reconnect and shader toggles for stale images.
   If a shader scope still fails, include the current Windows/Mac client log and
   active shader pack; the full shader-camera path remains outside this fixture.
