package com.company;

public class DecompositionTask17 {

    public static int sumOfDigits (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int countTimes(int number) {
        int count = 0;
        while(number > 0) {
            number -= sumOfDigits(number);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

       for (int i = 0; i < 1e7; i++) {

           System.out.println(i+";"+countTimes(i));

       }

    }

}
