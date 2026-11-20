param(
    [string]$ContentPack = (Join-Path $PSScriptRoot '../eclipse/Flan/BFMC Gun Pack')
)

$ErrorActionPreference = 'Stop'
$updates = @(
    @{ Path = 'grenades/C4 Explosive.txt'; ShortName = 'c4cn'; Fields = @{
        Name = 'M112 Demolition Charge'; Model = 'BFMCpack.M112'; Texture = 'WDG_M112';
        Icon = 'WDG_M112'; RenderHeldModel = 'true'; CanThrow = 'true';
        Description = 'Throwable demolition charge_Right-click to throw_Detonate with the M57 firing device'
    } },
    @{ Path = 'tools/TOOL_C4Remote.txt'; ShortName = 'c4remote'; Fields = @{
        Name = 'M57 Firing Device'; Model = 'BFMCpack.M57'; Texture = 'WDG_M57';
        Description = 'Remote detonator_Right-click to squeeze the handle_Fires your oldest armed charge'
    } }
)

# Check both targets before changing either. Registry names, balance and the M57 icon stay intact.
foreach ($update in $updates) {
    $file = Join-Path $ContentPack $update.Path
    $text = [IO.File]::ReadAllText($file)
    if ($text -notmatch ('(?m)^ShortName[ \t]+' + $update.ShortName + '[ \t]*\r?$')) {
        throw "Unexpected registry name in $file"
    }
}
foreach ($update in $updates) {
    $file = Join-Path $ContentPack $update.Path
    $text = [IO.File]::ReadAllText($file)
    foreach ($key in ($update.Fields.Keys | Sort-Object)) {
        $line = $key + ' ' + $update.Fields[$key]
        $pattern = '(?m)^' + $key + '[ \t]+[^\r\n]*'
        if ([regex]::IsMatch($text, $pattern)) { $text = [regex]::Replace($text, $pattern, $line) }
        else { $text = $text.TrimEnd() + "`r`n" + $line + "`r`n" }
    }
    [IO.File]::WriteAllText($file, $text, [Text.UTF8Encoding]::new($false))
    Write-Output "Installed $($update.Fields.Name) in $file"
}

$language = Join-Path $ContentPack 'assets/flansmod/lang/en_US.lang'
$text = if (Test-Path -LiteralPath $language) { [IO.File]::ReadAllText($language) } else { '' }
foreach ($update in $updates) {
    $key = 'item.' + $update.ShortName + '.name'
    $line = $key + '=' + $update.Fields.Name
    $pattern = '(?m)^' + [regex]::Escape($key) + '=[^\r\n]*'
    if ([regex]::IsMatch($text, $pattern)) { $text = [regex]::Replace($text, $pattern, $line) }
    else { $text = $text.TrimEnd() + "`r`n" + $line + "`r`n" }
}
[IO.Directory]::CreateDirectory([IO.Path]::GetDirectoryName($language)) | Out-Null
[IO.File]::WriteAllText($language, $text, [Text.UTF8Encoding]::new($false))
