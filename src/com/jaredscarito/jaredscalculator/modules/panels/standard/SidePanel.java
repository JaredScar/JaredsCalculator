package com.jaredscarito.jaredscalculator.modules.panels.standard;

import com.jaredscarito.jaredscalculator.modules.buttons.standard.SideButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11/8/2018.
 */
public class SidePanel extends JPanel {
    public SidePanel() {
        // Add cmpnts
        add(new SideButton("MC"));
        add(new SideButton("MR"));
        add(new SideButton("MS"));
        add(new SideButton("M+"));

        setBounds(20, 130, 110, 300);
        setLayout(new GridLayout(4, 1, 10, 10));
    }
}
