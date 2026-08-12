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


def find_texture(icon):
    expected = (icon + ".png").lower()
    matches = [path for path in ITEM_TEXTURES.iterdir()
               if path.is_file() and path.name.lower() == expected]
    if len(matches) != 1:
        raise RuntimeError("Expected one texture for Icon %s, found %d" % (icon, len(matches)))
    return matches[0]


def write_tracer_icon(source, destination):
    shutil.copyfile(str(source), str(destination))
    with Image.open(str(destination)) as image:
        image = image.convert("RGBA")
        if image.width < 8 or image.height < 8:
            raise RuntimeError("Texture is smaller than the 8x8 tracer marker: %s" % source)
        pixels = image.load()
        for y in range(image.height - 8, image.height):
            for x in range(image.width - 8, image.width):
                pixels[x, y] = (255, 0, 0, 255)
        image.save(str(destination), "PNG")


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
    for _short_name, (_base, filename) in LEGACY_TRACERS.items():
        legacy = BULLETS / filename
        if legacy.exists():
            legacy.unlink()
    for filename in LEGACY_TRACER_ICONS:
        legacy_icon = ITEM_TEXTURES / filename
        if legacy_icon.exists():
            legacy_icon.unlink()

    generated = list(BULLETS.glob("*_Tracer.txt"))
    for path in generated:
        path.unlink()

    sources = sorted(BULLETS.glob("*.txt"), key=lambda path: path.name.lower())
    definitions = {}
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
        if short_name in definitions:
            raise RuntimeError("Duplicate ammunition ShortName: %s" % short_name)

        tracer_short_name = short_name + "Tracer"
        tracer_icon = icon + "Tracer"
        tracer_lines = remove_directive(lines, "ItemID")
        tracer_lines = replace_directive(tracer_lines, "Name", name + " Tracer")
        tracer_lines = replace_directive(tracer_lines, "ShortName", tracer_short_name)
        tracer_lines = replace_directive(tracer_lines, "Icon", tracer_icon)
        tracer_lines = replace_directive(tracer_lines, "Tracer", "True")
        target = BULLETS / (source.stem + "_Tracer.txt")
        target.write_text("\n".join(tracer_lines) + "\n", encoding="utf-8")

        source_texture = find_texture(icon)
        tracer_texture = ITEM_TEXTURES / (tracer_icon + ".png")
        write_tracer_icon(source_texture, tracer_texture)
        definitions[short_name] = (tracer_short_name, name + " Tracer")
    return definitions


def update_guns(definitions):
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
            ammo_name = LEGACY_TRACERS.get(ammo_name, (ammo_name, None))[0]
            regular_line = "%sAmmo %s%s" % (indent, ammo_name, suffix)
            if ammo_name not in accepted:
                output.append(regular_line)
                accepted.add(ammo_name)
            if ammo_name in definitions:
                tracer_name = definitions[ammo_name][0]
                if tracer_name not in accepted:
                    output.append("%sAmmo %s%s" % (indent, tracer_name, suffix))
                    accepted.add(tracer_name)
        gun_file.write_text("\n".join(output) + "\n", encoding="utf-8")


def update_languages(definitions):
    removed_keys = {"item.%s.name" % short.lower() for short in LEGACY_TRACERS}
    generated_keys = {"item.%s.name" % tracer.lower()
                      for tracer, _name in definitions.values()}
    for lang_file in LANG_DIR.glob("*.lang"):
        lines = lang_file.read_text(encoding="utf-8-sig").splitlines()
        output = []
        for line in lines:
            key = line.split("=", 1)[0].strip().lower()
            if key not in removed_keys and key not in generated_keys:
                output.append(line)
        output.append("")
        output.append("# Generated tracer ammunition")
        for _regular, (tracer_short, tracer_name) in sorted(definitions.items()):
            output.append("item.%s.name=%s" % (tracer_short, tracer_name))
        lang_file.write_text("\n".join(output) + "\n", encoding="utf-8")


def main():
    definitions = generate_definitions()
    update_guns(definitions)
    update_languages(definitions)
    print("Generated %d tracer ammunition definitions and icons." % len(definitions))


if __name__ == "__main__":
    main()
