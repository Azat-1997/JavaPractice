package com.company;

public class Arrays1DTask9 {

    // Task 9

    public static int findMostFrequent(int[] array) {
        int frequency = 0;
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            int candidateFrequency = 0;
            for (int j = 0; j < array.length; j++) {

                if(array[i] == array[j] && i != j) {
                    // Count number of occurrences exclude case i == j, to avoid count element itself by twice
                    candidateFrequency++;
                }

            }
            // compare number of occurrences previous and current element
            if (frequency < candidateFrequency) {
                element = array[i];
                frequency = candidateFrequency;
            } else if (frequency == candidateFrequency) {

                element = Math.min(element,array[i]);

            }

        }

        return element;
    }

    public static void main(String[] args) {

        int[] testRemoveMin = new int[]{0, 0, 0, 2, 3, 4, 6, 0, 0, 1, 7, 0, 0, 0};
        System.out.println(findMostFrequent(testRemoveMin));
        System.out.println(findMostFrequent(new int[]{2, 2, 2, 0, 1, 0, 1, 1}));

    }
}
