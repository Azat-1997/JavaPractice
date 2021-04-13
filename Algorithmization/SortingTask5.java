package com.company;

import java.util.Arrays;

public class SortingTask5 {



    public static int BinarySearch(int[] array, int lo, int hi, int key) {
        int mid;
        while (lo < hi) {
            // This inner cycle works in sorted part of arrays
            // So, make sense if we use binary search.
            mid = lo + (hi - lo) / 2;

            if (key < array[mid]) {
                // Go to left
                hi = mid;

            } else {
                // Go to right
                lo = mid + 1;
            }

        }
        return lo;
    }


    public static void InsertionBinary(int[] array) {
        int lo;
        int key;
        for (int i = 1; i < array.length; i++) {

            key = array[i];
            // find place to insert
            lo = BinarySearch(array, 0, i - 1, key);

            // sort first part of array
            if (i - lo >= 0) System.arraycopy(array, lo, array, lo + 1, i - lo);

            array[lo] = key;
        }

    }
    public static void main(String[] args) {
        int [] array = new int[] {5,4,3,2,1,0,2,7};
        System.out.println(Arrays.toString(array));
        InsertionBinary(array);
        System.out.println(Arrays.toString(array));

    }

}
