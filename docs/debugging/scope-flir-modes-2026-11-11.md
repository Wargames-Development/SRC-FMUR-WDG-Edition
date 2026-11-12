# Colour versus penetrating FLIR acquisition

## Acceptance and clarified requirements

After X208, the user confirmed sun/moon/stars in ordinary PiP, visible rain in both scopes and no freezes. WGQOL mist remains visually unconfirmed. Shader fog appears on close/native scope geometry but is missing specifically from LODs.

The user then explicitly requested separate acquisition modes: FLIR off behaves like ordinary colour PiP; FLIR on uses lightweight highlighted entities and cuts through cosmetic fog/smoke/effects. Solid-world occlusion is retained. This supersedes the previous scope smoke-attenuation policy for these active Flans optics. Vehicle sensors keep their existing behavior.

## B1: capability was incorrectly selecting acquisition

`ThermalScopeEffect.renderScopedWorld` used the optic's thermal capability as the capture mode, regardless of `flirEnabled`. Switching off FLIR only changed the final mix of that same lightweight thermal scene. It could not select the shadered colour camera or the full colour sky path.

Acquisition now follows the active switch. The capability still owns lens geometry, controls and device identity. Thermal-capable physical scopes and handheld displays with FLIR off can select the normal shader camera in Automatic/Quality mode and the normal colour lightweight fallback in Performance mode. The normal PiP's colour fallback also no longer depends on the unrelated global FLIR toggle.

## Changed files and behavior

- `ThermalScopeEffect`: distinguish capability from current capture; select RGB/thermal display and the correct texture/cache; permit shadered colour acquisition for disabled thermal optics. Clear cached validity on toggle without resetting sensor deadlines. Fullscreen colour sensors use the same sampled-frame lifecycle rather than a thermal/grayscale display shader.
- `CameraRenderManager`: pass actual vehicle ownership separately from the thermal switch; select colour environment for non-vehicle colour acquisition and penetrating atmosphere policy for non-vehicle heat acquisition.
- `LightweightCamera`: keep opaque/translucent world and actor depth handling, including the existing glass barrier; skip ordinary particle/weather submission for penetrating Flans FLIR. Colour modes keep the accepted sky and WGQOL weather work. Vehicle modes retain prior particle/weather submission.
- `ThermalCamera`: keep the existing heat geometry path, but allow the Flans scope caller to omit the atmospheric particle mask. The old float-only entry point preserves its prior behavior for existing callers. Source-depth preparation still clears old particle-mask validity and remains authoritative for covered targets. Omitting this mask intentionally also omits particle-only heat flashes/bloom from these scope captures.
- `CameraEnvironmentChecks`: exercise the production mode selector, switch invalidation and unchanged admission budget; render the actual heat acquisition/display to check exposed hot pixels, solid-depth cover, and absence of cosmetic particle replay.
- `ThermalGpuChecks`: verify cached thermal and normal RGB fullscreen samples and held RGB frames. The fixture now supplies valid non-mipmapped offscreen sample textures and a real-sized colour cache on macOS, where a vanilla constructor's default-FBO completeness check is unsuitable for this Pbuffer.

No shader-pack, Angelica, WGQOL, DH, MCHELI, WorldBorder, protocol, content or save/config changes are part of this correction. It stays on FMUR `codex/scope-sky-weather`. The accepted X208 checkpoint is `75856da`; the earlier baseline checkpoints remain available.

## Verification

Java 8 compilation and the existing focused tasks pass:

- `cameraEnvironmentChecks`: **140** real OpenGL/companion assertions, including the new mode and physical-cover checks.
- `currentParticleGpuChecks`: **303** camera particle, thermal, smoke, NVG and cached-display checks; **15,822** profile/admission checks. Legacy particle attenuation remains verified for the unchanged path; penetrating scope acquisition is checked separately.
- **35** auxiliary ownership, **10,110** LOD/projection/packet and **2,030** external presentation assertions; server/data classloading boundaries pass.
- Scope native/LOD terrain GPU fixture: **155** checks pass.

The initial new exposed-target test sampled a display quad without UVs; the actual heat texture contained the expected hot pixel. The fixture was corrected. Its new RGB cache test also exposed invalid default mipmap sampling parameters and the macOS Pbuffer default-FBO limitation in the fixture. These were corrected before the passing run; no production thermal shader workaround was added for those test setup issues.

Packaging passed through the normal Java 8 `build -Pbranch=pip-scope-test --offline` path, automatically advancing X208 to **X209**. Artifact: `build/libs/FMUR-WDG-Edition-1.8.06_X209-pip-scope-test.jar`. SHA-256: `7485cf1c78d6f403be21e149ca072827d9dde90a35e76c9f5fb7dd4c875f62b5`. CRC and version metadata pass. Compared with X208, only the four intended camera classes, their compiler-generated callbacks and the version-bearing mod class differ; no classes are added or removed. Keep the existing WGQOL X51, Angelica X6 and DH X71 companions. No client or server installation is performed.

## Fog remains a separate colour-rendering issue

The user's close-versus-LOD observation matches the established private-pipeline gap: native geometry receives shader fog; distant geometry is added after pack finalization and the private pack sees an empty DH depth texture. In FLIR-on mode, bypassing that atmosphere is now intentional. In ordinary PiP and FLIR-off colour mode, distant shader fog is still missing and is not claimed fixed by this patch.

The next bounded cross-mod stage must submit distant geometry/materials and matching private DH opaque/translucent depths before the pack's deferred/composite fog stages. It must preserve the working private camera/primary ownership and the two acquisition modes. Recolouring far terrain or enabling WGQOL mist does not repair the missing shader depth contract. See the [implementation plan](scope-lighting-weather-sky-plan-2026-11-11.md).

## In-game checks

1. With shaders enabled, use a thermal-capable optic and switch FLIR off: check normal RGB shader lighting, sky and WGQOL rain as in ordinary PiP. Repeat with shaders disabled and in Performance mode.
2. Switch FLIR on in smoke/rain: cosmetic effects should not hide the highlighted entities. Move the same target behind a wall/terrain: it must disappear. Check nearby and LOD entities.
3. Toggle repeatedly, open/close scopes and switch optics. Look for stale heat frames in colour mode, stale colour frames in heat mode, freezes, or doubles/trails after closing the scope. Recheck handheld displays and the unchanged vehicle sensors.
4. Distant colour shader fog still requires the next stage; close/native fog should remain as before. Do not interpret FLIR-on's deliberate atmosphere bypass as that colour-path defect.
