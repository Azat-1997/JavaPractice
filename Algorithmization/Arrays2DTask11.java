package com.company;

public class Arrays2DTask11 {

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

    public static void findFrequentEnough(int[][] matrix, int value, int frequency) {
        int current_frequency;
        System.out.println("Print number of rows with proper number of occurrences:");
        for (int i = 0; i < matrix.length; i++) {
            current_frequency = 0;
            for(int j = 0; j < matrix[0].length; j++) {

                if(matrix[i][j] == value) {
                    current_frequency++;
                }

                if(current_frequency >= frequency) {
                    System.out.println(i + " ");
                    break;
                }

            }

        }

    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(10,20,0,15);
        printMatrix(matrix);
        System.out.println();
        findFrequentEnough(matrix, 5, 3);


    }
}
