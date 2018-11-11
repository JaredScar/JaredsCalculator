package com.jaredscarito.jaredscalculator.displays;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11/11/2018.
 */
public class MemDisplay extends JTextField {
    public MemDisplay() {
        setBounds(0, 0, 30, 20);
        setEditable(false);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        Font font = new Font("SansSerif", Font.PLAIN, 16);
        setFont(font);
        setHorizontalAlignment(JTextField.RIGHT);
    }
}
