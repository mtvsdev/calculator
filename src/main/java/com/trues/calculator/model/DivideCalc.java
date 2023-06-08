package com.trues.calculator.model;

public class DivideCalc {

    public int divideTwoNumbers(int num1, int num2) {
        checkZero(num2);
        return num1 / num2;
    }

    private void checkZero(int num2) {

        if (num2 == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다");
        }
    }
}
