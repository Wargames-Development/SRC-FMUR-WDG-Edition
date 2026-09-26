param(
    [Parameter(Mandatory = $true)]
    [string]$SourceDirectory,

    [string]$DevelopmentPackDirectory = "development_assets/star_wars_guns/content_pack"
)

$ErrorActionPreference = "Stop"

Add-Type -AssemblyName System.IO.Compression.FileSystem

$models = @(
    # Muzzle points use rendered model units (Toolbox pixels divided by 16).
    @{ File = "ModelA280 blaster.mtb"; Class = "ModelA280Blaster"; Texture = "A280Blaster"; Scale = "1.2"; TranslateY = "1.5"; GunOffset = "-0.6"; GunOffsetX = "-1.0"; ZoomOffset = "0.25"; ZoomOffsetY = "-0.06"; ZoomOffsetZ = "0.08"; MuzzleFlashPoint = "1.3F, 0.3F, 0F"; Exclude = @(); PartAdjustments = @{} },
    @{ File = "Modeldc-15a.mtb"; Class = "ModelDC15A"; Texture = "DC15A"; Scale = "1.15"; TranslateY = "1.5"; GunOffset = "-0.6"; GunOffsetX = "-1.0"; ZoomOffset = "0.20"; ZoomOffsetY = "-0.15"; ZoomOffsetZ = "0.0"; MuzzleFlashPoint = "1.34375F, 0.334375F, 0F"; Exclude = @(); PartAdjustments = @{} },
    @{ File = "Modeldc15sCARBINE.mtb"; Class = "ModelDC15SCarbine"; Texture = "DC15SCarbine"; Scale = "1.25"; TranslateY = "1.5"; GunOffset = "-0.6"; GunOffsetX = "-1.0"; ZoomOffset = "0.14"; ZoomOffsetY = "-0.12"; ZoomOffsetZ = "0.0"; MuzzleFlashPoint = "0.84375F, 0.3375F, 0F"; LeftArmY = "2.0"; RightArmY = "-0.40"; Exclude = @(); PartAdjustments = @{} },
    @{ File = "Modele-11.mtb"; Class = "ModelE11"; Texture = "E11"; Scale = "0.3"; TranslateY = "2.0"; GunOffset = "-0.8"; GunOffsetX = "-1.0"; ZoomOffset = "0.25"; ZoomOffsetY = "0.08"; ZoomOffsetZ = "0.08"; MuzzleFlashPoint = "2.875F, 0.825F, 0F"; Exclude = @(145, 146, 147); PartAdjustments = @{} },
    @{ File = "ModelT-21.mtb"; Class = "ModelT21"; Texture = "T21"; Scale = "1.0"; TranslateY = "2.0"; GunOffset = "-0.7"; GunOffsetX = "-1.0"; ZoomOffset = "0.25"; ZoomOffsetY = "-0.015"; ZoomOffsetZ = "0.0"; MuzzleFlashPoint = "0.95F, 0.28125F, 0F"; Exclude = @(54, 55, 56, 58, 59, 60, 61, 62, 63, 64, 65); PartAdjustments = @{} }
)

$gunDefinitions = @(
    @{ File = "A280Blaster.txt"; Name = "A280 Blaster Rifle"; ShortName = "starWarsA280"; Model = "A280Blaster"; Texture = "A280Blaster"; Sound = "starwars_a280"; Scale = "1.2"; Damage = "24"; Rpm = "480"; Modes = "Burst"; Burst = "3"; BurstSoundOnce = $true; Recoil = "1.2"; Accuracy = "0.35"; MaxHeat = "190"; Heat = "11"; Cool = "0.8" },
    @{ File = "DC15A.txt"; Name = "DC-15A Blaster Rifle"; ShortName = "starWarsDC15A"; Model = "DC15A"; Texture = "DC15A"; Sound = "starwars_dc15a"; Scale = "1.15"; Damage = "16"; Rpm = "720"; Modes = "FullAuto"; Burst = $null; Recoil = "1.5"; Accuracy = "0.3"; MaxHeat = "180"; Heat = "7.5"; Cool = "0.8" },
    @{ File = "DC15SCarbine.txt"; Name = "DC-15S Blaster Carbine"; ShortName = "starWarsDC15S"; Model = "DC15SCarbine"; Texture = "DC15SCarbine"; Sound = "starwars_dc15s"; Scale = "1.25"; Damage = "31"; Rpm = "420"; Modes = "FullAuto SemiAuto"; Burst = $null; Recoil = "1.0"; Accuracy = "0.55"; MaxHeat = "200"; Heat = "15.5"; Cool = "0.9" },
    @{ File = "E11.txt"; Name = "E-11 Blaster Rifle"; ShortName = "starWarsE11"; Model = "E11"; Texture = "E11"; Sound = "starwars_e11"; Scale = "0.3"; Damage = "21"; Rpm = "620"; Modes = "FullAuto SemiAuto"; Burst = $null; Recoil = "1.2"; Accuracy = "0.6"; MaxHeat = "200"; Heat = "10"; Cool = "0.9" },
    @{ File = "T21.txt"; Name = "T-21 Heavy Blaster"; ShortName = "starWarsT21"; Model = "T21"; Texture = "T21"; Sound = "starwars_t21"; Scale = "1.0"; Damage = "30"; Rpm = "390"; Modes = "Burst"; Burst = "3"; Recoil = "2.0"; Accuracy = "0.55"; MaxHeat = "160"; Heat = "16"; Cool = "0.7" }
)

$pictureInPictureDefinitions = @{
    # Put the PiP plane just in front of each opaque rear lens face. Using the
    # volume center lets the original colored polygon win the depth test.
    A280Blaster = @{ Coordinates = "0.29 6.725 0.0 0.65"; Magnification = "2.0" }
    E11 = @{ Coordinates = "-2.71 18.2 0.0 1.1"; Magnification = "1.5" }
}

$obsoleteOutputs = @(
    "src/main/java/com/flansmod/client/model/BFMCpack/ModelDH17.java",
    "src/main/java/com/flansmod/client/model/BFMCpack/ModelDL44.java",
    "src/main/java/com/flansmod/client/model/BFMCpack/ModelE5.java",
    (Join-Path $DevelopmentPackDirectory "guns/DH17.txt"),
    (Join-Path $DevelopmentPackDirectory "guns/DL44.txt"),
    (Join-Path $DevelopmentPackDirectory "guns/E5.txt"),
    (Join-Path $DevelopmentPackDirectory "bullets/LightPowerCell.txt"),
    (Join-Path $DevelopmentPackDirectory "bullets/StandardPowerCell.txt"),
    (Join-Path $DevelopmentPackDirectory "bullets/HeavyPowerCell.txt"),
    (Join-Path $DevelopmentPackDirectory "assets/flansmod/skins/StarWars/DH17.png"),
    (Join-Path $DevelopmentPackDirectory "assets/flansmod/skins/StarWars/DL44.png"),
    (Join-Path $DevelopmentPackDirectory "assets/flansmod/skins/StarWars/E5.png"),
    (Join-Path $DevelopmentPackDirectory "assets/flansmod/textures/items/StarWars/DH17.png"),
    (Join-Path $DevelopmentPackDirectory "assets/flansmod/textures/items/StarWars/DL44.png"),
    (Join-Path $DevelopmentPackDirectory "assets/flansmod/textures/items/StarWars/E5.png"),
    (Join-Path $DevelopmentPackDirectory "assets/flansmod/sounds/starwars_e5.ogg")
)
foreach ($obsoleteOutput in $obsoleteOutputs) {
    if (Test-Path -LiteralPath $obsoleteOutput) {
        Remove-Item -LiteralPath $obsoleteOutput -Force
    }
}

function Read-ZipEntryText([System.IO.Compression.ZipArchive]$Zip, [string]$Name) {
    $entry = $Zip.GetEntry($Name)
    if ($null -eq $entry) {
        throw "Archive is missing $Name"
    }
    $reader = New-Object System.IO.StreamReader($entry.Open())
    try {
        return $reader.ReadToEnd()
    } finally {
        $reader.Dispose()
    }
}

function Parse-Number([string]$Value) {
    return [double]::Parse($Value.Replace(',', '.'), [Globalization.CultureInfo]::InvariantCulture)
}

function Format-Float([double]$Value) {
    if ([Math]::Abs($Value) -lt 0.0000001) {
        $Value = 0
    }
    return $Value.ToString("0.######", [Globalization.CultureInfo]::InvariantCulture) + "F"
}

function Format-Size([string]$Value) {
    $number = Parse-Number $Value
    if ([Math]::Abs($number - [Math]::Round($number)) -gt 0.0000001) {
        throw "ModelRendererTurbo requires an integral box size, but found '$Value'."
    }
    return ([int][Math]::Round($number)).ToString([Globalization.CultureInfo]::InvariantCulture)
}

function Write-Utf8File([string]$Path, [string]$Text) {
    $parent = Split-Path -Parent $Path
    if ($parent) {
        New-Item -ItemType Directory -Force -Path $parent | Out-Null
    }
    [System.IO.File]::WriteAllText($Path, $Text, (New-Object System.Text.UTF8Encoding($false)))
}

function Write-ModelClass($Spec, [string]$ModelText) {
    $lines = $ModelText -split "`r?`n"
    $textureX = (($lines | Where-Object { $_ -like "TexSizeX|*" } | Select-Object -First 1) -split '\|')[1]
    $textureY = (($lines | Where-Object { $_ -like "TexSizeY|*" } | Select-Object -First 1) -split '\|')[1]
    $allElements = @($lines | Where-Object { $_ -like "Element|*" })
    $elements = @()
    $elementIndices = @()
    for ($elementIndex = 0; $elementIndex -lt $allElements.Count; $elementIndex++) {
        if ($Spec.Exclude -notcontains $elementIndex) {
            $elements += $allElements[$elementIndex]
            $elementIndices += $elementIndex
        }
    }
    if ($elements.Count -eq 0) {
        throw "$($Spec.File) contains no model elements."
    }

    $leftArmY = if ($Spec.ContainsKey("LeftArmY")) { $Spec.LeftArmY } else { "0.1" }
    $rightArmY = if ($Spec.ContainsKey("RightArmY")) { $Spec.RightArmY } else { "-0.52" }

    $builder = New-Object System.Text.StringBuilder
    [void]$builder.AppendLine("package com.flansmod.client.model.BFMCpack;")
    [void]$builder.AppendLine()
    [void]$builder.AppendLine("import com.flansmod.client.model.ModelGun;")
    [void]$builder.AppendLine("import com.flansmod.client.tmt.ModelRendererTurbo;")
    [void]$builder.AppendLine("import com.flansmod.common.vector.Vector3f;")
    [void]$builder.AppendLine()
    [void]$builder.AppendLine("/**")
    [void]$builder.AppendLine(" * Original Toolbox 2.0 model by invalidsyntax.")
    [void]$builder.AppendLine(" */")
    [void]$builder.AppendLine("public class $($Spec.Class) extends ModelGun {")
    [void]$builder.AppendLine("    private static final int TEXTURE_X = $textureX;")
    [void]$builder.AppendLine("    private static final int TEXTURE_Y = $textureY;")
    [void]$builder.AppendLine()
    [void]$builder.AppendLine("    public $($Spec.Class)() {")
    [void]$builder.AppendLine("        gunModel = new ModelRendererTurbo[$($elements.Count)];")
    [void]$builder.AppendLine()

    for ($index = 0; $index -lt $elements.Count; $index++) {
        $parts = $elements[$index] -split '\|'
        if ($parts.Length -lt 44) {
            throw "$($Spec.File) element $index is malformed."
        }
        $shape = $parts[5]
        $textureU = $parts[18]
        $textureV = $parts[19]
        [void]$builder.AppendLine("        gunModel[$index] = new ModelRendererTurbo(this, $textureU, $textureV, TEXTURE_X, TEXTURE_Y);")

        $offsets = @(
            (Format-Float (Parse-Number $parts[15])),
            (Format-Float (Parse-Number $parts[16])),
            (Format-Float (Parse-Number $parts[17]))
        ) -join ", "
        $sizes = @((Format-Size $parts[9]), (Format-Size $parts[10]), (Format-Size $parts[11])) -join ", "

        if ($shape -eq "Box") {
            [void]$builder.AppendLine("        gunModel[$index].addBox($offsets, $sizes, 0F);")
        } elseif ($shape -eq "Shapebox") {
            $corners = New-Object System.Collections.Generic.List[string]
            for ($corner = 0; $corner -lt 8; $corner++) {
                $corners.Add((Format-Float (Parse-Number $parts[20 + $corner])))
                $corners.Add((Format-Float (Parse-Number $parts[28 + $corner])))
                $corners.Add((Format-Float (Parse-Number $parts[36 + $corner])))
            }
            [void]$builder.AppendLine("        gunModel[$index].addShapeBox($offsets, $sizes, 0F, $($corners -join ', '));")
        } else {
            throw "$($Spec.File) uses unsupported shape '$shape'."
        }

        $position = @(
            (Format-Float (Parse-Number $parts[6])),
            (Format-Float (Parse-Number $parts[7])),
            (Format-Float (Parse-Number $parts[8]))
        ) -join ", "
        [void]$builder.AppendLine("        gunModel[$index].setRotationPoint($position);")

        # Toolbox stores Euler angles in degrees; ModelRendererTurbo expects radians.
        $rotationX = (Parse-Number $parts[12]) * [Math]::PI / 180.0
        $rotationY = (Parse-Number $parts[13]) * [Math]::PI / 180.0
        $rotationZ = -(Parse-Number $parts[14]) * [Math]::PI / 180.0
        if ([Math]::Abs($rotationX) -gt 0.0000001) {
            [void]$builder.AppendLine("        gunModel[$index].rotateAngleX = $(Format-Float $rotationX);")
        }
        if ([Math]::Abs($rotationY) -gt 0.0000001) {
            [void]$builder.AppendLine("        gunModel[$index].rotateAngleY = $(Format-Float $rotationY);")
        }
        if ([Math]::Abs($rotationZ) -gt 0.0000001) {
            [void]$builder.AppendLine("        gunModel[$index].rotateAngleZ = $(Format-Float $rotationZ);")
        }
    }

    [void]$builder.AppendLine()
    [void]$builder.AppendLine("        flipAll();")
    for ($index = 0; $index -lt $elements.Count; $index++) {
        $originalIndex = $elementIndices[$index]
        if ($Spec.PartAdjustments.ContainsKey($originalIndex)) {
            $adjustment = $Spec.PartAdjustments[$originalIndex]
            [void]$builder.AppendLine("        gunModel[$index].rotationPointX += $(Format-Float $adjustment[0]);")
            [void]$builder.AppendLine("        gunModel[$index].rotationPointY += $(Format-Float $adjustment[1]);")
            [void]$builder.AppendLine("        gunModel[$index].rotationPointZ += $(Format-Float $adjustment[2]);")
        }
    }
    [void]$builder.AppendLine("        translateAll(0F, $($Spec.TranslateY)F, 0F);")
    [void]$builder.AppendLine("        hasArms = true;")
    [void]$builder.AppendLine("        enableNewArm = true;")
    [void]$builder.AppendLine("        leftArmPos = new Vector3f(2F, $($leftArmY)F, -8.5F);")
    [void]$builder.AppendLine("        leftArmRot = new Vector3f(-80F, -55F, 0F);")
    [void]$builder.AppendLine("        leftArmScale = new Vector3f(0.75F, 1.25F, 0.75F);")
    [void]$builder.AppendLine("        rightArmPos = new Vector3f(0.25F, $($rightArmY)F, 0F);")
    [void]$builder.AppendLine("        rightArmRot = new Vector3f(0F, 0F, -85F);")
    [void]$builder.AppendLine("        rightArmScale = new Vector3f(0.75F, 1F, 0.75F);")
    [void]$builder.AppendLine("        gunOffset = $($Spec.GunOffset)F;")
    [void]$builder.AppendLine("        gunOffsetX = $($Spec.GunOffsetX)F;")
    [void]$builder.AppendLine("        zoomOffset = $($Spec.ZoomOffset)F;")
    [void]$builder.AppendLine("        zoomOffsetY = $($Spec.ZoomOffsetY)F;")
    [void]$builder.AppendLine("        zoomOffsetZ = $($Spec.ZoomOffsetZ)F;")
    [void]$builder.AppendLine("        hasFlash = true;")
    [void]$builder.AppendLine("        flashScale = 1F;")
    [void]$builder.AppendLine("        muzzleFlashPoint = new Vector3f($($Spec.MuzzleFlashPoint));")
    [void]$builder.AppendLine("    }")
    [void]$builder.AppendLine("}")

    $target = Join-Path "src/main/java/com/flansmod/client/model/BFMCpack" ($Spec.Class + ".java")
    Write-Utf8File $target $builder.ToString()
}

function Write-GunDefinition($Gun) {
    $burstLine = if ($null -ne $Gun.Burst) { "`nNumBurstRounds $($Gun.Burst)" } else { "" }
    $burstSoundLine = if ($Gun.BurstSoundOnce) { "`nBurstSoundOnce True" } else { "" }
    $pictureInPicture = $pictureInPictureDefinitions[$Gun.Model]
    $pictureInPictureLines = if ($null -ne $pictureInPicture) {
        @"
PictureInPicture $($pictureInPicture.Coordinates)
PictureInPictureAutoDepth True
PictureInPictureReticle PIP/StarWarsReticle
PictureInPictureReticleScale 1.0
Magnification $($pictureInPicture.Magnification)
"@
    } else { "" }
    $text = @"
Name $($Gun.Name)
ShortName $($Gun.ShortName)
Icon StarWars/$($Gun.Texture)
Description Star Wars blaster model by invalidsyntax
Colour 255 255 255

Ammo starWarsBlasterBolt
UseHeatSystem True
MaxHeat $($Gun.MaxHeat)
HeatPerShot $($Gun.Heat)
HeatCooldownPerTick $($Gun.Cool)
HeatSpreadPenalty 0.75
HeatRecoilPenalty 0.4
OverheatLockoutTicks 100
OverheatSound starwars_overheat
CooledDownSound starwars_cooleddown
BlasterSoundVolume 30
CanForceReload False
AllowRearm False
Damage $($Gun.Damage)
RoundsPerMin $($Gun.Rpm)
Mode $($Gun.Modes)$burstLine$burstSoundLine
BulletSpeed 40
Accuracy $($Gun.Accuracy)
AimingSpreadConstant 0.35
Recoil $($Gun.Recoil)
RandomRecoilRange 0.35
DecreaseRecoil 1.0
RandomRecoilYawRange 0.35
DecreaseRecoilYaw 1.0
ShootSound $($Gun.Sound)
GunSoundRange 80
EmptyClickSound emptyclick
CanShootUnderwater False
Deployable False
OneHanded False
ShowMuzzleFlashParticle True

Model BFMCpack.$($Gun.Model)
ModelScale $($Gun.Scale)
Texture StarWars/$($Gun.Texture)
UseLeftArmGLTFAnimation True
$pictureInPictureLines

AllowAllAttachments False
CanAIUse true
"@
    Write-Utf8File (Join-Path $DevelopmentPackDirectory ("guns/" + $Gun.File)) ($text.Trim() + "`n")
}

function Write-InternalBlasterBolt {
    $text = @"
Name Internal Blaster Bolt
ShortName starWarsBlasterBolt
InternalProjectile True
Model Bullet
Icon StarWars/E11
Description Internal projectile definition
Colour 255 80 80
MaxStackSize 1
RoundsPerItem 1
Damage 1
DamageVsVehicles 1
FallSpeed 0
Explosion 0
ExplodeOnImpact False
Fuse 0
Fire 0
BreaksGlass True
HitBoxSize 0.1
SmokeTrail False
Tracer True
TracerScale 2
ShootHeadMultiplier 1.5
ShootArmMultiplier 0.8
ShootLegMultiplier 0.8
"@
    Write-Utf8File (Join-Path $DevelopmentPackDirectory "bullets/BlasterBolt.txt") ($text.Trim() + "`n")
}

$packMeta = @"
{
  "pack": {
    "pack_format": 1,
    "description": "Star Wars blasters - models by invalidsyntax"
  }
}
"@
Write-Utf8File (Join-Path $DevelopmentPackDirectory "pack.mcmeta") ($packMeta.Trim() + "`n")
Write-Utf8File (Join-Path $DevelopmentPackDirectory "ATTRIBUTION.txt") "Original gun models and textures: invalidsyntax`nToolbox 2.0 conversion and game integration: Wargames Development Group`n"

$languageLines = @()
foreach ($gun in $gunDefinitions) {
    $languageLines += "item.$($gun.ShortName).name=$($gun.Name)"
}
Write-Utf8File (Join-Path $DevelopmentPackDirectory "assets/flansmod/lang/en_US.lang") (($languageLines -join "`n") + "`n")

Write-InternalBlasterBolt

foreach ($gun in $gunDefinitions) {
    Write-GunDefinition $gun
}

foreach ($model in $models) {
    $sourcePath = Join-Path $SourceDirectory $model.File
    if (-not (Test-Path -LiteralPath $sourcePath)) {
        throw "Missing source model: $sourcePath"
    }

    $zip = [System.IO.Compression.ZipFile]::OpenRead($sourcePath)
    try {
        $modelText = Read-ZipEntryText $zip "Model.txt"
        Write-ModelClass $model $modelText

        $textureEntry = $zip.GetEntry("Model.png")
        if ($null -eq $textureEntry) {
            throw "$($model.File) is missing Model.png"
        }
        $skinPath = Join-Path $DevelopmentPackDirectory ("assets/flansmod/skins/StarWars/" + $model.Texture + ".png")
        New-Item -ItemType Directory -Force -Path (Split-Path -Parent $skinPath) | Out-Null
        $sourceStream = $textureEntry.Open()
        try {
            $skinStream = [System.IO.File]::Create($skinPath)
            try { $sourceStream.CopyTo($skinStream) } finally { $skinStream.Dispose() }
        } finally {
            $sourceStream.Dispose()
        }
    } finally {
        $zip.Dispose()
    }
}

Write-Output "Imported $($models.Count) Star Wars gun models and created the content pack at $DevelopmentPackDirectory. Run the Star Wars geometry extractor and icon renderer after changing model geometry."
