package com.company;

public class Arrays2DTask13 {

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



    public static void sortByColumns(int[][] matrix, boolean decreasing) {
        int tmp1;
        int tmp2;

        for (int i = 1; i < matrix.length; i++) {

             for (int j = 0; j < matrix[0].length; j++) {

                for (int k = 0; k < i; k++) {

                    if(decreasing) {

                        if(matrix[k][j] < matrix[i][j]) {
                            tmp1 = matrix[k][j];
                            tmp2 = matrix[i][j];
                            matrix[k][j] = tmp2;
                            matrix[i][j] = tmp1;
                        }

                    } else {

                        if (matrix[k][j] > matrix[i][j]) {
                            tmp1 = matrix[k][j];
                            tmp2 = matrix[i][j];
                            matrix[k][j] = tmp2;
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
        sortByColumns(matrix,false);
        printMatrix(matrix);
        System.out.println();
        sortByColumns(matrix,true);
        printMatrix(matrix);
    }
}
