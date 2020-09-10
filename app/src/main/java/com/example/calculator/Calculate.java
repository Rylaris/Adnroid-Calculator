package com.example.calculator;

import java.util.Stack;

public class Calculate {

    Stack<Character> formula;
    String answer;

    CalculateService service;

    int prevButton, currentButton;

    public Calculate() {
        formula = new Stack<>();
        answer = "";
        service = new CalculateService(formulaToString());
        prevButton = ButtonState.NULL;
        currentButton = ButtonState.NULL;
    }

    public void clear() {
        formula = new Stack<>();
        answer = "";
        service = new CalculateService(formulaToString());
        prevButton = ButtonState.NULL;
        currentButton = ButtonState.NULL;
    }

    public void delete() {
        if (prevButton >= 0 && prevButton <= 9) {
            formula.remove(formula.size() - 1);
            prevButton = formula.peek();

        }
    }

    public void equals() {

    }

    public void plus() {
        formula.add('+');
    }

    public void appendNum(Integer num) {
        formula.add(num.toString().charAt(0));
    }

    public String getAnswer() {
        return answer;
    }

    public void updateAnswer() {
        service.setArithmetic(formulaToString());
        answer = service.getResult().toString();
    }

    public String formulaToString() {
        Stack temp = (Stack) formula.clone();
        StringBuilder result = new StringBuilder();
        while (!temp.isEmpty()) {
            result.append(temp.pop());
        }
        return result.reverse().toString();
    }


}
