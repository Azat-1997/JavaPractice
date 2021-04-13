package com.company;

import java.util.Scanner;

public class SortingTask8 {

    /*
     We will use array with pairs: "numerator - denominator".
     *  Then we rewrite all pairs with common denominator
     * So, at least, we have to write GCD and LCM implementation
     * and one of sort implementation
    */

    static int GCD(int A, int B) {
        int gcd = 1;
        for(int i = Math.min(A, B); i > 1; i--) {

            if((A % i) + (B % i) == 0) {
                gcd = i;
                break;
            }

        }
        return gcd;
    }

    static int LCM(int A, int B) {

        return A * B / GCD(A, B);

    }

    static int GCDArray(int[] denominators) {
        int commonDenominator = 1;

        for (int den : denominators) commonDenominator = LCM(commonDenominator, den);

        return commonDenominator;
    }

    static void makeToCommonDenominator (int[] numerators, int[] denominators, int commonDenominator) {

        for (int i = 0; i < denominators.length; i++) {
            numerators[i] = numerators[i] * commonDenominator / denominators[i];

        }
    }

    static void shellSort(int[] array) {
        int tmp;
        // divide array by steps and into group. Number of groups equals to steps length.
        for (int step = array.length / 2; step > 0; step /= 2) {
            // Iterate by groups
            for (int i = step; i < array.length; i++) {
                // Iterate in one group
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    if (array[j] > array[j + step]) {
                        tmp = array[j];
                        array[j] = array[j + step];
                        array[j + step] = tmp;
                    }
                }
            }
        }

    }

    static void printNaiveFractions(int[] numerators, int[] denominators) {
        for (int i = 0; i < denominators.length; i++) {
            System.out.print(numerators[i] + " / " + denominators[i] + "; ");
        }
        System.out.println();
    }

    static void printNormalizedFractions(int[] numerators, int denominator) {

        for (int num : numerators) {
            System.out.print(num + " / " + denominator + "; ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] numerators = new int[size];
        int[] denominators = new int[size];

        System.out.println("Insert numerators:");
        for (int i = 0; i < size; i++) {
            numerators[i] = input.nextInt();
        }

        System.out.println("Insert denominators:");
        for (int i = 0; i < size; i++) {
            denominators[i] = input.nextInt();
        }
        int commonDenominator = GCDArray(denominators);

        printNaiveFractions(numerators,
                denominators);
        makeToCommonDenominator(numerators,
                denominators,
                commonDenominator);

        shellSort(numerators);
        printNormalizedFractions(numerators, commonDenominator);
    }



}
