# Rifle balance

The local BFMC Gun Pack now balances 8 bolt actions and 13 DMRs against a
20-HP player wearing full TaP-Escalation combat armor: helmet (20%), uniform
(30%), vest (5%), and cosmetic footwear (0%). Reduction totals 55%.

| Rifle | Base damage | Armored body | Armored head | Armored Altyn head |
| --- | ---: | ---: | ---: | ---: |
| Bolt action | 26 | 11.7 | 23.4 | 11.7 |
| DMR | 12.5 | 5.625 | 11.25 | 11.25 |

These give one bolt-action headshot except against an Altyn, and two DMR
headshots or four torso hits. The .338 seven-round magazine retains its 10%
falloff past 100 blocks; these thresholds still hold there. Limb modifiers,
attachments, enchantments, absorption, regeneration and penetration through
cover can change the result. Bolt-action base/body damage also increases.

## Files and application

- `GunType.java` reads optional `PlayerHeadshotMultiplier` (0 = use ammunition)
  and `AltynHeadshotMultiplier` (default 1). Invalid negative/nonfinite values
  are rejected through the existing definition error handler.
- `PlayerHitbox.java` applies these settings only to player head hits using
  the fired weapon and equipped helmet. Existing armor reduction still applies.
- `balance_rifles.ps1` updates only an explicit selection of 21 gun definitions.
- `test_rifle_balance.ps1` checks definitions, armor assumptions, compatible
  ammunition and range thresholds against the actual local pack.

The content packs under `eclipse/Flan` are ignored by Git and are not bundled
in the mod JAR. The balance script preserves a reproducible copy of the edits:

```powershell
./tools/balance_rifles.ps1
./tools/balance_rifles.ps1 -Check
./tools/test_rifle_balance.ps1
# For another extracted BFMC Gun Pack:
./tools/balance_rifles.ps1 -PackRoot 'C:/path/to/BFMC Gun Pack'
```

Use the updated mod and balanced content pack together on client and server.
No existing packet IDs, NBT keys, registry identifiers or save formats change.
Packs omitting the new fields preserve their previous behavior. All .50-caliber
weapons (including Beowulf), QBU-10, VKS, M82A3, NTW-20, Alligator, ammunition,
armor and other guns remain unchanged.

## Verification

`gradlew.bat compileJava` passed. `test_rifle_balance.ps1` passed 85 available
gun/ammunition/range cases. Reapplying the balance script changed zero files.
File hashes confirmed the initial edit touched only the 21 selected guns.
Review found no new client imports, networking changes or persistent state.

In-game testing remains manual: restart with the updated mod and packs, disable
natural regeneration, and use a full-health survival target with unenchanted
TAP combat armor and no potion effects. Use guns without damage attachments.
Check a bolt headshot kills; replace the helmet with an Altyn and confirm the
first headshot leaves the target alive. Reset health between trials. Check DMR
headshots kill on hit 2 and torso shots on hit 4. Repeat with tracer magazines
and the SR338/L115 seven-round magazines on both sides of 100 blocks. Allow
hurt immunity to expire between shots. Repeat on a dedicated server and spot
check the excluded heavy rifles against their prior behavior.

Pre-existing limitation: M40A5 references `762x51flash5rdmag`, which has no local
ammunition definition. This unavailable magazine is reported and skipped by
the calculation test; its reference was left unchanged.
