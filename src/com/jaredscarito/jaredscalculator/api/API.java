package com.jaredscarito.jaredscalculator.api;

import com.jaredscarito.jaredscalculator.menu.Menubar;
import com.jaredscarito.jaredscalculator.modules.frames.CalcFrame;
import com.jaredscarito.jaredscalculator.modules.panels.about.AboutPanel;
import com.jaredscarito.jaredscalculator.modules.panels.standard.ButtonPanel;
import com.jaredscarito.jaredscalculator.modules.panels.standard.SidePanel;
import com.jaredscarito.jaredscalculator.modules.panels.standard.TopButtonPanel;

/**
 * Created by user on 11/9/2018.
 */
public class API {
    private static API api;
    public API() {
        api = this;
    }
    public static API getInstance() {
        return api;
    }

    /**
     * Changing Calculator Frame
     *
     * Frames:
     *  0: Standard
     *  1: Scientific TODO
     *  2: Programmer TODO
     *  3: About
     *  4: Options TODO
     *  5: Properties TODO
     */
    public void changeFrame(int frame) {
        switch(frame) {
            case 0: // Standard
                // CalcFrame Size
                CalcFrame.getInstance().setSize(505, 500);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setBounds(0, 20, 500, 40);
                CalcFrame.getInstance().getDisplayPanel().getCalcDisplay().setBounds(0, 0, 500, 40);
                // MenuBar
                CalcFrame.getInstance().getTopPanel().setBounds(0, 0, 500, 20);
                Menubar.getInstance().setBounds(0, 0, 500, 20);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setVisible(true);

                CalcFrame.getInstance().clearCalcComponents();
                TopButtonPanel topButtonPanel = new TopButtonPanel();
                SidePanel sidePanel = new SidePanel();
                ButtonPanel buttonPanel = new ButtonPanel();
                CalcFrame.getInstance().add(topButtonPanel);
                CalcFrame.getInstance().add(sidePanel);
                CalcFrame.getInstance().add(buttonPanel);
                CalcFrame.getInstance().addCalcComponent(topButtonPanel);
                CalcFrame.getInstance().addCalcComponent(sidePanel);
                CalcFrame.getInstance().addCalcComponent(buttonPanel);
                break;
            case 1: // Scientific
                // CalcFrame Size
                CalcFrame.getInstance().setSize(805, 500);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setBounds(0, 20, 800, 40);
                CalcFrame.getInstance().getDisplayPanel().getCalcDisplay().setBounds(0, 0, 800, 40);
                // MenuBar
                CalcFrame.getInstance().getTopPanel().setBounds(0, 0, 800, 20);
                Menubar.getInstance().setBounds(0, 0, 800, 20);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setVisible(true);

                CalcFrame.getInstance().clearCalcComponents();

                // TODO Add Scientific Components:
                break;
            case 2: // Programmer
                // CalcFrame Size
                CalcFrame.getInstance().setSize(305, 500);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setBounds(0, 20, 300, 40);
                CalcFrame.getInstance().getDisplayPanel().getCalcDisplay().setBounds(0, 0, 300, 40);
                // MenuBar
                CalcFrame.getInstance().getTopPanel().setBounds(0, 0, 300, 20);
                Menubar.getInstance().setBounds(0, 0, 300, 20);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setVisible(true);

                CalcFrame.getInstance().clearCalcComponents();

                // TODO Add Programmer Components:
                break;
            case 3: // About
                // CalcFrame Size
                CalcFrame.getInstance().setSize(505, 500);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setBounds(0, 20, 500, 40);
                CalcFrame.getInstance().getDisplayPanel().getCalcDisplay().setBounds(0, 0, 500, 40);
                // MenuBar
                CalcFrame.getInstance().getTopPanel().setBounds(0, 0, 500, 20);
                Menubar.getInstance().setBounds(0, 0, 500, 20);
                // DisplayPanel
                CalcFrame.getInstance().getDisplayPanel().setVisible(true);
                CalcFrame.getInstance().clearCalcComponents();
                AboutPanel about = new AboutPanel();
                CalcFrame.getInstance().add(about);
                CalcFrame.getInstance().addCalcComponent(about);
                CalcFrame.getInstance().getDisplayPanel().setVisible(false);
                break;
            case 4: // Options
                break;
            case 5: // Properties
                break;
        }
    }



    public String currentNum = "0.0";
    public double currentResult = 0.0;
    public boolean lastEntryWasOperand = true;
    /**
     * Memory Storage:
     */
    private double numInMem = 0.0;
    public void memClear() {
        numInMem = 0.0;
        CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("");
    }
    public void memRecall() {
        updateText(String.valueOf(numInMem));
        CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        lastEntryWasOperand = false;
    }
    public void memStore() {
        numInMem = Double.parseDouble(getText());
        CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
    }
    public void memPlus() {
        double numToAdd = Double.parseDouble(getText());
        numInMem += numToAdd;
        updateText(String.valueOf(numInMem));
        CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        lastEntryWasOperand = false;
    }
    /**
     * Standard Functions:
     */
    public void updateText(String text) {
        CalcFrame.getInstance().getDisplayPanel().getCalcDisplay().setText(text);
    }
    public String getText() {
        return CalcFrame.getInstance().getDisplayPanel().getCalcDisplay().getText();
    }
    public void backspace() {
        if(currentNum.length() > 0) {
            if(!getText().equals(String.valueOf(this.currentResult))) {
                currentNum = currentNum.substring(0, (currentNum.length() - 1));
                updateText(currentNum);
            }
        }
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    public void clearEntry() {
        currentNum = "0.0";
        updateText(String.valueOf(currentResult));
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    public void clearAll() {
        currentNum = "0.0";
        currentResult = 0.0;
        updateText(String.valueOf(currentResult));
        operand1 = null;
        operand2 = null;
        lastEntryWasOperand = false;
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    public void enterNum(String num) {
        if(currentNum.equals("0.0") || this.lastEntryWasOperand) {
            currentNum = num;
        } else {
            currentNum += num;
        }

        updateText(currentNum);
        lastEntryWasOperand = false;
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    public void squareRoot() {
        if(Double.parseDouble(currentNum) > 0 && isNumber(currentNum)) {
            double num = Math.sqrt(Double.parseDouble(currentNum));
            updateText(String.valueOf(num));
        }
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    public void oneDivideByX() {
        if(Double.parseDouble(currentNum) > 0 && isNumber(currentNum)) {
            double num = 1 / (Double.parseDouble(currentNum));
            updateText(String.valueOf(num));
        }
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    public boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    public void switchSign() {
        String minus = "-";
        if(!getText().contains("-")) {
            minus += getText();
            updateText(minus);
        } else {
            String text = getText().replace("-", "");
            updateText(text);
        }
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    private String operand1, operand2 = null;
    private String operator = null;
    public void enterOperator(String operator) {
        if(!lastEntryWasOperand) {
            if(operand1 !=null) {
                operand2 = getText();
                switch (this.operator) {
                    case "/":
                        this.currentResult = Double.parseDouble(operand1) / Double.parseDouble(operand2);
                        break;
                    case "*":
                        this.currentResult = Double.parseDouble(operand1) * Double.parseDouble(operand2);
                        break;
                    case "-":
                        this.currentResult = Double.parseDouble(operand1) - Double.parseDouble(operand2);
                        break;
                    case "+":
                        this.currentResult = Double.parseDouble(operand1) + Double.parseDouble(operand2);
                        break;
                    case "%":
                        this.currentResult = Double.parseDouble(operand1) % Double.parseDouble(operand2);
                        break;
                    case "=":
                        break;
                }
                operand1 = String.valueOf(currentResult);
                operand2 = null;
                updateText(String.valueOf(currentResult));
            } else {
                updateText(getText());
            }
            if(operand1 == null) {
                operand1 = getText();
            }

            lastEntryWasOperand = true;
        }
        this.operator = operator;
        if(numInMem == 0) {
            CalcFrame.getInstance().getDisplayPanel().getMemDisplay().setText("M");
        }
    }
    /**
     * Scientific Functions:
     */
}
