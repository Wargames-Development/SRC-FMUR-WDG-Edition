# BFMC G36 rifle conversion

This asset replaces the pack's original MG36 with a standard G36. The visible
item name is G36 Assault Rifle. The internal `mg36` ShortName and original
pack definition filename keep existing items and references connected.

The gun accepts the pack's regular, tracer, and green tracer 5.56×45 mm
30-round magazines. The curved magazine is a removable animation group. The
bipod and drum are gone, the lower rail sits against the handguard, and the
barrel uses a slimmer profile. The pack's G36E firing and reload sounds are
used. Damage, recoil, rate of fire, reload time and movement values carry over
from the existing definition.

Saved guns can still contain their previously loaded drum. Force-reload with a
30-round magazine in inventory to swap it through the normal reload path. No
inventory or NBT migration is needed.

The finish follows the M4A1, HK416 and FAMAS pack atlases. Charcoal polymer
contrasts with cool silver receiver and handguard panels. Baked reflections
and machining highlights supply the sheen in the diffuse texture. The G36
retains the source receiver, stock, grip and handguard shapes and uses the
original UV islands outside the remapped silver surfaces.
See ATTRIBUTION.txt for the inherited MG36 asset provenance.

## Files and coordinates

- `ModelMG36.java` retains the established model binding and loads the revised
  `src/main/resources/assets/flansmod/models/mg36_custom.bin` into five native groups.
- `ModelGun.java` and `RenderGun.java` allow this gun to retain its handedness
  in third person. The regular render default continues to mirror existing models.
- `tools/build_mg36_custom.py` generates the mesh, clean atlas, icon, previews
  and editable `MG36_Custom.blend` using the inherited source snapshot here.
- `tools/install_mg36_custom.ps1` installs the model definition, atlas, icon,
  credits and existing `mg36` locale key into the development pack. It verifies
  the 30-round ammo list, inherited gameplay directives and installed file hashes.
- `tools/mg36/MG36GeometryCheck.java` checks the loaded TMT geometry and exports
  the representative pack attachments at runtime scale.

Blender X points toward the muzzle and Z points up. Native TMT uses X muzzle,
Y up and Z across, with `(x, y, z)` in Blender mapping to `(x, z, -y)` in TMT.
This rotation keeps faces outward and preserves left/right orientation.
The one-sided `G36 5.56` marking faces outward on the left receiver panel.

The Java-loaded model contains 9,215 triangles. At pack scale, its length is
26.90 units, next to 26.91 for the M4A1, 23.12 for the HK416 base model and
22.80 for the FAMAS. Overall G36 width decreased from 3.78 to 2.98 units.
Bounds are X -9.050 to 17.850, Y -1.380 to 7.323 and Z -1.591 to 1.390.
The new Picatinny sections use angled shoulders with a 1.2-unit clamp width.
The top run has 28 lugs. The sight line is at Y 7.12, the grip mount is at
Y 3.4, and the effective flash origin is (17.85, 4.5, 0). The pack HK416 iron
sights retain their 1.2-unit bases and use the original texture strip. The G36
generator reads their Java-exported faces from `source_hk416_sights.mesh.gz`.
The front and rear witness marks align at the existing G36 sight height.

## Reproduce and verify

```powershell
& 'C:\Program Files\Blender Foundation\Blender 5.2\blender.exe' -b -t 4 --python-exit-code 1 -P tools/build_mg36_custom.py
.\gradlew.bat -I tools/mg36_geometry.gradle checkMG36Geometry
& 'C:\Program Files\Blender Foundation\Blender 5.2\5.2\python\bin\python.exe' tools/mg36/planar_cleanup.py build/mg36-check/MG36.mesh
# Regenerate the fitted previews using the current Java export.
& 'C:\Program Files\Blender Foundation\Blender 5.2\blender.exe' -b -t 4 --python-exit-code 1 -P tools/build_mg36_custom.py
.\gradlew.bat -I tools/mg36_geometry.gradle checkMG36Geometry build
.\tools\install_mg36_custom.ps1
```

The geometry check verifies outward winding, valid UVs, the marking's facing
and UV direction, the rifle profile, rail shoulders and slots, sight line and flash.
The separate overlap check audits the Java-loaded floats. The previews use
backface culling to expose inward faces during visual review. X199 fixed the
coplanar overlaps and X200 corrected the inherited inward-facing body. X201
introduced the G36 conversion, X202 refined the proportions, finish and rails,
and X203 fits the HK416 irons. X204 restores their original finish by mapping
them to the copied HK416 atlas strip. The current package is
`build/libs/FMUR-WDG-Edition-1.8.06_X204.jar`.

Restart the client and equip the existing gun. Inspect the dropped item and
third-person views for readable left-side lettering. Load a pack 30-round mag,
check the reload and hand contact, then test irons, an optic, vertical grip,
laser and muzzle device. Live gameplay remains unverified.
