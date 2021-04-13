package com.company;

import java.util.Arrays;

public class SortingTask3 {

    public static void sortByChoice(int[] array) {
        int max;
        int M;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            M = i;
            for (int j = i+1; j < array.length; j++) {

                if (array[j] > max) {
                    max = array[j];
                    M = j;
                }

            }

            tmp = array[M];
            array[M] = array[i];
            array[i] = tmp;
        }
    }

    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4,5,6,6,6,6,7};
        System.out.println(Arrays.toString(array));
        sortByChoice(array);
        System.out.println(Arrays.toString(array));

    }
}
