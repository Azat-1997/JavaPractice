package com.company;

public class DecompositionTask9 {
    /*
    * Important note!!!
    * We assume that our tetragon is convex.
    * The next assumption from task is orthogonality of X and Y
    * And we can represent it's area as sum of two triangles
    * 0.5 * (X * Y) - this one and another one will be calculated by Herone formula.
    * */

    public static double TriangleArea(double a, double b, double c) {
        // let's implement Herone formula as separate method
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public static double evaluateArea(double X, double Y, double Z, double T) {
        double hypothenuse = Math.sqrt(X * X + Y * Y);

        return 0.5 * (X * Y) + TriangleArea(hypothenuse, Z, T);
    }

    public static void main(String[] args) {

        System.out.println(evaluateArea(3,4,2.5,2.5));

    }

}
