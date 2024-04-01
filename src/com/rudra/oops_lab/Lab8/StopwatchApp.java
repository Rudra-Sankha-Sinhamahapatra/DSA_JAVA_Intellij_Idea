package com.rudra.oops_lab.Lab8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchApp {
    private JFrame frame;
    private JLabel timeLabel;
    private JButton startButton;
    private JButton stopButton;
    private long startTime;
    private boolean running;

    public StopwatchApp() {
        frame = new JFrame("Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(timeLabel);

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });
        frame.add(startButton);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });
        frame.add(stopButton);

        frame.setVisible(true);
    }

    private void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
            Thread timerThread = new Thread(new TimerRunnable());
            timerThread.start();
        }
    }

    private void stop() {
        if (running) {
            running = false;
        }
    }

    private class TimerRunnable implements Runnable {
        public void run() {
            while (running) {
                long currentTime = System.currentTimeMillis();
                long elapsedTime = currentTime - startTime;
                long seconds = elapsedTime / 1000;
                long minutes = seconds / 60;
                long hours = minutes / 60;
                seconds %= 60;
                minutes %= 60;
                hours %= 24;

                String timeStr = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                timeLabel.setText(timeStr);

                try {
                    Thread.sleep(1000); // Update every second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopwatchApp();
            }
        });
    }
}
