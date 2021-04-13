package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class DecompositionTask15 {
    static int n, k;
    static int[] a;

    static void Comb(int pos, int maxUsed) {
        if (pos == k) {
            for(int j : a) {
                System.out.print(j);
            }
            System.out.println();

        } else {
            for(int i = maxUsed+1; i <= n; i++) {
                a[pos] = i;
                Comb(pos+1,i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = 9;
        System.out.println("Enter the length:");
        k = in.nextInt();
        a = new int[k];
        Comb(0, 0);
    }
}
