# Optional default optics

`DefaultScope <attachment ShortName>` supplies a built-in optic while a gun's
scope slot is empty. A compatible fitted optic takes precedence. Removing it
restores the default. This uses the existing attachment model, paintjob, PiP,
magnification and attachment-stat paths.

Configured rifles:

- C7A2 (`c7a2`): `DefaultScope c79`.
- Dragunov SVD (`sketchDragunovSVD`): `DefaultScope pso1`; its sights slot now
  accepts the compatible BFMC optics in its explicit sights allow-list. Its
  general attachment permission stays disabled, and other attachment types
  remain rejected. Attachment-specific gun restrictions still apply.

The default is virtual: it is not written into the gun's scope-slot NBT and
cannot be taken out of the gunsmith as a free attachment item. A real fitted
scope retains its metadata and survives the ordinary item save/load path.
Empty existing stacks acquire their configured default immediately; existing
fitted scopes take precedence, including saved Dragunov scopes previously
hidden by `FixedScope`. No item IDs, NBT keys or packet formats change.

`FixedScope` keeps its existing mandatory-override behavior for other content.
Guns without either setting keep their existing behavior. A missing, non-sight
or incompatible default definition safely falls back to the gun's own sights.
The getter resolves the attachment after pack loading rather than requiring
attachment registration order while parsing the gun definition.

The active mod classes and matching external gun definitions must be installed
together. The C7A2 exporter copies its durable definition; the normal Sketchfab
installer copies the durable Dragunov definition. No mesh/texture changes or
world migration are required.

## Regression checks

```powershell
.\gradlew.bat compileJava --offline
& 'C:/Program Files/Blender Foundation/Blender 5.2/5.2/python/bin/python.exe' tools/default_scopes/setup_live.py
.\gradlew.bat -I tools/default_scopes/live.gradle runClient --offline
```

This uses the existing disposable fixture at `build/m240-check/instance` and
creates a `Default Scope Check` creative world. It tests actual registered
definitions, active scope/render-stack consistency, gunsmith insertion/removal,
absence of a removable default item, preservation of fitted-scope metadata,
item serialization, missing/non-sight defaults, unconfigured legacy behavior
and retained `FixedScope` precedence. It captures both rifles with their
default, an ACOG replacement, and the default restored after removal.

Manual test: restart Minecraft; inspect each rifle with an empty sights slot,
fit a compatible optic in the gunsmith, aim, remove it, and aim again. Confirm
the expected default returns and no default item appears in the table's scope
slot. Repeat after saving/rejoining on a dedicated server. The scripted fixture
does not establish normal-input combat or multiplayer behavior.

## Verified result

Java compilation and the isolated Forge regression run passed for both rifles.
The final run used the development pack's current C79, PSO and ACOG definitions.
The Dragunov also rejected a grip through the actual gunsmith slot check.
Default/alternate/restored ADS and hip views were captured for both rifles.
Evidence and source hashes are in `development_assets/default_scopes/validation/`.
The C7A2 asset verification passed as well; its C79 source now uses the existing
magnification installer's numeric formatting (`1` rather than `1.0`) so hashes
agree without changing its zoom values. Build number stayed X206; launch
prerequisites refreshed the local validation JAR.

Review verdict: acceptable. The explicit Dragunov sights allow-list avoids
opening its general attachment permission. Normal-input gameplay and a separate
dedicated-server run remain manual checks.
