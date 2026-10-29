# Installed thermal device profiles — 2026-10-28

**Historical initial pass.** Later sensor values, EA-18G capability and vehicle night-vision/view policy are superseded by [Thermal adjustments](THERMAL_ADJUSTMENTS_2026_10_28.md). The JSON catalog contains current assignments.

Applied to `C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft`.
All 64 installed MCHR vehicle definitions and the two FMUR thermal device definitions were reviewed.
39 vehicle fits receive thermal profiles; 25 explicitly have `ThermalEnabled = false`.
Restart Minecraft before testing. No running game session was used to validate these changes.

## Interpretation and fit assumptions

The numbers below are gameplay approximations of sensor generations, not certified detector specifications.
Resolution, grain, cadence, sensitivity and bloom create an observable progression while keeping sensor rendering bounded.
The generic Thermal Binoculars item has no real-world model specified; it uses a modern handheld class.
The CNVD-T attachment uses the older 320-class clip-on tier.

The M1A1 content identifies an HC fit, with original gunner thermal imaging and no assumed FEP/AIDATS commander retrofit.
The M1A2 content's localized name and weapon identifiers indicate SEPv3; it receives clearer gunner imaging and a separate commander profile.
MCHR combines driving and primary weapon controls in seat 0 on several tanks: assigning that primary gun sight does not assert that an actual driver's station had FLIR.
M1161 ITV, cargo trucks, open buggies and unconfirmed thermal fits receive no thermal mode.
Existing night vision is retained; equipped thermal vehicles need `EnableNightVision = true` because MCHR uses that flag to expose its existing camera-mode key.

An optional targeting pod is treated as fitted only where the represented strike/mission camera fit supports that interpretation.
SH-60 FLIR, EC635 mission EO/IR, several strike-aircraft pods, 2S35 observation equipment and the speculative UAV M1A2 are explicit fit assumptions, recorded below.
An ambiguous name, radar, missile IR seeker, television camera, electronic-warfare pod or night-flight capability alone does not grant thermal imaging.
No external 3D model inspection or classified sensor-performance inference was used.

Representative sources informing the capability distinctions:

- [Army FY2019 tracked-vehicle budget](https://www.asafm.army.mil/Portals/72/Documents/BudgetMaterial/2019/Base%20Budget/Justification%20Book/Weapons%20and%20Tracked%20Combat%20Vehicles.pdf) describes the Abrams SEPv3 gunner/commander thermal equipment.
- [Marine Corps AIDATS announcement](https://www.marines.mil/News/News-Display/Article/924317/marine-corps-to-deliver-capability-trifecta-to-tank-commanders/) identifies the commander thermal upgrade as a distinct M1A1 improvement.
- [HENSOLDT Puma sight description](https://www.hensoldt.net/news/supplying-state-of-the-art-optronic-vision-systems-for-the-puma-infantry-fighting-vehicle) identifies ATTICA thermal imagers in both commander and gunner sights.
- [F-35 Joint Program Office EOTS description](https://www.jsf.mil/eots) confirms integrated FLIR/IRST functionality.
- [Lockheed Martin Apache M-TADS/PNVS](https://www.lockheedmartin.com/content/dam/lockheed-martin/mfc/pc/arrowhead/mfc-m-tads-pnvs-pc.pdf) distinguishes targeting and pilotage equipment.
- [USAF Sniper fact sheet](https://www.acc.af.mil/Portals/92/Docs/Fact%20Sheets%20-%202020%20Update/Facts%20Sheets%20-%202023%20Update/SNIPER%20POD_FEB%202023.pdf) supports thermal capability of the fitted targeting pod, rather than every aircraft of a compatible type.
- [Navy SH-60B collection](https://www.history.navy.mil/content/history/museums/nnam/explore/collections/aircraft/s/sh-60b-seahawk.html) records optional FLIR installations.
- [Marine TOW manual](https://www.trngcmd.marines.mil/Portals/207/Docs/TBS/FMFRP%206-90-1%20Tow%20Weapon%20System.pdf) describes the older thermal nightsight class.

These references establish equipment categories. Exact profile values and relative tiers remain balance decisions.

## Profile values

All devices start in WHITE_HOT. These values are content fields, with no new player graphics settings.

| Profile | Maximum sensor FPS | Resolution | Grain | Contrast | Sensitivity | Bloom | Gamma |
|---|---:|---|---:|---:|---:|---:|---:|
| legacy | 25 | 320 × 240 | 0.10 | 1.00 | 0.92 | 1.15 | 0.90 |
| improved | 25 | 480 × 384 | 0.065 | 1.04 | 0.98 | 1.00 | 0.86 |
| modern | 30 | 640 × 512 | 0.035 | 1.08 | 1.04 | 0.80 | 0.82 |
| advanced | 30 | 800 × 600 | 0.020 | 1.10 | 1.08 | 0.65 | 0.80 |
| integrated | 30 | 1024 × 768 | 0.015 | 1.12 | 1.10 | 0.60 | 0.78 |
| navigation | 25 | 320 × 240 | 0.080 | 1.00 | 0.95 | 1.00 | 0.87 |
| cnvdt | 25 | 320 × 240 | 0.075 | 1.05 | 1.00 | 1.00 | 0.85 |
| binoculars | 30 | 640 × 512 | 0.035 | 1.08 | 1.04 | 0.80 | 0.82 |

## FMUR devices

| Installed file under minecraft/ | Profile | Basis |
|---|---|---|
| `Flan/BFMC Gun Pack/attachments/SCOPE_CNVD-T[3x].txt` | cnvdt | Legacy CNVD-T clip-on thermal class; 320x240-class image, more noise than modern handheld binoculars. Cadence/effects are balancing values. |
| `Flan/BFMC Gun Pack/guns/GEN_Tactical Visor.txt` | binoculars | Definition is named Thermal Binoculars; unspecified model represented as modern handheld 640-class sensor. |

## Complete MCHR inventory

Paths are relative to `mods/MCHELI-R-WDG-Edition-1.1.8_X190/assets/mcheli/`.
Seat IDs are zero-based and follow the existing AddSeat/AddGunnerSeat/AddFixRotSeat declaration order.
Normal passenger seats are denied thermal access. In equipped vehicles, primary crew and sensor/gunner stations receive the profile unless a listed exception applies.
All declared vehicle cameras inherit the vehicle profile; seat-specific profiles then override those values.
No camera positions or new sights were added. All entries, including disabled vehicles, are explicitly configured.

| File / displayed vehicle | Profile | Thermal seats and overrides | Basis / assumptions |
|---|---|---|---|
| `helicopters/4-axis-drone-rpg.txt` — FPV Drone [RPG] | disabled | none | Ordinary RGB FPV attack drone; no thermal payload defined. |
| `helicopters/ah1z.txt` — AH-1Z VIPER | advanced | 0, 1 | AH-1Z TSS third-generation imaging FLIR; both flight/weapon crew can view the sensor. |
| `helicopters/ah64d.txt` — AH-64D APACHE | modern | 0, 1; 0: improved | AH-64D TADS/PNVS; conservative older pilotage profile and clearer gunner targeting feed. |
| `helicopters/ah64e.txt` — AH-64E APACHE | advanced | 0, 1; 0: modern | AH-64E modernized TADS/PNVS; improved targeting feed and modern pilotage channel. |
| `helicopters/ah6j.txt` — AH-6J KILLER EGG | disabled | none | Generic minigun/unguided-rocket AH-6J fit; optional AESOP FLIR is not established by this definition. NV retained. |
| `helicopters/ec635.txt` — EUROCOPTER EC635 | modern | 0, 3 | Missionized armed EC635 with separate nose/side sensor gunner camera; EO/IR fit inferred from the represented camera station, not the generic airframe alone. |
| `helicopters/ka52.txt` — KA-52 ALLIGATOR | modern | 0, 1; 0: improved | GOES-series imaging thermal targeting system; pilotage channel represented below gunner sensor quality. |
| `helicopters/mi28.txt` — MI-28NE HAVOC | modern | 0, 1; 0: improved | Mi-28NE OPS/night targeting fit; separate pilotage/targeting quality. |
| `helicopters/mi8amtsh-2.txt` — MI-8 | disabled | none | Transport/door-gun Mi-8 fit; no confirmed GOES thermal mission turret, unlike specialized upgraded variants. |
| `helicopters/sh60.txt` — SH-60 SEAHAWK | improved | 0, 1 | SH-60 maritime FLIR fit represented for flight crew; cargo passengers do not receive sensor access. Fit assumption, not every historical SH-60 block. |
| `helicopters/z10.txt` — Z-10W | modern | 0, 1 | Z-10W EO/IR targeting turret; both flight/weapon crew sensor access. |
| `planes/a10.txt` — A-10C WARTHOG | advanced | 0 | A-10C precision-attack fit represented with LITENING/Sniper-class imaging pod. |
| `planes/b1b.txt` — B-1B LANCER | advanced | 0, 1 | B-1B precision-strike/Sniper fit; flight and weapon-camera stations share targeting feed. |
| `planes/b2a.txt` — B-2A SPIRIT | disabled | none | B-2A radar bombing platform; no confirmed imaging FLIR payload in this definition. Infrared signature reduction is not a thermal camera. |
| `planes/bqm_74e.txt` — TARGET DRONE | disabled | none | Target drone without an imaging reconnaissance/thermal payload. |
| `planes/c5m.txt` — C5M Super Galaxy | disabled | none | C-5M transport; no targeting FLIR assigned from transport/night-flight capability. |
| `planes/ea18g.txt` — E/A-18G GROWLER | disabled | none | EA-18G electronic-warfare fit; EW/ESM pods do not establish an installed imaging thermal targeting pod. |
| `planes/ef2000.txt` — EF-2000 | advanced | 0, 1 | PIRATE IRST/FLIR provides cockpit IR-TV imagery; represented imaging-sensor fit. |
| `planes/f14a.txt` — F-14A IRIAF | disabled | none | IRIAF F-14A fit; television/legacy optical tracking is not an F-14D IRST or LANTIRN thermal fit. |
| `planes/f14d.txt` — F-14D | improved | 0 | F-14D passive IRST/LANTIRN-era imaging; older sensor class than current targeting pods. |
| `planes/f15ex.txt` — F-15EX STRIKE EAGLE | advanced | 0, 1 | Pack identifies this as a Strike Eagle with a separate pod camera; Sniper-class strike sensor fit assumed. |
| `planes/f16.txt` — F-16V VIPER | advanced | 0 | F-16V precision-attack camera represented as modern Sniper/LITENING-equipped fit. |
| `planes/f22.txt` — F-22A RAPTOR | disabled | none | Baseline F-22A; experimental IRST upgrades and missile-warning detectors do not establish a full-scene targeting camera in this fit. |
| `planes/f35a.txt` — F-35A LIGHTNING II | integrated | 0 | Integrated EOTS/DAS thermal imagery; highest-quality represented aircraft imaging tier. |
| `planes/j16.txt` —  | modern | 0, 1 | J-16 strike fit with separate targeting-camera crew station; modern EO/IR mission pod assumed. |
| `planes/j16d.txt` — J-16D | disabled | none | J-16D EW variant; EW pods do not establish imaging thermal equipment in the represented fit. |
| `planes/j20.txt` — J-20 | advanced | 0 | Integrated EOTS/infrared sensor fit; advanced tier is a gameplay approximation, not a claimed detector specification. |
| `planes/rafale.txt` — RAFALE C.F3-R | advanced | 0 | Rafale F3-R precision-strike fit represented with TALIOS-class thermal imaging. |
| `planes/su25.txt` — SU-25 FROGFOOT | disabled | none | Baseline Su-25; optical/laser targeting and night vision do not imply a thermal camera. |
| `planes/su34.txt` — SU-34M | disabled | none | Platan day/TV sight is not a thermal imager; a modernized Sych/thermal reconnaissance pod is not established by the definition. |
| `planes/su57.txt` — SU-57 | advanced | 0 | 101KS imaging/pilotage thermal suite; not based merely on missile-warning or infrared-jammer equipment. |
| `planes/tu160m.txt` — Tu-160M BLACKJACK | disabled | none | No confirmed imaging thermal mission camera in the represented bomber fit; optical bombing sight is insufficient evidence. |
| `tanks/2a4.txt` — LEOPARD 2A4 | legacy | 0 | Leopard 2A4 EMES-15/WBG-era gunner thermal; no later independent commander's thermal retrofit assumed. |
| `tanks/2c35.txt` — 2C35 | modern | 0 | Modern 2S35 remote observation/fire-control camera fit; profile is an inferred modern EO/IR class. |
| `tanks/2k22.txt` — 2K22 TUNGUSKA-M | disabled | none | Tunguska-M baseline optical/radar tracking; later M1 thermal retrofit not assumed. |
| `tanks/bmp2m.txt` — BMP-2M | modern | 0 | Berezhok gunner thermal; no optional thermal replacement of the commander's day/night panoramic channel assumed. |
| `tanks/cssa5.txt` — CS-SA5 | modern | 0 | CS/SA5 day/night thermal tracking sight, distinct from its radar. |
| `tanks/fmtv.txt` — FMTV | disabled | none | Generic cargo truck; no DVE or thermal weapon sight fit established. |
| `tanks/g1a4.txt` — GEPARD 1A4 | disabled | none | Gepard optical/radar fit; nonstandard 1A4 label does not establish a verified thermal retrofit. |
| `tanks/lav25.txt` — LAV-25 | legacy | 0, 1 | Original LAV-25 thermal sight class; not an unlabelled A2/ITSS retrofit. |
| `tanks/lav25ad.txt` — LAV-AD | improved | 0, 1 | LAV-AD turret FLIR fire control, older than current integrated IFV sensors. |
| `tanks/m109.txt` — M109 Paladin | disabled | none | Paladin M118-series direct-fire optical sight; no unmodelled thermal weapon station or DVE retrofit assumed. |
| `tanks/m1150.txt` — M1150 ABV | modern | 0, 1; 0: navigation | ABV integrated vision/thermal system; lower-detail driver's DVE and clearer commander sensor. |
| `tanks/m1161itv.txt` — M1161 ITV | disabled | none | User-specified ITV has no thermal sensor; open M2 mount does not grant thermal vision. |
| `tanks/m142.txt` — M142 HIMARS | navigation | 0 | HIMARS driver's DVE only; launcher/gunner view is not assigned a thermal targeting sight. |
| `tanks/m1a1.txt` — M1A1HC ABRAMS | legacy | 0 | M1A1HC original gunner TIS; no FEP/AIDATS or commander's thermal machine-gun retrofit assumed. |
| `tanks/m1a2.txt` — M1A2 ABRAMS | advanced | 0, 1; 1: modern | Definition's localized name and weapons identify SEPv3; improved gunner thermal and separate CROWS/commander sensor, better than the M1A1HC. |
| `tanks/m2a3.txt` — M2A3 BRADLEY | modern | 0, 1 | M2A3 IBAS/commanders' independent thermal viewer; infantry passengers remain excluded. |
| `tanks/mrap.txt` — MRAP | disabled | none | Generic MRAP with open manual machine-gun station; no CROWS/DVE thermal fit established. |
| `tanks/puma.txt` — PUMA | advanced | 0, 1 | Puma gunner/commander ATTICA thermal imagers; infantry passengers remain excluded. |
| `tanks/s300.txt` — S300PM | disabled | none | S-300PM radar/launcher platform; radar and missile IR terms are not imaging thermal cameras. |
| `tanks/spm3.txt` — SPM-3 | disabled | none | Generic SPM-3 with open weapon station; no optional thermal RWS fitted by the definition. |
| `tanks/t90m.txt` — T-90M | advanced | 0, 1 | T-90M modern gunner and commander's thermal fire-control sensors; gameplay tier below the integrated aircraft sensor. |
| `tanks/tos1m.txt` — TOS-1M | disabled | none | Rocket-artillery observation fit; no confirmed thermal camera/driver's DVE assigned from the name alone. |
| `tanks/uav_m1a2.txt` — M1A2 | advanced | 0, 1 | Remote M1A2-derived combat vehicle inherits its represented tank sensor suite; speculative platform, explicit gameplay assumption. |
| `tanks/ural4320.txt` — Ural 4320 | disabled | none | Cargo truck; no imaging thermal equipment. |
| `tanks/vdv.txt` — VDV BUGGY | disabled | none | Open VDV buggy; no imaging thermal equipment. |
| `tanks/vt4a1.txt` — VT-4A1 | advanced | 0, 1 | Modern VT-4A1 gunner/commander thermal FCS; quality is a balance approximation. |
| `tanks/zbd04a.txt` — ZBD-04A | modern | 0, 1 | ZBD-04A modernized thermal fire-control fit; passengers do not inherit crew optics. |
| `vehicles/9m133.txt` — 9M133 KORNET | improved | 0 | Kornet launcher represented with its usual 1PN79-series thermal nightsight; fitted-sight assumption explicitly enables night mode. |
| `vehicles/cram.txt` — CENTURION C-RAM | modern | 0 | Centurion/Phalanx Block 1B-class FLIR tracking camera, not merely radar detection. |
| `vehicles/hpj1130.txt` — HPJ 1130 | modern | 0 | Type 1130 radar/optical/infrared tracking fit represented as an EO/IR gun camera; exact detector specifications not asserted. |
| `vehicles/m220tow.txt` — M220 TOW | legacy | 0 | TOW-2 launcher represented with AN/TAS-4A thermal nightsight; not a modern ITAS retrofit. |
| `vehicles/patriot.txt` — MIM-104 Patriot | disabled | none | Patriot radar/launcher platform; no thermal imaging camera assigned. |

## Implementation and files changed

- `tools/thermal_device_profiles.json` (FMUR): reviewed per-device catalog, eight reusable imaging tiers, explicit disabled vehicles, reasons and crew exceptions.
- `tools/configure_thermal_devices.py` (FMUR): strict inventory staging, managed definition blocks, original-byte/newline preservation, idempotence, before/after SHA-256 checks and backups before writes. It targets this installed unpacked MCHR content layout; review the catalog/path before using a different mod version.
- `MCH_ThermalProfiles.java` (MCHR): strict content-defined capability flags with vehicle/camera/seat inheritance. Availability is cached with imaging maps; capability fields are not sent into FMUR's imaging schema. Unconfigured legacy definitions retain the previous thermal default.
- `MCH_AircraftInfo.java` (MCHR): exposes resolved content capability.
- `MCH_EntityAircraft.java` (MCHR): resolves camera positions by seat without loading client classes on the server capability path.
- `MCH_Camera.java` (MCHR): rejects unavailable thermal mode and clears stale thermal mode while retaining the existing night-vision mode. Camera arrays grow to the declared seat count when needed, so equipped gunner stations beyond uid 1 work. Additional seats require thermal capability, preventing configured passengers from gaining camera modes.
- `MCH_ThermalProfileTest.java` (MCHR): profile inheritance, malformed input, reload, capability gating, retained night vision and extended sensor-crew regression tests.
- `tools/ThermalContentChecks.java` and `tools/thermal_content_checks.gradle` (MCHR): optional checks of all installed definitions through the actual MCHR and FMUR profile parsers.

The installed unpacked MCHR classes predated the shared profile API. Definitions alone would have been ignored.
49 matching remapped thermal integration classes, including nested classes, were installed alongside the 66 definition files.
They cover MCH_Camera, MCH_ThermalProfiles, MCH_AircraftInfo, MCH_EntityAircraft, MCH_ClientCommonTickHandler,
MCH_PacketNotifyClientSetting, MCH_GuiTargetMarker, MCH_FMURThermal and W_EntityRenderer.
The camera class was subsequently replaced once with the tested extended-crew correction.
All public APIs present in the eight pre-existing top-level classes were retained.
No duplicate MCHR jar was installed; mod metadata and unrelated installed classes/assets were not replaced.
The remapped source jar is `SRC-MCHELI-R-WDG-Edition/build/libs/MCHELI-R-WDG-Edition-1.9.01_X186-dev.jar`.
Its final SHA-256 is `E3216F1C4E7041B06D40077FE7A0726126A19437148BFF91F5278F826C535A27`.
This task did not rebuild FMUR: its build counter remains X185.

No packet IDs/field order, registry identifiers, NBT or save formats changed. New fields are additive content keys.
Common capability logic uses no client renderer types. Shader selection cannot override device capability or profile values.
Thermal imagery continues to use the independent camera renderer, with shaders on or off.
This is an instance-local installation. A dedicated server and other clients need the matching MCHR support classes and content to enforce the same definitions consistently; no server directory was supplied or modified.
Ordinary graphics settings cannot change these values. Local content files themselves are not an anti-tamper boundary.

## Verification

- MCHR: Java 8 `gradlew.bat --offline --no-daemon -I tools/thermal_content_checks.gradle compileJava test thermalContentChecks jar reobf` with the installed Minecraft directory as `thermalContentRoot` and FMUR's compiled classes as `fmurClasses`: PASS. 175 tests, zero failures/errors/skips; seven focused profile/capability tests.
- Installed-content parser validation: 503 checks, 64 vehicles (39 enabled), two FMUR devices: PASS.
- FMUR: Java 8 `gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks` with Windows LWJGL natives, current MCHR compiled classes and installed DH/Angelica jars: PASS. 15,822 profile/admission checks and 442 GPU/compatibility checks.
- Repeated staging: all 66 definition files byte-identical: PASS.
- Final installed hashes: all 115 unique files match their final reviewed manifests; all pre-existing files have matching backups: PASS.
- Both repositories: `git diff --check`: PASS.

The first GPU rerun used an incorrect compiled-class path; correcting it to `build/classes/java/main` passed. Existing ForgeGradle and Unsafe test-fixture warnings remain.
Tests do not substitute for a complete game launch, visual acceptance, a dedicated-server launch or native macOS/Linux execution.

## Backups and recovery

Full initial backup, with before/after manifest:
`C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/config/wargames-thermal-backups/20261028-181639/`.

Subsequent one-class crew fix backup:
`C:/Users/nateb/AppData/Roaming/PrismLauncher/instances/Wargames Release/minecraft/config/wargames-thermal-backups/20261028-182301/`.

To restore the original installation with Minecraft stopped, use the full initial backup's manifest: restore each file with a non-null `before` hash to its same relative Minecraft path, and remove only the newly introduced paths whose `before` is null. The second backup can revert just the later crew fix. Keep backups outside a mod replacement/deletion operation.

## In-game acceptance checklist

1. Fully restart Minecraft. Check the log for thermal/profile parse errors or shared-renderer fallback warnings.
2. Compare CNVD-T and Thermal Binoculars at the same target/range. The clip-on should have visibly less detail and more noise. Aim at moving targets to see their different sensor cadence while the game/HUD remains smooth.
3. M1161 ITV, cargo truck and open buggy: thermal mode must remain unavailable. Existing night-vision behavior, where previously enabled, should still work.
4. M1A1 primary sight: older/noisier thermal. Its open commander station has no thermal. M1A2 primary and commander sensors: sharper imaging, less noise and faster cadence than M1A1.
5. M1150 driver versus commander: driver uses navigation resolution; commander uses the modern tier. HIMARS: only the driver receives DVE; no thermal targeting sight is granted to launcher stations.
6. EC635 sensor gunner (uid 3): thermal mode works. Its passenger seats (uid 1/2), and infantry/cargo seats on IFVs/SH-60, do not inherit thermal access.
7. Repeat with shaders off and on; thermal characteristics should remain the same. Switch camera/seat/vehicle and leave the vehicle to check cached sensor resets and normal rendering restoration.
8. Repeat a representative enabled/disabled vehicle on the actual server after deploying the same support classes and definitions there. Profile FPS is a maximum sensor cadence, not a promise of achieved FPS on slow hardware.
