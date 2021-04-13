package com.company;

public class CyclesTask5 {

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

    public static void main(String[] args) {
        // Task 5
        System.out.println("Task 5: sum of all elements of  (1 / 2^n) + (1 / 3^n) which are greater than 'e': " + sumOfSeries(0.000001));
        // As you can see, the limit of this series is 1.5 and we can approach them if we choose small enough e.

    }



}
