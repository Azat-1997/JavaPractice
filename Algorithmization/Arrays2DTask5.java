package com.company;

public class Arrays2DTask5 {


    public static int[][] triangleMatrix(int n) {

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                matrix[i][j] = i + 1;
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
        int[][] matrix = triangleMatrix(6);
        printMatrix(matrix);
    }
}
