package com.company;

import java.util.Arrays;
public class Arrays1DTask2 {

    // Task 2
    public static double[] replaceByUpperBound(double[] array, double Z) {
        int counter = 0;

        for(int i = 0; i < array.length; i++) {

            if (array[i] > Z) {
                counter += 1;
                array[i] = Z;
            }
        }

        System.out.println(counter);
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceByUpperBound(new double[]{2.5, 3.14, 4.0, 6, 0.3, 1.0, 7.2}, 4.0)));

    }
}
