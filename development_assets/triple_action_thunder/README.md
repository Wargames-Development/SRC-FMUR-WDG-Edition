# Triple Action Thunder — BFMC refit

The active remodel retains Ri-Ri's recognizable Thunder construction: the long
barrel and ported brake, nitrogen recoil cylinder, rear breech hardware, open
trigger guard and wooden grip panels. The archived donor and its original atlas
remain in `game_ready/`; see `ATTRIBUTION.txt` for Ri-Ri's CC BY 4.0 credit.

## Art and fit

`remodel/` contains the runtime OBJ, diffuse PNG, editable Blender scene with a
packed atlas, profile and three-quarter renders, attribution and measured bounds.
`tools/build_triple_action_thunder.py` is the repeatable authoring/export source.
It requires Blender 5.2 and the development BFMC pack for VSS palette sampling.

The donor is stretched 1.31 along the bore, 1.10 vertically and 1.05 across its
width, then translated by (1, 4.6, 0) pack units. Runtime model scales remain 1.0.
The full assembly measures **13.601 × 4.561 × 1.491** pack units (length, height,
width), including the brake, recoil cylinder, grip and new irons. The previous
model measured 10.383 × 4.041 × 1.420. For comparison the loaded BFMC DEAGLE 44
measures 8.168 × 4.703 × 1.386; the M82A3 measures 35.305 units in length.

Steel retains the donor UV detail with subdued stainless and charcoal tones.
Walnut is sampled from occupied VSS pixels (median RGB 78/35/19); compressed
grain replaces the donor's strong orange bands. The original 2048 × 1024 UV
layout is retained. New steel and sight-paint swatches occupy the unused top-right
48 × 24 pixels. The donor's mirrored receiver marking is corrected within its
existing atlas island. Native UVs use top-origin V; the OBJ export compensates the
loader's V flip and asymmetric normal-axis conversion. Exact duplicate and
degenerate triangles are removed. Culling now stays enabled.

The complete donor sight shells are replaced by a centered rear notch and front
blade. Their aiming landmarks are (-2.943, 6.60, 0) and (6.627, 6.60, 0) in
effective pack units. Two small rear marks and a larger front mark face the eye.
The Java model applies a measured bare-ADS correction, refits both grip poses,
preserves the firing hand during reload, sets the muzzle at (9.0287, 5.7, 0),
and prevents third-person mirroring of the donor's asymmetric breech hardware.

## Regenerate and install

From the repository root:

```powershell
& 'C:\Program Files\Blender Foundation\Blender 5.2\blender.exe' -b --factory-startup --python-exit-code 1 --python tools/build_triple_action_thunder.py -- --install
.\gradlew.bat compileJava
```

The exporter installs only this gun's OBJ and skin into `eclipse/Flan/BFMCpack`
and `eclipse/Flan/BFMC Gun Pack`, and refreshes the durable definition skin.
The bulk `tools/install_sketchfab_guns.py` installer also selects the remodeled
OBJ and atlas. The Java model must be compiled for a development launch or
packaged in the mod JAR for a separate installed client. Restart the client to
avoid cached OBJ geometry. The inventory sprite stays under its existing key.

## Compatibility and test checklist

The existing `tripleActionThunder` / `tripleAction50BMG` identities, definition,
single-round capacity, damage, recoil, reload timing, sounds and icon remain
unchanged. No protocol, persistent-data or dedicated-server changes are needed.
The existing pistol reload remains: the donor has no authored scissor-breech
animation or visible cartridge. A mechanism-specific reload is deferred; this
refit does not represent the magazine gesture as an accurate Thunder reload.

In a fresh development client:

1. Equip Triple Action Thunder. Check both palms around the grip, the trigger
   reach, material contrast and connected barrel/cylinder surfaces at hip fire.
2. Aim while stationary. Confirm the front blade is centered in the rear notch,
   all three white marks are visible, and the rear housing clears the sight ray.
   Check the ADS blend, normal sway and recoil for clipping.
3. Reload empty and tactical stacks. Confirm the firing hand stays on the grip
   and the existing reload completes without altering the single-shot behavior.
4. Check held third-person and dropped views from both sides for missing faces,
   hardware orientation and texture binding. Compare scale with the Deagle.
5. Fire once, confirm another shot requires reload, and reload an existing saved
   stack. Gameplay firing, damage and network behavior require normal input;
   presentation probes are not substitutes for these checks.
