package com.company;

public class LinearProgramsTask3 {
    // Third task: trigonometry
    public static double solveTrigonometry(double x, double y) {
        double numerator = Math.sin(x) + Math.cos(y);
        double denominator = Math.cos(x) - Math.sin(y);
        return (numerator / denominator) * Math.tan(x*y);

    }


    // Third task, update: trigonometry with right evaluation
    // "accuracy" is parameter of proximity
    public static double fixTrigonometry(double x, double y, double accuracy) {
        double numerator = Math.sin(x) + Math.cos(y);

        // If we are close enough to 0 or 1, we change current value to 0 or 1
        if (Math.abs(numerator) <= accuracy) {
            numerator = 0;
        } else if (Math.abs(numerator) >= 1 - accuracy) {
            numerator = Math.signum(numerator);
        }

        double denominator = Math.cos(x) - Math.sin(y);

        if(Math.abs(denominator) <= accuracy) {
            denominator = 0;

        } else if (Math.abs(denominator) >= 1 - accuracy) denominator = Math.signum(denominator);

        return (numerator / denominator) * Math.tan(x*y);

    }

    public static void main(String[] args) {
        // Solve Trigonometry
        System.out.print("Trigonometry: ");
        System.out.println(solveTrigonometry(Math.PI / 4, Math.PI / 4));
        // What's wrong?
        System.out.println(Math.cos(Math.PI / 4) - Math.sin(Math.PI / 4));
        // Ok. Since double type have some limitations we have very small non-zero number instead of zero.
        // Let's implement a bit different method
        System.out.print("Fixed Trigonometry: ");
        System.out.println(fixTrigonometry(Math.PI / 4, Math.PI / 4, 0.0001));// Result is infinity
        // It's happen because  denominator "Math.cos(x) - Math.sin(y)" is exactly zero, now.

    }
}
