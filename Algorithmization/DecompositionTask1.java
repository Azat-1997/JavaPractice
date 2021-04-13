package com.company;

public class DecompositionTask1 {

    public static int GCD(int A, int B) {
        int gcd = 1;
        for(int i = Math.min(A, B); i > 1; i--) {

            if((A % i) + (B % i) == 0) {
                gcd = i;
                break;
            }

        }
        return gcd;
    }

    public static int LCM(int A, int B) {

        return A * B / GCD(A, B);

    }

    public static void main(String[] args) {

    }
}
