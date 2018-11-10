package com.jaredscarito.jaredscalculator.modules.panels.standard;

import com.jaredscarito.jaredscalculator.modules.buttons.standard.Button;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11/9/2018.
 */
public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        // Add cmpnts
        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("/"));
        add(new Button("sqrt"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("*"));
        add(new Button("%"));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("-"));
        add(new Button("1/x"));
        add(new Button("0"));
        add(new Button("+/-"));
        add(new Button("."));
        add(new Button("+"));
        add(new Button("="));


        setLayout(new GridLayout(4, 5, 5, 5));
        setBounds(145, 130, 320, 300);
        setVisible(true);
    }
}
