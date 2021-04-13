package com.company;

public class StringBuilderTask10 {

    static int CountSentences(String text) {
    int count = 0;
    char[] symbols = text.toCharArray();
    for(char sym : symbols) {
        if (sym == '.' || sym == '!' || sym == '?') {
            count++;
        }
    }

    return count;

    }

    public static void main(String[] args) {
       String[]  testCases = new String[] {"", "This is not senteces",
       "But this one is it.",
       "Hello world!",
       "Hi! Are you doing okay?\n Yes, I am!"};


        for (String test : testCases) {

            System.out.print(test + ": ");
            System.out.println(CountSentences(test));

        }

    }

}
