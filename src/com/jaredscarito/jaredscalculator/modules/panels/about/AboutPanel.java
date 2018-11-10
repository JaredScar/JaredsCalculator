package com.jaredscarito.jaredscalculator.modules.panels.about;

import com.jaredscarito.jaredscalculator.displays.AboutDisplay;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11/10/2018.
 */
public class AboutPanel extends JPanel {
    public AboutPanel() {
        AboutDisplay about = new AboutDisplay();
        add(about);

        setBounds(0, 0, 500, 500);
        setLayout(null);
        setBackground(Color.WHITE);
        setVisible(true);
    }
}
