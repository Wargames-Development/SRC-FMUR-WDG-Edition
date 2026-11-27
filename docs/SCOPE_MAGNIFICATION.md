# BFMC optic magnification

Apply the content-only update with `python tools/install_scope_magnification.py`.
Use `--pack "path/to/BFMC Gun Pack"` for another installation. Restart Minecraft
after applying it. The runtime pack under `eclipse` is ignored by Git; this script
preserves the update in source control without duplicating the entire pack.
Reapply after replacing the pack or regenerating its optic definitions.

| Optic | Magnification |
| --- | --- |
| ACOG TA01, ACOG TA31, JGM-4, PSO-1 | 4x |
| C79, PK-A, Prisma | 3.4x |
| CL6X | 6x |
| CNVD-T thermal | 3x |
| PKS-07 | 7x |
| Rifle Scope | 8x |
| CL6X VZ | 6x / 14x |
| PKS-07 VZ | 7x / 14x |
| Rifle Scope VZ | 8x / 14x |
| Colt Optics VMR | 1x / 6x (already explicit) |
| Elcan Spectre (formerly M145) | 1x / 4x |
| Coyote, HOLO, Kobra, OKP-7, PKA-S, QXM-7, Reflex | 1x |

Aim and hold **Switch Scope Magnification** (default **Z**), then scroll up to
increase magnification or down to decrease it. The view eases to the selected
magnification within the optic's configured range. Tap **Z** while aiming the
ELCAN SpecterDR to switch directly between 1× and 4×. The ELCAN uses the existing
`m145` attachment ID.

PiP scopes use `Magnification` / `Magnification2` to enable the renderer's existing
lens-size compensation. Legacy `ZoomLevel` / `FOVZoomLevel` are normalized to 1;
legacy secondary zoom fields are removed. Surrounding vision stays at 1x.
The zoom control uses the loaded magnification range locally, including
built-in variable optics, so existing worlds and content definitions remain compatible.

## Verification

Run `python tools/test_scope_magnification.py`. Tests cover all optic entries,
magnification endpoints, identity/model preservation, non-UTF-8 descriptions,
language updates, idempotence, and rejection before writes for incomplete or
duplicate definitions.

In game, aim each listed optic at a stationary distant target. Compare its
apparent size inside the lens with the surrounding unzoomed world: a 4x optic
should show roughly four times the target's angular size. Check the TA31 first,
then the other fixed scopes and the thermal scope. Hold Z while aiming each
continuous variable optic, scroll to an intermediate setting, then check both
endpoints. On the ELCAN, tap Z to test both positions. Repeat with another player
observing to confirm only the aiming player's presentation changes.

Live visual magnification still requires this in-game check; the content tests
do not validate GPU rendering or a running client's installed pack.

## BFMC ADS fixes

Run `python tools/install_bfmc_optic_fixes.py` with the updated FMUR build.
Use `--pack "path/to/BFMC Gun Pack"` for another installation, then restart the
client. The installer updates the affected definitions. The FMUR build
provides the JGM-4, Prisma, PK-A, PK-AS, Rifle Scope and PSO-1 reticles and CNVD-T skin.

Aim through the SpecterDR, PSO-1, PK-AS or either PKS-07 variant and press
**Toggle Scope Reticle Color** (default **U**) to switch between black and red
with the flashlight/laser click. The ACOGs, Rifle Scopes, holographic sights and
green sights use their authored reticle colors. At full ADS with a PiP scope,
turn, strafe and jump to check that the gun, hands, lens edge and reticle stay
steady on screen. Aim with iron sights or a non-PiP red dot to check their
usual sway. Recoil and reload animations still play.

Aim through the JGM-4, Prisma, PK-A and PK-AS to check the reticle and the fit of
the PiP image inside the housing. PK-AS uses a ring and dot at 1x. Inspect
the CNVD-T from the side for the housing, control and lens-ring finishes, then
aim to check the thermal image. Aim through the Coyote, Reflex, Kobra, HOLO,
QXM-7 and OKP-7 and check that their dots stay within the lens, including with
night vision on.

For the grenade render-distance check, throw an M67 or M83 across open terrain
and follow it past 10 blocks. The grenade model has a minimum culling distance
of 64 blocks.
