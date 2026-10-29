# PiP precipitation — X188

Installed in `C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft`.
Restart Minecraft to load X188.

## Cause and bounded implementation

The lightweight secondary camera submitted terrain, entities and particles but never drew precipitation.
Minecraft renders rain/snow separately from ordinary particles, so replaying particles alone could not display rain in the scope.
Both shader-enabled and shader-disabled PiP use this lightweight camera with the installed stock Angelica version.

The fix adds a bounded local weather draw after particles, using the same secondary-camera projection and existing depth buffer.
Rain and snow use vanilla/resource-pack textures, biome precipitation and temperature rules, world rain strength, surface precipitation height and world time for animation.
Fast graphics uses a five-block radius; fancy graphics uses ten, matching vanilla's basic weather ranges.
Columns outside the secondary frustum or loaded chunks are skipped. No chunks are requested and no new framebuffer or geometry cache is created.
Precipitation respects terrain depth, does not write billboard depth, and does not draw below the column's precipitation surface.

This does not invoke `EntityRenderer.renderWorld`, the main renderer's rain method, shader-pack weather hooks, world events or particle spawning.
There is no second world simulation or weather sound update.
The thermal camera uses its existing neutral lightmap for this geometry, retaining its device-defined sensor cadence and gain.

## Files changed

- `src/main/java/com/flansmod/client/CameraWeather.java`: local precipitation geometry and bounded loaded-column queries; groups rain/snow into texture batches and restores GL/program state.
- `src/main/java/com/flansmod/client/LightweightCamera.java`: submits precipitation after particles and selects the ordinary or neutral thermal lightmap first.
- `tools/player_lod_checks/java/com/flansmod/client/ThermalGpuChecks.java`: real weather drawing fixture covering visible rain with/without a bound shader, snow, magnification, roofs, dry weather/biomes, unloaded-column avoidance, cover and state/depth restoration.
- `gradle.properties`: actual successful packaging increments X187 to X188. Compile/test-only commands did not consume a number.

Review verdict: **ACCEPTABLE for in-game acceptance**.
All production code is within the established client rendering boundary. No MCHR/content, packet, NBT, registry, device profile or graphics-menu setting changed.
Review corrected partial-batch exception cleanup so GL/program restoration still runs if a weather resource/provider fails.

## Validation

Java 8:

```text
gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks build
```

With Windows LWJGL natives, current MCHR compiled classes, and installed Angelica/DH runtime jars supplied through the existing properties: **PASS**.
Results: **610 GPU/compatibility checks and 15,822 thermal profile/admission checks**.
Forge packaging/reobfuscation passed, and X188 persisted only after the entire command succeeded.
The fixture initially required reflective setup of the world's final provider field; this test initialization was corrected before the successful run.
`git diff --check`: **PASS**; existing compiler/Unsafe and line-ending warnings remain.

The packaged jar was checked for the new weather class and camera call, correct X188 metadata, and the retained X187 DH night-lighting correction.
The installed jar hash and X187 backup hash were verified; exactly one FMUR jar is present.

Artifact: `build/libs/FMUR-WDG-Edition-1.8.06_X188.jar`.
SHA-256: `F19C0E7D69A056EFE62D34A5F5305CFBB4C8EAD42E25FB267D9FB4D33C2B600E`.

Backup: `C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/config/wargames-thermal-backups/20261028-213506/`.
It contains X187 and the before/after manifest. With Minecraft stopped, restoring X187 and removing X188 reverts this pass.

## In-game acceptance and limits

1. Start Minecraft in a rainy biome during rain. Compare inside/outside the regular PiP scope at several zoom levels, with shaders off and on.
2. Stand beneath a roof and look outside. Rain should begin at the local precipitation surface and remain hidden by solid terrain in front of it.
3. Check a snowy biome, clear weather, and a desert. Snow should use its own texture; clear/dry locations should not draw rain.
4. Check nighttime rain and thermal views. The X187 LOD lighting correction and content-defined thermal settings should remain intact.

Full live-game/shader-pack visual acceptance and native macOS/Linux execution were not performed.
The lightweight scope renders vanilla-style precipitation; custom dimension weather handlers and Angelica-specific weather-distance overrides are not invoked by this pass.
