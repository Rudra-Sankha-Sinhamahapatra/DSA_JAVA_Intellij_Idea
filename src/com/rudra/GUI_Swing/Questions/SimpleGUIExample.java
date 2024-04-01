package com.rudra.GUI_Swing.Questions;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUIExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setSize(300, 200); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit when closed

        // Create a JPanel (container) to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Use FlowLayout

        // Create a label
        JLabel label = new JLabel("Enter your name:");

        // Create a text field
        JTextField textField = new JTextField(15); // 15 columns

        // Create a button
        JButton button = new JButton("Submit");

        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText(); // Get text from text field
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });

        // Set the frame visible
        frame.setVisible(true);
    }
}
