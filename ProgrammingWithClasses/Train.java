package com.company;
public class Train {
    public String arrival;
    public int trip;
    String departureTime;
    public Train(String arrival, int trip, String departureTime) {
        this.arrival = arrival;
        this.trip = trip;
        this.departureTime = departureTime;

    }
    public static void getInfo(Train[] trainList, int number) {
        for (Train train : trainList) {
            if (train.trip == number) {
                System.out.println(train.trip + ": " + train.arrival + " " + train.departureTime+".");
            }
        }
    }
    public static Train[] sortByTrip(Train[] array) {
        Train[] sortedArray = array.clone();
        Train tmp;
        for (int i = 1; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                if(sortedArray[j].trip > sortedArray[i].trip) {
                  tmp = sortedArray[j];
                  sortedArray[j] = sortedArray[i];
                  sortedArray[i] = tmp;
                }
            }

        }
        return sortedArray;
    }
    public static Train[] sortByArrival(Train[] array) {
        Train[] sortedArray = array.clone();
        Train tmp;
        int compStatus;
        for (int i = 1; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                compStatus = sortedArray[j].arrival.compareTo(sortedArray[i].arrival);
                if(compStatus > 0) {
                    tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = tmp;
                } else if (compStatus == 0) {
                    // If arrays are same - sort by time.
                    if (sortedArray[j].departureTime.compareTo(sortedArray[i].departureTime) > 0) {
                        tmp = sortedArray[j];
                        sortedArray[j] = sortedArray[i];
                        sortedArray[i] = tmp;
                    }
                }
            }

        }
    return sortedArray;
    }
    public static void main(String[] args) {
        String[] testArrival = new String[] {"Moscow", "Petushki", "Kazan", "Arks", "Saint-Petersburg"};
        int[] testTrip = new int[] {1021, 4315, 6512, 1337, 3469};
        String[] testDepartureTime = new String[] {"13:37", "19:40", "14:20", "02:28", "04:09"};
        Train[] test = new Train[5];
        // fill array with Train type by test values
        for (int i = 0; i < 5; i++) {
            test[i] = new Train(testArrival[i], testTrip[i], testDepartureTime[i]);
        }
        getInfo(test, 1021);
        for (Train obj : test) {
            System.out.print(obj.arrival + " " + obj.departureTime + " " + obj.trip+"; ");
        }
        System.out.println();
        Train[] sortedArrival = sortByArrival(test);
        for (Train obj : sortedArrival) {
            System.out.print(obj.arrival + " " + obj.departureTime + " " + obj.trip+"; ");
        }
        System.out.println();
        Train[] sortedByTrip = sortByTrip(test);
        for (Train obj : sortedByTrip) {
            System.out.print(obj.arrival + " " + obj.departureTime + " " + obj.trip+"; ");
        }
        System.out.println();
        for (Train obj : test) {
            System.out.print(obj.arrival + " " + obj.departureTime + " " + obj.trip+"; ");
        }
        System.out.println();
    }
}
