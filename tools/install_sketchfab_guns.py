"""Install the converted guns into the existing BFMC Gun Pack development runtime."""

from argparse import ArgumentParser
from pathlib import Path
import shutil

from install_explosive_ammo import install_explosive_ammo


ROOT = Path(__file__).resolve().parents[1]
SOURCE = ROOT / "development_assets" / "sketchfab_guns"
PACK = ROOT / "eclipse" / "Flan" / "BFMC Gun Pack"
MODELS = ROOT / "eclipse" / "Flan" / "BFMCpack"


def copy(source, destination):
    destination.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(str(source), str(destination))


def append_language(source, destination, replace_keys=()):
    current = destination.read_text(encoding="utf-8", errors="replace")
    additions = source.read_text(encoding="utf-8")
    for line in additions.splitlines():
        key = line.split("=", 1)[0]
        prefix = key + "="
        existing_lines = current.splitlines(keepends=True)
        if not any(existing.startswith(prefix) for existing in existing_lines):
            current += ("" if current.endswith("\n") else "\n") + line + "\n"
        elif key in replace_keys:
            current = "".join(line + "\n" if existing.startswith(prefix) else existing
                              for existing in existing_lines)
    destination.write_text(current, encoding="utf-8")


def install_dragunov():
    definition = PACK / "guns" / "DragunovSVD.txt"
    if not definition.is_file() or "ShortName sketchDragunovSVD" not in definition.read_text().splitlines():
        raise RuntimeError("The existing BFMC Dragunov definition is missing")
    custom = ROOT / "development_assets" / "dragunov_custom"
    copy(custom / "DragunovSVD.png", PACK / "assets" / "flansmod" / "skins" / "DragunovSVD.png")
    copy(custom / "DragunovSVD_icon.png", PACK / "assets" / "flansmod" / "textures" / "items" / "DragunovSVD.png")
    copy(custom / "ATTRIBUTION.txt", PACK / "licenses" / "Sketchfab" / "DragunovSVD.txt")


def install():
    if not PACK.is_dir() or not MODELS.is_dir():
        raise RuntimeError("The existing BFMC Gun Pack runtime is missing")
    ssrs = ROOT / "development_assets" / "barrett_ssrs"
    for source in (SOURCE / "definitions" / "guns").glob("*.txt"):
        copy(source, PACK / "guns" / source.name)
    for source in (SOURCE / "definitions" / "bullets").glob("*.txt"):
        copy(source, PACK / "bullets" / source.name)
    for source in (SOURCE / "definitions" / "grenades").glob("*.txt"):
        copy(source, PACK / "grenades" / source.name)
    language = PACK / "assets" / "flansmod" / "lang" / "en_US.lang"
    append_language(SOURCE / "definitions" / "lang" / "en_US.lang", language,
                    replace_keys=("item.sketch30mmGrenade.name",))
    for folder in (SOURCE / "game_ready").iterdir():
        if not folder.is_dir() or folder.name == "DragunovSVD":
            continue
        name = folder.name
        model_source = ssrs if name == "BarrettSSRS" else folder
        icon_source, license_source = model_source, folder / "license.txt"
        if name == "M240":
            model_source = ROOT / "development_assets" / "m240"
            license_source = model_source / "ATTRIBUTION.txt"
            copy(model_source / "M240_muzzle.obj", MODELS / "M240_muzzle.obj")
        if name == "AK308":
            model_source = ROOT / "development_assets" / "ak308"
            license_source = model_source / "ATTRIBUTION.txt"
            copy(model_source / "AK308_reload.json", MODELS / "animations/AK308.json")
            for suffix in ("_brake", "_bolt", "_rear", "_stock"):
                asset = name + suffix + ".obj"
                copy(model_source / asset, MODELS / asset)
        copy(model_source / (name + ".obj"), MODELS / (name + ".obj"))
        magazine = model_source / (name + "_magazine.obj")
        if magazine.is_file():
            copy(magazine, MODELS / magazine.name)
        copy(model_source / (name + ".png"), PACK / "assets" / "flansmod" / "skins" / (name + ".png"))
        copy(icon_source / (name + "Icon.png"), PACK / "assets" / "flansmod" / "textures" / "items" / (name + ".png"))
        copy(license_source, PACK / "licenses" / "Sketchfab" / (name + ".txt"))
    install_dragunov()
    custom = ROOT / "development_assets" / "vhs2_custom"
    copy(custom / "VHS2_Custom.png", PACK / "assets" / "flansmod" / "skins" / "VHS2_Custom.png")
    copy(custom / "VHS2_Custom_Icon.png", PACK / "assets" / "flansmod" / "textures" / "items" / "VHS2_Custom.png")
    copy(custom / "ATTRIBUTION.txt", PACK / "licenses" / "Sketchfab" / "VHS2_Custom.txt")
    for variant in ("Grenade", "CloseCombat", "Smoke", "AP", "Airburst"):
        icon = f"Sketch30mm{variant}.png"
        copy(ssrs / icon, PACK / "assets" / "flansmod" / "textures" / "items" / icon)

    thunder = ROOT / "development_assets" / "triple_action_thunder" / "definitions"
    thunder_model = thunder.parent / "remodel"
    copy(thunder_model / "TripleActionThunder.obj", MODELS / "TripleActionThunder.obj")
    copy(thunder / "guns" / "TripleActionThunder.txt", PACK / "guns" / "TripleActionThunder.txt")
    copy(thunder / "bullets" / "TripleAction50BMG.txt", PACK / "bullets" / "TripleAction50BMG.txt")
    copy(thunder_model / "TripleActionThunder.png",
         PACK / "assets" / "flansmod" / "skins" / "TripleActionThunder.png")
    copy(thunder / "assets" / "flansmod" / "textures" / "items" / "TripleActionThunder.png",
         PACK / "assets" / "flansmod" / "textures" / "items" / "TripleActionThunder.png")
    copy(thunder / "ATTRIBUTION.txt", PACK / "licenses" / "Sketchfab" / "TripleActionThunder.txt")
    append_language(thunder / "assets" / "flansmod" / "lang" / "en_US.lang", language)
    install_explosive_ammo(PACK)

    redundant_pack = ROOT / "eclipse" / "Flan" / "Triple Action Thunder"
    if redundant_pack.exists():
        expected = (ROOT.resolve() / "eclipse" / "Flan" / "Triple Action Thunder")
        if redundant_pack.resolve() != expected:
            raise RuntimeError("Unexpected redundant pack path")
        known = {
            "ATTRIBUTION.txt", "pack.mcmeta", "assets/flansmod/lang/en_US.lang",
            "assets/flansmod/skins/TripleActionThunder.png",
            "assets/flansmod/textures/items/TripleActionThunder.png",
            "bullets/TripleAction50BMG.txt", "guns/TripleActionThunder.txt",
        }
        actual = {p.relative_to(redundant_pack).as_posix()
                  for p in redundant_pack.rglob("*") if p.is_file()}
        if actual != known:
            raise RuntimeError("Separate Triple Action Thunder pack has unexpected files")
        shutil.rmtree(str(redundant_pack))


if __name__ == "__main__":
    parser = ArgumentParser(description=__doc__)
    parser.add_argument("--dragunov-only", action="store_true", help="refresh the remodeled Dragunov's art")
    if parser.parse_args().dragunov_only:
        install_dragunov()
        print("Installed the remodeled Dragunov atlas, icon, and attribution into BFMC Gun Pack")
    else:
        install()
        print("Installed seven guns and their ammunition into BFMC Gun Pack")
