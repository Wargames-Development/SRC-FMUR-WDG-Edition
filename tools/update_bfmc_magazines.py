"""Normalize BFMC magazine names and expand verified compatible feed variants.

Run without arguments for a dry run, or pass --apply to write the changes.
"""

from pathlib import Path
import re
import sys


ROOT = Path(__file__).resolve().parents[1]
PACK = (ROOT / "eclipse" / "Flan" / "BFMC Gun Pack").resolve()
BULLETS = PACK / "bullets"
GUNS = PACK / "guns"
LANG = PACK / "assets" / "flansmod" / "lang" / "en_US.lang"

# These capacities share the same physical magazine interface. Feed shapes are
# kept separate, so a gun configured for stick magazines never gains a drum or box.
INTERCHANGEABLE_MAGAZINES = {
    "556x45": ({30, 40}, set()),
    "545x39": ({30, 40, 45}, set()),
    "762x39": ({30, 40}, {"sks"}),
    "9x39": ({20, 30}, set()),
}

MAGAZINE_NAME_PATTERN = re.compile(
    r"\b(\d+)(?:rds?|rnds?|[- ]?round)\s+"
    r"((?:[A-Za-z0-9.-]+\s+){0,3})(?:mag|magazine)\b", re.IGNORECASE)


def directives(text):
    result = {}
    for line in text.splitlines():
        fields = line.strip().split(None, 1)
        if len(fields) == 2:
            result.setdefault(fields[0], []).append(fields[1].strip())
    return result


def first(values, key, default=None):
    entries = values.get(key)
    return entries[0] if entries else default


def feed_info(short_name, rounds):
    match = re.match(r"^(.*?)" + re.escape(str(rounds))
                     + r"rd(mag|drum|box)(.*)$", short_name, re.IGNORECASE)
    if not match:
        return None
    variant = match.group(3)
    variant_base = re.sub(r"(?:GreenTracer|Tracer)$", "", variant,
                          flags=re.IGNORECASE).lower()
    return {
        "family": match.group(1).lower(),
        "capacity": rounds,
        "kind": match.group(2).lower(),
        "variant": variant,
        "variant_base": variant_base,
    }


def normalized_magazine_name(name):
    return MAGAZINE_NAME_PATTERN.sub(
        lambda match: f"{match.group(1)}-Round {match.group(2)}Magazine", name, count=1)


def replace_directive(text, key, value, path):
    updated, count = re.subn(r"(?m)^" + re.escape(key) + r"\s+.*$",
                             f"{key} {value}", text)
    if count != 1:
        raise ValueError(f"Expected one {key} line in {path.name}; found {count}")
    return updated


def load_ammo():
    ammo = {}
    normalized_files = {}
    magazine_names = {}
    for path in sorted(BULLETS.glob("*.txt")):
        text = path.read_text(encoding="utf-8")
        values = directives(text)
        short_name = first(values, "ShortName")
        rounds_value = first(values, "RoundsPerItem")
        name = first(values, "Name")
        if short_name is not None and name is not None and MAGAZINE_NAME_PATTERN.search(name):
            normalized = normalized_magazine_name(name)
            magazine_names[short_name] = normalized
            if normalized != name:
                normalized_files[path] = replace_directive(text, "Name", normalized, path)

        if short_name is None or rounds_value is None:
            continue
        rounds = int(rounds_value)
        info = feed_info(short_name, rounds)
        if info is None:
            continue
        info.update({"short_name": short_name, "name": name, "path": path})
        ammo[short_name] = info
        if short_name in magazine_names:
            info["name"] = magazine_names[short_name]
    return ammo, normalized_files, magazine_names


def candidate_ammo(current, gun_short_name, ammo):
    allowed = set()
    for ammo_id in current:
        source = ammo.get(ammo_id)
        if source is None:
            continue
        for candidate_id, candidate in ammo.items():
            same_feed = (candidate["family"] == source["family"]
                         and candidate["capacity"] == source["capacity"]
                         and candidate["kind"] == source["kind"]
                         and candidate["variant_base"] == source["variant_base"])
            if same_feed:
                allowed.add(candidate_id)

        interchange = INTERCHANGEABLE_MAGAZINES.get(source["family"])
        if source["kind"] != "mag" or interchange is None:
            continue
        capacities, excluded_guns = interchange
        if source["capacity"] not in capacities or gun_short_name in excluded_guns:
            continue
        for candidate_id, candidate in ammo.items():
            if (candidate["family"] == source["family"]
                    and candidate["kind"] == "mag"
                    and candidate["variant_base"] == source["variant_base"]
                    and candidate["capacity"] in capacities):
                allowed.add(candidate_id)
    return allowed


def ammo_sort_key(ammo_id, ammo):
    value = ammo[ammo_id]
    variant = value["variant"].lower()
    variant_order = 0 if not variant else (1 if variant == "tracer" else 2)
    return value["family"], value["capacity"], value["kind"], variant_order, ammo_id.lower()


def update_guns(ammo):
    updates = {}
    details = []
    added_lines = 0
    for path in sorted(GUNS.glob("*.txt")):
        text = path.read_text(encoding="utf-8")
        values = directives(text)
        current = values.get("Ammo", [])
        gun_short_name = first(values, "ShortName", "")
        additions = sorted(candidate_ammo(current, gun_short_name, ammo) - set(current),
                           key=lambda ammo_id: ammo_sort_key(ammo_id, ammo))
        if not additions:
            continue

        # Enforce the requested visual boundary even if the rules above change later.
        current_kinds = {(ammo[item]["family"], ammo[item]["kind"])
                         for item in current if item in ammo}
        for ammo_id in additions:
            candidate = ammo[ammo_id]
            if candidate["kind"] in ("drum", "box"):
                key = candidate["family"], candidate["kind"]
                if key not in current_kinds:
                    raise ValueError(f"Refusing to add a new {candidate['kind']} feed to {path.name}")

        newline = "\r\n" if "\r\n" in text else "\n"
        lines = text.splitlines()
        ammo_indexes = [index for index, line in enumerate(lines)
                        if line.strip().startswith("Ammo ")]
        if not ammo_indexes:
            raise ValueError(f"Cannot place compatible ammo in {path.name}")
        insert_at = ammo_indexes[-1] + 1
        lines[insert_at:insert_at] = ["Ammo " + ammo_id for ammo_id in additions]
        updates[path] = newline.join(lines) + (newline if text.endswith(("\n", "\r")) else "")
        details.append((path.name, additions))
        added_lines += len(additions)
    return updates, added_lines, details


def update_lang(magazine_names):
    text = LANG.read_text(encoding="utf-8")
    newline = "\r\n" if "\r\n" in text else "\n"
    appended = []
    changed = 0
    for short_name, name in sorted(magazine_names.items(), key=lambda item: item[0].lower()):
        key = "item." + short_name + ".name"
        pattern = re.compile(r"(?m)^" + re.escape(key) + r"=.*$")
        replacement = key + "=" + name
        text, count = pattern.subn(replacement, text)
        if count > 1:
            raise ValueError(f"Duplicate language key: {key}")
        if count == 0:
            appended.append(replacement)
        else:
            changed += 1
    if appended:
        if text and not text.endswith(("\n", "\r")):
            text += newline
        text += newline.join(appended) + newline
    return text, changed, len(appended)


def main():
    if PACK.name != "BFMC Gun Pack" or not BULLETS.is_dir() or not GUNS.is_dir():
        raise RuntimeError(f"Refusing to update an unexpected content pack: {PACK}")
    apply_changes = sys.argv[1:] == ["--apply"]
    if sys.argv[1:] not in ([], ["--apply"]):
        raise ValueError("Usage: update_bfmc_magazines.py [--apply]")

    ammo, normalized_files, magazine_names = load_ammo()
    gun_updates, added_lines, gun_details = update_guns(ammo)
    lang_text, lang_changed, lang_appended = update_lang(magazine_names)
    if apply_changes:
        for path, text in normalized_files.items():
            path.write_text(text, encoding="utf-8")
        for path, text in gun_updates.items():
            path.write_text(text, encoding="utf-8")
        LANG.write_text(lang_text, encoding="utf-8")

    mode = "Applied" if apply_changes else "Would apply"
    print(f"{mode}: {len(normalized_files)} normalized magazine names, "
          f"{added_lines} ammo links across {len(gun_updates)} guns, "
          f"{lang_changed} language entries updated, {lang_appended} appended.")
    for file_name, additions in gun_details:
        print(f"  {file_name}: {', '.join(additions)}")


if __name__ == "__main__":
    main()
