package com.company;

public class StringBuilderTask04 {


    public static void main(String[] args) {
        String text = "Информатика";
        StringBuilder treatedString = new StringBuilder();
        char[] symbols = text.toCharArray();
        for(char sym : symbols) {
            if (sym == 'о' || sym == 'р' || sym == 'т') treatedString.append(sym);
        }

        treatedString.insert(0, 'т');
        String answer = new String(treatedString);
        System.out.println(answer);

    }


}
