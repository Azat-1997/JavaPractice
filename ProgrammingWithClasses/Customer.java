package com.company;

public class Customer {

     private String surname;
     private String name;
     private String fathername;
     private String address;
     private long card;
     private long account;

    public Customer(String surname, String name, String fathername, String address, long card, long account) {
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
        this.address = address;
        this.card = card;
        this.account = account;

    }
    // getters
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fathername;
    }

    public String getAddress() {
        return address;
    }

    public long getCard() {
        return card;
    }

    public long getAccount() {
        return account;
    }

    // setters
    public void setSurname(String val) {
        surname = val;
    }

    public void setName(String val) {
        name = val;
    }

    public void setFatherName(String val) {
        fathername = val;
    }

    public void setAddress(String val) {
        address = val;
    }

    public void setCard(long val) {
        card = val;
    }

    public void setAccount(long val) {
        account = val;
    }

    public String toString() {
        String representation = getSurname() + " " + getName() + " " + getFatherName() + ": " + getAddress() +", Card: " + getCard() + ", Bank account: " + getAccount();
        return representation;
    }

    public static void main(String[] args) {
        Customer testCustomer = new Customer("Pupkin", "Vasylii", "Ivanovich", "Pushkin street 14a", 148869228, 420034);
        System.out.println(testCustomer.toString());
        testCustomer.setAddress("Zhukov square 20");
        System.out.println(testCustomer.toString());
        testCustomer.setCard(20021100);
        System.out.println(testCustomer.toString());
    }
}
