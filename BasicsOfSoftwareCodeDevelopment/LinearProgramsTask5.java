package com.company;

public class LinearProgramsTask5 {
    public static String convertTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;

        return hours + "ч " + minutes + "мин " + sec + "c";
    }

    public static void main(String[] args) {
        // 5th Task. Convert time
        System.out.print("Convert time: 86138 seconds are");
        System.out.println(convertTime(86138));

    }
}
