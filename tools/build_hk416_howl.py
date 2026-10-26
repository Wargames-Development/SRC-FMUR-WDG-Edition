"""Project the supplied Howl reference onto the BFMC HK416 UV islands.

Run extractHK416Geometry first. The generated paintjob is installed into the
local BFMC Gun Pack and also kept under development_assets/hk416_howl.
"""

from pathlib import Path
import shutil

import numpy as np
from PIL import Image


ROOT = Path(__file__).resolve().parents[1]
PACK = ROOT / "eclipse" / "Flan" / "BFMC Gun Pack"
OUTPUT = ROOT / "development_assets" / "hk416_howl"
MESH = ROOT / "build" / "hk416" / "HK416.mesh"
PAINTJOB = "AdvPaintjob Howl HK416_Howl camos/HK416_Howl"
TEXTURE_SIZE = 2048


def faces_from_mesh():
    faces = []
    for line in MESH.read_text(encoding="utf-8").splitlines()[1:]:
        fields = line.split("\t")
        face = np.asarray([[float(value) for value in vertex.split(",")]
                           for vertex in fields[1:]], dtype=np.float64)
        faces.append((fields[0], face))
    if not faces:
        raise ValueError("HK416 mesh has no faces")
    return faces


def triangle_pixels(vertices, size):
    uv = vertices[:, 3:5] / vertices[:, 5:6] * size
    a, b, c = uv
    denominator = ((b[1] - c[1]) * (a[0] - c[0])
                   + (c[0] - b[0]) * (a[1] - c[1]))
    if abs(denominator) < 1e-9:
        return []
    x0, y0 = np.maximum(0, np.floor(uv.min(axis=0))).astype(int)
    x1, y1 = np.minimum(size - 1, np.ceil(uv.max(axis=0))).astype(int)
    points = []
    for y in range(y0, y1 + 1):
        for x in range(x0, x1 + 1):
            px, py = x + 0.5, y + 0.5
            wa = ((b[1] - c[1]) * (px - c[0]) + (c[0] - b[0]) * (py - c[1])) / denominator
            wb = ((c[1] - a[1]) * (px - c[0]) + (a[0] - c[0]) * (py - c[1])) / denominator
            wc = 1 - wa - wb
            if min(wa, wb, wc) >= -1e-5:
                points.append((x, y, wa * vertices[0, :3] + wb * vertices[1, :3]
                               + wc * vertices[2, :3]))
    if not points:
        center = uv.mean(axis=0)
        x, y = np.clip(np.floor(center).astype(int), 0, size - 1)
        points.append((x, y, vertices[:, :3].mean(axis=0)))
    return points


def build_texture(faces, original, reference, decal):
    original = original.convert("RGBA").resize((TEXTURE_SIZE, TEXTURE_SIZE), Image.Resampling.NEAREST)
    result = np.asarray(original, dtype=np.uint8).copy()
    source = np.asarray(reference.convert("RGBA"), dtype=np.uint8)
    wolf = np.asarray(decal.convert("RGBA"), dtype=np.uint8)
    height, width = result.shape[:2]
    if width != TEXTURE_SIZE or height != TEXTURE_SIZE:
        raise ValueError("Unexpected HK416 atlas size")
    priority = np.full((height, width), -1.0, dtype=np.float64)
    for group, face in faces:
        for index in range(1, len(face) - 1):
            triangle = face[[0, index, index + 1]]
            normal = np.cross(triangle[1, :3] - triangle[0, :3],
                              triangle[2, :3] - triangle[0, :3])
            length = np.linalg.norm(normal)
            if length < 1e-9:
                continue
            side = abs(normal[2]) / length
            score = side + (0.03 if group == "gunModel" else 0)
            for x, y, point in triangle_pixels(triangle, width):
                if result[y, x, 3] == 0 or score <= priority[y, x]:
                    continue
                # Muzzle is at positive model X; the reference muzzle is at image left.
                ix = int(np.clip(3 + (15.1 - point[0]) / 20.1 * 500, 0, source.shape[1] - 1))
                iy = int(np.clip(50 + (5.6 - point[1]) / 5.4 * 281, 0, source.shape[0] - 1))
                color = source[iy, ix]
                if color[3] > 24:
                    target = color[:3].astype(np.float64)
                    if side < 0.55:
                        target = target * 0.7 + result[y, x, :3] * 0.3
                else:
                    target = result[y, x, :3].astype(np.float64) * 0.55
                    target += np.array([17, 12, 12])
                if group == "gunModel" and side > 0.8 and 0.7 <= point[0] <= 5.1 and 2.2 <= point[1] <= 4.8:
                    wx = int((5.1 - point[0]) / 4.4 * (wolf.shape[1] - 1))
                    wy = int((4.8 - point[1]) / 2.6 * (wolf.shape[0] - 1))
                    mark = wolf[wy, wx]
                    opacity = mark[3] / 255.0
                    target = target * (1 - opacity) + mark[:3] * opacity
                result[y, x, :3] = np.clip(target, 0, 255).astype(np.uint8)
                priority[y, x] = score
    return Image.fromarray(result, "RGBA")


def main():
    if not PACK.is_dir() or not MESH.is_file():
        raise RuntimeError("HK416 pack or extracted geometry is missing")
    original = Image.open(PACK / "assets/flansmod/skins/HK416.png")
    reference = Image.open(OUTPUT / "source/howl_reference.png")
    decal = Image.open(OUTPUT / "source/howl_wolf_decal.png")
    texture = build_texture(faces_from_mesh(), original, reference, decal)
    skin_path = OUTPUT / "assets/flansmod/skins/camos/HK416_Howl.png"
    skin_path.parent.mkdir(parents=True, exist_ok=True)
    texture.save(skin_path)

    icon = reference.convert("RGBA").crop(reference.getbbox())
    icon.thumbnail((32, 32), Image.Resampling.LANCZOS)
    item_icon = Image.new("RGBA", (32, 32))
    item_icon.alpha_composite(icon, ((32 - icon.width) // 2, (32 - icon.height) // 2))
    icon_path = OUTPUT / "assets/flansmod/textures/items/HK416_Howl.png"
    icon_path.parent.mkdir(parents=True, exist_ok=True)
    item_icon.save(icon_path)
    (OUTPUT / "paintjob.txt").write_text(PAINTJOB + "\n", encoding="utf-8")

    for generated in (skin_path, icon_path):
        installed = PACK / generated.relative_to(OUTPUT)
        installed.parent.mkdir(parents=True, exist_ok=True)
        shutil.copyfile(generated, installed)
    definition = PACK / "guns/US_AR_HK416.txt"
    lines = definition.read_text(encoding="utf-8").splitlines()
    lines = [line for line in lines if not line.lower().startswith("advpaintjob howl ")]
    lines.append(PAINTJOB)
    definition.write_text("\n".join(lines) + "\n", encoding="utf-8")
    print("Installed HK416 Howl paintjob")


if __name__ == "__main__":
    main()
