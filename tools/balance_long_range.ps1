param(
    [string]$FlanRoot = (Join-Path $PSScriptRoot '../eclipse/Flan'),
    [switch]$Check
)

$ErrorActionPreference = 'Stop'
$encoding = [Text.Encoding]::GetEncoding(28591)
$culture = [Globalization.CultureInfo]::InvariantCulture
$pack = Join-Path $FlanRoot 'BFMC Gun Pack'
$changes = @()
$rifleAmmo = @{}
foreach ($file in Get-ChildItem -LiteralPath (Join-Path $pack 'guns') -Filter '*.txt') {
    if ($file.BaseName -notmatch '_(AR|CR|LMG|SR|DMR)_' -and
        $file.BaseName -notin @('AK308', 'DragunovSVD', 'M240', 'VHS2')) { continue }
    $text = $encoding.GetString([IO.File]::ReadAllBytes($file.FullName))
    foreach ($match in [regex]::Matches($text, '(?m)^Ammo[ \t]+(\S+)')) {
        $rifleAmmo[$match.Groups[1].Value.ToLowerInvariant()] = $true
    }
}
if (!$rifleAmmo.ContainsKey('snipex145x114mag')) { throw 'Missing Snipex definition' }
$bulletCount = 0
$stoneCount = 0
foreach ($file in Get-ChildItem -LiteralPath (Join-Path $pack 'bullets') -Filter '*.txt') {
    $original = $encoding.GetString([IO.File]::ReadAllBytes($file.FullName))
    $text = [regex]::Replace($original, '(?ms)\r?\n// Wargames long range BEGIN\r?\n.*?// Wargames long range END\r?\n?', '')
    $id = [regex]::Match($text, '(?m)^ShortName[ \t]+(\S+)').Groups[1].Value.ToLowerInvariant()
    # VKS / KORD already share 50cal ammunition; add NTW-20 and Snipex families.
    $heavy = $id -match '^(50cal|tripleaction50bmg|20x823rdmag|snipex145x114mag|atbullet)'
    if (!$rifleAmmo.ContainsKey($id) -and !$heavy) { continue }
    $newline = if ($original.Contains("`r`n")) { "`r`n" } else { "`n" }
    $fields = @()
    if ($rifleAmmo.ContainsKey($id)) {
        $matches = [regex]::Matches($text, '(?m)^FallSpeed[ \t]+(\S+)')
        if ($matches.Count -ne 1) { throw "Expected one FallSpeed in $($file.Name)" }
        $fall = [double]::Parse($matches[0].Groups[1].Value, $culture)
        # Gravity scales with distance squared; preserve cartridge differences and air drag.
        $fields += 'FallSpeed ' + ($fall * [math]::Pow(256.0 / 500.0, 2)).ToString('0.######', $culture)
        $bulletCount++
    }
    if ($heavy) {
        $fields += 'StonePenetrationChance 0.25'
        $fields += 'StonePenetrationDamageRetention 0.5'
        $fields += 'StonePenetrationSpeedRetention 0.3'
        $fields += 'BulletDecay Segmented 100 0.9 250 0.75 400 0.6'
        $stoneCount++
    }
    $updated = $text.TrimEnd("`r", "`n") + $newline + '// Wargames long range BEGIN' + $newline +
        ($fields -join $newline) + $newline + '// Wargames long range END' + $newline
    if ($original -cne $updated) { $changes += @{ Path = $file.FullName; Text = $updated } }
}
if ($bulletCount -eq 0 -or $stoneCount -eq 0) { throw 'Missing rifle / heavy ammunition' }

$labels = @{
    'BFMC Gun Pack/assets/flansmod/lang/en_US.lang' = @('cnvdt', 'sketchBarrettSSRS')
    'TaP-Escalation/assets/flansmod/lang/en_US.lang' = @('tapGhillieHood', 'tapGhillieSuit', 'tapSnowGhillieHood', 'tapSnowGhillieSuit')
}
$legendary = $encoding.GetString([Text.Encoding]::UTF8.GetBytes(' ' + [char]0xA7 + '6[Legendary]'))
foreach ($relative in $labels.Keys) {
    $path = Join-Path $FlanRoot $relative
    $original = $encoding.GetString([IO.File]::ReadAllBytes($path))
    $updated = $original
    foreach ($id in $labels[$relative]) {
        $pattern = '(?m)^(item\.' + [regex]::Escape($id) + '\.name=[^\r\n]*?)(?: ' + [char]0xC2 + '?' + [char]0xA7 + '6\[Legendary\])?(?=\r?$)'
        if ([regex]::Matches($updated, $pattern).Count -ne 1) { throw "Missing / duplicate label: $id" }
        $updated = [regex]::Replace($updated, $pattern, ('${1}' + $legendary))
    }
    if ($original -cne $updated) { $changes += @{ Path = $path; Text = $updated } }
}
# Validate the whole selection before writing. Re-running never compounds gravity changes.
if ($Check) {
    if ($changes.Count -gt 0) { throw "$($changes.Count) files need updating. Run without -Check." }
    Write-Output "PASS: $bulletCount rifle ammunition definitions, $stoneCount heavy ammunition definitions and six Legendary labels."
} else {
    foreach ($change in $changes) { [IO.File]::WriteAllBytes($change.Path, $encoding.GetBytes($change.Text)) }
    Write-Output "Updated $($changes.Count) files: $bulletCount rifle ammunition definitions, $stoneCount heavy ammunition definitions and six Legendary labels."
}
