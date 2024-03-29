package com.rudra.GUI_Swing.Lec1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
MyFrame(){
    this.setSize(420,420);//sets height and width
    this.setVisible(true);//make frame visible
    this.setTitle("Awesome Swing");//sets title of frame
    this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);//exit out of application
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//hide out the application on close
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//does nothing on close(never closes the application)
    this.setResizable(false);//prevent from being resized
    ImageIcon image=new ImageIcon("C:\\IntelliJ\\DSA-JAVA\\src\\com\\rudra\\GUI_Swing\\logo.png");//create an image icon
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(123,50,250));//change color of the background

}
}
