from urllib.request import urlopen
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('Enter - ')
html = urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, "html.parser")

# Retrieve all of the anchor tags
tags = soup('a')
for tag in tags:
    # Look at the parts of a tag
    print('TAG:', tag)
    #print the url
    print('URL:', tag.get('href', None))
    #prints the content inside the tag
    #eg<span>35 so tag.contents[0]=35
    print('Contents:', tag.contents[0])
    #make list
    print('Attrs:', tag.attrs)
