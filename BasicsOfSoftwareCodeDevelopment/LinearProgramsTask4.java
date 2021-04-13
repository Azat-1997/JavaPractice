package com.company;

public class LinearProgramsTask4 {


    public static double flipParts(double v) {
        // Our number have ddd.nnn form
        double whole = Math.round((v % 1) * 1000);
        double fraction = Math.round((v - (v % 1)));
        return whole + fraction / 1000;
    }

    public static void main(String[] args) {
        // 4th Task. Flip whole and fraction part
        System.out.print("flip Whole and fraction:");
        System.out.print(435.675 + " ");
        System.out.println(flipParts(435.675));

    }


}
