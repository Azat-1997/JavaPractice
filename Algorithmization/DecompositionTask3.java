package com.company;

public class DecompositionTask3 {

    public static double areaOfRightTriangle(double a) {

        return Math.sqrt(3) * a * a / 4;

    }

    public static double areaOfRightHex(double a) {

        return 6 * areaOfRightTriangle(a);
    }
    public static void main(String[] args) {

        System.out.println(areaOfRightTriangle(1));
        System.out.println(areaOfRightHex(1));
    }
}
