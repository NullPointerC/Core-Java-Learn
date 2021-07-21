package cn.homyit.coreJava.chap11.dataExchange;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ziqiang CAO
 */
public class DataExchangeTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new DataExchangeFrame();
            frame.setTitle("DataExchangeTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
