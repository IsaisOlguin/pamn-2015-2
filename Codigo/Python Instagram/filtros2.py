from PIL import Image, ImageFilter

im = Image.open("00000001.jpg")
im = im.filter(ImageFilter.CONTOUR)

im.save("cb" + ".jpg")
im.show()
