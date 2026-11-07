param(
    [string]$PackRoot = (Join-Path $PSScriptRoot '../eclipse/Flan/BFMC Gun Pack'),
    [switch]$Check
)

$ErrorActionPreference = 'Stop'
$path = Join-Path $PackRoot 'guns/CUSTOM_SR_M110A2.txt'
$encoding = [Text.Encoding]::GetEncoding(28591)
$text = $encoding.GetString([IO.File]::ReadAllBytes($path))
if ($text -cnotmatch '(?m)^ShortName m110a2\r?$') {
    throw "Expected the M110A2 definition in $path"
}

$ammo = [regex]::Matches($text, '(?m)^Ammo (\S+)[ \t]*(\r?\n)')
if ($ammo.Count -eq 0) { throw "No Ammo entries in $path" }
$accepted = $ammo | ForEach-Object { $_.Groups[1].Value }
$missing = @(foreach ($capacity in 10, 20) {
    foreach ($variant in '', 'Tracer', 'GreenTracer') {
        $id = "762x51${capacity}rdmag$variant"
        if ($accepted -cnotcontains $id) { "Ammo $id" }
    }
})
if ($missing.Count -eq 0) {
    Write-Output 'M110A2 already accepts all 10- and 20-round variants.'
    return
}
if ($Check) { throw "M110A2 is missing $($missing.Count) Ammo entries. Run without -Check." }

$last = $ammo[$ammo.Count - 1]
$newline = $last.Groups[2].Value
$updated = $text.Insert($last.Index + $last.Length, ($missing -join $newline) + $newline)
[IO.File]::WriteAllBytes($path, $encoding.GetBytes($updated))
Write-Output "Added $($missing.Count) magazine options to $path"
