package com.jaredscarito.jaredscalculator.menu;

import com.jaredscarito.jaredscalculator.menu.menus.EditMenu;
import com.jaredscarito.jaredscalculator.menu.menus.ViewMenu;
import com.jaredscarito.jaredscalculator.menu.menus.HelpMenu;

import javax.swing.*;

/**
 * Created by user on 11/7/2018.
 */
public class Menubar extends JMenuBar {
    private static Menubar menubar;
    private ViewMenu view;
    private EditMenu edit;
    private HelpMenu help;
    public Menubar() {
        menubar = this;
        this.view = new ViewMenu();
        this.edit = new EditMenu();
        this.help = new HelpMenu();
        add(this.view);
        add(this.edit);
        add(this.help);

        setBounds(0, 0, 500, 20);
        setVisible(true);
    }

    public static Menubar getInstance() {
        return menubar;
    }

    public ViewMenu getViewMenu() {
        return this.view;
    }
    public EditMenu getEditMenu() {
        return this.edit;
    }
    public HelpMenu getHelpMENU() {
        return this.help;
    }
}


















