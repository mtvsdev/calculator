package com.trues.calculator.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinusCalculatorTest {

    private MinusCaculator minusCalc;

    @BeforeEach
    public void setUp() {
        minusCalc = new MinusCaculator();
    }

    @DisplayName("15에서 10를 뺀 결과 5가 나오는지 확인")
    @Test
    public void testMinusTwoNumbers() {

        //given
        int num1 = 15;
        int num2 = 10;

        //when
        MinusCaculator minusCalc = new MinusCaculator();
        int result = minusCalc.minusTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(5,result);

    }
    @DisplayName("30에서 20를 뺀 결과 5가 나오는지 확인")
    @Test
    public void testMinusTwoNumber2() {

        //given
        int num1 = 30;
        int num2 = 20;

        //when
        int result = minusCalc.minusTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(10,result);

    }
}
