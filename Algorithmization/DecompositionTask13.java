package com.company;

public class DecompositionTask13 {

    public static void printTwins(int n) {

        if (n < 2) {
            System.out.println("Пожалуйста, введите число большее чем 2");
        }

        for (int i = n; i < (2 * n + 1); i++) {
            if (i - 2 >= n) {

                System.out.println((i - 2) + " - " + i);

            }
        }

    }

    public static void main(String[] args) {
        printTwins(5);
    }

}
