package com.jaredscarito.jaredscalculator.menu.menus;

import com.jaredscarito.jaredscalculator.menu.menus.items.ExitItem;
import com.jaredscarito.jaredscalculator.menu.menus.items.OptionsItem;
import com.jaredscarito.jaredscalculator.menu.menus.items.PropertiesItem;

import javax.swing.*;

/**
 * Created by user on 11/7/2018.
 */
public class EditMenu extends JMenu {
    /**
     * Edit:
     * - Options
     * - Properties
     * - Exit
     */
    public EditMenu() {
        add(new OptionsItem());
        addSeparator();
        add(new PropertiesItem());
        addSeparator();
        add(new ExitItem());
        setText("Edit");
    }
}
