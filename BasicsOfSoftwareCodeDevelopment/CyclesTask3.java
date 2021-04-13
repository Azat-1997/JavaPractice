package com.company;

public class CyclesTask3 {

    // Task 3 Naive implementation
    public static int sumSquaresNaive(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i * i;
        }

        return result;
    }

    // Another implementation

    public static long sumSquaresTricky(int n) {
        long result = 0;

        for (long i = 1; i <= n; i++) {
            result += (2 * i - 1) * (n + 1 - i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Task 3
        System.out.println("Sum of squares: ");
        System.out.println("  -Naive implementation: " + sumSquaresNaive(100));
        System.out.println("  -Without squaring explicitly: " + sumSquaresTricky(100));
    }

}
