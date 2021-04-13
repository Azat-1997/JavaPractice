package com.company;

public class StringsTask04 {
    /* Numbers is a countinuos series of digits
    * 14563 - is one number, but 145a63 is two numbers
    *  Also we have double type and we can find numbers like 3.14, 2.71282818 and so on*/

    static int countAllNumbers(String text) {
        int count = 0;

        char[] textArray = text.toCharArray();
        boolean NumberStatus = false;
        for (char d : textArray) {
            // if we find digit and current status is false, it's means we find first digit of number
            if (Character.isDigit(d) & !NumberStatus) {
                // count this number and switch status on true
                count++;
                NumberStatus = true;

            } else if (!Character.isDigit(d) & NumberStatus) {
                // first of all check decimal delimiter
                if (d == '.') continue;
                // if we find non-digit character we switch status to false
                NumberStatus = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] testCases = new String[]{"12let37",
                "14cyc078",
                "NonNumbers",
                "3.14ncode",
                "2.7levtolstoi1828levtolstoi1828",
                "",
                "2.5"};

        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(countAllNumbers(test));
        }

    }
}