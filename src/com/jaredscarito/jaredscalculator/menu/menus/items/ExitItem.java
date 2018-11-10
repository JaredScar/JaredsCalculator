package com.jaredscarito.jaredscalculator.menu.menus.items;

import com.jaredscarito.jaredscalculator.modules.frames.CalcFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by user on 11/8/2018.
 */
public class ExitItem extends JMenuItem implements ActionListener {
    public ExitItem() {
        setText("Exit");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CalcFrame.getInstance().setVisible(false);
        CalcFrame.getInstance().dispatchEvent(new WindowEvent(CalcFrame.getInstance(), WindowEvent.WINDOW_CLOSING));
    }
}
