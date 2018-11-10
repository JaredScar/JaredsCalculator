package com.jaredscarito.jaredscalculator.modules.panels.standard;

import com.jaredscarito.jaredscalculator.modules.buttons.standard.TopButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11/8/2018.
 */
public class TopButtonPanel extends JPanel {
    public TopButtonPanel() {
        // Add cmpnts
        JTextField emptyBox = new JTextField();
        emptyBox.setEditable(false);
        emptyBox.setEnabled(false);
        add(emptyBox);
        add(new TopButton("Backspace"));
        add(new TopButton("CE"));
        add(new TopButton("C"));

        setLayout(new GridLayout(1, 4, 10, 0));
        setBounds(20, 80, 460, 40);
        setVisible(true);
    }
}
