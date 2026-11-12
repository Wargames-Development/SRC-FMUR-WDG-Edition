# C7A2 and C79

Adds `c7a2` and the separate `c79` sights attachment to the BFMC development
pack. The C79 uses the existing picture-in-picture renderer, explicit 3.4x
optical magnification, and a transparent black post-and-bars reticle
drawn from the user's reference. It is now the built-in default with an empty
sights slot. A fitted compatible optic replaces it; removal restores C79.
The default is virtual and cannot be extracted as an item from the gunsmith.

The round rifle-length ribbed handguard, exposed barrel, bottom/side rails and
C79 housing/mount are authored for this conversion. The olive stock now reuses
the actual BFMC M4A1 sliding stock, retaining its dark buttpad and release hardware.
The receiver, controls, charging/bolt group and STANAG magazine come from the
Java-loaded BFMC M16A4. Its firing grip geometry is retained and recolored
olive. This is a donor conversion, not a scratch build of the entire weapon.
The iron sights now reuse the pack M4A1's carry-handle rear aperture and front
sight assembly, with the front assembly moved 2 effective units forward for
the longer rifle fore-end. Fitting an optic hides the carry handle through the
existing default-scope group. The front sight remains fitted.

`DefaultScope c79` uses the existing optic attachment path; it does not require
a separate C79 item. See `docs/DEFAULT_SCOPES.md` and the dedicated default-scope
probe for current swap/restore behavior. The older bare-sight captures below
document the earlier configuration without a default optic.

The bottom grip and side gadget/laser slots are enabled, along with muzzle
attachments and other sights. Standard attachment compatibility checks still
apply. The stock, slide, pump, accessory and generic slots stay disabled.
The factory flash hider is a separate default-barrel assembly, hidden when a
muzzle attachment is installed; the mount sits at its root, X 19.4.

The rifle supports full-auto and semi-auto, uses the existing five M16A4
5.56x45 magazine definitions, and borrows its sounds, reload timing and GLTF
reload. Balance starts from the pack M16A4 with 750 RPM full-auto in place of
its three-round burst. These are game tuning choices. Existing guns, ammo,
registrations, packets and save formats are not changed.

## Sources and provenance

- `references/` preserves the user's rifle, optic and reticle images as
  reference material. Their authorship/license was not supplied. They are not
  projected onto the model or installed as textures.
- `original/M16A4.mesh` records the actual Java-loaded geometry, part indices,
  effective 1.15 scale, and UVs; `original/M16A4.png` is the archived pack atlas.
  Donor source: `ModelM16A4.java` and BFMC `US_AR_M16A4.txt`. The pack credits
  TV90/BFMC; the model class has no separate author/license notice. Preserve
  this provenance; no new license is asserted for inherited assets.
- `model/donor_selection.json` records the exact retained part groups. Body
  selection retains gun parts bounded between X -3 and 5.1; magazine and slide
  groups are retained independently. Degenerate donor triangles are discarded.
- `original/M4A1.mesh` and `original/M4A1.png` archive the Java-loaded M4A1
  sight/stock donor and atlas. `model/m4_sight_selection.json` records the retained
  parts: the complete rear/carry-handle group and front parts 147-157, 167-186.
  The isolated forward bayonet-lug cap 166 is omitted. These are existing BFMC
  assets with the same unspecified individual authorship/license as the M16.
- `model/m4_stock_selection.json` records all 31 M4A1 `defaultStockModel` parts.
  The stock retains donor dimensions and moves +0.135 effective Y units to
  center it on the existing C7A2 receiver extension. Its furniture uses a separate
  olive regrade of the original UV detail; buttpad and release hardware retain
  the original dark material. The earlier procedural stock has been removed.
- `tools/build_c7a2.py` is the editable procedural source. `model/C7A2.blend`
  contains separate assemblies and a packed diffuse atlas. Native OBJ parts,
  PNGs, geometry measurements and five studio views are retained alongside it.
- The 1024x256 atlas has four 256-pixel columns: M16 donor, authored material
  tiles, original M4A1 donor and olive-regraded M4A1 stock. The first three
  columns retain their original pixels. UVs account for the expanded atlas width.
  Source V coordinates are compensated for the legacy loader, as are normals.
  Java reverses the loader's X rotation using the established OBJ convention.
- The reference sheet and v10 modeling prompt supplied in this chat guided the
  pack finish, scale, fit and validation approach.

The C79's 3.4x specification is corroborated by
[Raytheon ELCAN](https://raytheon.mediaroom.com/2025-02-24-NSPA-awards-RTX-additional-contract-for-optical-day-sights).
The [Canadian Army](https://www.canada.ca/en/army/services/equipment/weapons.html)
identifies the C7A2's single and automatic fire modes.

## Build and install

Run from the repository root, with Blender 5.2 installed:

```powershell
& 'C:/Program Files/Blender Foundation/Blender 5.2/blender.exe' -b --factory-startup --python-exit-code 1 --python tools/build_c7a2.py -- --install
.\gradlew.bat compileJava --offline
.\gradlew.bat -I tools/c7a2_geometry.gradle checkC7A2Geometry --offline
& 'C:/Program Files/Blender Foundation/Blender 5.2/5.2/python/bin/python.exe' tools/c7a2/verify.py
```

The installer copies all six native OBJ parts into `eclipse/Flan/BFMCpack/`,
the rifle/optic definitions into `eclipse/Flan/BFMC Gun Pack/`, and installs the
diffuse atlas, two inventory sprites and C79 reticle. The reticle belongs in
`assets/flansmod/gui/PIP/C79.png`, as required by `getScope`, rather than in
the inventory texture tree. This addition has its own installer and does not
change the bulk Sketchfab installer.

`ModelC7A2.java` and `ModelC79.java` supply the client model bindings. The
ordinary held third-person renderer uses the new rifle model too; a secondary
`3rdModel` binding is unnecessary. Fully restart Minecraft after changing models
or textures to clear the legacy loader's cache. Java classes and external pack
assets must be deployed together.

## Fit and optical coordinates

The rifle is authored in effective pack pixels at definition scale 1.15. It is
29.29 units long from buttpad to muzzle. Bounds include the fitted magazine;
the separate optic increases height. See `model/geometry.json` for group bounds.
The optic is authored directly in attachment-model pixels at scale 1.0.

The optic mount sits at (1.5, 6.47, 0) effective rifle units. Its local rear
rim is X -2.10, optical center Y 1.65 and clear radius 0.52. The PiP disc is
X -2.111 with radius 0.51, immediately behind that rim and inside the opening.
The existing attachment PiP alignment chooses depth and screen centering;
peripheral FOV stays at 1x. The reticle's post tip is centered on the texture.

The M4A1 rear aperture center is (-0.115, 7.4175, 0) and the front blade tip
is (15.5125, 7.475, 0), in effective rifle units. Their stationary
full-ADS camera alignment is calibrated with the actual first-person matrices,
through the existing bare-sight-only offset/pitch/yaw fields. Scoped alignment
is handled independently by the existing PiP path. The M16-family first-person
arm poses and reload are retained. The first-person idle casing is seated inside
the receiver using the actual scale-before-translation casing path.

## Validation and manual checks

See [VALIDATION.md](VALIDATION.md) for results, review findings and remaining
manual tests. The isolated live probe is reproducible with:

```powershell
& 'C:/Program Files/Blender Foundation/Blender 5.2/5.2/python/bin/python.exe' tools/c7a2/setup_live.py
.\gradlew.bat -I tools/c7a2/live.gradle runClient --offline
```

This uses the existing validation instance at `build/m240-check/instance`,
creates a dedicated `C7A2 Presentation` creative world, captures seven views and
exits. It generates instrumented copies of CURRENT classes under `build/`;
production renderer files are not edited. It is a presentation probe, not a
normal-input firing/reload or multiplayer acceptance test.
