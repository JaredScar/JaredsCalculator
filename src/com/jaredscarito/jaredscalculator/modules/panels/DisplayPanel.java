package com.jaredscarito.jaredscalculator.modules.panels;

import com.jaredscarito.jaredscalculator.displays.CalcDisplay;

import javax.swing.*;

/**
 * Created by TheWolfBadger on 11/7/18.
 */
public class DisplayPanel extends JPanel {
    private CalcDisplay calcDisplay;
    public DisplayPanel() {
        // Add cmpnts
        this.calcDisplay = new CalcDisplay();
        add(this.calcDisplay);

        setLayout(null);
        setBounds(0, 20, 500, 40);
        setVisible(true);
    }

    public CalcDisplay getCalcDisplay() {
        return this.calcDisplay;
    }
}
