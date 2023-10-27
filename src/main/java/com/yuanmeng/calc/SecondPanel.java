package com.yuanmeng.calc;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class SecondPanel extends JPanel {
    JList list;
    private static final String[] items = { "11111", "222222", "33333", "444444", "555555", "666666", "777777",
            "888888", "999999", "10101010" };

    SecondPanel() {
        JLabel label = new JLabel();
        label.setText("这是放在SecondPanel上的标签");
        this.add(label);
        initView();
    }

    private void initView() {
        list = new JList(items);
        this.add(list);
        this.setVisible(true);
    }

    // public void paintComponent(Graphics g) {

    // g.setColor(Color.red);
    // g.fillRect(getX(), getY(), getX() + getWidth(), getY() + getHeight());
    // Logger.getLogger(FirstPanel.class.getName()).info("paintComponent");
    // }
}
