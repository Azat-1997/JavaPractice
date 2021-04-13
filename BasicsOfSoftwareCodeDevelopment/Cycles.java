package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles {
    // Task 1
    public static int sumUntilNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
    // Task 1: another implementation

    public static int sumWithoutCycles(int n) {
        return n * (n + 1) / 2;
    }
    // Task 2: evaluate function on [a, b] with h-step

    public static double[] evaluateOnInterval (double a, double b, double h) {

        int length;
        length = (int) ((b - a) / h);

        double[] valueArray = new double[length];
        double argument;
        for (int i = 0; i <= length - 1; i++) {
                argument = a + i * h;

                if(argument > 2) {
                    valueArray[i] = argument;
                } else {
                    valueArray[i] = -1 * argument;
                }
        }
        return valueArray;

    }


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

    // Task 5
    public static double sumOfSeries(double e) {
        double firstTerm = 0.5;
        double secondTerm = 0.3333333333333333;
        double result = 0;
        int n = 1;
        while (Math.pow(firstTerm, n) + Math.pow(secondTerm, n) >= e) {

            result += Math.pow(firstTerm, n) + Math.pow(secondTerm, n);
            n += 1;
        }

        return result;
    }

    // Task 6
    public static void mapOfSymbols(int numberOfSymbols) {

        for (int i = 0; i <= numberOfSymbols; i++) {
            char symbol = (char) i;
            System.out.println(symbol + " - " + i);
        }

    }

    // Task 7

    public static void delimeters() {

        System.out.println("Write first and last numbers: ");
        Scanner ms = new Scanner(System.in);
        Scanner ns = new Scanner(System.in);
        int m = ms.nextInt();
        int n = ns.nextInt();

        for(int i = m; i <=n; i++) {

            System.out.print("delimeters of " + i + ": ");

            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }

    // Task 8
    // Part 1: find set of digits for one number
    public static boolean[] getDigitsComposition(int number) {
        boolean[] digitsArray = new boolean[10];
        while (number > 0) {

            int digit = number % 10;
            number /= 10;
            if (!digitsArray[digit]) {
                digitsArray[digit] = true;
            }
        }

        return digitsArray;
    }
    // Part2 : find intersection
    public static boolean[] getSharedDigits(int number1, int number2) {
        boolean[] sharedDigitsArray = new boolean[10];
        boolean[] number1DigitsArray = getDigitsComposition(number1);
        boolean[] number2DigitsArray = getDigitsComposition(number2);

        for (int i = 0; i < 10; i++) {
            sharedDigitsArray[i] = number1DigitsArray[i] & number2DigitsArray[i];
        }

        return sharedDigitsArray;
    }
    // Part3 : print procedure
    public static void printSharedDigits(int number1, int number2) {

        boolean[] digitsArray = getSharedDigits(number1, number2);

        for (int i = 0; i < 10; i++) {

            if (digitsArray[i]) {
                System.out.print(i + " ");

            }
        }
    }


    public static void main(String[] args) {
        // Task 1
        System.out.println(sumUntilNumber(10)); // 55
        System.out.println(sumWithoutCycles(10)); // 55
        // Task 2
        String valueForPrint = Arrays.toString(evaluateOnInterval(-5,10,0.5));
        System.out.println(valueForPrint);
        // Task 3
        System.out.println("Sum of squares: ");
        System.out.println("  -Naive implementation: " + sumSquaresNaive(100));
        System.out.println("  -Without squaring explicitly: " + sumSquaresTricky(100));
        // Task 4
        System.out.println("Multiplication of top 50 numbers:");
        System.out.println("  --Naive implementation: " + multipleSquares(10));
        System.out.println("  --Factorial(n) * Factorial(n): " + factorial(10) * factorial(10));
        // Task 5
        System.out.println("Task 5: sum of all elements of  (1 / 2^n) + (1 / 3^n) which are greater than 'e': " + sumOfSeries(0.000001));
        // As you can see, the limit of this series is 1.5 and we can approach them if we choose small enough e.
        // Task 6
        mapOfSymbols(65536);
        // Task 7
        delimeters();
        // Task 8
        printSharedDigits(27104, 25401711);

    }


}
