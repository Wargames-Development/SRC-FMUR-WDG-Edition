"""Convert the supplied TaP Modeling Toolbox archives into pack models and items.

Run with --assets-root pointing to the user's FMUR Assets directory. Output is
kept under development_assets/tap_new_armor for review and pack installation.
"""

import argparse
import collections
import hashlib
import io
from pathlib import Path
import re
import zipfile

import numpy as np
from PIL import Image


ROOT = Path(__file__).resolve().parents[1]
OUTPUT = ROOT / "development_assets" / "tap_new_armor"
GROUPS = ("headModel", "bodyModel", "leftArmModel", "rightArmModel",
          "leftLegModel", "rightLegModel", "skirtFrontModel", "skirtRearModel")
PIVOTS = ((0, 0, 0), (0, 0, 0), (5, 2, 0), (-5, 2, 0),
          (2, 12, 0), (-2, 12, 0), (0, 12, 0), (0, 12, 0))

SOURCES = {
    "est_h": "4-22-2026 INVALID ARCHIVE/4-22-2026 INVALID ARCHIVE/high priority/estonia tier 4.5/ModelEstoniatier5helm.mtb",
    "est_u": "4-22-2026 INVALID ARCHIVE/4-22-2026 INVALID ARCHIVE/high priority/estonia tier 4.5/ModelEstoniatier5uniform.mtb",
    "est_v": "4-22-2026 INVALID ARCHIVE/4-22-2026 INVALID ARCHIVE/high priority/estonia tier 4.5/ModelEstoniatier5vest.mtb",
    "kor_h": "asia/asia/korea/south korea modern/Modelsorktier 4.5helmet.mtb",
    "kor_u": "asia/asia/korea/south korea modern/Modelsorktier 4.5uniform.mtb",
    "kor_v": "asia/asia/korea/south korea modern/Modelsorktier 5.mtb",
    "jpn_h": "asia/asia/japan/ModeljapfangcamoM1HELMET.mtb",
    "jpn_u": "asia/asia/japan/ModeljapfangcamoUNIFORM.mtb",
    "jpn_v": "asia/asia/japan/Modelballistic combat vest mk1.mtb",
    "cro_h": "aug2026invalid/aug2026invalid/uniforms/modern/croatiamodern/ModelCroatiaModernHELMET.mtb",
    "cro_u": "aug2026invalid/aug2026invalid/uniforms/modern/croatiamodern/ModelCroatiaModernUNIFORM.mtb",
    "cro_v": "aug2026invalid/aug2026invalid/uniforms/modern/croatiamodern/ModelCroatiaModernVEST.mtb",
    "op_h": "aug2026invalid/aug2026invalid/uniforms/modern/operator outfit/Modeloperatorfasthelmet.mtb",
    "op_u": "aug2026invalid/aug2026invalid/uniforms/modern/operator outfit/Modeloperatoroutfit.mtb",
    "op_v": "aug2026invalid/aug2026invalid/uniforms/modern/operator outfit/Modeloperatorplatecarrier.mtb",
    "pol_h": "aug2026invalid/aug2026invalid/uniforms/modern/polish tier 4/ModelPolish wz.93 PASGT helmet.mtb",
    "pol_u": "aug2026invalid/aug2026invalid/uniforms/modern/polish tier 4/ModelPolish wz.93 body.mtb",
    "pol_v": "aug2026invalid/aug2026invalid/uniforms/modern/polish tier 4/ModelPolish wz.93 OCHRA vest.mtb",
    "ser_h": "aug2026invalid/aug2026invalid/uniforms/modern/serbia tier 5/Modelserbiatier5helmet.mtb",
    "ser_u": "aug2026invalid/aug2026invalid/uniforms/modern/serbia tier 5/Modelserbiatier5uniform.mtb",
    "ser_v": "aug2026invalid/aug2026invalid/uniforms/modern/serbia tier 5/Modelserbiatier5vest.mtb",
    "clone_h": "aug2026invalid/aug2026invalid/uniforms/star wars/republic/ModelPhase2CloneHelmet.mtb",
    "clone_u": "aug2026invalid/aug2026invalid/uniforms/star wars/republic/ModelPhase2CloneBody.mtb",
    "mex_h": "americas/americas/mexico/Modelmexico helmet.mtb",
    "mex_u": "americas/americas/mexico/Modelmexico uniform.mtb",
    "mex_v": "americas/americas/mexico/Modelmexico vest.mtb",
    "rom_h": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/romania tier 5/Modelromania M2017helmet.mtb",
    "rom_u": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/romania tier 5/Modelromania M2017uniform.mtb",
    "rom_v": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/romania tier 5/Modelromania M2017vest.mtb",
    "den_h": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/denmark tier 4/ModelDanish m84 M96 helmet.mtb",
    "den_u": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/denmark tier 4/ModelDanish m84 uniform.mtb",
    "den_v": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/denmark tier 4/ModelDanish m84 M00 fragmentation vest.mtb",
    "bel_u": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/belarus tier 4.5/Modelbelarusmodernvkbo.mtb",
    "bel_v": "4-22-2026 INVALID ARCHIVE (1)/4-22-2026 INVALID ARCHIVE/high priority/belarus tier 4.5/Modelbelarusmodern6b13.mtb",
    "tank_h": "europe/europe/russia/Tanker hat.mtb",
}

# Name, short name, model key, texture source, item kind, description.
ITEMS = [
    ("Estonian Helmet", "tapEstoniaT5Helmet", "EstoniaHelmet", "est_h", "helmet", "Estonian Combat Helmet_Year: Unknown_Estonian Woodland"),
    ("Estonian Uniform", "tapEstoniaT5Uniform", "EstoniaUniform", "est_u", "uniform", "Estonian Battle Dress_Year: Unknown_Estonian Woodland"),
    ("Estonian Vest", "tapEstoniaT5Vest", "EstoniaVest", "est_v", "vest", "Estonian Body Armour_Year: Unknown_Estonian Woodland"),
    ("Estonian Snow Helmet", "tapEstoniaSnowHelmet", "EstoniaHelmet", "est_snow", "helmet", "Estonian Combat Helmet_Year: Unknown_Snow Digital"),
    ("Estonian Snow Uniform", "tapEstoniaSnowUniform", "EstoniaUniform", "est_snow", "uniform", "Estonian Battle Dress_Year: Unknown_Snow Digital"),
    ("Estonian Snow Vest", "tapEstoniaSnowVest", "EstoniaVest", "est_snow", "vest", "Estonian Body Armour_Year: Unknown_Snow Digital"),
    ("South Korean Helmet", "tapKorea45Helmet", "KoreaHelmet", "kor_h", "helmet", "South Korean Combat Helmet_Year: Unknown_Digital Camouflage"),
    ("South Korean Uniform", "tapKorea45Uniform", "KoreaUniform", "kor_u", "uniform", "South Korean Battle Dress_Year: Unknown_Digital Camouflage"),
    ("South Korean Vest", "tapKorea45Vest", "KoreaVest", "kor_v", "vest", "South Korean Body Armour_Year: Unknown_Digital Camouflage"),
    ("Japanese Fang M1 Helmet", "tapJapanFangHelmet", "JapanHelmet", "jpn_h", "helmet", "Japanese Combat Helmet_Year: 1941_Fang Camouflage"),
    ("Japanese Fang Uniform", "tapJapanFangUniform", "JapanUniform", "jpn_u", "uniform", "Japanese Battle Dress_Year: Unknown_Fang Camouflage"),
    ("Japanese Ballistic Combat Vest Mk1", "tapJapanVestMk1", "JapanVest", "jpn_v", "vest", "Japanese Body Armour_Year: Unknown_Woodland Camouflage"),
    ("Croatian Modern Helmet", "tapCroatiaHelmet", "CroatiaHelmet", "cro_h", "helmet", "Croatian Combat Helmet_Year: Unknown_Croatian Woodland"),
    ("Croatian Modern Uniform", "tapCroatiaUniform", "CroatiaUniform", "cro_u", "uniform", "Croatian Battle Dress_Year: Unknown_Croatian Woodland"),
    ("Croatian Modern Vest", "tapCroatiaVest", "CroatiaVest", "cro_v", "vest", "Croatian Body Armour_Year: Unknown_Croatian Woodland"),
    ("Operator FAST Helmet", "tapOperatorHelmet", "OperatorHelmet", "op_h", "helmet", "Operator Combat Helmet_Year: Unknown_Olive Drab"),
    ("Operator Outfit", "tapOperatorOutfit", "OperatorUniform", "op_u", "uniform", "Operator Battle Dress_Year: Unknown_Grey Tactical Fabric"),
    ("Operator Plate Carrier", "tapOperatorCarrier", "OperatorVest", "op_v", "vest", "Operator Body Armour_Year: Unknown_Olive Drab"),
    ("Polish wz.93 PASGT Helmet", "tapPolandHelmet", "PolandHelmet", "pol_h", "helmet", "Polish Combat Helmet_Year: 1993_wz.93 Pantera"),
    ("Polish wz.93 Uniform", "tapPolandUniform", "PolandUniform", "pol_u", "uniform", "Polish Battle Dress_Year: 1993_wz.93 Pantera"),
    ("Polish wz.93 OCHRA Vest", "tapPolandVest", "PolandVest", "pol_v", "vest", "Polish Body Armour_Year: Unknown_wz.93 Pantera"),
    ("Serbian Helmet", "tapSerbiaT5Helmet", "SerbiaHelmet", "ser_h", "helmet", "Serbian Combat Helmet_Year: Unknown_Serbian Woodland"),
    ("Serbian Uniform", "tapSerbiaT5Uniform", "SerbiaUniform", "ser_u", "uniform", "Serbian Battle Dress_Year: Unknown_Serbian Woodland"),
    ("Serbian Vest", "tapSerbiaT5Vest", "SerbiaVest", "ser_v", "vest", "Serbian Body Armour_Year: Unknown_Olive Drab"),
    ("Phase II Clone Helmet", "tapClonePhase2Helmet", "CloneHelmet", "clone_h", "helmet", "Republic Combat Helmet_Year: Unknown_White Armour"),
    ("Phase II Clone Body Armour", "tapClonePhase2Body", "CloneBody", "clone_u", "uniform", "Republic Battle Armour_Year: Unknown_White Armour"),
    ("Mexican Combat Helmet", "tapMexicoHelmet", "MexicoHelmet", "mex_h", "helmet", "Mexican Combat Helmet_Year: Unknown_Mexican Woodland"),
    ("Mexican Combat Uniform", "tapMexicoUniform", "MexicoUniform", "mex_u", "uniform", "Mexican Battle Dress_Year: Unknown_Mexican Woodland"),
    ("Mexican Combat Vest", "tapMexicoVest", "MexicoVest", "mex_v", "vest", "Mexican Body Armour_Year: Unknown_Mexican Woodland"),
    ("Romanian M2017 Helmet", "tapRomaniaHelmet", "RomaniaHelmet", "rom_h", "helmet", "Romanian Combat Helmet_Year: 2017_M2017 Camouflage"),
    ("Romanian M2017 Uniform", "tapRomaniaUniform", "RomaniaUniform", "rom_u", "uniform", "Romanian Battle Dress_Year: 2017_M2017 Camouflage"),
    ("Romanian M2017 Vest", "tapRomaniaVest", "RomaniaVest", "rom_v", "vest", "Romanian Body Armour_Year: 2017_M2017 Camouflage"),
    ("Danish M96 Helmet", "tapDenmarkHelmet", "DenmarkHelmet", "den_h", "helmet", "Danish Combat Helmet_Year: 1996_M84 Camouflage"),
    ("Danish M84 Uniform", "tapDenmarkUniform", "DenmarkUniform", "den_u", "uniform", "Danish Battle Dress_Year: 1984_M84 Camouflage"),
    ("Danish M00 Fragmentation Vest", "tapDenmarkVest", "DenmarkVest", "den_v", "vest", "Danish Fragmentation Vest_Year: 2000_M84 Camouflage"),
    ("Belarusian VKBO Uniform", "tapBelarusUniform", "BelarusUniform", "bel_u", "uniform", "Belarusian Battle Dress_Year: Unknown_EMR Camouflage"),
    ("Belarusian 6B13 Vest", "tapBelarusVest", "BelarusVest", "bel_v", "vest", "Belarusian Body Armour_Year: Unknown_EMR Camouflage"),
    ("Russian Tanker Hat", "tapTankerHat", "TankerHat", "tank_h", "helmet", "Russian Tanker Hat_Year: Unknown_Black"),
    ("Ghillie Hood", "tapGhillieHood", "GhillieHelmet", "ghillie", "helmet", "Ghillie Hood_Year: Unknown_Woodland Camouflage"),
    ("Ghillie Suit", "tapGhillieSuit", "GhillieSuit", "ghillie", "uniform", "Ghillie Suit_Year: Unknown_Woodland Camouflage"),
    ("Snow Ghillie Hood", "tapSnowGhillieHood", "GhillieHelmet", "ghillie_snow", "helmet", "Snow Ghillie Hood_Year: Unknown_Snow Digital"),
    ("Snow Ghillie Suit", "tapSnowGhillieSuit", "GhillieSuit", "ghillie_snow", "uniform", "Snow Ghillie Suit_Year: Unknown_Snow Digital"),
    ("White Balaclava", "tapWhiteBalaclava", "NewArmor.BalaclavaEye", "balaclava_white", "face", "White Balaclava_Year: Unknown_Snow White"),
]

OBSOLETE_ITEMS = ("tapKoreaT5Helmet", "tapKoreaT5Uniform", "tapKoreaT5Vest",
                  "tapCryeCarrier", "tapGhillieBoots")

MODELS = {
    "EstoniaHelmet": "est_h", "EstoniaUniform": "est_u", "EstoniaVest": "est_v",
    "KoreaHelmet": "kor_h", "KoreaUniform": "kor_u", "KoreaVest": "kor_v",
    "JapanHelmet": "jpn_h", "JapanUniform": "jpn_u", "JapanVest": "jpn_v",
    "CroatiaHelmet": "cro_h", "CroatiaUniform": "cro_u", "CroatiaVest": "cro_v",
    "OperatorHelmet": "op_h", "OperatorUniform": "op_u", "OperatorVest": "op_v",
    "PolandHelmet": "pol_h", "PolandUniform": "pol_u", "PolandVest": "pol_v",
    "SerbiaHelmet": "ser_h", "SerbiaUniform": "ser_u", "SerbiaVest": "ser_v",
    "CloneHelmet": "clone_h", "CloneBody": "clone_u",
    "MexicoHelmet": "mex_h", "MexicoUniform": "mex_u", "MexicoVest": "mex_v",
    "RomaniaHelmet": "rom_h", "RomaniaUniform": "rom_u", "RomaniaVest": "rom_v",
    "DenmarkHelmet": "den_h", "DenmarkUniform": "den_u", "DenmarkVest": "den_v",
    "BelarusUniform": "bel_u", "BelarusVest": "bel_v",
    "TankerHat": "tank_h",
}


def number(value):
    return float(value.replace(",", "."))


def literal(value):
    value = number(value) if isinstance(value, str) else value
    if abs(value) < 1e-8:
        value = 0.0
    return f"{value:.8g}F"


def archive_data(path):
    with zipfile.ZipFile(path) as archive:
        text = archive.read("Model.txt").decode("utf-8-sig").splitlines()
        image = archive.read("Model.png")
    values = dict(line.split("|", 1) for line in text if "|" in line and not line.startswith("Element|"))
    elements = [line.split("|") for line in text if line.startswith("Element|")]
    return int(values["TexSizeX"]), int(values["TexSizeY"]), elements, image


def snow_texture(image):
    original = np.asarray(Image.open(io.BytesIO(image)).convert("RGBA"), dtype=np.uint8).copy()
    pattern = Image.open(OUTPUT / "source" / "estonia_snow_camo.png").convert("RGB")
    pattern = np.asarray(pattern.resize((128, 192), Image.Resampling.NEAREST), dtype=np.uint8)
    height, width = original.shape[:2]
    tiled = pattern[np.arange(height)[:, None] % 192, np.arange(width)[None, :] % 128]
    rgb = original[:, :, :3]
    # Preserve black/grey hardware and the blue-black-white Estonian flag.
    olive = ((original[:, :, 3] > 0) & (rgb[:, :, 1] > rgb[:, :, 2] * 1.08)
             & (rgb[:, :, 1] > rgb[:, :, 0] * 0.8) & (rgb[:, :, 1] > 22))
    olive[1200:1460, 638:1016] |= original[1200:1460, 638:1016, 3] > 0
    original[:, :, :3][olive] = tiled[olive]
    result = io.BytesIO()
    Image.fromarray(original, "RGBA").save(result, format="PNG")
    return result.getvalue()


def snow_ghillie_texture(image):
    original = np.asarray(Image.open(io.BytesIO(image)).convert("RGBA"), dtype=np.uint8).copy()
    pattern = Image.open(OUTPUT / "source" / "estonia_snow_camo.png").convert("RGB")
    pattern = np.asarray(pattern.resize((96, 96), Image.Resampling.NEAREST), dtype=np.uint8)
    y, x = np.indices(original.shape[:2])
    camo = pattern[y % 96, x % 96].astype(np.float32)
    # Snow white with the supplied grey digital shapes; retain the original foliage shading.
    shade = original[:, :, :3].mean(axis=2).astype(np.float32) / 255.0
    brightness = 0.88 + 0.12 * shade
    original[:, :, :3] = np.clip(camo * brightness[:, :, None], 0, 255).astype(np.uint8)
    result = io.BytesIO()
    Image.fromarray(original, "RGBA").save(result, format="PNG")
    return result.getvalue()


def white_balaclava_texture(image):
    original = np.asarray(Image.open(io.BytesIO(image)).convert("RGBA"), dtype=np.uint8).copy()
    original[original[:, :, 3] > 0, :3] = (236, 240, 242)
    result = io.BytesIO()
    Image.fromarray(original, "RGBA").save(result, format="PNG")
    return result.getvalue()


def write_ghillie_models(source):
    start = source.index("public class Ghillie extends ModelBiped")
    source = source[start:].replace("public class Ghillie extends ModelBiped",
                                    "public class ModelGhillieBase extends ModelCustomArmour")
    source = "\n".join(line for line in source.splitlines()
                       if not line.lstrip().startswith("//")) + "\n"
    source = source.replace("    public Ghillie() {", "    public ModelGhillieBase(int part) {")
    source = source.replace("super(0.02f, 0, 115, 115);", "super();\n        this.part = part;")
    source = source.replace(", false)", ")")
    # Content-pack classes are not reobfuscated with the mod jar. Avoid direct
    # ModelBox and cubeList references, which only resolve in the dev environment.
    source = re.sub(r"(\w+)\.cubeList\.add\(new ModelBox\(\1, (\d+), (\d+), (.*?)\)\);",
                    lambda match: (f"{match[1]}.setTextureOffset({match[2]}, {match[3]});\n"
                                   f"        {match[1]}.addBox({match[4]});"), source)
    if "new ModelBox(" in source or ".cubeList" in source:
        raise ValueError("Ghillie model still references dev-only Minecraft fields")
    for name in ("leftarm_ghillie", "rightarm_ghillie"):
        source = re.sub(rf"({name}\.addBox\([^\n]*4, 12, 4, )0\.0F\);",
                        r"\g<1>0.15F);", source)
        source = re.sub(rf"({name}\.addBox\([^\n]*4, 9, 4, )0\.1F\);",
                        r"\g<1>0.25F);", source)
    for name in ("leftleg_ghillie", "rightleg_ghillie"):
        source = re.sub(rf"({name}\.addBox\([^\n]*4, 12, 4, )0\.13F\);",
                        r"\g<1>0.25F);", source)
    source = source.replace("        this.bipedHead.addChild(hood);",
                            "        this.bipedHead = new ModelRenderer(this);\n"
                            "        this.bipedBody = new ModelRenderer(this);\n"
                            "        this.bipedHead.addChild(hood);")
    render_start = source.index("    @Override\n    public void render(")
    render_end = source.index("    public void setRotationAngle", render_start)
    render = """    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        isSneak = entity.isSneaking();
        isRiding = entity.isRiding();
        ItemStack held = entity instanceof EntityLivingBase
                ? ((EntityLivingBase) entity).getEquipmentInSlot(0) : null;
        heldItemRight = held == null ? 0 : 1;
        aimedBow = false;
        if (held != null && entity instanceof EntityPlayer
                && ((EntityPlayer) entity).getItemInUseCount() > 0) {
            EnumAction action = held.getItemUseAction();
            if (action == EnumAction.block) heldItemRight = 3;
            if (action == EnumAction.bow) aimedBow = true;
        }
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (entity instanceof EntityPlayer) {
            Render renderer = RenderManager.instance.getEntityRenderObject(entity);
            if (renderer instanceof RenderPlayer) {
                ModelBiped playerModel = ((RenderPlayer) renderer).modelBipedMain;
                copyPose(playerModel.bipedHead, bipedHead);
                copyPose(playerModel.bipedBody, bipedBody);
                copyPose(playerModel.bipedLeftArm, bipedLeftArm);
                copyPose(playerModel.bipedRightArm, bipedRightArm);
                copyPose(playerModel.bipedLeftLeg, bipedLeftLeg);
                copyPose(playerModel.bipedRightLeg, bipedRightLeg);
            }
        }
        GL11.glPushMatrix();
        try {
            GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
            if (part == 0) {
                bipedHead.showModel = true;
                bipedHead.isHidden = false;
                bipedHead.render(f5);
            }
            if (part == 1) {
                bipedBody.showModel = true;
                bipedLeftArm.showModel = true;
                bipedRightArm.showModel = true;
                bipedLeftLeg.showModel = true;
                bipedRightLeg.showModel = true;
                bipedBody.isHidden = false;
                bipedLeftArm.isHidden = false;
                bipedRightArm.isHidden = false;
                bipedLeftLeg.isHidden = false;
                bipedRightLeg.isHidden = false;
                bipedBody.render(f5);
                bipedLeftArm.render(f5);
                bipedRightArm.render(f5);
                bipedLeftLeg.render(f5);
                bipedRightLeg.render(f5);
            }
        } finally {
            GL11.glPopMatrix();
        }
    }

    private void copyPose(ModelRenderer from, ModelRenderer to) {
        to.rotationPointX = from.rotationPointX;
        to.rotationPointY = from.rotationPointY;
        to.rotationPointZ = from.rotationPointZ;
        to.rotateAngleX = from.rotateAngleX;
        to.rotateAngleY = from.rotateAngleY;
        to.rotateAngleZ = from.rotateAngleZ;
    }

"""
    source = source[:render_start] + render + source[render_end:]
    source = source.replace("public class ModelGhillieBase extends ModelCustomArmour {",
                            "public class ModelGhillieBase extends ModelCustomArmour {\n    private final int part;")
    imports = ("package com.flansmod.client.model.NewTapArmor;\n\n"
               "import com.flansmod.client.model.ModelCustomArmour;\n"
               "import net.minecraft.client.model.ModelBiped;\n"
               "import net.minecraft.client.model.ModelRenderer;\n"
               "import net.minecraft.client.renderer.entity.Render;\n"
               "import net.minecraft.client.renderer.entity.RenderManager;\n"
               "import net.minecraft.client.renderer.entity.RenderPlayer;\n"
               "import net.minecraft.entity.Entity;\n"
               "import net.minecraft.entity.EntityLivingBase;\n"
               "import net.minecraft.entity.player.EntityPlayer;\n"
               "import net.minecraft.item.EnumAction;\n"
               "import net.minecraft.item.ItemStack;\n"
               "import org.lwjgl.opengl.GL11;\n\n")
    folder = ROOT / "src" / "main" / "java" / "com" / "flansmod" / "client" / "model" / "NewTapArmor"
    folder.mkdir(parents=True, exist_ok=True)
    (folder / "ModelGhillieBase.java").write_text(imports + source, encoding="utf-8")
    for name, part in (("Helmet", 0), ("Suit", 1)):
        wrapper = ("package com.flansmod.client.model.NewTapArmor;\n\n"
                   f"public class ModelGhillie{name} extends ModelGhillieBase {{\n"
                   f"    public ModelGhillie{name}() {{\n        super({part});\n    }}\n}}\n")
        (folder / f"ModelGhillie{name}.java").write_text(wrapper, encoding="utf-8")


def model_source(key, width, height, elements):
    by_group = collections.defaultdict(list)
    for fields in elements:
        group = int(fields[4])
        # The Croatian patch is positioned on the left arm but exported in the right arm group.
        if key == "CroatiaUniform" and group == 3 and number(fields[15]) + number(fields[6]) > 0:
            group = 2
        if group >= len(GROUPS) or fields[5] not in ("Box", "Shapebox"):
            raise ValueError(f"Unsupported element in {key}: {fields[:6]}")
        if number(fields[13]) != 0 or number(fields[14]) != 0:
            raise ValueError(f"Unconverted element rotation in {key}: {fields[:20]}")
        by_group[group].append(fields)
    lines = ["package com.flansmod.client.model.NewTapArmor;", "",
             "import com.flansmod.client.model.ModelCustomArmour;",
             "import com.flansmod.client.tmt.ModelRendererTurbo;", "",
             f"public class Model{key} extends ModelCustomArmour {{",
             f"    public Model{key}() {{"]
    for group, name in enumerate(GROUPS):
        items = by_group[group]
        if not items:
            continue
        lines.append(f"        {name} = new ModelRendererTurbo[{len(items)}];")
        px, py, pz = PIVOTS[group]
        for index, fields in enumerate(items):
            x = number(fields[15]) + number(fields[6]) - px
            if key == "KoreaVest":
                # The vest in the combined Tier 5 archive was authored 13 units left of the player.
                x += 13
            y = number(fields[16]) + number(fields[7]) - py
            z = number(fields[17]) + number(fields[8]) - pz
            offsets = [number(value) for value in fields[20:44]]
            args = [literal(v) for v in (x, y, z)] + fields[9:12] + [literal(fields[12])]
            args += [literal(offsets[i + axis * 8]) for i in range(8) for axis in range(3)]
            lines.append(f"        {name}[{index}] = new ModelRendererTurbo(this, {int(fields[18])}, {int(fields[19])}, {width}, {height});")
            lines.append(f"        {name}[{index}].addShapeBox({', '.join(args)});")
    lines += ["    }", "}", ""]
    return "\n".join(lines)


def definition(item, texture):
    name, short, model, _, kind, description = item
    type_name = {"helmet": "Helmet", "uniform": "Chest", "vest": "Pants", "boots": "Boots", "face": "Face"}[kind]
    defence = {"helmet": "0.2", "uniform": "0.3", "vest": "0.05", "boots": "0.05", "face": "0.0"}[kind]
    common = [f"Name {name}", f"ShortName {short}", f"Icon taparmor_{short}",
              "Colour 255 255 255", f"Type {type_name}", f"Defence {defence}",
              f"Model {model if '.' in model else 'NewTapArmor.' + model}", f"ArmourTexture {texture}"]
    if short in ("tapClonePhase2Helmet", "tapClonePhase2Body"):
        common += ["HideFromCreative true"]
    if kind in ("uniform", "vest", "boots"):
        common += ["MoveSpeedModifier 1.0", "KnockbackModifier 0.8"]
    if kind == "helmet":
        common += ["headArmor 200"]
    elif kind == "uniform":
        scale = "1.0" if short in ("tapGhillieSuit", "tapSnowGhillieSuit") else "1.05"
        common += ["bodyArmor 100", "armArmor 100", f"ModelScale {scale}"]
    elif kind == "vest":
        common += ["bodyArmor 300", "backArmor 300", "Durability 50", "ModelScale 1.05"]
    elif kind == "boots":
        common += ["Durability 50", "ModelScale 1.05"]
    common += [f"Description {description}"]
    return "\n".join(common) + "\n"


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--assets-root", type=Path, required=True)
    args = parser.parse_args()
    archives = {key: archive_data(args.assets_root / path) for key, path in SOURCES.items()}
    with zipfile.ZipFile(OUTPUT / "source" / "MWC Ghillie.zip") as ghillie:
        archives["ghillie"] = 115, 115, [], ghillie.read("ghillie.png")
        ghillie_source = ghillie.read("Ghillie.java").decode("utf-8-sig")
    archives["ghillie_snow"] = 115, 115, [], snow_ghillie_texture(archives["ghillie"][3])
    archives["balaclava_white"] = 64, 64, [], white_balaclava_texture(
        (OUTPUT / "source" / "balaclava_black.png").read_bytes())
    width, height, _, image = archives["est_h"]
    archives["est_snow"] = width, height, [], snow_texture(image)
    uniform_ids = {fields[2] for fields in archives["kor_u"][2]}
    for key, source in MODELS.items():
        width, height, elements, _ = archives[source]
        if key == "KoreaVest":
            elements = [fields for fields in elements if fields[4] == "1" and fields[2] not in uniform_ids]
        if key == "JapanVest":
            elements = [fields for fields in elements if number(fields[16]) + number(fields[7]) > -5.5]
        if not elements:
            raise ValueError(f"No elements for {key}")
        path = OUTPUT / "com" / "flansmod" / "client" / "model" / "NewTapArmor" / f"Model{key}.java"
        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text(model_source(key, width, height, elements), encoding="utf-8")
    write_ghillie_models(ghillie_source)
    images = {}
    for item in ITEMS:
        _, short, _, source, kind, _ = item
        image = archives[source][3]
        digest = hashlib.sha256(image).hexdigest()
        texture = images.setdefault(digest, "SkinTapNew" + source.replace("_", "").title())
        layer = "2" if kind == "vest" else "1"
        texture_path = OUTPUT / "assets" / "flansmod" / "armor" / f"{texture}_{layer}.png"
        texture_path.parent.mkdir(parents=True, exist_ok=True)
        if source != "est_snow" and texture_path.exists() and texture_path.read_bytes() != image:
            raise ValueError(f"Texture name collision: {texture_path}")
        texture_path.write_bytes(image)
        definition_path = OUTPUT / "armorFiles" / f"{short}.txt"
        definition_path.parent.mkdir(parents=True, exist_ok=True)
        definition_path.write_text(definition(item, texture), encoding="utf-8")
    for short in OBSOLETE_ITEMS:
        for path in (OUTPUT / "armorFiles" / f"{short}.txt",
                     OUTPUT / "assets" / "flansmod" / "textures" / "items" / f"taparmor_{short}.png"):
            path.unlink(missing_ok=True)
    for model in ("CryeCarrier", "GhillieChest", "GhillieBoots"):
        (OUTPUT / "com" / "flansmod" / "client" / "model" / "NewTapArmor"
         / f"Model{model}.java").unlink(missing_ok=True)
    (OUTPUT / "assets" / "flansmod" / "armor" / "SkinTapNewCryv_2.png").unlink(missing_ok=True)
    lang = OUTPUT / "lang_additions" / "en_US.lang"
    lang.parent.mkdir(parents=True, exist_ok=True)
    lang.write_text("".join(f"item.{short}.name={name}\n" for name, short, *_ in ITEMS), encoding="utf-8")
    print(f"Generated {len(MODELS)} armor model classes and {len(ITEMS)} armor definitions in {OUTPUT}")


if __name__ == "__main__":
    main()
