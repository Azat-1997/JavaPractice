package com.company;

public class StringBuilderTask07 {

    static String RemoveSymbolsAndRepeats(String text, char[] ignore) {
        // 65536 - is char type size
        boolean[] alphabet = new boolean[65536];
        StringBuilder treatedText = new StringBuilder();
        // fill by true for symbols in `ignore`. In task it will be ' '.
        for (int sym : ignore) {
            alphabet[sym] = true;
        }
        char [] symbols = text.toCharArray();
        // go by text and append symbols if symbol in alphabet marked as true - just skip them
        for (char sym : symbols) {
            if(!alphabet[sym]) {
                treatedText.append(sym);
                alphabet[sym] = true;
            }
        }

        return new String(treatedText);
    }

    public static void main(String[] args) {
        String[] testCases = new String[] {"",
                "abc cde def",
                "Hello world!",
                "        ABOBA          "};

        char[] ignore = new char[] {' '};

        for (String test : testCases) {
            System.out.print(test + ": ");
            System.out.println(RemoveSymbolsAndRepeats(test, ignore));

        }

    }

}
