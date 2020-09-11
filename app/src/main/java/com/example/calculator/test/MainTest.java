package com.example.calculator.test;

import com.example.calculator.ButtonState;
import com.example.calculator.Calculate;

public class MainTest {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.delete();
        calculate.appendNum(1);
        calculate.arithmetic(ButtonState.PLUS);
        calculate.appendNum(2);
        calculate.delete();
        calculate.appendNum(3);
        calculate.decimal();
        calculate.appendNum(3);
        calculate.equals();
        calculate.clear();
        calculate.appendNum(1);
        calculate.arithmetic(ButtonState.PLUS);
        calculate.appendNum(2);
        calculate.delete();
        calculate.appendNum(3);
        calculate.percent();
        calculate.arithmetic(ButtonState.PLUS);
        calculate.appendNum(3);
        calculate.arithmetic(ButtonState.MUTIPLY);
        System.out.println(calculate.getAnswer());
    }
}
