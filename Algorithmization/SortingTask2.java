package com.company;

public class SortingTask2 {


    public static void mergeIncreaseArray(int[] A, int[] B) {
        int i = 0;
        int j = 0;
        while (i < A.length || j < B.length) {

            if (i == A.length) {
                // If A is done
                System.out.print(B[j] + " ");
                j++;

            } else if (j == B.length) {
                // If B is done
                System.out.print(A[i] + " ");
                i++;

            } else {

                if (A[i] <= B[j]) {

                    System.out.print(A[i] + " ");
                    i++;
                } else {

                    System.out.print(B[j] + " ");
                    j++;
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] A = new int[] {1,2,3,9,10,12};
        int[] B = new int[] {4,5,6,7,8,11};
        mergeIncreaseArray(A, B);
    }
}
