package com.company;

public class Arrays2DTask12 {


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



    public static void sortByRows(int[][] matrix, boolean decreasing) {
        int tmp1;
        int tmp2;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 1; j < matrix[0].length; j++) {

                for (int k = 0; k < j; k++) {

                    if(decreasing) {

                        if(matrix[i][k] < matrix[i][j]) {
                            tmp1 = matrix[i][k];
                            tmp2 = matrix[i][j];
                            matrix[i][k] = tmp2;
                            matrix[i][j] = tmp1;
                        }

                    } else {

                        if (matrix[i][k] > matrix[i][j]) {
                            tmp1 = matrix[i][k];
                            tmp2 = matrix[i][j];
                            matrix[i][k] = tmp2;
                            matrix[i][j] = tmp1;

                        }
                    }

                }

            }

        }


    }

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(5,6,-10,10);
        printMatrix(matrix);
        System.out.println();
        sortByRows(matrix,false);
        printMatrix(matrix);
        System.out.println();
        sortByRows(matrix,true);
        printMatrix(matrix);
    }
}
