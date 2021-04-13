package com.company;

public class StringBuilderTask02 {

    static String Put_b_After_a(String text) {
        /*
        * Fill treatedText by append method
        * if we find `a` sym (no matter Cyrillic or Latin)
        * add `b` symbol */

        StringBuilder treatedText = new StringBuilder();
        char[] symbols = text.toCharArray();

        for(char sym : symbols) {
            treatedText.append(sym);
            // '\u0430' is a but from Cyrillic alphabet
            if (sym == 'a' || sym == '\u0430') {
                treatedText.append('b');
            }
        }

        return new String(treatedText);
    }

    public static void main(String[] args) {

        String[] testCases = new String[] {"",
                "a",
                "b",
                "c",
                "cacd",
                "acdef",
                "Кирилица - аааааааааа , Latin - aaaaaaaaa"
        };

        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(Put_b_After_a(test));


        }

    }
}
