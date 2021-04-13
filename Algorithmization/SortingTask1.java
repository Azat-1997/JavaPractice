package com.company;

public class SortingTask1 {

    public static void mergeArrays(int[] first, int[] second, int k) {


        for (int i = 0; i < k; i++) {
            System.out.print(first[i] + " ");
        }

        for (int l = 0; l < second.length; l++) {
            System.out.print(second[l] + " ");
        }

        for (int j = k; j < first.length; j++) {
            System.out.print(first[j] + " ");
        }
    }


    public static void main(String[] args) {

        int[] first = new int[] {17, 24, 1, 8, 15};
        int[] second = new int[] {23, 5, 7, 14, 16};
        mergeArrays(first, second, 2);

    }

}
