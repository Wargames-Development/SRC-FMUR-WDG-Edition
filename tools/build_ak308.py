"""Remodel the credited AK-308 donor with Blender's bundled Python.

blender -b --factory-startup --python-exit-code 1 --python tools/build_ak308.py -- --install
"""

import argparse
from collections import defaultdict
import json
from math import cos, degrees, radians, sin, tau
from pathlib import Path
import shutil
import sys

import numpy as np
import OpenImageIO as oiio
from mathutils import Euler, Matrix, Vector


ROOT = Path(__file__).resolve().parents[1]
DONOR = ROOT / 'development_assets/sketchfab_guns/game_ready/AK308'
OUTPUT = ROOT / 'development_assets/ak308'
FLAN = ROOT / 'eclipse/Flan'
DEFINITION = ROOT / 'development_assets/sketchfab_guns/definitions/guns/AK308.txt'
PARTS = ('', '_magazine', '_brake', '_bolt', '_rear', '_stock')
PALETTE = {
    'steel': (58, 60, 62), 'rail': (48, 50, 51), 'polymer': (48, 48, 47),
    'rubber': (36, 36, 35), 'machined': (72, 73, 73), 'selector': (64, 65, 64),
    'pin': (79, 79, 77), 'recess': (32, 33, 33), 'mark': (108, 94, 80),
    'bolt': (83, 84, 82), 'magazine': (52, 53, 52), 'rib': (62, 62, 59),
    'sight paint': (235, 235, 235),
}
DONOR_MATERIALS = (
    'steel', 'steel', 'recess', 'pin', 'rubber', 'polymer', 'machined', 'pin',
    'rail', 'rubber', 'machined', 'selector', 'bolt', 'machined', 'steel',
    'rail', 'rail', 'mark',
)
SIZE, TILE = 256, 64


def donor_faces():
    """Read the converted source, including the faces assigned to the old reload group."""
    for suffix in ('', '_magazine'):
        vertices = []
        normals = []
        for line in (DONOR / f'AK308{suffix}.obj').read_text().splitlines():
            kind, *values = line.split()
            if kind == 'v':
                vertices.append(tuple(map(float, values)))
            elif kind == 'vn':
                x, y, z = map(float, values)
                normals.append((x, -y, z))
            elif kind == 'g':
                material = int(values[0].split('_')[1].partition('.')[2] or 0)
            elif kind == 'f':
                indices = [corner.split('/') for corner in values]
                points = np.array([vertices[int(v) - 1] for v, _, _ in indices])
                normal = np.cross(points[1] - points[0], points[2] - points[0])
                if normal @ np.mean([normals[int(n) - 1] for _, _, n in indices], axis=0) < 0:
                    points = points[[0, 2, 1]]
                yield points, material, bool(suffix)


def components(faces):
    # Material seams duplicate vertex indices. Join on geometric edges across both old OBJs.
    edges = defaultdict(list)
    face_edges = []
    for i, (points, _, _) in enumerate(faces):
        keys = [tuple(point.round(4)) for point in points]
        neighbors = [tuple(sorted((a, b))) for a, b in zip(keys, keys[1:] + keys[:1])]
        for edge in neighbors:
            edges[edge].append(i)
        face_edges.append(neighbors)
    seen = set()
    for i in range(len(faces)):
        if i in seen:
            continue
        group = []
        queue = [i]
        seen.add(i)
        while queue:
            current = queue.pop()
            group.append(faces[current])
            for edge in face_edges[current]:
                for neighbor in edges[edge]:
                    if neighbor not in seen:
                        seen.add(neighbor)
                        queue.append(neighbor)
        yield group


def fitted(points):
    # Effective pack units. Keep the grip near the old origin and widen the slim import.
    return (points - (0, 1.4, -.14344)) * (1.61, 1.5, 2.52) + (1.55, 5.7, 0)


def quad(part, material, points):
    for a, b, c in ((0, 1, 2), (0, 2, 3)):
        part.append((material, np.array([points[a], points[b], points[c]])))


def bridge(part, material, lower, upper):
    for i in range(len(lower)):
        j = (i + 1) % len(lower)
        quad(part, material, (lower[i], lower[j], upper[j], upper[i]))


def magazine(part):
    def ring(y, back, front, width):
        bevel = .13
        return [(x, y, z) for x, z in (
            (back, -width + bevel), (back, width - bevel), (back + bevel, width),
            (front - bevel, width), (front, width - bevel), (front, -width + bevel),
            (front - bevel, -width), (back + bevel, -width))]

    sections = [ring(*dimensions) for dimensions in (
        (.88, -.41, 2.05, .56), (1.04, -.43, 2.17, .60),
        (1.17, -.48, 2.15, .58), (2.75, -.72, 2.03, .54),
        (4.67, -1.03, 1.84, .53), (5.40, -1.03, 1.77, .46))]
    for i, (a, b) in enumerate(zip(sections, sections[1:])):
        bridge(part, 'rubber' if i < 2 else 'magazine', a, b)
    for section, material in ((sections[0][::-1], 'rubber'), (sections[-1], 'magazine')):
        for i in range(1, len(section) - 1):
            part.append((material, np.array([section[0], section[i], section[i+1]])))
    # Shallow raised ribs follow the two slopes of the magazine side.
    for side in (-1, 1):
        for x in (-.25, .22, .69, 1.16):
            stations = [(x + .32, 1.3, .578), (x + .14, 2.75, .542), (x - .14, 4.56, .532)]
            for (a, y, z), (b, top, w) in zip(stations, stations[1:]):
                left = [(a, y, side * z), (a + .075, y, side * (z + .061)),
                        (a + .15, y, side * z)]
                right = [(b, top, side * w), (b + .075, top, side * (w + .061)),
                         (b + .15, top, side * w)]
                for i in (0, 1):
                    corners = (left[i], left[i+1], right[i+1], right[i])
                    quad(part, 'rib', corners if side > 0 else corners[::-1])
                if y == 1.3:
                    part.append(('rib', np.array(left[::-1] if side > 0 else left)))
                if top == 4.56:
                    part.append(('rib', np.array(right if side > 0 else right[::-1])))


def muzzle_spigot(part):
    def ring(x, radius):
        return [(x, 5.664 + radius * cos(tau * i / 12), radius * sin(tau * i / 12))
                for i in range(12)]

    rear = ring(12.06, .205)
    tip = ring(12.60, .205)
    bore = ring(12.60, .105)
    bridge(part, 'steel', rear, tip)
    bridge(part, 'machined', tip, bore)
    bridge(part, 'recess', bore, ring(12.22, .105))


def recess_liner(part, x0, x1, y0, y1, depth):
    def ring(x):
        return [(x, y0, -depth), (x, y1, -depth), (x, y1, depth), (x, y0, depth)]

    rear, front = ring(x0), ring(x1)
    bridge(part, 'recess', rear, front)
    quad(part, 'recess', rear[::-1])
    quad(part, 'recess', front)


def paint_sights(parts):
    # Project onto the rear-facing surfaces. Smaller rear marks match the front in ADS.
    def patch(part, y, z0, z1, half_height, surface):
        yz = ((y-half_height, z0), (y-half_height, z1),
              (y+half_height, z1), (y+half_height, z0))
        quad(part, 'sight paint', [(surface(h, w) - .0045, h, w) for h, w in yz])

    for side in (-1, 1):
        z = side * .145
        patch(parts['_rear'], 7.1896, z-.021, z+.021, .017,
              lambda y, z: -3.61158 - .29159 * (y - 7.1896))
    # The post is narrow and its back has two angled shoulders.
    for z0, z1 in ((-.023, -.0136), (-.0136, .0136), (.0136, .023)):
        patch(parts[''], 7.034, z0, z1, .022,
              lambda y, z: 9.28633 + .02291 * (y - 7.031) + 1.087 * max(0, abs(z) - .0136))


def build():
    parts = {suffix: [] for suffix in PARTS}
    for group in components(list(donor_faces())):
        low = np.min([points.min(0) for points, _, _ in group], axis=0)
        high = np.max([points.max(0) for points, _, _ in group], axis=0)
        # The old reload group bisected the magazine shell at y=.35. Discard both halves.
        if any(reload for _, _, reload in group):
            if not (-1.75 < low[0] < -1.1 and high[0] < .30):
                raise ValueError(f'Unexpected donor magazine bounds {low}, {high}')
            continue
        stock = high[0] < -4.04
        rear_sight = -3.36 < low[0] < -2.15 and high[0] < -2.02 and low[1] > 2.035
        bolt = len(group) == 160 and low[2] < -.35 and high[2] > .50
        for points, index, _ in group:
            x, y, _ = points.mean(0)
            suffix = ('_brake' if points[:, 0].min() > 6.56 else '_stock' if stock
                      else '_rear' if rear_sight else '_bolt' if bolt else '')
            material = DONOR_MATERIALS[index]
            if index == 0 and y > 2.015:
                material = 'rail'
            elif suffix == '_stock' and x < -7.62:
                material = 'rubber'
            elif index == 5 and y > 1.58 and x > .5:
                material = 'rail'
            parts[suffix].append((material, fitted(points)))
    magazine(parts['_magazine'])
    muzzle_spigot(parts[''])
    # Keep the visible port and vents recessed over the receiver and gas assembly.
    recess_liner(parts[''], -3.08, 1.95, 5.52, 6.33, .49)
    recess_liner(parts[''], 2.46, 6.77, 5.04, 6.53, .50)
    paint_sights(parts)
    return parts


def build_reload():
    # All positions below are effective pack units.
    mag_hook = Vector((1.68, 5.08, 0))
    mag_palm = Vector((.52, 2.85, -1.18))
    support = Vector((5.466, 4.189, -1.970))

    def rest_wrist(x, y, z):
        # Legacy idle order differs from the reload tracks' XYZ Euler order.
        return (Matrix.Rotation(radians(y), 3, 'Y') @ Matrix.Rotation(radians(z), 3, 'Z')
                @ Matrix.Rotation(radians(x), 3, 'X'))

    def arm_pivot(side, width, length):
        # Vanilla arm pivot and idle roll, before the renderer's GLTF arm offset.
        palm = Vector((side * 5, 2, 0)) + Matrix.Rotation(-side * .1, 3, 'Z') @ Vector((side, 9, 0))
        return Vector((palm.x * width, palm.y * length, 0))

    left_idle = rest_wrist(73, 60, -2)
    right_idle = rest_wrist(-3, 23, -69)
    left_pivot = arm_pivot(1, .75, 1.05) + Vector((-4.8, 0, 0))
    right_palm = arm_pivot(-1, .67, .72)
    firing_grip = right_idle @ (right_palm + Vector((.020, -.664, -.042)) * 16)
    right_pivot = right_palm + Vector((4.8, 0, 0))

    def set_pose(bone, time, position, angles=(0, 0, 0)):
        bone['position'][str(time)] = [round(value, 4) for value in (-position[0], position[1], position[2])]
        bone['rotation'][str(time)] = [round(value, 4) for value in (-angles[0], -angles[1], angles[2])]

    def set_wrist(bone, time, palm, angles, pivot):
        wrist = Euler(tuple(map(radians, angles)), 'XYZ').to_matrix()
        set_pose(bone, time, palm - wrist @ pivot, angles)

    def clip(tactical):
        bones = {name: {'position': {}, 'rotation': {}} for name in ('gun', 'ammo', 'left_arm', 'right_arm', 'slide')}
        left_rest_angles = tuple(map(degrees, left_idle.to_euler('XYZ')))
        right_rest_angles = tuple(map(degrees, right_idle.to_euler('XYZ')))
        # angle, hook displacement, and palm track for the magazine exchange.
        exchange = (
            (0, 0, (0, 0, 0), support),
            (.13, 0, (0, 0, 0), mag_palm),
            (.22, 15, (0, -.15, 0), mag_palm),
            # Swap the visual prop below the viewport, then bring the replacement up from the left.
            (.35, 24, (-2, -22, -.5), mag_palm),
            (.39, 24, (-2, -23, -.5), mag_palm),
            (.44, 9, (-.25, -22, -3.3), mag_palm),
            (.55, 16, (.22, -.64, -.06), mag_palm),
            (.64, 0, (0, 0, 0), mag_palm),
        )
        for time, angle, displacement, palm in exchange:
            swing = Matrix.Rotation(radians(angle), 3, 'Z')
            offset = mag_hook - swing @ mag_hook + Vector(displacement)
            set_pose(bones['ammo'], time, offset, (0, 0, angle))
            angles = left_rest_angles if time == 0 else (65, 46, 5 + angle)
            set_wrist(bones['left_arm'], time, swing @ palm + offset, angles, left_pivot)

        for time, position, angles in (
            (0, (0, 0, 0), (0, 0, 0)), (.13, (.4, 1.0, -1.2), (7, 4, 12)),
            (.35, (.85, 1.55, -2.1), (21, 11, 27)), (.55, (.7, 1.9, -1.9), (21, 9, 26)),
            (.64, (.5, 1.4, -1.6), (16, 9, 21)),
            (1, (0, 0, 0), (0, 0, 0)),
        ):
            set_pose(bones['gun'], time, position, angles)
        for time in (0, 1):
            set_wrist(bones['right_arm'], time, firing_grip, right_rest_angles, right_pivot)
        if tactical:
            del bones['slide']
            set_pose(bones['gun'], .86, (0, 0, 0))
            set_wrist(bones['left_arm'], .80, support, left_rest_angles, left_pivot)
        else:
            # Roll the right side up like the AKM, with the support hand taking the weight.
            for time, position, angles in (
                (.70, (1.0, 1.2, -1.5), (-14, 10, 18)),
                (.765, (4.7, 3.25, -1.6), (-57, 11, 19)),
                (.875, (4.7, 3.25, -1.6), (-57, 11, 19)),
                (.935, (.7, .5, -1.2), (-15, 6, 10)),
            ):
                set_pose(bones['gun'], time, position, angles)
            set_wrist(bones['left_arm'], .73, support, left_rest_angles, left_pivot)

            set_wrist(bones['right_arm'], .735, firing_grip, right_rest_angles, right_pivot)
            set_wrist(bones['right_arm'], .765, Vector((-1.75, 3.75, 3.12)), (-12, 15, -67), right_pivot)
            handle = Vector((1.53, 6.38, 2.92))
            set_pose(bones['slide'], 0, (0, 0, 0))
            for time, pull in ((.79, 0), (.825, -.97), (.855, 0)):
                travel = Vector((pull, 0, 0))
                set_pose(bones['slide'], time, travel)
                set_wrist(bones['right_arm'], time, handle + travel, (-20, 10, -60), right_pivot)
            set_pose(bones['slide'], 1, (0, 0, 0))
            set_wrist(bones['right_arm'], .885, Vector((-1.75, 3.75, 3.12)), (-12, 15, -67), right_pivot)
            set_wrist(bones['right_arm'], .935, firing_grip, right_rest_angles, right_pivot)
        set_wrist(bones['left_arm'], 1, support, left_rest_angles, left_pivot)
        set_pose(bones['ammo'], 1, (0, 0, 0))
        return {'animation_length': 1, 'bones': bones}

    data = {'format_version': '1.8.0', 'animations': {'reload': clip(False), 'tacreload': clip(True)}}
    (OUTPUT / 'AK308_reload.json').write_text(json.dumps(data, indent=2) + '\n', encoding='ascii')


def atlas():
    pixels = np.empty((SIZE, SIZE, 3), dtype=np.uint8)
    pixels[:] = PALETTE['steel']
    rng = np.random.default_rng(308)
    y, x = np.mgrid[:TILE, :TILE]
    for i, color in enumerate(PALETTE.values()):
        col, row = i % 4 * TILE, i // 4 * TILE
        tone = 2 * np.cos(x * tau / TILE) + 2 * np.sin(y * tau / TILE)
        tone += rng.integers(-1, 2, (TILE, TILE))
        pixels[row:row+TILE, col:col+TILE] = np.clip(color + tone[..., None], 0, 255)
    image = oiio.ImageBuf(oiio.ImageSpec(SIZE, SIZE, 3, oiio.UINT8))
    image.set_pixels(oiio.ROI(0, SIZE, 0, SIZE, 0, 1, 0, 3), pixels)
    if not image.write(str(OUTPUT / 'AK308.png')):
        raise RuntimeError(image.geterror())


def export(suffix, triangles):
    indices, lines, faces = {}, ['# AK-308 remodel. See ATTRIBUTION.txt.'], []
    seen = set()
    materials = list(PALETTE)
    for material, points in triangles:
        normal = np.cross(points[1] - points[0], points[2] - points[0])
        magnitude = np.linalg.norm(normal)
        key = tuple(sorted(tuple(point.round(5)) for point in points))
        if magnitude < 1e-7 or key in seen:
            continue
        seen.add(key)
        normal /= magnitude
        i = materials.index(material)
        axes = np.argsort(np.abs(normal))[:2]
        uv = ((points[:, axes] + (14, 7)) / (29, 16)).clip(0, 1)
        uv = (uv * (TILE - 12) + (i % 4 * TILE + 6, i // 4 * TILE + 6)) / SIZE
        refs = []
        for point, (u, v) in zip(points / 1.15, uv):
            # The OBJ loader flips V and handles positions and normals differently.
            vertex = tuple(np.round((*point, u, 1-v, normal[0], -normal[1], normal[2]), 6))
            if vertex not in indices:
                indices[vertex] = len(indices) + 1
                lines.extend(('v %.6f %.6f %.6f' % vertex[:3], 'vt %.6f %.6f' % vertex[3:5],
                              'vn %.6f %.6f %.6f' % vertex[5:]))
            index = indices[vertex]
            refs.append(f'{index}/{index}/{index}')
        faces.append('f ' + ' '.join(refs))
    if not faces:
        raise ValueError(f'No geometry for AK308{suffix}')
    (OUTPUT / f'AK308{suffix}.obj').write_text('\n'.join(lines + faces) + '\n', encoding='ascii', newline='\n')
    print(f'AK308{suffix}: {len(faces)} triangles')


def install():
    pack = FLAN / 'BFMC Gun Pack'
    for suffix in PARTS:
        name = f'AK308{suffix}.obj'
        shutil.copy2(OUTPUT / name, FLAN / 'BFMCpack' / name)
    shutil.copy2(OUTPUT / 'AK308.png', pack / 'assets/flansmod/skins/AK308.png')
    shutil.copy2(OUTPUT / 'ATTRIBUTION.txt', pack / 'licenses/Sketchfab/AK308.txt')
    shutil.copy2(OUTPUT / 'AK308_reload.json', FLAN / 'BFMCpack/animations/AK308.json')
    shutil.copy2(DEFINITION, pack / 'guns/AK308.txt')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--install', action='store_true')
    args = parser.parse_args(sys.argv[sys.argv.index('--') + 1:] if '--' in sys.argv else [])
    OUTPUT.mkdir(parents=True, exist_ok=True)
    for suffix, triangles in build().items():
        export(suffix, triangles)
    atlas()
    build_reload()
    if args.install:
        install()
