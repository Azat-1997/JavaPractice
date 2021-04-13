package com.company;

import java.util.Arrays;

public class Arrays1D {
    // Task 1
    public static int kSum(int[] array, int K) {
        int sum = 0;
        for (int j : array) {

            if (j % K == 0) {
                sum += j;
            }
        }
        return sum;
    }
    // Task 2
    public static double[] replaceByUpperBound(double[] array, double Z) {
        int counter = 0;

        for(int i = 0; i < array.length; i++) {

            if (array[i] > Z) {
                counter += 1;
                array[i] = Z;
            }
        }

        System.out.println(counter);
        return array;
    }
    // Task 3
    public static int[] signCount(double[] array) {

        int[] PosZeroNeg = new int[3];
        for (double j : array) {

            if (j > 0) {
                PosZeroNeg[0] += 1;

            } else if (j == 0) {
                PosZeroNeg[1] += 1;

            } else {
                PosZeroNeg[2] += 1;
            }

        }

        return PosZeroNeg;
    }
    // Task 4 (Change source array)
    public static double[] flipMinMax(double[] array) {
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 0; i < array.length; i++) {

            if(array[i] < array[minIndex]) {
                minIndex = i;
            }

            if(array[i] > array[maxIndex]) {
                maxIndex = i;
            }

        }

        double tmpMin =  array[minIndex];
        double tmpMax =  array[maxIndex];
        array[minIndex] = tmpMax;
        array[maxIndex] = tmpMin;

        return array;
    }
    // Task 5
    public static void IsGreaterThanIndex (int[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }


    // Task 6
    // First step - implement isPrime method
    public static boolean isPrime(int number) {

        int end = (int) Math.sqrt(number);
        for (int i = 2; i <= end; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Second step - implement sumFunction
    public static double sumWithPrimeIndex(double[] array) {
        double sum = 0;

        for(int i = 0; i < array.length; i++) {
            // In the task we have a1, a2, a3, ... an. But we have 0-based indexing, so let's add 1 in statement
            if(isPrime(i + 1)) {
                System.out.println((i + 1) + " " + array[i]);
                sum += array[i];
            }

        }


        return sum;
    }

    // Task 7 Fix!
    public static double maxOfPairedSum(double[] array) {
        // if we have one element in array - return this one
        double max = array[0];
        // variable for reverse scanning. Second cycle will starts from end of Array.
        int end = 0;

        for (int i = 0; i < array.length; i++) {

            max = array[i];
            // This cycle starts from the last entry of even number
            for (int j = array.length - (1 + end); j >= 0; j--) {
                    if(array[j] % 2 == 0)  {

                        if(array[j] + array[i] > max) {
                            max = array[j] + array[i];
                        }

                        end = j;
                        break;
                    }

                }
            }

        return max;
    }

    // Task 8
    public static int[] removeMin(int[] array) {
        int min = array[0];
        int countMin = 1;
        // Step 1: find minimum and it's frequency
        for(int i = 1; i < array.length; i++) {

            if(array[i] < min) {
                min = array[i];
                countMin = 0;

            } else if (array[i] == min) {
                countMin++;
            }


        }
        // Step 2: create new array and fill it with non-minimum values
        int[] newArray = new int[array.length - countMin];
        /* create index for new Array
        * When we find non-minimum value,
        *  we write in newArray[indexNewArray] this value.
        * And after we increment index for next cell of array */
        int indexNewArray = 0;

        for(int j = 0; j < array.length; j++) {

            if(array[j] != min) {
                 newArray[indexNewArray] = array[j];
                 indexNewArray++;
            }
        }

    return newArray;
    }


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

    // Task 10
    public static int[] removeEvenIndexed(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if((i + 1) % 2 == 0) {
                array[i] = 0;
            }
        }

        return array;
    }


    public static void main(String[] args) {

            System.out.println(kSum(new int[] {2, 3, 4, 6, 0, 1, 7}, 3));
            System.out.println(Arrays.toString(replaceByUpperBound(new double[]{2.5, 3.14, 4.0, 6, 0.3, 1.0, 7.2}, 4.0)));
            double[] testArray = new double[]{2.5, 3.14, 4.0, -6, 0.3, -1.0, 7.2, 0.0};
            System.out.println(Arrays.toString(signCount(testArray)));
            System.out.println(Arrays.toString(flipMinMax(testArray)));
            IsGreaterThanIndex(new int[] {2, 3, 4, 6, 0, 1, 7});
            System.out.println(Arrays.toString(testArray));
            System.out.println(sumWithPrimeIndex(testArray));
            int[] testRemoveMin = new int[]{0, 0, 0, 2, 3, 4, 6, 0, 0, 1, 7, 0, 0, 0};
            System.out.println(Arrays.toString(testRemoveMin));
            System.out.println(findMostFrequent(testRemoveMin));
            System.out.println(findMostFrequent(new int[]{2, 2, 2, 0, 1, 0, 1, 1}));
            System.out.println(Arrays.toString(removeMin(testRemoveMin)));

    }
}
