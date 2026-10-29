"""Convert the six credited Sketchfab glTF archives to legacy FMUR OBJ assets."""

import io
from collections import defaultdict
from pathlib import Path

import numpy as np
from PIL import Image, ImageDraw

from inspect_sketchfab_guns import load_archive, scene_meshes


ROOT = Path(__file__).resolve().parents[1]
OUTPUT = ROOT / "development_assets" / "sketchfab_guns" / "game_ready"
GUNS = [
    ("hs_produkt_vhs-2_rifle", "VHS2", 16.0, (2, 1, 0), (-1, 1, 1)),
    ("low-poly_m1911", "M1911", 9.0, (1, 2, 0), (-1, -1, 1)),
    ("low-poly_dragunov_svd", "DragunovSVD", 17.0, (2, 1, 0), (-1, 1, 1)),
    ("low-poly_ak-308", "AK308", 16.0, (1, 2, 0), (-1, -1, 1)),
    ("m240_low-poly", "M240", 18.0, (2, 1, 0), (1, 1, 1)),
    ("barrett_ssrs", "BarrettSSRS", 17.0, (2, 0, 1), (-1, -1, 1)),
]

# Existing tan texel in the VHS-2 source atlas, defined by the first mesh.
VHS2_STOCK_TAN_UV = 470


def smooth_stock_normals(positions, normals, triangles):
    adjacent = defaultdict(list)
    for triangle in triangles:
        a, b, c = (int(index) for index in triangle)
        points = positions[[a, b, c]]
        weighted = np.cross(points[1] - points[0], points[2] - points[0])
        area = np.linalg.norm(weighted)
        if area < 1e-10:
            continue
        face_normal = weighted / area
        if np.dot(face_normal, normals[[a, b, c]].mean(axis=0)) < 0:
            face_normal = -face_normal
        for index in (a, b, c):
            adjacent[tuple(np.round(positions[index], 6))].append((face_normal, area))

    result = normals.copy()
    for index, original in enumerate(normals):
        total = np.zeros(3)
        for face_normal, area in adjacent[tuple(np.round(positions[index], 6))]:
            # Keep corners sharper than 55 degrees separate.
            if np.dot(face_normal, original) > 0.574:
                total += face_normal * area
        length = np.linalg.norm(total)
        if length > 1e-10:
            result[index] = total / length
    return result


def srgb(value):
    return int(round(255 * (12.92 * value if value <= 0.0031308
                            else 1.055 * value ** (1 / 2.4) - 0.055)))


def make_atlas(archive, gltf):
    textures = {}
    for i, material in enumerate(gltf.get("materials", [])):
        pbr = material.get("pbrMetallicRoughness", {})
        info = pbr.get("baseColorTexture")
        if info is None:
            continue
        texture = gltf["textures"][info["index"]]
        image = gltf["images"][texture["source"]]
        if "uri" in image:
            data = archive.read(image["uri"])
        else:
            view = gltf["bufferViews"][image["bufferView"]]
            binary = archive.read("scene.bin")
            start = view.get("byteOffset", 0)
            data = binary[start:start + view["byteLength"]]
        textures[i] = Image.open(io.BytesIO(data)).convert("RGBA")
    if textures:
        # The textured source models each use one base-color image.
        atlas = next(iter(textures.values()))
        if max(atlas.size) > 2048:
            atlas.thumbnail((2048, 2048), Image.Resampling.LANCZOS)
        return atlas, False

    materials = gltf.get("materials", [])
    cols = 4
    rows = max(1, (len(materials) + cols - 1) // cols)
    atlas = Image.new("RGBA", (cols * 32, rows * 32), (255, 255, 255, 255))
    draw = ImageDraw.Draw(atlas)
    for i, material in enumerate(materials):
        factors = material.get("pbrMetallicRoughness", {}).get("baseColorFactor", [1, 1, 1, 1])
        color = tuple(srgb(float(channel)) for channel in factors[:3]) + (255,)
        x, y = (i % cols) * 32, (i // cols) * 32
        draw.rectangle((x, y, x + 31, y + 31), fill=color)
    return atlas, True


def append_box(lines, offset, lower, upper, uv):
    x0, y0, z0 = lower
    x1, y1, z1 = upper
    corners = [(x0, y0, z0), (x1, y0, z0), (x1, y1, z0), (x0, y1, z0),
               (x0, y0, z1), (x1, y0, z1), (x1, y1, z1), (x0, y1, z1)]
    surfaces = [(0, 1, 2, 3), (5, 4, 7, 6), (4, 0, 3, 7),
                (1, 5, 6, 2), (4, 5, 1, 0), (3, 2, 6, 7)]
    for surface in surfaces:
        vertices = np.array([corners[i] for i in surface])
        normal = np.cross(vertices[1] - vertices[0], vertices[2] - vertices[0])
        normal /= np.linalg.norm(normal)
        for x, y, z in vertices:
            lines.append("v %.6f %.6f %.6f" % (x, y, z))
            lines.append("vt %.6f %.6f" % uv)
            lines.append("vn %.6f %.6f %.6f" % (normal[0], -normal[1], normal[2]))
        a = offset + 1
        lines.append("f " + " ".join("{0}/{0}/{0}".format(i)
                     for i in (a, a + 1, a + 2)))
        lines.append("f " + " ".join("{0}/{0}/{0}".format(i)
                     for i in (a, a + 2, a + 3)))
        offset += 4
    return offset


def make_m240_magazine():
    lines = ["# Side-mounted M240 ammunition box, inspired by the M60 feed box", "g Magazine"]
    offset = append_box(lines, 0, (-1.15, -0.55, -2.15),
                        (1.25, 0.55, -1.0), (0.125, 0.75))
    offset = append_box(lines, offset, (-1.3, 0.55, -2.25),
                        (1.4, 0.72, -0.92), (0.125, 0.75))
    # Stamped side ribs, hinge, latch and feed bridge make the box readable in third person.
    for x in (-0.9, -0.35, 0.2, 0.75):
        offset = append_box(lines, offset, (x, -0.45, -2.22),
                            (x + 0.1, 0.45, -2.15), (0.125, 0.75))
    offset = append_box(lines, offset, (-0.8, -0.05, -1.05),
                        (0.7, 0.32, -0.65), (0.125, 0.75))
    offset = append_box(lines, offset, (-0.12, 0.72, -1.82),
                        (0.25, 0.86, -1.45), (0.125, 0.75))
    append_box(lines, offset, (-1.3, 0.18, -1.95),
               (-1.12, 0.52, -1.25), (0.125, 0.75))
    return lines


def convert(spec):
    archive_name, name, length, axes, signs = spec
    archive, gltf, binary = load_archive(archive_name)
    meshes = list(scene_meshes(gltf, binary))
    atlas, palette = make_atlas(archive, gltf)
    destination = OUTPUT / name
    destination.mkdir(parents=True, exist_ok=True)
    (destination / "license.txt").write_bytes(archive.read("license.txt"))
    atlas.save(destination / (name + ".png"))

    matrix = np.zeros((3, 3))
    for target, (source, sign) in enumerate(zip(axes, signs)):
        matrix[target, source] = sign
    coordinates = [pos @ matrix.T for _, _, pos, _, _, _ in meshes]
    bounds = np.concatenate(coordinates)
    center = (bounds.min(axis=0) + bounds.max(axis=0)) / 2
    scale = length / np.ptp(bounds[:, 0])
    # A small downward bias seats the receiver above the grip when aimed.
    center[1] -= np.ptp(bounds[:, 1]) * 0.08

    lines = ["# Converted from %s; attribution in license.txt" % archive_name]
    magazine_lines = list(lines)
    has_magazine = True
    projected = []
    offset = 0
    for mesh_index, (mesh, positions) in enumerate(zip(meshes, coordinates)):
        mesh_name, material, _, normals, uv, triangles = mesh
        positions = (positions - center) * scale
        if normals is None:
            normals = np.zeros_like(positions)
            for triangle in triangles:
                a, b, c = positions[triangle]
                normal = np.cross(b - a, c - a)
                normals[triangle] += normal
            norms = np.linalg.norm(normals, axis=1)
            normals /= np.maximum(norms[:, None], 1e-10)
        else:
            normals = normals @ matrix.T
        surface_normals = normals
        if name == "VHS2" and mesh_name.startswith(
                ("StockFront_", "StockBottom_", "StockAdjuster_", "Cheekrest_")):
            normals = smooth_stock_normals(positions, normals, triangles)
        if palette:
            columns = atlas.width // 32
            u = ((material % columns) * 32 + 16) / atlas.width
            v = ((material // columns) * 32 + 16) / atlas.height
            uv = np.tile([u, v], (len(positions), 1))
        elif uv is None:
            uv = np.tile([0.5, 0.5], (len(positions), 1))

        geometry = ["g " + mesh_name.replace(" ", "_")]
        for x, y, z in positions:
            geometry.append("v %.6f %.6f %.6f" % (x, y, z))
        for u, v in uv:
            geometry.append("vt %.6f %.6f" % (u % 1.0, 1.0 - v % 1.0))
        for nx, ny, nz in normals:
            # TMT's OBJ normal transform differs from its vertex transform.
            geometry.append("vn %.6f %.6f %.6f" % (nx, -ny, nz))
        lines.extend(geometry)
        if has_magazine:
            magazine_lines.extend(geometry)
        for triangle in triangles:
            a, b, c = [int(value) for value in triangle]
            face_normal = np.cross(positions[b] - positions[a], positions[c] - positions[a])
            if np.dot(face_normal, normals[[a, b, c]].mean(axis=0)) < 0:
                b, c = c, b
            points = positions[[a, b, c]]
            face_center = points.mean(axis=0)
            side = abs(surface_normals[[a, b, c], 2].mean()) > 0.75
            stock_shell = (name == "VHS2" and side and
                           ((mesh_name.startswith("Body_") and
                             face_center[0] < -4.4 and face_center[1] > 1.45 and
                             abs(face_center[2]) > 0.2) or
                            (mesh_name.startswith("StockFront_") and
                             abs(face_center[2]) > 0.25 and
                             (face_center[0] < -6.2 or face_center[1] > 1.65)) or
                            (mesh_name.startswith("StockBottom_") and
                             abs(face_center[2]) > 0.16) or
                            (mesh_name.startswith("StockAdjuster_") and
                             abs(face_center[2]) > 0.08) or
                            (mesh_name.startswith("Cheekrest_") and
                             abs(face_center[2]) > 0.25)))
            face = "f " + " ".join("{0}/{1}/{0}".format(
                offset + index + 1,
                VHS2_STOCK_TAN_UV if stock_shell else offset + index + 1)
                for index in (a, b, c))
            is_magazine = ((name == "VHS2" and mesh_name.startswith("Magazine_"))
                           or (name == "DragunovSVD" and mesh_index == 6)
                           or (name == "BarrettSSRS" and mesh_index == 12)
                           or (name == "AK308" and -1.6 < positions[[a, b, c], 0].mean() < 0.7
                               and positions[[a, b, c], 1].mean() < 0.35))
            (magazine_lines if is_magazine else lines).append(face)
            tex = uv[[a, b, c]].mean(axis=0)
            color = atlas.getpixel((min(atlas.width - 1, int(tex[0] * atlas.width)),
                                    min(atlas.height - 1, int(tex[1] * atlas.height))))
            projected.append((points[:, :2], points[:, 2].mean(), color))
        offset += len(positions)

    if name == "M1911":
        # The supplied pistol has no distinct magazine mesh; a slim steel insert
        # sits inside the grip and becomes visible as it moves during reload.
        offset = append_box(magazine_lines, offset, (-3.65, -2.65, -0.28),
                            (-2.9, -0.6, 0.28), (0.125, 0.833333))
    if name == "M240":
        # The source is belt-fed but omits its detachable ammunition box.
        magazine_lines = make_m240_magazine()

    (destination / (name + ".obj")).write_text("\n".join(lines) + "\n", encoding="ascii")
    if has_magazine:
        (destination / (name + "_magazine.obj")).write_text(
            "\n".join(magazine_lines) + "\n", encoding="ascii")
    # Flat side render for the inventory icon; nearest triangles cover farther ones.
    canvas = Image.new("RGBA", (128, 128), (0, 0, 0, 0))
    draw = ImageDraw.Draw(canvas)
    all_xy = np.concatenate([item[0] for item in projected])
    extent = all_xy.max(axis=0) - all_xy.min(axis=0)
    icon_scale = min(116 / max(extent[0], 1e-6), 104 / max(extent[1], 1e-6))
    origin = (all_xy.min(axis=0) + all_xy.max(axis=0)) / 2
    for points, depth, color in sorted(projected, key=lambda item: item[1]):
        pixels = [((x - origin[0]) * icon_scale + 64,
                   64 - (y - origin[1]) * icon_scale) for x, y in points]
        draw.polygon(pixels, fill=color)
    canvas.save(destination / (name + "Icon.png"))
    print(name, "vertices", offset, "faces", len(projected), "atlas", atlas.size,
          "bounds", np.round((bounds.max(axis=0) - bounds.min(axis=0)) * scale, 2))


if __name__ == "__main__":
    for specification in GUNS:
        convert(specification)
