package com.company;

public class DecompositionTask7 {


    public static int factorial(int n) {
        int f = 1;
        if (n == 0) {
            return f;
        }

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;

    }

    public static void main(String[] args) {
        int k = 9;
        int factorial_sum = 0;
        for(int j = 1;  j <= k; j += 2) {
            factorial_sum += factorial(j);
        }
        System.out.println(factorial_sum);

    }
}
