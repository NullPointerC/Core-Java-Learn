package cn.homyit.coreJava.chap10.button;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ziqiang CAO
 */
public class ButtonTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         var frame = new ButtonFrame();
         frame.setTitle("ButtonTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
