"""Install the BFMC legendary explosive ammunition and its compatibility rules."""

from argparse import ArgumentParser
from pathlib import Path
import re


PACK = Path(__file__).resolve().parents[1] / "eclipse/Flan/BFMC Gun Pack"
RETIRED_BELTS = ("762x51100rdexbox", "762x51100rdexboxtracer")
VARIANTS = (
    ("50cal5rdmag", "50calexplosive5rdmag", "50CalExplosive5rdMag.txt",
     ".50 BMG High-Explosive 5-Round Magazine", "barrettexplosiveammo", 1),
    ("20x823rdmag", "20x823rdmagExplosive", "20x823rdmag_Explosive.txt",
     "20x82mm High-Explosive 3-Round Magazine", "20x823rdmag", 1.5),
    ("snipex145x114mag", "snipex145x114magExplosive", "Snipex145x114Mag_Explosive.txt",
     "Snipex 14.5x114mm High-Explosive 5-Round Magazine", "Snipex145x114Mag", 1.5),
)
LEGENDARY = " §6[Legendary]"
HIDDEN = "HideFromCompatibleAmmo"
SHORT_NAME = re.compile(r"(?m)^ShortName[ \t]+(\S+)")
AMMO = re.compile(r"(?m)^Ammo[ \t]+(\S+)[^\r\n]*")
RETIRED_IDS = "|".join(RETIRED_BELTS)
RETIRED_AMMO = re.compile(rf"(?im)^Ammo[ \t]+(?:{RETIRED_IDS})(?=\s|$)[^\r\n]*(?:\r?\n|$)")
RETIRED_LABEL = re.compile(rf"(?im)^item\.(?:{RETIRED_IDS})\.name=[^\r\n]*(?:\r?\n|$)")


def read(path):
    return path.read_bytes().decode("utf-8", errors="surrogateescape")


def set_line(text, key, value, delimiter=" "):
    prefix = key + delimiter
    pattern = r"(?m)^" + re.escape(prefix) + r"[^\r\n]*"
    line = prefix + value
    matches = list(re.finditer(pattern, text))
    if len(matches) > 1:
        raise ValueError(f"Duplicate {key}")
    newline = "\r\n" if "\r\n" in text else "\n"
    managed = text.find("// Wargames long range BEGIN")
    # Keep authored fields outside the block that balance_long_range.ps1 replaces.
    if managed >= 0 and (not matches or matches[0].start() > managed):
        if matches:
            text = re.sub(pattern + r"(?:\r?\n|$)", "", text, count=1)
        return text[:managed] + line + newline + text[managed:]
    if matches:
        return re.sub(pattern, lambda _: line, text)
    return text.rstrip("\r\n") + newline + line + newline


def install_explosive_ammo(pack):
    bullets = {}
    for path in (pack / "bullets").glob("*.txt"):
        text = read(path)
        match = SHORT_NAME.search(text)
        if match:
            bullets.setdefault(match[1].lower(), []).append((path, text))

    def bullet(ammo_id):
        matches = bullets.get(ammo_id.lower(), [])
        if len(matches) != 1:
            raise ValueError(f"Expected one BFMC definition for {ammo_id}, found {len(matches)}")
        return matches[0]

    updates = {}
    for base, ammo_id, filename, name, icon, radius in VARIANTS:
        if ammo_id.lower() in bullets:
            path, text = bullet(ammo_id)
        else:
            path = pack / "bullets" / filename
            if path.exists():
                raise ValueError(f"Bullet definition already exists at {path}")
            _, text = bullet(base)
            text = re.sub(r"(?m)^(?:ItemID|ExplodeOnImpact)[ \t]+[^\r\n]*\r?\n", "", text)
            for key, value in (
                ("Name", name), ("ShortName", ammo_id), ("Description", name), ("Icon", icon),
                ("Explosion", str(radius)), ("ExplosionBreaksBlocks", "False"),
                ("ExplodeOnImpact", "True"),
            ):
                text = set_line(text, key, value)
        updates[path] = set_line(text, HIDDEN, "True")

    accepted_by_base = {base: ammo_id for base, ammo_id, *_ in VARIANTS}
    gun_count = 0
    for path in (pack / "guns").glob("*.txt"):
        original = read(path)
        text = RETIRED_AMMO.sub("", original)
        ammo = list(AMMO.finditer(text))
        accepted = {match[1].lower() for match in ammo}
        hidden = [ammo_id for base, ammo_id in accepted_by_base.items() if base in accepted]
        if hidden:
            gun_count += 1
            newline = "\r\n" if "\r\n" in text else "\n"
            end = ammo[-1].end()
            additions = "".join(newline + "Ammo " + ammo_id
                                for ammo_id in hidden if ammo_id.lower() not in accepted)
            text = text[:end] + additions + text[end:]
        elif text == original:
            continue
        text = re.sub(r"(?im)^Description [^\r\n]*", lambda match: re.sub(
            r"(?i)_(?:\.50\s*(?:Cal|BMG)|7\.62x51mm|20x82mm|Snipex(?: Alligator)? 14\.5x114mm)"
            r"[^_]*explosive[^_]*", "", match[0]), text)
        updates[path] = text
    if not gun_count:
        raise ValueError("No compatible BFMC guns found")

    lang = pack / "assets/flansmod/lang/en_US.lang"
    for path in lang.parent.glob("*.lang"):
        original = read(path)
        text = RETIRED_LABEL.sub("", original)
        if text != original:
            updates[path] = text
    text = RETIRED_LABEL.sub("", read(lang))
    for _, ammo_id, _, name, _, _ in VARIANTS:
        text = set_line(text, f"item.{ammo_id}.name", name + LEGENDARY, "=")
    updates[lang] = text

    for path, text in updates.items():
        if not path.exists() or read(path) != text:
            path.write_bytes(text.encode("utf-8", errors="surrogateescape"))
    for ammo_id in RETIRED_BELTS:
        for path, _ in bullets.get(ammo_id, ()):
            path.unlink(missing_ok=True)
    print(f"Installed {len(VARIANTS)} legendary explosive ammo options across {gun_count} BFMC guns")


if __name__ == "__main__":
    parser = ArgumentParser(description=__doc__)
    parser.add_argument("--pack", type=Path, default=PACK)
    install_explosive_ammo(parser.parse_args().pack)
