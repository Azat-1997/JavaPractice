package com.company;

public class DecompositionTask6 {

    public static int GCD(int A, int B) {
        int gcd = 1;
        for(int i = Math.min(Math.abs(A), Math.abs(B)); i > 1; i--) {

            if((A % i) + (B % i) == 0) {
                gcd = i;
                break;
            }

        }
        return gcd;
    }


    public static void main(String[] args) {
    int A = 27;
    int B = 24;
    int C = 32;
    if (GCD(GCD(A, B), C) == 1) {
        System.out.println("Эти числа взаимнопросты");
    } else {
        System.out.println("Их можно сократить");
    }

    }

}
