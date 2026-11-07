"""Resolve overlapping MG36 faces while preserving winding and corner UVs."""
from collections import defaultdict
from math import sqrt


# The source and export use float32 coordinates. Use a plane tolerance much
# smaller than the thinnest authored feature and discard subpixel clipping slivers.
PLANE_PRECISION = 10000
MIN_AREA = 1e-7


def cross_2d(a, b, p, axes):
    x, y = axes
    return (b[x] - a[x]) * (p[y] - a[y]) - (b[y] - a[y]) * (p[x] - a[x])


def area(polygon, axes):
    return sum(cross_2d(polygon[0], a, b, axes)
               for a, b in zip(polygon[1:], polygon[2:])) / 2


def plane(triangle):
    a, b, c = triangle
    x, y, z = (b[i] - a[i] for i in range(3))
    u, v, w = (c[i] - a[i] for i in range(3))
    normal = (y*w - z*v, z*u - x*w, x*v - y*u)
    axis = max(range(3), key=lambda i: abs(normal[i]))
    length = sqrt(sum(n*n for n in normal))
    if length == 0:
        raise ValueError('Degenerate input triangle')
    sign = 1 if normal[axis] > 0 else -1
    normal = tuple(sign * n / length for n in normal)
    distance = sum(a[i] * normal[i] for i in range(3))
    key = tuple(round(n * PLANE_PRECISION) for n in (*normal, distance))
    return key, tuple(i for i in range(3) if i != axis)


def split(polygon, a, b, axes, direction):
    inside, outside = [], []
    prev = polygon[-1]
    prev_side = direction * cross_2d(a, b, prev, axes)
    for vertex in polygon:
        side = direction * cross_2d(a, b, vertex, axes)
        if prev_side * side < 0:
            fraction = prev_side / (prev_side - side)
            point = tuple(p + (q - p) * fraction for p, q in zip(prev, vertex))
            inside.append(point)
            outside.append(point)
        if side >= 0:
            inside.append(vertex)
        if side <= 0:
            outside.append(vertex)
        prev, prev_side = vertex, side
    return inside, outside


def subtract(polygon, blocker, axes, minimum_area):
    """Partition the polygon along a triangle, dropping only its covered area."""
    direction = 1 if area(blocker, axes) > 0 else -1
    inside = polygon
    remainder = []
    for a, b in zip(blocker, blocker[1:] + blocker[:1]):
        inside, outside = split(inside, a, b, axes, direction)
        if abs(area(inside, axes)) <= minimum_area:
            return [polygon], False
        if abs(area(outside, axes)) > minimum_area:
            remainder.append(outside)
    return remainder, True


def remove_overlaps(triangles, minimum_area=MIN_AREA):
    """Keep each occupied patch once, with smaller detail faces taking priority."""
    planes = defaultdict(list)
    for index, triangle in enumerate(triangles):
        key, axes = plane(triangle)
        x, y = axes
        bounds = (min(p[x] for p in triangle), min(p[y] for p in triangle),
                  max(p[x] for p in triangle), max(p[y] for p in triangle))
        planes[key, axes].append((abs(area(triangle, axes)), index, bounds, triangle))

    result = list(triangles)
    clipped = 0
    for (_, axes), faces in planes.items():
        blockers = []
        for _, index, bounds, triangle in sorted(faces):
            x0, y0, x1, y1 = bounds
            pieces = [triangle]
            changed = False
            for (bx0, by0, bx1, by1), blocker in blockers:
                if bx1 <= x0 or bx0 >= x1 or by1 <= y0 or by0 >= y1:
                    continue
                remaining = []
                for piece in pieces:
                    uncovered, overlap = subtract(piece, blocker, axes, minimum_area)
                    changed |= overlap
                    remaining.extend(uncovered)
                pieces = remaining
                if not pieces:
                    break
            blockers.append((bounds, triangle))
            if changed:
                clipped += 1
                result[index] = None
                for piece in pieces:
                    for a, b in zip(piece[1:], piece[2:]):
                        if abs(cross_2d(piece[0], a, b, axes)) > 2 * minimum_area:
                            result.append((piece[0], a, b))
    return [face for face in result if face is not None], clipped


if __name__ == '__main__':
    import sys
    from pathlib import Path

    # Audit the actual float32 positions read by the Java geometry check.
    parts = defaultdict(list)
    for line in Path(sys.argv[1]).read_text(encoding='utf-8').splitlines()[1:]:
        group, *vertices = line.split('\t')
        parts[group].append(tuple(tuple(map(float, vertex.split(','))) for vertex in vertices))
    # Float32 rounding at a clipped shared edge can leave a microscopic sliver.
    overlaps = {group: remove_overlaps(faces, minimum_area=1e-6)[1]
                for group, faces in parts.items()}
    if any(overlaps.values()):
        raise SystemExit(f'Overlapping MG36 faces: {overlaps}')
    print(f'No coplanar overlaps above float32 edge tolerance in {len(parts)} Java-loaded MG36 groups.')
