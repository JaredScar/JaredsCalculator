package com.jaredscarito.jaredscalculator.menu.menus.items;

import com.jaredscarito.jaredscalculator.api.API;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 11/8/2018.
 */
public class AboutItem extends JMenuItem implements ActionListener {
    public AboutItem() {
        setText("About");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Open up About frame
        API.getInstance().changeFrame(3);
    }
}
