package cn.homyit.coreJava.chap10.mouse;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new MouseFrame();
            frame.setTitle("MouseTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
