# Item names, descriptions and inventory art

Apply after other gun/armor installers:

```powershell
python tools/install_item_presentation.py
python tools/install_item_presentation.py --check
```

`--pack-root PATH` selects an unpacked Flan directory containing the existing
BFMC Gun Pack, M4A1 Lasers and TaP-Escalation packs. The active development
packs in `eclipse/Flan` are ignored by Git; this directory preserves the reviewed
presentation changes. Re-run this installer after importing content, because
older installers can restore their original names and rendered icons.

`catalog.json` contains 170 gun-folder names/descriptions, 72 attachment
names/descriptions, and explicit icon assignments. Manufacturers are given for
146 identifiable firearms; test items, tools, generic melee items, fictional
laser weapons and the unidentified custom KS-20G are labeled honestly instead
of inventing manufacturers. Existing ammunition and weapon behavior determine
gameplay, even where they differ from real-world chamberings or prototypes.

The installer adds missing English item/block language keys and updates the
reviewed gun/attachment keys. Other existing translations are preserved. The
main mod's English language file also supplies the canonical gun/attachment
names. Other locales have not been translated in this pass.

Descriptions use the existing underscore line separator. Manufacturer text is
always before the old `Uses:` section, so it remains visible in gun tooltips.
Attachment effects are calculated from the existing multipliers; changing a
tooltip never changes those multipliers. Optic magnification is read from the
active definition, including the C79 and VMR 1x/6x settings.
Identifiable attachments list their manufacturer first, including the EOTECH
1x holographic sight, Raytheon ELCAN optics and Magpul grips.

## Current artwork policy

The C25, C7A2, G36, AK-308, SVD Dragunov, M240, VHS-2 and Triple Action Thunder
use **32 × 32** inventory sprites rendered from their pack models and textures.
The weapon angles, limited palettes and edge shading follow existing pack art
such as the M16A4, AN-94, M1911 and Barrett SSRS. The CNVD-T, VMR and C79 use
near-horizontal views. The handheld flashlight displays its built-in sprite in
inventory. `original_icons` in `catalog.json` provides the fallback paths for
the remaining pack items.

All 134 TaP armor icons are now **32x32**. Each uses its own model silhouette
and actual UV-mapped camouflage, sampled directly on the pixel grid. Uniforms
show the jacket and sleeves rather than squeezing in the matching trousers.
Vests use their own pouches, straps and outlines, rather than a shared vest
stencil. Edge shading is inset, alpha is binary, and tiny disconnected uniform
fragments are removed. No pixels are added outside the item's silhouette.
The FAST helmet includes small hand-placed mounting-plate and rail details.
There is no AI generation or guessed camouflage palette in this revision.

`draw_icons.py` uses the existing armor geometry extractor and actual pack skins.
If the geometry cache is absent, extract it first:

```powershell
./gradlew.bat -I tools/tap_armor_icons.gradle extractTapArmorGeometry --offline
python development_assets/item_presentation/draw_icons.py
python tools/install_item_presentation.py
python tools/install_item_presentation.py --check
```

The pack replacement PNGs live in `icons/` and the mod's flashlight source
lives in `builtin_icons/`. `artwork.json` records the source of the sprites.
`references/approved_M1911.png` preserves the accepted M1911 sprite.

## Creative inventory organization

The creative inventory includes these three tabs:

- `tabFlan6`: FMUR Attachments; includes the Gun Modification Table (metadata 1).
- `tabFlan7`: FMUR Ammunition; includes bullets, magazines, shells, missiles, and launcher grenades.
- `tabFlan8`: FMUR Gadgets; includes hand grenades, bags, sensors, medical tools and binoculars.

FMUR Vehicles & Parts contains both workbench variants and the items formerly
listed under FMUR Parts and FMUR Mechas. The team tab is now FMUR Armor. The
handheld flashlight is in FMUR Guns. The blocks marked `HideFromCreative` in
`catalog.json` remain registered for existing worlds.

Restart the development client after installing. In the Attachment Station,
shift-click a gun into the gun slot, then a compatible optic into the sights
slot. A second optic stays in the inventory until the installed one is removed.
Shift-click the optic or gun again to return it to inventory.

## Latest wearable and inventory fixes

The geometry exporter now preserves ghillie limb groups and includes the current
model's wrist cuffs, face veil and weave panels. Suit icons omit the separate
leg groups and are verified to form one connected silhouette. Helmet exports
use the current model rather than stale cached geometry. Cloth panel colors
match the model's own solid-material rendering.

All six balaclavas use a rounded hood, neck and eye opening instead of the
armor cube outline. The wz.93 Pantera vest has a visible V neckline. Ten native
32x32 night-vision sprites cover tan/black GPNVG and PVS-14 variants, including
phosphor variants. Their source PNGs are in `builtin_icons/`; the installer also
copies these to the main mod resource folder.

### Creative hiding versus disabling an item

`HideFromCreative true` keeps an item registered and usable in old inventories
or commands, but removes it from Creative. It is set for TEST, both Frag utility
entries, the Tadokoro bomb, APS tank utility (`apstank`) and tankfire. The
flagpole, all three team spawners, soldier spawner and corpse spawner are also
hidden. The ordinary APS pistol retains its weapon entry.

`CreateItem false` preserves the full type definition, model and source assets,
but skips item registration and its recipes. This is applied to the
defibrillator and **33 unused ammunition definitions**, including its recharge.
`content_audit.json` lists the exact affected definitions and active ammo users.
The audit includes handheld and mounted guns, vehicle/AA ammunition, and
secondary attachment ammo. The two Frag utility items are deliberately hidden
rather than unregistered. The installer rejects a disabled ammo item if a weapon
starts referencing it later, so new content cannot silently lose ammunition.

`InventoryCategory Ammo` handles rounds defined as grenades (including 40mm);
`InventoryCategory Gadgets` routes other utility definitions. Both item-loading
paths honor these optional fields, whose defaults preserve existing packs.

**Compatibility:** client and server need matching updated code and packs.
Existing saves containing the removed defibrillator or unused-ammo items may
report missing item mappings and discard those stacks. Hidden-only items remain
registered. To reintroduce a disabled item, set `CreateItem true` in its catalog
rule and reinstall; its registry name and assets have been preserved.

## Review and manual regression checklist

1. Restart the development client after installation, or reload resources for
   icon-only changes. Definitions require a restart.
2. In the creative search tab, search `HK` and `Heckler & Koch`: HK416, MP5SD,
   G11, G36, MP7 and other HK firearms should appear. A third-party browser that
   searches only display names needs tooltip search enabled for manufacturer
   queries.
3. Check VHS-2, GLOCK 17, GLOCK 18, HK416, HK45 Compact, ACR, FD338, ARX160,
   Scorpion EVO 3 A1 and Desert Eagle .44. Their old registry IDs still work.
4. Hover every attachment, particularly Heavy Barrel, PSO-1, C79 and VMR.
   Descriptions should be readable English, with magnification and configured
   non-neutral effects. Switch VMR between 1x/6x and SpecterDR between 1x/4x.
5. Compare the 32 × 32 armor sprites, including the Croatian, Greek and Serbian
   uniforms, and the IOTV, MTV and IDF vests. Compare the eight redrawn guns and
   three optics with the M1911 and Barrett SSRS.
6. Check the flashlight under FMUR Guns and the gun table under Attachments.
   The inventory table should face the viewer. In first person, check the
   Barrett SSRS at hip, during reload and at full ADS.
7. Inspect a painted gun, equip/reload/fire representative weapons, and join a
   dedicated server with matching content packs. Model skins, paint IDs,
   ammunition, recoil, attachments and saved inventories must remain intact.

## Naming references

Manufacturer identities and selected canonical names were checked against
[HK](https://www.heckler-koch.com/en/Products/Military%2520and%2520Law%2520Enforcement/Assault%2520rifles/HK416),
[HS Produkt](https://hs-produkt.hr/),
[CZ](https://www.czfirearms.com/en-us/mle-products/submachine-guns/cz-scorpion-evo-3-a1),
[HK45 operator manual](https://hk-usa.com/wp-content/uploads/2025/05/HK45-Series-Operators-Manual-5.12.25.pdf),
[Beretta ARX160](https://www.berettadefense.com/products/arx160-16-bdt/),
[KRISS Vector](https://store.kriss-usa.com/download/KRISS_VECTOR_G2/2022_KV_G2_SMG_DS.pdf),
and [F&D Defense](https://www.fddefense.com/rifles/).
Variant identification also uses the existing definitions and modeled equipment;
this is presentation cleanup, not a historical ammunition or balance conversion.

## Validation performed

The installer checks the pack and built-in replacement PNGs for exact 32 × 32
dimensions and verifies that the installed assets and definitions match the
catalog. Armor generation also checks that alpha matches each geometry mask.

Java changes are validated with `gradlew.bat compileJava --offline`; resource
processing and `git diff --check` cover language/patch consistency. The manual
client checks above remain the final visual/category acceptance checks.

The isolated development-client probe passed with **72 attachments and 200
ammo types** (before the cleanup below), flashlight placement, all three workbench metadata variants,
absence of the gun table from weapons, both tab icons and empty-list fallbacks.
It opened no world and exited successfully; the build number stayed X210.

To repeat, prepare `build/item-presentation-check/instance/Flan` and its `mods`
directory with copies or directory links to the development packs/dependencies,
then run:

```powershell
./gradlew.bat -I tools/item_presentation_checks.gradle runClient --offline
```

The opt-in probe and Gradle init script live under `tools/`; they are not
included in the production mod. They stop early if the isolated content folder
is absent or empty.

## Files changed for the inventory revision

- `FlansMod.java` and `CreativeTabFlan.java`: append the two tabs and their icons.
- `ItemAttachment.java`, `ItemBullet.java`, `ItemHandheldFlashlight.java`: set
  the requested item categories, including vehicle ammunition in the ammo tab.
- `BlockFlansWorkbench.java` and `ItemBlockFlansWorkbench.java`: move only the
  gun-table variant to Attachments and preserve metadata for all three tables.
- `en_US.lang`: labels for Attachments and Ammunition.
- `catalog.json`, `artwork.json`, `draw_icons.py`, `icons/` and the installer:
  original gun/scope restoration, approved M1911, CNVD-T and per-item armor art.
- `tools/item_presentation_checks.gradle` and its Java probe: exercise the
  actual registered items and workbench variants in the isolated client.

## Final validation of the latest cleanup

- `compileJava --offline`: passed.
- Isolated client check: passed with 72 attachments, 169 registered bullet
  items, 8 launcher rounds in Ammunition and 34 disabled registrations.
- The check enumerates real Creative catalogs and verifies utility/test items
  are absent, checks Gadgets, table variants and tab fallbacks, and ensures all
  active gun ammo survives (including the existing internal energy projectiles).
- Geometry refresh: 91 current models, 32,076 faces, including ghillie veil,
  weave and cuff geometry.
- Asset checks cover 146 hard-alpha 32x32 sprites, all ten NV icons, original
  gun/scope policy, connected ghillie suit silhouettes and deterministic output.
- No world was opened; build number remains X210. Visual acceptance in the
  user's existing world still requires restarting/reloading the client.

Additional changed files: `InfoType.java`, `ContentManager.java` and the legacy
loader in `FlansMod.java` implement the definition controls; `ArmourType.java`
inherits the existing creative-hiding flag; `ItemGrenade.java`,
`BlockSpawner.java`, `CreativeTabFlan.java` and language labels handle categories
and hiding. The armor extractor and renderer helper preserve native limb/material
groups. `wearable_icons.py`, `builtin_icons/`, `content_audit.json`, the catalog
and installer keep the revised artwork and pack changes reproducible.
