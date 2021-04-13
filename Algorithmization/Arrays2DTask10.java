package com.company;

public class Arrays2DTask10 {

    public static int[][] generateRandomMatrix(int size, int lowest, int greatest) {
        int[][] matrix = new int[size][size];

        for(int i = 0; i < size; i++) {

            for(int j = 0; j < size; j++) {

                matrix[i][j] = (int) ((Math.random() * ((greatest - lowest) + 1)) + lowest);

            }
        }

        return matrix;
    }

    public static int[] findPosDiagElements(int[][] matrix) {

        int[] posDiag = new int[matrix.length];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {

            if(matrix[i][i] > 0) {
                posDiag[index] = matrix[i][i];
                index++;
            }

        }


        return posDiag;
    }

    public static void printDiag(int[] posDiag) {
        for(int e : posDiag) {
            if(e > 0) {
                System.out.print(e + " ");
            } else {
                break;
            }
        }

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
        int[][] matrix = generateRandomMatrix(5, -10, 10);
        System.out.println("Source matrix");
        printMatrix(matrix);
        int[] posDiag = findPosDiagElements(matrix);
        System.out.println();
        System.out.println("Positive diagonal elements");
        printDiag(posDiag);
    }

}
