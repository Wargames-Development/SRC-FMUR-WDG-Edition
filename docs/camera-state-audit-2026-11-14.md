# Rendering state and intermittent visibility audit — 2026-11-14

## Scope and evidence

This pass addresses missing PiP/thermal terrain, intermittent vehicles, and apparent
waypoint/vehicle displacement. It follows the current request to audit **and fix**;
the historical read-only restriction in Downloads/PiP Audit/findings.md is not a
restriction on this later implementation request. Existing uncommitted migration
work and unrelated shader-pack assets were preserved.

Inspected FMUR, MCHR, Angelica, WGMap and the existing DH migration worktree.
The instance currently contains DH X78, Angelica X12, FMUR X215 and the MCHR X214
directory. The older child log (`lwjgl3ify-java21-child.log.1`) includes successful
shader scope phases and, at 13:06:33, `[Camera] Unavailable: DH geometry unavailable:`
without a reason. Its actor diagnostics alternate between zero and one candidate;
a `composited=1` counter establishes submission, not visible pixels. The current
`latest.log` is from the restarted session and cannot reconstruct the failed frame.

There are two confirmed source defects below and one diagnostic gap. The exact
five screenshot frames were not reproduced or captured with matrix telemetry.
Their complete causal attribution remains **T3**, not a claim that restarting or
these changes prove every intermittent symptom eliminated.

## Trace and findings

### B7 — scene uniform restoration overwrites the live matrix stacks (fixed)

FMUR `TickHandlerClient.captureScopeWorldLast` captures a camera before HUD
rendering. `ThermalScopeEffect.renderScopedWorld` later renders a private view.
Non-shader/thermal cameras use `ThermalRenderApi.beginIsolatedGeometry`, which
also serves DH's shaderless actor model capture through `FmurPlayerBridge`.
Its `ScopeRenderCompatibility` guard saves and restores Iris/Angelica scene state.

`RenderingState` stores the world matrices used by shader uniforms. GLSM's live
matrix stacks can legitimately differ: local model transforms, model depth
projections, sky transforms and the GUI all use those stacks. The old
`restoreRenderingState` restored the saved scene and then passed its matrices to
`GLStateManager.setProjectionMatrix/setModelViewMatrix`, overwriting the caller's
restored live transforms. The comment claiming raw matrix pops bypass GLSM was
incorrect for this Angelica version: `GLSMRedirector` redirects `glLoadMatrix`,
`glPushMatrix` and `glPopMatrix`.

The fix restores only the scene state owned by this guard. Existing caller-owned
push/pop pairs continue to restore the live stacks. Removed four unnecessary
reflection handles and their setup/cleanup. No new camera abstraction, repeated
matrix copies, bypassed depth test or world-coordinate mutation was introduced.

The regression executes the actual private production capture/restore methods,
with a minimal substitute for the optional reflected scene/GLSM API and a real
Windows LWJGL 2 OpenGL context. Scene and live matrices deliberately differ.
Before correction, even after the caller popped its stacks, expected live
translation 500 became scene translation 300. After correction, 320 checks pass
over 40 changing views, nested captures, exception cleanup, FOV and matrix mode.
This is a boundary regression, not a full Angelica-transformed Minecraft launch.

The additional Angelica `FmurCameraStateGLTest` loads the actual companion jar,
applies Angelica's real `GLSMRedirector`, and exercises the production guard with
the real `RenderingState` and GLSM matrix stacks in the core-profile fixture.
The installed X215 jar fails with `live projection replaced by the world snapshot`;
X216 passes across 24 views, alternating capture/GUI projections and exception
cleanup. This confirms the defect against the real integration, while remaining
a focused GL test rather than a full Minecraft gameplay reproduction.

### B8 — legacy MCHR culling precedes DH's camera-specific physical culling (fixed)

`ActorRenderer.draw` collects authorized companion geometry; secondary cameras
collect it through `ThermalRenderApi.renderCameraGeometry`. MCHR's shared
`MCH_RenderFarVehicle.render` still built a vanilla `Frustrum` from current GL
state and tested a compressed legacy position with legacy bounds before submitting
to DH. That projection/position is not the physical capture that will be drawn.
The collection boundary does not guarantee that current GL state is DH's captured
world projection, especially around shader composite and private-camera work.

Under the DH visual API, MCHR now submits the candidate after the existing
authorization, tracked-pose, destruction and configured-range checks. DH's
`ActorRenderer`/`ActorCameraPass` performs the actual `ModelBounds.project` against
the captured primary/secondary MVP and conservative model envelope, followed by
terrain provenance, capture and per-fragment occlusion. The old frustum test is
retained when DH does not own visual rendering. No terrain visibility permission
is broadened. Extra candidates remain subject to the existing bounded DH queue.

This removes a confirmed mismatched culling boundary. The old screenshot's exact
vehicle rejection is not proven by its logs; candidate counters do not identify
the earlier rejection stage. Existing range/pose/depth tests pass, but the complete
collector-to-DH handoff still needs the manual scenarios below.

### D7 — transient terrain upload failures had empty diagnostics (fixed)

`DistantCameraGeometry` borrows uploaded DH vertex/index buffers under nonblocking
read locks. It correctly rejects an incomplete sample if upload is busy or a
visible container is not uploaded. Those returns did not set `failure`, producing
the empty reason observed in the log. The exact rejected branch is unrecoverable
from that old message.

Added separate retryable reasons for camera mismatch, world transition, pending
terrain upload, vertex/index contention, and unready mesh buffers. These are not
stored in the permanent error latch. Tests explicitly hold both upload locks,
check the reason, release them and draw successfully again without reload. No
blocking wait, forced upload, stale-depth reuse or visibility grace period was added.

## Changed files in this pass

- FMUR `src/main/java/com/flansmod/client/ScopeRenderCompatibility.java`: B7.
- FMUR `src/main/java/com/flansmod/client/DistantCameraGeometry.java`: D7.
- FMUR `tools/player_lod_checks/java/com/flansmod/client/CameraMatrixChecks.java`:
  new matrix ownership regression.
- FMUR `tools/player_lod_checks/java/com/flansmod/client/ThermalGpuChecks.java`:
  upload diagnostic/recovery regression.
- FMUR `tools/player_lod_checks.gradle`: opt-in matrix regression task.
- MCHR `src/main/java/mcheli/render/MCH_RenderFarVehicle.java`: B8.
- Both `gradle.properties`: build system advanced FMUR to X216 and MCHR to X215.
- Angelica `src/test/java/net/coderbot/iris/pipeline/FmurCameraStateGLTest.java`:
  actual companion-jar/GLSM integration regression.
- Angelica `build.gradle.kts`: optional `fmurCameraRuntime` test input. No production
  dependency on FMUR is added; the test skips when no companion artifact is supplied.
- This report. DH and WGMap needed no edits; Angelica runtime code is unchanged.

## Validation

Used the repositories' wrappers, cached dependencies and Forge 1.7.10 mappings.
FMUR/MCHR builds used JDK 8; Angelica's wrapper used JDK 21 and its configured
Java 8 test toolchain. The initial sandboxed Gradle invocation could not access its cache lock;
subsequent authorized offline invocations ran normally.

- Pre-fix `cameraMatrixChecks`: expected FAIL at the scene/live matrix mismatch;
  `build/camera-matrix-before.log`.
- Final FMUR `gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle
  cameraMatrixChecks thermalGpuChecks auxiliaryViewChecks playerLodChecks
  playerLodServerChecks assemble -PlwjglNatives=<cached 1.7.10 natives>`: PASS.
  320 matrix checks, 744 GPU checks, 15,822 thermal admission/profile checks,
  46 auxiliary ownership checks, 10,110 packet/projection/contract checks and the
  server-boundary/visibility checks. Evidence: `build/camera-state-release.log`.
- MCHR `gradlew.bat --offline --no-daemon test --tests '*MCH_VehicleRenderDistanceTest'
  --tests '*MCH_CompressedDepthProjectionTest' --tests '*MCH_VehicleVisualTrackTest'
  --tests '*MCH_FarVehicleDepthLayerLightingTest'`: PASS, 17 tests, no skips.
  `MCHR_LWJGL_NATIVES` pointed to the cached 1.7.10 Windows natives.
  Evidence: `build/camera-culling-checks.log` and JUnit XML.
- MCHR `gradlew.bat --offline --no-daemon assemble`: PASS, runtime remapping and
  packaging verifier passed; `build/camera-culling-release.log`.
- Angelica `gradlew.bat --offline --no-daemon :glCoreTest
  -PfmurCameraRuntime=<installed X215 jar> --tests '*FmurCameraStateGLTest'`:
  expected FAIL, reproducing B7 with actual GLSM. Evidence:
  `build/fmur-matrix-integration-before.log`.
- Angelica `gradlew.bat --offline --no-daemon :glCoreTest
  -PfmurCameraRuntime=<built X216 jar>`: PASS, 29 passed and one optional
  local-shader-pack compile test skipped (no `angelica.scopePack` provided).
  Includes the real FMUR regression, terrain, actor and scope compositor tests.
  Evidence: `build/fmur-matrix-integration-after.log` and JUnit XML.
  An earlier unqualified `glCoreTest` invocation selected the additional glsm
  subproject and failed on an uncached dependency in offline mode; `:glCoreTest`
  selects the intended root suite without changing dependencies.
- `git diff --check`: PASS in all three changed repositories. Jar metadata, runtime
  camera adapter and removal of the old matrix-override fields verified. No test
  classes, workspace/cache directories or logs included. FMUR's production
  `com/flansmod/common/tools` package is intentionally present.

Runtime jars are in each repository's `build/libs`:

| Jar | SHA-256 |
| --- | --- |
| FMUR-WDG-Edition-1.8.08_X216.jar | 2889f79334a390a30bd951208485932f69809687c3a1e50f8db231a5d23fdf01 |
| MCHELI-R-WDG-Edition-1.9.01_X215.jar | b499713fb14f6a91230c7dd395d2d419797eb1fe9e5fa9a4efd9ab2d13fd844e |

The artifacts include the existing migration changes in these worktrees. Keep
DH X78 and Angelica X12. The Prism instance was not modified in this pass.
MCHR uses an extracted content directory in this instance; retain its content
assets and avoid loading old and new MCHR classes simultaneously when updating.

## Windows, Linux and macOS portability

The changed runtime classes are Java 8 bytecode (major version 52). Neither jar
adds bundled native libraries. The fixes introduce no OS detection, native calls,
filesystem assumptions, newer GL requirements or changes to existing framebuffer
and depth capability fallbacks. Nonblocking terrain-upload locking remains Java 8
`StampedLock`. Removing the duplicate matrix writes also avoids dependence on
driver-side fixed-function stacks: Angelica's core-profile fixture exercises its
emulated GLSM stacks using the actual redirected companion class.

Windows validation above ran locally. The core fixture requests a forward-compatible
OpenGL 3.3 context with DSA disabled; this is useful coverage of the core path used
on macOS but is not an Apple driver or macOS test. Linux and macOS live execution,
including Intel/AMD/Apple GPU differences, remains T3. No assertion of universal
shader-pack or GPU compatibility follows from these tests.

On Linux/macOS use the existing `./gradlew` wrapper, supply host-matching natives
for the FMUR `lwjglNatives` property and MCHR `MCHR_LWJGL_NATIVES` environment
variable, and run the same focused tasks. Angelica's cross-repository test accepts
`./gradlew :glCoreTest -PfmurCameraRuntime=/absolute/path/to/FMUR-WDG-Edition-1.8.08_X216.jar`.
Omit `--offline` if that machine has not cached the configured dependencies.
The local compatibility-context FMUR check and the Angelica core-context check
cover different backends; also execute the gameplay matrix below on each platform
with the instance's existing platform-appropriate Java/LWJGL launcher setup.

## Review and remaining acceptance

Reviewer verdict: **ACCEPTABLE WITH MINOR ISSUES**, with runtime validation T3
outstanding. B7/B8 and D7 are addressed; no confirmed critical issue remains in
the bounded diff. Dedicated-server review: edits are within existing client
rendering classes; no common entry point or client-class reference was added to
server code. No server world, entity position, packet, config key, saved waypoint,
authorization rule or network identity changed. Java 8 and existing OpenGL APIs
are retained. Linux/macOS runtime and a dedicated-server boot were not executed.

Manual T3 acceptance: in the same saved area, compare the marked tank at 750,
200, 100, 40, 15 and 0–5 blocks, including overhead and partial/full terrain cover.
Repeat normal view, PiP and thermal with shaders on/off. While remaining in the
same session, alternate scopes, look away/back, change shaders, resize, reload
resources and reconnect/change dimension. Confirm the waypoint remains anchored,
the primary view remains intact, terrain fills the optic, covered vehicles remain
hidden and animated aircraft/players still render correctly. Repeat after sustained
terrain generation/upload activity. No automated test here recreates that entire
live sequence or proves a server teleport did not occur in the historical session.

If displacement recurs, capture the affected session's child log before restart
and compare player/server vehicle coordinates to their drawn positions; the new
upload reasons distinguish transient acquisition failures from permanent errors.
Remaining work is that runtime acceptance and the existing broader migration
acceptance gate. No unrelated roadmap features, commits, branches or releases
were created, and WGMap's retained compatibility pipeline was not removed.
