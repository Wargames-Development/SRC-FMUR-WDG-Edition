# Scope lighting, weather, sky and fog: implementation plan

Status: source investigation completed against FMUR's current scope implementation, Angelica X6 source, WGQOL weather source, the local Forge 1.7.10 renderer source and the installed BountifulStars water-input-probe shader archive. Rendering code is not changed by this document. This is not visual acceptance of a fix.

## What is established

### Lighting and distant fog share a missing render stage

FMUR `ShaderScopeScene.draw` submits native terrain into Angelica's private shader pipeline. Angelica `FlansScopePass.render` finalizes that pipeline before calling FMUR `drawForward`, which draws borrowed DH terrain and player/MCHELI presentation. `DistantCameraGeometry` applies the vanilla lightmap, its own texture/colour handling and compressed auxiliary depth. It does not run the pack's DH terrain program.

Angelica `IrisSamplers` binds `dhDepthTex`, `dhDepthTex0` and `dhDepthTex1` to `getSecondaryDistantDepth` for the scope. `FlansScopePass` supplies a private depth texture cleared to 1, representing no distant surface. The scope's real distant geometry arrives only after the pack has finished.

The installed pack makes the consequences explicit:

- `shaders/program/dh_terrain.glsl` runs `DoLighting` on DH geometry.
- `shaders/program/deferred1.glsl`, lines 313–349, reads `dhDepthTex`, requires a value below 1, reconstructs the distant position with `dhProjectionInverse`, then applies LOD shadows and `DoFog`.
- `shaders/program/composite1.glsl` also reconstructs distant positions from opaque/translucent DH depths for atmosphere, water and volumetric processing.
- `shaders/lib/atmospherics/fog/mainFog.glsl` contains separate atmospheric, border, cave and medium fog terms. Its atmospheric colour includes a day/night blend and rain dependence. WGQOL's local ground mist is a different effect.

This establishes why the forward distant layer misses shader lighting/fog processing. It does not establish which combination of atmospheric terms produced every pixel in the user's screenshot. The current local options sidecar has no explicit fog override; it is not a saved options snapshot from the screenshot's session.

Simply moving the existing forward draw before finalization is insufficient: its depth encoding and shader outputs do not match the pack's DH contract. A brightness multiplier cannot restore depth-dependent atmosphere, shadows or material response.

### Weather is drawn by a different owner

Both FMUR scope paths invoke `CameraWeather.render`, which generates vanilla-style rain/snow columns and explicitly binds program 0. Shader scope phase selection alone therefore does not make that implementation shader-pack weather.

WGQOL `WeatherEffects` owns its own bounded, ticked population: rain, snow, ripples, wall streaks, mist, dust and sand haze. These are not ordinary Minecraft effect-renderer particles. It integrates through the Forge weather renderer or its HBM Earth bridge, and deliberately uses the shader particle phase because BountifulStars' precipitation-sheet pass is unsuitable for these individual quads.

A bridge must run before FMUR's `rainStrength <= 0` early return: WGQOL can retain mist after rain ends. It must report ownership separately from the number of visible particles so a temporarily empty WGQOL population does not cause a duplicate vanilla weather layer.

### The unshaded sky is incomplete

`LightweightCamera` clears to sky colour and draws a single sun quad. There is no moon, star field or dimension sky-handler submission. The shader scope calls `RenderGlobal.renderSky`, which dispatches the active Forge sky renderer. This difference explains missing moon/stars and custom sky content.

Forge's actual `RenderGlobal.renderSky` handles custom providers first, then the End and vanilla surface sky. HBM's `SkyProviderCelestial` supplies its own celestial bodies, star presentation and fog handling. Reimplementing only vanilla moon/stars would still omit the world's actual sky.

The sun already has a lightweight draw and a GPU check, so the reported absent sun needs a real-world check of the provider, orientation, clipping and texture/state; its absence cannot be attributed solely to a missing sun function.

## Recommended implementation order

### 1. Ordinary scope sky and shared weather

Bound this patch to sky/weather rendering in ordinary colour scopes. Preserve thermal sensor gain, thermal sky classification and vehicle camera behavior until their specific checks are run.

- Add an isolated sky submission for the lightweight colour scope, invoking the existing world sky renderer with scope magnification, a rotation-only sky model-view and a suitable sky projection. Save and restore matrices, texture/lightmap state, program, viewport, framebuffer, depth and draw/read buffers on every exit. Native sky geometry uses distances around 100; the current sun fixture's short far plane must not clip the replacement. No extra world render, simulation, chunk generation or artificial time update.
- Reuse WGQOL's existing weather population through a narrow optional render-only bridge. Ordinary Forge ownership and HBM Earth ownership both need coverage. Keep the population's tick/spawn lifecycle unchanged. Retain `CameraWeather` when WGQOL is absent or does not own weather.
- Render WGQOL's shadered quads in the scope's balanced particle phase, not the pack's vanilla rain-sheet phase. The lightweight/fallback path must remain isolated from primary shader program selection. Decide the explicit bridge's isolation contract before calling the existing renderer blindly: `WeatherEffects.render` currently enters shader hooks and disables the lightmap on exit.
- Do not replay the player's windscreen HUD as world weather in the scope. That is a separate screen-space effect.

Tests: no-mod/disabled fallback, Forge and HBM ownership, empty populations, after-rain mist, no double precipitation, unchanged particle count/age and primary pixels, cover/depth, magnification, day/night sky, moon phases, resource reload and failure restoration. Use the existing focused GPU fixture and real companion boundaries; fixture-only success does not certify a custom provider in-game.

### 2. Private DH terrain shader integration

Keep the established lightweight fallback. Extend the existing scope contract additively, with explicit capability negotiation; older API v1 companions must continue to work.

- Give the private scope real opaque/translucent DH depth targets, cleared every sample and resized/disposed with the scope.
- Compile scope-owned pack DH terrain/water programs and use the scope's projection, model-view, frame history and depth textures. Reuse the existing DH mesh upload data under its read locks; retain bounded zoom-refinement requests. Do not invoke another primary DH render or mutate its visibility lists.
- Submit DH geometry at the correct opaque/translucent stages before deferred/composite processing. Apply native/LOD ownership in compatible physical projections, retaining one surface per pixel and valid foreground occlusion.
- Bind actual private DH depth to the pack's `dhDepthTex*` samplers and matching scope DH matrix uniforms. Preserve separate opaque and translucent semantics.
- Preserve a fallback for unsupported DH programs/resources. Preserve all existing protection against writing primary or borrowed shadow resources.

Important constraint: do not instantiate `DHCompatInternal` unchanged as a scope shortcut. Its constructor sizes textures from the main framebuffer; its cleanup unbinds DH global override registrations. A private scope must own those resources without touching the primary override lifecycle. Existing low-level program/framebuffer creation is a candidate for reuse after its ownership is separated.

Tests: actual supported pack compilation; opaque/water depth reconstruction; native/LOD overlap and foreground edges; fog distance and night/rain response; primary texture/pixel/matrix/history invariance across eight jitter phases; scope open/close, resize, shader toggle, pack reload, reconnect and dimension change. Measure steady-state GPU time separately from first-use shader compilation.

### 3. Player and vehicle shader appearance

After terrain/depth parity works, add actor material/normal/depth integration compatible with the private pack pipeline. Rendering an already lightmapped actor colour through a second lighting pass can double-light it. Preserve the working native/LOD ownership and motion stability, and measure temporal behavior before changing the material-254 TAA bypass.

The main-view darker tank transition uses the shared DH model capture/compositor, so it also needs a DH actor lighting change; FMUR scope terrain work alone does not fix that main-view symptom. Treat this as a subsequent bounded cross-mod patch rather than claiming terrain parity proves actor parity.

## Fog acceptance experiment

Use a fixed position, time, biome, weather strength and supported shader pack. Record settings with each comparison; do not assume the current sidecar reproduces the old screenshot.

1. Compare main view and ordinary PiP at the same scene, identifying native geometry, the native/LOD boundary and distant-only pixels.
2. Toggle only WGQOL mist while leaving shader settings fixed. This isolates the custom local weather contribution.
3. Restore that setting and toggle only the pack's atmospheric fog. Test border/bloom/volumetric terms separately if the residual difference persists.
4. Repeat clear day, clear night and rain. Check a known distant landmark rather than judging the sky alone.

Expected result after stage 2: distant scope surfaces contribute their actual distances to shader fog; the sky no longer stands in for all distant-depth pixels. WGQOL mist remains a local contribution with its normal radius/age and follows its own switch.

## Versions and release boundaries

Start from the current checkout metadata, Angelica X6 and FMUR X206, not old handoff counters. Documentation alone changes no versions. Use each repository's existing semantic/build rules for actual patches and successful packaging; do not reset or manually manufacture `_X` counters. If WGQOL gains a compatible public integration entry point, classify that extension under its AGENTS.md and update its changelog/version once for the logical release batch.

Keep all implementation on feature branches, review Git changes and perform any commits/pushes in GitHub Desktop, and require paired in-game acceptance before main/default-branch promotion. No deployment, shader-setting change or version bump is performed by this plan.
