package com.company;

public class DecompositionTask14 {

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

    public static int[] digitsArray(int n) {
        int L = lengthOfNumber(n);
        int[] digits = new int[L];

        for (int i = L - 1; i >= 0; i--) {

            digits[i] = n % 10;
            n /= 10;

        }
        return digits;
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int[] digits = digitsArray(n);

        for (int i = 0; i < digits.length; i++) {

            sum += Math.pow(digits[i], digits.length);

        }

        System.out.println(n + " -> " + sum);
        boolean b = sum == n;
        return b;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(1634));
        System.out.println(isArmstrong(135));
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(27));
        System.out.println(isArmstrong(0));
        System.out.println(isArmstrong(1));
        System.out.println(isArmstrong(2));
        System.out.println(isArmstrong(9));
    }

}
