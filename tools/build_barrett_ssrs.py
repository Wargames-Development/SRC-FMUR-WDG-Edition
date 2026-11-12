"""Build the hand-authored SSRS meshes, atlas, and sprites with Blender 5.2.

blender -b --factory-startup --python-exit-code 1 --python tools/build_barrett_ssrs.py -- --install

Visual reference: Barrett's October 2024 SSRS unveiling. The legacy in-game rail,
grip, and muzzle landmarks supply the fit coordinates for the new mesh.
https://barrett.net/2024/10/15/barrett-firearms-manufacturing-inc-unveils-squad-support-rifle-system-ssrs-at-ausa-annual-meeting/
"""
import argparse
import math
import shutil
import sys
from pathlib import Path

import numpy as np
import OpenImageIO as oiio
from mathutils import Vector
from mathutils.geometry import tessellate_polygon

ROOT = Path(__file__).resolve().parents[1]
OUTPUT = ROOT / 'development_assets/barrett_ssrs'
FLAN = ROOT / 'eclipse/Flan'
SCALE = 1.15
TILE = 128
SIZE = 512
FINISH = {
    'upper': (140, 126, 100), 'marked': (140, 126, 100), 'chamfer': (145, 131, 105),
    'lower': (119, 108, 88), 'stock': (104, 94, 77), 'polymer': (55, 54, 50),
    'pad': (40, 40, 38), 'rail': (81, 77, 65), 'steel': (72, 73, 68),
    'bolt': (61, 62, 61), 'recess': (38, 39, 38), 'magazine': (80, 78, 69),
    'baseplate': (53, 52, 47), 'fastener': (84, 82, 74), 'mag_rib': (83, 81, 72),
}
TILES = {name: (i % 4 * TILE, i // 4 * TILE) for i, name in enumerate(FINISH)}


# Inventory sprites use their own 32 x 32 pixel maps and a limited shared palette.
ICON_COLORS = {
    '.': (0, 0, 0, 0), '#': (20, 21, 20, 255), 'd': (44, 45, 42, 255),
    's': (65, 65, 58, 255), 'l': (86, 86, 76, 255), 'k': (108, 105, 91, 255),
    'T': (164, 145, 110, 255), 't': (133, 116, 87, 255), 'b': (96, 84, 64, 255),
    'h': (184, 166, 127, 255), 'r': (136, 53, 38, 255), 'R': (175, 79, 53, 255),
    'B': (157, 124, 73, 255),
}
ICONS = {
    ('BarrettSSRSIcon.png', 'BarrettSSRS.png'): """
    ................................
    ................................
    ....####........................
    ..###sss#.......................
    ..#s#Tssd#......................
    ..##TThTsd#.....................
    ...#TTbhhsd#....................
    ....#tTThhsd#...................
    ....#ttTbhhsd#..................
    .....#ttTThhsd##................
    ......#ttTbThsdd#...............
    .......#ttTTThhdd#..............
    ........#ttbbThhdd#.............
    .........#tbbTThhdd#............
    ..........#tbbTsThdd#...........
    ...........#bbbTsThsd#..........
    ..........#bbbbbbsThsd..........
    ...........#bbbbbbdTT##.........
    ...........##bbbbbbTbt##........
    ..........##l#bbbbbbt####.......
    .........##lss####bt##tT##......
    ........##lss###.s###tstTT#.....
    ........##sssd##d.####b.tkT#....
    .........##sddd###sdd#b..ttT#...
    ..........###d###sdd###...bkT#..
    ............##.#sdd#..#b...btb#.
    ...............#ddd#..##b...bd#.
    ................#d#....##btbdd#.
    .................#......##bdd#..
    .........................##d#...
    ...........................#....
    ................................
    """,
    ('Sketch30mmGrenade.png', 'Sketch30mmGrenade.png'): """
    ................................
    ................................
    ................................
    ................................
    ...........##########...........
    .........##BTTTTTBBRR##.........
    ........###BBBBBBBBRR###........
    ........#ldl######rrr#s##.......
    .......#lll###########ll#.......
    .......##ldddddddddddddd#.......
    .......##ldddddddddddddd#.......
    .......##lddsdddsdddsddd#.......
    .......##lddsdddsdddsddd#.......
    .......##lddsdddsdddsddd#.......
    .......##lddsdddsdddsddd#.......
    .......##lddsdddsdddsddd#.......
    .......##lddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#slddsdddsdddsddd#.......
    .......#sldddddddddddddd#.......
    .......#ssssssssssssss###.......
    .......#sssssss#########........
    ........###############.........
    ................................
    ................................
    ................................
    """,
}
AMMO_MARKINGS = {
    'CloseCombat': ((202, 147, 75), (140, 87, 36), """
        .........
        .##...##.
        .##...##.
        .........
        ....##...
        ....##...
        .........
        .##...##.
        .##...##.
    """),
    'Smoke': ((173, 186, 142), (93, 112, 76), """
        .........
        ..##..##.
        .##..##..
        .##..##..
        ..##..##.
        ...##..##
        ...##..##
        ..##..##.
        .........
    """),
    'AP': ((146, 184, 206), (72, 111, 141), """
        ....#....
        ...###...
        ...###...
        ..#####..
        ..#####..
        ...###...
        ...###...
        ...###...
        ..#####..
    """),
    'Airburst': ((196, 155, 211), (123, 79, 148), """
        ....#....
        .#..#..#.
        ..#.#.#..
        ...###...
        #########
        ...###...
        ..#.#.#..
        .#..#..#.
        ....#....
    """),
}


class Mesh:
    def __init__(self):
        self.triangles = []

    def face(self, material, points):
        corners = [Vector(point) for point in points]
        for triangle in tessellate_polygon([corners]):
            self.triangles.append((material, tuple(tuple(corners[i]) for i in triangle)))

    def bridge(self, material, a, b):
        for i, j in zip(range(len(a)), [*range(1, len(a)), 0]):
            self.face(material, (a[i], a[j], b[j], b[i]))

    def prism(self, material, x0, x1, section):
        rear = [(x0, y, z) for y, z in section]
        front = [(x1, y, z) for y, z in section]
        self.bridge(material, rear, front)
        self.face(material, rear[::-1])
        self.face(material, front)

    def profile(self, material, points, z0, z1, cutout=None):
        # Both outlines run counterclockwise when viewed from positive Z.
        back = [(x, y, z0) for x, y in points]
        front = [(x, y, z1) for x, y in points]
        self.bridge(material, back, front)
        if cutout is None:
            self.face(material, back[::-1])
            self.face(material, front)
            return
        inner_back = [(x, y, z0) for x, y in cutout]
        inner_front = [(x, y, z1) for x, y in cutout]
        self.bridge(material, front, inner_front)
        self.bridge(material, inner_back, back)
        self.bridge(material, inner_front, inner_back)


def clipped_rect(x0, x1, y0, y1, clip):
    return ((x0 + clip, y0), (x1 - clip, y0), (x1, y0 + clip), (x1, y1 - clip),
            (x1 - clip, y1), (x0 + clip, y1), (x0, y1 - clip), (x0, y0 + clip))


def side_strip(mesh, side, material, x0, x1, y0, y1, windows=(), recess_depth=.91):
    def panel(name, points, depth=1.025):
        face = [(x, y, side * depth) for x, y in points]
        mesh.face(name, face if side > 0 else face[::-1])

    def fill(left, right, bottom, top):
        if right > left and top > bottom:
            panel(material, ((left, bottom), (right, bottom), (right, top), (left, top)))

    for left, right, bottom, top, clip in windows:
        fill(x0, left, y0, y1)
        fill(left, right, y0, bottom)
        fill(left, right, top, y1)
        rim = clipped_rect(left, right, bottom, top, clip)
        for a, b, corner in ((0, 7, (left, bottom)), (2, 1, (right, bottom)),
                             (4, 3, (right, top)), (6, 5, (left, top))):
            panel(material, (corner, rim[a], rim[b]))
        outside = [(x, y, side * 1.025) for x, y in rim]
        inside = [(x, y, side * recess_depth) for x, y in rim]
        if side < 0:
            outside.reverse()
            inside.reverse()
        mesh.bridge('recess', outside, inside)
        mesh.face('recess', inside)
        x0 = right
    fill(x0, x1, y0, y1)


def upper(mesh):
    rear, nose = 2.84, 18.80
    section = ((4.33, -.69), (4.58, -1.025), (5.92, -1.025), (6.16, -.65),
               (6.16, .65), (5.92, 1.025), (4.58, 1.025), (4.33, .69))
    for i in (0, 2, 3, 4, 6, 7):
        a, b = section[i], section[(i + 1) % len(section)]
        mesh.face('chamfer' if i not in (3, 7) else 'upper',
                  ((rear, *a), (rear, *b), (nose, *b), (nose, *a)))
    # The right port has a continuous recessed floor behind the visible bolt.
    side_strip(mesh, 1, 'marked', rear, 12.25, 4.58, 5.92)
    side_strip(mesh, -1, 'upper', rear, 12.25, 4.58, 5.92,
               ((6.46, 9.86, 4.77, 5.70, .13),), recess_depth=.82)
    for side in (-1, 1):
        slots = [12.63 + .78 * i for i in range(8)]
        side_strip(mesh, side, 'upper', 12.25, nose, 4.58, 5.25,
                   [(x, x + .53, 5.01, 5.20, .065) for x in slots])
        side_strip(mesh, side, 'upper', 12.25, nose, 5.25, 5.92,
                   [(x + .13, x + .66, 5.53, 5.74, .065) for x in slots])

    mesh.face('stock', [(rear, *p) for p in section[::-1]])
    # The front plate surrounds the bore. Each edge meets a vertex on the muzzle collar.
    angles = [math.atan2(z, y - 5.284) for y, z in section]
    outer = [(nose, y, z) for y, z in section]
    opening = [(nose, 5.284 + .48 * math.cos(a), .48 * math.sin(a)) for a in angles]
    mesh.bridge('chamfer', outer, opening)
    mesh.profile('bolt', clipped_rect(6.72, 9.68, 4.88, 5.56, .08), -.89, -.81)

    # Cosmetic charging track and handle sit below the sight line.
    mesh.profile('recess', clipped_rect(3.85, 6.14, 5.55, 5.75, .06), -1.045, -1.02)
    mesh.profile('steel', clipped_rect(4.79, 5.16, 5.56, 5.84, .07), -1.32, -1.033)
    mesh.profile('recess', clipped_rect(4.73, 5.25, 5.54, 5.87, .08), -1.43, -1.31)

    muzzle = ((10.04, .33), (17.40, .33), (18.46, .43), (18.73, .54), (19.08, .54),
              (19.20, .48), (19.20, .335), (18.64, .335), (18.58, .29))
    rings = [[(x, 5.284 + radius * math.cos(a), radius * math.sin(a))
              for a in np.linspace(0, 2 * math.pi, 17)[:-1]] for x, radius in muzzle]
    for i, (a, b) in enumerate(zip(rings, rings[1:])):
        mesh.bridge('steel' if i < 6 else 'recess', a, b)
    mesh.face('recess', rings[-1])
    mesh.face('steel', rings[0][::-1])

    web = ((6.13, -.35), (6.49, -.35), (6.49, .35), (6.13, .35))
    tooth = ((6.48, -.39), (6.62, -.59), (6.72, -.59), (6.80, -.49),
             (6.80, .49), (6.72, .59), (6.62, .59), (6.48, .39))
    mesh.prism('rail', 3.05, 18.77, web)
    for x in np.linspace(3.08, 18.40, 28):
        mesh.prism('rail', x, x + .35, tooth)


def furniture(mesh):
    stock = ((-4.42, 3.04), (-1.88, 3.13), (-.58, 4.27), (1.00, 4.68),
             (1.00, 5.51), (-4.42, 5.60))
    opening = ((-4.02, 3.46), (-2.07, 3.51), (-1.03, 4.44), (-.50, 4.83),
               (-.67, 5.12), (-4.02, 5.16))
    mesh.profile('stock', stock, -.44, .44, opening)
    mesh.profile('pad', ((-4.60, 3.14), (-4.38, 3.03), (-4.34, 5.57), (-4.58, 5.52)),
                 -.48, .48)
    mesh.profile('polymer', ((-4.24, 5.58), (-.80, 5.52), (-.43, 5.68), (-.70, 5.77),
                             (-4.07, 5.79)), -.47, .47)
    mesh.profile('steel', ((.84, 4.94), (2.88, 4.86), (2.88, 5.47), (.84, 5.41)), -.31, .31)
    mesh.profile('lower', clipped_rect(2.63, 3.06, 4.72, 5.68, .10), -.62, .62)

    lower = ((2.92, 3.41), (4.28, 3.11), (5.34, 3.30), (6.37, 2.89), (9.60, 2.91),
             (10.19, 3.25), (10.57, 4.11), (11.38, 4.34), (11.33, 4.50), (3.06, 4.51))
    mesh.profile('lower', lower, -.75, .75)
    mesh.profile('stock', clipped_rect(6.38, 9.61, 2.82, 3.14, .10), -.77, .77)
    guard = ((4.22, 2.62), (4.61, 2.35), (5.85, 2.35), (6.38, 2.67),
             (6.55, 3.45), (4.29, 3.45))
    window = ((4.47, 2.73), (4.73, 2.55), (5.76, 2.55), (6.14, 2.79),
              (6.24, 3.25), (4.51, 3.25))
    mesh.profile('polymer', guard, -.35, .35, window)
    mesh.profile('steel', ((5.17, 2.65), (5.06, 2.68), (4.97, 2.97), (5.03, 3.28),
                           (5.24, 3.28), (5.14, 3.00), (5.15, 2.82))[::-1], -.10, .10)
    grip = ((2.08, 1.23), (2.18, .93), (3.35, .76), (3.57, .95), (3.71, 1.49),
            (4.12, 2.26), (4.38, 2.78), (4.16, 3.30), (3.50, 3.42), (3.29, 2.69))
    mesh.profile('polymer', grip, -.47, .47)
    for side in (-1, 1):
        z0, z1 = sorted((.454 * side, .50 * side))
        mesh.profile('pad', ((2.43, 1.23), (3.19, 1.10), (3.47, 1.60),
                             (3.91, 2.51), (3.48, 2.70)), z0, z1)
        for x, y, radius in ((-.32, 4.75, .16), (3.80, 3.78, .12), (8.82, 3.80, .10),
                             (10.24, 4.23, .10), (11.45, 5.59, .10), (17.90, 4.73, .09)):
            depth = .75 if y < 4.5 else 1.025 if x > 2.84 else .44
            mesh.profile('fastener', [(x + radius*math.cos(a), y + radius*math.sin(a))
                                      for a in np.linspace(0, 2*math.pi, 9)[:-1]],
                         *sorted((side*(depth-.01), side*(depth+.055))))
        mesh.profile('steel', clipped_rect(3.49, 3.98, 3.74, 3.86, .045),
                     *sorted((side*.77, side*.86)))


def magazine(mesh):
    case = ((6.57, .37), (6.78, .18), (9.08, .12), (9.28, .29), (9.49, 3.23),
            (9.24, 3.53), (6.79, 3.56), (6.66, 3.30))
    mesh.profile('magazine', case, -.57, .57)
    mesh.profile('baseplate', ((6.48, .35), (6.61, .14), (9.14, .075), (9.32, .22),
                               (9.34, .40), (6.55, .46)), -.62, .62)
    for side in (-1, 1):
        for x in (6.96, 7.58, 8.20, 8.82):
            mesh.profile('mag_rib', ((x-.075, .52), (x+.055, .52), (x+.19, 2.64),
                                     (x+.15, 2.83), (x+.06, 2.73)),
                         *sorted((side*.565, side*.607)))


def bake_atlas():
    row, col = np.mgrid[:TILE, :TILE]
    rng = np.random.default_rng(3055)
    pixels = np.full((SIZE, SIZE, 3), 42, np.uint8)
    for material, color in FINISH.items():
        x, y = TILES[material]
        shade = rng.normal(0, .55, row.shape)
        shade += .65 * np.cos(row*.08 + col*.025) + .35 * np.sin(col*.045 - row*.08)
        shade += np.interp(row, (0, 16, 38, 86, 118, 127), (0, 3, 1, -1, -3, -3))
        if material == 'marked':
            for j, glyphs in enumerate(('111 111 110 111', '100 100 101 100', '111 111 110 111',
                                        '001 001 101 001', '111 111 101 111')):
                for i, pixel in enumerate(glyphs):
                    if pixel == '1':
                        shade[40+2*j:42+2*j, 18+i] -= 31
        pixels[y:y+TILE, x:x+TILE] = np.clip(np.asarray(color) + shade[..., None], 0, 255)
    write_png('BarrettSSRS.png', pixels)


def write_png(filename, pixels):
    height, width, channels = pixels.shape
    image = oiio.ImageBuf(oiio.ImageSpec(width, height, channels, oiio.UINT8))
    image.set_pixels(oiio.ROI(0, width, 0, height, 0, 1, 0, channels), pixels)
    if not image.write(str(OUTPUT / filename)):
        raise OSError(image.geterror())


def bake_icons(install):
    sprites = {}
    for (filename, installed_name), pixel_map in ICONS.items():
        rows = pixel_map.split()
        if len(rows) != 32 or any(len(row) != 32 for row in rows):
            raise ValueError(f'{filename} sprite must be 32 x 32')
        pixels = np.array([[ICON_COLORS[pixel] for pixel in row] for row in rows], dtype=np.uint8)
        sprites[filename] = (installed_name, pixels)

    magazine_sprite = sprites['Sketch30mmGrenade.png'][1]
    for variant, (highlight, shade, marking) in AMMO_MARKINGS.items():
        pixels = magazine_sprite.copy()
        pixels[np.all(magazine_sprite == ICON_COLORS['R'], axis=2), :3] = highlight
        pixels[np.all(magazine_sprite == ICON_COLORS['r'], axis=2), :3] = shade
        for y, row in enumerate(marking.split(), start=13):
            for x, pixel in enumerate(row, start=11):
                if pixel == '#':
                    pixels[y, x, :3] = highlight
        name = f'Sketch30mm{variant}.png'
        sprites[name] = (name, pixels)

    for filename, (installed_name, pixels) in sprites.items():
        write_png(filename, pixels)
        if install:
            shutil.copyfile(OUTPUT / filename,
                            FLAN / 'BFMC Gun Pack/assets/flansmod/textures/items' / installed_name)



def export(mesh, filename):
    positions, uvs, normals, faces = {}, {}, {}, []
    for material, corners in mesh.triangles:
        points = np.array(corners)
        normal = np.cross(points[1]-points[0], points[2]-points[0])
        length = np.linalg.norm(normal)
        if length < 1e-8:
            continue
        axes = ((2, 1), (0, 2), (0, 1))[abs(normal).argmax()]
        # The legacy loader swaps normal Y/Z without the position sign change.
        ni = normals.setdefault(tuple(np.round(normal * (1, -1, 1) / length, 7)), len(normals)+1)
        u, v = TILES[material]
        tex = np.clip((points - (-4.6, 0, -1.5)) / (23.8, 6.8, 3), 0, 1)[:, axes]
        if material == 'marked':
            tex = np.clip((points[:, :2] - (2.84, 4.58)) / (9.41, 1.34), 0, 1)
        tex[:, 1] = 1 - tex[:, 1]
        tex = ((u + 6, v + 6) + tex * (TILE-12)) / SIZE
        face = []
        for point, (s, t) in zip(points, tex):
            vi = positions.setdefault(tuple(np.round(point / SCALE, 7)), len(positions)+1)
            ti = uvs.setdefault((round(s, 7), round(1-t, 7)), len(uvs)+1)
            face.append(f'{vi}/{ti}/{ni}')
        faces.append('f ' + ' '.join(face) + '\n')
    with (OUTPUT / filename).open('w', encoding='ascii', newline='\n') as out:
        out.write('# Hand-authored FMUR Barrett SSRS mesh. Generated by tools/build_barrett_ssrs.py.\n')
        for token, values in (('v', positions), ('vt', uvs), ('vn', normals)):
            out.writelines(token + ' ' + ' '.join(f'{value:.7f}' for value in item) + '\n' for item in values)
        out.writelines(faces)
    print(f'{filename}: {len(faces)} triangles')


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--install', action='store_true')
    args = parser.parse_args(sys.argv[sys.argv.index('--') + 1:] if '--' in sys.argv else [])
    OUTPUT.mkdir(exist_ok=True)
    body, ammo = Mesh(), Mesh()
    upper(body)
    furniture(body)
    magazine(ammo)
    bake_atlas()
    bake_icons(args.install)
    for mesh, name in ((body, 'BarrettSSRS.obj'), (ammo, 'BarrettSSRS_magazine.obj')):
        export(mesh, name)
        if args.install:
            shutil.copyfile(OUTPUT / name, FLAN / 'BFMCpack' / name)
    if args.install:
        shutil.copyfile(OUTPUT / 'BarrettSSRS.png',
                        FLAN / 'BFMC Gun Pack/assets/flansmod/skins/BarrettSSRS.png')


if __name__ == '__main__':
    main()
