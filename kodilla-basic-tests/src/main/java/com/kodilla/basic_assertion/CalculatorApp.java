package com.kodilla.basic_assertion;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        double sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult, 0.1);

        if (correct) {
            System.out.println("Sum method works properly for " + a + " and " + b);
        } else {
            System.out.println("Sum method does not work properly for " + a + " and " + b);
        }

        double subtractResult = calculator.subtract(a,b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult, 0.1);

        if (correct2) {
            System.out.println("Subtract method works properly for " + a + " and " + b);
        } else {
            System.out.println("Subtract method does not work properly for " + a + " and " + b);
        }

        double squareResult = calculator.power(5,2);
        boolean correct3 = ResultChecker.assertEquals(25,squareResult, 0.1);
        if (correct3) {
            System.out.println("Power method works properly for " + a);
        } else {
            System.out.println("Power method does not work properly for " + a);
        }
    }
}
