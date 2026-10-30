# Long-range combat balance

Apply with `./tools/balance_long_range.ps1`, or pass `-FlanRoot <Flan directory>`
for a deployed pack. `-Check` validates without writing. Both client and server
need the updated packs; stone penetration also requires the updated mod.
The local `eclipse/Flan` packs are ignored by Git, so the script is the tracked
source for these pack changes. Restart the game/server after applying.

Rifle ammunition used by AR, CR, LMG, SR and DMR definitions (and the imported
AK308, Dragunov SVD, M240 and VHS2) gets a final FallSpeed override of
`original * (256 / 500)^2`. Existing gravity values remain above the managed
block so reapplication never compounds the change. Shared ammunition affects
every gun using it. This keeps cartridge differences, muzzle speeds and drag;
500-block drop approximates the former 256-block drop, rather than matching it
exactly because drag increases flight time. Pistols, shotguns and launchers
are excluded unless they share selected rifle ammunition.

.50 BMG magazines (50cal identifiers and TripleAction50BMG), NTW-20's 20x82
magazines and 14.5x114 ammunition (Snipex magazines and the shared AP bullet), including tracer variants,
get a 25% server-owned chance per eligible block to penetrate rock
with hardness 0 through 2, including stone, cobblestone and stone brick.
Penetration consumes 0.75 penetration power and respects the existing block
count limit. Stone stays intact. A successful penetration keeps 50% damage
and 30% velocity; collision processing shortens the remaining travel in that
tick so targets beyond the slowed endpoint cannot be damaged immediately.
Bedrock, obsidian, metal and explosive impact rounds are excluded.

The Russian VKS and KORD share the pack's 50cal ammunition and inherit these rules.
The distinct 12.7x55 subsonic ASh-12 cartridge is excluded.

Range damage multipliers for these heavy rounds are 100% through 100 blocks, 90% beyond
100, 75% beyond 250, and 60% beyond 400. These multiply penetration damage loss
and existing armor/hitbox modifiers. The existing segmented-decay loader uses
the last decay definition, which is the managed override.

Optional bullet fields: `StonePenetrationChance` (default 0),
`StonePenetrationDamageRetention` (0.5), and
`StonePenetrationSpeedRetention` (0.3). Values must be finite and in [0, 1];
zero speed retention disables penetration. Old packs retain existing behavior.
No packet IDs, NBT keys or registry identifiers change.

The four woodland/snow ghillie pieces, CNVD-T thermal scope and Barrett SSRS
gain the existing gold Legendary suffix in English localization. This is the
pack's display-label convention; it does not change loot tables or spawn rates.

## Verification

- Run `./gradlew.bat compileJava` and `./tools/test_long_range.ps1`.
- On a dedicated server, shoot level targets at 100, 256 and 500 blocks with
  Snipex, .338, .50 BMG and an ordinary rifle. Compare standard/tracer variants.
  Expect flatter trajectories with increasing holdover at increasing distances.
- Fire at least 100 .50 BMG rounds through a one-block stone wall toward an
  unarmored target. Expect occasional hits, substantially lower damage and
  visibly slower travel. Repeat with cobblestone and stone brick.
- Repeat with two-block walls, wood before stone, close/far targets, oblique
  shots, bedrock, obsidian and iron. Ordinary rifle rounds must stop on stone;
  .50 rounds must respect penetration power / block limits and leave stone intact.
- Repeat penetration and range checks with NTW-20, Snipex, VKS and KORD,
  including their tracer ammunition.
- Compare open-air .50 damage around 100, 250 and 400 blocks; test cover plus
  range loss together. Armor may further reduce the result.
- Check all six gold Legendary names in inventory and a second player's view
  of tracers after a successful penetration. Client impact prediction can end
  its cosmetic tracer at stone; damage and continuing flight are server-owned.

In-game multiplayer balance and tracer synchronization require manual testing.

## Ghillie concealment

`ModelGhillieBase` adds an opaque olive-green / off-white face veil with a darker woven
grid to woodland and snow hoods, covering the old eye opening. Two halves meet
at a raised center seam and angle back 18 degrees toward either cheek. The veil
extends an additional quarter model pixel at each outer edge and moves
with the player's head. Olive / snow fabric cuffs overlap the glove and sleeve
on both arms, including first-person gun rendering. Panels use model geometry
and fixed cloth colors; existing pack textures and UVs remain compatible.

Check both ghillie variants from the front, sides and at range, with head turns,
crouching and held weapons. Check both wrists in first and third person while
aiming / reloading. Texture alpha must no longer expose wrist skin.

The current model was also rendered in an offscreen LWJGL context: both variants'
face and cuff geometry rendered without OpenGL errors, and texture enable state
was restored after the cloth pass. This does not replace in-game pose checks.
