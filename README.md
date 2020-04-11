# Squix-Display-FontConverterV3

Offline console utility to convert any font to use with Squix's OLED display library. The online tool list some good font options, however there's sometimes need that developer wants own font to be used.

## Added commannd line parameters:
1. Font name in quotes
2. Integer font size
3. r = regular, b = bold

## Usage example, writes console output to file:
> java FontConverterV3 "Tahoma" 14 r > font-tahoma.h

Pre-compiled binary under Releases.

Extracted from source of online Font Converter at http://oleddisplay.squix.ch/
with source available at https://github.com/squix78/esp8266-display-tools

Compiled online to binary release using https://www.compilejava.net
