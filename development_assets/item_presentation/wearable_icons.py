"""Hand-placed 32px balaclava silhouettes and NVG inventory sprites."""
from PIL import Image, ImageDraw, ImageFilter


def balaclava(source, short):
    mask = Image.new("L", (32, 32))
    d = ImageDraw.Draw(mask)
    d.polygon([(11, 2), (20, 2), (24, 5), (26, 10), (26, 19), (23, 24),
               (24, 29), (8, 29), (9, 24), (5, 20), (5, 11), (7, 5)], fill=255)
    cloth = source.crop(source.getbbox()).resize((24, 28), Image.Resampling.NEAREST)
    image = Image.new("RGBA", (32, 32))
    image.paste(cloth, (4, 2))
    # Fill only gaps inherited from the cube's projection, using its own cloth.
    colors = source.convert("RGB")
    fallback = image.getpixel((16, 7))[:3] if image.getpixel((16, 7))[3] else colors.getpixel((16, 16))
    outline = tuple(int(c * .55) for c in fallback) + (255,)
    for y in range(32):
        for x in range(32):
            if mask.getpixel((x, y)):
                color = image.getpixel((x, y))
                if y <= 6:
                    fabric = image.getpixel((x, 7))
                    color = fabric if fabric[3] else (*fallback, 255)
                if not color[3]: color = (*fallback, 255)
                neighbors = [mask.getpixel((nx, ny)) if 0 <= nx < 32 and 0 <= ny < 32 else 0
                             for nx, ny in ((x-1,y),(x+1,y),(x,y-1),(x,y+1))]
                if not all(neighbors): color = outline
                image.putpixel((x, y), color)
    image.putalpha(mask)
    d = ImageDraw.Draw(image)
    if "skull" in short.lower():
        d.polygon([(10, 17), (21, 17), (20, 24), (11, 24)], fill="#c8c9b9")
        d.polygon([(15, 16), (17, 19), (14, 19)], fill="#272b25")
        for x in (12, 15, 18): d.line((x, 21, x, 24), fill="#464c40")
    # Stitching surrounds the opening without filling its transparent interior.
    eye = Image.new("L", (32, 32))
    ImageDraw.Draw(eye).polygon([(9, 10), (22, 10), (24, 12), (22, 15), (9, 15), (7, 12)], fill=255)
    opening = eye.filter(ImageFilter.MinFilter(3))
    for y in range(32):
        for x in range(32):
            if opening.getpixel((x, y)):
                mask.putpixel((x, y), 0)
            elif eye.getpixel((x, y)) and mask.getpixel((x, y)):
                image.putpixel((x, y), outline)
    image.putalpha(mask)
    return image


def night_vision(single=False, black=False, phosphor="green"):
    image = Image.new("RGBA", (32, 32))
    d = ImageDraw.Draw(image)
    ink = "#131c19"
    dark, body, light = ("#252d29", "#4e5a50", "#879181") if black else ("#6b6147", "#a89770", "#d1c098")
    lens, gleam = {"green": ("#435e3e", "#9eb88c"), "white": ("#496e72", "#b5d1c6"),
                   "amber": ("#987039", "#d9b46f")}[phosphor]
    d.rectangle((12, 2, 19, 6), fill=ink)
    d.rectangle((13, 3, 18, 5), fill=body)
    d.line((13, 3, 18, 3), fill=light)
    d.rectangle((14, 7, 17, 11), fill=ink)
    d.line((15, 7, 15, 10), fill=light)
    if single:
        d.polygon([(7, 10), (15, 8), (24, 17), (24, 24), (18, 28), (8, 20)], fill=ink)
        d.polygon([(9, 11), (14, 10), (22, 18), (17, 24), (9, 18)], fill=body)
        d.line((10, 11, 20, 18), fill=light, width=2)
        d.rectangle((6, 12, 9, 17), fill=ink)
        d.line((7, 13, 7, 16), fill=light)
        d.ellipse((15, 16, 28, 29), fill=ink)
        d.ellipse((16, 17, 27, 28), fill=light)
        d.ellipse((17, 18, 26, 27), fill=dark)
        d.ellipse((18, 19, 25, 26), fill=lens)
        d.line((19, 20, 22, 20), fill=gleam)
        d.point((19, 21), fill=gleam)
        d.rectangle((13, 11, 16, 14), fill=ink)
        d.line((14, 11, 16, 13), fill=light)
    else:
        d.line((4, 11, 27, 11), fill=ink, width=4)
        d.line((5, 10, 26, 10), fill=light)
        for x, y in ((4, 19), (12, 17), (20, 17), (27, 19)):
            d.rectangle((x-3, y-7, x+3, y), fill=ink)
            d.rectangle((x-2, y-6, x+2, y), fill=body)
            d.line((x-2, y-6, x+1, y-6), fill=light)
            d.line((x-2, y-3, x+2, y-3), fill=dark)
            d.ellipse((x-4, y-3, x+4, y+5), fill=ink)
            d.ellipse((x-3, y-2, x+3, y+4), fill=light)
            d.ellipse((x-2, y-1, x+2, y+3), fill=dark)
            d.ellipse((x-1, y, x+1, y+2), fill=lens)
            d.point((x-1, y), fill=gleam)
    return image
