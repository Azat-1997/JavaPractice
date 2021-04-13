package com.company;

public class Arrays1DTask6 {

    // Task 6
    // First step - implement isPrime method
    public static boolean isPrime(int number) {

        int end = (int) Math.sqrt(number);
        for (int i = 2; i <= end; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Second step - implement sumFunction
    public static double sumWithPrimeIndex(double[] array) {
        double sum = 0;

        for(int i = 0; i < array.length; i++) {
            // In the task we have a1, a2, a3, ... an. But we have 0-based indexing, so let's add 1 in statement
            if(isPrime(i + 1)) {
                System.out.println((i + 1) + " " + array[i]);
                sum += array[i];
            }

        }


        return sum;
    }

    public static void main(String[] args) {
        double[] testArray = new double[]{2.5, 3.14, 4.0, -6, 0.3, -1.0, 7.2, 0.0};
        System.out.println(sumWithPrimeIndex(testArray));
    }
}
