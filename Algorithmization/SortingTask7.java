package com.company;

import java.util.Arrays;

public class SortingTask7 {

    /*
    * A and B arrays which represent of
    * non-decreasing sequences are given.
    * Implement method which return new array
    * which contain both sequences and
    *  this new array is also non-decreasing sequence
    * */

    // Let's use BinarySearch implementation from Task5 to find place for element b
    static int BinarySearch(double[] array, int lo, int hi, double key) {
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

    static int[] findIndexes(double[] A, double[] B) {
        // Based on task, we insert elements from B
        int[] indexes = new int[B.length];
        // walk by b elements
        for (int j = 0; j < B.length; j++) {
            indexes[j] = BinarySearch(A, 0, A.length - 1, B[j]);
        }
        return indexes;
    }

    public static void main(String[] args) {

        double[] testA = new double[] {1, 2.5, 3.1, 3.3, 3.5, 4.7, 5.8, 6.2, 7};
        double[] testB = new double[] {0.2, 1.3, 3.2, 5.2, 8};
        System.out.println(Arrays.toString(findIndexes(testA, testB)));

    }

}
