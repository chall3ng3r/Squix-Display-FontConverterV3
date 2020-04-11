import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://learn.adafruit.com/adafruit-gfx-graphics-library/using-fonts
 * https://github
 * .com/adafruit/Adafruit-GFX-Library/blob/master/fontconvert/fontconvert.c
 * https ://github.com/adafruit/Adafruit-GFX-Library/blob/master/Fonts/
 * FreeMono18pt7b .h
 * 
 * table[j].bitmapOffset = bitmapOffset; table[j].width = bitmap->width;
 * table[j].height = bitmap->rows; table[j].xAdvance = face->glyph->advance.x >>
 * 6; table[j].xOffset = g->left; table[j].yOffset = 1 - g->top;
 * 
 * bitmapOffset += (bitmap->width * bitmap->rows + 7) / 8;
 * 
 * Pad end of char bitmap to next byte boundary if needed
 * 
 * @author deichhor
 * 
 */
public class LetterData {

        private char code;

        private int[] bytes;
        private int width;
        private int height;

        private boolean visable;

        public LetterData(char code, int[] bytes, int width, int height, boolean visable) {
            this.code = code;
            this.bytes = bytes;
            this.width = width;
            this.height = height;
            this.visable = visable;
        }

        public char getCode() {
            return code;
        }

        public int[] getBytes() {
            return bytes;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public boolean isVisible() {
            return visable;
        }

        public int getByteSize() {
            return bytes.length;
        }

        public String toString() {
            if (bytes.length <= 0 || !visable) {
                return "";
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                if (i > 0) {
                    builder.append(",");
                }
                builder.append(String.format("0x%02X", (byte) bytes[i]));
            }
            return builder.toString();

        }
    }