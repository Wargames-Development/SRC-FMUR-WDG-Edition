$ErrorActionPreference = 'Stop'
$root = Join-Path $PSScriptRoot '../eclipse/Flan'
function Read-Fields($path) {
    $fields = @{}
    foreach ($line in [IO.File]::ReadAllLines($path)) {
        if ($line -match '^(\w+)\s+(.+)$') { $fields[$matches[1]] = $matches[2].Trim() }
    }
    return $fields
}
& (Join-Path $PSScriptRoot 'balance_rifles.ps1') -Check
$ammo = @{}
foreach ($file in Get-ChildItem (Join-Path $root 'BFMC Gun Pack/bullets') -Filter '*.txt') {
    $fields = Read-Fields $file.FullName
    $ammo[$fields.ShortName] = $fields
}
# Validate the armor assumption against the actual pack, including the Altyn.
foreach ($file in Get-ChildItem (Join-Path $root 'TaP-Escalation/armorFiles') -Filter '*.txt') {
    $a = Read-Fields $file.FullName
    $expected = switch ($a.Type) {
        'Chest' { 0.3 }
        'Pants' { 0.05 }
        'Helmet' { if ($a.ShortName -notlike 'boonie*') { 0.2 } }
    }
    if ($null -ne $expected -and [double]$a.Defence -ne $expected) {
        throw "Armor assumption changed: $($file.Name)"
    }
}
$count = 0
foreach ($file in Get-ChildItem (Join-Path $root 'BFMC Gun Pack/guns') -Filter '*.txt') {
    $g = Read-Fields $file.FullName
    if (!$g.ContainsKey('PlayerHeadshotMultiplier')) { continue }
    foreach ($line in Get-Content $file.FullName) {
        if ($line -notmatch '^Ammo (\S+)') { continue }
        $a = $ammo[$matches[1]]
        if (!$a -and $g.ShortName -eq 'm40a5' -and $matches[1] -eq '762x51flash5rdmag') {
            Write-Warning 'Existing M40A5 flash-magazine reference has no definition; skipped.'
            continue
        }
        if (!$a) { throw "Missing ammo: $line" }
        $mult = 1.0
        foreach ($key in @('Damage', 'DamageVsLiving', 'DamageVsPlayer')) {
            if ($a.ContainsKey($key)) { $mult = [double]$a[$key] }
        }
        if ([double]$a.IgnoreArmorProbability -gt 0) { throw "Armor bypass requires separate testing: $line" }
        $falloffs = @(1.0)
        if ($a.EnableBulletDecay -eq 'True') {
            if ($a.BulletDecay -ne 'Segmented 100 0.9') { throw "Unreviewed falloff: $line" }
            $falloffs += 0.9
        }
        foreach ($falloff in $falloffs) {
            $body = [double]$g.Damage * $mult * 0.45 * $falloff
            $head = $body * [double]$g.PlayerHeadshotMultiplier
            $altyn = $head * [double]$g.AltynHeadshotMultiplier
            if ([double]$g.AltynHeadshotMultiplier -eq 0.5) {
                if ($head -lt 20 -or $altyn -ge 20) { throw "Bolt threshold failed: $($g.ShortName)" }
            } elseif ([math]::Ceiling(20 / $body) -ne 4 -or [math]::Ceiling(20 / $head) -ne 2) {
                throw "DMR threshold failed: $($g.ShortName)"
            }
            $count++
        }
    }
}
Write-Output "PASS: $count gun/ammunition/range combinations meet full TAP armor shot thresholds."
