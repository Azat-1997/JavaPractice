package com.company;

import java.util.Arrays;

public class Triangle {
    // points
    public double[] A;
    public double[] B;
    public double[] C;

    public Triangle(double[] A, double[] B, double[] C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double[] getCentroid() {
        return new double[] {(A[0] + B[0] + C[0]) / 3, (A[1] + B[1] + C[1]) / 3};
    }

    public double getPerimeter() {
        // use the pyhpagorean theorem
       double AB = Math.sqrt((A[0] - B[0]) * (A[0] - B[0]) + (A[1] - B[1]) * (A[1] - B[1]));
       double BC = Math.sqrt((C[0] - B[0]) * (C[0] - B[0]) + (C[1] - B[1]) * (C[1] - B[1]));
       double AC = Math.sqrt((C[0] - A[0]) * (C[0] - A[0]) + (C[1] - A[1]) * (C[1] - A[1]));

       return AB + BC + AC;
    }

    public double getArea() {
        return 0.5 * Math.abs((A[0] - C[0]) * (B[1] - C[1]) - (A[1] - C[1]) * (B[0] - C[0]));
    }

    public static void main(String[] args) {
        Triangle ABC = new Triangle(new double[] {0, 1}, new double[] {1, 0}, new double[] {0, 0});
        System.out.println(Arrays.toString(ABC.getCentroid()));
        System.out.println(ABC.getPerimeter());
        System.out.println(ABC.getArea());
    }
}
