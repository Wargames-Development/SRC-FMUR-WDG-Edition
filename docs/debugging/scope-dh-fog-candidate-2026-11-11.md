# Colour-scope DH fog candidate

Status: **built and automatically checked; in-game visual acceptance pending**. X209 did not fix distant fog. The user's subsequent screenshots show fog on native terrain stopping at the DH boundary in both ordinary PiP and FLIR-off colour views, including a clear-weather distance haze mismatch. Those are the reproduction/acceptance references for this candidate.

## Paired artifacts

- FMUR **1.8.06_X210-pip-scope-test**, from `codex/scope-sky-weather`.
- Angelica **2.2.14_X7**, from `codex/angelica-2.2.14-pip`.
- Keep DH **3.3.4_X71** and WGQOL **1.16.0_X51**. No DH/WGQOL source or shaderpack setting changes are required.

Use both new jars for the shader-path test. Old Angelica v1 companions still negotiate the original forward path; they cannot supply the new private DH shader stage. No installation or default-branch promotion is performed.

SHA-256:

```
FMUR X210:    10158f9855c10758f4adb94a24731c87799a1aba27b6a90935c130ba79b81dc7
Angelica X7:  751ed120e0fbc8fa52a07f0b50edccb021431ea6df00548588f03db9ddbbcb31
```

## Cause and changes

Previously `FlansScopePass` finished deferred/composite shader processing with an empty DH depth texture, then `ShaderScopeScene.drawForward` painted distant terrain over that result. The fog and lighting passes never received those surfaces.

Angelica's additive v1 scope extension now owns terrain/water pack programs and separate full/opaque DH depths at scope resolution. FMUR submits the same borrowed, locked DH meshes with the pack's integer vertex layout and camera-relative offsets: opaque before `beginTranslucents`/deferred, water before composite. Depth samplers and the scope's existing DH projection/inverse now describe the submitted surfaces. A scope-only fragment ownership check rejects DH pixels already owned by native geometry; the transform cache includes that distinction so it cannot leak into primary shaders. Each sample clears both depths; resource destruction remains scope-owned, without primary DH override registration, another DH world render, or mutation of the primary draw lists.

The old forward DH draw becomes depth-only in this mode, retaining the established compressed-depth occlusion for player/MCHELI actor presentation without painting unfogged terrain over the finished shader image. **Actor material/shader parity remains separate work**; this candidate changes terrain/water integration, not actor lighting.

FMUR's ordinary lightweight colour terrain also gains read-only DH fog snapshots. It follows the effective DH enable/disable override, colour selection, far falloff, height direction/mixing, distance and special-medium policy. Fog is evaluated from relative world positions, not inverted compressed auxiliary depth. The height minimum/range/density intentionally match the current DH renderer's existing far-parameter uploads. Shadered terrain uses pack atmosphere; the DH fallback uses DH's effective settings, avoiding forced double atmosphere. An unavailable older optional fog API logs once and keeps the existing fallback until reload.

FLIR-on still bypasses cosmetic atmosphere. Vehicle sensor behavior, physical terrain/actor occlusion, existing weather replay, sky, packets, saves and content definitions are unchanged by this candidate.

## Verification

- Both production builds pass; normal counters advanced X209 → X210 and X6 → X7. Artifact CRC, metadata and Java 8 class versions pass.
- Angelica root `:test :glCoreTest`: **578** ordinary tests, **27** GL tests; zero failures/errors, six existing platform skips. The local BountifulStars snapshot at `/tmp/dh-bountiful-x45/shaders` compiles both real DH terrain/water programs through the new scope transformation. This is shader compilation, not visual certification of the user's active pack/options.
- New GL tests exercise private integer vertex submission, moving native ownership edges across eight samples, separate opaque/water depth, and per-sample depth clearing. Existing primary pixel/framebuffer/matrix/history and exception isolation tests pass.
- FMUR environment checks with actual DH X71 interfaces: **150** assertions, including effective fog toggles, sky versus special-medium colour and unchanged config ownership. The wrapper/config values are controlled fixtures using the actual companion interfaces, not a running world.
- Production lightweight terrain/fog GLSL: **216** real CGL pixel checks across disabled/enabled fog, three falloffs and ten height-mixing modes, plus the existing native overlap cases.
- Existing **303** focused particle/heat/smoke/NVG checks, **15,822** thermal profile checks, **35** auxiliary ownership, **10,110** LOD/projection/packet, **2,030** presentation and server/data boundaries pass.

Test setup corrections were confined to fixtures: initial root test selection also matched unrelated subprojects; the GL fixture needed normal Launch/Iris notifiers and a Minecraft singleton; the legacy environment Pbuffer uses shader compilation without unavailable VAOs. No production workaround was added for those fixture failures.

## In-game acceptance

1. Install both paired candidates, keep the same shaderpack/options, and repeat the supplied rainy and clear-weather views. Check normal PiP and thermal-capable scopes with FLIR off. Compare the **same landmark at the same actual distance**, across native/DH terrain; magnification must not remove atmosphere or move its world-space distance.
2. With shaders off, toggle DH fog enabled/disabled, then check height fog if used. Both colour scopes should follow it; no artificial fog should remain when disabled. With shaders on, allow the pack to own atmosphere as it does in the main view.
3. Toggle FLIR on: cosmetic rain/fog/smoke should still be bypassed while solid terrain/walls hide targets. Toggle back off, reopen/switch scopes, resize, reload packs and reconnect; check no stale depth, new doubles, freezes or primary-view corruption.
4. Check water and foreground edges during movement and record sustained performance after initial program compilation. WGQOL's local mist is still a separate visual acceptance item from distant fog. Actor lighting remains separate.

Do not label the visible fog defect fixed or promote these branches until those world checks pass.
