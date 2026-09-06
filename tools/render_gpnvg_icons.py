"""Render the four GPNVG-18 inventory icons from the runtime OBJ geometry."""

from pathlib import Path

import numpy as np
from PIL import Image


ROOT = Path(__file__).resolve().parents[1]
ASSETS = ROOT / "src" / "main" / "resources" / "assets" / "flansmod"
MODEL_DIR = ASSETS / "models" / "gpnvg"
ITEM_DIR = ASSETS / "textures" / "items"
SIZE = 128

VARIANTS = {
    "gpnvg": "GPNVG_1.png",
    "gpnvg_wp": "GPNVG_WP_1.png",
    "gpnvg_black": "GPNVG_BLACK_1.png",
    "gpnvg_wp_black": "GPNVG_WP_BLACK_1.png",
}


def parse_obj(path):
    vertices = []
    uvs = []
    normals = []
    faces = []
    for line in path.read_text(encoding="utf-8").splitlines():
        fields = line.split()
        if not fields:
            continue
        if fields[0] == "v":
            vertices.append([float(value) for value in fields[1:4]])
        elif fields[0] == "vt":
            uvs.append([float(value) for value in fields[1:3]])
        elif fields[0] == "vn":
            normals.append([float(value) for value in fields[1:4]])
        elif fields[0] == "f":
            refs = [[int(value) - 1 for value in ref.split("/")] for ref in fields[1:]]
            for index in range(1, len(refs) - 1):
                faces.append([refs[0], refs[index], refs[index + 1]])
    if not vertices or not faces:
        raise ValueError(f"OBJ has no renderable geometry: {path}")
    return (np.asarray(vertices, dtype=np.float64),
            np.asarray(uvs, dtype=np.float64),
            np.asarray(normals, dtype=np.float64), faces)


def combine_models(paths):
    vertices = []
    uvs = []
    normals = []
    faces = []
    for path in paths:
        model_vertices, model_uvs, model_normals, model_faces = parse_obj(path)
        vertex_offset = sum(len(group) for group in vertices)
        uv_offset = sum(len(group) for group in uvs)
        normal_offset = sum(len(group) for group in normals)
        vertices.append(model_vertices)
        uvs.append(model_uvs)
        normals.append(model_normals)
        for face in model_faces:
            faces.append([[ref[0] + vertex_offset, ref[1] + uv_offset, ref[2] + normal_offset]
                          for ref in face])
    return np.concatenate(vertices), np.concatenate(uvs), np.concatenate(normals), faces


def render(vertices, uvs, normals, faces, texture_path, output_path):
    # The GPNVG faces +X. Keep the camera close to that axis so its four
    # separate tubes remain readable after the render is reduced to 32x32.
    right = np.array([0.30, 0.0, -0.954], dtype=np.float64)
    right /= np.linalg.norm(right)
    view = np.array([0.934, 0.20, 0.294], dtype=np.float64)
    view /= np.linalg.norm(view)
    up = np.cross(view, right)
    up /= np.linalg.norm(up)

    points = np.column_stack((vertices @ right, -vertices @ up, vertices @ view))
    low = points[:, :2].min(axis=0)
    high = points[:, :2].max(axis=0)
    points[:, :2] = ((points[:, :2] - (low + high) / 2.0)
                     * ((SIZE - 12.0) / max(high - low)) + SIZE / 2.0)

    texture = np.asarray(Image.open(texture_path).convert("RGBA"), dtype=np.uint8)
    texture_height, texture_width = texture.shape[:2]
    canvas = np.zeros((SIZE, SIZE, 4), dtype=np.uint8)
    depth = np.full((SIZE, SIZE), -np.inf, dtype=np.float64)

    for face in faces:
        tri = points[[ref[0] for ref in face]]
        tex = uvs[[ref[1] for ref in face]]
        a, b, c = tri
        denominator = ((b[1] - c[1]) * (a[0] - c[0])
                       + (c[0] - b[0]) * (a[1] - c[1]))
        if abs(denominator) < 1e-10:
            continue
        x0, y0 = np.maximum(0, np.floor(tri[:, :2].min(axis=0))).astype(int)
        x1, y1 = np.minimum(SIZE - 1, np.ceil(tri[:, :2].max(axis=0))).astype(int)
        yy, xx = np.mgrid[y0:y1 + 1, x0:x1 + 1]
        wa = ((b[1] - c[1]) * (xx + 0.5 - c[0])
              + (c[0] - b[0]) * (yy + 0.5 - c[1])) / denominator
        wb = ((c[1] - a[1]) * (xx + 0.5 - c[0])
              + (a[0] - c[0]) * (yy + 0.5 - c[1])) / denominator
        wc = 1.0 - wa - wb
        z = wa * a[2] + wb * b[2] + wc * c[2]
        uv = wa[..., None] * tex[0] + wb[..., None] * tex[1] + wc[..., None] * tex[2]
        tx = np.clip((uv[..., 0] * texture_width).astype(int), 0, texture_width - 1)
        ty = np.clip(((1.0 - uv[..., 1]) * texture_height).astype(int), 0, texture_height - 1)
        color = texture[ty, tx].copy()

        normal = normals[face[0][2]]
        shade = 0.65 + 0.35 * abs(float(np.dot(normal, view)))
        color[..., :3] = np.clip(color[..., :3] * shade, 0, 255).astype(np.uint8)
        visible = ((wa >= -1e-6) & (wb >= -1e-6) & (wc >= -1e-6)
                   & (z > depth[yy, xx]) & (color[..., 3] > 0))
        canvas[yy[visible], xx[visible]] = color[visible]
        depth[yy[visible], xx[visible]] = z[visible]

    image = Image.fromarray(canvas, "RGBA").resize((32, 32), Image.Resampling.LANCZOS)
    if image.getbbox() is None:
        raise ValueError(f"Rendered icon is empty: {output_path.name}")
    image.save(output_path, optimize=True)


def main():
    geometry = combine_models([
        MODEL_DIR / "GPNVG_Mount_runtime.obj",
        MODEL_DIR / "GPNVG_Flip_runtime.obj",
    ])
    for icon_name, armor_texture in VARIANTS.items():
        render(*geometry, ASSETS / "armor" / armor_texture, ITEM_DIR / f"{icon_name}.png")
    print("Rendered four GPNVG-18 inventory icons at 32x32.")


if __name__ == "__main__":
    main()
