"""Render item icons only for the new TaP armor definitions.

Run extractTapArmorGeometry before this script. Icons are saved in the tracked
staging pack and copied into the local Eclipse TaP content pack.
"""

from pathlib import Path
import shutil

from render_tap_armor_icons import read_definition, read_mesh, render_icon


ROOT = Path(__file__).resolve().parents[1]
STAGING = ROOT / "development_assets" / "tap_new_armor"
PACK = ROOT / "eclipse" / "Flan" / "TaP-Escalation"


def main():
    definitions = sorted((STAGING / "armorFiles").glob("*.txt"))
    if not definitions:
        raise RuntimeError("No staged TaP armor definitions")
    for definition in definitions:
        _, values = read_definition(definition)
        layer = "2" if values["Type"].lower() in ("legs", "pants") else "1"
        texture = STAGING / "assets" / "flansmod" / "armor" / (values["ArmourTexture"] + "_" + layer + ".png")
        icon_name = values["Icon"] + ".png"
        staged_icon = STAGING / "assets" / "flansmod" / "textures" / "items" / icon_name
        render_icon(read_mesh(values["Model"]), values["ModelScale"], texture, staged_icon)
        installed_icon = PACK / "assets" / "flansmod" / "textures" / "items" / icon_name
        installed_icon.parent.mkdir(parents=True, exist_ok=True)
        shutil.copyfile(staged_icon, installed_icon)
    print(f"Rendered {len(definitions)} TaP armor item icons")


if __name__ == "__main__":
    main()
