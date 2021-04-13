package com.company;

public class StringBuilderTask03 {

    static boolean IsPalindrome(String text, boolean ignoreCase) {
        // build reverse of text
        StringBuilder revStr = new StringBuilder(text).reverse();

        // and return yes or no with ignoreCase condition
        if (ignoreCase) {
            return text.equalsIgnoreCase(revStr.toString());
        } else {
            return text.equals(revStr.toString());
        }


    }

    public static void main(String[] args) {
        String[] testCases = new String[] {
                "",
                "a",
                "abcdef,",
                "abcabc",
                "ABOBA",
                "abOBA"

        };


        System.out.println("Ignore Case: ");

        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(IsPalindrome(test, true));
        }

        System.out.println("Not ignore Case: ");

        for (String test : testCases) {

            System.out.print(test + ": ");
            System.out.println(IsPalindrome(test, false));

        }

    }
}
