package com.company;

public class DecompositionTask5 {

    public static int findSecondMax(int[] array) {
    int first = array[0];
    int second = array[0];

    for (int i = 0; i < array.length; i++) {

        if (array[i] > first) {
            second = first;
            first = array[i];
        } else if (array[i] > second && array[i] < first) {
            second = array[i];
        }
    }

    return second;

    }

    public static void main(String[] args) {
        int[] testArray = new int[] {8, 0, 3, 10, 10, 11, 9, 4, 9, 5, 6, 6, 9, 7, 6, 3, 4};
        System.out.println(findSecondMax(testArray));
    }
}
