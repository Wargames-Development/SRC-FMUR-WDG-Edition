# PiP and thermal redesign implementation

Date: 2026-10-28. FMUR and adjacent MCHR working trees.

## Implementation status

The FMUR/MCHR camera, profile, scheduling, menu, and compositor changes are
implemented in source for the user-selected stock Angelica compatibility target.
Runtime release acceptance is still pending. In particular:

- The supplied Wargames Release Angelica 2.2.14 jar has no isolated shader-camera
  API. The shader backend currently has a supported-provider contract and safe
  fallback, **not a working Angelica shader-pack provider**. The user explicitly
  selected keeping stock Angelica and using lightweight fallback. Automatic and
  Quality therefore use lightweight rendering on this installed renderer.
- The lightweight pass draws uploaded vanilla/Celeritas geometry and borrows the
  installed DH terrain buffers through an independent material/depth program.
  DH buffer interfaces/layout are checked against the installed binary. Its
  transformed in-game execution and visual terrain continuity remain unverified.
- Native macOS/Linux, full Minecraft shader-pack gameplay, private Celeritas
  draw execution, resource creation/reload, and full event ordering still require
  runtime acceptance. The optional adapter was compiled against the exact jar;
  that does not establish its behavior inside a transformed Minecraft runtime.
- No gameplay FPS benchmark establishes recovery of the reported roughly 50%
  loss. Nested main-world rendering and primary shader-history copies have been
  removed from the active scope path, but an extra geometry pass still costs time.

No shader-state snapshot workaround, primary-view crop, reprojection fallback,
or fake dimension is substituted for the unsupported shader camera. Do not
replace the release instance's jars on the strength of compilation/offscreen
fixtures alone. The remaining work is listed at the end.

## Source evidence

Both supplied Angelica jars (Trailer Mod1 and Wargames Release) have SHA-256
`83987AE7C6B50E41161A4C14D476E8EDE24A9822CAEDA12307881C67B46A36E0`.
Their `PipelineManager`/`WorldRenderingPipeline` public surfaces expose the
primary pipeline stages, not isolated secondary views. The installed jar also
matches the published asset digest in the [official 2.2.14 release](https://github.com/GTNewHorizons/Angelica/releases/tag/2.2.14).
The matching source archive was downloaded into the ignored build reference
folder and verified against its published SHA-256
`d10efd7a16844447b2433bd23b52e17bd058065f2fd20a47e5ab6cef3b7b5732`.
Source inspection confirms dimension-owned pipelines, global camera/capture
state, and hard references to Minecraft's main framebuffer. An isolated camera
requires a renderer-side change, not just registering the existing pipeline.
The user chose the unmodified stock dependency with lightweight fallback;
changing Angelica is outside this delivery's selected compatibility target.

The installed Celeritas interfaces expose uploaded sections, region buffers,
render-pass configuration, and a reusable default terrain renderer. The new
optional adapter uses those actual interfaces. It does not call `setupTerrain`,
`updateChunks`, `uploadChunks`, or mutate primary visibility/occlusion lists.
Vanilla uses existing compiled display lists with private frustum decisions.

DH uses its existing current-camera candidate set only for a co-located camera
with equal/narrower projection. Different origins or wider views are rejected.
The adapter privately culls the candidates, locks each borrowed vertex/index
buffer for reading without blocking, and draws its own VAO and GLSL 1.20 material.
It never fires DH/Iris render events, swaps global matrices/targets, changes the
primary lists, or deletes borrowed buffers. Its depth law matches the existing
distant actor replay; terrain beyond the vanilla far plane remains drawable.
An unavailable/busy visible buffer defers the whole sample, retaining completed
compositor output. Color is vertex tint with vanilla lightmap (neutral sensor
illumination for thermal), without DH texture detail, fog, TAA or earth curvature.

The old renderer called `EntityRenderer.renderWorld` again at display resolution,
saved/restored primary color and shader histories, and altered renderer caches.
Those calls and helpers were removed from `ThermalScopeEffect`. Historical
`ScopeRenderCompatibility` and its regression fixtures remain in the tree but
are no longer called by the new camera path.

## Implemented frame flow

```text
FMUR gun/attachment profile             MCHR vehicle/camera/seat profile
             |                                      |
             +--------- active device/profile ------+
                                 |
                       shared monotonic admission
                         /                    \
                    color PiP             thermal sample
                         |                    |
                rendering-mode resolver      | always lightweight
                  /                 \        |
          lightweight         supported shader provider
                  \                 /        |
                   private color/depth camera target
                                 |
                     heat/LOD/particle sensor passes
                                 |
                    once-per-sample sensor processing
                                 |
                       cached display compositor
                    physical lens / fullscreen feed
```

At world-last, the service records the actual camera matrices and origin. A
secondary pass runs at RenderTick END, after primary shader finalization. It
uses its own projection, target, frustum, draw lists, and shader-free material
programs while borrowing the already uploaded meshes and texture resources.
There is no second world tick, event dispatch, chunk rebuild/upload budget,
primary framebuffer overwrite, or pack temporal-history copy.
Color scopes sample the borrowed private camera texture directly rather than
copying it through thermal buffers. Thermal acquisition uses a neutral sensor
lightmap so player gamma/lightmap brightness does not replace device gain.

The real narrower projection provides magnification. Its horizontal mapping
accounts for the final aperture/display aspect even when native sensor pixels
are rectangular. Display sampling does not magnify a primary image. Every
physical lens composites after primary rendering, with the existing aperture
and inset calibration. MCHR marker coordinates are converted from the sensor
viewport to its existing logical HUD coordinates.

Thermal acquisition uses the private shader-free world image/depth, never the
primary shader-pack color. Existing depth-tested living/vehicle/LOD heat,
particle transmission/emission, smoke, sun cover, and precision target replay
are reused. Sensor processing and grain advance only for admitted samples.
Fullscreen processing is cached at native sensor dimensions; presentation
copies the cached result. Fullscreen acquisition completed at RenderTick END
is presented through the following HUD pass, so there can be one display frame
of additional latency. Physical lenses can present at that same tick end.

World changes and resource reloads invalidate images and release targets. A
resource reload does not reset sensor deadlines in the same world. Device/view
changes invalidate stale images without forcing an early sensor sample. The
current UI has one active feed: the service reuses one camera target and one
sensor resource set rather than retaining GPU targets for every content item.
Per-definition deadlines survive switching away/back. MCHR keys include the
resolved camera/seat identity; identical vehicle definitions conservatively
share deadlines across instances.

## PiP Rendering Mode menu

The existing scrolling FMUR options menu now has a persistent button:

| Mode | Behavior |
| --- | --- |
| Automatic (default) | Use a registered shader camera only while it reports support for the active pack; otherwise lightweight. |
| Performance | Always lightweight. |
| Quality | Prefer the supported shader camera; otherwise lightweight. |

Only `PiP Rendering Mode` (0/1/2) is a new player graphics preference. Thermal
characteristics are never exposed as graphics preferences. Mode changes cannot
select a different thermal pipeline or change its device limits.

`CameraRenderManager.ShaderCamera` is the optional renderer boundary. A provider
must implement a genuine secondary view with private writable targets, camera
uniforms, history/parity/jitter/exposure, and failure cleanup. `isSupported()`
must be false without an active supported pack. Registration is client/render
thread only. Invalid target dimensions/IDs or provider exceptions select the
lightweight fallback; failures are not retried every frame until reloaded.
An interface alone is not a delivered shader-pack backend implementation.

`backendDescription()`, `renderedFrames()`, and `renderCpuNanos()` expose camera
diagnostics for profiling; counts/times include attempted admitted renders.
They are not GPU timing or a measured gameplay FPS improvement.

## Content profiles

All currently implemented FMUR thermal devices use gun/item or attachment
definitions. Keep the existing enabling/magnification fields and add fields such
as:

```text
HasThermalVision true
ThermalMaxFPS 15
ThermalResolution 320 256
ThermalGrain 0.08
ThermalPalette WHITE_HOT
ThermalContrast 1.2
ThermalSensitivity 0.85
ThermalBloom 0.5
ThermalGamma 0.82
```

MCHR aircraft, tank, plane, and helicopter definitions support a base profile,
zero-based `cameraPosition` overrides, and seat overrides:

```text
ThermalMaxFPS = 30
ThermalResolution = 640,512
ThermalGrain = 0.04
ThermalPalette = WHITE_HOT
CameraThermalMaxFPS = 0,15
CameraThermalResolution = 0,320,256
CameraThermalPalette = 1,BLACK_HOT
SeatThermalMaxFPS = 1,5
SeatThermalGrain = 1,0.15
```

Every field supports the `Camera` and `Seat` prefixes. Resolution needs width
and height; overrides prepend an index. Precedence is vehicle -> camera -> seat.
The active camera comes from `getCameraPosInfo()`, including passenger-specific
camera positions. A seat camera outside `cameraPosition` inherits the vehicle
profile plus any seat override. Definitions can put overrides before defaults.
Resolved maps are immutable and cached until content changes/reloads.
Special devices without an aircraft definition (for example GLTD) currently
receive the default profile, not a new independent content schema.

| Field | Default | Validation / meaning |
| --- | --- | --- |
| ThermalMaxFPS | 30 | Integer 1-240; maximum actual acquisition/processing rate. |
| ThermalResolution | 640 512 | Integer width/height, each 64-2048; real private target size. |
| ThermalGrain | 0 | Finite 0-1; sample-locked noise amplitude. |
| ThermalPalette | WHITE_HOT | WHITE_HOT, BLACK_HOT, IRONBOW, GREEN. |
| ThermalContrast | 1 | Finite 0.1-4; sensor response contrast. |
| ThermalSensitivity | 1 | Finite 0.1-4; sensor response gain. |
| ThermalBloom | 1 | Finite 0-4; existing depth/cover-aware sun bloom strength. |
| ThermalGamma | 0.82 | Finite 0.1-4; environment response curve. |

This bloom control retains the existing sun/cover effect; it is not a newly
implemented multi-pass heat-source blur. Additional physical sensor behavior
such as response-time accumulation/range attenuation is not implemented.

Invalid profiles are rejected at the loader/API boundary. FMUR's established
line loader logs a bad field and retains the prior safe immutable profile;
MCHR rejects malformed fields. Missing fields receive documented defaults,
never an unlimited rate. This is ordinary content-pack enforcement, not
anti-cheat protection against edited clients/packs. Server pack/profile hash
synchronization was not introduced and remains a separate protocol decision.

## Compatibility effects

- Genuine magnification and existing `Magnification`/legacy zoom identifiers are
  preserved; physical aperture calibration still needs in-game measurement.
- Default thermal cadence changes from every-other-display-frame to at most 30
  samples/second, with a default 640x512 sensor. A slow game may undershoot the
  maximum. At game FPS below 60, the new cadence can sample more often than the
  old alternating path; no net FPS benefit is assumed without measurement.
- The optional FMUR thermal bridge stays API version 1 with additive sensor and
  profile supplier registration. MCHR depends on no FMUR classes at compile time.
  Use both updated mods for complete camera/seat profiles. An older companion
  lacks the new fields/registration and falls back to available defaults.
- MCHR's third camera mode now requires the shared sensor. The unlimited legacy
  `thermal` postprocess is no longer selected. Disabling shaders cannot replace
  a limited device with an unrestricted postprocess. Standalone MCHR therefore
  loses legacy thermal mode when the shared FMUR sensor is absent; normal/night
  vision modes retain their existing paths.
- The existing client capability bit advertises shared thermal support instead
  of legacy postprocess shader support. Packet IDs, size, bit position, decoding,
  NBT, registry identifiers, and saves do not change.
- Every ordinary build includes FMUR's optional Angelica runtime adapter. Pinned
  compile-only libraries resolve from Maven unless `angelicaCompileJar` supplies
  a local binary and its sibling libraries. The jar task verifies both adapter
  classes are present. Angelica and its libraries are not bundled; vanilla clients
  and dedicated servers do not load the adapter. Earlier builds without the flag
  omitted it and displayed CAMERA UNAVAILABLE in Angelica instances.
- Direct `jar` builds now finalize with Forge reobfuscation. The remapped artifact
  is checked for known workbench runtime mappings to prevent distributing the
  development names responsible for the subsequent `Material.iron` startup crash.
- Normal camera sky uses a sky-color clear and independent sun-texture draw. Pack clouds, pack shadows/postprocess
  and weather geometry are not drawn by the lightweight pass.
  Entities, tile entities, alpha terrain, particles and explicit LOD callbacks
  are drawn without a second main-world event pass.

## Changed files and responsibilities

Production Java paths are relative to each repository's `src/main/java` unless
another prefix is shown.

| Repository / file | Why changed |
| --- | --- |
| FMUR `client/CameraRenderManager.java` | Shared camera lifecycle, backend choice/provider boundary, diagnostics. |
| FMUR `client/CameraView.java` | Capture and narrow projection with private frustum math. |
| FMUR `client/CameraTerrain.java` | Uploaded-geometry provider contract. |
| FMUR `client/VanillaCameraTerrain.java` | Read-only compiled-list submission and private culling. |
| FMUR `client/DistantCameraGeometry.java` | Optional read-only DH vertex/index borrowing, private material and actor-compatible distant depth, with buffer lifetime locks. |
| FMUR `client/LightweightCamera.java` | Private target and minimum world passes without main-renderer recursion. |
| FMUR `src/angelica/java/.../AngelicaCameraTerrain.java` | Optional Celeritas mesh adapter with private lists, programs, batches, VAOs and index resources. Never publishes private resources into primary region caches. |
| FMUR `client/ThermalScopeEffect.java` | Replace recursive camera/primary-image fallback; schedule and composite real camera samples. |
| FMUR `client/ThermalCamera.java` | Content-driven effects and sample-seeded grain; sensor resource cleanup. |
| FMUR `client/ThermalFramebuffers.java` | Release sensor-owned copied depth on invalidation. |
| FMUR `client/ThermalRenderApi.java` | Optional immutable vehicle profiles and explicit camera geometry replay. |
| FMUR `client/ThermalSensorClock.java` | Shared per-definition monotonic admission from the first milestone. |
| FMUR `common/guns/ThermalProfile.java` | Immutable validated full profile. |
| FMUR `common/guns/type/GunType.java` | Parse gun/binocular thermal profile fields. |
| FMUR `common/guns/type/AttachmentType.java` | Parse attachment profile fields. |
| FMUR `client/MCHeliScopeMarkerCompat.java` | Scale private-camera marker coordinates into the existing logical HUD. |
| FMUR `client/ClientProxy.java` | Register camera resource-reload cleanup at the existing client boundary. |
| FMUR `client/gui/GuiModOptions.java` | Rendering mode button/save, with no thermal graphics controls. |
| FMUR `common/FlansMod.java` | Load the bounded client rendering-mode preference. |
| FMUR `build.gradle` | Always compile/package the optional runtime adapter; pinned compile-only inputs or local override, and jar entry validation. |
| FMUR `tools/player_lod_checks/java/.../ThermalSensorChecks.java` | Profile validation and deterministic admission regressions. |
| FMUR `tools/player_lod_checks/java/.../ThermalGpuChecks.java` | Real projection/list submission, private flags, palette/gain/noise, held output and existing GPU regressions. |
| MCHR `MCH_ThermalProfiles.java` | Validate/inherit/cache vehicle, camera and seat content data. |
| MCHR `aircraft/MCH_AircraftInfo.java` | Read profiles, resolve active camera/seat inheritance, clear on reload. |
| MCHR `render/MCH_FMURThermal.java` | Supply resolved profiles and stable sensor identities through the optional bridge. |
| MCHR `wrapper/W_EntityRenderer.java` | Shared thermal capability independent of the shader preference. |
| MCHR `aircraft/MCH_EntityAircraft.java` | Use shared thermal capability in existing camera setup. |
| MCHR `aircraft/MCH_PacketNotifyClientSetting.java` | Advertise that capability through the existing bit. |
| MCHR `MCH_ClientCommonTickHandler.java` | Stop selecting the unrestricted thermal postprocess fallback. |
| MCHR `multiplay/MCH_GuiTargetMarker.java` | Accept explicit camera HUD dimensions, preserving icon aspect on rectangular sensor targets. |
| MCHR `src/test/java/mcheli/aircraft/MCH_ThermalProfileTest.java` | Defaults, malformed input, reload, camera/seat inheritance and immutable maps. |
| FMUR this document | Implementation, limitations, validation, compatibility and remaining work. |

## Validation

Java 8, Windows. Ordinary FMUR `compileJava jar` with Maven compile-only libraries
and the local Angelica override both pass. The full MCHR `compileJava test`
suite passes: **172 tests, zero failures/errors/skips**.

The current FMUR offscreen suite passes **15,822 profile/admission assertions**
and **442 GPU/compatibility assertions**. It verifies actual compiled-list draws
with a 4x narrower projection and unchanged primary visibility/occlusion flags,
held sensor output, palette inversion/color, gain, sample-locked noise and
player-lightmap-independent sensor illumination, actual installed DH buffer ABI,
private DH material draws beyond the vanilla far plane, matching terrain/actor
depth, nonblocking buffer locks and borrowed GPU ownership, plus
the actual installed Iris terrain shader/layout (yellow pixels before the
missing-AO correction, expected color afterward), and independent sun rendering,
the existing smoke/emission/depth/LOD/aperture fixtures. Some historical checks
still exercise the old unused compatibility helper with a simulated Iris
manager; they are not validation of a new shader-integrated camera.
The existing five-class player LOD server-boundary audit also passes; it is
not a dedicated-server launch or a complete audit of all mod classes.

Example local-override validation command (substitute the local instance path):

```powershell
$env:JAVA_HOME = 'C:\Program Files\Eclipse Adoptium\jdk-8.0.462.8-hotspot'
./gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks `
  '-PangelicaCompileJar=C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/mods/angelica-2.2.14.jar' `
  '-PlwjglNatives=build/player-lod-checks/natives' `
  '-PmchrRuntime=../SRC-MCHELI-R-WDG-Edition/build/classes/java/main' `
  '-PangelicaRuntime=C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/mods/angelica-2.2.14.jar' `
  '-PdhRuntime=C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/mods/DistantHorizons-upstream-preview-6-feature-dh-3-3-wdg.25+b5f617e8cb.jar'
```

The override reads that instance's existing sibling `falsepattern` JOML, fastutil
and Java-8 JVM-downgrader API jars. Without an override, the same pinned compile
libraries resolve from Maven on the first online build; subsequent builds may
use `--offline`. They are compile-only and not bundled with FMUR. Build
configuration warnings/deprecation/unchecked warnings and existing test-fixture
Unsafe warnings remain.

No native macOS/Linux or complete shader-pack game was run. No release jars
were installed, no build identifiers changed, and no commits/pushes/uploads
were made. See the latest final report for rerun counts after any later edits.

## Review and remaining work

B1: main-renderer recursion, primary-image preservation and shader histories
were on the hot path. Addressed by private geometry submission and camera
projection; the old helper is unused by the camera path.

B2: per-display thermal processing and graphics/backend settings could bypass a
device. Addressed by monotonic admission, native target dimensions, immutable
content effects, cached output, and removal of MCHR's unlimited fallback.

B3: sharing Celeritas region draw caches/VAOs would publish private camera
visibility or private index references into the primary renderer. Addressed by
private batches/VAOs and explicit per-sample cleanup. Geometry buffers remain
borrowed. New CPU/GPU command allocation overhead still needs profiling.

B4: existing marker HUD math assumed window dimensions, distorting markers in
native rectangular camera targets. Addressed by explicit logical camera viewport
dimensions and a small optional MCHR presentation entry point.

T1: resolved by the user's stock compatibility choice. The shader-provider
boundary remains available, but stock Automatic/Quality intentionally fall back.
An actual shader-pack provider would require a separately authorized dependency
extension and must not be claimed as implemented here.

T2: DH buffer borrowing implemented and covered by installed-interface and GPU
fixtures. Validate actual transformed runtime, primary list coverage during turns,
transparent terrain, load/unload, distant target occlusion and terrain seams.

T3: full runtime acceptance and performance measurements. Required scenarios:

1. Vanilla/no shaders: ordinary PiP and thermal at several magnifications;
   5/15/30/60 FPS devices; native 320x256 and 640x512 output; changing game FPS.
   Compare a distant resolution target against the 1x view. Recheck reticles,
   aperture, M40 size, recoil alignment, markers, smoke, explosions and cover.
2. Installed Angelica/Celeritas with shaders off/on: all three menu modes, first
   ADS, sustained firing, movement/turning, translucent terrain, nearby and far
   entities, borrowed-buffer lifetime and primary chunk updates. Quality must
   truthfully fall back while no provider is registered.
3. Vehicle, passenger, camera and UAV transitions with different camera/seat
   profiles. Disabling shaders must not remove grain or raise device limits.
   Removing/invalidating the shared sensor must not enable legacy thermal.
4. Resize/fullscreen/Retina, reload, shader toggles, disconnect/reconnect and
   world changes. No cross-device stale images or early samples; resources must
   return to a bounded steady state. Verify marker scaling on rectangular sensors.
5. Native Windows, M4 macOS and Linux contexts with packs off/on using the chosen
   lightweight fallback. Capability-path fixtures are not native OS tests.
6. Record no-PiP versus each backend's CPU frame time, GPU time, 1% lows, sample
   counts, allocations and chunk build/upload activity in identical quiet/dense
   combat scenes. The public CPU counters are only one part of that evidence.

Runtime/release verdict: **pending T2/T3 in-game acceptance**. Stock-compatible
implementation and automated checks do not establish native OS compatibility,
pack compatibility, visual parity, or the requested FPS improvement on their own.
