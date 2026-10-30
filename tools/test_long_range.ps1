$ErrorActionPreference = 'Stop'
$root = Join-Path $PSScriptRoot '../eclipse/Flan'
& (Join-Path $PSScriptRoot 'balance_long_range.ps1') -Check
function Read-Fields($path) {
    $fields = @{}
    foreach ($line in [IO.File]::ReadAllLines($path)) {
        if ($line -match '^(\w+)\s+(.+)$') { $fields[$matches[1]] = $matches[2].Trim() }
    }
    return $fields
}
$bullets = Join-Path $root 'BFMC Gun Pack/bullets'
$snipex = Read-Fields (Join-Path $bullets 'Snipex145x114Mag.txt')
if ([double]$snipex.FallSpeed -ne 1.31072) { throw 'Snipex gravity regression' }
$snipexTracer = Read-Fields (Join-Path $bullets 'Snipex145x114Mag_GreenTracer.txt')
if ($snipex.FallSpeed -ne $snipexTracer.FallSpeed) { throw 'Snipex tracer mismatch' }
foreach ($name in @('50Cal5rdMag', '50Cal5rdMag_Tracer', '50Cal5rdMag_GreenTracer', 'TripleAction50BMG',
        '20x823rdmag', '20x823rdmag_Tracer', 'Snipex145x114Mag', 'Snipex145x114Mag_GreenTracer',
        '145x114Bullet', '145x114Bullet_GreenTracer')) {
    $fields = Read-Fields (Join-Path $bullets "$name.txt")
    if ($fields.StonePenetrationChance -ne '0.25' -or
        $fields.StonePenetrationDamageRetention -ne '0.5' -or
        $fields.StonePenetrationSpeedRetention -ne '0.3' -or
        $fields.BulletDecay -ne 'Segmented 100 0.9 250 0.75 400 0.6') {
        throw "Heavy-ammunition regression: $name"
    }
}
foreach ($name in @('9x1915rdmag', '12GaugeBuckShot', 'Sketch30mmGrenade', 'MBTLAWMissile')) {
    $text = [IO.File]::ReadAllText((Join-Path $bullets "$name.txt"))
    if ($text.Contains('// Wargames long range BEGIN')) { throw "Unrelated ammunition changed: $name" }
}
# Check actual UTF-8 decoding: a single-byte section sign would render as a replacement character.
foreach ($relative in @('BFMC Gun Pack/assets/flansmod/lang/en_US.lang', 'TaP-Escalation/assets/flansmod/lang/en_US.lang')) {
    $text = [IO.File]::ReadAllText((Join-Path $root $relative), [Text.Encoding]::UTF8)
    $ids = if ($relative.StartsWith('BFMC')) { @('cnvdt', 'sketchBarrettSSRS') }
           else { @('tapGhillieHood', 'tapGhillieSuit', 'tapSnowGhillieHood', 'tapSnowGhillieSuit') }
    foreach ($id in $ids) {
        $pattern = '(?m)^item\.' + $id + '\.name=.* ' + [char]0xA7 + '6\[Legendary\]\r?$'
        if ($text -notmatch $pattern) { throw "Legendary label / encoding regression: $id" }
    }
}
# Hash all touched definitions across reapplication, including localization.
$files = @(Get-ChildItem -LiteralPath $bullets -Filter '*.txt') +
    @(Get-Item (Join-Path $root 'BFMC Gun Pack/assets/flansmod/lang/en_US.lang')) +
    @(Get-Item (Join-Path $root 'TaP-Escalation/assets/flansmod/lang/en_US.lang'))
$before = @{}
foreach ($file in $files) { $before[$file.FullName] = (Get-FileHash -LiteralPath $file.FullName).Hash }
& (Join-Path $PSScriptRoot 'balance_long_range.ps1')
foreach ($file in $files) {
    if ($before[$file.FullName] -ne (Get-FileHash -LiteralPath $file.FullName).Hash) {
        throw "Reapplication changed $($file.Name)"
    }
}
Write-Output 'PASS: representative ballistics, tracer parity, exclusions, UTF-8 labels and byte-identical reapplication.'
