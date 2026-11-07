param(
    [string]$PackRoot = (Join-Path $PSScriptRoot '../eclipse/Flan/BFMC Gun Pack'),
    [switch]$Check
)

$ErrorActionPreference = 'Stop'
$path = Join-Path $PackRoot 'guns/CUSTOM_SR_M110A2.txt'
# Preserve the content pack's encoding and line endings.
$encoding = [Text.Encoding]::GetEncoding(28591)
$original = $encoding.GetString([IO.File]::ReadAllBytes($path))
if ($original -cnotmatch '(?m)^ShortName[ \t]+m110a2[ \t]*\r?$') {
    throw "Expected the M110A2 definition in $path"
}
# GunType accepts ReloadTime; the misspelled key leaves empty reloads at zero ticks.
$updated = [regex]::Replace($original, '(?m)^Reload time(?=[ \t]+)', 'ReloadTime')
$fields = [regex]::Matches($updated, '(?m)^ReloadTime[ \t]+([0-9]+)[ \t]*\r?$')
if ($fields.Count -ne 1 -or [int]$fields[0].Groups[1].Value -le 0) {
    throw "Expected one positive ReloadTime in $path"
}
if ($Check) {
    if ($original -cne $updated) { throw 'M110A2 reload key needs repair. Run without -Check.' }
    Write-Output "PASS: M110A2 empty reload uses $($fields[0].Groups[1].Value) ticks."
} elseif ($original -cne $updated) {
    [IO.File]::WriteAllBytes($path, $encoding.GetBytes($updated))
    Write-Output "Repaired M110A2 ReloadTime in $path"
} else {
    Write-Output 'M110A2 reload key is already correct.'
}
