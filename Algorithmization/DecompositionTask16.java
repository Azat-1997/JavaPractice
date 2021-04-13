package com.company;

public class DecompositionTask16 {

    public static int sumOfOddDigits (int number) {
        int sum = 0;
        int digit;
        while (number > 0) {

            digit = number % 10;
            if(digit % 2 == 1) sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int countOfEvenDigits (int number) {
        int count = 0;
        int digit;
        while (number > 0) {

            digit = number % 10;
            if(digit % 2 == 0) count++;
            number /= 10;
        }

        return count;
    }

    public static void printAnswer(int number) {

        System.out.println("Sum of odd digits: " + sumOfOddDigits(number));
        System.out.println("Number of even digits in sum: " + countOfEvenDigits(sumOfOddDigits(number)));
    }
    public static void main(String[] args) {
        printAnswer(10274);
        printAnswer(13457);
    }

}
