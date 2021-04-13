package com.company;

public class Arrays2DTask6 {

    public static int[][] clockMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {

            for(int j = i; j < n - i; j++) {
                matrix[i][j] = 1;
                matrix[n-1-i][j] = 1;
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
        int[][] matrix = clockMatrix(6);
        printMatrix(matrix);
    }
}
