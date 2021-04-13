package com.company;

public class Arrays1DTask5 {

    // Task 5
    public static void IsGreaterThanIndex (int[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        IsGreaterThanIndex(new int[] {2, 3, 4, 6, 0, 1, 7});


    }

}
