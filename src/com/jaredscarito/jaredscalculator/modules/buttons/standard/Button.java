package com.jaredscarito.jaredscalculator.modules.buttons.standard;

import com.jaredscarito.jaredscalculator.api.API;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 11/9/2018.
 */
public class Button extends JButton implements ActionListener {
    public Button(String name) {
        setName(name);
        setText(name);
        setActionCommand(name);
        // Font
        Font font = new Font("Serif", Font.PLAIN, 20);
        setFont(font);
        addActionListener(this);

        setBackground(new Color(245,245,245));
        switch (name) {
            case "/":
                setForeground(Color.RED);
                break;
            case "*":
                setForeground(Color.RED);
                break;
            case "-":
                setForeground(Color.RED);
                break;
            case "+":
                setForeground(Color.RED);
                break;
            case "=":
                setForeground(Color.RED);
                break;
            default:
                setForeground(Color.BLUE);
                break;
        }
        setMargin(new Insets(0, 0, 0, 0));
        setPreferredSize(new Dimension(100, 40));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "/":
                API.getInstance().enterOperator(e.getActionCommand());
                break;
            case "*":
                API.getInstance().enterOperator(e.getActionCommand());
                break;
            case "-":
                API.getInstance().enterOperator(e.getActionCommand());
                break;
            case "+":
                API.getInstance().enterOperator(e.getActionCommand());
                break;
            case "=":
                API.getInstance().enterOperator(e.getActionCommand());
                break;
            case "sqrt":
                API.getInstance().squareRoot();
                break;
            case "%":
                API.getInstance().enterOperator(e.getActionCommand());
                break;
            case "1/x":
                API.getInstance().oneDivideByX();
                break;
            case "+/-":
                // Switch number from positive to negative, negative to positive
                API.getInstance().switchSign();
                break;
            default: // It's a number or period:
                API.getInstance().enterNum(e.getActionCommand());
                break;
        }
    }
}
