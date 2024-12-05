package com.myn;

public class WorkingWithJVMXmxXms {
    public static void main(String[] args) {

        /**
         * Run this class with -Xmx256m -Xms20m
         * Increase COUNT to 400 million and see Out of Memory exception
         */

        try {
            printMemoryFootprint();

            // Create a large array to simulate memory usage
            System.out.println(Integer.MAX_VALUE);
            System.out.println("Allocating memory...");
            int COUNT = 50 * 1024 * 1024; // 50 million * 4bytes = 200 million = 200MB
            int[] arr = new int[COUNT];

            printMemoryFootprint();

            // Fill the array with some data to simulate memory usage
            // Simulate some processing (we'll just access the array)
            System.out.println("Processing...");
            for (int i = 0; i < COUNT; i++) {
                arr[i] = i + 1;
            }

            printMemoryFootprint();

        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        printMemoryFootprint();
    }

    private static void printMemoryFootprint() {
        // Default : Max Heap Size (25769803776 = 24GB)
        // Xmx1g, Xms256m : Max Heap Size (1073741824 = 1GB)
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.printf("Max allowed Java Heap Size: %d bytes (%dMB)%n", maxMemory, toMB(maxMemory));

        // Default : Initial Heap Size (1627389952 = 1.52GB)
        // Xmx1g, Xms256m : Initial Heap Size (270532608 = 258MB)
        long initialMemory = Runtime.getRuntime().totalMemory();
        System.out.println(String.format("Actual Java Heap Size: %d bytes (%dMB)", initialMemory, toMB(initialMemory)));

        // Default : Currently free memory (1618057344)
        // Xmx1g, Xms256m : Currently free memory (266316320 = 254MB)
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println(String.format("Free Java Heap Size: %d bytes (%dMB)", freeMemory, toMB(freeMemory)));
        System.out.println("========================================================================================");
    }

    private static long toMB(long bytes) {
        return Math.round(bytes / (1024.0 * 1024));
    }
}
