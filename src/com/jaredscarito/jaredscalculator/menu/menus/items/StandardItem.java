package com.jaredscarito.jaredscalculator.menu.menus.items;

import com.jaredscarito.jaredscalculator.api.API;
import com.jaredscarito.jaredscalculator.menu.Menubar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 11/8/2018.
 */
public class StandardItem extends JMenuItem implements ActionListener {
    public StandardItem() {
        setText("Standard ✓");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Component component : Menubar.getInstance().getViewMenu().getMenuComponents()) {
            if(component instanceof JMenuItem) {
                JMenuItem menuItem = (JMenuItem) component;
                if(!menuItem.getText().equals("Standard")) {
                    menuItem.setText(menuItem.getText().replace("✓", ""));
                }
            }
        }
        this.setText("Standard ✓");

        // Actually open up standard calculator using CalcFrame
        API.getInstance().changeFrame(0);
    }
}
