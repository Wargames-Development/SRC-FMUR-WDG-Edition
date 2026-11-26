"""Apply ADS fixes to the external BFMC Gun Pack, then restart Minecraft."""

from argparse import ArgumentParser
from pathlib import Path
import re

from install_scope_magnification import PACK, read, set_field


RIFLE_SCOPE_RETICLE = {
    "PictureInPictureReticle": "PIP/rifle-scope-etched",
    "PictureInPictureReticleScale": 1,
}

OPTIC_FIELDS = {
    "jgm4": {
        "PictureInPictureReticle": "PIP/jgm4-ladder",
        "PictureInPictureReticleScale": 1,
    },
    "prisma": {
        "PictureInPicture": "-24.95 12.00 0.00 4.45",
        "PictureInPictureReticle": "PIP/prisma-ranging",
        "PictureInPictureReticleScale": 1,
    },
    "pka": {
        "PictureInPicture": "-19.95 11.00 0.00 6.00",
        "PictureInPictureReticle": "PIP/pka-chevron",
        "PictureInPictureReticleScale": 1,
    },
    "pkas": {
        "ZoomLevel": 1,
        "FOVZoomLevel": 1,
        "Magnification": 1,
        "PictureInPicture": "-23.05 10.00 0.00 5.0",
        "PictureInPictureReticle": "PIP/pkas-ring",
        "PictureInPictureReticleScale": 1,
    },
    "cnvdt": {"Texture": "CNVDT_detail"},
    "m145": {
        "ZoomLevel": 1,
        "FOVZoomLevel": 1,
        "Magnification": 1,
        "Magnification2": 4,
        "PictureInPictureReticleScale": 1.25,
    },
    "8xscope": RIFLE_SCOPE_RETICLE,
    "variablezoomus": RIFLE_SCOPE_RETICLE,
    "pso1": {
        "PictureInPictureReticle": "PIP/pso1-etched",
        "PictureInPictureReticleScale": 1,
    },
}

SCROLL_OPTICS = {"variablezoomcn", "variablezoomru", "variablezoomus", "c25scope"}


def install_optic_fixes(pack):
    updates = {}
    found = set()
    for path in (pack / "attachments").glob("*.txt"):
        original = read(path)
        match = re.search(r"(?m)^ShortName[ \t]+(\S+)", original)
        if not match or (match[1] not in OPTIC_FIELDS and match[1] not in SCROLL_OPTICS):
            continue
        name = match[1]
        if name in found:
            raise ValueError(f"Duplicate BFMC optic in {path}: {name}")
        if not re.search(r"(?m)^AttachmentType[ \t]+sights[ \t]*\r?$", original):
            raise ValueError(f"Expected a sights attachment in {path}")
        found.add(name)

        updated = original
        if name == "pkas":
            updated = re.sub(r"(?m)^OverlayTexture(?:Scale)?[ \t]+[^\r\n]*(?:\r?\n|$)", "", updated)
        if name in SCROLL_OPTICS:
            updated = updated.replace("Use Switch Scope Magnification (default Z)",
                                      "Hold the scope magnification key (default Z) and scroll")
        for key, value in OPTIC_FIELDS.get(name, {}).items():
            updated = set_field(updated, key, value)
        if updated != original:
            updates[path] = updated

    missing = OPTIC_FIELDS.keys() - found
    if missing:
        raise ValueError(f"Missing BFMC optics: {', '.join(sorted(missing))}")
    for path, updated in updates.items():
        path.write_bytes(updated.encode("utf-8", errors="surrogateescape"))
    print(f"Checked {len(found)} BFMC optics. Updated {len(updates)} definitions.")


if __name__ == "__main__":
    parser = ArgumentParser(description=__doc__)
    parser.add_argument("--pack", type=Path, default=PACK)
    install_optic_fixes(parser.parse_args().pack)
