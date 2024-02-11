/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui3_label;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class Gui3_label {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Örneği");
        int[] sayac = {0};
        JLabel l1 = new JLabel("Yazı Kısmı");
        l1.setText("YAzı Etiketi");
        l1.setBounds(100, 50, 200, 30);
        frame.add(l1);
        JButton btn = new JButton();
        btn.setText("BTn Text");
        btn.setBounds(100, 100, 100, 30);

        btn.addActionListener(new ActionListener() {
            int c=1;
            @Override
            public void actionPerformed(ActionEvent e) {
                sayac[0]++;
                l1.setText("butona tıklandı" + sayac[0]+" c:"+ c++);
            }
        });
        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
