package com.myn;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        final double num1 = 10.2;
        final double num2 = 9.8;
        final double sum = Calculator.getInstance().add(num1, num2);
        System.out.printf("Sum of %f and %f is %f%n", num1, num2, sum);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}