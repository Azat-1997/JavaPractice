package com.company;

public class LinearProgramsTask1 {
    // Find value of function z = ((a - 3) * b / 2) + c
    public static double findZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        // first Task: find "z"
        System.out.print("findZ: ");
        System.out.println(findZ(2.5, 3.7, 0.5)); // -0.425

    }

}
