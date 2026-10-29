# Sketchfab gun imports

The six models are converted from the user-provided glTF archives. `game_ready/`
contains their OBJ meshes, detachable magazine meshes where modeled, skin
atlases, inventory icons, and original Sketchfab attribution files. `definitions/` contains the new gun and grenade definitions
and English language entries.

Run `tools/install_sketchfab_guns.py` from this repository to copy these files
into the existing `eclipse/Flan/BFMC Gun Pack` runtime. OBJ files go into its
existing companion `eclipse/Flan/BFMCpack` model directory. No new content pack
is created.

The installer also consolidates the earlier Triple Action Thunder definition,
round, visuals, and English names from its `definitions/` source directory into
BFMC Gun Pack.

The VHS-2, M1911, Dragunov, AK-308, and SSRS use separate magazine meshes for
the built-in reload animation. The supplied M240 model has no detachable
magazine; it remains belt-fed in its content definition.

The active VHS-2 now uses the revised native TMT asset in
`development_assets/vhs2_custom`, with a separate 2048x2048 tan atlas and
attribution. Its original imported OBJ files are retained as reference assets.
The installer copies the revised skin/icon/credit; its native geometry is
packaged in the mod resources rather than loaded from the content pack's OBJ
directory. See the revised asset's README for generation and geometry checks.

Source licenses are copied verbatim into `BFMC Gun Pack/licenses/Sketchfab/`.
VHS-2, M1911, Dragunov SVD, AK-308, and M240 are marked CC BY 4.0 by their
source archives. The Barrett SSRS source is marked CC BY-NC-SA 4.0; retain its
attribution and license terms when sharing the model or pack.
