package com.company;

public class CyclesTask6 {

    // Task 6
    public static void mapOfSymbols(int numberOfSymbols) {

        for (int i = 0; i <= numberOfSymbols; i++) {
            char symbol = (char) i;
            System.out.println(symbol + " - " + i);
        }

    }

    public static void main(String[] args) {
        // Task 6
        mapOfSymbols(65536);
    }
}
