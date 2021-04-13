package com.company;

import java.util.Arrays;
import java.util.Random;
public class Arrays2DTask14 {

    public static int[][] generateTriangleMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        Random random = new Random();
        // Generate triangle matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (i <= j) {

                        matrix[i][j] = 1;

                    }


                }
            }
        // Shuffle elements
        int randomIndex;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                randomIndex = random.nextInt(i + 1);
                int tmp1 = matrix[randomIndex][j];
                int tmp2 = matrix[i][j];
                matrix[randomIndex][j] = tmp2;
                matrix[i][j] = tmp1;
                }
            }

        return matrix;
        }


    public static int[] ColSums(int[][] matrix) {
        int[] colSumArray = new int[matrix[0].length];

        for (int j = 0; j < matrix.length; j++) {

            for (int i = 0; i < matrix[0].length; i++) {
                colSumArray[i] += matrix[j][i];
            }

        }


        return colSumArray;

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

        int[][] binMatrix = generateTriangleMatrix(6, 5);
        printMatrix(binMatrix);

        System.out.println();
        // Check we don't lose or catch another ones.
        System.out.println(Arrays.toString(ColSums(binMatrix)));

    }
}
