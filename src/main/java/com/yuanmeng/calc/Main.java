package com.yuanmeng.calc;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarculaLaf;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });

    }
}