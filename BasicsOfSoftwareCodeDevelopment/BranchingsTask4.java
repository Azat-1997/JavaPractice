package com.company;

public class BranchingsTask4 {

    // Task 4
    public static boolean PutBrick(double A, double B, double x, double y, double z) {
        // The third part of variables is attempt put brick on diagonal direction
        double diagonal = Math.sqrt(A * A + B * B);
        boolean xy = (x < A & y < B) | (x < B & y < A) | (Math.abs(y - x) <= diagonal);
        boolean yz =  (z < A & y < B) | (z < B & y < A) | (Math.abs(y - z) <= diagonal);
        boolean xz = (x < A & z < B) | (x < B & z < A) | (Math.abs(z - x) <= diagonal);
        return xy | yz | xz;
    }

    public static void main(String[] args) {
        // PutBrick
        System.out.print("Can brick pass? ");
        System.out.println(PutBrick(10,10, 21, 11, 1));
    }

}
