package cn.homyit.coreJava.chap10.listFonts;

import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class ListFonts {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();

        for (String fontName : fontNames) {
           System.out.println(fontName);
        }
    }
}
