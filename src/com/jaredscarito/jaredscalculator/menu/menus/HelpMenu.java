package com.jaredscarito.jaredscalculator.menu.menus;

import com.jaredscarito.jaredscalculator.menu.menus.items.AboutItem;

import javax.swing.*;

/**
 * Created by user on 11/7/2018.
 */
public class HelpMenu extends JMenu {
    /**
     * Help:
     * - About
     */
    public HelpMenu() {
        setText("Help");
        add(new AboutItem());
    }
}
