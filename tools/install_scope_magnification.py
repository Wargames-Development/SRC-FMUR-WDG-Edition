"""Apply advertised optical magnification to the existing BFMC content pack."""

from argparse import ArgumentParser
from pathlib import Path
import re


PACK = Path(__file__).resolve().parents[1] / "eclipse/Flan/BFMC Gun Pack"
# Keep ShortName, filenames and model/texture references compatible with saved guns.
OPTICS = {
    "acogta01": (4,), "acogta31": (4,), "c25scope": (1, 6), "c79": (3.4,),
    "cl6x": (6,), "cnvdt": (3,), "coyote": (1,), "holo": (1,),
    "jgm4": (4,), "kobra": (1,), "m145": (1, 4), "okp7": (1,),
    "pka": (3.4,), "pkas": (1,), "pks07": (7,), "prisma": (3.4,),
    "pso1": (4,), "qxm7": (1,), "reflex": (1,), "8xscope": (8,),
    "variablezoomcn": (6, 14), "variablezoomru": (7, 14),
    "variablezoomus": (8, 14),
}


def read(path):
    # Some original descriptions contain non-UTF-8 bytes. Preserve them exactly.
    return path.read_bytes().decode("utf-8", errors="surrogateescape")


def set_field(text, key, value, separator=" "):
    pattern = r"(?m)^" + re.escape(key) + re.escape(separator) + r"[^\r\n]*"
    line = key + separator + str(value)
    if re.search(pattern, text):
        return re.sub(pattern, lambda _: line, text)
    newline = "\r\n" if "\r\n" in text else "\n"
    return text + ("" if text.endswith("\n") else newline) + line + newline


def install_scope_magnification(pack):
    updates = {}
    found = set()
    for path in (pack / "attachments").glob("*.txt"):
        text = read(path)
        if not re.search(r"(?m)^AttachmentType sights\s*$", text):
            continue
        match = re.search(r"(?m)^ShortName ([^\s]+)", text)
        short_name = match.group(1) if match else ""
        if short_name not in OPTICS or short_name in found:
            raise ValueError(f"Unknown or duplicate optic in {path}: {short_name}")
        found.add(short_name)
        zoom = OPTICS[short_name]
        # Explicit magnification enables compensation for the reduced PiP lens.
        # Remove legacy secondary fields so there is only one zoom definition.
        text = re.sub(r"(?m)^(?:ZoomLevel2|FOVZoomLevel2)[ \t]+[^\r\n]*(?:\r?\n|$)", "", text)
        if len(zoom) == 1:
            text = re.sub(r"(?m)^Magnification2[ \t]+[^\r\n]*(?:\r?\n|$)", "", text)
        for key, value in (("ZoomLevel", 1), ("FOVZoomLevel", 1), ("Magnification", zoom[0])):
            text = set_field(text, key, value)
        if len(zoom) == 2:
            text = set_field(text, "Magnification2", zoom[1])
        if short_name == "m145":
            text = set_field(text, "Name", "Elcan Spectre [1-4x]")
            text = set_field(text, "Description", "Variable magnification 1x / 4x")
        updates[path] = text

    missing = OPTICS.keys() - found
    if missing:
        raise ValueError(f"Missing BFMC optics: {', '.join(sorted(missing))}")

    language_files = list((pack / "assets/flansmod/lang").glob("*.lang"))
    if not any(path.name == "en_US.lang" for path in language_files):
        raise ValueError("BFMC English language file is missing")
    for path in language_files:
        text = read(path)
        if path.name == "en_US.lang" or re.search(r"(?m)^item\.m145\.name=", text):
            updates[path] = set_field(text, "item.m145.name", "Elcan Spectre [1-4x]", "=")

    # Validate the complete pack before writing any changes.
    changed = 0
    for path, text in updates.items():
        if read(path) != text:
            path.write_bytes(text.encode("utf-8", errors="surrogateescape"))
            changed += 1
    print(f"Checked {len(found)} BFMC optics; updated {changed} content files")


if __name__ == "__main__":
    parser = ArgumentParser(description=__doc__)
    parser.add_argument("--pack", type=Path, default=PACK)
    install_scope_magnification(parser.parse_args().pack)
