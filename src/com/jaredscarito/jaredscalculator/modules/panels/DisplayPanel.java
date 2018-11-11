package com.jaredscarito.jaredscalculator.modules.panels;

import com.jaredscarito.jaredscalculator.displays.CalcDisplay;
import com.jaredscarito.jaredscalculator.displays.MemDisplay;

import javax.swing.*;

/**
 * Created by TheWolfBadger on 11/7/18.
 */
public class DisplayPanel extends JPanel {
    private CalcDisplay calcDisplay;
    private MemDisplay memDisplay;
    public DisplayPanel() {
        // Add cmpnts
        this.memDisplay = new MemDisplay();
        add(this.memDisplay);
        this.calcDisplay = new CalcDisplay();
        add(this.calcDisplay);

        setLayout(null);
        setBounds(0, 20, 500, 40);
        setVisible(true);
    }

    public MemDisplay getMemDisplay() {
        return this.memDisplay;
    }

    public CalcDisplay getCalcDisplay() {
        return this.calcDisplay;
    }
}
