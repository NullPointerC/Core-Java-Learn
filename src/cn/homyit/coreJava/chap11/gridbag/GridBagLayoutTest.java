package cn.homyit.coreJava.chap11.gridbag;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class GridBagLayoutTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new FontFrame();
            frame.setTitle("GridBagLayoutTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
