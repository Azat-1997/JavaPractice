package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class CyclesTask1 {

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

    public static void main(String[] args) {
        // Task 1
        System.out.println(sumUntilNumber(10)); // 55
        System.out.println(sumWithoutCycles(10)); // 55
    }
}
