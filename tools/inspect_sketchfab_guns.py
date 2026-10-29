import json
import struct
import zipfile
from pathlib import Path

import numpy as np


ARCHIVES = [
    "hs_produkt_vhs-2_rifle", "low-poly_m1911", "low-poly_dragunov_svd",
    "low-poly_ak-308", "m240_low-poly", "barrett_ssrs",
]


def load_archive(name):
    z = zipfile.ZipFile(Path.home() / "Downloads" / (name + ".zip"))
    gltf = json.loads(z.read("scene.gltf"))
    binary = z.read("scene.bin")
    return z, gltf, binary


def accessor(gltf, binary, index):
    a = gltf["accessors"][index]
    v = gltf["bufferViews"][a["bufferView"]]
    types = {5120: "b", 5121: "B", 5122: "h", 5123: "H", 5125: "I", 5126: "f"}
    components = {"SCALAR": 1, "VEC2": 2, "VEC3": 3, "VEC4": 4}[a["type"]]
    fmt = "<" + types[a["componentType"]] * components
    stride = v.get("byteStride", struct.calcsize(fmt))
    start = v.get("byteOffset", 0) + a.get("byteOffset", 0)
    return np.array([struct.unpack_from(fmt, binary, start + i * stride)
                     for i in range(a["count"])], dtype=float)


def matrix(node):
    if "matrix" in node:
        return np.array(node["matrix"]).reshape((4, 4)).T
    t = np.eye(4)
    t[:3, 3] = node.get("translation", [0, 0, 0])
    x, y, z, w = node.get("rotation", [0, 0, 0, 1])
    r = np.array([
        [1 - 2 * (y*y + z*z), 2 * (x*y - z*w), 2 * (x*z + y*w)],
        [2 * (x*y + z*w), 1 - 2 * (x*x + z*z), 2 * (y*z - x*w)],
        [2 * (x*z - y*w), 2 * (y*z + x*w), 1 - 2 * (x*x + y*y)],
    ])
    t[:3, :3] = r @ np.diag(node.get("scale", [1, 1, 1]))
    return t


def scene_meshes(gltf, binary):
    def walk(index, parent):
        node = gltf["nodes"][index]
        world = parent @ matrix(node)
        if "mesh" in node:
            mesh = gltf["meshes"][node["mesh"]]
            for primitive in mesh["primitives"]:
                attrs = primitive["attributes"]
                pos = accessor(gltf, binary, attrs["POSITION"])
                pos = (np.column_stack((pos, np.ones(len(pos)))) @ world.T)[:, :3]
                normal = accessor(gltf, binary, attrs["NORMAL"]) if "NORMAL" in attrs else None
                if normal is not None:
                    normal = normal @ np.linalg.inv(world[:3, :3])
                    normal /= np.linalg.norm(normal, axis=1)[:, None]
                uv = accessor(gltf, binary, attrs["TEXCOORD_0"]) if "TEXCOORD_0" in attrs else None
                indices = accessor(gltf, binary, primitive["indices"]).astype(int).ravel() if "indices" in primitive else np.arange(len(pos))
                yield mesh.get("name", node.get("name", "mesh")), primitive.get("material", 0), pos, normal, uv, indices.reshape((-1, 3))
        for child in node.get("children", []):
            yield from walk(child, world)
    for root in gltf["scenes"][gltf.get("scene", 0)]["nodes"]:
        yield from walk(root, np.eye(4))


if __name__ == "__main__":
    for name in ARCHIVES:
        z, g, b = load_archive(name)
        meshes = list(scene_meshes(g, b))
        all_pos = np.concatenate([m[2] for m in meshes])
        print(name, "bounds", np.round(all_pos.min(axis=0), 3), np.round(all_pos.max(axis=0), 3), "faces", sum(len(m[5]) for m in meshes))
        for m in meshes:
            if any(word in m[0].lower() for word in ("barrel", "muzzle", "slide", "stock", "grip")):
                print(" ", m[0], np.round(m[2].mean(axis=0), 3))
