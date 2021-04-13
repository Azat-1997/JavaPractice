package com.company;

import java.util.Arrays;

public class CyclesTask2 {
    // Task 2: evaluate function on [a, b] with h-step

    public static double[] evaluateOnInterval (double a, double b, double h) {

        int length;
        length = (int) ((b - a) / h);

        double[] valueArray = new double[length];
        double argument;
        for (int i = 0; i <= length - 1; i++) {
            argument = a + i * h;

            if(argument > 2) {
                valueArray[i] = argument;
            } else {
                valueArray[i] = -1 * argument;
            }
        }
        return valueArray;

    }

    public static void main(String[] args) {
        // Task 2
        String valueForPrint = Arrays.toString(evaluateOnInterval(-5,10,0.5));
        System.out.println(valueForPrint);
    }
}
