# FMUR DH integration checkpoint — 11 November 2026

Branch: `feature/dh-lods`. This commits the current tested integration source so another developer can work from a reproducible base. It is not a claim that the cross-mod rendering milestone is complete.

## Changes in this checkpoint

- `DistantActorCamera`: optional, client-only DH ActorCameraApi v1 handoff for native and detached actors in private colour/heat views.
- `LightweightCamera`, `ThermalCamera`, `ThermalScopeEffect`: pair camera ownership and cleanup; render actor geometry in the camera's own depth encoding; isolate the private view from the primary Iris pipeline.
- `ThermalRenderApi.beginIsolatedGeometry()`: optional geometry scope used by DH; restores Iris state and sampler bindings, including failure paths and repeated close.
- `DistantCameraGeometry`: use DH block texture atlas/material data in PiP terrain; request bounded asynchronous zoom refinement. This uses the existing reflective DH renderer boundary, not a new terrain store.
- `ThermalGpuChecks`: exercise the public geometry-isolation entry point and focused camera-particle regressions.

Only client rendering and checks change. No packet IDs, server policy, player persistence or weapon definitions change. The server/data classloading checks pass.

## Runtime acceptance versus remaining defects

User-confirmed in the integration scene: guns and NVGs on distant players, vehicle animations, vehicle thermal silhouettes (including with shaders), corrected player torso handoff, and corrected first-person tank/Ka52 view in the companion mods. These confirmations do not establish complete FMUR PiP/player-thermal/native-shader parity.

Latest user report on DH X68 / MCHELI X205 / FMUR X209 / WGMap X165: normal unzoomed operation is smoother, but Angelica zoom still breaks laser designation, including with shaders; shader vehicle model jitter remains and can occur while stationary. These are OPEN cross-mod failures. Do not label the current shader-jitter or zoom work as fixed. No missile firing/watch test is requested; designation must be stable first. Flans third-person ADS animation remains deferred.

## Companion contracts

- DH branch: `feature/mchr-fmur-player-lods`, last packaged X68. `com.seibel.distanthorizons.forge17.effects.ActorCameraApi` v1 owns private actor depth/coverage; `CameraZoom.requestAuxiliaryZoom` is an optional refinement hint.
- MCHELI branch: `feature/dh-lods`, last packaged X205. MCHELI enforces exact client/server mod version strings even for client-only code changes.
- WGMap branch: `feature/migrate-lods`, last packaged X165. Legacy occlusion APIs still exist for other consumers; MCHELI prefers DH when installed.

Do not rename/reorder the actor camera or thermal geometry entry points casually. Keep GL calls on the render thread and preserve the primary pipeline, matrices, FOV and sampler state on every exit. Full shader lighting parity and diagnosis of the remaining zoom/jitter failures belong to the next investigation.

## Validation run immediately before commit

`bash ./gradlew compileJava test -I tools/player_lod_checks.gradle -I /tmp/fmur-current-particle-check.gradle playerLodChecks auxiliaryViewChecks externalPlayerPresentationChecks playerLodServerChecks currentParticleGpuChecks --offline` — PASS.

Results: 10,110 packet/projection/contract assertions; 10 auxiliary-view checks; 2,030 external-player checks; server/data classloading and visibility-policy checks; 15,822 thermal-profile/admission checks; 295 focused GPU camera-particle/isolation checks. The temporary init task only runs existing `ThermalGpuChecks --camera-particles` using Temurin Java 8 and `/tmp/fmur-nvg-natives` on this Mac. It is not a production dependency or committed runtime path. The full legacy Pbuffer GPU suite is not claimed as passing on this platform.

No new jar was packaged or installed during this checkpoint, so build numbers did not change. Runtime shader/zoom acceptance remains pending. The branch is committed locally; no push or release is implied.
