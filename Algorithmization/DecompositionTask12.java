package com.company;

public class DecompositionTask12 {


    public static int fromDigitsToNumber(short[] array) {
        int number = 0;
        for (short d : array) {

            number = number * 10 + d;
        }

        return number;
    }

    public static int sumOfDigits (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void printPartitions(int K) {



    }

    public static void main(String[] args) {
        short[] digitsArray = new short[] {0,0,0,0,1,0,5,4,3,2};
        System.out.println(fromDigitsToNumber(digitsArray)); // 105432
        System.out.println(sumOfDigits(fromDigitsToNumber(digitsArray)));
    }
}
