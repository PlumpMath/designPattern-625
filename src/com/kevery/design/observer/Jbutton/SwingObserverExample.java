package com.kevery.design.observer.Jbutton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kever
 * 16/8/1.
 */
public class SwingObserverExample {
    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }
    public void go() {
        JFrame mw = new JFrame("我的第一个窗口");
        mw.setSize(250,200);
        JButton button = new JButton("我是一个按钮");
        mw.getContentPane().add(button);
        mw.setVisible(true);
        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());
    }

    class AngleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it,you might regret it");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on,do it!");
        }
    }
}
