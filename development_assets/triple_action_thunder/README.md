# Triple Action Thunder

The `game_ready` directory contains an OBJ and a single texture atlas converted
from the supplied Sketchfab glTF. The OBJ includes the source vertex normals and
corrected face winding for the legacy loader; the model class renders the source
materials double-sided. `ATTRIBUTION.txt` contains the model author's
CC BY 4.0 credit and must accompany redistributions. The model has two static
meshes; the source animation does not contain a reload sequence.

The `content_pack` directory defines a single-shot .50 BMG pistol and its
one-round ammunition item. Handling and fire timing follow the BFMC Deagle 44:
55-tick reload, 6-tick shot delay, 0.3 accuracy, and semi-automatic fire.
Damage is 24, matching the BFMC M82A3's .50-caliber gun value. Recoil is set
to 24, three times the Deagle's 8, with stronger visual kick and variation.
Its round spawns 40 block fragments with wider spread; the shared decal renderer
gives .50 BMG impacts a larger bullet hole than pistol and rifle rounds.

The Thunder round uses the BFMC 14.5x114 AP round's inventory icon and bullet
model texture. Its caliber and damage values remain those of this gun's .50 BMG
round. English names are defined in the pack's `en_US.lang` file.

For the development instance, copy `content_pack` to
`eclipse/Flan/Triple Action Thunder` and copy `game_ready/TripleActionThunder.obj`
to `eclipse/Flan/BFMCpack/TripleActionThunder.obj`. The compiled
`ModelTripleActionThunder` class is in the mod JAR. Keep the BFMC Gun Pack
installed for the reused Deagle sounds and .50-caliber ammo icon.

In game, find `Triple Action Thunder` and `Triple Action .50 BMG Round` in the
creative inventory. Check the inventory icons, first-person position and
pistol-style hands, and third-person model,
fire once, confirm a second shot requires reloading, and compare hit damage and
recoil with the Deagle and M82A3. The static model has no animated breech or
visible round; alignment and animation need an in-game pass.
