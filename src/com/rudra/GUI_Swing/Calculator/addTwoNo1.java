package com.rudra.GUI_Swing.Calculator;

import java.awt.event.*;
import javax.swing.*;    
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class addTwoNo1 extends JFrame implements ActionListener 
 {  
        JFrame f;
  	JLabel l1,l2,l3,l4;
  	JButton b1;
  	JTextField t1,t2;

       // public void addTwoNo(String s)
  	//{
  	//super(s);
  	//}
   addTwoNo1()
     {
        f=new JFrame("Addition of Two Number Example");  
 	l1=new JLabel("Addition of two Number");
 	l2=new JLabel("Enter First Number");
 	l3=new JLabel("Enter Second Number");
 	l4=new JLabel();
 	t1=new JTextField();
 	t2=new JTextField();
 	b1=new JButton("ADD");
 	   	 
    	l1.setBounds(50,50,200,20);
    	f.add(l1);
   	l2.setBounds(50,80,100,20);
   	f.add(l2);
   	t1.setBounds(150,80,100,20);
   	f.add(t1);
   	l3.setBounds(50,130,100,20);
   	f.add(l3);
  	t2.setBounds(150,130,100,20);
  	f.add(t2);
        b1.setBounds(80,180,100,20);
  	f.add(b1);
        l4.setBounds(350,340,200,20);
   	f.add(l4);

        b1.addActionListener(this);
  	  
       f.setSize(400,400);  
       f.setLayout(null);  
       f.setVisible(true);   
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } 	
 
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == b1)
        {
         int a=Integer.parseInt(t1.getText());
         int b=Integer.parseInt(t2.getText());
         int s=a+b;
         l4.setText("Result= "+s);
        }
   }

public static void main(String args[])
  {
 new addTwoNo1();
 
  }
}
 