package com.myn;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class WorkingWithFunctionalInterfacesOperators {
    public static void main(String[] args) {
        UnaryOperator<Integer> integerDoubler = num -> num * 2;
        System.out.println(integerDoubler.apply(5));
        System.out.println(integerDoubler.apply(50));

        UnaryOperator<Integer> identityOperator = UnaryOperator.<Integer>identity();
        System.out.println(identityOperator.apply(5));
        System.out.println(identityOperator.apply(50));

        BinaryOperator<Integer> integerMultiplier = (num1, num2) -> num1 * num2;
        System.out.println(integerMultiplier.apply(5, 10));
        System.out.println(integerMultiplier.apply(50, 10));
        BinaryOperator<String> concatenator = (str1, str2) -> str1.concat(str2);
        System.out.println(concatenator.apply("Hello", " World"));
    }
}
