"""Render 32x32 TaP-Escalation armor item icons from its compiled model geometry.

Run the Gradle geometry extraction task first:
  gradlew -I tools/tap_armor_icons.gradle extractTapArmorGeometry
"""

from pathlib import Path
import re
import shutil
import sys

import numpy as np
from PIL import Image


ROOT = Path(__file__).resolve().parents[1]
PACK = (ROOT / "eclipse" / "Flan" / "TaP-Escalation").resolve()
ARMOR_FILES = PACK / "armorFiles"
ARMOR_TEXTURES = PACK / "assets" / "flansmod" / "armor"
ITEM_TEXTURES = PACK / "assets" / "flansmod" / "textures" / "items"
MESHES = ROOT / "build" / "tap-armor-icons" / "meshes"
STAGING = ROOT / "build" / "tap-armor-icons" / "generated"
ICON_PREFIX = "taparmor_"
RENDER_SIZE = 128
FINAL_SIZE = 32

GROUP_OFFSETS = {
    "headModel": (0.0, 0.0, 0.0),
    "bodyModel": (0.0, 0.0, 0.0),
    "leftArmModel": (5.0, 2.0, 0.0),
    "rightArmModel": (-5.0, 2.0, 0.0),
    "leftLegModel": (1.9, 12.0, 0.0),
    "rightLegModel": (-1.9, 12.0, 0.0),
    "skirtFrontModel": (0.0, 12.0, 0.0),
    "skirtRearModel": (0.0, 12.0, 0.0),
}


def read_definition(path):
    text = path.read_text(encoding="utf-8")
    values = {}
    for line in text.splitlines():
        fields = line.strip().split(None, 1)
        if len(fields) == 2:
            values[fields[0]] = fields[1].strip()
    required = ("ShortName", "Model", "ArmourTexture", "Type")
    missing = [key for key in required if key not in values]
    if missing:
        raise ValueError(f"{path.name} is missing: {', '.join(missing)}")
    values["ModelScale"] = float(values.get("ModelScale", "1"))
    return text, values


def read_mesh(model_name):
    path = MESHES / (model_name.replace(".", "_") + ".mesh")
    if not path.is_file():
        raise FileNotFoundError(f"Missing extracted model: {path}")
    faces = []
    for line in path.read_text(encoding="utf-8").splitlines()[1:]:
        fields = line.split("\t")
        group = fields[0]
        vertices = np.array([[float(value) for value in vertex.split(",")]
                             for vertex in fields[1:]], dtype=np.float64)
        faces.append((group, vertices))
    if not faces:
        raise ValueError(f"Extracted model has no faces: {model_name}")
    return faces


def armor_texture(values):
    layer = "2" if values["Type"].lower() in ("legs", "pants") else "1"
    path = ARMOR_TEXTURES / f'{values["ArmourTexture"]}_{layer}.png'
    if not path.is_file():
        raise FileNotFoundError(f"Missing armor texture: {path}")
    return path


def transformed_faces(faces, scale):
    result = []
    all_points = []
    for group, vertices in faces:
        vertices = vertices.copy()
        vertices[:, :3] *= scale
        vertices[:, :3] += np.asarray(GROUP_OFFSETS[group], dtype=np.float64)
        result.append(vertices)
        all_points.append(vertices[:, :3])
    return result, np.concatenate(all_points, axis=0)


def render_icon(faces, model_scale, texture_path, output_path):
    faces, all_points = transformed_faces(faces, model_scale)

    right = np.array([0.65, 0.0, -0.76], dtype=np.float64)
    right /= np.linalg.norm(right)
    view = np.array([0.76, -0.18, 0.65], dtype=np.float64)
    view /= np.linalg.norm(view)
    down = np.cross(view, right)
    down /= np.linalg.norm(down)

    projected_bounds = np.column_stack((all_points @ right, all_points @ down))
    low = projected_bounds.min(axis=0)
    high = projected_bounds.max(axis=0)
    extent = max(high - low)
    if extent <= 0:
        raise ValueError(f"Degenerate geometry for {output_path.name}")
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
            if x0 > x1 or y0 > y1:
                continue
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

            edge_a = xyz[1] - xyz[0]
            edge_b = xyz[2] - xyz[0]
            normal = np.cross(edge_a, edge_b)
            length = np.linalg.norm(normal)
            if length > 1e-10:
                normal /= length
            shade = 0.62 + 0.38 * abs(float(np.dot(normal, view)))
            color[..., :3] = np.clip(color[..., :3] * shade, 0, 255).astype(np.uint8)

            visible = ((wa >= -1e-6) & (wb >= -1e-6) & (wc >= -1e-6)
                       & (z > depth[yy, xx]) & (color[..., 3] > 8))
            canvas[yy[visible], xx[visible]] = color[visible]
            depth[yy[visible], xx[visible]] = z[visible]

    image = Image.fromarray(canvas, "RGBA").resize(
        (FINAL_SIZE, FINAL_SIZE), Image.Resampling.LANCZOS)
    if image.getbbox() is None:
        raise ValueError(f"Rendered icon is empty: {output_path.name}")
    output_path.parent.mkdir(parents=True, exist_ok=True)
    image.save(output_path, optimize=True)


def replace_icon(text, icon_name, path):
    updated, count = re.subn(r"(?m)^Icon\s+.*$", f"Icon {icon_name}", text)
    if count != 1:
        raise ValueError(f"Expected one Icon line in {path.name}; found {count}")
    return updated


def main():
    if PACK.name != "TaP-Escalation" or not ARMOR_FILES.is_dir():
        raise RuntimeError(f"Refusing to modify a content pack other than TaP-Escalation: {PACK}")
    definitions = []
    for path in sorted(ARMOR_FILES.glob("*.txt")):
        text, values = read_definition(path)
        definitions.append((path, text, values))
    if not definitions:
        raise RuntimeError("No TaP armor definitions found")

    if STAGING.exists():
        shutil.rmtree(STAGING)
    STAGING.mkdir(parents=True)
    mesh_cache = {}
    planned = []
    for path, text, values in definitions:
        model_name = values["Model"]
        if model_name not in mesh_cache:
            mesh_cache[model_name] = read_mesh(model_name)
        faces = mesh_cache[model_name]
        icon_name = ICON_PREFIX + values["ShortName"]
        staged_icon = STAGING / (icon_name + ".png")
        render_icon(faces, values["ModelScale"], armor_texture(values), staged_icon)
        planned.append((path, replace_icon(text, icon_name, path), staged_icon))

    if len({item[2].name for item in planned}) != len(planned):
        raise RuntimeError("Generated icon names are not unique")
    ITEM_TEXTURES.mkdir(parents=True, exist_ok=True)
    for path, updated_text, staged_icon in planned:
        shutil.copyfile(staged_icon, ITEM_TEXTURES / staged_icon.name)
        path.write_text(updated_text, encoding="utf-8")

    print(f"Rendered and assigned {len(planned)} TaP-Escalation armor icons at 32x32.")


if __name__ == "__main__":
    try:
        main()
    except Exception as error:
        print(f"ERROR: {error}", file=sys.stderr)
        raise
