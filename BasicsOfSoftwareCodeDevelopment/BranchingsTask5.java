package com.company;

public class BranchingsTask5 {

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
        System.out.print("Task 5: branching function ");
        System.out.println("x = 10: " + branchingFunction(10));
        System.out.println("x = -5: " + branchingFunction(-5));
    }

}
