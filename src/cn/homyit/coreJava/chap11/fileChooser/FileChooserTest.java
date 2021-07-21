package cn.homyit.coreJava.chap11.fileChooser;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class FileChooserTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ImageViewerFrame();
            frame.setTitle("FileChooserTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
