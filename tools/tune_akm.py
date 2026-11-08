"""Build the BFMC AKM from AK74M steelwork and the original AKM furniture and feed."""
import argparse
import gzip
import shutil
from pathlib import Path

import numpy as np
import OpenImageIO as oiio
from mg36.planar_cleanup import remove_overlaps

ROOT = Path(__file__).resolve().parents[1]
SOURCE = ROOT / 'development_assets/akm/game_ready'
OUT = ROOT / 'development_assets/akm/tuned'
FLAN = ROOT / 'eclipse/Flan'
PACK = FLAN / 'BFMC Gun Pack'
PARTS = ('Main', 'Magazine', 'Bolt', 'Brake')
SCALE = 3.25
ORIGIN = np.array([1.85, .75, 0])
ATLAS_SIZE = 512
TILE_SIZE = 64

# Original atlas colors identify existing materials, independently of mesh ordering.
METAL = {65: 'blued', 67: 'dark steel', 70: 'cover', 75: 'machined',
         86: 'fasteners', 89: 'stamped steel', 98: 'body steel', 231: 'cartridge'}
FINISH = {'blued': (53, 55, 55), 'dark steel': (45, 46, 46), 'cover': (56, 57, 56),
          'machined': (65, 66, 66), 'fasteners': (76, 76, 73), 'stamped steel': (63, 64, 64),
          'body steel': (56, 58, 58), 'cartridge': (149, 129, 85),
          'stock': (103, 64, 42), 'handguard': (108, 66, 41), 'grip': (91, 59, 48),
          'magazine': (63, 67, 68), 'magazine trim': (72, 74, 73),
          'sight paint': (235, 235, 235)}


def bake_atlas():
    rng = np.random.default_rng(1973)
    row, col = np.mgrid[0:TILE_SIZE, 0:TILE_SIZE] / (TILE_SIZE - 1)
    atlas = np.full((ATLAS_SIZE, ATLAS_SIZE, 3), 45, dtype=np.uint8)
    steel = oiio.ImageBuf(str(OUT / 'AK74M1_source.png')).get_pixels(oiio.UINT8)
    if steel.shape[:2] != (256, 256):
        raise ValueError('Unexpected AK74M source atlas dimensions')
    atlas[:256, :256] = np.clip(steel[..., :3] * .94 + 8, 0, 255)
    tiles = {}
    slots = [(x, y) for y in range(0, ATLAS_SIZE, TILE_SIZE)
             for x in range(0, ATLAS_SIZE, TILE_SIZE) if x >= 256 or y >= 256]
    for index, (name, rgb) in enumerate(FINISH.items()):
        shade = np.interp(row, [0, .12, .43, .85, 1], [-5, -3, 0, 2, 4])
        shade += rng.uniform(-1.1, 1.1, row.shape)
        if name in ('stock', 'handguard'):
            grain = rng.uniform(-4, 4, 45)
            warp = .018 * np.sin(4 * col + 7 * row) + .008 * np.sin(7 * col - 3 * row)
            shade += np.interp(row + warp, np.linspace(0, 1, len(grain)), grain)
            shade += 1.9 * np.cos(9 * col + 5 * row)
        if name == 'grip':
            shade += 1.6 * np.sin(65 * col + 63 * row) * np.sin(67 * col - 61 * row)
        if name.startswith('magazine'):
            shade += np.interp(col, [0, .12, .24, .80, .94, 1], [-5, 3, 0, 0, 3, -4])
        for variant, level in enumerate((0, 4, -6)):
            x, y = slots[index * 3 + variant]
            tiles[name, variant] = x, y
            atlas[y:y+TILE_SIZE, x:x+TILE_SIZE] = (
                rgb if name == 'sight paint' else np.clip(rgb + shade[..., None] + level, 0, 255))
    image = oiio.ImageBuf(oiio.ImageSpec(ATLAS_SIZE, ATLAS_SIZE, 3, oiio.UINT8))
    image.set_pixels(oiio.ROI(0, ATLAS_SIZE, 0, ATLAS_SIZE, 0, 1, 0, 3), atlas)
    if not image.write(str(OUT / 'AKM.png')):
        raise OSError(image.geterror())
    return tiles


def load_obj(path):
    vertices, uv, faces = [], [], []
    for line in path.read_text().splitlines():
        if line.startswith('v '):
            vertices.append(tuple(map(float, line.split()[1:])))
        elif line.startswith('vt '):
            uv.append(tuple(map(float, line.split()[1:])))
        elif line.startswith('f '):
            faces.append([tuple(int(value) - 1 for value in token.split('/')[:2])
                          for token in line.split()[1:]])
    return np.array(vertices), np.array(uv), faces


def proportion(points, part):
    x, y, depth = points.T
    if part == 'Main':
        # Fit the original fixed stock to the AK74M rear trunnion.
        x[:] = -.73 + (x + .78) * (7.67 / 8.705765)
        y[:] = 3.48 + .88 * (y - 3.55)
        depth *= 1.16
    else:
        # Preserve the 7.62 curve while seating the neck in the AK74M magwell.
        x[:] = 4.10 + (x - 4.10) * .95 - .29 * np.clip((3.6 - y) / 6, 0, 1)
        y[:] = 3.84 + (y - 4.20) * 1.04
        depth *= 1.22


def face_finish(color, part, position):
    if color == (112, 90, 76):
        return 'stock' if position[0] < 0 else 'handguard'
    if color == (85, 72, 72):
        return 'grip'
    if part == 'Magazine' and color[0] != 231:
        return 'magazine trim' if color[0] == 89 else 'magazine'
    if color[0] == color[1] == color[2]:
        return METAL[color[0]]
    raise ValueError(f'Unexpected original AKM material {color}')


def ak74_faces(group):
    with gzip.open(OUT / 'AK74M_parts.mesh.gz', 'rt', encoding='ascii') as source:
        for line in source:
            key, *vertices = line.split()
            name, part = key.split('#')
            if name == group:
                yield int(part), np.array([tuple(map(float, vertex.split(','))) for vertex in vertices])


def append_panel(points, faces, materials, corner_uvs, panel, material, uv=None):
    start = len(points)
    points.extend(panel)
    for j in range(1, len(panel)-1):
        faces.append([(start, 0), (start+j, 0), (start+j+1, 0)])
        materials.append(material)
        corner_uvs.append(None if uv is None else uv[[0, j, j+1]])


def add_ak74_parts(part, points, faces, materials, corner_uvs):
    # Retain the handguard shell and discard its external polymer ribs.
    wood = {8, 9, 10, 44, 45, 130, 131, 143, 213, 214, 215, 216, 229, 230, 231, 232, 247}
    group = 'slideModel' if part == 'Bolt' else 'gunModel'
    for index, polygon in ak74_faces(group):
        # Remove the factory witness marks and the modern cover rail and its seats.
        if group == 'gunModel' and (99 <= index <= 101 or 191 <= index <= 193
                                   or 217 <= index <= 228 or index >= 270):
            continue
        panel = polygon[:, :3].copy()
        if group == 'gunModel' and 103 <= index <= 110:
            if np.all(panel[:, 0] > 20):
                continue  # Open the threaded end for the separate slant brake.
            panel[:, 0] = np.minimum(panel[:, 0], 19.79)
        material = 'handguard' if index in wood else 'grip' if 194 <= index <= 210 else 'ak74 steel'
        uv = polygon[:, 3:] * .5 if material == 'ak74 steel' else None
        append_panel(points, faces, materials, corner_uvs, panel, material, uv)
    if part == 'Main':
        for x, y, z, half in ((6.958, 6.642, -.174, .014), (6.958, 6.642, .174, .014),
                              (19.018, 6.681, 0, .027)):
            append_panel(points, faces, materials, corner_uvs,
                         [(x,y-half,z-half),(x,y-half,z+half),(x,y+half,z+half),(x,y+half,z-half)],
                         'sight paint')


def add_slant_brake(points, faces, materials, corner_uvs):
    # A return through the bore keeps the slanted exit open.
    angles = np.arange(8) * np.pi / 4
    rings = [np.array([(x - slope*np.sin(a), 4.68 + radius*np.sin(a), radius*np.cos(a))
                      for a in angles])
             for x, radius, slope in ((19.62,.309,0),(19.94,.292,.10),
                                      (19.94,.117,.04),(19.62,.117,0))]
    for index, ring in enumerate(rings):
        next_ring = rings[(index+1) % len(rings)]
        for j in range(len(ring)):
            k = (j+1) % len(ring)
            append_panel(points, faces, materials, corner_uvs,
                         [ring[k],ring[j],next_ring[j],next_ring[k]], 'machined')


def build_part(part, tiles, original_atlas):
    path = SOURCE / f'AKM_{part}.obj'
    points, faces, materials, corner_uvs = [], [], [], []
    if part in ('Main', 'Magazine'):
        vertices, uv, original_faces = load_obj(path)
        original = (vertices + ORIGIN) * SCALE
        fitted = original.copy()
        proportion(fitted, part)
        for face in original_faces:
            if not original_face_has_area(vertices, face):
                continue
            ids, texcoords = zip(*face)
            corners = original[list(ids)]
            if part == 'Main' and (corners[:,0].max() >= -.775 or corners[:,1].min() < 1.45):
                continue
            sample = np.floor(uv[list(texcoords)] * 64).astype(int)
            colors = {tuple(original_atlas[63-v, u, :3]) for u, v in sample}
            if len(colors) != 1:
                raise ValueError(f'Mixed material in {path.name}')
            material = face_finish(colors.pop(), part, corners.mean(axis=0))
            append_panel(points, faces, materials, corner_uvs, fitted[list(ids)], material)
    if part in ('Main', 'Bolt'):
        add_ak74_parts(part, points, faces, materials, corner_uvs)
    if part == 'Brake':
        add_slant_brake(points, faces, materials, corner_uvs)
    points = np.array(points)
    bounds = {}
    for face, material in zip(faces, materials):
        if material != 'ak74 steel':
            bounds.setdefault(material, []).extend(points[[i for i, _ in face]])
    bounds = {key: (np.min(group, axis=0), np.ptp(group, axis=0)) for key, group in bounds.items()}

    surfaces = {}
    for face, material, coords in zip(faces, materials, corner_uvs):
        ids, _ = zip(*face)
        corners = points[list(ids)]
        normal = np.cross(corners[1] - corners[0], corners[2] - corners[0])
        magnitude = np.linalg.norm(normal)
        if magnitude <= 1e-10:
            continue  # Some TMT shapebox sides collapse to zero area.
        normal /= magnitude
        axis = int(np.argmax(np.abs(normal)))
        axes = ((2, 1), (0, 2), (0, 1))[axis]
        variant = 1 if normal[1] > .56 else 2 if normal[1] < -.56 else 0
        if coords is None:
            low, span = bounds[material]
            fraction = ((corners - low) / np.maximum(span, 1e-8))[:, axes]
            tile = np.array(tiles[material, variant])
            coords = (tile + 5 + 53 * fraction) / ATLAS_SIZE
        # Clip same-facing overlays. Opposite faces at closed TMT joints do
        # not compete under culling and can form the back wall of an opening.
        key = (axis, normal[axis] > 0)
        surfaces.setdefault(key, []).append(tuple((*point, *uv) for point, uv in zip(corners, coords)))

    triangles = []
    for surface in surfaces.values():
        visible, _ = remove_overlaps(surface, minimum_area=1e-6)
        triangles.extend(visible)
    vertices, uvs, normals, output_faces = [], [], [], []
    for index, triangle in enumerate(triangles, 1):
        a, b, c = np.array(triangle)[:, :3]
        normal = np.cross(b-a, c-a)
        normal /= np.linalg.norm(normal)
        first = len(vertices) + 1
        for x,y,z,u,v in triangle:
            vertices.append('v %.8f %.8f %.8f' % tuple(np.array([x,y,z]) / SCALE - ORIGIN))
            uvs.append('vt %.8f %.8f' % (u, 1-v))
        # The legacy loader swaps normal Y/Z without the sign change it applies
        # to positions. Compensate so the two agree after the model rotation.
        normals.append('vn %.8f %.8f %.8f' % (normal[0], -normal[1], normal[2]))
        output_faces.append('f ' + ' '.join(f'{i}/{i}/{index}' for i in range(first, first+3)))
    output = ["# Based on BFMC AK74M and TastyTony's Low-Poly AKM (CC BY 4.0)",
              f'o AKM_{part}', *vertices, *uvs, *normals, *output_faces]
    (OUT / path.name).write_text('\n'.join(output) + '\n', encoding='ascii')
    print(f'{path.name}: {len(output_faces)} faces')


def original_face_has_area(vertices, face):
    a, b, c = (vertices[index] for index, _ in face)
    return np.linalg.norm(np.cross(b-a, c-a)) > 1e-10


def install():
    definition = (PACK / 'guns/RU_AR_AK-TAC.txt').read_text().splitlines()
    expected = ('ShortName ak47tec', 'Icon AK47Tec', 'Model BFMCpack.AKM', 'ModelScale 3.25',
                'Texture AKM', '3rdModel BFMCpack.AKM', '3rdModelScale 3.25', '3rdTexture AKM')
    if not all(line in definition for line in expected):
        raise ValueError('Unexpected BFMC AKM definition')
    for part in PARTS:
        name = f'AKM_{part}.obj'
        shutil.copyfile(OUT / name, FLAN / 'BFMCpack' / name)
    for folder in ('skins', 'skins/3rd'):
        shutil.copyfile(OUT / 'AKM.png', PACK / 'assets/flansmod' / folder / 'AKM.png')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--install', action='store_true')
    args = parser.parse_args()
    OUT.mkdir(parents=True, exist_ok=True)
    original = oiio.ImageBuf(str(SOURCE / 'AKM.png')).get_pixels(oiio.UINT8)
    atlas_tiles = bake_atlas()
    for group in PARTS:
        build_part(group, atlas_tiles, original)
    if args.install:
        install()
