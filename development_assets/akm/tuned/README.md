# BFMC AKM on the AK74M pattern

The receiver, bolt, grip, handguard shell, barrel and irons come from the
pack's AK74M. The AKM uses a rail-free dust cover, laminate handguards,
a Bakelite grip, and a separate slant brake. Its fixed wood stock and
curved 7.62 magazine are adapted from TastyTony's original AKM.
See [the source attribution](../game_ready/ATTRIBUTION.txt).

These measurements use the configured first-person scales, with stocks,
magazines and irons fitted. Width includes the charging handle.

| Rifle | Length | Height | Width |
| --- | ---: | ---: | ---: |
| Original AKM | 30.67 | 8.76 | 2.16 |
| AK74M-based AKM | 28.44 | 9.84 | 2.46 |
| AK74M | 28.44 | 9.78 | 2.52 |
| AK-12 | 28.44 | 9.12 | 2.22 |
| Type 81M | 31.11 | 9.49 | 2.76 |

The compressed donor mesh captures the Java-loaded BFMC AK74M body and
bolt at scale 1.2, with part indices and original corner UVs. The matching
AK74M atlas supplies the steel detail. Run `tools/tune_akm.py` with Python,
NumPy and OpenImageIO to regenerate the four OBJ parts and atlas.
Pass `--install` to copy the matching files
to the repository's development pack. The installer leaves the original
`AK47Tec.png` inventory icon and gun definition in place.

Restart the development client with the rebuilt mod and pack files. Equip
an existing AKM and check hip fire, all three white marks in iron ADS,
reload, and third-person and dropped views. Fire standard and tracer ammo
to check the charging handle, casing and flash. Fit a barrel attachment
and verify it replaces the default slant brake. Check the optics against
the revised anchor and verify the original icon in the inventory.
