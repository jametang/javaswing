package com.yuanmeng.calc;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ThirdPanel extends JPanel {



    JList list;
    
    private static final String[] items = {"11111", "222222", "33333", "444444", "555555", "666666", "777777", "888888", "999999", "10101010"};

    public ThirdPanel(){
        // this.setBounds(0, 0, 200, 600);
        JLabel label = new JLabel();
        label.setText("这是放在FirstPanel上的标签");
        this.add(label);
        initView();
    }
    
    private void initView(){
        list = new JList(items);
        this.add(list);
        this.setVisible(true);
    } 

}
