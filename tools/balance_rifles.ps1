param(
    [string]$PackRoot = (Join-Path $PSScriptRoot '../eclipse/Flan/BFMC Gun Pack'),
    [switch]$Check
)

$ErrorActionPreference = 'Stop'
# Explicit selection excludes .50s (including Beowulf), NTW-20 and Alligator.
$bolts = @('cslr4', 'fyjs', 'mosin', 'jng90', 'sv98', 'l115', 'm24sws', 'm40a5')
$dmrs = @('nsg85', 'qbu88', 'avt40', 'm110a2', 'vss', 'sr338', 'svch338',
          'sks', 'svd12', 'svu', 'm39emr', 'mk11mod0', 'mk20ssr')
$targets = $bolts + $dmrs
$seen = @{}
$changes = @()
# Latin-1 round-trips the pack's mixed encodings without touching unrelated bytes.
$encoding = [Text.Encoding]::GetEncoding(28591)
foreach ($file in Get-ChildItem -LiteralPath (Join-Path $PackRoot 'guns') -Filter '*.txt') {
    $original = $encoding.GetString([IO.File]::ReadAllBytes($file.FullName))
    $idMatch = [regex]::Match($original, '(?m)^ShortName\s+(\S+)')
    $id = $idMatch.Groups[1].Value.ToLowerInvariant()
    if ($targets -notcontains $id) { continue }
    if ($seen.ContainsKey($id)) { throw "Duplicate gun: $id" }
    $seen[$id] = $true
    if ([regex]::Matches($original, '(?m)^Damage[ \t]+\S+').Count -ne 1) {
        throw "Expected one Damage field in $($file.Name)"
    }
    $isBolt = $bolts -contains $id
    $values = [ordered]@{
        # Includes room for the .338 seven-round magazine's 10% range falloff.
        Damage = $(if ($isBolt) { '26' } else { '12.5' })
        PlayerHeadshotMultiplier = '2'
        AltynHeadshotMultiplier = $(if ($isBolt) { '0.5' } else { '1' })
    }
    $updated = $original
    $newline = if ($original.Contains("`r`n")) { "`r`n" } else { "`n" }
    foreach ($key in $values.Keys) {
        $pattern = '(?m)^' + $key + '[ \t]+[^\r\n]*'
        $count = [regex]::Matches($updated, $pattern).Count
        if ($count -gt 1) { throw "Duplicate $key in $($file.Name)" }
        $line = $key + ' ' + $values[$key]
        if ($count -eq 1) {
            $updated = [regex]::Replace($updated, $pattern, $line)
        } else {
            if (!$updated.EndsWith("`n")) { $updated += $newline }
            $updated += $line + $newline
        }
    }
    if ($original -cne $updated) {
        $changes += [pscustomobject]@{ Path = $file.FullName; Text = $updated }
    }
}
# Validate the entire selection before writing anything.
foreach ($id in $targets) {
    if (!$seen.ContainsKey($id)) { throw "Missing gun: $id" }
}
if ($Check) {
    if ($changes.Count -gt 0) { throw "$($changes.Count) rifle definitions need balancing. Run without -Check." }
    Write-Output "PASS: all $($targets.Count) rifle definitions match the balance settings."
} else {
    foreach ($change in $changes) {
        [IO.File]::WriteAllBytes($change.Path, $encoding.GetBytes($change.Text))
        Write-Output "Updated $($change.Path)"
    }
    Write-Output "Balanced $($targets.Count) rifles; $($changes.Count) files changed."
}
