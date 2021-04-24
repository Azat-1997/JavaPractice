package com.company;

public class CustomerAggregator {
    private Customer[] clientArray;


    public CustomerAggregator(String[] surname, String[] name, String[] fathername, String[] address, long[] card, long[] account) {
        Customer[] customerArray = new Customer[surname.length];
        for (int i = 0; i < customerArray.length; i++) {
            customerArray[i] = new Customer(surname[i], name[i], fathername[i], address[i], card[i], account[i]);
        }
        this.clientArray = customerArray;
    }
    public void sortByFullName() {
        String iCustom;
        String jCustom;
        Customer tmp;
        for(int i = 1; i < clientArray.length; i++) {
            for(int j = 0; j < i; j++) {
                iCustom = clientArray[i].getSurname() + clientArray[i].getName() + clientArray[i].getFatherName();
                jCustom = clientArray[j].getSurname() + clientArray[j].getName() + clientArray[j].getFatherName();
                if(iCustom.compareTo(jCustom) < 0) {
                    tmp = clientArray[i];
                    clientArray[i] = clientArray[j];
                    clientArray[j] = tmp;
                }
            }
        }
    }

    public void printCustomers() {
        for (Customer client : clientArray) {
            System.out.println(client.toString());
        }
    }

    public void filterByCard(long min, long max) {
        for(Customer client : clientArray) {
            if (client.getCard() >= min && client.getCard() <= max) {
                System.out.println(client.toString());
            }
        }
    }

    public static void main(String[] args) {
        String[] testSurnames = new String[] {"Rezapova", "Usoltcev", "Skalon", "Lebedev", "Novikov", "Abubarakov"};
        String[] testNames = new String[] {"Valery", "Dmitry", "Elizaveta", "Mikhail", "Alexander", "Rhenat"};
        String[] testFatherNames = new String[] {"Albertovna", "Igorevich", "Ivanovna", "Alexandrovich", "Robertovich", "Rustemovich"};
        String[] testAddress = new String[] {"Hudozhnik av. 16", "Dybenko st. 28", "Novoismailovsky av. 42", "Kronverksky av. 47", "Kazanskaya st. 26", "Elecktrosila st. 8"};
        long[] testCard = new long[] {420024, 221837, 652345, 564000, 921764, 364928};
        long[] testAccount = new long[] {1234567, 4567321, 1187771, 4847491, 1248356, 1628428};

        CustomerAggregator testCollection = new CustomerAggregator(testSurnames, testNames, testFatherNames, testAddress, testCard, testAccount);
        testCollection.printCustomers();
        testCollection.sortByFullName();
        System.out.println();
        System.out.println();
        testCollection.printCustomers();
        System.out.println();
        System.out.println();
        testCollection.filterByCard(500000, 1000000);
    }
}
