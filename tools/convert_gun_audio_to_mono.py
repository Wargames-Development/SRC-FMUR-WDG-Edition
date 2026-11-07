"""Enable positional gunfire for a Flan content-pack folder using FFmpeg.

Run with the pack path to preview. Pass --backup-dir to apply the conversion
and save the original Ogg files there, outside the content pack.
"""

import argparse
import json
from pathlib import Path
import shutil
import subprocess
import tempfile


GUN_SOUND_FIELDS = {"ShootSound", "SuppressedShootSound", "LastShootSound", "DistantSound"}


def firing_events(pack):
    events = set()
    for folder, fields in (("guns", GUN_SOUND_FIELDS), ("attachments", {"SecondaryShootSound"})):
        for definition in (pack / folder).rglob("*.txt"):
            for line in definition.read_text(encoding="utf-8-sig", errors="replace").splitlines():
                tokens = line.split()
                if len(tokens) >= 2 and tokens[0] in fields:
                    events.add(tokens[1])
    return events


def firing_files(pack):
    assets = pack / "assets" / "flansmod"
    events = json.loads((assets / "sounds.json").read_text(encoding="utf-8-sig"))
    sound_dir = (assets / "sounds").resolve()
    files = set()
    pending = list(sorted(firing_events(pack), reverse=True))
    visited = set()
    while pending:
        event = pending.pop()
        if event in visited:
            continue
        visited.add(event)
        if event not in events:
            print(f"Skipping {event}: no local sound event")
            continue
        for entry in events[event]["sounds"]:
            name = entry if isinstance(entry, str) else entry["name"]
            namespace, separator, resource = name.partition(":")
            if separator and namespace.lower() != "flansmod":
                print(f"Skipping {name}: resource belongs to another namespace")
                continue
            resource = resource if separator else name
            if isinstance(entry, dict) and entry.get("type") == "event":
                pending.append(resource)
                continue
            clip = (sound_dir / (resource + ".ogg")).resolve()
            if clip.is_relative_to(sound_dir) and clip.is_file():
                files.add(clip)
            else:
                print(f"Skipping {name}: no local Ogg file")
    return sorted(files)


def vorbis_channels(clip):
    with clip.open("rb") as audio:
        header = audio.read(256)
    identification = header.find(b"\x01vorbis")
    channel_offset = identification + 11
    if not header.startswith(b"OggS") or identification < 0 or channel_offset >= len(header):
        raise ValueError(f"Expected an Ogg Vorbis file: {clip}")
    return header[channel_offset]


def convert(clip, backup, ffmpeg):
    with tempfile.TemporaryDirectory(dir=clip.parent) as temporary:
        mono = Path(temporary) / "mono.ogg"
        subprocess.run([
            ffmpeg, "-nostdin", "-v", "error", "-xerror", "-i", str(clip),
            # Some pack recordings have out-of-order Ogg timestamps.
            "-af", "pan=mono|c0=0.5*c0+0.5*c1,asetpts=N/SR/TB",
            "-c:a", "libvorbis", "-q:a", "6", str(mono),
        ], check=True)
        if vorbis_channels(mono) != 1:
            raise ValueError(f"Conversion did not produce mono audio: {clip}")
        backup.parent.mkdir(parents=True, exist_ok=True)
        if not backup.exists():
            shutil.copy2(clip, backup)
        elif backup.read_bytes() != clip.read_bytes():
            raise ValueError(f"Backup already contains a different recording: {backup}")
        mono.replace(clip)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("pack", type=Path, help="unpacked Flan content-pack directory")
    parser.add_argument("--backup-dir", type=Path, help="apply changes and save originals here")
    parser.add_argument("--ffmpeg", default="ffmpeg", help="FFmpeg executable with libvorbis")
    args = parser.parse_args()
    pack = args.pack.resolve()
    backup = args.backup_dir.resolve() if args.backup_dir else None
    if backup and backup.is_relative_to(pack):
        parser.error("--backup-dir must be outside the content pack")

    stereo = []
    mono_count = 0
    for clip in firing_files(pack):
        channels = vorbis_channels(clip)
        if channels == 1:
            mono_count += 1
        elif channels == 2:
            stereo.append(clip)
        else:
            print(f"Skipping {clip.name}: {channels} channels")

    for clip in stereo:
        relative = clip.relative_to(pack)
        if backup:
            convert(clip, backup / relative, args.ffmpeg)
        print(f"{'Converted' if backup else 'Would convert'} {relative}")
    print(f"{len(stereo)} stereo clip(s), {mono_count} already mono")


if __name__ == "__main__":
    main()
