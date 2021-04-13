package com.company;

public class Arrays1DTask7 {

    public static double maxOfPairedSum(int[] array) {
        // if we have one element in array - return this one
        double max = array[0];
        // variable for reverse scanning. Second cycle will starts from end of Array.
        int end = 0;

        for (int k : array) {

            max = k;
            // This cycle starts from the last entry of even number
            for (int j = array.length - (1 + end); j >= 0; j--) {
                if (array[j] % 2 == 0) {

                    if (array[j] + k > max) {
                        max = array[j] + k;
                    }

                    end = j;
                    break;
                }

            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{2, 3, 4, -6, 0, -1, 7, 0};
        System.out.println(maxOfPairedSum(testArray));
    }
}
