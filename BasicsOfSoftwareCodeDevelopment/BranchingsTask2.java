package com.company;

public class BranchingsTask2 {

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

    public static void main(String[] args) {
        // MinMax
        System.out.print("maximum of minimums is ");
        System.out.println(minMax(3,4,0, 1));
    }
}
