# Dragunov SVD remodel

The supplied left-side photo sets the proportions. The profile follows its
shallow steel receiver, short curved magazine, tapered wood handguard with
six staggered slots, and narrow stock with separate thumbhole and sling
openings. The model includes the sling hardware. The existing PSO-1 uses
the attachment's pack scale of 0.13 and seats on two upright supports.
The furniture atlas uses the VSS's dark red-brown as its color reference,
with subtle stain variation and neutral steel modeled on the Type 81.
See [ATTRIBUTION.txt](ATTRIBUTION.txt) for the original Dragunov reference.

The Java-loaded rifle measures 28.25 long, 4.27 high and 1.59 wide at
`ModelScale 1.35`, with the magazine and irons fitted. The SVD-12 measures
26.64 × 6.96 × 2.22 in the same units at `ModelScale 0.12`. The top row in
[the scale comparison](DragunovSVD_scale.png) is the Dragunov. The installed
weapon uses the fixed PSO-1 shown in [the preview](DragunovSVD_preview.png)
and [mount close-up](DragunovSVD_mount.png).

## Source and installation

- `DragunovSVD.blend` contains the editable model with a packed diffuse atlas.
- `DragunovSVD.png` is the runtime atlas. Its eight 128-pixel tiles occupy the
  bottom half of the 512-pixel image, with 8-pixel padding around the sampled
  region of each tile. The PSO-1 uses its existing separate pack texture.
- `DragunovSVD_icon.png` is the inventory icon rendered with the pack PSO-1.
- `ModelDragunovSVD.java` loads `dragunov_custom.bin` from the mod resources.
  The native mesh has separate body, magazine, bolt and default iron groups.
  The rendered assembly sits four pack units forward to align its grip with
  the firing hand. The hand poses, scope and muzzle anchors account for that
  offset. The full-ADS view compensates for the forward move.
- `RenderGun.java` applies the legacy sight scale only to the remaining
  OBJ-based guns. The PSO-1 and its PiP lens both use the attachment's scale.
- `install_sketchfab_guns.py` installs the new atlas, icon and credit for
  `sketchDragunovSVD`. The original definition still specifies its fixed
  scope, magazines, animation timings, damage and sounds.

From the repository root, regenerate the Blender file, atlas and native
mesh with Blender 5.2.

```powershell
blender -b -t 4 --python-exit-code 1 -P tools/build_dragunov_custom.py
```

To export after editing, apply any new modifiers and keep mesh objects in the
four named collections.

```powershell
blender -b development_assets/dragunov_custom/DragunovSVD.blend -t 4 --python-exit-code 1 -P tools/build_dragunov_custom.py -- --export-only
python tools/install_sketchfab_guns.py --dragunov-only
```

The installer targets `eclipse/Flan/BFMC Gun Pack`. Use a development launch
from the rebuilt workspace or a matching rebuilt mod JAR with those pack files.

## Verification

Offline checks used Java-loaded geometry and the saved runtime atlas. The mesh
has 5,418 outward-facing triangles. The audit found no coplanar overlaps.
The muzzle effect anchor matches the flash hider tip, the rear notch clears
the front blade, and the existing PSO-1 rests on the new side mount.
The Minecraft arm model's transformed palms line up with the firing grip,
the underside of the handguard and the magazine in their respective poses.
Exporting the saved Blender file reproduced the packaged native mesh hash.

After restarting Minecraft, equip an existing Dragunov and view it in first
person, third person and as a dropped item. Confirm hand placement, PSO-1
aiming and PiP alignment. Reload the supported magazines and fire regular and
green-tracer ammo to check bolt travel and the muzzle effect origin. These
live checks are pending.
