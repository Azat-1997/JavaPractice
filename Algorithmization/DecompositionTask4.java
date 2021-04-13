package com.company;

import java.util.Arrays;

public class DecompositionTask4 {

    public static double euclidNorm(double x, double y) {

        return Math.sqrt(x * x + y * y);

    }

    public static double[][] rangePair(double[][] array) {
        double max = 0;
        double[][] pair = new double[][] {array[0],array[0]};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                // Do not compare point with itself
                if (i == j) {
                    continue;
                }
                double current_dist = euclidNorm(array[i][0] - array[j][0],array[i][1] - array[j][1]);
                if (current_dist > max) {
                    max = current_dist;
                    pair = new double[][] {array[i], array[j]};
                }
            }

        }

        return pair;
    }

    public static void main(String[] args) {
        double[][] points = new double[][] {{0, -0.5}, {1, 2.7}, {4, 0.2}, {3, 3}};
        for(double[] point : rangePair(points)) {
            System.out.println(Arrays.toString(point));
        }
    }

}
