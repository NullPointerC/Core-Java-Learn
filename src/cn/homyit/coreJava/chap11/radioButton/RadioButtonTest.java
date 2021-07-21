package cn.homyit.coreJava.chap11.radioButton;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class RadioButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new RadioButtonFrame();
            frame.setTitle("RadioButtonTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
