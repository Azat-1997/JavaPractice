package com.company;

import java.util.Arrays;

public class Arrays1DTask10 {

    // Task 10
    public static int[] removeEvenIndexed(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if((i + 1) % 2 == 0) {
                array[i] = 0;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEvenIndexed((new int[]{2, 3, 4, 6, 0, 1, 7}))));

    }
}
