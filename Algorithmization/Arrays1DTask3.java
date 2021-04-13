package com.company;

import java.util.Arrays;

public class Arrays1DTask3 {

    // Task 3
    public static int[] signCount(double[] array) {

        int[] PosZeroNeg = new int[3];
        for (double j : array) {

            if (j > 0) {
                PosZeroNeg[0] += 1;

            } else if (j == 0) {
                PosZeroNeg[1] += 1;

            } else {
                PosZeroNeg[2] += 1;
            }

        }

        return PosZeroNeg;
    }

    public static void main(String[] args) {
        double[] testArray = new double[]{2.5, 3.14, 4.0, -6, 0.3, -1.0, 7.2, 0.0};
        System.out.println(Arrays.toString(signCount(testArray)));
    }

}
