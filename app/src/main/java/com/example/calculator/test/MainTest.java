package com.example.calculator.test;

import com.example.calculator.Calculate;

import java.util.Stack;

public class MainTest {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.appendNum(5);
        calculate.appendNum(2);
        calculate.appendNum(0);
        calculate.plus();
        calculate.appendNum(1);
        calculate.appendNum(1);
        calculate.appendNum(1);
        calculate.updateAnswer();
        System.out.println(calculate.toString());
        System.out.println(calculate.getAnswer());
    }
}
