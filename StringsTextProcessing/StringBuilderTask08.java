package com.company;

public class StringBuilderTask08 {

    static String FindLongestWord(String text) {
        int maxLen = 0;
        int currentLen = 0;
        String maxWord = "";
        StringBuilder CurrentWord = new StringBuilder();
        char[] symbols = text.toCharArray();

        for (char sym : symbols) {
            if (sym != ' ') {
                currentLen++;
                CurrentWord.append(sym);
            } else {
                if (maxLen < currentLen) {
                    maxLen = currentLen;
                    maxWord = new String(CurrentWord);
                }
                currentLen = 0;
                CurrentWord.setLength(0);
            }
        }

        if (maxLen < currentLen) {
            maxLen = currentLen;
            maxWord = new String(CurrentWord);
        }

        String s = "Length: " + String.valueOf(maxLen) + ". And this word is " + maxWord;
        return s;
    }

    public static void main(String[] args) {
        String[] testCases = new String[] {"",
                "Bob",
                "Hello world!",
        "How old are you?",
        "ABOBA is a palindrome",
        "TheLongestWordAtFirstPlace. I hope  method  doesn't skip it."};


        for (String test : testCases) {
            System.out.print(test+": ");
            System.out.println(FindLongestWord(test));
        }

    }


}
