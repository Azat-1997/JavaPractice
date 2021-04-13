package com.company;

public class LinearPrograms {

    // Find value of function z = ((a - 3) * b / 2) + c
    public static double findZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    // Second task: square root
    public static double calculateValue(double a, double b, double c) {
        double D = Math.sqrt(b * b + 4 * a * c);
        double x = (b + D) / (2 * a);
        return  x - (a * a * a * c) + 1 / (b * b);
    }

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


    public static double flipParts(double v) {
        // Our number have ddd.nnn form
        double whole = Math.round((v % 1) * 1000);
        double fraction = Math.round((v - (v % 1)));
        return whole + fraction / 1000;
    }

    public static String convertTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;

        return hours + "ч " + minutes + "мин " + sec + "c";
    }

    // Check entry of point in the figure
    public static boolean IsInFigure(double x, double y) {
        boolean upper_part = (Math.abs(x) < 2 & y > 0 & y < 4);
        boolean bottom_part = (Math.abs(x) < 4 & y > -3 & y <= 0);
        return upper_part | bottom_part;
    }

    public static void main(String[] args) {
        // first Task: find "z"
        System.out.print("findZ: ");
        System.out.println(findZ(2.5, 3.7, 0.5)); // -0.425

        // second - evaluate equation with respect to "a", "b" and "c"
        System.out.print("Second task: evaluate by formula. ");
        System.out.println(calculateValue(3 , 4, 5));

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

        // 4th Task. Flip whole and fraction part
        System.out.print("flip Whole and fraction:");
        System.out.print(435.675 + " ");
        System.out.println(flipParts(435.675));

        // 5th Task. Convert time
        System.out.print("Convert time: 86138 seconds are");
        System.out.println(convertTime(86138));

        // 6th Task. Check entry
        System.out.print("Check entry: x = 1, y = -1 ");
        System.out.println(IsInFigure(0, 0));
        System.out.print("Check entry: x = 1.5, y = 5 ");
        System.out.println(IsInFigure(1.5, 5));
    }


}
