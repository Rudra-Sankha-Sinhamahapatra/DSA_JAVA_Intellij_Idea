package com.rudra.GUI_Swing.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame implements ActionListener {
    private JTextField display;
    private double firstValue = 0;
    private String operator = "";
    public CalculatorApp() {
        super("Basic Calculator");
        display = new JTextField();
        display.setFont(new Font("Sans Serif", Font.BOLD, 20));
        display.setEditable(false);
        display.setBackground(Color.LIGHT_GRAY);
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonDivide = new JButton("/");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonMultiply = new JButton("*");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton buttonSubtract = new JButton("-");
        JButton button0 = new JButton("0");
        JButton buttonDecimal = new JButton(".");
        JButton buttonEquals = new JButton("=");
        JButton buttonAdd = new JButton("+");
        JButton buttonClear = new JButton("C");
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonDivide.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        buttonMultiply.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        buttonSubtract.addActionListener(this);
        button0.addActionListener(this);
        buttonDecimal.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonClear.addActionListener(this);
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonSubtract);
        buttonPanel.add(button0);
        buttonPanel.add(buttonDecimal);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonClear);
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0))) {
            display.setText(display.getText() + command);
        } else if (command.equals(".")) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        } else if (command.equals("C")) {
            display.setText("");
            firstValue = 0;
            operator = "";
        } else {
            operator = command;
            firstValue = Double.parseDouble(display.getText());
            display.setText("");
        }
        if (command.equals("=")) {
            double secondValue = Double.parseDouble(display.getText());
            double result = calculate(firstValue, operator, secondValue);
            display.setText(String.valueOf(result));
            firstValue = 0;
            operator = "";
        }
    }
    private double calculate(double firstValue, String operator, double secondValue) {
        switch (operator) {
            case "+":
                return firstValue + secondValue;
            case "-":
                return firstValue - secondValue;
            case "*":
                return firstValue * secondValue;
            case "/":
                if (secondValue == 0) {
                    JOptionPane.showMessageDialog(this, "Error: Cannot divide by zero!", "Calculator Error", JOptionPane.ERROR_MESSAGE);
                    return 0;
                } else {
                    return firstValue / secondValue;
                }
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        new CalculatorApp();
    }
}
