package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.1);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 40;
        int b = 25;
        double subtractResult = calculator.subtract(a,b);
        assertEquals(65, subtractResult, 0.1);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        double a = -2.5;
        double b = 0;
        double c = 3.5;

        double powerResult = calculator.power(a,2);
        double powerResult1 = calculator.power(b,2);
        double powerResult2 =  calculator.power(c, 2);

        assertEquals(6.25, powerResult, 0.1 );
        assertEquals(0, powerResult1, 0.1);
        assertEquals(12.25, powerResult2, 0.1);
    }
}
