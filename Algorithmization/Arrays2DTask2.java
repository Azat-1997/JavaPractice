package com.company;

public class Arrays2DTask2 {
    public static void printDiagonal(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 0, -3, 5},
                                     {2, 4, 7, 1},
                                     {7, 0, 1, 6},
                                     {-5, 1, 0, -3}};

        printDiagonal(matrix);

    }
}
