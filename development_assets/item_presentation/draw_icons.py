"""Native 32px armor pixels from each item's own geometry and camouflage UVs.

No shared vest silhouettes, guessed cloth palettes, image generation, smoothing,
or pixels outside the rasterized silhouette. Guns keep their original icons,
apart from the approved M1911. CNVD-T is drawn as a horizontal scope icon.
"""
import json
from pathlib import Path
import re
import shutil
import sys

import numpy as np
from PIL import Image, ImageDraw

HERE = Path(__file__).resolve().parent
ROOT = HERE.parents[1]
sys.path.insert(0, str(ROOT / "tools"))
from render_tap_armor_icons import read_mesh, transformed_faces
from wearable_icons import balaclava, night_vision


def armor_pixels(values):
    faces = read_mesh(values["Model"])
    helmet = values["Type"].lower() == "helmet"
    # Show the jacket, rather than squeezing its matching trousers into the icon.
    if values["Type"].lower() == "chest":
        faces = [(group, vertices) for group, vertices in faces
                 if group not in ("leftLegModel", "rightLegModel", "nativeLeftLeg", "nativeRightLeg", "skirtFrontModel", "skirtRearModel")]
    groups = [group for group, _ in faces]
    faces, points = transformed_faces(faces, float(values.get("ModelScale", "1")))
    view = np.array([0.55, -0.22, -0.8] if helmet else [0., 0., -1.])
    view /= np.linalg.norm(view)
    right = np.array([0.8, 0., 0.55] if helmet else [1., 0., 0.])
    right /= np.linalg.norm(right)
    down = np.cross(right, view)
    down /= np.linalg.norm(down)
    bounds = np.column_stack((points @ right, points @ down))
    low, high = bounds.min(axis=0), bounds.max(axis=0)
    scale = 28. / max(high - low)
    center = (low + high) / 2
    layer = "2" if values["Type"].lower() in ("pants", "legs") else "1"
    texture_path = ROOT / "eclipse/Flan/TaP-Escalation/assets/flansmod/armor" / (values["ArmourTexture"] + "_" + layer + ".png")
    texture = np.asarray(Image.open(texture_path).convert("RGBA"))
    height, width = texture.shape[:2]
    canvas = np.zeros((32, 32, 4), dtype=np.uint8)
    depth = np.full((32, 32), -np.inf)
    for group, polygon in zip(groups, faces):
        for index in range(1, len(polygon) - 1):
            vertices = polygon[[0, index, index + 1]]
            xyz = vertices[:, :3]
            tri = np.column_stack((xyz @ right, xyz @ down, xyz @ view))
            tri[:, :2] = (tri[:, :2] - center) * scale + 16
            a, b, c = tri
            denominator = ((b[1] - c[1]) * (a[0] - c[0]) + (c[0] - b[0]) * (a[1] - c[1]))
            if abs(denominator) < 1e-10:
                continue
            x0, y0 = np.maximum(0, np.floor(tri[:, :2].min(axis=0))).astype(int)
            x1, y1 = np.minimum(31, np.ceil(tri[:, :2].max(axis=0))).astype(int)
            if x0 > x1 or y0 > y1:
                continue
            yy, xx = np.mgrid[y0:y1 + 1, x0:x1 + 1]
            wa = ((b[1] - c[1]) * (xx + .5 - c[0]) + (c[0] - b[0]) * (yy + .5 - c[1])) / denominator
            wb = ((c[1] - a[1]) * (xx + .5 - c[0]) + (a[0] - c[0]) * (yy + .5 - c[1])) / denominator
            wc = 1 - wa - wb
            z = wa * a[2] + wb * b[2] + wc * c[2]
            q = wa * vertices[0, 5] + wb * vertices[1, 5] + wc * vertices[2, 5]
            q = np.where(np.abs(q) < 1e-10, 1., q)
            u = (wa * vertices[0, 3] + wb * vertices[1, 3] + wc * vertices[2, 3]) / q
            v = (wa * vertices[0, 4] + wb * vertices[1, 4] + wc * vertices[2, 4]) / q
            tx = np.clip((u * width).astype(int), 0, width - 1)
            ty = np.clip((v * height).astype(int), 0, height - 1)
            colors = texture[ty, tx].copy()
            snow = "Snow" in values["ShortName"]
            if group in ("nativeLeftCuff", "nativeRightCuff"):
                colors[:] = (176, 179, 166, 255) if snow else (64, 74, 41, 255)
            elif group == "nativeFaceVeil":
                colors[:] = (214, 219, 207, 255) if snow else (97, 115, 69, 255)
            elif group == "nativeFaceWeave":
                colors[:] = (158, 166, 150, 255) if snow else (61, 77, 41, 255)
            visible = ((wa >= -1e-6) & (wb >= -1e-6) & (wc >= -1e-6)
                       & (z > depth[yy, xx]) & (colors[..., 3] >= 128))
            canvas[yy[visible], xx[visible]] = colors[visible]
            depth[yy[visible], xx[visible]] = z[visible]
    mask = canvas[..., 3] >= 128
    if values["ShortName"] == "tapPolandVest":
        yy, xx = np.nonzero(mask)
        top, center_x = int(yy.min()), int(round((xx.min() + xx.max()) / 2.))
        for row in range(5):
            half = 4 - row
            mask[top + row, center_x - half:center_x + half + 1] = False
    if values["Type"].lower() == "chest":
        # Tiny disconnected UV/model fragments above a jacket are not sleeves.
        seen = set()
        for y, x in np.argwhere(mask):
            if (y, x) in seen:
                continue
            component, pending = [], [(y, x)]
            seen.add((y, x))
            while pending:
                cy, cx = pending.pop()
                component.append((cy, cx))
                for dy in (-1, 0, 1):
                    for dx in (-1, 0, 1):
                        ny, nx = cy + dy, cx + dx
                        if 0 <= ny < 32 and 0 <= nx < 32 and mask[ny, nx] and (ny, nx) not in seen:
                            seen.add((ny, nx))
                            pending.append((ny, nx))
            if len(component) <= 2:
                for cy, cx in component:
                    mask[cy, cx] = False
    # Inset edge shading: never dilate the mask or add pixels around shoulders.
    interior = mask.copy()
    interior[1:] &= mask[:-1]
    interior[:-1] &= mask[1:]
    interior[:, 1:] &= mask[:, :-1]
    interior[:, :-1] &= mask[:, 1:]
    edge = mask & ~interior
    canvas[edge, :3] = (canvas[edge, :3].astype(float) * .55).astype(np.uint8)
    canvas[..., 3] = np.where(mask, 255, 0)
    image = Image.fromarray(canvas, "RGBA")
    # Palette comes only from visible, correctly mapped cloth; no UV debug-space sampling.
    opaque = image.convert("RGB").quantize(colors=24, dither=Image.Dither.NONE).convert("RGBA")
    opaque.putalpha(Image.fromarray(np.where(mask, 255, 0).astype(np.uint8)))
    if values["ShortName"] == "tapOperatorHelmet":
        d = ImageDraw.Draw(opaque)
        d.rectangle((7, 11, 10, 17), fill="#2e3424")
        d.rectangle((8, 12, 9, 16), fill="#87916b")
        d.point((8, 12), fill="#b0b58a")
        d.rectangle((18, 14, 26, 17), fill="#323927")
        d.line((19, 14, 25, 14), fill="#9ca47c")
        for x in (20, 23, 25):
            d.point((x, 16), fill="#6c7652")
        opaque.putalpha(Image.fromarray(np.where(mask, 255, 0).astype(np.uint8)))
    return opaque, mask


def main():
    catalog = json.loads((HERE / "catalog.json").read_text(encoding="utf-8"))
    artwork_path = HERE / "artwork.json"
    artwork = json.loads(artwork_path.read_text(encoding="utf-8"))
    shutil.copyfile(HERE / "references/approved_M1911.png", HERE / "icons/pixel_sketchM1911.png")
    artwork["sketchM1911"] = {"origin": "User-approved M1911 pixel icon, unchanged", "size": [32, 32]}
    for path in sorted((ROOT / "eclipse/Flan/TaP-Escalation/armorFiles").glob("*.txt")):
        values = dict(re.findall(r"^(\w+) +([^\r\n]+)", path.read_text(), re.M))
        short = values["ShortName"]
        image, mask = armor_pixels(values)
        assert np.array_equal(np.asarray(image)[..., 3] > 0, mask)
        if "balaclava" in values["Name"].lower():
            image = balaclava(image, short)
        image.save(HERE / "icons" / (catalog["icons"][short] + ".png"))
        artwork[short] = {"origin": "Native 32px orthographic pixels from the item's own model and UV-mapped camouflage; inset outline",
                          "model": values["Model"], "texture": values["ArmourTexture"], "size": [32, 32]}
    artwork_path.write_text(json.dumps(artwork, indent=2) + "\n", encoding="utf-8")
    builtin = HERE / "builtin_icons"
    builtin.mkdir(exist_ok=True)
    for short in ("gpnvg", "gpnvg_wp", "gpnvg_black", "gpnvg_wp_black", "pvs14", "pvs14_wp",
                  "pvs14_amber", "pvs14_black", "pvs14_wp_black", "pvs14_amber_black"):
        phosphor = "white" if "_wp" in short else "amber" if "amber" in short else "green"
        night_vision(short.startswith("pvs14"), "black" in short, phosphor).save(builtin / (short + ".png"))


if __name__ == "__main__":
    main()
