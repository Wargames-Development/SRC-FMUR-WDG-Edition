# PiP night-lighting correction — X187

## Diagnosis

The dedicated PiP camera decoded Distant Horizons' packed light byte in the wrong order.
The installed DH `LodQuadBuilder.putVertex` writes sky light into bits 0–3 and block light into bits 4–7.
Minecraft's lightmap texture uses block light for X and sky light for Y.
The scope had treated the low nibble as X, turning sky level 15 into block light level 15.
This explains distant terrain appearing brightly lit at night with shaders both enabled and disabled.

Loaded terrain's light-coordinate decoder uses the correct order. Bright distant surfaces visible through cutout grass/leaves can produce the apparent bright speckles at the transition.
The regression checks that exact cutout/background combination; a complete live-game visual retest is still needed to confirm every spot in the supplied screenshot has the same cause.

The actual installed dependency inspected was `DistantHorizons-upstream-preview-6-feature-dh-3-3-wdg.25+b5f617e8cb.jar`.
Both its vertex builder bytecode and its shipped terrain vertex shader agree on the required sampling order.
Angelica 2.2.14's vanilla-like vertex encoder and Iris/ordinary terrain shader sources were also checked.

## Bounded change

- `src/main/java/com/flansmod/client/DistantCameraGeometry.java`: swaps the two decoded light coordinates before sampling the ordinary Minecraft lightmap. This is the only production rendering logic changed in this pass.
- `tools/player_lod_checks/java/com/flansmod/client/ThermalGpuChecks.java`: adds asymmetric sky/block night-lighting cases, a cutout-foliage transition regression, and checks of actual Angelica Iris and vanilla-like terrain materials against the same night lightmap.
- `gradle.properties`: the successful actual packaging build advances X186 to X187. Compile/GPU-only runs do not increment it.

Existing camera geometry, genuine magnification, depth mapping and shader fallback selection are retained.
No additional world pass, framebuffer or per-frame GPU resource is introduced.
Thermal uses its existing neutral sensor lightmap; content-defined thermal characteristics are unchanged.
No MCHR source/content, packets, saves, registry identifiers or shader-pack files changed.

## Review and verification

Review verdict: **ACCEPTABLE for in-game acceptance**. All changed runtime code is client-side.

The new regression was run before the fix and failed as intended: an open-sky patch with no block light produced green intensity **128**, its full block-lit value, rather than the expected night value **19** in the deliberately asymmetric fixture lightmap.
After correction, the patch receives night sky light, actual block-lit terrain remains bright, and near cutout foliage and the distant terrain seen through it agree within one 8-bit level across the tested transition.
The actual Angelica Iris and vanilla-like terrain materials also distinguish dark sky lighting from block lighting correctly.

Java 8 command:

```text
gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks
```

With Windows LWJGL natives, current MCHR compiled classes and the installed Angelica/DH jars supplied through the existing properties: **PASS**, 15,822 profile/admission checks and 587 GPU/compatibility checks.
Existing explosion bloom, hot-smoke cooling, thermal neutral-lightmap, depth/occlusion, magnification and state-cleanup regressions pass.
The first post-fix run exposed array-buffer cleanup missing from the new test fixture; correcting the fixture cleanup made the full suite pass.

`gradlew.bat --offline --no-daemon build`: **PASS**, including Forge reobfuscation and successful X187 counter persistence.
Packaged bytecode contains the corrected shader expression, and `mcmod.info` identifies `1.8.06_X187`.
`git diff --check`: **PASS**; existing unrelated line-ending warnings remain.

Artifact: `build/libs/FMUR-WDG-Edition-1.8.06_X187.jar`.
SHA-256: `7935923E2679119D9477C0761B0E6DF4E231497F21DE978A01C771566DE69002`.

## Installation

The first installation attempt was blocked because the running Minecraft process held `mods/FMUR-WDG-Edition-1.8.06_X186.jar` open (`WinError 32`).
The installer had backed up originals before attempting replacement; the locked installed jar was not changed and X187 was not added beside it.
The reviewed replacement manifest is staged under `build/pip-night-fix-staging/`.
Installation requires fully closing Minecraft, then replacing X186 with X187 so only one FMUR jar is present.

After Minecraft was closed, installation completed successfully. X187's installed hash and the backed-up X186 hash were verified; exactly one FMUR jar remains in `mods/`.
Backup: `C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/config/wargames-thermal-backups/20261028-210617/`.

## In-game acceptance

1. Fully restart after installing X187. Revisit the same night-time position, scope and zoom shown in the screenshot.
2. Compare loaded grass/foliage and the DH terrain behind it. Distant open-sky terrain should darken consistently, including the background visible through cutout leaves and grass.
3. Repeat with shaders off and on. The lightweight scope uses the same corrected light decoder in both modes.
4. Check a genuinely illuminated distant area: block lighting should remain visible rather than being globally darkened.
5. Check daytime color, magnification and thermal sights; no new rendering passes or sensor settings should appear.

Full game/shader-pack visual acceptance and native macOS/Linux execution were not performed by this pass.
