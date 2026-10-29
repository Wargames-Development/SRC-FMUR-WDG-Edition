# Player LOD implementation and acceptance — 2026-10-24

## Temporary WGMap bypass for distance testing — 2026-10-25

The user reports an immediate disappearance at 112 blocks on a view-distance-8
server whose occlusion index is not built. This is the intended terrain-readiness
gate taking over one chunk inside the 128-block native range, then withholding
the far player because no WGMap depth is available.

For testing, `PlayerLodRenderer.USE_WGMAP_OCCLUSION` is temporarily `false`.
The far pass no longer queries/prepares WGMap depth, warms terrain demand or waits
for readiness. The existing integration remains in place; set the constant back
to `true` and rebuild when terrain masking is restored. The historical strict
masking description below applies only when that constant is enabled.

The 512-block default/configured range, visibility rules, projection, self-depth,
native world depth, interpolation, thermal pass, packet fields and server hit
registration are unchanged. Ordinary scene depth can still hide players behind
real loaded terrain. This bypass does not promise distant terrain masking.
Only FMUR's client renderer changes; install the rebuilt jar on testing clients.
The server does not require this renderer-only update if it already has the
dedicated-server visibility crash fix.

Validation: Java 8 `compileJava`, `build` and `git diff --check` passed.
`playerLodGpuChecks` now covers 46 offscreen cases, including 112.01/113/114-block
transition depths; all passed. The packaged renderer's bytecode has no WGMap
depth/warm-up query calls while the bypass is enabled. The renderer, this document
and the existing GPU fixture are the only files changed for this request.
Testing jar: `build/libs/FMUR-WDG-Edition-1.8.06_X171-dev.jar`; the pre-existing
build number 171 was preserved.

Test with two players on the view-distance-8 server without an occlusion index:
cross 110/112/114/128 blocks in both directions, then check 256/511 blocks and
the configured range boundary. Require no WGMap-readiness disappearance and no
duplicate player at the handoff; repeat while scoped. A live multiplayer session
has not been run here.

## Dedicated-server visibility crash fix — 2026-10-25

The supplied Crucible crash report identifies `PlayerLodServer.tick` calling
`EntityPlayerMP.func_98034_c(EntityPlayer)` when another player enters range.
That is `isInvisibleToPlayer`, annotated client-only in Forge 1.7.10 and removed
from dedicated servers. Development compilation and the earlier GPU/packet tests
did not exercise that side-stripped API boundary.

`PlayerLodServer.java` now uses common-side `isInvisible` and scoreboard team
identity. Friendly invisibility reads the concrete `ScorePlayerTeam` getter,
which is available on the server; the abstract `Team` version is client-only.
Unknown team implementations conservatively withhold invisible targets.
This changes no packet fields, hit registration, terrain loading or saved data.

`tools/player_lod_checks/java/com/flansmod/common/playerlod/PlayerLodServerChecks.java`
and its task in `tools/player_lod_checks.gradle` add an inherited-member/field
side-annotation audit for all five LOD server/data classes and six visibility
policy scenarios. A deliberately client-only negative control verifies that the
audit detects inherited stripped calls. The audit failed on the original server
call, then passed after the fix; Java 8 compilation and the existing 21,039
packet/appearance/projection assertions also passed.

Validation commands: `gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle compileJava playerLodServerChecks playerLodChecks -PwgmapRuntime=../WGMap/build/classes/java/main`
and `gradlew.bat --offline --no-daemon build`: PASS under Java 8. Inspected the
reobfuscated jar bytecode: the filter calls the concrete scoreboard getter and
has no reference to the crashing `func_98034_c`. `git diff --check`: PASS.
The rebuilt jar is `build/libs/FMUR-WDG-Edition-1.8.06_X170-dev.jar`; the build
number remains 170, so replace the old same-named server jar before restarting.

Retest on staging with two players entering/leaving the configured LOD range,
then with invisible enemies and teammates (friendly visibility on/off). Require
no server crash and the expected interest filtering. A live Crucible session
has not been run here; unrelated unloaded-gap bullet travel remains unchanged.

## Status

Rendering/configuration and the WGMap client API extension are implemented and
automatically checked. This is **not an accepted zero-error combat implementation**.
No multiplayer gameplay or dedicated-server launch was performed. Real transition,
appearance, latency, shader-pack and combat acceptance remains mandatory.

Existing server player snapshots, hitboxes, rewind, collision, damage, permission
checks, weapon speeds and bullet lifetime are unchanged. Visual actors never join
WorldClient's entity lists and never become hit-registration targets.

The remaining combat blocker is bullet ticking/collision across completely unloaded
server terrain. Forge's 32-block neighbourhood tick check can stop a bullet, even
though the target player itself remains loaded by that player's chunk subscriptions.
Rendering a distant player does not solve that problem.

## Configuration and behavior

The normal FMUR config contains category `Player LOD`, property `Player LOD distance`.
The server default is 512 blocks; accepted range is 0–1024; 0 disables the snapshot
interest set. Restart after changing the file. The server supplies its range and
view distance with every snapshot; client config cannot expand it. This controls
LOD visibility, not ammunition ballistics or an existing normal renderer's range.

At 20 TPS, complete, same-dimension interest snapshots are sent every tick, capped
at 256 nearest eligible targets per viewer. Dead, invisible-to-viewer and FMUR
spectator targets are excluded. Appearance revisions carry copied main hand,
armour, offhand, night-vision, face equipment and profile/skin properties. Revisions
are repaired once per second. A 64-delivery client queue preserves ordinary
appearance/pose ordering while bounding a stalled client's memory.

Nearby real players retain normal rendering. Beyond one chunk inside the smaller
server/client terrain distance, the far pass reuses the real player while it is
available. UUID-checked visual actors continue presentation after tracker exit.
The actors use EntityOtherPlayerMP's interpolation and the normal player renderer,
including existing skin/armour/weapon hooks. Tracker exit is seeded from the real
entity's interpolation pose. This reduces transition discontinuities but has not
been certified seamless in a live client. Disconnects, world changes, dimension
changes, stale streams, entity-ID replacement and removed interest retire actors.

Position and model scale use WGMap projection v2 together, preserving screen angle
and angular size. The precision layer preserves equipment/model self-depth before
compositing into world depth. Its local far plane adapts to larger client distances.
The existing thermal heat-mask pass explicitly includes distant players.

## WGMap masking and compatibility

FMUR requires WGMap `TerrainDepthApi` v1, projection v2, and the new optional
`GAP_COVERAGE_VERSION = 1` extension. Reflection uses documented public client APIs;
there is no compile dependency or common/server WGMap class reference.

`prepareDepthIncludingUnloadedChunks` also covers missing client terrain inside the
client's render distance. It uses ChunkProviderClient's in-memory EmptyChunk lookup;
it does not request/generate chunks. This handles server view distance 8 with client
distance 12/16/32. Loaded native terrain keeps its own depth. MCHR's original
`prepareDepth` behavior, API version and projection version remain unchanged.

Missing, dirty, uncertain, unsupported or incomplete terrain depth **withholds a
distant player**. A few clear CPU rays never authorize drawing a partially covered
human. CPU queries only warm bounded data demand. This prevents the fallback from
showing a whole player through a hill, but means cache warm-up or unsupported GL /
active shader states can delay/hide a contact. It is a deliberate visibility limit,
not a claim that every renderer/mod combination has exact occlusion. WGMap's stored
block classification and revision guarantees still bound terrain accuracy.

Install updated FMUR on both sides and the updated WGMap client. The new FMUR
packet name sorts after all existing packets, preserving their discriminator IDs;
old FMUR clients cannot decode the new packet. No existing packet fields, registry
IDs, NBT keys, saved terrain formats, WGMap wire protocol or build numbers changed.
No jar was packaged, installed, committed or published. MCHR source was read only.

## Files changed

FMUR:

| File | Purpose |
| --- | --- |
| `common/FlansMod.java` | Server-owned distance config/default. |
| `common/CommonTickHandler.java` | Publish visual snapshots after player history capture. |
| `common/network/PacketHandler.java` | Register the new receive-client-only packet at the lexical tail. |
| `common/network/PacketZPlayerLod.java` | Isolated snapshot transport and client enqueue. |
| `common/playerlod/PlayerLodSnapshot.java` | Bounded validated pose/profile/equipment payload. |
| `common/playerlod/PlayerLodServer.java` | Interest filtering and appearance revision ownership. |
| `client/ClientProxy.java` | Register client-only hooks. |
| `client/PlayerLodRenderer.java` | Native/visual handoff, interpolation, draw and lifecycle. |
| `client/PlayerLodProjection.java` | Shared v2 projection math without a hard dependency. |
| `client/PlayerLodDepthLayer.java` | Precision/self-depth layer adapted from MCHR. |
| `client/PlayerLodTerrain.java` | Optional, version-checked WGMap public API bridge. |
| `client/ThermalScopeEffect.java` | Include the far pass in the thermal mask. |
| `tools/player_lod_checks.gradle` and `tools/player_lod_checks/java/...` | Opt-in Java 8 packet/projection and native GPU checks using existing dependencies. |
| `docs/PLAYER_LOD.md` | Scope, review, test results, runtime gates and blocked combat proposal. |

Paths above are relative to `src/main/java/com/flansmod/` unless otherwise stated.
WGMap companion changes are listed in its `docs/FMUR_PLAYER_LOD_API.md`.

## Review/fix/test reports

Implementer: bounded snapshot/presentation stream and additive client API only.
The larger patch is needed for distinct server, network, client, GPU and companion
API responsibilities. No new production dependency or build-system replacement.

Reviewer/fixer findings addressed:

- C1: server capture called client-only brightness/bed methods. Replaced with
  common-side saved-light and bed-direction reads; reviewed side-stripped paths.
- B1: latest-only packet coalescing could lose appearance revisions. Added bounded
  ordered delivery, revision checks and periodic repair.
- B2: native/far threshold used different interpolation times. Both now test the
  rendered interpolation position and the same distance boundary.
- B3: LWJGL 2 requires a 16-slot viewport query buffer. Caught by real GPU execution
  and fixed; larger client distances also receive an adaptive local far plane.
- B4: a larger client distance could leave the reduced-server-distance terrain gap
  unmasked. Added server view-distance metadata and WGMap's opt-in missing-native
  coverage, with unchanged MCHR legacy behavior.

Rendering review: acceptable for further runtime testing, not a perfection claim.
Overall request: NEEDS FIXES/VALIDATION because C2 and T1 below remain open.

- C2: reliable bullet travel through unloaded server gaps remains blocked; no
  replacement hit logic or terrain approximation was applied.
- T1: two-client transitions, real player silhouettes/skins/equipment, scopes,
  shader packs, dedicated startup, 10v10 network/tick performance and combat.

Java 8 validation actually run:

1. FMUR `gradlew.bat compileJava --offline --no-daemon`: PASS.
2. FMUR `gradlew.bat --offline --no-daemon -I tools/player_lod_checks.gradle playerLodChecks playerLodGpuChecks -PwgmapRuntime=../WGMap/build/classes/java/main -PlwjglNatives=build/player-lod-checks/natives`: PASS;
   21,039 packet/appearance/malformed-input/projection assertions, including exact
   WGMap parity; 28 real offscreen normal/scoped/partial-cover/self-depth/large-view
   scenarios. Synthetic geometry is not a real player gameplay test.
3. WGMap `gradlew.bat --offline --no-daemon compileJava test --tests com.wdg.wgmap.client.occlusion.* -Pci=true`: PASS, 43 tests, zero failures.
4. WGMap native `terrainOcclusionGpuCheck` with the FMUR LWJGL natives and installed
   MCHR classes: PASS; native renderbuffer/texture depth, revision invalidation,
   height 256/384, legacy bridge, and added missing-native-gap depth checks.
5. FMUR `git diff --check`: PASS. WGMap edits compared against pre-edit copies of
   the three companion production files; unrelated working changes preserved.

The first GPU run exposed B3; a later fixture run required isolating its synthetic
gap wall from the existing independent stale-region case. Both were corrected and
the final checks above passed. Neither compile nor focused checks incremented
FMUR build 170. Existing WGMap work/build metadata was preserved.

## Mandatory in-game acceptance

Use a staging dedicated server at view distance 8, two updated clients, a current
WGMap index and matching FMUR content. Record distances and latency.

1. Walk/strafe/sprint across 100–150 blocks in both directions repeatedly, with
   client distances 8, 12, 16 and 32. Require one correctly sized, aligned player;
   no duplicate, flash, position jump or model/gear change at terrain/tracker exit.
2. Observe standing/crouching, head/body rotation, held/offhand guns, reloading,
   armour/face/night vision, skins, sleeping, mounting/dismounting and visibility.
   Repeat after respawn, teleport, dimension change, logout/reconnect and ID reuse.
3. Test 128, 256, 511 and 513 blocks with config 512, then change server range and
   disable with 0. Verify the client cannot expand the server interest range.
4. Test broad hills, ridgelines, head-only exposure, slabs, trees, buildings and
   edited/destroyed cover. Unknown/revising data must not reveal a whole player.
   Exposed pixels must appear once complete matching depth is ready.
5. Repeat with ordinary zoom, color PiP and thermal scopes, supported shader states,
   camera movement, FOV changes, resource reload and resolution changes. Verify
   MCHR vehicles remain correctly positioned/masked with players in the same view.
6. Compare close-range hit registration against the existing build, then test
   moving targets at 128/256/512 blocks with a fully loaded server corridor.
   Repeat across a genuinely unloaded corridor to demonstrate C2 before changing
   bullet behavior. LOD range must not override ammunition range/drop/lifetime.
7. Repeat with 20 players/aircraft, recording MSPT/TPS, bandwidth, resident chunks,
   frame times, GPU resources, cache warm-up and worst transition/cover latency.

## C2: proposed combat follow-up requiring approval

Automatic approval review rejected applying a chunk-loading bullet change because
dynamic loads/unloads during firing could affect server performance and gameplay.
The rejected code was not applied. No alternative bypass has been attempted.

The concrete proposal for review is limited to server-owned, player-fired,
nonexplosive FMUR small-arms. It would keep the existing flight, player rewind,
actual block collision, penetration, damage and WGCore permission path. While a
bullet crosses an otherwise unloaded gap, admit only already-generated chunks
along its bounded next swept segment. Proposed ceilings: 32 newly admitted chunks
globally per server tick, 64 chunk coordinates in any segment, and 256 retained
borrowed chunks per dimension. Stop safely on missing/unsupported data or exhausted
budget. Never generate terrain, increase player view distance or create persistent
force-load tickets. Queue borrowed chunks for normal unload after five unused ticks,
preserving player-owned terrain and spawn rules. Leave rockets, explosives and
other projectile systems unchanged.

These limits bound work, but disk/chunk activation can still spike ticks and a
budget refusal can stop a shot. Approval would authorize implementation/testing,
not establish that these limits already meet the zero-error combat requirement.
