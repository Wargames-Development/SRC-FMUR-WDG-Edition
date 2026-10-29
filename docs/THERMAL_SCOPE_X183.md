# Thermal scope / DH correction — X183

## Diagnosis and implementation

The user confirmed X182 stopped thermal-lens flicker but introduced disappearing
DH terrain around the optic and incorrectly positioned LODs inside it. All
no-shader scopes and the other shader-enabled optics were reported functional.

Two concrete compatibility defects were found by inspecting the Trailer Mod1
DH and Angelica jars and the corresponding DH sources:

- **B1:** Angelica 2.2.14's `IrisApiV0Impl.isShaderPackInUse()` checks whether the
  active pipeline is fixed-function. During X182's isolated thermal camera it
  returns false. DH compares that result with `irisShadersEnabledLastFrame` and
  clears its LOD render cache when they differ. The previous FMUR comment stated
  the opposite API behavior; the earlier fake Iris fixture always returned true
  and missed this defect.
- **B2:** FMUR looked up `com.seibel.distanthorizons.RenderHelper`. The installed
  DH jar uses `com.seibel.distanthorizons.forge17.RenderHelper`, so all DH state
  capture/restoration silently disabled itself. Secondary projection/model-view
  matrices and transparency state were consequently left in DH's shared state.

The existing compatibility boundary now resolves the installed forge17 helper,
with the older package as a fallback. Before an isolated world camera runs, it
temporarily matches DH's remembered shader mode to the fixed pipeline's actual
API result and disables deferred transparency for that camera. On exit it
restores the primary shader mode, transparency mode and camera matrices through
the existing finally-based cleanup. Entity-only heat replay does not alter DH.

The thermal sensor remains on the isolated path that stopped the lens flicker.
This correction changes no world-camera selection, magnification, framebuffer,
color PiP lighting, M40 scale, explosion rendering or content definitions.

## Files changed in this follow-up

| File | Purpose |
| --- | --- |
| `src/main/java/com/flansmod/client/ScopeRenderCompatibility.java` | Correct DH class lookup; prevent temporary shader-mode cache invalidation and restore primary DH state. |
| `tools/player_lod_checks/java/com/flansmod/client/ThermalGpuChecks.java` | Load the installed DH jar; verify repeated camera transitions, matrices, failure cleanup, and working camera paths. Make the fake Iris API reflect installed pipeline-dependent behavior. |
| `tools/player_lod_checks.gradle` | Optional `dhRuntime` input for the existing thermal GPU suite. No production dependency change. |
| `gradle.properties` | X182 to X183 identifies the replacement jar. |
| This document | Diagnosis, review, validation and manual acceptance report. |

## Review / fixer report

B1 and B2 are addressed with a bounded change to the existing optional client
bridge. Review found no remaining code-level blocker in that change. The actual
installed helper, DH singleton fields and matrix setter APIs are exercised by the
regression fixture. All gameplay authority, networking, NBT, registry IDs,
configuration keys and Java 8 compatibility are preserved. No DH, MCHR or
content-pack sources were changed.

**T1 remains:** the complete DH renderer plus shader pack has not been launched
in Minecraft. The offscreen fixture exercises real DH objects and matrix hooks
with a simulated Iris manager; it does not render a DH landscape or validate
the final terrain alignment visually. Runtime verdict remains pending that check.

## Validation

Final validation on Windows with Java 8 passed:

```powershell
./gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks '-PlwjglNatives=build/player-lod-checks/natives' '-PmchrRuntime=../SRC-MCHELI-R-WDG-Edition/build/classes/java/main' '-PdhRuntime=C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Trailer Mod1/minecraft/mods/DistantHorizons-portable-storage-2026-10-25.jar' build
git diff --check
```

Production compilation, **377 GPU/compatibility assertions**, jar/reobfuscation
and whitespace checks passed. The standard Gradle `test` task reports NO-SOURCE;
the opt-in suite supplies the automated coverage. Existing Unsafe, deprecation
and unchecked warnings remain. The jar is
`build/libs/FMUR-WDG-Edition-1.8.06_X183-dev.jar` (16,048,762 bytes).

Tests include four
primary/thermal camera cycles, narrow projection and translated model-view
capture using actual DH setters, exact primary-matrix restoration, shader-mode
cache-invalidation predicates on both sides of the camera boundary, exception
cleanup, shader-aware color-camera preservation and the no-shader path. The
earlier sensor, native explosions, transparency, aperture and M40 checks remain.

## In-game acceptance

1. Replace only FMUR with X183 in the Trailer pack, keeping the DH/MCHR jars and
   content packs as installed. Aim the CNVD-T at a stable near-terrain / DH-LOD
   boundary with shaders enabled.
2. Enter and leave ADS repeatedly, stand still, turn and move. Distant terrain
   outside the lens should remain loaded on both the updated and reused PiP
   frames. Terrain inside the lens should meet nearby terrain without translation.
3. Toggle FLIR off to compare terrain alignment in color, then turn it back on.
   Repeat at a different location, GUI scale and window size.
4. Recheck ordinary color PiP and binoculars with shaders. Turn shaders off and
   repeat the scopes; no-shader behavior should match the working baseline.
5. Confirm the M40 remains enlarged and explosions remain white-hot in thermals.

No Prism instance was modified, and no commit, push or upload was performed.
