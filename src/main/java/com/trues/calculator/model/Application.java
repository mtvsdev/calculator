package com.trues.calculator.model;

public class Application {

    DivideCalc divideCalc = new DivideCalc();


    public int calc(int num1, String op, int num2){
        char c = op.charAt(0);
        switch (c){
            case '+':

                break;
            case '-':

                break;
            case '*':

                break;
            case '/':
                divideCalc.divideTwoNumbers(num1, num2);
                break;
            case '%':

                break;
        }
        return 1;
    }
}
