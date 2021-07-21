package cn.homyit.coreJava.chap10.action;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class ActionTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ActionFrame();
            frame.setTitle("ActionTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
