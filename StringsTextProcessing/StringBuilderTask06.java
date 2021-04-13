package com.company;

public class StringBuilderTask06 {

    static String RepeatEachSymbol(String text) {

        StringBuilder treatedText = new StringBuilder();
        char[] symbols = text.toCharArray();
        for (char sym : symbols) {
            treatedText.append(sym);
            treatedText.append(sym);
        }

        return new String(treatedText);
    }


    public static void main(String[] args) {

        String[] testCases = new String[] {"", "abcdef"};

        for (String test : testCases) {

            System.out.print(test + ":");
            System.out.println(RepeatEachSymbol(test));
        }

    }

}
