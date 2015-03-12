from instagram.client import InstagramAPI
from PIL import Image
from PIL.ExifTags import TAGS

def get_exif_data(fname):
    """Get embedded EXIF data from image file."""
    ret = {}
    try:
        img = Image.open(fname)
        if hasattr( img, '_getexif' ):
            exifinfo = img._getexif()
            if exifinfo != None:
                for tag, value in exifinfo.items():
                    decoded = TAGS.get(tag, tag)
                    ret[decoded] = value
    except IOError:
        print 'IOERROR ' + fname
    return ret

access_token = "aqui va el token que generen"
api = InstagramAPI(access_token=access_token)
recent_media, next_ = api.user_recent_media(user_id="aqui va el user id que tengan o del que quieren ver", count=10)
for media in recent_media:
	print media.caption.text

print "------------------------------"
popular_media = api.media_popular(count=20)
for media in popular_media:
	print media.images['standard_resolution'].url


print get_exif_data("salida.jpg")