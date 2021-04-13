package com.company;

import java.util.Arrays;

public class StringsTask01 {
  /* Contributions:
        1) replace all `lU` (lower - Upper) patterns to `l_u`

        * How we can make it:
        find all left (right) indexes for all `lU` entries
        and then evaluate new char array with length = oldString.length + numberOflUentries
        fill the new array
        Build string
        */

    static boolean[] findEntrieslU (String name) {
        // let's look at string like `lUlUlUlU.....`
        // this strings contain only lU pattern
        // The maximal number of entries is name.length / 2
        char[] symbols = name.toCharArray();


        boolean[] entries = new boolean[symbols.length];


        for (int i = 1; i < symbols.length; i++) {

            if (Character.isLowerCase(symbols[i-1]) & Character.isUpperCase(symbols[i])) {
                // mark the entry
                entries[i-1] = true;
            }

        }

       return  entries;
    }



    static String SwitchToSnake(String name) {
        boolean [] entries = findEntrieslU(name);
        char[] symbols = name.toCharArray();
        int lengthNewWord = symbols.length;

        // Evaluate length of snake_style: add places for `_`
        for (boolean state : entries) {
            if (state) {
                lengthNewWord++;
            }
        }

        // create new array
        char[] snake_style = new char[lengthNewWord];
        // how many underscore are inserted
        int lag = 0;
        for (int i = 0; i < symbols.length; i++) {

            snake_style[i+lag] = Character.toLowerCase(symbols[i]);
            if (entries[i]) {

                snake_style[i+lag+1] = '_';
                lag++;
            }
        }


        String snakeWord = new String(snake_style);
        return snakeWord;

    }



    public static void main(String[] args) {

        String[] camelCases = new String[] {"CamelCase",
                "CamelCase_s",
                "CamelCase_S",
                "CamelCaseR",
                "PyCharmAndRstudio",
                "aBaBaBaB"};

        for (String word : camelCases) {
            System.out.println(word);
            System.out.println(SwitchToSnake(word));
            System.out.println();
        }

    }

}



