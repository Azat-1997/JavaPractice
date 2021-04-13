package com.company;

public class StringBuilderTask05 {

    static int CountSym(String text, char alpha, boolean ignoreCase) {
        /* letter can be defined both upper and lower case or one of them
        * We have shared symbols for Latin and Cyrillic alphabet.
        * However, we will assume they are different letters
        * If you want to avoid some miss-understandings -
        * define char in unicode. */

        int count = 0;
        char[] symbols = text.toCharArray();

        if (ignoreCase) {
            for (char sym : symbols) {
                if(Character.toLowerCase(sym) == Character.toLowerCase(alpha)) {
                    count++;
                }

            }
        } else {

            for (char sym : symbols) {
            if(sym == alpha) {
                count++;
                }

            }
        }
        return count;
    }


    public static void main(String[] args) {
        String[] testCases = new String[] {"",
        "abcdef",
        "AAAAaaaaAAAA, Кириллица:ААААААААааааааААААААА",
        "aBobA",};


        System.out.println("Latin");
        System.out.println("ignoreCase");
       for (String test : testCases) {
           System.out.print(test + ": ");
           System.out.println(CountSym(test, 'a', true));
       }

       System.out.println("Not ignoreCase");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(CountSym(test, 'a', false));
        }


        System.out.println("Cyrillic");
        System.out.println("ignoreCase");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(CountSym(test, 'а', true));
        }

        System.out.println("Not ignoreCase");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(CountSym(test, 'а', false));
        }


    }



}
