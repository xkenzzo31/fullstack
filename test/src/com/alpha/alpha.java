package com.alpha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class alpha {
    private JButton button1;
    private JPanel panel1;

    private alpha() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"test");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("alpha");
        frame.setContentPane(new alpha().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
