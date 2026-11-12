# Ordinary scope sky and WGQOL weather candidate

This is stage 1 of the [scope parity plan](scope-lighting-weather-sky-plan-2026-11-11.md). Implementation and automated regression checks pass. Full Minecraft/modpack visual acceptance is still required. No client or server installation is performed.

## Rollback and branches

Before changing rendering, GitHub Desktop saved local rollback checkpoints:

- FMUR `2b9bd49` on `barrack-AngelicaAPI`, retaining the packaged X206 scope baseline and its known limitations.
- Angelica `abe4bbe7` on `codex/angelica-2.2.14-pip`, retaining X6 private scope rendering, repeated depth clearing and window draw-buffer restoration.

The new patch is isolated on FMUR `codex/scope-sky-weather` and WGQOL `codex/scope-weather-replay`, based on their existing working baselines. No main/default branch is promoted. Angelica source is unchanged after its rollback checkpoint. WorldBorder, DH and MCHELI source are untouched by this patch. The checkpoints were committed locally; no push is performed in this stage.

## Changes and ownership

- FMUR `CameraRenderManager` selects the new environment path only for non-thermal model lenses, excluding FLIR. Thermal and non-model camera paths retain their existing sun/precipitation behavior. Resource reload/world changes reset optional weather discovery and sky failure state.
- FMUR `CameraSky` calls the actual `RenderGlobal.renderSky`, preserving Forge's dimension sky-handler dispatch, native moon phases, stars and resource-pack sky textures. Its sky-only projection retains lens magnification/off-axis terms while extending the near/far range; its model-view removes camera translation. It draws before terrain and keeps sky depth at the background. Matrices, texture matrices, framebuffer bindings, GL attributes and program are restored even on exceptions. An unsupported sky provider yields to the previous lightweight sky until reload, without disabling the camera or repeatedly invoking the failing provider.
- FMUR `CameraWeather.renderColour` optionally discovers WGQOL `renderCameraWeatherV1`. Missing/older/disabled WGQOL retains the existing vanilla-style scope precipitation. A failed replay rejects that partially drawn sample, disables the optional bridge until reload/world change and permits vanilla on subsequent samples. Both the lightweight and shader camera can recover without permanently disabling their backend.
- FMUR `ShaderScopeScene` uses the same optional weather replay inside its private shader scene. WGQOL enters and balances the particle phase, which matches its main-view rendering choice; the original vanilla rain-sheet fallback remains available.
- WGQOL `WeatherEffects.renderCameraWeatherV1(float, boolean)` replays its existing, tick-owned population. It validates current-world/provider ownership, supports the established HBM Earth bridge, and reports ownership even when the population is empty. It performs no sync, tick, spawn, provider replacement or main-render diagnostic update. The caller owns the lightmap and same-eye camera matrices. Lightweight replay avoids shader phase hooks; shadered replay uses the existing balanced hooks. Native weather calls retain their previous lightmap/phase path.

The player's windscreen overlay is not replayed as world weather. No packet, gameplay, persistence, configuration or registry contract changes. This patch does not add distant shader lighting/material/fog processing; those remain stages 2 and 3.

## Validation

- FMUR Java 8 compilation and opt-in camera/LOD checks pass: **35** auxiliary ownership checks, **10,110** LOD/packet/projection assertions, **2,030** external presentation assertions and server/data classloading boundaries.
- New `cameraEnvironmentChecks`: **121** real offscreen OpenGL/companion assertions. It calls actual Forge `RenderGlobal.renderSky` for native moon atlas phase pixels and star-list visibility, tests custom sky dispatch/magnification beyond a short terrain far plane, background depth, matrix/texture/framebuffer restoration and provider failure/reload recovery. Its WGQOL portion loads the actual development classes and tests after-rain mist, empty-population ownership, foreground depth, unchanged ages/population/ticks, caller lightmap ownership, balanced shader hooks, disabled/foreign-world/provider rejection and resource-failure recovery. HBM setter-ignoring ownership uses an in-memory provider double with the real policy identities, not a complete HBM game launch. Shader phase hooks are instrumented; this does not reproduce a transformed Angelica shaderpack execution.
- Existing GPU regressions pass: **155** scope native/LOD terrain checks, **295** particle/heat/smoke/NVG checks and **15,822** thermal profile/admission checks.
- WGQOL `compileJava test verifyVersionMetadata` passes. Its normal production `build` passes, including side separation, metadata and remapping checks: **170 tests**, zero failures/errors, **7 optional cases skipped**.
- FMUR normal production packaging/remapping passes. Both final jar CRC/metadata checks pass; WGQOL's optional method is present and no test fixtures are bundled. Relative to the packaged FMUR X206 baseline, only the camera manager, weather, lightweight camera (including its compiler-generated particle callback), shader scene and version-bearing mod class change, plus the new `CameraSky`. WGQOL changes only `WeatherEffects` and its version-bearing mod class relative to X50. No classes are removed.

Tests initially caught a fixture field-access mismatch and a fixture-only Forge mod-initialization issue in a failure diagnostic. They were corrected before the successful runs. Review also corrected permanent camera failure after optional weather errors and added legacy-sky fallback for failing custom sky providers. The logged injected weather/sky exceptions in the GPU fixture are expected negative controls.

Reproduce the new focused check with Java 8:

```text
bash ./gradlew cameraEnvironmentChecks -I tools/player_lod_checks.gradle \
  -PlwjglNatives=/tmp/fmur-nvg-natives \
  -PwgqolRuntime=/Users/rhysh/Documents/GitHub/WGQOL/build/classes/java/main --offline
```

## Candidate versions

Use existing Angelica **2.2.14_X6** and DH **3.3.4_X71** with the paired FMUR/WGQOL candidate. The WGQOL optional integration is a compatible public extension, so its repository's version policy selects **1.16.0**, resetting patch to zero and preserving the independent counter. Its successful normal build advances X50 to **X51**. FMUR retains its existing **1.8.06** scope-development batch and normal package counter: X207 was an intermediate before custom-sky failure recovery; the final package advances to **X208-pip-scope-test**. No build-number override or manual counter increment is used.

- FMUR: `build/libs/FMUR-WDG-Edition-1.8.06_X208-pip-scope-test.jar`; SHA-256 `a3ef8a9bfea19de3776f387f2defb9c63e977283bb38c5e751497d722dfa4b91`.
- WGQOL: sibling repository `build/libs/WGQOL-1.16.0_X51.jar`; SHA-256 `e0afc6565ff1cba1e23a539edcfbf84ce6d0952e7d1f88fc112ceb09a38083f0`.

## In-game acceptance

Restart with the paired candidates; do not replace live jars. Check ordinary colour model scopes in Automatic/Quality and Performance modes, with shaders off and on:

1. Compare sun, moon phases, stars and the active dimension/resource-pack sky at several magnifications. Check sky direction and foreground terrain/building occlusion. Include the actual HBM Earth sky provider.
2. Compare WGQOL rain/snow, wet-biome mist after rain ends, dry-biome dust/haze, ripples and wall streaks. Check weather master/effect switches, roofs, foreground blocks and an empty population. Older/absent WGQOL should retain vanilla-style precipitation.
3. Open/hold/close the scope repeatedly while another player and a vehicle move across the native/LOD boundary. Recheck primary rendering for duplicates, trails, flicker and persistent state changes.
4. Reload resources, toggle shaders, resize, reconnect and change dimensions. Recheck thermal/FLIR and vehicle cameras against the rollback baseline. Repeat on Windows as well as macOS.

Automated fixtures do not certify every third-party sky provider, shader pack, mod transformation or live performance budget. The missing distant shader fog/lighting transition is still expected until the next planned stage is implemented.
