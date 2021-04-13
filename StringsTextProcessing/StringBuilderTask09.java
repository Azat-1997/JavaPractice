package com.company;

public class StringBuilderTask09 {
    static String SmallAndBigLetters (String text, char[] alphabet) {
        // 65536 - is char type size
        boolean[] validSymbols = new boolean[65536];
        for (char alpha : alphabet) {
            validSymbols[alpha] = true;
        }
        int small = 0;
        int big = 0;
        char[] symbols = text.toCharArray();

        for (char sym : symbols) {
            if (validSymbols[sym]) {
                if (Character.isLowerCase(sym)) {
                    small++;
                } else if (Character.isUpperCase(sym)) {
                    big++;
                }

            }
        }
        String s = "Number of lowercase: " + small + ", number of uppercase: " + big;
        return s;
    }

    public static void main(String[] args) {

        String[] testCases = new String[] {"", "abcdef",
        "ABCDEF",
        "SpQr",
        "Hello world!",
        "Hello world! Ни слова по-русски."};

        char[] alphabet = new char[] {'A', 'a', 'B', 'b', 'C', 'c',
                'D', 'd', 'E', 'e', 'F', 'f',
                'G', 'g', 'H', 'h', 'I', 'i',
                 'J', 'j', 'K', 'k', 'L', 'l',
                 'M', 'm', 'N', 'n', 'O', 'o',
                 'P', 'p', 'Q', 'q', 'R', 'r',
                 'S', 's', 'T', 't', 'U', 'u',
                 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};

        for (String test : testCases) {

            System.out.print(test + ": ");
            System.out.println(SmallAndBigLetters(test, alphabet));
        }

    }

}
