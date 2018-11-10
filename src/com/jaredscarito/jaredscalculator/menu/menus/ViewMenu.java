package com.jaredscarito.jaredscalculator.menu.menus;

import com.jaredscarito.jaredscalculator.menu.menus.items.ProgrammerItem;
import com.jaredscarito.jaredscalculator.menu.menus.items.ScientificItem;
import com.jaredscarito.jaredscalculator.menu.menus.items.StandardItem;

import javax.swing.*;

/**
 * Created by user on 11/7/2018.
 */
public class ViewMenu extends JMenu {
    /**
     * View:
     * - Standard
     * - Scientific
     * - Programmer
     */
    public ViewMenu() {
        add(new StandardItem());
        addSeparator();
        add(new ScientificItem());
        addSeparator();
        add(new ProgrammerItem());
        setText("View");
    }
}
