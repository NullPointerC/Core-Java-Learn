package cn.homyit.coreJava.chap11.text;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class TextComponentTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new TextComponentFrame();
            frame.setTitle("TextComponentTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
