package com.company;

public class StringBuilderTask01 {

    static int LengthOfLongestSpaces(String text) {
        /* let's store to variables:
        * max contain the greatest value on current iteration
        * currentLength store length of current space-string
        * SpaceDetection is flag to recognize possible space series
        * When we find non space we reassign max by maximum between max and currentLength,
        * we switch to default SpaceDetection and currentLength and go further */

        int max = 0;
        char[] symbols = text.toCharArray();
        int currentLength = 0;
        boolean SpaceDetection = false;

        for (int i = 0; i < symbols.length; i++) {

            if (symbols[i] == ' ' && !SpaceDetection) {

                SpaceDetection = true;
                currentLength++;
            } else if (symbols[i] != ' ' && SpaceDetection) {
                max = Math.max(currentLength, max);
                SpaceDetection = false;
                currentLength = 0;

            } else if (symbols[i] == ' ') {
                currentLength++;

                if (i == symbols.length - 1) {
                    max = Math.max(currentLength, max);
                }
            }

        }

        return max;
    }

    public static void main(String[] args) {
        String[] testCases = new String[] {"Hello world!",
        "     Red  string",
        "a       b               c",
        "a       b               ",
        "",
        "abrefgergdcvsdf"};

        for (String test : testCases) {

            System.out.print(test + ": ");
            System.out.println(LengthOfLongestSpaces(test));

        }
    }


}
