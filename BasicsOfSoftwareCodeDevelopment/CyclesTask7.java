package com.company;

import java.util.Scanner;

public class CyclesTask7 {

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

    public static void main(String[] args) {
        // Task 7
        delimeters();
    }

}
