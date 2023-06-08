package com.trues;

import com.trues.calculator.MultipleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultipleCalculatorTests {

    private MultipleCalculator multipleCalc;

    @BeforeEach
    public void setUp(){
        System.out.println("setUp 동작 확인...");
        this.multipleCalc = new MultipleCalculator();
    }

    @DisplayName("20과 3을 넣었을 때, 60이라는 결과가 계산되는지 확인한다.")
    @Test
    public void testMultipleTwoNumbers(){
        // given
        int a = 20;
        int b = 3;

        // when
        int result = multipleCalc.multipleTwoNumbers(a,b);

        // then
        Assertions.assertEquals(60, result);
    }

    @DisplayName("50과 0을 넣었을 때, 0이라는 결과가 계산되는지 확인")
    @Test
    public void testMultipleTwoNumbers2() {

        // given
        int a = 50;
        int b = 0;

        // when
        int result = multipleCalc.multipleTwoNumbers(a, b);

        // then
        Assertions.assertEquals(0, result);

    }

}
