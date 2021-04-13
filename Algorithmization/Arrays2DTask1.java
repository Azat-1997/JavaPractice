package com.company;

public class Arrays2DTask1 {

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int i = 0; i < row.length; i += 2) {
                // Check if the first element is greater than the last one.
                if(matrix[0][i] <= matrix[matrix.length - 1][i]) break;

                    System.out.print(row[i] + " ");

            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] array) {
        int[][] matrix = new int[][]{{1, 0, -3, 5},
                                     {2, 4, 7, 1},
                                     {7, 0, 1, 6},
                                     {-5, 1, 0, -3}};

        printMatrix(matrix);
    }
}
