package com.company;

import java.util.Arrays;

public class SortingTask6 {

    static void shellSort(double[] array) {
        double tmp;
        // divide array by steps and into group. Number of groups equals to steps length.
        for (int step = array.length / 2; step > 0; step /= 2) {
            // Iterate by groups
            for (int i = step; i < array.length; i++) {
                // Iterate in one group
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    if (array[j] > array[j + step]) {
                        tmp = array[j];
                        array[j] = array[j + step];
                        array[j + step] = tmp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        double [] array = new double[] {5,4,3,2.4,1.7,0,2,7, 3.15};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

}
