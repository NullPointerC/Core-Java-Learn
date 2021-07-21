package cn.homyit.coreJava.chap11.border;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class BorderTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new BorderFrame();
            frame.setTitle("BorderTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
