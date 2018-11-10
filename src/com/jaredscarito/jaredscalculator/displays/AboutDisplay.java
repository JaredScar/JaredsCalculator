package com.jaredscarito.jaredscalculator.displays;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 11/10/2018.
 */
public class AboutDisplay extends JTextArea {
    public AboutDisplay() {
        setBounds(100, 100, 300, 300);
        Font font = new Font("Serif", Font.PLAIN, 24);
        setFont(font);
        setLineWrap(true);
        setWrapStyleWord(true);
        setEditable(false);
        setText("This is a Java Calculator program that was made for Professor McAllister's COM-370 class at St. Joseph's College Long Island.");
    }
}
