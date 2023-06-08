package com.trues.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivideTest {

    private DivideTest divideTest;

    @BeforeEach
    public void setUp() {
        this.divideTest = new DivideTest();
    }

    @DisplayName("5을 3으로 나눌때 1이 출력되는지 확인")
    @Test
    public void divideTwoNumbers() {

        int num1 = 5;
        int num2 = 3;

        DivideCalc divideCalc = new DivideCalc();
        int result = divideCalc.divideTwoNumbers(num1, num2);

        Assertions.assertEquals(1, result);
    }

    @DisplayName("6을 3으로 나눌 때 2가 출력되는지 확인")
    @Test
    public void divideTwoNumbers2() {

        int num1 = 6;
        int num2 = 3;

        DivideCalc divideCalc = new DivideCalc();
        int result = divideCalc.divideTwoNumbers(num1, num2);

        Assertions.assertEquals(2, result);
    }

    @DisplayName("6을 0으로 나눌 때 exption 이 발생하는지 확인")
    @Test
    public void divideTwoNumbers3() {

        int num1 = 6;
        int num2 = 0;

        DivideCalc divideCalc = new DivideCalc();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> divideCalc.divideTwoNumbers(num1, num2)
        );
    }
}
