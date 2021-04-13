package com.company;

public class CyclesTask8 {

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
        // Task 8
        printSharedDigits(27104, 25401711);
    }
}
