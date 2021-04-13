package com.company;

public class Branchings {
    // Task 1
    // Check is triangle or not.
    public static boolean isExistTriangle(double alpha, double beta, double proximity) {
        return 180 - (alpha + beta) > proximity;
    }

    // Check if triangle have 90-angle

    public static boolean isRectTriangle(double alpha, double beta, double proximity) {
        boolean InExist = Math.abs(alpha - 90) < proximity | Math.abs(beta - 90) < proximity;
        boolean InRest = Math.abs(90 - (alpha + beta)) < proximity;
        return InExist | InRest;
    }
    // Task 2
    public static int minMax(int a, int b, int c, int d) {
        int min1;
        int min2;

        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }

        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }

        return Math.max(min1, min2);
    }
    // Task 3
    public static boolean isInOneline(double x1, double y1, double x2, double y2, double x3, double y3, double proximity) {

        /* Actually we have to evaluate area of triangle and multiple result by 0.5,
         but we only interested in zero and non-zero values, so we just skip that */

        double S = Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
        // Check equality to zero in our case we check if it is small enough
        return S < proximity;
    }
    // Task 4
    public static boolean PutBrick(double A, double B, double x, double y, double z) {
        // The third part of variables is attempt put brick on diagonal direction
        double diagonal = Math.sqrt(A * A + B * B);
        boolean xy = (x < A & y < B) | (x < B & y < A) | (Math.abs(y - x) <= diagonal);
        boolean yz =  (z < A & y < B) | (z < B & y < A) | (Math.abs(y - z) <= diagonal);
        boolean xz = (x < A & z < B) | (x < B & z < A) | (Math.abs(z - x) <= diagonal);
        return xy | yz | xz;
    }
    // Task 5
    public static double branchingFunction(double x) {

        if (x > 3) {
            double denominator = (x * x * x) + 6;
            return 1 / denominator;

        } else {

            return x * x - 3 * x + 9;
        }
    }


    public static void main(String[] args) {
        // Check triangle
        System.out.print("Check if triangle exist with alpha and beta angles: ");
        System.out.println(isExistTriangle(30.0, 60.0, 0.0001) + " ");
        System.out.print("Check if Rect-triangle exist with alpha and beta angles: ");
        System.out.println(isRectTriangle(30.0, 60.0, 0.0001));

        System.out.print("Check if triangle exist with alpha and beta angles: ");
        System.out.println(isExistTriangle(30.0, 70.0, 0.0001) + " ");
        System.out.print("Check if Rect-triangle exist with alpha and beta angles: ");
        System.out.println(isRectTriangle(30.0, 70.0, 0.0001));

        System.out.println();

        // MinMax
        System.out.print("maximum of minimums is ");
        System.out.println(minMax(3,4,0, 1));


        // OneLine
        System.out.print("is it oneline? ");
        System.out.println(isInOneline(1,8,-2,-7, -4, -17, 0.0001));

        // PutBrick
        System.out.print("Can brick pass? ");
        System.out.println(PutBrick(10,10, 21, 11, 1));

        System.out.print("Task 5: branching function ");
        System.out.println("x = 10: " + branchingFunction(10));
        System.out.println("x = -5: " + branchingFunction(-5));
    }
}
