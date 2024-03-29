package com.rudra.GUI_Swing.Lec2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon originalImage=new ImageIcon("C:\\IntelliJ\\DSA-JAVA\\src\\com\\rudra\\GUI_Swing\\Express.png");
        Image scaledImage=originalImage.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(scaledImage);
        //JLabel=a GUI display area for a string of text,an image,or both
        JLabel label=new JLabel();
        label.setIcon(image);
        label.setText("Bro do you code?");
         label.setIcon(image);
         label.setHorizontalTextPosition(JLabel.CENTER);
         label.setVerticalTextPosition(JLabel.TOP);
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}
