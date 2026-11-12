#!/usr/bin/env python3
"""Compile the production GLSL strings and exercise native/LOD coverage on macOS CGL."""
import json
import re
import subprocess
import tempfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
JAVA = ROOT / "src/main/java/com/flansmod/client"


def constant(source, name, dependencies=None):
    body = source.split("String " + name + " =", 1)[1]
    # The Java strings contain GLSL semicolons; find the Java terminator outside strings.
    tokens = re.finditer(r'"(?:\\.|[^"\\])*"|//[^\n]*|/\*[\s\S]*?\*/|[A-Za-z_][A-Za-z_0-9.]*|;', body)
    result = ""
    for token in tokens:
        value = token.group()
        if value.startswith(("//", "/*")):
            continue
        if value == ";":
            return result
        if value.startswith('"'):
            result += json.loads(value)
        elif dependencies and value in dependencies:
            result += dependencies[value]
    raise ValueError("Unterminated Java constant " + name)


depth = constant((JAVA / "PlayerLodDepthLayer.java").read_text(), "DEPTH_FUNCTION")
source = (JAVA / "DistantCameraGeometry.java").read_text()
depth = constant(source, "DEPTH", {"PlayerLodDepthLayer.DEPTH_FUNCTION": depth})
fog = constant((JAVA / "CameraDhFog.java").read_text(), "SHADER")
with tempfile.TemporaryDirectory(prefix="fmur-scope-terrain-") as temporary:
    work = Path(temporary)
    for name, extension in [("VERTEX", "vsh"), ("FRAGMENT", "fsh")]:
        (work / ("terrain." + extension)).write_text(constant(source, name, {"DEPTH": depth, "CameraDhFog.SHADER": fog}))
    executable = work / "scope-terrain-check"
    subprocess.run(["clang", "-Wno-deprecated-declarations", str(Path(__file__).with_name("scope_terrain_gl_test.c")),
                    "-framework", "OpenGL", "-o", str(executable)], check=True)
    subprocess.run([str(executable), str(work / "terrain.vsh"), str(work / "terrain.fsh")], check=True)
