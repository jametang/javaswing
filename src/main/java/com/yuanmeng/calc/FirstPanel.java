package com.yuanmeng.calc;

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FirstPanel extends JPanel implements ComponentListener{
    JList list;
    JScrollPane scrollPane;
    private static final String[] items = { "11111", "222222", "33333", "444444", "555555", "666666", "777777",
            "888888", "999999", "10101010", "11111", "222222", "33333", "444444", "555555", "666666", "777777",
            "888888", "999999", "10101010" };

    FirstPanel() {
        JLabel label = new JLabel();
        label.setText("这是放在ThirdPanel上的标签");
        this.add(label);
        initView();
    }

    private void initView() {
        setLayout(new BorderLayout());
        scrollPane = new JScrollPane();
        scrollPane.setSize(getWidth(), getHeight() / 2);
        list = new JList();
        scrollPane.setViewportView(list);
        list.setListData(items);
        this.add(scrollPane, BorderLayout.NORTH);
        this.setVisible(true);
    }

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 200;
    public static final int HEIGHT = 600;

    public static final int BUTTON_WIDTH = 100;
    public static final int BUTTON_HEIGHT = 50;

    public static final int BUTTON_X = (WIDTH - BUTTON_WIDTH) / 2;
    public static final int BUTTON_Y = (HEIGHT - BUTTON_HEIGHT) / 2;

    @Override
    public void componentResized(ComponentEvent e) {
        scrollPane.setSize(getWidth(), getHeight()/2);
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'componentMoved'");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'componentShown'");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'componentHidden'");
    }

}
