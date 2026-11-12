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

The existing **Switch Scope Magnification** binding (default **Z**) selects the
two endpoints on variable optics. This retains the existing two-position zoom
system. It does not add continuous adjustment. The M145 display name changes in
the definition and installed language files, while its `m145` ID, filename,
model, textures and existing saved attachments remain compatible.

PiP scopes use `Magnification` / `Magnification2` to enable the renderer's existing
lens-size compensation. Legacy `ZoomLevel` / `FOVZoomLevel` are normalized to 1;
legacy secondary zoom fields are removed. Surrounding vision stays at 1x.
No Java, networking or save-format changes are required. Built-in gun sights
without an advertised optic name are outside this attachment update.

## Verification

Run `python tools/test_scope_magnification.py`. Tests cover all optic entries,
two-position magnification, identity/model preservation, non-UTF-8 descriptions,
language updates, idempotence, and rejection before writes for incomplete or
duplicate definitions.

In game, aim each listed optic at a stationary distant target. Compare its
apparent size inside the lens with the surrounding unzoomed world: a 4x optic
should show roughly four times the target's angular size. Check the TA31 first,
then the other fixed scopes and the thermal scope. Press Z while aiming each
variable optic and check both listed endpoints. Check that 1x sights no longer
add world zoom. Equip a saved gun with an M145: it should retain the attachment,
display Elcan Spectre [1-4x], and switch between 1x and 4x. Repeat with another
player observing to confirm only the aiming player's presentation changes.

Live visual magnification still requires this in-game check; the content tests
do not validate GPU rendering or a running client's installed pack.
