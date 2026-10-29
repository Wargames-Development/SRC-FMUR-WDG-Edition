# Thermal adjustments — 2026-10-28

Installed in `C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft`.
This supersedes the earlier thermal profile report's sensor values and vehicle night-vision policy.
Restart Minecraft to load the changed definitions and classes.

## Result

- Flan's CNVD-T scope resolution doubled in both dimensions: 320×240 → **640×480**. This is four times the sensor pixel count. Scope cadence/noise and Thermal Binoculars settings are otherwise unchanged.
- Vehicle thermal profiles have higher actual sensor FPS caps and much lower grain. Resolution still distinguishes older and newer equipment.
- All 64 vehicle definitions explicitly disable vehicle night vision. Aircraft cameras cycle **normal → thermal → normal**, preserving mode IDs 0/1/2 on the existing network protocol. Mode 1 is skipped for vehicles.
- Vehicle cameras neither add night-vision potions nor remove wearable NVG effects. The independent GLTD device retains its existing mode behavior.
- Thermals require the existing gunner/sensor camera view and first-person presentation. Normal cockpit/body views and third-person views cannot activate thermals. Leaving the view clears the selection; returning requires selecting thermals again. UAV camera feeds count as sensor views under MCHR's existing `isCameraView` rule.
- MCHR's visible emissive explosion sprites now produce a short thermal bloom. The bloom uses the existing sensor compositor and particle buffer; it adds no world render or geometry pass.
- Smoke emitted through MCHR's existing `explode` particle category is hot, independent of its visible RGB color. It cools over its existing lifetime. Ordinary smoke/dust is not automatically marked hot. Existing texture alpha, scene-depth occlusion and normal-view colors are retained.

## Vehicle balance

These are gameplay tuning values, not certified real detector specifications. Higher FPS caps increase actual sensor rendering frequency and therefore can cost more GPU time; they do not force the game's FPS to the sensor rate.

| Tier | Previous maximum FPS → current | Previous grain → current | Resolution |
|---|---:|---:|---|
| Legacy | 25 → 40 | 0.100 → 0.035 | 320×240 |
| Improved | 25 → 50 | 0.065 → 0.018 | 480×384 |
| Modern | 30 → 60 | 0.035 → 0.008 | 640×512 |
| Advanced | 30 → 60 | 0.020 → 0.003 | 800×600 |
| Integrated | 30 → 60 | 0.015 → 0.0015 | 1024×768 |
| Navigation | 25 → 40 | 0.080 → 0.020 | 320×240 |

The M1A1 remains below the M1A2 in detail, cadence and noise performance. M1161 ITV remains disabled.
Existing vehicle/seat assignments are retained except EA-18G; all access now also requires the gunner/sensor view. A navigation profile does not grant thermal vision outside that view.
No player graphics menu settings were added or used to override content characteristics.

## EA-18G and J-16D review

**EA-18G is now thermal-enabled**, using the advanced tier, representing an ATFLIR-equipped aircraft. The RAAF explicitly describes Growlers carrying AN/ASQ-228 ATFLIR. This establishes an available fit; EW pods themselves are not being treated as thermal cameras. [RAAF aircraft history, Growler entry](https://www.airforce.gov.au/sites/default/files/2023-02/A46%E2%80%93Boeing%20Growler%20%E2%80%93%20pp568-571.pdf).

**J-16D remains disabled conservatively.** I did not locate primary evidence confirming a fitted, full-scene thermal camera on this represented variant. Primary airshow coverage establishes its specialized EW role and equipment, without confirming an imaging FLIR fit. This is not a claim that no future/optional J-16D thermal payload could exist. [CGTN airshow reporting and aircraft photographs](https://news.cgtn.com/news/2021-09-30/J-16D-China-s-revamped-jet-targets-electromagnetic-supremacy--13YJHif00gM/index.html).

The inventory now has **40 thermal-equipped fits and 24 disabled fits**. The complete current assignments, crew exceptions and rationales are in [the reviewed catalog](../tools/thermal_device_profiles.json).

## Files and implementation

FMUR:

- `tools/thermal_device_profiles.json`: increased scope resolution, vehicle cadence/noise improvements and EA-18G ATFLIR fit.
- `tools/configure_thermal_devices.py`: writes `EnableNightVision = false` for every vehicle; keeps strict inventory validation and byte-preserving managed blocks. Hash-verified application can retire only an explicitly marked top-level runtime jar, with its original backed up before replacement.
- `src/main/java/com/flansmod/client/ThermalCamera.java`: uses the particle buffer's previously unused blue channel for visible emissive bloom. Nine local texture samples create the glow in the existing display pass. Reserved thermal particle brightness coordinates 241–255 carry cooling smoke temperature; normal emissive brightness remains 240. Tags are emitted only in the thermal particle pass.
- `tools/player_lod_checks/java/com/flansmod/client/ThermalGpuChecks.java`: exercises actual MCHR explosion and smoke drawing, cooling, bloom and covered-source rejection.
- `gradle.properties`: actual successful packaging advanced the automatic build counter from X185 to X186. Compile/test-only commands did not advance it.

MCHR:

- `src/main/java/mcheli/MCH_Camera.java`: skips vehicle night vision, rejects unavailable sensors and avoids touching vehicle occupants' potion effects.
- `src/main/java/mcheli/aircraft/MCH_EntityAircraft.java`: decouples thermal camera controls from the old night-vision content flag; enforces gunner/sensor view on mode switching and reading; clears stale mode labels.
- `src/main/java/mcheli/aircraft/MCH_AircraftClientTickHandler.java`: accepts thermal key input only for an equipped sensor in first-person gunner view.
- `src/main/java/mcheli/MCH_ClientCommonTickHandler.java`: clears thermal mode when switching to third person.
- `src/main/java/mcheli/render/MCH_FMURThermal.java`: checks the actual current view before exposing the vehicle sensor to FMUR; preserves the independent GLTD integration.
- `src/main/java/mcheli/particles/MCH_ParticlesUtil.java`: marks explosion-category smoke as thermal-hot at spawn.
- `src/main/java/mcheli/particles/MCH_EntityParticleSmoke.java`: supplies cooling heat during sensor replay, preserving normal-view appearance and avoiding an unnecessary world-light query in this pass.
- `src/test/java/mcheli/aircraft/MCH_ThermalProfileTest.java`: camera cycling, unavailable devices, sight exit, third-person reset and wearable NVG preservation regressions.
- `tools/ThermalContentChecks.java`: validates all vehicle night-vision flags, the new Growler assignment and doubled scope resolution through both real profile parsers.

The installed instance received 80 manifest operations: 62 changed definition files, 16 remapped MCHR classes (including nested bridge classes), the new FMUR jar, and retirement of the old FMUR jar. Unchanged definitions, including the binoculars, were checked without rewriting them. No new dependency or packet layout was introduced. MCHR remains an unpacked mod with its existing metadata; no second MCHR jar was installed.

## Review and validation

Review verdict: **ACCEPTABLE for in-game acceptance testing**.

- B1 addressed: vehicle potion cleanup could otherwise remove a wearable NVG effect; aircraft now leave potion ownership to the wearable system.
- B2 addressed: the stricter vehicle provider could otherwise exclude the separate GLTD device; its existing integration is preserved.
- T1 remains manual: full game/shader-pack visual acceptance, actual server controls, and native macOS/Linux execution.

Commands and results:

- MCHR, Java 8: `gradlew.bat --offline --no-daemon -I tools/thermal_content_checks.gradle compileJava test thermalContentChecks jar reobf`, with staged content and FMUR compiled classes supplied: **PASS**. 176 tests, zero failures/errors/skips.
- The same `thermalContentChecks` task against the installed Minecraft directory after application: **PASS**, 511 parser/content checks, all 64 vehicles and both FMUR devices.
- FMUR, Java 8: `gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks`, with Windows LWJGL natives, current MCHR compiled classes and installed Angelica/DH jars: **PASS**, 15,822 profile/admission checks and 452 GPU/compatibility checks.
- FMUR `gradlew.bat --offline --no-daemon build`: **PASS**, X186 saved only after successful packaging/reobfuscation.
- Workspace installer fixture: backed-up jar replacement works and an unmarked retirement is rejected. Repeated staging of all 66 definitions is byte-identical.
- Every installed change and every pre-existing file's backup matched its manifest hash. Exactly one FMUR jar is present.
- `git diff --check` in both repositories: **PASS**. Existing line-ending, ForgeGradle and Unsafe fixture warnings remain.

The new native-smoke GPU fixture initially lacked the Minecraft singleton required by the real texture-binding path; supplying that fixture state made the rerun pass. No production smoke-rendering exception occurred in this check.

## Installation and recovery

Installed FMUR: `mods/FMUR-WDG-Edition-1.8.06_X186.jar`.
SHA-256: `4951C85026F48DF340D9E74F64745987A6CAA9D03E2FE42994DC7E1F66F011E2`.

Matching MCHR runtime classes came from the remapped source artifact `MCHELI-R-WDG-Edition-1.9.01_X186-dev.jar`.
SHA-256: `6E0801CF78F2FC17DB107E7A8BC9DEE9F47DC25BC978A0EC9F06F73CCEE10C6D`.

Backup:
`C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/config/wargames-thermal-backups/20261028-195916/`.

Its manifest identifies every original and replacement hash. To undo this pass with Minecraft stopped, restore files with a non-null `before` hash from the backup to their same relative Minecraft paths and remove the newly introduced X186 jar (`before = null`). The retired X185 jar is in the backup. Earlier backups remain available.

Only the supplied instance was updated. Dedicated servers and other clients require matching MCHR code and definitions for the same policy. No server deployment or live game launch was performed.

## In-game checklist

1. Restart Minecraft. Compare CNVD-T aiming/reticle detail at the same range. Binocular settings should be unchanged.
2. M1A1 versus M1A2/F-35/modern fourth-generation targeting views: check smoother sensor motion and reduced grain while retaining resolution differences. Sensor FPS is a maximum, not guaranteed performance.
3. In an equipped vehicle, enter gunner/sensor view and press the camera-mode key: normal → thermal → normal, with no vehicle night-vision step.
4. Leave gunner view or press F5: thermal mode must clear immediately. Returning to the sight should start in normal mode. Normal flight cockpit and tank exterior views must not become thermal.
5. Wear Flan's NVGs and repeat entry/exit/mode switches. Vehicle cameras must neither grant NV nor cancel the wearable's effect.
6. Watch a nearby MCHR explosion through scope, binoculars and vehicle thermals: brief glow, then visible hot smoke cooling. Repeat behind a solid wall; no hidden explosion/glow should show through it. Ordinary smoke must retain cover behavior.
7. Check EA-18G's equipped ATFLIR view and J-16D's disabled thermal mode. Check M1161 remains disabled and passenger seats remain excluded.
8. Repeat with shaders enabled/disabled and on the server after matching deployment. Thermal device settings must remain content-defined.
