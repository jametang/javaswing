package com.yuanmeng.calc;

import java.awt.BorderLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.GridLayout;

public class MainFrame extends JFrame implements ComponentListener {

    public int FrameWith = 600;
    public int FrameHeight = 400;
    private static final Logger logger = Logger.getLogger(MainFrame.class.getName());
    FirstPanel firstPanel;
    SecondPanel secondPanel;
    ThirdPanel thirdPanel;

    public MainFrame() {
        super();
        initView();
        initListener();
    }

    private void initView() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(FrameWith, FrameHeight);
        setLayout(new GridLayout());
        setTitle("单量计算");

        firstPanel = new FirstPanel();
        firstPanel.setSize(FrameWith / 3, FrameHeight);
        add(firstPanel, BorderLayout.WEST);

        secondPanel = new SecondPanel();
        secondPanel.setSize(FrameWith / 3, FrameHeight);
        add(secondPanel, BorderLayout.CENTER);

        thirdPanel = new ThirdPanel();
        thirdPanel.setSize(FrameWith / 3, FrameHeight);
        add(thirdPanel, BorderLayout.EAST);
    }

    private void refreshSize() {
        firstPanel.setSize(FrameWith / 3, FrameHeight);
        secondPanel.setSize(FrameWith / 3, FrameHeight);
        thirdPanel.setSize(FrameWith / 3, FrameHeight);
    }

    private void initListener() {
        addComponentListener(this);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        logger.info("componentResized");
        FrameWith = getWidth();
        FrameHeight = getHeight();
        logger.info("componentResized Width: " + FrameWith);
        logger.info("componentResized Height: " + FrameHeight);
        refreshSize();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        logger.info("componentMoved");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        logger.info("componentShown");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        logger.info("componentHidden");
    }

}
