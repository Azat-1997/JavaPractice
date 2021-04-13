package com.company;

import java.util.Arrays;

public class DecompositionTask11 {

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


    public static void whoIsLonger(int m, int n) {

        if(lengthOfNumber(m) > lengthOfNumber(n)) {
            System.out.println("Число "+ m + " длиннее чем " + n);
         } else if (lengthOfNumber(m) == lengthOfNumber(n)) {
            System.out.println("Числа равны по длине");
        } else {
            System.out.println("Число "+ n + " длиннее чем " + m);
        }

    }

    public static void main(String[] args) {
        whoIsLonger(105,125);
        whoIsLonger(1,0);
        whoIsLonger(105,25);
        whoIsLonger(1024,10240);
    }

}
