package com.company;

public class CyclesTask4 {

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (long i = 1; i <=n; i++) {

            result *= i;
        }

        return result;
    }

    public static long multipleSquares(int n) {
        long result = 1;

        for (long i = 1; i <= n; i++) {
            result *= i * i;

        }
        return result;
    }

    public static void main(String[] args) {
        // Task 4
        System.out.println("Multiplication of top 50 numbers:");
        System.out.println("  --Naive implementation: " + multipleSquares(10));
        System.out.println("  --Factorial(n) * Factorial(n): " + factorial(10) * factorial(10));

    }


}
