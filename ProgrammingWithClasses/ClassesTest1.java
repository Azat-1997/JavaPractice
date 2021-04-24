package com.company;

public class ClassesTest1 {

    private static int X = 0;
    private static int Y = 0;


    public static int getX() {
        return X;
    }

    public static int getY() {
        return Y;
    }

    public static void setX(int val) {
        X = val;
    }

    public static void setY(int val) {
        Y = val;
    }

    public static int sumXY() {
        return X + Y;
    }

    public static int maxXY() {
        if (X > Y) {
            return X;
        } else {
            return Y;
        }
    }

    public static void printXY() {
        System.out.println(X+" "+Y);
    }

    public static void main(String[] args) {
        printXY();
        setX(5);
        setY(7);
        printXY();
        System.out.println(sumXY());
        System.out.println(maxXY());

    }

}
