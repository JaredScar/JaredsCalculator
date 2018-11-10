package com.jaredscarito.jaredscalculator.menu.menus.items;

import com.jaredscarito.jaredscalculator.api.API;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 11/8/2018.
 */
public class PropertiesItem extends JMenuItem implements ActionListener {
    public PropertiesItem() {
        setText("Properties");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Open up properties popup
        API.getInstance().changeFrame(5);
    }
}
