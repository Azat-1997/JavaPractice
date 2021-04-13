package com.company;

public class Arrays2DTask4 {


    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                    if (i % 2 == 0) {
                        matrix[i][j] = j + 1;

                    } else {
                        matrix[i][j] = n - j;
                    }


            }
        }

        return matrix;

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(6);
        printMatrix(matrix);
    }
}
