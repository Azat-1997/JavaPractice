package com.company;

import java.util.Arrays;

public class Arrays1DTask8 {

    // Task 8
    public static int[] removeMin(int[] array) {
        int min = array[0];
        int countMin = 1;
        // Step 1: find minimum and it's frequency
        for(int i = 1; i < array.length; i++) {

            if(array[i] < min) {
                min = array[i];
                countMin = 0;

            } else if (array[i] == min) {
                countMin++;
            }


        }
        // Step 2: create new array and fill it with non-minimum values
        int[] newArray = new int[array.length - countMin];
        /* create index for new Array
         * When we find non-minimum value,
         *  we write in newArray[indexNewArray] this value.
         * And after we increment index for next cell of array */
        int indexNewArray = 0;

        for(int j = 0; j < array.length; j++) {

            if(array[j] != min) {
                newArray[indexNewArray] = array[j];
                indexNewArray++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] testRemoveMin = new int[]{0, 0, 0, 2, 3, 4, 6, 0, 0, 1, 7, 0, 0, 0};
        System.out.println(Arrays.toString(testRemoveMin));
    }
}
