package com.company;

public class StringsTask03 {

    static int countAllDigits(String text) {
        int count = 0;

        char[] textArray = text.toCharArray();

        for (char d : textArray) {
            if (Character.isDigit(d)) count++;

        }

        return count;
    }

    public static void main(String[] args) {
        String[] testCases = new String[] {"12let37",
        "14cyc078",
        "NonNumbers",
        "3.14ncode",
        "2.7levtolstoi1828levtolstoi",
        ""};

        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(countAllDigits(test));
        }

    }

}
