"""Stage reviewed thermal profiles; apply hash-verified content/runtime updates with backups."""
import argparse
import hashlib
import json
import re
from datetime import datetime
from pathlib import Path


def digest(data):
    return hashlib.sha256(data).hexdigest()


def without_managed_block(original, style):
    marker = b'Wargames device thermal profile'
    start = (b'; ' if style == 'mchr' else b'// ') + marker + b' BEGIN'
    end = (b'; ' if style == 'mchr' else b'// ') + marker + b' END'
    if start in original:
        first, last = original.index(start), original.index(end) + len(end)
        original = original[:first] + original[last:].lstrip(b'\r\n')
    return original


def profile_block(original, fields, style):
    original = without_managed_block(original, style)
    prefix = b'; ' if style == 'mchr' else b'// '
    start = prefix + b'Wargames device thermal profile BEGIN'
    end = prefix + b'Wargames device thermal profile END'
    if re.search(rb'(?im)^\s*(?:Camera|Seat)?Thermal(?:Enabled|MaxFPS|Resolution|Grain|Palette|Contrast|Sensitivity|Bloom|Gamma)\s*(?:=|\s)', original):
        raise ValueError('Unmanaged thermal definitions already exist; review them before applying')
    newline = b'\r\n' if b'\r\n' in original else b'\n'
    lines = [start]
    for key, value in fields:
        if style == 'mchr':
            value = value.replace(' ', ',') if key.endswith('Resolution') else value
            lines.append(f'{key} = {value}'.encode('ascii'))
        else:
            lines.append(f'{key} {value}'.encode('ascii'))
    lines.append(end)
    return original.rstrip(b'\r\n') + newline * 2 + newline.join(lines) + newline


def stage(root, destination, catalog):
    assets = Path('mods/MCHELI-R-WDG-Edition-1.1.8_X190/assets/mcheli')
    listed = {entry['file'] for entry in catalog['vehicles']}
    actual = {path.relative_to(root / assets).as_posix()
              for category in ('helicopters', 'planes', 'tanks', 'vehicles')
              for path in (root / assets / category).rglob('*.txt')}
    if actual != listed:
        raise ValueError(f'Vehicle inventory differs; unreviewed={actual-listed}, missing={listed-actual}')
    records = []
    for entry in catalog['fmur'] + catalog['vehicles']:
        fmur = entry in catalog['fmur']
        relative = Path(entry['file']) if fmur else assets / entry['file']
        original = (root / relative).read_bytes()
        source = without_managed_block(original, 'fmur' if fmur else 'mchr')
        profile = entry['profile']
        fields = [] if fmur else [('ThermalEnabled', str(profile is not None).lower())]
        if profile is not None:
            fields.extend(catalog['profiles'][profile].items())
        seat_access = {}
        if not fmur:
            # Vehicle optics now cycle normal/thermal; wearable NVGs own night vision.
            source, count = re.subn(rb'(?im)^(\s*EnableNightVision\s*=\s*)(?:true|false)',
                                    rb'\g<1>false', source)
            if not count:
                fields.insert(0, ('EnableNightVision', 'false'))
        if not fmur and profile is not None:
            # The first declared seat is uid 0; there is no implicit pilot before AddSeat.
            seats = re.findall(rb'(?im)^\s*(AddSeat|AddGunnerSeat|AddFixRotSeat)\s*=', source)
            for seat, kind in enumerate(seats):
                enabled = seat == 0 or kind.lower() != b'addseat'
                if 'allow_seats' in entry:
                    enabled = seat in entry['allow_seats']
                if seat in entry.get('deny_seats', []):
                    enabled = False
                seat_access[str(seat)] = enabled
                fields.append(('SeatThermalEnabled', f'{seat},{str(enabled).lower()}'))
                if enabled and str(seat) in entry.get('seat_profiles', {}):
                    for key, value in catalog['profiles'][entry['seat_profiles'][str(seat)]].items():
                        fields.append(('Seat' + key, f'{seat},{value}'))
        revised = profile_block(source, fields, 'fmur' if fmur else 'mchr')
        staged = destination / 'files' / relative
        staged.parent.mkdir(parents=True, exist_ok=True)
        staged.write_bytes(revised)
        records.append(dict(file=relative.as_posix(), before=digest(original), after=digest(revised),
                            profile=profile, seats=seat_access, reason=entry['reason']))
    destination.mkdir(parents=True, exist_ok=True)
    (destination / 'manifest.json').write_text(json.dumps(records, indent=2) + '\n', encoding='utf-8')
    print(f'Staged {len(records)} files: {len(catalog["fmur"])} FMUR devices, {len(listed)} vehicles; '
          f'{sum(entry["profile"] is not None for entry in catalog["vehicles"])} thermal-equipped vehicles')


def apply(root, destination):
    records = json.loads((destination / 'manifest.json').read_text(encoding='utf-8'))
    # Verify every target before changing any file.
    for record in records:
        relative = Path(record['file'])
        if relative.is_absolute() or '..' in relative.parts:
            raise ValueError(f'Invalid relative target: {relative}')
        target = (root / record['file']).resolve()
        current = digest(target.read_bytes()) if target.is_file() else None
        if not target.is_relative_to(root) or current != record['before']:
            raise ValueError(f'Target changed since review or escapes the game directory: {target}')
        if record['after'] is None:
            if record.get('kind') != 'retired-runtime-jar' or relative.parent != Path('mods') or relative.suffix != '.jar':
                raise ValueError(f'Only an explicitly reviewed top-level runtime jar can be retired: {relative}')
        elif digest((destination / 'files' / record['file']).read_bytes()) != record['after']:
            raise ValueError(f'Staged data changed: {record["file"]}')
    backup = root / 'config' / 'wargames-thermal-backups' / datetime.now().strftime('%Y%m%d-%H%M%S')
    backup.mkdir(parents=True, exist_ok=False)
    (backup / 'manifest.json').write_text(json.dumps(records, indent=2) + '\n', encoding='utf-8')
    for record in records:
        target = root / record['file']
        saved = backup / record['file']
        saved.parent.mkdir(parents=True, exist_ok=True)
        if target.is_file():
            saved.write_bytes(target.read_bytes())
    for record in records:
        target = root / record['file']
        if record['after'] is None:
            target.unlink()
        else:
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_bytes((destination / 'files' / record['file']).read_bytes())
    for record in records:
        target = root / record['file']
        if (digest(target.read_bytes()) if target.is_file() else None) != record['after']:
            raise ValueError(f'Post-write verification failed: {record["file"]}')
    print(f'Applied and verified {len(records)} files. Backup: {backup}')


if __name__ == '__main__':
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('minecraft', type=Path)
    parser.add_argument('staging', type=Path)
    parser.add_argument('--apply', action='store_true')
    arguments = parser.parse_args()
    game = arguments.minecraft.resolve(strict=True)
    if arguments.apply:
        apply(game, arguments.staging.resolve(strict=True))
    else:
        definitions = json.loads(Path(__file__).with_name('thermal_device_profiles.json').read_text(encoding='utf-8'))
        stage(game, arguments.staging.resolve(), definitions)
