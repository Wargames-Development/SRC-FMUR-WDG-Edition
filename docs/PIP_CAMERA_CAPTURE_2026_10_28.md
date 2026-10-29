# PiP camera failure: mperf capture review

Capture: `2026-10-28_16-49-10.536-client`, Wargames Release, Windows.
User sequence: thermal PiP scope, regular PiP scope, thermal binoculars.

## Confirmed defect and fix

B5: the installed `FMUR-WDG-Edition-1.8.06_X183-dev.jar` includes the shared
camera service and vanilla provider but omits
`com/flansmod/client/compat/AngelicaCameraTerrain.class` and its inner renderer.
Angelica 2.2.14 is installed. The camera selects that adapter when Celeritas is
active; a missing class disables the lightweight camera until reload/world
change. Both thermal and color use this shared path, explaining their common
failure. A runtime failure was retained in diagnostics but never logged by
the lightweight branch, leaving the supplied client logs without its cause.

The original build only included adapter source when `angelicaCompileJar` was
explicitly supplied. This made a successful ordinary build incompatible with
the user's renderer. That packaging behavior was incorrect for the requested
stock Angelica target.

Changes in this repair:

- `build.gradle`: always compile adapter source. Default builds resolve pinned
  compile-only Angelica 2.2.14, JOML 1.10.8, fastutil 8.5.18 and the Java-8
  JVM-downgrader API 1.3.5. The existing local-jar override remains available.
  Jar creation checks that both adapter classes exist. No renderer libraries
  are bundled, and optional runtime loading remains behind the client boundary.
- `CameraRenderManager.java`: log a changed lightweight failure reason using
  the regular warning logger, even when debug logging is disabled. Successful
  frames do not reset the warning key and spam identical intermittent failures.
- `PIP_THERMAL_REDESIGN.md`: correct the build instructions and compatibility
  description. This file records capture evidence and the focused regression.

## What the capture measures

| Metric | Recorded result |
| --- | --- |
| Duration / frame samples | 23.154 seconds / 13,520 |
| Mean frame time | 1.710 ms (about 585 FPS from reciprocal mean) |
| p95 / p99 frame time | 2.500 / 4.000 ms |
| Maximum frame time | 57.629 ms, near capture start |
| Slower interval | At 10-12 seconds: about 356 then 296 FPS |
| Loaded entities / tile entities / chunks | 5 / 150 / 441, constant in interval rows |
| Profiler estimated overhead | 6.885% |
| GPU query pool exhaustions | 3,080; sampled GPU totals are incomplete coverage |
| Mean sampled terrain GPU time | 1.341 ms; not total GPU frame time |

There are no markers in `markers.csv`. The sequence is known from the user,
but the export does not identify exact device-switch timestamps. Stage-specific
FPS or acquisition rates cannot be assigned reliably from those interval rows.
The camera had a concrete packaging failure, so the capture cannot establish
working-PiP performance, thermal refresh limits, or recovery of the old FPS loss.
The 10-12 second dip alone does not establish its cause.

## Validation and acceptance

Review: B5 addressed by unconditional adapter compilation and archive checks.
No packet, definition, save, thermal limit or rendering-mode semantics changed.
The compile-only dependency does not make Angelica required at runtime.

Commands completed successfully with Java 8 on Windows:

```text
gradlew.bat --no-daemon compileJava jar
gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava thermalGpuChecks reobf
git diff --check
```

The GPU command used the existing LWJGL-native, MCHR-class and installed-DH
arguments documented in the redesign report; it did not use the special
`angelicaCompileJar` flag. Results: 15,822 profile/timing assertions and 423
GPU/compatibility assertions passed. Post-reobfuscation archive inspection
confirmed both adapter classes and zero bundled renderer dependency classes.
Bytecode inspection confirmed SRG Minecraft method names in the output.
Compiler deprecation/unchecked and existing ForgeGradle warnings remain.

Local output from the first packaging repair (superseded by the follow-up below):
`build/libs/FMUR-WDG-Edition-1.8.06_X183-dev.jar`.
SHA-256: `30354D08C1AB00CABDD30828E7231C95773C14FE5254D164863310C55CC08D19`.
The existing build number was preserved. This output has not been tested inside
the user's running Minecraft instance.

Reproduce before the fix with an ordinary build in an Angelica world: the
adapter is absent from the archive and all three camera devices can be
unavailable. After the fix, ordinary build output must contain both adapter
classes while containing no `org/embeddedt`, `org/joml`, or Angelica dependency
classes. Run existing offscreen thermal/depth tests and verify packaging again
after Forge reobfuscation.

In-game acceptance still requires replacing the old FMUR jar and restarting,
then repeating the user's three-device sequence with packs off/on. Confirm live
images, genuine magnification and occlusion before comparing FPS. Add profiler
markers for each device and a no-scope baseline; check the log for `[Camera]`
warnings. Existing device-defined thermal limits must remain unchanged.

No game instance jar is overwritten by this repair. The missing adapter fix
does not by itself prove that the complete transformed renderer runs correctly.

## Follow-up: startup crash at 16:59

Report: `crash-2026-10-28_16.59.46-client.txt`.

C1: FMUR fails during pre-initialization in `BlockFlansWorkbench` because the
installed jar still references MCP development field `Material.iron`. Its
bytecode also retains `setHardness`, `setResistance` and `getSubBlocks`. The
configured Forge mappings require SRG runtime names, including
`Material.field_151573_f`, `func_149711_c` and `func_149666_a` respectively for
the checked iron, hardness and override references. The Java source is correct;
the installed artifact has not been remapped for the game.

The installed jar at diagnosis had SHA-256
`36DC3BD5482035ED7EEECD732A9C7E633C4D39B0734AA0B362A5420F89B10528`.
It differs from the previously inspected remapped artifact. Its build/copy
history cannot be determined from the crash report. ForgeGradle normally wires
remapping into assemble/build; a direct `jar` invocation was allowed to produce
an installable-looking development artifact at the same output path.

Fix in `build.gradle`: finalize `jar` with `reobf`. After remapping, inspect the
workbench class with ASM and reject output missing the mapped iron field,
hardness call or creative-list override. This is a focused guard for the
reported packaging failure, not validation of every runtime API reference.
No production Java, content definitions, networking or save formats changed
in this follow-up.

Validation completed:

- `gradlew.bat --offline --no-daemon compileJava jar`: successful; Java was
  up to date, jar creation and automatic reobfuscation both executed.
- Independent `javap` inspection: `field_151573_f`, `func_149711_c` and
  `func_149666_a` are present in the final workbench class.
- Archive inspection: both camera adapter classes are present and renderer
  dependency classes are absent.
- `gradlew.bat --offline --no-daemon assemble --dry-run`: valid task graph,
  including jar -> reobf -> assemble. This was a task-graph check, not a second build.
- `git diff --check`: passed. Existing ForgeGradle warnings remain.

Latest replacement output: `build/libs/FMUR-WDG-Edition-1.8.06_X183-dev.jar`.
SHA-256: `564DB16CFE68E753215FF1C4E57ABEBAA2CB63556B6776B70D85F766D91D50C5`.
Build number remains unchanged. No game instance jar was overwritten.

In-game test: replace the installed FMUR jar, restart, verify pre-initialization
reaches the main menu, load the world, then repeat thermal PiP, regular PiP and
thermal binoculars. The startup correction has been verified in packaged
bytecode; actual game startup and camera rendering are still unverified.
