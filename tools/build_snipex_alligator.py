"""Rebuild the credited Alligator OBJ assembly and its BFMC diffuse atlas.

Run with Python, NumPy and OpenImageIO. Pass --install for the eclipse/Flan
development pack. The original CC BY 4.0 source is in game_ready.
"""
import argparse
import re
import shutil
from pathlib import Path

import numpy as np
import OpenImageIO as oiio

from mg36.planar_cleanup import remove_overlaps

ROOT = Path(__file__).resolve().parents[1]
ASSET = ROOT / 'development_assets/snipex_alligator'
SOURCE = ASSET / 'game_ready'
OUT = ASSET / 'remodel'
FLAN = ROOT / 'eclipse/Flan'
PACK = FLAN / 'BFMC Gun Pack'
NAME = 'SnipexAlligator'
SUPPRESSOR = 'SnipexSuppressor'
PARTS = ('', '_Magazine', '_Bolt', '_Brake')
SCALE = 30
SOURCE_PIVOT = (.75, .15, 0)
SIZE, TILE = 512, 128
FINISH = {
    'cerakote': (163, 162, 123), 'suppressor': (120, 124, 97), 'polymer': (79, 83, 73),
    'rubber': (65, 68, 60), 'rail': (149, 150, 113), 'barrel': (152, 152, 114),
    'brake': (162, 159, 118), 'recess': (69, 71, 59), 'hardware': (106, 108, 90),
    'magazine': (57, 61, 59), 'floorplate': (50, 53, 51), 'bolt': (90, 92, 88),
    'brass': (121, 104, 70), 'copper': (110, 83, 67), 'primer': (94, 93, 86),
}
TILES = {name: (i % 4 * TILE, i // 4 * TILE) for i, name in enumerate(FINISH)}


def read_image(path):
    return oiio.ImageBuf(str(path)).get_pixels(oiio.UINT8)


def bake_atlas():
    rng = np.random.default_rng(145114)
    row, col = np.mgrid[:TILE, :TILE] / (TILE - 1)
    pixels = np.full((SIZE, SIZE, 3), 45, dtype=np.uint8)
    for name, rgb in FINISH.items():
        x, y = TILES[name]
        grain = rng.uniform(-1.2, 1.2, row.shape)
        shade = np.interp(row, (0, .14, .6, .88, 1), (-2, 2, 0, -3, -4))
        shade += 1.3 * np.sin(19 * col + 8 * row) * np.cos(11 * row - 7 * col)
        if name in ('barrel', 'bolt', 'brake', 'suppressor'):
            shade += .7 * np.sin(70 * row + col)
        if name in ('polymer', 'rubber'):
            grain *= 1.6
        if name == 'magazine':
            shade += np.interp(col, (0, .07, .15, .84, .94, 1), (-5, 1, 0, 0, 2, -5))
        pixels[y:y + TILE, x:x + TILE] = np.clip(np.asarray(rgb) + (grain + shade)[..., None], 0, 255)
    write_image(OUT / f'{NAME}.png', pixels)


def write_image(path, pixels):
    h, w, channels = pixels.shape
    image = oiio.ImageBuf(oiio.ImageSpec(w, h, channels, oiio.UINT8))
    image.set_pixels(oiio.ROI(0, w, 0, h, 0, 1, 0, channels), pixels)
    if not image.write(str(path)):
        raise OSError(image.geterror())


def read_obj(path):
    vertices, uvs, faces = [], [], []
    for line in path.read_text(encoding='utf-8').splitlines():
        if line.startswith('v '):
            vertices.append(tuple(map(float, line.split()[1:])))
        elif line.startswith('vt '):
            uvs.append(tuple(map(float, line.split()[1:])))
        elif line.startswith('f '):
            face = [tuple(int(i) - 1 for i in corner.split('/')[:2]) for corner in line.split()[1:]]
            assert len(face) == 3 and min(min(corner) for corner in face) >= 0
            faces.append(face)
    return (np.asarray(vertices) + SOURCE_PIVOT) * SCALE, np.asarray(uvs), np.asarray(faces)


def reshape(points):
    x, y, z = points.T
    # Size against the 35.31-unit M82A3, keeping the grip at x=4 and the long brake.
    rail = (x > 3) & (x < 17) & (y >= 7.513)
    brake = np.clip((x - 49.98) / .46, 0, 1)
    z *= 1.12 + .10 * brake
    z[:] -= np.sign(z) * np.maximum(abs(z) - 1, 0) * .20
    # The rail's narrow web is part of the original ventilated chassis.
    z[rail] = np.sign(z[rail]) * np.where(y[rail] > 7.60, .48, .60)
    y[:] += (y - 6.038) * .12 * brake
    x[:] = 4 + (x - 4) * .8 + np.maximum(x - 50, 0) * .15


def face_material(part, points, color):
    x, y, _ = points.mean(axis=0)
    if part == '_Bolt':
        return 'polymer' if color == 42 else 'bolt'
    if part == '_Magazine':
        return {39: 'magazine', 50: 'floorplate', 88: 'copper', 100: 'primer', 122: 'brass'}[color]
    if part == '_Brake':
        return 'recess' if x > 50 and abs(points[:, 2].mean()) < .49 else 'brake'
    if x > 25:
        return 'barrel'
    if 3 < x < 17 and y > 7.47:
        return 'rail'
    if x < -4.5 and color == 42:
        return 'rubber'
    return {39: 'recess', 42: 'polymer', 45: 'recess', 50: 'hardware',
            53: 'hardware', 67: 'cerakote'}[color]


def folded_bipod():
    # Stowed legs straddle the barrel support collar and fold towards the muzzle.
    def prism(x0, x1, y, z, height, width, bevel, material, drop=0):
        h, w = height / 2, width / 2
        section = ((-h, -w+bevel), (-h+bevel, -w), (h-bevel, -w), (h, -w+bevel),
                   (h, w-bevel), (h-bevel, w), (-h+bevel, w), (-h, w-bevel))
        rear = [(x0, y+a, z+b) for a, b in section]
        front = [(x1, y+a+drop, z+b) for a, b in section]
        u, v = TILES[material]
        for i in range(8):
            j = (i + 1) % 8
            quad = (rear[i], front[i], front[j], rear[j])
            corners = [(*p, (u+s)/SIZE, (v+t)/SIZE)
                       for p, (s, t) in zip(quad, ((8, 28), (120, 28), (120, 98), (8, 98)))]
            yield corners[0], corners[2], corners[1]
            yield corners[0], corners[3], corners[2]
        for cap in (rear[::-1], front):
            for i in range(1, 7):
                yield tuple((*p, (u+64)/SIZE, (v+64)/SIZE) for p in (cap[0], cap[i], cap[i+1]))

    yield from prism(23.55, 24.95, 5.16, 0, .65, 1.85, .16, 'barrel')
    for side in (-1, 1):
        yield from prism(24.08, 25.25, 4.99, side*.89, .62, .55, .11, 'barrel')
        yield from prism(24.95, 30.40, 4.90, side*1.03, .37, .43, .075, 'barrel', -.24)
        yield from prism(30.25, 31.24, 4.62, side*1.03, .51, .59, .10, 'rubber')


def build_part(part, old_atlas):
    source_part = '' if part == '_Brake' else part
    source, uv, faces = read_obj(SOURCE / f'{NAME}{source_part}.obj')
    if not source_part:
        # The brake overlaps the barrel spigot. Keep the spigot's front cap in the body.
        x = source[faces[:, :, 0], 0]
        end = x.max(axis=1)
        brake = (x.min(axis=1) >= 49.95815) & ((end > 49.99) | (end < 49.98698))
        faces = faces[brake if part == '_Brake' else ~brake]
    coordinates = source.copy()
    reshape(coordinates)
    # Material swatches in the source are constant per face.
    old_uv = uv[faces[:, 0, 1]]
    colors = old_atlas[((1 - old_uv[:, 1]) * 64).astype(int), (old_uv[:, 0] * 64).astype(int), 0]
    materials = np.array([face_material(part, source[face[:, 0]], color)
                          for face, color in zip(faces, colors)])
    points = coordinates[faces[:, :, 0]]
    normals = np.cross(points[:, 1] - points[:, 0], points[:, 2] - points[:, 0])
    axes = abs(normals).argmax(axis=1)
    triangles = {}
    for material in sorted(set(materials)):
        bounds = points[materials == material].reshape(-1, 3)
        low, size = bounds.min(axis=0), np.maximum(np.ptp(bounds, axis=0), .01)
        tile = np.array(TILES[material])
        for axis in range(3):
            mask = (materials == material) & (axes == axis)
            geometry = points[mask]
            if len(geometry) == 0:
                continue
            u_axis, v_axis = ((2, 1), (0, 2), (0, 1))[axis]
            mapped = np.clip((geometry - low) / size, 0, 1)[:, :, (u_axis, v_axis)]
            mapped[:, :, 1] = 1 - mapped[:, :, 1]
            mapped = (tile + 5 + mapped * (TILE - 10)) / SIZE
            for xyz, uv_pair, normal in zip(geometry, mapped, normals[mask]):
                if np.linalg.norm(normal) > 1e-7:
                    side = (axis, normal[axis] > 0)
                    triangles.setdefault(side, []).append(tuple(map(tuple, np.hstack((xyz, uv_pair)))))

    # Clip same-facing coplanar triangles, retaining the opposite faces of joints.
    cleaned = []
    for surface in triangles.values():
        clipped, _ = remove_overlaps(surface, minimum_area=1e-6)
        cleaned.extend(clipped)
    if not part:
        cleaned.extend(folded_bipod())
    return cleaned


def suppressor_mesh():
    # A stepped collar, long tube with narrow seams, and a recessed end cap.
    profile = [(-.15, .51), (-.15, .74), (0, .88), (.85, .88), (1.12, 1.64),
               (1.37, 1.81), (2.55, 1.81), (2.60, 1.74), (2.68, 1.74),
               (2.73, 1.81), (5.87, 1.81), (5.92, 1.76), (5.99, 1.76),
               (6.04, 1.81), (12.25, 1.81), (12.30, 1.76), (12.38, 1.76),
               (12.43, 1.81), (16.08, 1.81), (16.13, 1.74), (16.21, 1.74),
               (16.26, 1.81), (18.18, 1.81), (18.45, 1.65), (18.45, .27),
               (18.20, .27), (18.20, 0)]
    angles = np.linspace(0, 2*np.pi, 17)
    for (x0, r0), (x1, r1) in zip(profile, profile[1:]):
        material = 'recess' if r0 <= .27 else 'hardware' if r1 <= .27 else 'suppressor'
        u, v = TILES[material]
        for i in range(16):
            a, b = angles[i:i+2]
            corners = [(x, radius*np.cos(angle), radius*np.sin(angle),
                        (u+8+112*(x+.15)/18.60)/SIZE, (v+8+112*angle/(2*np.pi))/SIZE)
                       for x, radius, angle in ((x0, r0, a), (x1, r1, a), (x1, r1, b), (x0, r0, b))]
            yield corners[0], corners[2], corners[1]
            yield corners[0], corners[3], corners[2]


def bake_suppressor_icon():
    pixels = np.zeros((32, 32, 4), dtype=np.uint8)
    row, col = np.mgrid[:32, :32]
    along = col + row
    across = col - row
    tube = (along >= 12) & (along <= 51) & (abs(across) <= 3)
    collar = (along >= 8) & (along < 13) & (abs(across) <= 1)
    pixels[tube | collar] = (52, 57, 46, 255)
    pixels[tube & (abs(across) < 3) & (along > 12) & (along < 51)] = (117, 124, 94, 255)
    pixels[tube & (across == -2) & (along > 12) & (along < 51)] = (154, 158, 118, 255)
    pixels[tube & np.isin(along, (18, 30, 43, 48)) & (abs(across) < 3)] = (83, 89, 68, 255)
    write_image(OUT / f'{SUPPRESSOR}.png', pixels)


def write_obj(name, triangles, scale, pivot):
    path = OUT / f'{name}.obj'
    vertices, uvs, normals = {}, {}, {}
    faces = []
    for face in triangles:
        points = [tuple(round(value/scale - shift, 9) for value, shift in zip(p[:3], pivot))
                  for p in face]
        a, b, c = map(np.asarray, points)
        x, y, z = np.cross(b - a, c - a)
        length = np.linalg.norm((x, y, z))
        if length < 1e-12:
            continue
        # Legacy OBJ normals swap Y/Z without the position loader's minus sign.
        normal = tuple(round(value/length, 8) for value in (x, -y, z))
        normal_index = normals.setdefault(normal, len(normals) + 1)
        corners = []
        for point, (_, _, _, u, v) in zip(points, face):
            vi = vertices.setdefault(point, len(vertices) + 1)
            ti = uvs.setdefault((round(u, 8), round(1-v, 8)), len(uvs) + 1)
            corners.append(f'{vi}/{ti}/{normal_index}')
        faces.append('f ' + ' '.join(corners))
    with path.open('w', encoding='ascii', newline='\n') as out:
        if name.startswith(NAME):
            out.write('# Adapted from TastyTony, CC BY 4.0. See ../game_ready/ATTRIBUTION.txt\n')
        out.write(f'o {name}\n')
        for token, values in (('v', vertices), ('vt', uvs), ('vn', normals)):
            out.writelines(token + ' ' + ' '.join(f'{n:.9f}' for n in point) + '\n' for point in values)
        out.write('\n'.join(faces) + '\n')
    print(f'{path.name}: {len(faces)} triangles')


def install():
    definition = PACK / 'guns/CUSTOM_SR_SnipexAlligator.txt'
    original = definition.read_bytes()
    updated, count = re.subn(rb'(?m)^AllowBarrelAttachments (?:false|true)(\r?\n)'
                             rb'(?:AllowBarrelAttachmentsList snipexsuppressor\r?\n)?',
                             lambda match: match[1].join((b'AllowBarrelAttachments true',
                                 b'AllowBarrelAttachmentsList snipexsuppressor', b'')), original)
    if count != 1:
        raise ValueError('Expected one Alligator barrel slot setting')
    for name in [*(NAME + part for part in PARTS), SUPPRESSOR]:
        shutil.copyfile(OUT / f'{name}.obj', FLAN / 'BFMCpack' / f'{name}.obj')
    shutil.copyfile(OUT / f'{NAME}.png', PACK / 'assets/flansmod/skins' / f'{NAME}.png')
    shutil.copyfile(OUT / f'{SUPPRESSOR}.png', PACK / 'assets/flansmod/textures/items' / f'{SUPPRESSOR}.png')
    shutil.copyfile(OUT / 'BRL_SnipexSuppressor.txt', PACK / 'attachments/BRL_SnipexSuppressor.txt')
    if original != updated:
        definition.write_bytes(updated)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--install', action='store_true')
    args = parser.parse_args()
    OUT.mkdir(exist_ok=True)
    bake_atlas()
    atlas = read_image(SOURCE / f'{NAME}.png')
    for part in PARTS:
        write_obj(NAME + part, build_part(part, atlas), SCALE, SOURCE_PIVOT)
    write_obj(SUPPRESSOR, suppressor_mesh(), 1, (0, 0, 0))
    bake_suppressor_icon()
    if args.install:
        install()


if __name__ == '__main__':
    main()
