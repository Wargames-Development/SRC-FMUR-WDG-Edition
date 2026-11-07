param(
    [string]$ContentPack = (Join-Path $PSScriptRoot '../eclipse/Flan/BFMC Gun Pack')
)

$ErrorActionPreference = 'Stop'
$definition = Join-Path $ContentPack 'grenades/Molotov.txt'
if (-not (Test-Path -LiteralPath $definition -PathType Leaf)) {
    throw "Molotov definition not found: $definition"
}

$text = [IO.File]::ReadAllText($definition)
if ($text -notmatch '(?m)^ShortName[ \t]+molotov[ \t]*\r?$') {
    throw "Expected ShortName molotov in $definition"
}
foreach ($key in @('Model', 'Texture')) {
    if ([regex]::Matches($text, "(?m)^$key[ \t]+[^\r\n]*").Count -ne 1) {
        throw "Expected exactly one $key entry in $definition"
    }
}
$text = [regex]::Replace($text, '(?m)^Model[ \t]+[^\r\n]*', 'Model BFMCpack.Molotov')
$text = [regex]::Replace($text, '(?m)^Texture[ \t]+[^\r\n]*', 'Texture WDG_Molotov')
[IO.File]::WriteAllText($definition, $text, [Text.UTF8Encoding]::new($false))
Write-Output "Installed Molotov model selection in $definition"
