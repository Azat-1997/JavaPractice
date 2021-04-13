package com.company;

import java.util.Arrays;

public class Arrays1DTask4 {

    // Task 4 (Change source array)
    public static double[] flipMinMax(double[] array) {
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 0; i < array.length; i++) {

            if(array[i] < array[minIndex]) {
                minIndex = i;
            }

            if(array[i] > array[maxIndex]) {
                maxIndex = i;
            }

        }

        double tmpMin =  array[minIndex];
        double tmpMax =  array[maxIndex];
        array[minIndex] = tmpMax;
        array[maxIndex] = tmpMin;

        return array;
    }


    public static void main(String[] args) {

        double[] testArray = new double[]{2.5, 3.14, 4.0, -6, 0.3, -1.0, 7.2, 0.0};
        System.out.println(Arrays.toString(flipMinMax(testArray)));

    }

}
