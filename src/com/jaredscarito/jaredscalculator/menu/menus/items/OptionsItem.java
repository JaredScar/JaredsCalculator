package com.jaredscarito.jaredscalculator.menu.menus.items;

import com.jaredscarito.jaredscalculator.api.API;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 11/8/2018.
 */
public class OptionsItem extends JMenuItem implements ActionListener {
    public OptionsItem() {
        setText("Options");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Open up Options popup
        API.getInstance().changeFrame(4);
    }
}
