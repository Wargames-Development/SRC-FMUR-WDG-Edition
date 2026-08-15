from pathlib import Path
import re
import shutil

from PIL import Image


ROOT = Path(__file__).resolve().parents[1]
PACK = ROOT / "eclipse" / "Flan" / "BFMC Gun Pack"
BULLETS = PACK / "bullets"
GUNS = PACK / "guns"
ITEM_TEXTURES = PACK / "assets" / "flansmod" / "textures" / "items"
LANG_DIR = PACK / "assets" / "flansmod" / "lang"

LEGACY_TRACERS = {
    "556x45200rdapbox": ("556x45200rdbox", "556x45200rdAPTracerbox.txt"),
    "58x42100rdapbox": ("58x42100rdbox", "58x42200rdAPTracerbox.txt"),
    "762x51100rdapbox": ("762x51100rdbox", "762x51100rdAPTracerbox.txt"),
    "762x5120rdapmag": ("762x5120rdmag", "762x51APTracer20rdMag.txt"),
    "762x54100rdapbox": ("762x54100rdbox", "762x54100rdAPTracerbox.txt"),
}
LEGACY_TRACER_ICONS = {
    "556x45200rdAPbox.png",
    "58x42100rdapbox.png",
    "762x51100rdAPbox.png",
    "762x5120rdapmag.png",
    "762x54100rdAPbox.png",
}

# Generate tracers for ballistic cartridges even when the real-world load is
# rare. Exclude only definitions where a separate bullet tracer does not make
# sense in this pack; rockets and missiles keep their normal exhaust trails.
NON_TRACER_AMMUNITION = {
    "12gauge10rdmag",
    "12gauge5rdmag",
    "12gauge8rdmag",
    "12gaugebuckshot",
    "12gaugeslug",
    "12gaugeslug5rdmag",
    "12gaugeslug8rdmag",
    "1845rdmag",
    "20gauge",
    "20gaugeslug",
    "40mm3gl",
    "40mmdart",
    "40mmmpat",
    "blowtorchammo",
    "defibrillatorammo",
    "frag",
    "frag1",
    "g84ammo",
    "m72a7ammo",
    "mbtlawammo",
    "mk153ammo",
    "pf89rocket",
    "pzf3itammo",
    "rpgammo",
}

# Guns assigned to the Russian and Chinese content groups use green tracers.
# Eastern cartridge families stay green in generic/custom weapon definitions.
GREEN_TRACER_GUN_PREFIXES = ("cn_", "ru_", "stationary_cn_", "stationary_ru_")
GREEN_TRACER_AMMUNITION = {
    "127x5520rdmag",
    "545x3930rdmag",
    "545x3940rdmag",
    "545x3945rdmag",
    "545x3995rddrum",
    "58x2130rdmag",
    "58x4210rdmag",
    "58x4210rdmagfyjs",
    "58x42100rdbox",
    "58x4230rdmag",
    "58x4275rddrum",
    "762x2520rdmag",
    "762x258rdmag",
    "762x3930rdmag",
    "762x3940rdmag",
    "762x3950rddrum",
    "762x54100rdbox",
    "762x5410rdmag",
    "762x545rdmag",
    "762x54highlight5rdmag",
    "9x1840rdmag",
    "9x2130rdmag",
    "9x3920rdmag",
    "9x3930rdmag",
    "atbullet",
    "mosinammo",
    "snipex145x114mag",
}

# Some legacy gun definitions still reference optional ammunition whose item
# definition is not present in this checkout. Keep those names readable while
# preserving the accepted Ammo identifiers.
AMMO_DISPLAY_NAME_OVERRIDES = {
    "12gaugebirdshot": "12 Gauge Birdshot",
    "12gaugebirdshot8rdmag": "12 Gauge Birdshot 8rnd Magazine",
    "12gaugeflc8rdmag": "12 Gauge Flechette 8rnd Magazine",
    "12gaugefrag": "12 Gauge Frag",
    "12gaugefrag8rdmag": "12 Gauge Frag 8rnd Magazine",
    "12gaugeheavy": "12 Gauge Heavy Buckshot",
    "12gaugeincendiary": "12 Gauge Incendiary",
    "12gaugeincendiary8rdmag": "12 Gauge Incendiary 8rnd Magazine",
    "20gaugebirdshot": "20 Gauge Birdshot",
    "20gaugeexplosive": "20 Gauge Explosive",
    "20gaugefc": "20 Gauge Flechette",
    "20gaugeincendiary": "20 Gauge Incendiary",
    "50calexplosive5rdmag": ".50 Cal Explosive 5rnd Magazine",
    "762x51flash5rdmag": "7.62x51mm Flash 5rnd Magazine",
}


def directive(lines, key):
    prefix = key.lower() + " "
    for line in lines:
        if line.lower().startswith(prefix):
            return line.split(None, 1)[1].strip()
    return None


def replace_directive(lines, key, value):
    prefix = key.lower() + " "
    replaced = False
    output = []
    for line in lines:
        if line.lower().startswith(prefix):
            if not replaced:
                output.append(key + " " + value)
                replaced = True
        else:
            output.append(line)
    if not replaced:
        output.append(key + " " + value)
    return output


def remove_directive(lines, key):
    prefix = key.lower() + " "
    return [line for line in lines if not line.lower().startswith(prefix)]


def description_ammo_name(name):
    name = re.sub(r"(\d+)-Round\s+(Magazine|Drum|Box)\b",
                  r"\1rnd \2", name, flags=re.IGNORECASE)
    name = re.sub(r"(\d+)\s*rds?\s+(Mag(?:azine)?|Drum|Box)\b",
                  lambda match: "%srnd %s" % (
                      match.group(1),
                      "Magazine" if match.group(2).lower().startswith("mag")
                      else match.group(2).title()),
                  name, flags=re.IGNORECASE)
    name = re.sub(r"\b(Magazine|Drum|Box) Green Tracer$",
                  r"Green Tracer \1", name, flags=re.IGNORECASE)
    name = re.sub(r"\b(Magazine|Drum|Box) Tracer$",
                  r"Tracer \1", name, flags=re.IGNORECASE)
    return name


def load_ammo_display_names():
    display_names = dict(AMMO_DISPLAY_NAME_OVERRIDES)
    for directory in (BULLETS, PACK / "grenades"):
        for path in directory.glob("*.txt"):
            lines = path.read_text(encoding="utf-8-sig").splitlines()
            short_name = directive(lines, "ShortName")
            name = directive(lines, "Name")
            if short_name and name:
                display_names[short_name.lower()] = description_ammo_name(name)
    return display_names


def find_texture(icon):
    expected = (icon + ".png").lower()
    matches = [path for path in ITEM_TEXTURES.iterdir()
               if path.is_file() and path.name.lower() == expected]
    if len(matches) != 1:
        raise RuntimeError("Expected one texture for Icon %s, found %d" % (icon, len(matches)))
    return matches[0]


def write_tracer_icon(source, destination, marker_color):
    shutil.copyfile(str(source), str(destination))
    with Image.open(str(destination)) as image:
        image = image.convert("RGBA")
        if image.width < 8 or image.height < 8:
            raise RuntimeError("Texture is smaller than the 8x8 tracer marker: %s" % source)
        pixels = image.load()
        for y in range(image.height - 8, image.height):
            for x in range(image.width - 8, image.width):
                pixels[x, y] = marker_color
        image.save(str(destination), "PNG")


def uses_green_tracer(gun_file, ammo_name):
    gun_name = gun_file.name.lower()
    return (gun_name.startswith(GREEN_TRACER_GUN_PREFIXES)
            or ammo_name.lower() in GREEN_TRACER_AMMUNITION)


def collect_tracer_colors(source_short_names):
    colors_by_ammo = {}
    for gun_file in GUNS.glob("*.txt"):
        lines = gun_file.read_text(encoding="utf-8-sig").splitlines()
        for line in lines:
            match = re.match(r"^\s*Ammo\s+(\S+)", line, re.IGNORECASE)
            if not match:
                continue
            ammo_name = LEGACY_TRACERS.get(match.group(1), (match.group(1), None))[0]
            if ammo_name not in source_short_names:
                continue
            color = "green" if uses_green_tracer(gun_file, ammo_name) else "red"
            colors_by_ammo.setdefault(ammo_name, set()).add(color)

    for ammo_name in source_short_names:
        if ammo_name in NON_TRACER_AMMUNITION or ammo_name in colors_by_ammo:
            continue
        default_color = "green" if ammo_name in GREEN_TRACER_AMMUNITION else "red"
        colors_by_ammo[ammo_name] = {default_color}
    return colors_by_ammo


def sanitize_legacy_particle_tracer(lines):
    uses_old_tracer = any(
        line.lower().startswith("trailparticletype ")
        and "flansmod.fmtracer" in line.lower()
        for line in lines
    )
    if not uses_old_tracer:
        return lines
    lines = [line for line in lines
             if not (line.lower().startswith("trailparticletype ")
                     and "flansmod.fmtracer" in line.lower())]
    lines = replace_directive(lines, "TrailParticles", "False")
    lines = replace_directive(lines, "Haslight", "False")
    return lines


def generate_definitions():
    previous_tracer_short_names = set()
    previous_tracer_icons = set()
    generated = (list(BULLETS.glob("*_Tracer.txt"))
                 + list(BULLETS.glob("*_GreenTracer.txt")))
    for path in generated:
        lines = path.read_text(encoding="utf-8-sig").splitlines()
        short_name = directive(lines, "ShortName")
        icon = directive(lines, "Icon")
        if short_name:
            previous_tracer_short_names.add(short_name)
        if icon:
            previous_tracer_icons.add(icon)

    for _short_name, (_base, filename) in LEGACY_TRACERS.items():
        legacy = BULLETS / filename
        if legacy.exists():
            legacy.unlink()
    for filename in LEGACY_TRACER_ICONS:
        legacy_icon = ITEM_TEXTURES / filename
        if legacy_icon.exists():
            legacy_icon.unlink()

    for path in generated:
        path.unlink()
    for icon in previous_tracer_icons:
        tracer_icon = ITEM_TEXTURES / (icon + ".png")
        if tracer_icon.exists():
            tracer_icon.unlink()

    sources = sorted(BULLETS.glob("*.txt"), key=lambda path: path.name.lower())
    source_data = []
    source_short_names = set()
    for source in sources:
        lines = source.read_text(encoding="utf-8-sig").splitlines()
        lines = sanitize_legacy_particle_tracer(lines)
        lines = replace_directive(lines, "Tracer", "False")
        source.write_text("\n".join(lines) + "\n", encoding="utf-8")

        name = directive(lines, "Name")
        short_name = directive(lines, "ShortName")
        icon = directive(lines, "Icon")
        if not name or not short_name or not icon:
            raise RuntimeError("Missing Name, ShortName, or Icon in %s" % source)
        if short_name in source_short_names:
            raise RuntimeError("Duplicate ammunition ShortName: %s" % short_name)
        source_short_names.add(short_name)
        source_data.append((source, lines, name, short_name, icon))

    colors_by_ammo = collect_tracer_colors(source_short_names)
    definitions = {}
    for source, lines, name, short_name, icon in source_data:
        if short_name in NON_TRACER_AMMUNITION:
            continue

        source_texture = find_texture(icon)
        variants = {}
        for color, short_suffix, file_suffix, marker_color in (
                ("red", "Tracer", "_Tracer", (255, 0, 0, 255)),
                ("green", "GreenTracer", "_GreenTracer", (0, 255, 0, 255))):
            if color not in colors_by_ammo[short_name]:
                continue
            tracer_short_name = short_name + short_suffix
            tracer_name = name + (" Green Tracer" if color == "green" else " Tracer")
            tracer_icon = icon + short_suffix
            tracer_lines = remove_directive(lines, "ItemID")
            tracer_lines = replace_directive(tracer_lines, "Name", tracer_name)
            tracer_lines = replace_directive(tracer_lines, "ShortName", tracer_short_name)
            tracer_lines = replace_directive(tracer_lines, "Icon", tracer_icon)
            tracer_lines = replace_directive(tracer_lines, "Tracer", "True")
            tracer_lines = replace_directive(tracer_lines, "TracerColor", color.title())
            target = BULLETS / (source.stem + file_suffix + ".txt")
            target.write_text("\n".join(tracer_lines) + "\n", encoding="utf-8")

            tracer_texture = ITEM_TEXTURES / (tracer_icon + ".png")
            write_tracer_icon(source_texture, tracer_texture, marker_color)
            variants[color] = (tracer_short_name, tracer_name)
        definitions[short_name] = variants
    missing = NON_TRACER_AMMUNITION - source_short_names
    if missing:
        raise RuntimeError("Unknown non-tracer ammunition: %s" % ", ".join(sorted(missing)))
    missing_green = GREEN_TRACER_AMMUNITION - source_short_names
    if missing_green:
        raise RuntimeError("Unknown green-tracer ammunition: %s" % ", ".join(sorted(missing_green)))
    return definitions, previous_tracer_short_names


def update_guns(definitions, previous_tracer_short_names):
    for gun_file in GUNS.glob("*.txt"):
        lines = gun_file.read_text(encoding="utf-8-sig").splitlines()
        output = []
        accepted = set()
        for line in lines:
            match = re.match(r"^(\s*)Ammo\s+(\S+)(.*)$", line, re.IGNORECASE)
            if not match:
                output.append(line)
                continue
            indent, ammo_name, suffix = match.groups()
            if ammo_name in previous_tracer_short_names:
                continue
            ammo_name = LEGACY_TRACERS.get(ammo_name, (ammo_name, None))[0]
            regular_line = "%sAmmo %s%s" % (indent, ammo_name, suffix)
            if ammo_name not in accepted:
                output.append(regular_line)
                accepted.add(ammo_name)
            if ammo_name in definitions:
                for color in ("red", "green"):
                    if color not in definitions[ammo_name]:
                        continue
                    tracer_name = definitions[ammo_name][color][0]
                    if tracer_name not in accepted:
                        output.append("%sAmmo %s%s" % (indent, tracer_name, suffix))
                        accepted.add(tracer_name)
        gun_file.write_text("\n".join(output) + "\n", encoding="utf-8")


def update_gun_descriptions():
    display_names = load_ammo_display_names()
    for gun_file in GUNS.glob("*.txt"):
        lines = gun_file.read_text(encoding="utf-8-sig").splitlines()
        ammo_names = []
        seen = set()
        for line in lines:
            match = re.match(r"^\s*Ammo\s+(\S+)", line, re.IGNORECASE)
            if not match:
                continue
            short_name = match.group(1).lower()
            if short_name in seen:
                continue
            if short_name not in display_names:
                raise RuntimeError("Missing display name for Ammo %s in %s"
                                   % (short_name, gun_file))
            seen.add(short_name)
            ammo_names.append(display_names[short_name])
        if not ammo_names:
            continue

        uses_sections = ["Uses:"] + ammo_names
        description_index = next((index for index, line in enumerate(lines)
                                  if line.lower().startswith("description ")), None)
        if description_index is not None:
            existing = lines[description_index].split(None, 1)[1]
            prefix = existing.split("_", 1)[0].rstrip()
            description_sections = ([] if prefix.lower().startswith("uses:")
                                    else [prefix])
            lines[description_index] = "Description " + "_".join(
                description_sections + uses_sections)
        else:
            insert_at = next((index + 1 for index, line in enumerate(lines)
                              if line.lower().startswith("icon ")), None)
            if insert_at is None:
                insert_at = max(index + 1 for index, line in enumerate(lines)
                                if line.lower().startswith("ammo "))
            lines.insert(insert_at, "Description " + "_".join(uses_sections))
        gun_file.write_text("\n".join(lines) + "\n", encoding="utf-8")


def update_languages(definitions, previous_tracer_short_names):
    removed_keys = {"item.%s.name" % short.lower() for short in LEGACY_TRACERS}
    removed_keys.update("item.%s.name" % short.lower()
                        for short in previous_tracer_short_names)
    generated_keys = {"item.%s.name" % tracer.lower()
                      for variants in definitions.values()
                      for tracer, _name in variants.values()}
    for lang_file in LANG_DIR.glob("*.lang"):
        lines = lang_file.read_text(encoding="utf-8-sig").splitlines()
        output = []
        for line in lines:
            key = line.split("=", 1)[0].strip().lower()
            if (line.strip() != "# Generated tracer ammunition"
                    and key not in removed_keys and key not in generated_keys):
                output.append(line)
        while output and not output[-1].strip():
            output.pop()
        output.append("")
        output.append("# Generated tracer ammunition")
        for _regular, variants in sorted(definitions.items()):
            for color in ("red", "green"):
                if color not in variants:
                    continue
                tracer_short, tracer_name = variants[color]
                output.append("item.%s.name=%s" % (tracer_short, tracer_name))
        lang_file.write_text("\n".join(output) + "\n", encoding="utf-8")


def main():
    definitions, previous_tracer_short_names = generate_definitions()
    update_guns(definitions, previous_tracer_short_names)
    update_gun_descriptions()
    update_languages(definitions, previous_tracer_short_names)
    generated_count = sum(len(variants) for variants in definitions.values())
    print("Generated %d tracer ammunition definitions and icons." % generated_count)


if __name__ == "__main__":
    main()
