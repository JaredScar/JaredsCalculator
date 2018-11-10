package com.jaredscarito.jaredscalculator.displays;

import javax.swing.*;
import java.awt.*;

/**
 * Created by TheWolfBadger on 11/7/18.
 */
public class CalcDisplay extends JTextField {
    public CalcDisplay() {
        setBounds(0, 0, 500, 40);
        setEditable(false);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        Font fontTwenty = new Font("SansSerif", Font.PLAIN, 20);
        setFont(fontTwenty);
        setText("0.0"); // Starter
        setHorizontalAlignment(JTextField.RIGHT);
    }
}
