package com.company;



public class Arrays2DTask8 {

    public static int[][] generateRandomMatrix(int size, int lowest, int greatest) {
        int[][] matrix = new int[size][size];

        for(int i = 0; i < size; i++) {

            for(int j = 0; j < size; j++) {

                matrix[i][j] = (int) ((Math.random() * ((greatest - lowest) + 1)) + lowest);

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

    public static int[][] flipCols(int[][] matrix, int k, int l) {
        int tmpk;
        int tmpl;
        for (int i = 0; i < matrix.length; i++) {

            tmpk = matrix[i][k];
            tmpl = matrix[i][l];
            matrix[i][k] = tmpl;
            matrix[i][l] = tmpk;

        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(5, 0, 10);
        printMatrix(matrix);
        System.out.println();
        flipCols(matrix, 0, 4);
        printMatrix(matrix);
    }

}
