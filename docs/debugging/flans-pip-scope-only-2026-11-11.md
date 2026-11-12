# Flans scope-only shader provider

Status: implementation and automated checks complete; paired builds require in-game acceptance.

Pair:

- Angelica `2.2.14_X4`: `com.gtnewhorizons.angelica.api.FlansScope`, API version 1.
- FMUR `1.8.06_X205-pip-scope-test`: optional ShaderCamera provider on barrack-AngelicaAPI.

The old general SecondaryCamera attempt is no longer used. LightweightCamera matches e80debe exactly. The new provider is selected only for non-thermal Flans PiP lenses in Automatic/Quality mode, before the legacy wrapper temporarily suspends shaders. Missing/unsupported providers use that same original wrapper and lightweight renderer. Incomplete scene samples may retry; permanent API failures fall back safely.

The native scope scene uses private terrain lists and shader programs. Existing player/vehicle/distant terrain presentation remains a private forward layer with its original depth encoding, after shaderpack post-processing. Player and vehicle models are excluded from the native scene and submitted once in that layer. This does not add shaderpack material relighting to the established distant actor layer.

Thermal/FLIR, vehicle displays, Performance mode, server/network code, explosions, WGCore integration and DH/MCHELI source are unchanged by this patch. Angelica rejects writable outputs aliasing the main framebuffer or its textures and keeps public pipeline lookups on the primary pipeline. Scope-only hooks, phase state, frame clock, matrix histories, VAOs and render targets are disposed/restored under a render guard.

Build/check command (Java 8):

```
bash ./gradlew build -Pbranch=pip-scope-test -PmodBuildNumber=205 -I tools/player_lod_checks.gradle auxiliaryViewChecks playerLodChecks externalPlayerPresentationChecks --offline --console=plain
```

Passed: 35 auxiliary/selection checks, 10,110 player-LOD/projection/packet/contract checks, 2,030 external presentation checks. Jar runtime mapping checks pass. Angelica's full build also passes, including 577 root unit tests and five real OpenGL scope-isolation checks; six unrelated GL feature cases are skipped on this Mac.

API/backend limits: OpenGL sampler objects are required. Packs with custom image/storage buffers, or writes to borrowed shadow images, retain the lightweight camera. The log reports unsupported pack resources and logs the first successful private scope output. First use compiles private scope programs.

Acceptance order:

1. Fresh launch with the paired jars; enable shaders without opening a scope. Verify primary player and vehicle LODs, including motion trails, doubles and z-fighting.
2. Open/close a Flans PiP scope and recheck the main scene. Verify the scope native scene is shadered and its existing distant layer appears once.
3. Toggle shaders, resize, change shaderpacks, reconnect and change dimensions. Check NTM/native models as well as LODs.
4. Verify thermal, vehicle displays and Performance mode. Repeat the shadered tests on macOS and Windows.

Neither jar was installed automatically. Changes remain uncommitted for review. No in-game visual success is claimed from these automated checks.

## X206 follow-up: native/LOD scope terrain overlap

The X205 native scope scene is rendered through the pack, then borrowed DH terrain is submitted after pack post-processing with the existing auxiliary depth encoding. BountifulStars applies temporal jitter to its native terrain; the later borrowed terrain does not use that pack transform. Its circular near clipping also leaves overlap with native terrain (automatic DH overdraw uses a reduced near radius under shaders). Depth competition in that overlap is a concrete flaw; the user's complete visual report has not been reproduced locally.

X206 gives native scope geometry ownership of pixels where it wrote depth. Before the forward layer, `ShaderScopeScene` copies the private output's depth into a reusable, independently owned depth texture. The DH opaque and translucent terrain submissions discard covered pixels, retaining DH terrain where native geometry is absent. This avoids comparing overlapping native and auxiliary surfaces using incompatible transformations. The copy explicitly reads the current private draw framebuffer and restores the previous read binding. The terrain draw restores texture/sampler state on unit 3, and scope disposal deletes the copy. The original lightweight camera passes no coverage mask and retains its existing draw behavior.

This correction does not add pack material lighting to borrowed distant terrain. It does not alter primary shader rendering, player movement, terrain meshes, the circular clip setting, or thermal/vehicle camera selection. The independent native/LOD actor ownership correction is in DH X71; Angelica remains X4.

Validation:

- Java 8 `bash ./gradlew build -Pbranch=pip-scope-test -PmodBuildNumber=206 -I tools/player_lod_checks.gradle auxiliaryViewChecks playerLodChecks externalPlayerPresentationChecks --offline --console=plain`: passed; 35 auxiliary, 10,110 LOD and 2,030 presentation assertions. Production remapping and packaging passed.
- `python3 tools/render_checks/check_scope_terrain_gl.py`: 155 macOS offscreen OpenGL checks passed. The fixture extracts and compiles the actual production vertex/fragment shader strings, checks copied native-depth coverage over eight changing silhouettes, verifies native colour/depth survives, verifies empty pixels retain DH terrain, and checks the unmasked legacy mode. This fixture does not launch Minecraft or reproduce the full shaderpack.
- Final jar CRC passed. Compared with X205, only `DistantCameraGeometry`, `ShaderScopeScene` and the version-bearing `FlansMod` class changed among class files; no classes were added or removed.
- Artifact: `build/libs/FMUR-WDG-Edition-1.8.06_X206-pip-scope-test.jar`.
- SHA-256: `2bb65bd98e3befbb10688cd0d51db6f201f53b3b8fed1becd3197eaf5fdb7ae1`.

Both jars remain uninstalled and uncommitted. In-game acceptance must include stationary/moving scope terrain across the native/DH transition, foreground block edges, scope resizing/open/close, and the primary player/vehicle LOD tests before and after scope use. These bounded changes do not establish that every temporal ghost or distant-texture artifact is resolved.
