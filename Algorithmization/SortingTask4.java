package com.company;

import java.util.Arrays;

public class SortingTask4 {


    public static void bubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            // push maximum at the end by swaps
            // repeat procedure for array without last element
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                }

            }

        }

    }

    public static void main(String[] args) {

        int [] array = new int[] {5,4,3,2,1,0,2,7};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

}
