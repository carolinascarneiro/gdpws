#Bitcoin scraper
#Find the URL that you want to scrape
#Inspecting the Page
#Find the data you want to extract
#Write the code
#Run the code and extract the data
#Store the data in the required format 
#Send me the value of bitcoin every 30 minutes per email

from bs4 import BeautifulSoup as bs
from requests_html import HTMLSession
import requests

url = "https://coinmarketcap.com/de/currencies/bitcoin/"
r = requests.get(url)
soup = bs(r.content, 'html.parser')

#<div class="sc-16r8icm-0 kjciSH priceTitle"><div class="priceValue "><span>€30,540.56</span></div><span style="font-size:14px;font-weight:600;padding:5px 10px" class="sc-15yy2pl-0 feeyND"><span class="icon-Caret-down"></span>4.55<!-- -->%</span></div>