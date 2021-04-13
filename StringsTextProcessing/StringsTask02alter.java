package com.company;

import static java.util.Arrays.*;

public class StringsTask02alter {

    static boolean[] findEntries (String text, String word) {
        char[] pattern = word.toCharArray();
        char[] symbols = text.toCharArray();
        boolean[] entries = new boolean[symbols.length];
        // flag needs to iterate by pattern
        int flag = 0;
        boolean MatchStatus;
        for (int i = 0; i < symbols.length - pattern.length + 1; i++) {

            MatchStatus = true;
            for (char c : pattern) {
                // if at least one of symbols is unmatched - exit from cycle with false matchStatus
                if (symbols[i+flag] != c) {
                    MatchStatus = false;
                    break;
                } else {
                    flag++;
                }

            }
            entries[i] = MatchStatus;

            flag = 0;

        }

        return entries;
    }


    static String[] groupByPattern(String text, String word) {
       char[] symbols = text.toCharArray();
       char[] pattern = word.toCharArray();
       String[] groupedString = new String[symbols.length];
       /* The start String is empty
       * And the result Array of string is array of single symbols
       *  and symbols grouped by pattern*/
       fill(groupedString, "");
       boolean[] startWord = findEntries(text, word);
       int i = 0;
       int lag = 0;

       while (i < symbols.length) {

           if (startWord[i]) {


               for (char c : pattern) {
                   groupedString[lag] += c;
                   i++;
               }



           } else {
               groupedString[lag] += symbols[i];
               i++;
           }
           lag++;
       }

       return groupedString;
    }

    static String replaceByPattern(String text, String pattern, String sub) {
        String[] groupedText = groupByPattern(text, pattern);
        String replacedText = "";

        for (String s : groupedText) {
            if (s.equals(pattern)) {
                replacedText += sub;
            } else {
                replacedText += s;
            }
        }



        return replacedText;
    }

    public static void main(String[] args) {
        /*
         * Some bug is exists: If first entry s false,
         *  then all next entries will be false
         * FIXED: instead of `symbols[flag] != c`,
         *  we should to write `symbols[i+flag] != c`
         * */
        String[] testStrings = new String[] {"Hello world!",
                "Any words?",
                "wordwordwordwordwordword",
                "WeeWeewordwordWord",
                "wierdword",
                "wordword"};


        String sub = "letter";
        String pattern = "word";

        for (String test : testStrings) {
            System.out.print(test+": ");

            System.out.println(replaceByPattern(test, pattern, sub));
        }

    }

}
