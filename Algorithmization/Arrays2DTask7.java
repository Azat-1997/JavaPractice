package com.company;

public class Arrays2DTask7 {

    public static double[][] sinMatrix(int n) {
        int posCount = 0;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                    double value = Math.sin((i * i - j * j) / n);
                    if (value > 0) {
                        posCount++;
                    }

                    matrix[i][j] =  value;

            }
        }

        System.out.println("Number of positive elements is equals to " + posCount);

    return matrix;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrix = sinMatrix(6);
        printMatrix(matrix);
    }
}
