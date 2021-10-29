package org.fasttrackit;

public class BankAccount {

    int balance;
    String customerName;
    String customerSurname;

    public BankAccount(String customerName, String customerSurname){
        this.customerName = customerName;
        this.customerSurname = customerSurname;

    }

    public void deposit(int amount) {

        if(amount !=0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if(amount != 0) {
            balance -= amount;
        }
    }

}
