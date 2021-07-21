package cn.homyit.coreJava.chap11.checkBox;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class CheckBoxTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new CheckBoxFrame();
            frame.setTitle("CheckBoxTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
