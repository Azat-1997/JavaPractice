package com.company;

public class Arrays2DTask16 {

    public static void magicalSquare(int n) {
        int[][] matrix = new int[n][n];
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;

        for (int k = 1; k <= n*n; k++) {
            matrix[row][column] = k;
            curr_col = column;
            curr_row = row;
            row--;
            column++;
            if (row == -1) {
                row = n - 1;

            }
            if (column == n) {
                column = 0;
            }
            if (matrix[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if(row == -1) {
                    row = n - 1;
                }
            }

            }




        for (int[] rows : matrix) {
            for (int elem : rows) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        magicalSquare(25);

    }

}
