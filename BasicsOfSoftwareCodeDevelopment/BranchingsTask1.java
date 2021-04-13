package com.company;

public class BranchingsTask1 {
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
    }

}
