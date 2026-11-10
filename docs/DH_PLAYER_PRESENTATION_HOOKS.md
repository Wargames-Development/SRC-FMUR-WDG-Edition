# Optional DH player presentation ownership

Branch: feature/dh-lods. These hooks preserve the legacy implementation and add no DH dependency.

`ExternalPlayerPresentation` API version 1 permits a compatible provider to claim server viewer delivery and client distant drawing separately. Without registration both claims return false. Registered-provider failure withholds the legacy path and logs the fault, avoiding an accidental visibility-policy bypass. Providers can explicitly unregister to restore legacy behaviour.

A scoped, thread-local visual `PlayerData` lookup allows a detached actor to use the normal FMUR renderer without overwriting the tracked player's username-keyed state. Nested scopes restore their parent; out-of-order or cross-thread cleanup is rejected. The scoped lookup only applies on Side.CLIENT and for the matching username. No gameplay, inventory, hitbox or simulation state is moved into this API.

Legacy player snapshots and models remain in the repository. Once a provider claims ownership, the old server skips only that viewer's player LOD packets, and the old client clears its distant contacts and stops cancellation/drawing. Nearby native rendering continues. An explicit visual scope also prevents the legacy renderer from cancelling the provider's detached model.

Review: B1 (username-keyed presentation aliasing) addressed by isolated scopes; B2 (duplicate/cancelled distant rendering during takeover) addressed by explicit ownership gates. Dedicated-server review found no new client Minecraft or OpenGL links in common/server code. No existing packet, config or persistent format changed. T1: real DH registration, render takeover and scope/thermal runtime acceptance remain pending.

Validation: Java 8 compileJava passed; externalPlayerPresentationChecks passed 14 checks; existing playerLodChecks passed 10,110 assertions; playerLodServerChecks passed its side-boundary, visibility and split-Guava profile checks. Commands used the existing opt-in tools/player_lod_checks.gradle script. No production packaging task or build-number change was requested.
