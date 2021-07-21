package cn.homyit.coreJava.chap11.slider;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class SliderTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new SliderFrame();
            frame.setTitle("SliderTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
