# Creative inventory compatibility

## Confirmed cause and ownership

The affected pack log identifies
`com.flansmod.client.PlayerEquipmentClientHandler$EquipmentGuiCreative` and the
call chain `NEIController.handleSlotClick -> GuiContainerManager.handleSlotClick ->
PlayerControllerMP.windowClick`. This is FMUR's creative GUI replacement.

The installed NEI 2.8.114 registers the exact vanilla `GuiContainerCreative.class`
in its custom-slot exclusion set; `GuiInfo.hasCustomSlots` uses exact class lookup.
MouseTweaks 2.4.4 also excludes that exact creative class, and InventoryTweaks
1.59-dev-152 identifies creative screens with an exact-class check. FMUR's subclass
therefore changes how these helpers treat a creative inventory. NEI can enter its
ordinary Shift/fast-transfer path and send GUI-only catalogue indices to the server's
47-slot equipment container.

EFR's experimental guards/rerouting were the wrong layer for fixing that ownership
mismatch. All source changes from that inventory investigation have been removed
from EFR. Its earlier unrelated shader/water changes remain committed and intact.

## Implementation

Only FMUR's `PlayerEquipmentClientHandler` production source changed:

- Preserve the incoming vanilla creative screen object. Remove `EquipmentGuiCreative`.
- Use Forge `DrawScreenEvent.Pre` to position the same equipment slot views and
  perform the existing equipment-change synchronization.
- Use `DrawScreenEvent.Post` to draw a thin slot rim without covering the items.
  Dimensions 195x136 are the unchanged vanilla creative GUI constructor dimensions.
- Retain the existing survival inventory screen subclass and world/player rendering.

There is no click handler, replay, index translation, new item transfer algorithm,
new network message or third-party mod hook. `PlayerEquipmentInventory`,
`EquipmentContainerPlayer`, `EquipmentSlot`, item classification, packet validation
and packet registration are unchanged. The NV slot remains 45 and face slot 46 in
the underlying player container; both retain their one-item limit. Goggles remain
restricted to the NV slot, and face-slot armour to the face slot.

The production change stays in an existing `@SideOnly(CLIENT)` handler. Common
classes do not acquire client dependencies. Other mods' custom creative screens are
left untouched; this fix covers the vanilla creative GUI that FMUR had replaced.

## Validation

- Java 8 `bash gradlew --offline compileJava`: passed.
- Java 8 `bash gradlew --offline clean build -PmodBuildNumber=178`: passed. X178
  follows the installed X177; the build-number override does not edit gradle.properties.
- `testCreativeInventoryCompat`: passed against the compiled production handler,
  Minecraft/Forge classes, installed NEI 2.8.114, InventoryTweaks dev-152 and
  MouseTweaks 2.4.4. Installed helpers precede old development versions in classpath.
- The test retains the actual GUI object, reproduces helper rejection/recognition
  differences for the previous subclass, and executes the unchanged production NV
  Shift-equip/unequip and slot validation methods, occupied-target handling, item
  totals and cursor checks in creative and survival modes. It also verifies only
  equipment view coordinates move.
- The isolated harness uses constructor-free objects to avoid a GL context and full
  content-pack startup. Its container fixture uses the real slot/transfer methods
  and the existing vanilla slot layout. Positive face-slot equip needs actual content
  loading and is explicitly an in-game acceptance check; it is not claimed automated.
- Jar inspection: removed creative GUI class absent; existing equipment container,
  validators and sync packet classes compared with the installed X177 jar.

Run the targeted checks with Java 8:

```sh
bash gradlew --offline -I tools/creative_inventory_compat.gradle \
  -PcompatModsDir='/path/to/minecraft/mods' testCreativeInventoryCompat
```

Exactly one NEI, InventoryTweaks and MouseTweaks jar must be present in that folder.
Test helpers remain under tools and are not packaged into the mod.

## Minimum multiplayer acceptance

Replace the experimental EFR jar with the restored EFR build on every side where
it was installed. Replace FMUR with X178 on the client; its server gameplay code is
unchanged, although matching versions on both sides are preferable. Restart before
replacing jars and keep only one jar for each mod. No running instance was modified.

1. On a creative catalogue tab, pick a stack, hold Shift and place it on an empty
   hotbar slot; repeat across occupied/full hotbar slots and drag. Check slot/cursor
   counts after closing/reopening inventory and reconnecting.
2. On survival inventory and the creative player-inventory tab, Shift-equip goggles
   and face equipment. Each must use only its appropriate empty custom slot. An
   occupied target must not swap, delete, duplicate or spill the item into the other
   equipment slot. Ordinary items and ordinary armour must not enter either slot.
3. Shift-unequip both; verify totals and cursor are unchanged after reconnecting.
4. Check ordinary chest Shift-clicking and equipment slot icons/borders at your GUI scale.

These live checks remain required. Headless compatibility checks cannot establish
full multiplayer input timing or visual acceptance.
