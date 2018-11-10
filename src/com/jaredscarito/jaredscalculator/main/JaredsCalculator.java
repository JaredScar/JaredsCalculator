package com.jaredscarito.jaredscalculator.main;

import com.jaredscarito.jaredscalculator.api.API;
import com.jaredscarito.jaredscalculator.displays.CalcDisplay;
import com.jaredscarito.jaredscalculator.modules.frames.CalcFrame;

/**
 * Created by TheWolfBadger on 11/7/18.
 */
public class JaredsCalculator {
    private static CalcFrame calc;
    private static CalcDisplay display;
    private static API api;
    public static void main(String[] args) {
        api = new API();
        calc = new CalcFrame();
        display = calc.getDisplayPanel().getCalcDisplay();
    }
}
