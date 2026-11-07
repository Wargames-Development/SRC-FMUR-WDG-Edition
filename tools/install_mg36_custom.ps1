$ErrorActionPreference = 'Stop'
$repo = Split-Path -Parent $PSScriptRoot
$source = Join-Path $repo 'development_assets/mg36_custom'
$pack = Join-Path $repo 'eclipse/Flan/BFMC Gun Pack'
if (-not (Test-Path -LiteralPath $pack -PathType Container)) {
    throw 'Existing BFMC Gun Pack development runtime is missing.'
}
# Only the G36 designation, magazine compatibility and sounds change alongside the visuals.
$conversionKeys = '^(Name|Description|Ammo|ShootSound|ReloadSound)\s'
$visualKeys = '^(Icon|Model|ModelScale|Texture|3rdModel|3rdModelScale|3rdTexture|AllowAllAttachments|AllowAttachments|AllowGadgetAttachments|AllowAccessoryAttachments)\s'
function Get-PreservedDirectives($path) {
    @(Get-Content -LiteralPath $path | ForEach-Object { $_.Trim() } |
        Where-Object { $_ -and -not $_.StartsWith('//') -and $_ -notmatch $visualKeys -and $_ -notmatch $conversionKeys })
}
$definition = Join-Path $source 'EU_LMG_MG36.txt'
$before = Get-PreservedDirectives (Join-Path $source 'source_definition.txt')
$after = Get-PreservedDirectives $definition
if (@(Compare-Object $before $after -SyncWindow 0).Count -ne 0) {
    throw 'MG36 gameplay directives differ from the inherited definition.'
}
$ammo = @(Get-Content -LiteralPath $definition | Where-Object { $_ -match '^Ammo\s' })
$expectedAmmo = @('Ammo 556x4530rdmag', 'Ammo 556x4530rdmagTracer', 'Ammo 556x4530rdmagGreenTracer')
if (($ammo -join '|') -cne ($expectedAmmo -join '|')) {
    throw 'G36 definition must use the pack 30-round magazines.'
}

# Update only the existing registry key in each locale. Keep its original BOM and line endings.
$names = @{ en_US = 'G36 Assault Rifle'; zh_CN = 'G36' }
$localizations = foreach ($locale in $names.Keys) {
    $path = Join-Path $pack "assets/flansmod/lang/$locale.lang"
    $bytes = [IO.File]::ReadAllBytes($path)
    $bom = $bytes.Length -ge 3 -and $bytes[0] -eq 239 -and $bytes[1] -eq 187 -and $bytes[2] -eq 191
    $encoding = [Text.UTF8Encoding]::new($bom, $true)
    $original = [IO.File]::ReadAllText($path, $encoding)
    $pattern = '(?m)^item\.mg36\.name=[^\r\n]*'
    if ([regex]::Matches($original, $pattern).Count -ne 1) {
        throw "Expected one existing G36 localization key in $locale."
    }
    [pscustomobject]@{
        Path = $path
        Encoding = $encoding
        Text = [regex]::Replace($original, $pattern, "item.mg36.name=$($names[$locale])")
    }
}
$copies = @(
    @('MG36_Custom.png', 'assets/flansmod/skins/MG36_Custom.png'),
    @('MG36_icon.png', 'assets/flansmod/textures/items/MG36_Custom.png'),
    @('EU_LMG_MG36.txt', 'guns/EU_LMG_MG36.txt'),
    @('ATTRIBUTION.txt', 'licenses/MG36_Custom.txt')
)
foreach ($pair in $copies) {
    if (-not (Test-Path -LiteralPath (Join-Path $source $pair[0]) -PathType Leaf)) {
        throw "Missing MG36 source asset: $($pair[0])"
    }
}
foreach ($pair in $copies) {
    $from = Join-Path $source $pair[0]
    $to = Join-Path $pack $pair[1]
    New-Item -ItemType Directory -Force -Path (Split-Path -Parent $to) | Out-Null
    Copy-Item -LiteralPath $from -Destination $to -Force
    if ((Get-FileHash -LiteralPath $from).Hash -ne (Get-FileHash -LiteralPath $to).Hash) {
        throw "Installed MG36 asset differs: $($pair[1])"
    }
}
foreach ($locale in $localizations) {
    [IO.File]::WriteAllText($locale.Path, $locale.Text, $locale.Encoding)
}
Write-Output 'Installed G36 names and hash-verified the definition, atlas, icon and credits. Restart the development client to load the compiled model.'
