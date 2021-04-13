package com.company;

public class Arrays2DTask15 {

    public static int[][] generateRandomMatrix(int n, int m, int lowest, int greatest) {
        int[][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

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


    public static void replaceOddByMax (int[][] matrix) {
        int max = -2_147_483_648; // The minimal number of int
        for (int[] ints : matrix) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (ints[j] > max) {
                    max = ints[j];

                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                // remainder was calculated by absolute value
                if(matrix[i][j] % 2 == 1 || matrix[i][j] % 2 == -1) {

                    matrix[i][j] = max;

                }

            }

        }

    }

    public static void main(String[] args) {

        int[][] matrix = generateRandomMatrix(4, 6,-20, 20);
        printMatrix(matrix);
        replaceOddByMax(matrix);
        System.out.println();
        printMatrix(matrix);



    }
}
