package com.company;

public class BranchingsTask3 {

    // Task 3
    public static boolean isInOneline(double x1, double y1, double x2, double y2, double x3, double y3, double proximity) {

        /* Actually we have to evaluate area of triangle and multiple result by 0.5,
         but we only interested in zero and non-zero values, so we just skip that */

        double S = Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
        // Check equality to zero in our case we check if it is small enough
        return S < proximity;
    }

    public static void main(String[] args) {
        // OneLine
        System.out.print("is it oneline? ");
        System.out.println(isInOneline(1,8,-2,-7, -4, -17, 0.0001));

    }

}
