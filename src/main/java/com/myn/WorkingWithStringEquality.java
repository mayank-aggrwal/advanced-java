package com.myn;

public class WorkingWithStringEquality {
    public static void main(String[] args) {

        // Concept of STRING POOL (JVM Optimisation)
        // https://www.javatpoint.com/string-pool-in-java
        // https://www.baeldung.com/java-string-pool
        // https://antony-s-smirnov.medium.com/java-string-pool-594f19b1bb58

        /**
         * How the JVM and the Java compiler optimize memory allocations for String objects via the Java String Pool ?
         *
         * Thanks to the immutability of Strings in Java, the JVM can optimize the amount of memory allocated for
         * them by storing only one copy of each literal String in the pool. This process is called interning.
         * When we create a String variable and assign a value to it, the JVM searches the pool for a String of equal
         * value.
         * If found, the Java compiler will simply return a reference to its memory address, without allocating
         * additional memory.
         * If not found, it’ll be added to the pool (interned) and its reference will be returned.
         *
         * In general, we should use the String literal notation when possible. It is easier to read and it gives
         * the compiler a chance to optimize our code.
         *
         * From Java 7 onwards, the Java String Pool is stored in the Heap space, which is garbage collected by the JVM.
         * The advantage of this approach is the reduced risk of OutOfMemory error because unreferenced Strings will
         * be removed from the pool, thereby releasing memory.
         */

        String s1 = "Mayank";
        String s2 = "Mayank";
        String s3 = "Mayank";
        String s4 = "Mayank";
        String s5 = "Mayank";
        String s6 = new String("Mayank");
        String s7 = new StringBuilder("Mayank").toString();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);
        System.out.println(s6 == s7);

        /**
         * IntelliJ -> View -> Show Bytecode -> s1 == s2 -> uses IF_ACMPNE
         * In Java bytecode, IF_ACMPNE is an instruction used for conditional branching based on the result of
         * comparing two object references. Specifically, it checks if two references are not equal (i.e., they point
         * to different objects or one is null and the other is not) and, if so, it jumps to a specified location
         * in the bytecode.
         * Breakdown of IF_ACMPNE:
         * * IF_ACMPNE stands for "If reference comparison not equal".
         * * It compares two reference variables (objects) using the == operator, which checks if they refer to the
         * same memory location (i.e., the same object).
         * * If the references are not equal, the program jumps to the specified bytecode address (the target offset).
         *
         * == operator compares references instead of the actual values
         * Always use string.equals() method for checking equality
         */

        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(s7));
        System.out.println(s6.equals(s7));
    }
}
