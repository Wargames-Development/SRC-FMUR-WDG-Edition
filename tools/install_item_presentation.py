"""Apply the reviewed names, tooltips and pixel icons to unpacked Flan packs.

Run after other content installers. Registry names, gameplay and model skins
are deliberately left alone. --check verifies an already installed runtime.
"""
import argparse
import json
from pathlib import Path
import re
import shutil

ROOT = Path(__file__).resolve().parents[1]
SOURCE = ROOT / "development_assets/item_presentation"
ITEM_FOLDERS = {"guns", "attachments", "bullets", "ammo", "grenades", "parts",
                "planes", "vehicles", "aaguns", "mechaItems", "mechas", "tools", "armorFiles",
                "boxes", "armorBoxes", "blocks"}


def fields(text):
    return dict(re.findall(r"^(\w+) +([^\r\n]+)", text, re.M))


def read_definition(path):
    raw = path.read_bytes()
    try:
        return raw.decode("utf-8"), "utf-8"
    except UnicodeDecodeError:
        # Older packs include GBK/GB18030 Chinese comments. Keep their encoding
        # when replacing ASCII presentation fields, rather than corrupting them.
        return raw.decode("gb18030"), "gb18030"


def replace(text, key, value):
    pattern = r"^" + key + r" +[^\r\n]*"
    if re.search(pattern, text, re.M):
        return re.sub(pattern, lambda match: key + " " + value, text, flags=re.M)
    return text.rstrip() + "\n" + key + " " + value + "\n"


def attachment_description(values, intro):
    lines = [intro]
    if values.get("AttachmentType") == "sights":
        magnifications = [values[k] for k in ("Magnification", "Magnification2") if k in values]
        if magnifications:
            lines.append("Magnification: " + " / ".join(m + "x" for m in magnifications))
        if "Magnification2" in values:
            lines.append("Use Switch Scope Magnification (default Z)")
    if values.get("Silencer", "false").lower() == "true":
        lines.append("Suppresses gunfire")
    if values.get("DisableMuzzleFlash", values.get("DisableFlash", "false")).lower() == "true":
        lines.append("Hides muzzle flash")
    if values.get("IsDisableCancelAiming", "false").lower() == "true":
        lines.append("Stay aimed while cycling the bolt")
    # Describe multipliers, rather than guessing effects from the old tooltip.
    for key, label in (("SpreadMultiplier", "Shot spread"), ("RecoilMultiplier", "Vertical recoil"),
                       ("RecoilYawMultiplier", "Horizontal recoil"), ("DamageMultiplier", "Damage"),
                       ("BulletSpeedMultiplier", "Bullet speed"), ("ReloadTimeMultiplier", "Reload time"),
                       ("AimingTimeMultiplier", "Aim time"), ("MovementSpeedMultiplier", "Movement speed"),
                       ("RoundsPerMinMultiplier", "Rate of fire"), ("CameraShakeMultiplier", "Camera shake"),
                       ("RunPosTimeMultiplier", "Sprint recovery time"),
                       ("MeleeDamageMultiplier", "Melee damage")):
        multiplier = float(values.get(key, "1"))
        if multiplier != 1:
            lines.append(label + ": {:+g}%".format(round((multiplier - 1) * 100, 2)))
    return "_".join(lines)


def install(pack_root, check=False):
    catalog = json.loads((SOURCE / "catalog.json").read_text(encoding="utf-8"))
    errors, counts = [], {"definitions": 0, "language entries": 0, "pixel icons": 0}
    # Validate definitions and pixel sources before writing, including mixed encodings.
    # This prevents a later unknown pack entry from leaving a partial install.
    inputs = {}
    armor_short_names = set()
    expected = {kind: set() for kind in ("guns", "attachments")}
    for pack in sorted(pack_root.iterdir()):
        if not pack.is_dir():
            continue
        for folder in pack.iterdir():
            if folder.name not in ITEM_FOLDERS or not folder.is_dir():
                continue
            for path in folder.glob("*.txt"):
                inputs[path] = read_definition(path)
                values = fields(inputs[path][0])
                if folder.name == "armorFiles" and "ShortName" in values:
                    armor_short_names.add(values["ShortName"])
                if folder.name in expected and "ShortName" in values:
                    short = values["ShortName"]
                    expected[folder.name].add(short)
                    if short not in catalog[folder.name]:
                        errors.append("Unreviewed item: " + str(path))
    for kind, seen in expected.items():
        if catalog[kind].keys() - seen:
            errors.append("Missing reviewed " + kind + ": " + ", ".join(sorted(catalog[kind].keys() - seen)))
    for short, name in catalog["icons"].items():
        raw = (SOURCE / "icons" / (name + ".png")).read_bytes()
        size = catalog.get("armor_icon_size", 16) if short in armor_short_names else 32
        if raw[:8] != b"\x89PNG\r\n\x1a\n" or (int.from_bytes(raw[16:20], "big"),
                                                  int.from_bytes(raw[20:24], "big")) != (size, size):
            errors.append("Expected {}x{} pixel icon: {}".format(size, size, name))
    for source in (SOURCE / "builtin_icons").glob("*.png"):
        raw = source.read_bytes()
        if raw[:8] != b"\x89PNG\r\n\x1a\n" or (int.from_bytes(raw[16:20], "big"), int.from_bytes(raw[20:24], "big")) != (32, 32):
            errors.append("Expected 32x32 built-in icon: " + source.name)
        destination = ROOT / "src/main/resources/assets/flansmod/textures/items" / source.name
        if check:
            if not destination.is_file() or source.read_bytes() != destination.read_bytes():
                errors.append("Missing or outdated built-in icon: " + source.name)
    if errors:
        raise ValueError("\n".join(errors))
    used_ammo = set()
    for path, (text, _) in inputs.items():
        values = fields(text)
        rules = catalog.get("item_rules", {}).get(values.get("ShortName"), {})
        if rules.get("CreateItem") == "false":
            continue
        if path.parent.name in {"guns", "attachments", "aaguns", "vehicles", "planes", "mechas"}:
            for value in re.findall(r"^(?:Ammo|SecondaryAmmo|AddAmmo) +([^\r\n]+)", text, re.M):
                used_ammo.update(value.split())
    for path, (text, _) in inputs.items():
        short = fields(text).get("ShortName")
        if path.parent.name in {"bullets", "ammo", "grenades"} and short in used_ammo \
                and catalog.get("item_rules", {}).get(short, {}).get("CreateItem") == "false":
            raise ValueError("Disabled ammunition is now referenced by a weapon: " + short)
    if not check:
        for source in (SOURCE / "builtin_icons").glob("*.png"):
            shutil.copyfile(source, ROOT / "src/main/resources/assets/flansmod/textures/items" / source.name)
    seen_guns, seen_attachments = set(), set()
    for pack in sorted(pack_root.iterdir()):
        if not pack.is_dir():
            continue
        entries, gun_keys = {}, set()
        for folder in sorted(pack.iterdir()):
            if folder.name not in ITEM_FOLDERS or not folder.is_dir():
                continue
            for path in sorted(folder.glob("*.txt")):
                original, encoding = inputs[path]
                values = fields(original)
                short = values.get("ShortName")
                if not short or "Name" not in values:
                    continue
                text = original
                for key, value in catalog.get("item_rules", {}).get(short, {}).items():
                    text = replace(text, key, value)
                if folder.name == "guns":
                    seen_guns.add(short)
                    gun_keys.add("item." + short + ".name")
                    data = catalog["guns"].get(short)
                    if data is None:
                        errors.append("Unreviewed gun: " + str(path))
                        continue
                    text = replace(text, "Name", data["name"])
                    text = replace(text, "Description", data["description"])
                elif folder.name == "attachments":
                    seen_attachments.add(short)
                    data = catalog["attachments"].get(short)
                    if data is None:
                        errors.append("Unreviewed attachment: " + str(path))
                        continue
                    text = replace(text, "Name", data["name"])
                    text = replace(text, "Description", attachment_description(values, data["description"]))
                if short in catalog.get("original_icons", {}):
                    text = replace(text, "Icon", catalog["original_icons"][short])
                icon = catalog["icons"].get(short)
                if icon:
                    source = SOURCE / "icons" / (icon + ".png")
                    destination = pack / "assets/flansmod/textures/items" / source.name
                    if check:
                        if not destination.is_file() or destination.read_bytes() != source.read_bytes():
                            errors.append("Missing or outdated pixel icon: " + str(destination))
                    else:
                        destination.parent.mkdir(parents=True, exist_ok=True)
                        shutil.copyfile(source, destination)
                    text = replace(text, "Icon", icon)
                    # Paintjob zero inherits Icon in PaintableType; painted variants keep their art.
                    counts["pixel icons"] += 1
                if text != original:
                    if check:
                        errors.append("Outdated definition: " + str(path))
                    else:
                        with path.open("w", encoding=encoding, newline="") as stream:
                            stream.write(text)
                    counts["definitions"] += 1
                prefix = "tile." if folder.name in {"boxes", "armorBoxes", "blocks"} else "item."
                entries[prefix + short + ".name"] = fields(text)["Name"]
        if not entries:
            continue
        language = pack / "assets/flansmod/lang/en_US.lang"
        current = language.read_text(encoding="utf-8") if language.is_file() else ""
        lines = current.splitlines()
        present = {line.split("=", 1)[0] for line in lines if "=" in line}
        # Existing translations win except names deliberately revised in this task.
        override = gun_keys | {"item." + k + ".name" for k in catalog["attachments"]}
        updated = [line.split("=", 1)[0] + "=" + entries[line.split("=", 1)[0]]
                   if "=" in line and line.split("=", 1)[0] in override & entries.keys()
                   else line for line in lines]
        missing = sorted(entries.keys() - present)
        updated.extend(key + "=" + entries[key] for key in missing)
        result = "\n".join(updated) + "\n"
        if current.replace("\r\n", "\n") != result:
            if check:
                errors.append("Missing or outdated language entries: " + str(language))
            else:
                language.parent.mkdir(parents=True, exist_ok=True)
                language.write_text(result, encoding="utf-8")
        counts["language entries"] += len(missing)
    for category, seen in (("guns", seen_guns), ("attachments", seen_attachments)):
        missing = catalog[category].keys() - seen
        if missing:
            errors.append("Missing reviewed " + category + ": " + ", ".join(sorted(missing)))
    if errors:
        raise ValueError("\n".join(errors))
    print(("Verified" if check else "Installed") + ": " + str(counts))


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--pack-root", type=Path, default=ROOT / "eclipse/Flan")
    parser.add_argument("--check", action="store_true")
    args = parser.parse_args()
    install(args.pack_root, args.check)
