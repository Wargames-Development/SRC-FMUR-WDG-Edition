# Attachment surface lighting

The G key toggles installed flashlights and laser pointers together, under
Controls → FMUR Guns → Toggle Flashlight/Laser. The old default T conflicts
with both chat and the underbarrel toggle. On first world entry, an old T
binding is moved to G only when it conflicts with one of those controls.
Other custom light bindings are preserved. The server confirms each toggle
with a local `Flashlight / laser: ON` or `OFF` message.
They default on when the gun has no saved toggle value. Explicit off values
remain off. This applies to existing guns too; no NBT key or packet changes.
The server still owns the existing `FMURFlashlightOn` stack tag and toggle packet.
`IsLaserPointer True` now works without also setting `Flashlight True`.
Flashlights use their definition's range and strength settings, but now render a
soft circular surface projection instead of changing block-light values.

## BFMC pack variants and HUD

Laser dots have a bright core and a compact halo. Brightness no longer enlarges
the spot, and range compensation is capped at 1.5×. The core radius is
0.009–0.0135 blocks; the faint outer halo radius is 0.036–0.054 blocks. The
5MW Laser projects a stronger green dot (`LaserBrightness 4`, versus the new
default of 2). IR Laser is a separate gadget using the
1MW Laser model, texture, icon and stat modifiers. IR Flashlight is a separate
grip using the X400 model, texture, icon and light settings. Only their emitted
effects require night vision; the physical attachment housings remain visible.
Their item IDs are `flansmod:irlaser` and `flansmod:irflashlight`.
They use the original attachment slots and normal gun attachment restrictions.

The pack definitions are saved under
`development_assets/attachment_lighting/content_pack/attachments`. Apply them
to another BFMC pack with:

```powershell
./tools/configure_attachment_lighting.ps1 -PackRoot 'C:/path/to/Flan/BFMC Gun Pack'
```

The script updates the 5MW, X400 and Tri Beam definitions and adds the two IR definitions. The
development pack under `eclipse/Flan/BFMC Gun Pack` has also been updated.
That folder is Git-ignored; the repository overlay preserves these changes.
Deploy the updated mod and pack on both client and server, then restart them.
The IR variants reuse existing models rather than duplicating Java classes.

Legacy beam geometry was removed from the 1MW, 5MW, compact, tri-beam (all
three orientations), X400 and FlashLight models. The generic FlashLight model's
old emitter flash was removed too. The physical attachment housings are kept.

An enabled laser hides vanilla gun crosshairs, hip-fire crosshairs (including
the pass after NVG rendering), and sprint crosshairs. An IR laser also hides
them with NVGs raised. Turning the laser off restores the normal HUD rules.
Scope reticles remain available. The default configurable crosshair opacity
is now 20%, including the existing grenade/vehicle crosshair uses of that value.

Optional attachment definition fields (all old definitions remain valid):

| Field | Default | Meaning |
| --- | --- | --- |
| `LaserColor 1 0 0` | Red | RGB components, each from 0 to 1; green is `0 1 0`. |
| `LaserRange 128` | 128 | Maximum dot/beam distance in blocks, clamped to 1–128. |
| `LaserBrightness 2` | 2 | Laser halo intensity, clamped to 0.5–5; does not enlarge the spot. |
| `LaserBeams 1` | 1 | Use 3 for three parallel rays arranged in a triangle. |
| `LaserSpacing 0.08` | 0.08 | Triangle side length in blocks, clamped to 0.02–0.25. |
| `LaserDotScale 1` | 1 | Dot radius multiplier, clamped to 0.25–1. |
| `FlashlightConeAngle 34` | 34 | Cone half-angle in degrees, clamped to 3–40. |
| `Infrared True` | False | Hide this attachment's flashlight, laser dot and beam unless the viewer has active night vision. |

For an IR laser, use `IsLaserPointer True` and `Infrared True`. For an IR
illuminator, use `Flashlight True` and `Infrared True`. One attachment may have
both features. IR lasers draw a bright full-length beam as well as the dot.
The beam uses two camera-facing ribbons for a bright core and halo, rather
than an OpenGL line whose width may be clamped by the graphics driver.
The IR Laser's shared 1MW model now defines an emitter socket at the lens.
The beam start is captured inside the attachment's full render transform,
including model scale, attachment placement, sway, aiming and reload animation.
First-person beams use that hand projection directly; observer beams resolve
the rendered attachment socket back into the current world view. Models without
a socket retain the older approximate origin. Socket-equipped IR lasers now
use one straight ray from the emitter for both the beam and surface dot.
When ready, the ray converges with the central firing axis at 50 blocks,
leaving a small close-range parallax offset. Sprint/lowered stance, airborne
movement and reload progress blend it toward the model's animated forward
axis; the dot can leave the crosshair while the weapon is lowered. The existing
pose animation drives the transition back to ready alignment. Bullet spread,
gravity, motion inheritance and server shot direction are unchanged.

IR visibility is evaluated for the viewing client, regardless of whether the
shooter is wearing night vision. Fully lowered NVGs and active night-vision
gun scopes and the active vanilla night-vision potion effect qualify. Thermal scopes alone do not qualify. Normal visible lasers
and flashlights remain visible with or without NVGs.

## Rendering and limits

Laser rays now select living mobs and players as well as blocks. Candidate
entities come from a loaded-chunk query around the ray, capped by its first
block hit. Dead/invisible entities and the shooter are excluded. Target bounds
are interpolated to their rendered position. The entity spot is projected
onto visible scene depth within those bounds; it does not float on the
invisible hitbox. Background block dots remain depth-tested so gaps between
limbs can still show the wall behind them. IR beams likewise use actual scene
depth to stop visually at the model surface.

Tri Beam Laser now projects three parallel rays with 0.08-block spacing,
forming an equilateral triangle centered on the original aim axis. Its dots
use `LaserDotScale 0.55`; other attachments retain their current dot sizes.
Its existing item ID, model, slot and stat modifiers are unchanged.

Entity surface projection shares the flashlight depth texture. The copy occurs
once per frame when needed; an active first-person socket IR laser requests it
before the gun draws so subsequent entity spots cannot land on the gun model.
Each entity spot is restricted to the target's projected rectangle, rather than
adding an unrestricted fullscreen pass. No readback or server hit-detection
changes were added. Gameplay frame-time cost has not been measured.

Candidate selection uses collision bounds, so unusually large custom-model
extremities outside those bounds may be missed. If depth shaders are unavailable,
entity dots use a bounds-aligned fallback. Full shader-pack integration remains
unverified as described in the GPU notes below.

Dots remain full-bright, depth-tested projections aligned to block collision
faces. Flashlights now reconstruct the visible surface from scene depth and
apply a circular light in a GLSL 1.20 pass. This avoids the missing triangles
at corners, stairs and changes between block faces. The shader has radial and
distance falloff. It does not
rebuild terrain lighting, change saved light, or affect gameplay light levels.
The flashlight follows surfaces present in scene depth, including rendered
entities; transparent surfaces that do not write depth are excluded. This is
not a volumetric shadow-map renderer. The local first-person beam uses the
view's existing depth for occlusion. Other viewpoints also use the existing
coarse ray grid as a soft visibility mask, so distant thin-cover shadows are
approximate. Shader/depth-copy failures log a warning and use the old mesh
fallback, which can still have gaps on unsupported graphics configurations.
Both X400 flashlight definitions now have a 32-block range. The center stays
bright with inverse-square falloff and fades to zero over the final 20% of
the range; the old linear fade made most of the 10-block beam very dim.
Both regular and IR X400 now use a 34-degree half-angle instead of 18 degrees,
giving roughly twice the radius and four times the footprint at equal distance.

There are at most four flashlight cones per frame, with the local player taking
priority, and at most 16 nearby players considered. Remote players beyond 64
blocks are skipped. Each cone uses a reused 9×9 ray-sample grid, at most 49
block traces. Scene depth is copied once per illuminated frame and shared by
up to four fullscreen cone passes. Textures are reused and resized only when
the viewport changes. Flashlight range is clamped to 1–64 blocks.
These are fixed work limits, not a measured frame-rate guarantee.

## Manual regression checklist

1. Install a laser-only attachment on a gun without a saved toggle. It should
   start on, with no hip-fire/sprint crosshair. Toggle G repeatedly: the dot
   should disappear/appear and the crosshair should return/hide after server
   confirmation. Confirm the normal crosshair opacity starts at 20%. Set
   `LaserColor 0 1 0` and reload the pack: it should be green.
2. Aim at all six block faces, slabs, stairs and distant walls. The dot should
   sit on the hit face, stay visible in darkness, and be hidden behind cover.
   Fire a low-spread gun at a nearby wall while stationary; bullet holes should
   cluster around the dot. Repeat while crouching and in third person.
3. Sweep a flashlight across a dark flat wall and floor. Expect a circular soft
   edge, brighter center, increased footprint with distance, and range falloff.
   Sweep a doorway/corner: nearby cover must stop its sampled rays; no glowing
   sphere of block light should remain after switching off or changing weapons.
4. On a dedicated server with two clients, toggle IR attachments on one player.
   With both viewers' NVGs raised, neither should see the IR effects. Lower
   only one viewer's NVGs: only that viewer should see both players' enabled IR
   effects. Swap viewers, raise NVGs, and test active NV scopes and thermal-only
   scopes. Ordinary visible attachments should remain visible to both viewers.
5. Switch guns, remove attachments, die, reconnect and change dimensions. No
   projection should persist without an equipped, enabled attachment. Verify
   the G state is consistent for observers and late-joining clients.
6. Test with several illuminated players, fast camera turns, fancy/fast graphics,
   PiP scopes and the deployed shader/Angelica configuration. Check frame time,
   corner gaps, and that later particles/HUD rendering retain their normal GL
   state. Scoped secondary-world rendering remains under the existing render
   hook's exclusion and does not receive these projections.
7. Find IR Laser and IR Flashlight in the attachment creative tab. Equip each
   in its original slot. Check that the 5MW dot is green, the regular 1MW dot
   is red, and the IR variants emit only for viewers using NV. Check first-
   and third-person models for stray beams/flares even when G is off.
8. Save a gun with G off, reconnect and re-equip it. It should remain off.
   A gun with unrelated NBT but no `FMURFlashlightOn` tag should still default on.

No Minecraft client/server launch or gameplay performance capture was performed
by the implementation session; these checks require in-game validation.

## Ray-tracing regression

Forge 1.7.10's `World.func_147447_a` mutates its input start vector while
walking through blocks. Every attachment ray now copies its start coordinates
before tracing, preserving the common flashlight origin, distance falloff,
and IR muzzle/target coordinates. Reusing that mutated vector previously
collapsed the flashlight sample grid and displaced IR beams.

Run the headless check against the actual Forge block traversal with:

```powershell
./gradlew.bat compileJava attachmentLightingChecks -I tools/attachment_lighting_checks.gradle --offline
```

It checks all 49 cone samples against one wall, unchanged input vectors,
shooter-to-surface distances, IR obstruction traces and open-sky misses.
In-game, check regular X400 illumination on a flat wall 5–10 blocks away,
then repeat with IR Flashlight and lowered NVGs. Sweep across a doorway and
verify the spot tracks continuously. Toggle G off/on and verify both cone
types disappear/reappear. Confirm the 5MW remains bright with a small dot
at both close and long distances.

## GPU projection regression

Files involved in the emitter/coverage update:

- `AttachmentLightRenderer.java`: world/hand projection and socket capture.
- `FlashlightProjection.java`: depth-based flashlight shader and reusable textures.
- `RenderGun.java`: attachment-pose hooks and nested-render context preservation.
- `ModelAttachment.java`, `BFMCpack/Model1MWLaser.java`: model-space emitter socket.
- `AttachmentType.java`: 34-degree default flashlight half-angle.
- Overlay `GRIP_X400.txt`, `GRIP_IRFlashlight.txt`: wider regular/IR cones; applied to the development pack.
- `attachment_lighting_checks.gradle`, `AttachmentLightingGpuChecks.java`: off-screen GPU regression checks.
- This guide: updated behavior, performance bounds and manual checks.

Run `attachmentLightingGpuChecks` through the same Gradle init script, adding
`-PlwjglNatives=<LWJGL 2 native library directory>`. It creates an off-screen
compatibility-profile GPU context and checks actual shader/depth reconstruction,
uninterrupted lighting across a sharp depth step, circular cutoff, shadow
rejection, texture resize, projected hand-beam start and GL state restoration.

In-game, additionally check that the IR beam leaves the attachment lens while
standing, crouching, aiming and reloading, and from another NV-equipped player's
view. Sweep the wider flashlight over the stepped ground in the supplied
screenshots: there should be no missing interior patches in the shader path.
Test the deployed Angelica/shader configuration; the off-screen test does not
exercise its complete renderer or the live gun-animation pipeline.

For pose-following IR beams, test sprint → stop → ADS, jump/land, fast turns,
and tactical/empty reloads. The beam should remain straight and the dot should
follow the same ray, moving away from center when lowered and returning smoothly.
Check nearby walls for parallax, and a wall near 50 blocks for ready-state
alignment. Repeat from a second NV-equipped player's view. The headless
`attachmentLightingChecks` also tests zeroing, parallax, normalized/smooth pose
blending, invalid blend values and beam/dot collinearity against a real block hit.

For entity/tri-beam projection, test a mob and a second player in front of a
wall, moving across the ray, crouching and behind solid cover. Confirm the
glow follows visible skin/armor instead of an invisible box and does not reveal
invisible players. Check the three small Tri Beam dots on a flat wall and on a
mob, including oblique surfaces and an edge where the rays hit different targets.
Repeat with an IR laser while independently toggling each viewer's NVGs.

Files changed for entity/tri-beam support: `AttachmentLightRenderer.java`
(bounded entity tracing and triangle rays), `FlashlightProjection.java`
(clipped entity surface shading), `AttachmentType.java` (additive definition
fields), overlay `GADGET_TriBeamLaser.txt`, `configure_attachment_lighting.ps1`,
both lighting check classes, and this guide. The development pack is updated;
deploy the same overlay to other installations. CPU checks cover mob/player
selection, cover, interpolation and triangle geometry; GPU checks cover skin
depth projection, foreground rejection and screen-region clipping. Live mob,
armor and shader-pack rendering still needs the manual checks above.

For the visibility/control fixes, also check that G toggles without opening
chat or switching the underbarrel; the local ON/OFF confirmation must arrive
from the server. Existing non-T bindings must remain unchanged. At 5, 10 and
20 blocks, check X400 hotspot visibility and compare 1MW/5MW dot visibility.
Check the IR beam from the shooter's and observer's viewpoints, with lowered
NVGs, NV scopes and a vanilla NV effect, then remove all NV sources and verify
the entire IR effect disappears. Keep a wall between viewer and beam to check
depth occlusion. Previously saved OFF guns still require toggling on once.
