package cn.homyit.coreJava.chap11.circleLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class CircleLayoutTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new CircleLayoutFrame();
            frame.setTitle("CircleLayoutTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
