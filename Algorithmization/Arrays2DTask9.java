package com.company;

import java.util.Arrays;

public class Arrays2DTask9 {

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

    public static int[] sumCols(int[][] matrix) {
        int[] sum = new int[matrix.length];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                sum[j] += matrix[i][j];
            }

            if(i > 0 && sum[i] > sum[index]) {
                index = i;
            }


        }
        System.out.println("maximal column: ");
        for (int[] row : matrix) {

            System.out.println(row[index]);
        }

        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(5, 0, 10);
        printMatrix(matrix);
        int[] array = sumCols(matrix);
        System.out.println("sum by columns: " + Arrays.toString(array));

    }
}
