package com.myn;

public class WorkingWithStringBuilder {
    public static void main(String[] args) {
        // Strings are immutable in Java
        String s1 = "A";
        String s2 = null;
        String result = s1 + s2;
        result += null;
        System.out.println(result);

        // View -> Show Bytecode -> Line 7, 8 -> StringConcatFactory.makeConcatWithConstants -> L348 parseRecipe ->
        //         StringBuilder acc -> acc.append -> append -> appendNull()

        checkPerformance();
    }

    private static void checkPerformance() {
        final int NUMBER = 1_000_000; // for readability
        String result;

        long now = System.currentTimeMillis();
        result = slow(NUMBER);
        System.out.println("SLOW time taken: " + (System.currentTimeMillis() - now) + "ms");

        now = System.currentTimeMillis();
        result = fast(NUMBER);
        System.out.println("FAST time taken: " + (System.currentTimeMillis() - now) + "ms");
    }

    private static String slow(final int iterations) {
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += "*";
        }
        return s;
    }

    private static String fast(final int iterations) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
