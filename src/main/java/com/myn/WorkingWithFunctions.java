package com.myn;

import java.util.function.Function;

public class WorkingWithFunctions {
    public static void main(String[] args) {
        Function<String, String> toLowerCase = str -> str.toLowerCase();

        System.out.println(toLowerCase.apply(""));
        System.out.println(toLowerCase.apply("Mayank"));
        System.out.println(toLowerCase.apply("MAYANK"));
        System.out.println(toLowerCase.apply("mAYAnk"));
        System.out.println(toLowerCase.apply("mAYAnk anD NAMan"));
    }
}
