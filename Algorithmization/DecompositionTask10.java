package com.company;

import java.util.Arrays;

public class DecompositionTask10 {

    public static int lengthOfNumber(int n) {
        int count = 0;
        if (n < 10) {
            return 1;
        }

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;

    }


    public static byte[] digitsArray(int n) {
        int L = lengthOfNumber(n);
        byte[] digits = new byte[L];

        for (int i = L - 1; i >= 0; i--) {

            digits[i] = (byte) (n % 10);
            n /= 10;

        }
        return digits;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(digitsArray(5)));
        System.out.println(Arrays.toString(digitsArray(0)));
        System.out.println(Arrays.toString(digitsArray(135)));
        System.out.println(Arrays.toString(digitsArray(1024)));
        System.out.println(Arrays.toString(digitsArray(10240)));

    }

}
