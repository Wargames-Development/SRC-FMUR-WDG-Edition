"""Export the BFMC M240B remodel with Blender's bundled Python.

Run with --install to refresh the M240 assets in the workspace pack.
"""

from argparse import ArgumentParser
from collections import defaultdict
from math import cos, sin, tau
from pathlib import Path
import shutil

import numpy as np
import OpenImageIO as oiio


ROOT = Path(__file__).resolve().parents[1]
DONOR = ROOT / "development_assets/sketchfab_guns/game_ready/M240"
OUTPUT = ROOT / "development_assets/m240"
FLAN = ROOT / "eclipse/Flan"
PACK = FLAN / "BFMC Gun Pack"
PARTS = ("", "_magazine", "_muzzle")
SCALE = 1.2
DONOR_MUZZLE_CUT = 8.35315
TILE = 32
SIZE = 128
PALETTE = {
    "receiver": (60, 62, 63), "steel": (53, 55, 56), "cover": (46, 48, 49),
    "polymer": (41, 42, 40), "machined": (76, 77, 76), "pin": (69, 71, 70),
    "rail": (57, 59, 59), "recess": (31, 33, 33),
    "canvas": (72, 80, 50), "seam": (54, 61, 40), "lid": (84, 91, 61),
    "webbing": (95, 99, 67), "brass": (132, 111, 65), "tip": (112, 78, 52),
    "sight paint": (241, 240, 235),
}


def donor_groups():
    vertices, normals = [], []
    groups = defaultdict(list)
    for line in (DONOR / "M240.obj").read_text().splitlines():
        kind, *values = line.split()
        if kind == "v":
            vertices.append(tuple(map(float, values)))
        elif kind == "vn":
            x, y, z = map(float, values)
            normals.append((x, -y, z))
        elif kind == "g":
            group = int(values[0].split("_")[1])
        elif kind == "f":
            indices = [corner.split("/") for corner in values]
            face = np.array([vertices[int(v) - 1] for v, _, _ in indices])
            normal = np.cross(face[1] - face[0], face[2] - face[0])
            if normal @ np.mean([normals[int(n) - 1] for _, _, n in indices], axis=0) < 0:
                face = face[[0, 2, 1]]
            groups[group].append(face)
    return groups


def shells(faces):
    # Join vertices by shared edges across the duplicated OBJ vertices in each material.
    edges = defaultdict(list)
    face_edges = []
    for i, face in enumerate(np.round(faces, 4)):
        a, b, c = map(tuple, face)
        keys = [tuple(sorted(edge)) for edge in ((a, b), (b, c), (c, a))]
        face_edges.append(keys)
        for key in keys:
            edges[key].append(i)
    pending = set(range(len(faces)))
    for i in range(len(faces)):
        if i not in pending:
            continue
        queue = [i]
        pending.remove(i)
        for j in queue:
            for edge in face_edges[j]:
                for neighbor in edges[edge]:
                    if neighbor in pending:
                        pending.remove(neighbor)
                        queue.append(neighbor)
        yield np.array([faces[j] for j in queue])


def polygon(mesh, material, points):
    for i in range(1, len(points) - 1):
        mesh.append((material, np.array([points[0], points[i], points[i + 1]])))


def bridge(mesh, material, a, b):
    for i in range(len(a)):
        j = (i + 1) % len(a)
        polygon(mesh, material, (a[i], a[j], b[j], b[i]))


def prism(mesh, material, x0, x1, yz):
    a = [(x0, y, z) for y, z in yz]
    b = [(x1, y, z) for y, z in yz]
    bridge(mesh, material, a, b)
    polygon(mesh, material, a[::-1])
    polygon(mesh, material, b)


def box(mesh, material, x0, x1, y0, y1, z0, z1, bevel=.06):
    prism(mesh, material, x0, x1, (
        (y0 + bevel, z0), (y1 - bevel, z0), (y1, z0 + bevel), (y1, z1 - bevel),
        (y1 - bevel, z1), (y0 + bevel, z1), (y0, z1 - bevel), (y0, z0 + bevel)))


def circle(y, z, radius):
    return [(y + radius * cos(tau * i / 12), z + radius * sin(tau * i / 12))
            for i in range(12)]


def clip_at_muzzle(face):
    # Some donor triangles run through the muzzle device into the barrel.
    cut = DONOR_MUZZLE_CUT
    points = []
    for a, b in zip(face, np.roll(face, -1, axis=0)):
        if a[0] <= cut:
            points.append(a)
        if (a[0] <= cut) != (b[0] <= cut):
            points.append(a + (b - a) * ((cut - a[0]) / (b[0] - a[0])))
    return np.array(points)


def paint_sights(mesh):
    # Match the rear-facing planes of the aperture and blade in pack units.
    for x, y, z, half_height, half_width in (
        (-4.288, 8.013, -.069, .017, .013),
        (-4.288, 8.013, .069, .017, .013),
        (15.880, 7.984, 0, .030, .040),
    ):
        polygon(mesh, "sight paint", (
            (x, y - half_height, z - half_width), (x, y - half_height, z + half_width),
            (x, y + half_height, z + half_width), (x, y + half_height, z - half_width)))


def body():
    mesh = []
    materials = ("receiver", "steel", "cover", "steel", "machined", "pin")
    for group, faces in donor_groups().items():
        for shell in shells(faces):
            low = shell.min(axis=(0, 1))
            high = shell.max(axis=(0, 1))
            material = materials[group]
            if group == 3 and (high[0] < -3.4 or high[2] < -.39 and low[1] > 1.4):
                material = "polymer"
            if group == 3 and 1.4 < low[0] < 1.5 and low[1] > .8:
                material = "cover"
            # Replace the cover's narrow rail teeth and separate the muzzle at its collar.
            if group == 2 and -3.7 < low[0] and high[0] < -.10 and low[1] > 1.696:
                continue
            if group == 0 and 7.5 < low[0] and high[0] < 7.9:
                # The donor blade is subpixel in ADS. Widen its tip to fit the paint.
                blade = (shell[:, :, 1] > 1.76) & (abs(shell[:, :, 2]) < .01)
                shell[:, :, 2][blade] *= 3.2
            for face in shell:
                if high[0] > DONOR_MUZZLE_CUT:
                    face = clip_at_muzzle(face)
                if len(face) >= 3:
                    polygon(mesh, material, face * (1.625, 1.82, 1.60) + (3.4, 4.65, 0))
    prism(mesh, "rail", -2.54, 3.15, ((7.69, -.42), (7.78, -.42),
          (7.78, .42), (7.69, .42), (7.65, .26), (7.65, -.26)))
    for x in np.linspace(-2.49, 2.88, 13):
        prism(mesh, "rail", x, x + .26, ((7.77, -.43), (7.86, -.61),
              (7.93, -.49), (7.93, .49), (7.86, .61), (7.77, .43)))
    # Back the ejection recess and give the feed box a visible seat on the left.
    box(mesh, "recess", .48, 3.56, 6.26, 7.20, -.21, .13)
    box(mesh, "steel", -.66, 2.75, 5.42, 5.92, -1.03, -.33)
    paint_sights(mesh)
    return mesh


def magazine():
    mesh = []
    box(mesh, "canvas", -.96, 3.13, 1.10, 5.23, -3.12, -.96, .22)
    box(mesh, "seam", -.99, 3.17, 1.02, 1.34, -3.15, -.93, .12)
    box(mesh, "lid", -1.05, 3.23, 4.86, 5.44, -3.19, -.86, .13)
    for x in (-.72, 2.65):
        box(mesh, "webbing", x, x + .25, 1.36, 4.92, -3.19, -3.08, .04)
    box(mesh, "seam", .36, 1.77, 3.57, 4.32, -3.19, -3.08, .05)
    box(mesh, "steel", -.57, 2.53, 5.33, 5.72, -1.65, -.65)
    for i, (y, z) in enumerate(((5.57, -2.76), (5.70, -2.41), (5.86, -2.07),
                               (6.04, -1.72), (6.20, -1.38), (6.34, -1.03),
                               (6.46, -.68))):
        x = .04 + i * .045
        prism(mesh, "brass", x, x + .99, circle(y, z, .13))
        prism(mesh, "tip", x + .985, x + 1.32, circle(y, z, .085))
        box(mesh, "steel", x + .20, x + .49, y - .16, y + .16, z - .21, z + .17, .065)
    return mesh


def muzzle():
    mesh = []
    axis = 4.65 + 1.82 * 1.1305
    rings = [[(x, y, z) for y, z in circle(axis, 0, radius)]
             for x, radius in ((16.96, .28), (17.19, .33), (17.86, .31),
                               (18.025, .245), (18.025, .125), (17.27, .125))]
    for i, (a, b) in enumerate(zip(rings, rings[1:])):
        bridge(mesh, "recess" if i == 4 else "steel", a, b)
    polygon(mesh, "recess", rings[-1])
    for angle in (0, tau / 3, 2 * tau / 3):
        yz = [(axis + r * cos(angle + spread), r * sin(angle + spread))
              for r, spread in ((.29, -.13), (.35, -.13), (.35, .13), (.29, .13))]
        prism(mesh, "machined", 17.30, 17.83, yz)
    return mesh


def export(suffix, mesh):
    lines, faces, vertices, seen = ["# M240B BFMC remodel. See ATTRIBUTION.txt."], [], {}, set()
    for material, points in mesh:
        normal = np.cross(points[1] - points[0], points[2] - points[0])
        magnitude = np.linalg.norm(normal)
        key = tuple(sorted(map(tuple, points.round(5))))
        if magnitude < 1e-7 or key in seen:
            continue
        seen.add(key)
        normal /= magnitude
        tile = list(PALETTE).index(material)
        axes = np.sort(np.argsort(np.abs(normal))[:2])
        uv = ((points[:, axes] + np.array((12, 1, 4))[axes]) / 5) % 1
        uv = (uv * (TILE - 8) + (tile % 4 * TILE + 4, tile // 4 * TILE + 4)) / SIZE
        refs = []
        for point, (u, v) in zip(points / SCALE, uv):
            # The legacy loader flips V and swaps position and normal axes differently.
            vertex = (*point, u, 1 - v, normal[0], -normal[1], normal[2])
            key = tuple(round(n, 6) for n in vertex)
            if key not in vertices:
                vertices[key] = len(vertices) + 1
                lines.extend(("v %.6f %.6f %.6f" % key[:3], "vt %.6f %.6f" % key[3:5],
                              "vn %.6f %.6f %.6f" % key[5:]))
            index = vertices[key]
            refs.append(f"{index}/{index}/{index}")
        faces.append("f " + " ".join(refs))
    (OUTPUT / f"M240{suffix}.obj").write_text("\n".join(lines + faces) + "\n",
                                             encoding="ascii", newline="\n")
    print(f"M240{suffix}: {len(faces)} triangles")


def atlas():
    pixels = np.zeros((SIZE, SIZE, 3), dtype=np.uint8)
    rng = np.random.default_rng(240)
    y, x = np.mgrid[:TILE, :TILE]
    for i, (material, rgb) in enumerate(PALETTE.items()):
        col, row = i % 4 * TILE, i // 4 * TILE
        tone = 2 * np.cos(x * tau / TILE) + 2 * np.sin(y * tau / TILE)
        tone += rng.integers(-1, 2, (TILE, TILE))
        if material in ("canvas", "seam", "lid", "webbing"):
            tone += 3 * np.cos(x * tau / 4) + 2 * np.sin(y * tau / 4)
        pixels[row:row + TILE, col:col + TILE] = np.clip(rgb + tone[..., None], 0, 255)
    image = oiio.ImageBuf(oiio.ImageSpec(SIZE, SIZE, 3, oiio.UINT8))
    image.set_pixels(oiio.ROI(0, SIZE, 0, SIZE, 0, 1, 0, 3), pixels)
    if not image.write(str(OUTPUT / "M240.png")):
        raise RuntimeError(image.geterror())


def install():
    for suffix in PARTS:
        name = f"M240{suffix}.obj"
        shutil.copy2(OUTPUT / name, FLAN / "BFMCpack" / name)
    shutil.copy2(OUTPUT / "M240.png", PACK / "assets/flansmod/skins/M240.png")
    shutil.copy2(OUTPUT / "ATTRIBUTION.txt", PACK / "licenses/Sketchfab/M240.txt")


if __name__ == "__main__":
    parser = ArgumentParser(description=__doc__)
    parser.add_argument("--install", action="store_true")
    args = parser.parse_args()
    OUTPUT.mkdir(parents=True, exist_ok=True)
    for suffix, mesh in zip(PARTS, (body(), magazine(), muzzle())):
        export(suffix, mesh)
    atlas()
    if args.install:
        install()
