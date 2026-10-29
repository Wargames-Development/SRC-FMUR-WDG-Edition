# Windows thermal scope follow-up — X182

## Implementer report

The thermal model scope now renders its magnified world camera through the
existing isolated fixed-function pipeline and private framebuffer. It no longer
re-enters the primary shader pack's temporal/deferred pipeline. The primary world
and color PiP retain their shader rendering. The thermal background therefore
uses vanilla lighting even with a shader pack enabled. DH remains enabled and
the narrower camera reuses the primary terrain lists. This is still a full
magnified world render, with the existing alternating-frame update schedule.

Nested world and heat passes cannot overwrite the primary model-lens aperture
when another rendered player carries the same optic.

The M40 model requests twice its previous integral PiP diameter. Existing ADS
alignment moves its lens to half the previous eye distance while keeping it
centered. Other models default to their previous size; attached optics retain
their existing automatic alignment. No content-pack edits are required for the
Trailer Mod1 M40 definition (`PictureInPictureAutoDepth` remains false/default).

The shared particle sensor recognizes the native full block-light coordinate
240 used by vanilla, FMUR and MCHR explosion sprites. Emissive sprites render
white-hot, retaining texture alpha and scene-depth occlusion. Sky light alone
does not classify particles as emissive. Other particles keep their existing
grayscale/transmission behavior. FLIR-off output keeps the original color feed.
This uses render emission metadata; custom particles without that metadata will
keep the existing grayscale behavior.

Files and purposes:

- `ThermalScopeEffect.java`: select the isolated thermal camera; guard aperture.
- `ScopeRenderCompatibility.java`: reuse primary terrain for the isolated camera.
- `ThermalCamera.java`: recognize emissive particle brightness in the sensor.
- `particle/EntityFlash.java`: retain the legacy flash's emissive brightness
  after starting its native draw batch during thermal replay only.
- `model/ModelGun.java`, `model/BFMCpack/ModelM40A5.java`, `model/RenderGun.java`:
  model-specific M40 ADS size using the existing lens alignment calculation.
- `ThermalGpuChecks.java`: regressions for emission, aperture, scale and isolation.
- `gradle.properties`: X182 identifies the replacement jar.
- This document: implementation, review and manual acceptance details.

## Reviewer / fixer report

Sequential review found no remaining correctness or compatibility issue in the
bounded diff. All new presentation state is client-owned. No packets, NBT,
registry values, gameplay authority, dependencies or companion sources changed.
The change deliberately removes shader-pack lighting from the thermal camera's
background, while keeping the surrounding primary view shader-enabled.

- B1: the thermal second camera entered the primary shader pack's pipeline;
  addressed by selecting the existing isolated camera path and terrain reuse.
- B2: nested target optics could replace the primary aperture; addressed by
  rejecting aperture capture during secondary-world and heat passes.
- B3: explosion luminance was capped at 0.68 in the particle sensor; addressed
  by using native emission metadata for white-hot sprites.
- B4: the legacy FMUR flash resets its batch after EffectRenderer sets brightness;
  addressed by setting its declared emissive brightness inside the thermal batch.
- T1: full Windows shader-pack gameplay remains an acceptance gate. Offscreen
  fixtures verify the changed graphics boundaries, not the reported live flicker.

Verdict: acceptable for in-game acceptance, with T1 still unverified.

## Test report

Final validation used Java 8 on Windows:

```powershell
./gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks '-PlwjglNatives=build/player-lod-checks/natives' '-PmchrRuntime=../SRC-MCHELI-R-WDG-Edition/build/classes/java/main' build
git diff --check
```

Compilation, **328 GPU assertions**, jar/reobfuscation and diff checks passed.
`test` reported `NO-SOURCE`; the opt-in GPU suite supplies the automated coverage.
The build retains existing deprecation/unchecked and test-fixture Unsafe warnings.
Output: `build/libs/FMUR-WDG-Edition-1.8.06_X182-dev.jar` (16,048,554 bytes).
The build identifier was explicitly raised from X181 to X182.

The added native explosion fixture initially attempted GL_BACK reads against a
single-buffered test pbuffer. It was corrected to use the same color/depth FBO
layout as Minecraft before the final successful run.

The GPU checks cover
the actual lens alignment math, native FMUR flash and MCHR explosion renderers, smoke alpha,
scene occlusion, sky-light rejection, primary aperture preservation and shader
pipeline selection/restoration. The pipeline fixture uses a fake Iris manager;
it does not instantiate a complete shader pack or DH renderer.

Manual acceptance in the Trailer pack:

1. Replace only FMUR with X182. Keep the content pack and MCHR unchanged.
2. With the reported shaders enabled, ADS through CNVD-T while stationary,
   turning, moving and firing. Enter/leave ADS repeatedly. The image should stay
   opaque and stable within the physical aperture, including between screenshots.
3. Observe a player holding the same optic; check the aperture stays on the local
   scope. Repeat with shaders off, binoculars, ordinary color PiP and DH terrain.
4. ADS the M40 with its integral scope. Its diameter should be twice the previous
   size, centered, without near-plane clipping. Check a fitted attachment too.
5. Observe FMUR, vanilla/TNT and MCHR explosions through both thermal optics and
   binoculars. Emissive blast cores should be white, with transparent edges;
   terrain and dense foreground smoke should still occlude them. Toggle FLIR off.
6. Resize and toggle shaders, then repeat ADS to check capture/state restoration.

No Minecraft instance was modified or launched. No commit, push or upload was made.
