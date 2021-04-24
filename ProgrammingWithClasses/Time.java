package com.company;

import java.util.Arrays;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours < 24 && hours >= 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
        if (minutes < 60 && minutes >= 0) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
        if (seconds < 60 && seconds >= 0) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public int[] getCurrentTime() {
        return new int[] {hours, minutes, seconds};
    }

    public void setHours(int val) {
        if (val < 24 && val >= 0) {
            hours = val;
        } else {
            hours = 0;
        }
    }

    public void setMinutes(int val) {
        if (val < 60 && val >= 0) {
            minutes = val;
        } else {
            minutes = 0;
        }
    }

    public void setSeconds(int val) {
        if (val < 60 && val >= 0) {
            seconds = val;
        } else {
            seconds = 0;
        }
    }

    public static void main(String[] args) {
        // Check invalid initialization
        Time invalid = new Time(48,-23, 1000); // we should to get 0 hours 0 minutes and 0 seconds.
        System.out.println(Arrays.toString(invalid.getCurrentTime()));
        Time valid = new Time(15, 40, 23);
        System.out.println(Arrays.toString(valid.getCurrentTime()));
        // "valid" change
        valid.setHours(5);
        valid.setMinutes(20);
        valid.setSeconds(15);
        System.out.println(Arrays.toString(valid.getCurrentTime()));
        // "invalid" change
        valid.setHours(-5);
        valid.setMinutes(200);
        valid.setSeconds(150);
        System.out.println(Arrays.toString(valid.getCurrentTime()));
    }

}
