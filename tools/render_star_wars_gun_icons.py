"""Render 32x32 Star Wars gun icons from extracted runtime TMT geometry.

Run first:
  gradlew -I tools/star_wars_gun_icons.gradle extractStarWarsGunGeometry
"""

from pathlib import Path
import shutil

import numpy as np
from PIL import Image


ROOT = Path(__file__).resolve().parents[1]
PACK = ROOT / "development_assets" / "star_wars_guns" / "content_pack"
MESHES = ROOT / "build" / "star-wars-gun-icons" / "meshes"
SKINS = PACK / "assets" / "flansmod" / "skins" / "StarWars"
ITEMS = PACK / "assets" / "flansmod" / "textures" / "items" / "StarWars"
RUNTIME_ITEMS = ROOT / "eclipse" / "Flan" / "Star Wars Blasters" / "assets" / "flansmod" / "textures" / "items" / "StarWars"
NAMES = ("A280Blaster", "DC15A", "DC15SCarbine", "E11", "T21")
RENDER_SIZE = 128


def read_mesh(path):
    faces = []
    for line in path.read_text(encoding="utf-8").splitlines()[1:]:
        fields = line.split("\t")
        vertices = np.array([[float(value) for value in vertex.split(",")]
                             for vertex in fields[1:]], dtype=np.float64)
        faces.append(vertices)
    if not faces:
        raise ValueError(f"Mesh contains no faces: {path}")
    return faces


def render_icon(faces, texture_path, output_path):
    points = np.concatenate([face[:, :3] for face in faces], axis=0)
    # The models point along +X. Use a high three-quarter view while retaining
    # a strong side profile so long rifles remain readable at 32 pixels.
    right = np.array([0.94, 0.0, -0.34], dtype=np.float64)
    right /= np.linalg.norm(right)
    view = np.array([0.32, -0.28, 0.905], dtype=np.float64)
    view /= np.linalg.norm(view)
    down = np.cross(view, right)
    down /= np.linalg.norm(down)

    bounds = np.column_stack((points @ right, points @ down))
    low, high = bounds.min(axis=0), bounds.max(axis=0)
    extent = max(high - low)
    center = (low + high) / 2.0
    pixel_scale = (RENDER_SIZE - 12.0) / extent

    texture = np.asarray(Image.open(texture_path).convert("RGBA"), dtype=np.uint8)
    texture_height, texture_width = texture.shape[:2]
    canvas = np.zeros((RENDER_SIZE, RENDER_SIZE, 4), dtype=np.uint8)
    depth = np.full((RENDER_SIZE, RENDER_SIZE), -np.inf, dtype=np.float64)

    for polygon in faces:
        for index in range(1, len(polygon) - 1):
            vertices = polygon[[0, index, index + 1]]
            xyz = vertices[:, :3]
            tri = np.column_stack((xyz @ right, xyz @ down, xyz @ view))
            tri[:, :2] = (tri[:, :2] - center) * pixel_scale + RENDER_SIZE / 2.0
            a, b, c = tri
            denominator = ((b[1] - c[1]) * (a[0] - c[0])
                           + (c[0] - b[0]) * (a[1] - c[1]))
            if abs(denominator) < 1e-10:
                continue
            x0, y0 = np.maximum(0, np.floor(tri[:, :2].min(axis=0))).astype(int)
            x1, y1 = np.minimum(RENDER_SIZE - 1, np.ceil(tri[:, :2].max(axis=0))).astype(int)
            yy, xx = np.mgrid[y0:y1 + 1, x0:x1 + 1]
            wa = ((b[1] - c[1]) * (xx + 0.5 - c[0])
                  + (c[0] - b[0]) * (yy + 0.5 - c[1])) / denominator
            wb = ((c[1] - a[1]) * (xx + 0.5 - c[0])
                  + (a[0] - c[0]) * (yy + 0.5 - c[1])) / denominator
            wc = 1.0 - wa - wb
            z = wa * a[2] + wb * b[2] + wc * c[2]

            q = wa * vertices[0, 5] + wb * vertices[1, 5] + wc * vertices[2, 5]
            q = np.where(np.abs(q) < 1e-10, 1.0, q)
            u = (wa * vertices[0, 3] + wb * vertices[1, 3] + wc * vertices[2, 3]) / q
            v = (wa * vertices[0, 4] + wb * vertices[1, 4] + wc * vertices[2, 4]) / q
            tx = np.clip((u * texture_width).astype(int), 0, texture_width - 1)
            ty = np.clip((v * texture_height).astype(int), 0, texture_height - 1)
            color = texture[ty, tx].copy()

            normal = np.cross(xyz[1] - xyz[0], xyz[2] - xyz[0])
            length = np.linalg.norm(normal)
            if length > 1e-10:
                normal /= length
            shade = 0.62 + 0.38 * abs(float(np.dot(normal, view)))
            color[..., :3] = np.clip(color[..., :3] * shade, 0, 255).astype(np.uint8)
            visible = ((wa >= -1e-6) & (wb >= -1e-6) & (wc >= -1e-6)
                       & (z > depth[yy, xx]) & (color[..., 3] > 8))
            canvas[yy[visible], xx[visible]] = color[visible]
            depth[yy[visible], xx[visible]] = z[visible]

    image = Image.fromarray(canvas, "RGBA").resize((32, 32), Image.Resampling.LANCZOS)
    if image.getbbox() is None:
        raise ValueError(f"Rendered icon is empty: {output_path.name}")
    output_path.parent.mkdir(parents=True, exist_ok=True)
    image.save(output_path, optimize=True)


def main():
    for name in NAMES:
        render_icon(read_mesh(MESHES / f"{name}.mesh"), SKINS / f"{name}.png",
                    ITEMS / f"{name}.png")
    RUNTIME_ITEMS.mkdir(parents=True, exist_ok=True)
    for name in NAMES:
        shutil.copyfile(ITEMS / f"{name}.png", RUNTIME_ITEMS / f"{name}.png")
    print(f"Rendered and assigned {len(NAMES)} Star Wars gun icons at 32x32.")


if __name__ == "__main__":
    main()
