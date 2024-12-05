package com.myn;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;

public class WorkingWithPredicates {
    public static void main(String[] args) {
        Predicate<String> isBlankString = str -> StringUtils.isBlank(str);

        System.out.println(isBlankString.test(""));
        System.out.println(isBlankString.test(null));
        System.out.println(isBlankString.test("Mayank"));
        System.out.println(isBlankString.test("Mayank Naman"));
        System.out.println(isBlankString.test(" "));
    }
}
