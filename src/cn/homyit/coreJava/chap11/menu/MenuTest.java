package cn.homyit.coreJava.chap11.menu;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class MenuTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new MenuFrame();
            frame.setTitle("MenuTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
