param(
    [string]$PackRoot = (Join-Path $PSScriptRoot '../eclipse/Flan/BFMC Gun Pack'),
    [switch]$Check
)

$ErrorActionPreference = 'Stop'
$sourceRoot = Join-Path $PSScriptRoot '../development_assets/attachment_lighting/content_pack/attachments'
$destination = Join-Path $PackRoot 'attachments'
if (!(Test-Path -LiteralPath $destination -PathType Container)) {
    throw "Attachment folder not found: $destination"
}
$files = @('GADGET_5MWLaser.txt', 'GADGET_IRLaser.txt', 'GRIP_X400.txt', 'GRIP_IRFlashlight.txt', 'GADGET_TriBeamLaser.txt')
$differences = @()
foreach ($name in $files) {
    $source = Join-Path $sourceRoot $name
    $target = Join-Path $destination $name
    if (!(Test-Path -LiteralPath $source -PathType Leaf)) { throw "Missing source: $source" }
    if (!(Test-Path -LiteralPath $target -PathType Leaf) -or
            (Get-FileHash -LiteralPath $source).Hash -ne (Get-FileHash -LiteralPath $target).Hash) {
        $differences += $name
    }
}
if ($Check) {
    if ($differences.Count) { throw ('Attachment definitions differ: ' + ($differences -join ', ')) }
    Write-Output 'Attachment definitions match the repository overlay.'
    return
}
foreach ($name in $differences) {
    Copy-Item -LiteralPath (Join-Path $sourceRoot $name) -Destination (Join-Path $destination $name)
}
Write-Output ("Updated {0} attachment definitions in {1}" -f $differences.Count, $destination)
