# Shader-on terrain corruption and missing sun

Capture: `2026-10-28_17-20-11.174-client`. The user reports working PiP and
thermal with shaders disabled, yellow loaded terrain in color PiP with shaders
enabled, and corresponding bright terrain in thermal scopes/binoculars.

## Diagnosis and changes

B6: Angelica 2.2.14's `IrisExtendedChunkVertexType` has 48-byte vertices and
deliberately omits `a_RdhFactor`, the vanilla terrain shader's bilinear AO
correction attribute. The camera's default material nevertheless reads it.
With the actual installed shader and vertex layout, its location aliases
`mc_midTexCoord`: large packed UV values become red/green color corrections.
This reproduces the yellow saturation in an offscreen GPU draw. Thermal then
processes the same corrupted scene brightness. DH and entity geometry use
different programs/layouts, explaining their different appearance.

`AngelicaCameraTerrain.java` now detects formats lacking this attribute and
compiles a private material with that correction set to zero. Iris's encoder
already sets `rdhFactor` to zero before writing its extended vertices. Ordinary
formats retain their existing material. Geometry, UVs, alpha discard, lighting
and private camera projection remain in the existing renderer. Compilation
failures reject the camera sample instead of silently omitting loaded terrain.
No active-pack pipeline, history, primary mesh or shared draw cache is changed.

B7: the lightweight camera only cleared the sky color; it never submitted the
sun texture. `LightweightCamera.java` now draws the normal sun texture at the
world's celestial angle through the secondary projection. It uses the vanilla
angular size, ignores camera translation, obeys rain visibility, and writes no
depth. Drawing it before terrain preserves occlusion and the sensor's sky-depth
test. The existing independent thermal bloom remains device-controlled. This
does not add shader-pack clouds, atmosphere, custom sky handlers or a moon pass.

Other changed files:

- `ThermalGpuChecks.java`: actual installed Iris format/shader regression,
  before/after pixel checks, and sun magnification/visibility/depth checks.
- `tools/player_lod_checks.gradle`: optional `-PangelicaRuntime` input for that
  isolated fixture. Renderer classes are loaded in a private fixture loader.
- `PIP_THERMAL_REDESIGN.md`: update current behavior and validation evidence.
- `gradle.properties`: advances once when the replacement build succeeds.

## Capture alignment and performance

The messages are visible in `latest.log`; profiler start was 17:20:11.174.

| Chat timestamp | Stage |
| --- | --- |
| 17:20:16 | Regular PiP, shaders off |
| 17:20:24 | Thermal scope, shaders off |
| 17:20:32 | Thermal binoculars, shaders off |
| 17:20:47 | Regular PiP, shaders on |
| 17:20:58 | Thermal scope, shaders on |
| 17:21:06 | Thermal binoculars, shaders on |

The FML log names `BountifulStarsALPHA0.0.3-WDG-water-input-probe.zip`; its third
load starts at 17:20:39 and completes around 17:20:41. The 2268.981 ms frame at
elapsed 30.658 seconds falls in that switch. It is excluded from the windows
below. The capture mod list still identifies FMUR X183-dev; the replacement is
built from the current working tree with the newer naming/version rules.

Only complete interval rows inside conservative windows after the chat messages
are included. FPS is sample count divided by included interval time; mean frame
and CPU times are weighted by frame samples. These are observational windows,
not a matched no-scope benchmark or precise acquisition timings.

| Stage | Window after capture start | Included seconds | FPS | Mean frame ms | Mean render CPU ms |
| --- | --- | --- | --- | --- | --- |
| Regular PiP, off | 6-12 s | 5.00 | 538.8 | 1.857 | 1.188 |
| Thermal PiP, off | 14-20 s | 5.00 | 551.8 | 1.813 | 1.069 |
| Binoculars, off | 22-28 s | 5.02 | 390.1 | 2.565 | 1.751 |
| Regular PiP, on | 38-46 s | 7.02 | 235.5 | 4.248 | 2.635 |
| Thermal PiP, on | 48-54 s | 5.03 | 224.9 | 4.449 | 2.575 |
| Binoculars, on | 56-60 s | 3.00 | 204.1 | 4.904 | 2.998 |

Profiler estimated overhead is 5.416%. GPU query pool exhaustion occurred 5,787
times, so sampled GPU sections do not provide complete frame accounting. Views
and actions differ across windows. These values do not isolate PiP's FPS cost
or prove recovery of the old roughly 50% loss.

## Validation and in-game acceptance

Java 8 compilation and the Windows offscreen suite pass: 15,822 profile/timing
assertions and 442 GPU/compatibility assertions. The new regression compiles the
actual installed terrain vertex/fragment source, checks the real Iris format,
reproduces yellow pixels before the correction, and verifies expected green
texture pixels afterward. It also verifies that the missing shader input is
eliminated. This is not a complete transformed Angelica game execution.

The sun fixture verifies visibility, rain suppression, genuine 2x projection
magnification, unchanged depth and GL error state, including a short far plane.
Existing depth, cover, bloom, smoke, player/MCHR LOD and cached-feed checks pass.

Final command: `gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle
compileJava thermalGpuChecks build`, with the documented LWJGL natives, MCHR,
DH and Angelica runtime arguments. It passed, including Forge reobfuscation;
the successful build automatically advanced X184 to X185. `git diff --check`
also passed. Existing compiler/ForgeGradle and test-fixture Unsafe warnings
remain. No new runtime dependencies, packets, saves or device limits changed.

Output: `build/libs/FMUR-WDG-Edition-1.8.06_X185.jar`.
SHA-256: `E8A9FECBE87F4B295B85E319C21ED35479C6EA41D5ACB17BE8F2D0B17F0BEB05`.
Archive/bytecode inspection verified matching X185 metadata and version constant,
runtime workbench mappings, both camera adapter classes, and no bundled renderer
dependencies. Review verdict: acceptable for in-game retest; native pack/OS
release acceptance remains pending.

Retest after replacing the old FMUR jar and restarting: repeat the six stages
above. Compare loaded terrain and DH across the boundary, foliage cutouts,
targets behind cover, sun at different zooms and rain, and thermal bloom/cover.
Turn shaders off/on again to check program recreation and primary-view state.
Keep device profiles unchanged. Native macOS/Linux and this shader pack's full
runtime still require confirmation. No game instance files are overwritten.
