package com.jaredscarito.jaredscalculator.modules.frames;

import com.jaredscarito.jaredscalculator.modules.panels.DisplayPanel;
import com.jaredscarito.jaredscalculator.modules.panels.TopPanel;
import com.jaredscarito.jaredscalculator.modules.panels.standard.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by TheWolfBadger on 11/7/18.
 */
public class CalcFrame extends JFrame {
    public static CalcFrame calcFrame;
    private DisplayPanel displayPanel;
    private ArrayList<Component> calcComponents;
    private TopPanel topPanel;
    public CalcFrame() {
        calcFrame = this;
        // Set up icon
        ImageIcon icon = new ImageIcon("img/icon.png");
        setIconImage(icon.getImage());

        // Add cmpnts
        TopPanel topPanel = new TopPanel();
        this.topPanel = topPanel;
        TopButtonPanel topButtonPanel = new TopButtonPanel();
        SidePanel sidePanel = new SidePanel();
        ButtonPanel buttonPanel = new ButtonPanel();
        add(topPanel);
        add(topButtonPanel);
        add(sidePanel);
        add(buttonPanel);
        this.calcComponents = new ArrayList<>();
        this.calcComponents.add(topButtonPanel);
        this.calcComponents.add(sidePanel);
        this.calcComponents.add(buttonPanel);

        this.displayPanel = new DisplayPanel();
        add(this.displayPanel);

        setLayout(null);
        setSize(505, 500);
        setResizable(false);
        setName("Jared's Calculator");
        setTitle("Jared's Calculator");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static CalcFrame getInstance() {
        return calcFrame;
    }

    public ArrayList<Component> getCalcComponents() {
        return this.calcComponents;
    }

    public void addCalcComponent(Component comp) {
        add(comp);
        this.calcComponents.add(comp);
    }

    public void removeCalcComponent(Component comp) {
        remove(comp);
        this.calcComponents.remove(comp);
    }

    public void clearCalcComponents() {
        for(Component comp : this.calcComponents) {
            comp.setVisible(false);
            remove(comp);
        }
        this.calcComponents = new ArrayList<>();
    }

    public TopPanel getTopPanel() {
        return this.topPanel;
    }

    public DisplayPanel getDisplayPanel() {
        return this.displayPanel;
    }
}
