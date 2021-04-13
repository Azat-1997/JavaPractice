package com.company;

public class LinearProgramsTask2 {

    public static double calculateValue(double a, double b, double c) {
        double D = Math.sqrt(b * b + 4 * a * c);
        double x = (b + D) / (2 * a);
        return  x - (a * a * a * c) + 1 / (b * b);
    }

    public static void main(String[] args) {
        // second - evaluate equation with respect to "a", "b" and "c"
        System.out.print("Second task: evaluate by formula. ");
        System.out.println(calculateValue(3 , 4, 5));

    }

}
