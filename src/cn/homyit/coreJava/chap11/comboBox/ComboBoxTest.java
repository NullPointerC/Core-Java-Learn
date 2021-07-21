package cn.homyit.coreJava.chap11.comboBox;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class ComboBoxTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ComboBoxFrame();
            frame.setTitle("ComboBoxTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
