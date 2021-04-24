package com.company;

public class Counter {
    private int min;
    private int max;
    private int current;
    private static final int defaultMin = 0;
    private static final int defaultMax = 10;
    private static final int defaultCurrent = 5;
    public Counter(int current, int min, int max) {
        this.current = current;
        this.min = min;
        this.max = max;
    }

    public static Counter DefaultCounter() {
        return new Counter(defaultCurrent, defaultMin, defaultMax);
    }

    public int getCurrentState() {
        return current;
    }

    public void increment() {
        if (current < max) {
            current++;
        }
    }

    public void decrement() {
        if (current > min) {
            current--;
        }
    }

    private static void runTest(Counter cnt) {
        // Check that our counters do not exceed min and max borders

        for (int i = 0; i < 30; i++) {
            System.out.print(cnt.getCurrentState() + " ");
            cnt.increment();
        }
        System.out.println(cnt.getCurrentState());

        for (int i = 0; i < 30; i++) {
            System.out.print(cnt.getCurrentState() + " ");
            cnt.decrement();
        }
        System.out.println(cnt.getCurrentState());
    }

    public static void main(String[] args) {
        Counter testCounter = new Counter(0, -10, 10);
        Counter testDefaultCounter = DefaultCounter();
        System.out.println("With arbiratry parameters: ");
        runTest(testCounter);
        System.out.println("With default parameters: ");
        runTest(testDefaultCounter);


    }
}
