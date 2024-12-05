package com.myn;

public class Calculator {
    private static final Calculator INSTANCE = new Calculator();

    public static Calculator getInstance() {
        return INSTANCE;
    }

    public double add(final double a, final double b) {
        return a + b;
    }

    public double subtract(final double a, final double b) {
        return a - b;
    }

    public double multiply(final double a, final double b) {
        return a * b;
    }
}
