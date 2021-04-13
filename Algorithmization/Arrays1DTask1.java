package com.company;

public class Arrays1DTask1 {

    // Task 1
    public static int kSum(int[] array, int K) {
        int sum = 0;
        for (int j : array) {

            if (j % K == 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(kSum(new int[] {2, 3, 4, 6, 0, 1, 7}, 3));

    }
}
