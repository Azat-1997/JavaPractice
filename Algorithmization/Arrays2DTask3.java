package com.company;

public class Arrays2DTask3 {

    public static void kRowPColumnPrint(int[][] matrix, int k, int p) {
        // print k-row

        System.out.println(k + "-row is:");

        for (int elem : matrix[k]) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println(p + "-column is");

        for (int[] row : matrix) {
            System.out.print(row[p] + " ");
        }
    }
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 0, -3, 5},
                                     {2, 4, 7, 1},
                                     {7, 0, 1, 6},
                                     {-5, 1, 0, -3}};

        kRowPColumnPrint(matrix, 0, 1);
    }
}
