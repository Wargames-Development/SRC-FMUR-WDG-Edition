$modelDirectory = Join-Path $PSScriptRoot '../src/main/resources/assets/flansmod/models/flashlight'
$sourcePath = Join-Path $modelDirectory 'flashlight.obj'
$runtimePath = Join-Path $modelDirectory 'flashlight_runtime.obj'
$runtimeLines = [Collections.Generic.List[string]]::new()
$runtimeLines.Add('# Derived from flashlight.obj: triangles and decimal coordinates for Forge 1.7.10.')
foreach ($line in [IO.File]::ReadAllLines($sourcePath)) {
    if ($line -match '^(v|vt|vn)\s+') {
        $parts = $line.Trim() -split '\s+'
        $numbers = for ($part = 1; $part -lt $parts.Length; $part++) {
            [double]::Parse($parts[$part], [cultureinfo]::InvariantCulture).ToString('0.#########', [cultureinfo]::InvariantCulture)
        }
        $runtimeLines.Add($parts[0] + ' ' + ($numbers -join ' '))
    } elseif ($line.StartsWith('f ')) {
        $indices = $line.Substring(2).Trim() -split '\s+'
        for ($index = 1; $index -lt $indices.Length - 1; $index++) {
            $runtimeLines.Add('f ' + $indices[0] + ' ' + $indices[$index] + ' ' + $indices[$index + 1])
        }
    } else {
        $runtimeLines.Add($line)
    }
}
[IO.File]::WriteAllLines($runtimePath, $runtimeLines, [Text.UTF8Encoding]::new($false))
