# Optional DH player presentation ownership

Branch: feature/dh-lods. These hooks preserve the legacy implementation and add no DH dependency.

`ExternalPlayerPresentation` API version 3 permits a compatible provider to claim server viewer delivery and client distant drawing separately. Without registration both claims return false. Registered-provider failure withholds the legacy path and logs the fault, avoiding an accidental visibility-policy bypass. Providers can explicitly unregister to restore legacy behaviour.

A scoped, thread-local visual `PlayerData` lookup allows a detached actor to use the normal FMUR renderer without overwriting the tracked player's username-keyed state. Nested scopes restore their parent; out-of-order or cross-thread cleanup is rejected. The scoped lookup only applies on Side.CLIENT and for the matching username. No gameplay, inventory, hitbox or simulation state is moved into this API.

Legacy player snapshots and models remain in the repository. Once a provider claims ownership, the old server skips only that viewer's player LOD packets, and the old client clears its distant contacts and stops cancellation/drawing. Nearby native rendering continues. An explicit visual scope also prevents the legacy renderer from cancelling the provider's detached model.

Review: B1 (username-keyed presentation aliasing) addressed by isolated scopes; B2 (duplicate/cancelled distant rendering during takeover) addressed by explicit ownership gates. Dedicated-server review found no new client Minecraft or OpenGL links in common/server code. No existing packet, config or persistent format changed. T1: real DH registration, render takeover and scope/thermal runtime acceptance remain pending.

Validation: Java 8 compileJava passed; externalPlayerPresentationChecks passed 2,030 checks; existing playerLodChecks passed 10,110 assertions; playerLodServerChecks passed its side-boundary, visibility and split-Guava profile checks. Commands used the existing opt-in tools/player_lod_checks.gradle script. No production packaging task or build-number change was requested.

API v2 adds `ExternalPlayerPresentationClient.create` for actor-owned presentation data and read-only `captureAppearance` for validated offhand, night and face equipment. A disabled extension scope withholds FMUR gun/armour layers without removing the ordinary player body. Context disposal removes only that detached actor's animation map entries. This API does not yet transfer authoritative shot/reload animation state; primary/auxiliary-view runtime acceptance remains pending.

API v3 adds the 38-byte `PlayerVisualPose` and read-only server `capturePose`. Actual projectile construction records cosmetic per-hand shot ages; active reload state and scoped/minigun state are read without gameplay changes. Client contexts apply interpolated cosmetic fields directly, without invoking doShoot/doReload or local recoil/sound helpers. Reload starts/cancellations wait for the shared actor timeline. A source-state test confirms capture does not increment shot identifiers or change aim. The dedicated-server audit includes the common presentation API, codec and PlayerData capture method. Full content-model and auxiliary-camera acceptance remains pending.
