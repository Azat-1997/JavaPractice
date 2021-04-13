package com.company;

public class StringsTask05 {

    static String leftStrip(String text) {
        StringBuilder treatedText = new StringBuilder();
        char[] symbols = text.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] != ' ' || symbols[i] == ' ' && !treatedText.toString().equals("")) treatedText.append(symbols[i]);
        }

        return treatedText.toString();
    }

    static String rightStrip(String text) {
        StringBuilder treatedText = new StringBuilder();
        char[] symbols = text.toCharArray();
        for (int i = symbols.length - 1; i >= 0; i--) {

            if (symbols[i] != ' ' || symbols[i] == ' ' && !treatedText.toString().equals("")) treatedText.insert(0, symbols[i]);
        }

        return treatedText.toString();
    }

    static String removeMultipleSpaces(String text) {
        StringBuilder treatedText = new StringBuilder();
        boolean firstSpace = true;
        char[] symbols = leftStrip(rightStrip(text)).toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            // treatedText != "" needs to remove all spaces from left side if they exists

            if (firstSpace && symbols[i] == ' ') {
                treatedText.append(symbols[i]);
                firstSpace = false;

            } else if (symbols[i] != ' ') {
                // if we meet another symbol, we just switch back to true firstSpace and add symbol to new text
                treatedText.append(symbols[i]);
                firstSpace = true;

            }

        }

    return treatedText.toString();
    }

    public static void main(String[] args) {

        String[] testCases = new String[] {"  hello  ",
        "Sun  ",
        "  Spring",
        "No       Terminal      Spaces",
        "   Hello world!  It's   general case    "};

        System.out.println("Only rightStrip:");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println("|" + rightStrip(test)  + "|");
        }


        System.out.println("Only leftStrip:");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println("|" + leftStrip(test) + "|");
        }


        System.out.println("leftStrip than rightStrip:");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println("|" + rightStrip(leftStrip(test))  + "|");
        }

        System.out.println("rightStrip than leftStrip:");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println("|" + leftStrip(rightStrip(test))  + "|");
        }

        System.out.println("removeMultipleSpaces");
        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println("|" + removeMultipleSpaces(test)  + "|");
        }
    }

}
