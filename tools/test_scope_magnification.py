"""Focused content migration checks; no Minecraft or third-party modules needed."""

from pathlib import Path
from tempfile import TemporaryDirectory
import unittest

from install_scope_magnification import OPTICS, install_scope_magnification


class ScopeMagnificationTests(unittest.TestCase):
    def setUp(self):
        test_root = Path(__file__).resolve().parents[1] / "build/scope_checks"
        test_root.mkdir(parents=True, exist_ok=True)
        self.temporary = TemporaryDirectory(dir=test_root)
        self.addCleanup(self.temporary.cleanup)
        self.pack = Path(self.temporary.name)
        attachments = self.pack / "attachments"
        attachments.mkdir()
        for name in OPTICS:
            (attachments / (name + ".txt")).write_bytes(
                (f"Name {name}\r\nShortName {name}\r\nAttachmentType sights\r\n"
                 "ZoomLevel 2\r\nFOVZoomLevel 2\r\nZoomLevel2 7\r\n"
                 "Model Original.Model\r\nPictureInPicture 1 2 3 4\r\n").encode()
                + b"// Preserve original bytes: \xff\r\n")
        lang = self.pack / "assets/flansmod/lang"
        lang.mkdir(parents=True)
        for locale in ("en_US", "zh_CN"):
            (lang / (locale + ".lang")).write_text(
                "item.m145.name=M145 [3.4x]\nitem.other.name=Keep me\n", encoding="utf-8")

    def snapshot(self):
        return {p.relative_to(self.pack): p.read_bytes() for p in self.pack.rglob("*") if p.is_file()}

    def test_all_optics_zoom_compatibility_and_idempotence(self):
        install_scope_magnification(self.pack)
        for name, zoom in OPTICS.items():
            data = (self.pack / "attachments" / (name + ".txt")).read_bytes()
            for line in (f"ShortName {name}", "ZoomLevel 1", "FOVZoomLevel 1",
                         f"Magnification {zoom[0]}", "Model Original.Model",
                         "PictureInPicture 1 2 3 4"):
                self.assertIn(line.encode() + b"\r\n", data)
            self.assertIn(b"// Preserve original bytes: \xff\r\n", data)
            self.assertNotIn(b"ZoomLevel2 ", data)
            if len(zoom) == 2:
                self.assertIn(f"Magnification2 {zoom[1]}\r\n".encode(), data)
            else:
                self.assertNotIn(b"Magnification2 ", data)
        for path in (self.pack / "assets/flansmod/lang").glob("*.lang"):
            self.assertIn("item.m145.name=Elcan Spectre [1-4x]", path.read_text())
            self.assertIn("item.other.name=Keep me", path.read_text())
        before = self.snapshot()
        install_scope_magnification(self.pack)
        self.assertEqual(before, self.snapshot())

    def test_missing_optic_rejects_without_partial_writes(self):
        (self.pack / "attachments/acogta31.txt").unlink()
        before = self.snapshot()
        with self.assertRaisesRegex(ValueError, "Missing BFMC optics"):
            install_scope_magnification(self.pack)
        self.assertEqual(before, self.snapshot())

    def test_duplicate_optic_rejects_without_partial_writes(self):
        (self.pack / "attachments/duplicate.txt").write_bytes(
            (self.pack / "attachments/acogta31.txt").read_bytes())
        before = self.snapshot()
        with self.assertRaisesRegex(ValueError, "Unknown or duplicate optic"):
            install_scope_magnification(self.pack)
        self.assertEqual(before, self.snapshot())


if __name__ == "__main__":
    unittest.main()
