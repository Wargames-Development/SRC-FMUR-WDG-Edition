# VHS-2 native FMUR adaptation, revision 7

This replaces the first blockout with an adaptation of the supplied
`hs_produkt_vhs-2_rifle.zip`. Its geometry is reduced from 19,973 source triangles
to 9,567 triangles in 90 TMT parts, including the fitted HK416 sights. The source's real receiver, grip, trigger
guard, curved magazine, stock, handguard and carry handle silhouettes are
retained. The tan diffuse texture preserves the source's markings and wear.
This is derived geometry, not a claim of original authorship; retain
`ATTRIBUTION.txt` when distributing it.

Source: [HS Produkt VHS-2 Rifle by TacticalGlaceon](https://sketchfab.com/3d-models/hs-produkt-vhs-2-rifle-ac28660865054dc19fbd77d3c5a1941f),
CC BY 4.0. The earlier user-provided [VHS-2 visual reference](https://sketchfab.com/3d-models/vhs-2-9ba44fbce52646d89fc8025cd6988674)
was not downloaded or included.

## Scale and construction

The attached M4A1 Java file matches the repository's M4A1 source byte for byte.
Measurements below come from instantiating the actual Java/TMT model classes,
including their constructor flips and translations.

| Model | Model length | Content definition scale |
| --- | ---: | ---: |
| M4A1 | 23.4 | 1.15 |
| FAMAS | 22.8 | 1.0 |
| VHS-2 | 22.8 | 1.0 |

The VHS-2's posed native bounds are X -8.3 to 14.5, Y -1.610 to 7.521, Z -1.194 to
1.194. The barrel center is Y 4.5. A single 2048x2048 atlas serves all rifle
parts. The reference UV layout occupies a 1984x1984 inset; a narrow border
supplies the pack's HK416 sight texture strip and white sight markings. No normal map, material
switching, or PBR shader is required.

`ModelVHS2` extends `ModelGun` and builds native `PositionTextureVertex`
polygons using the same established binary-to-TMT approach as the pack's M4A1
energy variant. The OBJ loader's axis and normal transforms are bypassed.
Native groups are body, removable magazine, charging handle, default muzzle,
and default iron sights. An optic hides the irons; a barrel attachment hides
the original flash hider. The carry handle and attachment rails remain.

Revision 3 fits the pack's actual HK416 sight assemblies to the carry rail.
Both rear white marks and the centered front mark share native Y 7.45, with
the same white marking dimensions as the M4A1/FAMAS. The rear marks are kept
square and clear of the tilted HK plate. `VHS2_iron_sight_alignment.png` shows
the view straight down that line. All geometry and attachment/flash/casing
points move forward 1.5 model units relative to the existing hand poses.

Revision 4 narrows both HK assemblies and their white markings to 45% of the
HK416 width: 0.54 model units, matching the VHS-2's 0.5403-unit Picatinny rail.
The Y 7.45 sight line, fore/aft placement, and forward hand offset are retained.
`VHS2_rail_fit.png` shows the resulting rear sight footprint on the rail.

Revision 5 restores the HK sights and white markings to their full width.
The receiver, stock, grip and magazine are widened by 35%, putting the rifle's
overall body width at 2.389 units, compared with the FAMAS's 2.4. The top and
bottom rails are independently widened to 1.2 units; the side rails use the
same 1.2-unit mounting profile. The barrel retains its circular cross section.
Side attachment and casing positions follow the wider body. Sight height,
longitudinal dimensions, and the forward hand offset are retained.

Revision 6 lowers both iron sight assemblies by 0.12 model units without
changing their shape or shared alignment. The white sight line is now Y 7.33.
The rear assembly moves 0.5 units forward, leaving about 0.6 units of rail
behind its base. Optic mounts and the rifle's hand position are unchanged.

Revision 7 compensates the muzzle flash anchor for RenderGun's scale-before-
translation order. With flashScale 0.4, the final rendered anchor now matches
the posed muzzle tip at (14.5, 4.5, 0) model units. Flash size is unchanged.
The geometry check verifies the effective scaled anchor against the mesh tip.

## Editable assets and generation

`VHS2_Custom.blend` contains the reduced parts, attachment anchor empties, the
hidden unreduced source, and hidden M4A1/FAMAS comparison meshes. The texture is
packed into the Blender file. The OBJ/MTL files are optional editable exports
in Blender's Z-up coordinates; FMUR does not load them.

Run `python tools/build_vhs2_custom.py` with numpy and Pillow available and
Blender 5.2 at its configured Windows path. Run the geometry check first if
`build/vhs2-check/HK416.mesh` is missing; it supplies the indexed HK sight
parts. The build reads the supplied ZIP in
Downloads, writes `src/main/resources/assets/flansmod/models/vhs2_custom.bin`,
regenerates the editable assets, and copies the texture, icon, attribution and
existing VHS2 definition into the BFMC Gun Pack development runtime.

Run `gradlew.bat -I tools/vhs2_geometry.gradle checkVHS2Geometry` to compile and
load the four real model classes. It checks finite positions and UVs, triangle
area, the VHS-2 length and triangle budget, and all moving/replaceable groups.
It verifies the iron sights fit the rail width, the three white markings share one height, and the muzzle
mount follows the forward hand offset.
It also exports the actual HOLO, vertical grip and 5MW laser meshes at their
configured scales and VHS-2 attachment points. Regenerating the Blender scene
after this check produces `VHS2_attachments.png` from those Java-loaded faces.

## Review and testing

- Native Java geometry check and compile passed; final mesh has no degenerate
  triangles and stays within one UV atlas.
- Inspected both sides, a three-quarter view, the M4A1/FAMAS scale comparison,
  and the actual pack optic, grip and laser fitted to the native mesh.
- Registry name `sketchVHS2`, ammunition, damage and network/save formats are
  preserved. Both existing first/third-person definitions use scale 1.0.
- In-game follow-up: equip VHS-2; check idle, ADS, firing, rear-magazine reload,
  third-person hands, optic/iron replacement, and flash-hider replacement with
  KX3/silencer. First-person arm contact and ADS camera alignment still need a
  live game check; offline geometry rendering cannot verify those behaviors.
