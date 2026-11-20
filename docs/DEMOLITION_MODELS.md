# M112 demolition charge and M57 firing device

The local BFMC content pack now replaces the C4 presentation with the supplied
M112 and M57 models. Registry names remain `c4cn` and `c4remote`; existing stacks,
recipes, ownership, explosive damage, sticky behavior, prime delay, packets and
saved-data formats are preserved. The M57 keeps `Icon C4Remote`.

## Changed files and responsibilities

- `client/model/BFMCpack/ModelM112.java`: loads the supplied charge OBJ at handheld scale.
- `client/model/BFMCpack/ModelM57.java`: loads the detonator and rotates its long rear
  handle around its upper hinge. The ninth object in the original OBJ is the handle.
- `client/model/RenderM57.java`: renders the held device with one skin-textured hand;
  the handle rests open, closes during a press, then recovers over eight ticks (0.4 seconds).
  Inventory rendering continues to use the original icon. The press is cosmetic
  and local to first person; other players see the held model.
- `client/ClientProxy.java` and `common/CommonProxy.java`: register and start the
  client animation through the existing proxy boundary.
- `client/model/RenderGrenade.java`: gives `c4cn` a one-handed grip with its broad
  face turned into the palm, and the short forward throw restored from before
  the underhand and sideways variants. Release timing and cooldown are unchanged.
- `common/guns/item/ItemGrenade.java` and `common/PlayerData.java`: share M112
  release at tick 4 (0.2 seconds) and animation/recovery of 12 ticks (0.6 seconds).
  The existing definition's throw delay can still set a longer cooldown; the
  local M112 value is 10, so its effective cooldown is 12. Other grenades keep
  their existing release at tick 20 and 40-tick recovery.
- `common/guns/EntityGrenade.java`: suppresses the legacy C4 spawn-time throw
  effect for M112, in addition to suppressing its preparation pin-pull sound.
- `common/tools/ItemTool.java`: starts the M57 animation and enforces an eight-tick
  recovery using the existing shared weapon cooldown. Remote detonation and tool
  durability now run only on the server. The oldest charge still fires first;
  pressing before its existing prime delay has elapsed does not bypass that delay.
- `assets/flansmod/models/demolition/*_runtime.obj` and `skins/WDG_M*.png`: converted
  supplied geometry and unchanged supplied texture atlases.
- `assets/flansmod/textures/items/WDG_M112.png`: exact 32x32 RGBA inventory sprite.
- `development_assets/demolition/`: original OBJ, MTL, Blockbench and texture files.
- `tools/build_demolition_models.cjs`: reproducible OBJ conversion, with decimal
  coordinates, triangulated faces and named body/handle groups for Forge 1.7.10.
- `tools/install_demolition_models.ps1`: updates the two external content definitions
  and English names, preserving all gameplay fields and the M57 icon.
- `tools/attachment_lighting_checks/AttachmentLightingChecks.java`: checks M112
  release/consumption/remote registration, omitted pin audio, both models with
  Forge's parser, the handle group, and actual PNG dimensions/transparency.
- `tools/attachment_lighting_checks/AttachmentLightingGpuChecks.java`: renders
  the supplied demolition geometry and grips offscreen, checks quick recovery
  and visible handle movement, and saves open/pressed previews under `build/`.

Source paths above are relative to `src/main/java/com/flansmod/` for Java files
and `src/main/resources/` for runtime assets.

## Install and validate

Build the updated mod for the normal client/server distribution, and distribute
the updated content definitions alongside it. The local definitions in
`eclipse/Flan/BFMC Gun Pack` have already been updated. They are ignored by Git;
rerun this installer for any other unpacked copy:

```powershell
./tools/install_demolition_models.ps1
./tools/install_demolition_models.ps1 -ContentPack 'C:/path/to/Flan/BFMC Gun Pack'
```

The converter can be rerun with `node tools/build_demolition_models.cjs`.
The MTL is preserved as source; Forge binds the supplied PNG through the content
definition and does not load the MTL.

Validation completed:

```powershell
./gradlew.bat --offline --no-daemon compileJava
./gradlew.bat --offline --no-daemon -I tools/attachment_lighting_checks.gradle compileJava attachmentLightingChecks
./gradlew.bat --offline --no-daemon -I tools/attachment_lighting_checks.gradle '-PlwjglNatives=C:/Users/Robert Milkovic/.gradle/caches/minecraft/net/minecraft/minecraft_natives/1.7.10' compileJava attachmentLightingChecks attachmentLightingGpuChecks
git diff --check
```

All passed. The installer was rerun and hashes confirmed it is idempotent.
Existing compiler warnings remain. No version increment, packaged jar, commit,
or upload was made. A first attempt to test the remote tool directly in the
headless fixture hit Forge's LaunchClassLoader bootstrap requirement; that
fixture was removed. Live remote detonation and visual alignment remain manual
validation items; the passing headless tests do not claim to cover them.

## In-game checklist

1. Restart with the updated mod and definitions. Equip both items: check English
   names, supplied skins, first-person hands, third-person held models, unchanged
   M57 icon and new M112 icon. Check lighting with and without shaders.
2. Equip M112: only the right hand is visible, gripping the turned charge.
   Right-click: the hand winds back slightly and throws forward, releasing at tick 4;
   another throw is possible after
   tick 12. Check a full stack and the last item; survival consumes one, creative
   consumes none. There must be no pin-pull or legacy C4 throw audio.
3. Equip M57: only one hand is visible, and the long handle is open at rest.
   Let the charge arm, then right-click M57: its long handle should close with
   the hand and spring back. One press fires the oldest charge. Rapid input must
   respect the eight-tick recovery; an early press must not bypass charge priming.
4. Throw several charges and repeat on a dedicated server with another observer.
   Confirm only the owner's charges detonate, once each, and other players see
   the explosions. Check slot switching, death, disconnection and changing worlds.
5. Check an ordinary grenade and Molotov for unchanged hands, sounds and release.

Offscreen GPU previews were inspected for the one-handed grips and open/pressed
handle. They use fixture colors, so actual textures, field of view and shaders
still need the running-game check above. No new third-person arm-animation
system was added. The explosive prime delay remains unchanged.

## Inventory sprite provenance

Built-in imagegen generated the source art; nearest-neighbor sampling produced
the final exact 32x32 transparent PNG, which was inspected at its final size.
Final prompt:

> Create a single Minecraft inventory item sprite: M112 demolition charge, olive drab rectangular soft wrapped brick with a small dark detonating cord connector on top, inspired by provided olive texture reference (not a texture atlas). Crisp authentic hand drawn 32 by 32 pixel art, limited olive green palette, dark outline, highlights on top-left face, front long face visible, slightly isometric three-quarter view. Single centered isolated item occupies most canvas. Transparent background. No hands, lettering, text, shadows outside sprite, grid or other items. Render the sprite as a 32x32 logical pixel grid enlarged using only nearest-neighbor hard square pixels.
