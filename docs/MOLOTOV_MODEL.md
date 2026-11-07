# Molotov bottle model

The supplied Blockbench project is preserved in `development_assets/molotov/molotov.bbmodel`.
Its OBJ export is bundled as `assets/flansmod/models/molotov/molotov_runtime.obj`:
all faces are triangulated and coordinates use decimal notation for Forge 1.7.10's
OBJ loader. The original texture is bundled as `assets/flansmod/skins/WDG_Molotov.png`.
Forge binds that skin through the grenade definition; it does not need the MTL.

Build the mod with the usual workflow, then apply the content-pack selection:

```powershell
./tools/install_molotov_model.ps1
# Or target another unpacked BFMC Gun Pack:
./tools/install_molotov_model.ps1 -ContentPack 'C:/path/to/Flan/BFMC Gun Pack'
```

This changes only `Model` and `Texture` in `grenades/Molotov.txt`. Distribute that
updated definition with the updated mod. Existing item IDs, inventory icon,
throw timing, damage, fuse, and network/save formats are preserved.
Tankfire and other grenades retain their existing models.

Manual validation after restarting the client:

1. Equip a Molotov in first person: check the textured bottle and cloth, scale,
   and hand placement. Check third person with another player observing.
2. Throw it: the bottle should remain visible through the windup and in flight;
   detonation and fire should behave as before.
3. Check another grenade and Tankfire for unchanged appearance and behavior.
4. Join a dedicated server using the same content definitions; confirm throwing
   works and the server does not attempt to load the client model class.

Validation completed: Java 8 `gradlew.bat --offline --no-daemon compileJava`,
loading the runtime OBJ with Forge's actual `WavefrontObject` parser (141 vertices,
178 textured triangles), installer idempotence, and `git diff --check` passed.
Visual alignment and lighting still require an in-game check.

## Lighting animation

Molotovs (`ShortName molotov`) use vanilla `fire.ignite` instead of the pin-pull
sound at tick 4. The server broadcasts this once to nearby players. The first-person
free hand carries a cosmetic flint and steel, reaches the rag, strikes it at the
same point in the animation, then lowers before the throw. A flickering vanilla
flame-particle sprite stays attached to the rag from ignition until release.
The tool does not require or consume an inventory item. Other grenades retain
their pin-pull gesture and sound. Release remains at tick 20 of 40.

Check a full stack and the last Molotov, creative mode, slot switching during
preparation, death, and changing worlds: the animation/effect should end through
the existing cancellation path. Listen from a second client for one ignition
sound and the existing throw sound. Check that other grenades still use pin-pull
audio and that the hand/effect do not leave altered lighting on subsequent items.
The lighter and rag effect are first-person presentation only. The idle pose also
holds flint and steel in the left hand, without playing a sound or lighting the rag.

## Ground fire

At detonation, Molotovs also place a scattered patch of real vanilla fire within
three blocks horizontally and from two blocks below to one block above the burst.
Only air above a solid top surface in already loaded chunks is eligible. Each
eligible column has a 50% ignition chance. WGCore's existing explosion decision
filters the candidate positions; denied explosions/block damage produce no fire.
The global Teams explosions switch also disables the patch. This does not require
`ExplosionBreaksBlocks true`, and does not remove the existing entity/particle effects.
Other grenades keep their existing `FireRadius` behavior.

Test on flat stone, stepped ground, near water, at a loaded-chunk boundary, and
across protected/unprotected territory. Confirm fire appears only on valid allowed
surfaces and is visible to a second client. Ordinary vanilla fire rules control
its later spread, burning, and extinguishing, including the `doFireTick` game rule.
No save, packet, item ID, or content-definition migration is needed.

Validation: `gradlew.bat --offline --no-daemon -I tools/attachment_lighting_checks.gradle
compileJava attachmentLightingChecks` and `git diff --check` passed. The existing
headless suite covers grenade release/cancellation regressions. Ground-fire and
territory behavior, plus idle tool alignment, require the in-game checks above;
the lightweight harness cannot bootstrap the vanilla fire registry without a
Forge launch.
