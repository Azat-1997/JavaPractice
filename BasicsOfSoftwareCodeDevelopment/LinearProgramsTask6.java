package com.company;

public class LinearProgramsTask6 {

    // Check entry of point in the figure
    public static boolean IsInFigure(double x, double y) {
        boolean upper_part = (Math.abs(x) < 2 & y > 0 & y < 4);
        boolean bottom_part = (Math.abs(x) < 4 & y > -3 & y <= 0);
        return upper_part | bottom_part;
    }

    public static void main(String[] args) {
        // 6th Task. Check entry
        System.out.print("Check entry: x = 1, y = -1 ");
        System.out.println(IsInFigure(0, 0));
        System.out.print("Check entry: x = 1.5, y = 5 ");
        System.out.println(IsInFigure(1.5, 5));
    }

}
