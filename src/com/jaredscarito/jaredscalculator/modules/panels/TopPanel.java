package com.jaredscarito.jaredscalculator.modules.panels;

import com.jaredscarito.jaredscalculator.menu.Menubar;

import javax.swing.*;
import java.awt.*;

/**
 * Created by TheWolfBadger on 11/7/18.
 */
public class TopPanel extends JPanel {
    public TopPanel() {
        // Add cmpnts
        add(new Menubar());


        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setBounds(0, 0, 500, 20);
        setVisible(true);
    }
}
