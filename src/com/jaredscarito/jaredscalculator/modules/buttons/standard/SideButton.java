package com.jaredscarito.jaredscalculator.modules.buttons.standard;

import com.jaredscarito.jaredscalculator.api.API;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 11/8/2018.
 */
public class SideButton extends JButton implements ActionListener {
    public SideButton(String name) {
        setText(name);
        setName(name);
        setActionCommand(name);
        // Font
        Font font = new Font("Serif", Font.PLAIN, 20);
        setFont(font);
        addActionListener(this);

        setBackground(new Color(245,245,245));
        setForeground(Color.RED);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "MC":
                // Memory Clear
                API.getInstance().memClear();
                break;
            case "MR":
                // Memory Recall
                API.getInstance().memRecall();
                break;
            case "MS":
                // Memory Store
                API.getInstance().memStore();
                break;
            case "M+":
                // Memory Plus
                API.getInstance().memPlus();
                break;
        }
    }
}
