package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JFrame {
    private ImageIcon bg_image;
    private JLabel bglable;
    private JButton MilanButton = new JButton("AC Milan");
    private JButton MadridButton = new JButton("Real Madrid");
    private JLabel ResultLabel = new JLabel("Result: 0 X 0");
    private JLabel LastScoreLabel = new JLabel("Last scorer: N/A");
    private JLabel WinnerLabel = new JLabel("Winner: DRAW");
    private int milanScore = 0;
    private int madridScore = 0;

    private void changeWinner() {
        if (milanScore > madridScore) {
            WinnerLabel.setText("Winner: AC Milan");
        } else if (milanScore == madridScore)
            WinnerLabel.setText("Winner: DRAW");
        else {
            WinnerLabel.setText("Winner: Real Madrid");
        }
    }

    window() {
        super("FootBall Winner");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(550, 300);
        add(MilanButton);
        add(MadridButton);
        add(ResultLabel);
        add(LastScoreLabel);
        add(WinnerLabel);
        MilanButton.setBounds(100, 55, 150, 30);
        MadridButton.setBounds(300, 55, 150, 30);
        ResultLabel.setBounds(100, 90, 150, 50);
        LastScoreLabel.setBounds(100, 120, 300, 50);
        WinnerLabel.setBounds(100, 150, 300, 50);
        setLayout(new FlowLayout());
        bg_image = new ImageIcon(getClass().getResource("saber.gif"));
        bglable = new JLabel(bg_image);
        add(bglable);

        MilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore += 1;
                ResultLabel.setText("Result: " + milanScore + " X " + madridScore);
                LastScoreLabel.setText("Last scorer: AC Milan");
                changeWinner();
            }
        });

        MadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore += 1;
                ResultLabel.setText("Result: " + milanScore + " X " + madridScore);
                LastScoreLabel.setText("Last scorer: Real Madrid");
                changeWinner();
            }
        });

        setVisible(true);
    }

}
