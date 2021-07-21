package cn.homyit.coreJava.chap11.dialog;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class DialogTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new DialogFrame();
            frame.setTitle("DialogTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
