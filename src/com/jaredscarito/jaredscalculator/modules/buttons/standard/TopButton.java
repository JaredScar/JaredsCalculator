package com.jaredscarito.jaredscalculator.modules.buttons.standard;

import com.jaredscarito.jaredscalculator.api.API;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 11/8/2018.
 */
public class TopButton extends JButton implements ActionListener {
    // Light gray color: new Color(245,245,245);
    public TopButton(String name) {
        setText(name);
        setName(name);
        setActionCommand(name);
        // Font
        Font font = new Font("Serif", Font.PLAIN, 20);
        setFont(font);
        addActionListener(this);

        setBackground(new Color(245,245,245));
        setForeground(Color.RED);
        setMargin(new Insets(0, 0, 0, 0));
        setPreferredSize(new Dimension(100, 40));
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Backspace":
                // backspace action
                API.getInstance().backspace();
                break;
            case "CE":
                // Clear Entry action
                API.getInstance().clearEntry();
                break;
            case "C":
                // Clear action
                API.getInstance().clearAll();
                break;
        }
    }
}
