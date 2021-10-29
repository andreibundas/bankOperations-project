package org.fasttrackit;

import java.util.Scanner;

public class BankAccount {

    int balance;
    String customerName;
    String customerSurname;

    public BankAccount(String customerName, String customerSurname) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
    }

    public void depositR(int amount) {
        balance = 0;

        if (amount != 0) {
            balance += amount;
        }
    }

    public void withdrawR(int amount) {
        if (amount != 0) {
            balance -= amount;
        }
    }


    public void depositE(int amount) {
        balance = 0;

        if (amount != 0) {
            balance += amount;
        }
    }

    public void withdrawE(int amount) {
        if (amount != 0) {
            balance -= amount;
        }
    }

    public void deposit$(int amount) {
        balance = 0;

        if (amount != 0) {
            balance += amount;
        }
    }

    public void withdraw$(int amount) {
        if (amount != 0) {
            balance -= amount;
        }
    }

    public void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Welcome " + customerSurname);

        System.out.println("Select currency : \n for RON press R; \n for EUR press E; \n for USD press $ ");
        Character currency = scanner.next().charAt(0);

        if (currency.equals('R')) {

            System.out.println("*************************************");
            System.out.println("Press A. for: Check Balance");
            System.out.println("*************************************");
            System.out.println("Press B. to Deposit money");
            System.out.println("*************************************");
            System.out.println("Press C. to withdraw money");
            System.out.println("*************************************");
            System.out.println("Press E. to Exit");
            System.out.println("*************************************");

            do {
                System.out.println(" **********");
                System.out.println(" Chose an option ");
                System.out.println(" **********");
                option = scanner.next().charAt(0);
                char optionUc = Character.toUpperCase(option);

                switch (optionUc) {

                    case 'A':
                        System.out.println("The Balance is :" + balance);
                        System.out.println();
                        break;

                    case 'B':
                        System.out.println("Enter an amount to deposit ");
                        int amount = scanner.nextInt();
                        System.out.println("---");
                        depositR(amount);
                        System.out.println(" The new Balance is :" + balance);
                        break;

                    case 'C':
                        System.out.println("Enter an amount to withdraw ");
                        int amountw = scanner.nextInt();
                        withdrawR(amountw);
                        System.out.println(" The new Balance is :" + balance);
                        break;

                    case 'E':
                        System.out.println("*************************************");
                        break;

                    default:
                        System.out.println("Invalid option! Please try again ! ");
                        break;
                }

            } while (option != 'E');

            System.out.println("Thank you for visiting our bank");

        } else if (currency.equals('E')) {

            System.out.println("*************************************");
            System.out.println("Press A. for: Check Balance");
            System.out.println("*************************************");
            System.out.println("Press B. to Deposit money");
            System.out.println("*************************************");
            System.out.println("Press C. to withdraw money");
            System.out.println("*************************************");
            System.out.println("Press E. to Exit");
            System.out.println("*************************************");

            do {
                System.out.println(" **********");
                System.out.println(" Chose an option ");
                System.out.println(" **********");
                option = scanner.next().charAt(0);
                char optionUc = Character.toUpperCase(option);

                switch (optionUc) {

                    case 'A':

                        System.out.println("The Balance is :" + balance);
                        System.out.println();
                        break;

                    case 'B':
                        System.out.println("Enter an amount to deposit ");
                        int amount = scanner.nextInt();
                        depositE(amount);
                        System.out.println(" The new Balance is :" + balance);
                        break;

                    case 'C':
                        System.out.println("Enter an amount to withdraw ");
                        int amountw = scanner.nextInt();
                        withdrawE(amountw);
                        System.out.println(" The new Balance is :" + balance);
                        break;

                    case 'E':
                        System.out.println("*************************************");
                        break;

                    default:
                        System.out.println("Invalid option! Please try again ! ");
                        break;
                }

            } while (option != 'E');

            System.out.println("Thank you for visiting our bank");

        }
        else if (currency.equals('$')) {

            System.out.println("*************************************");
            System.out.println("Press A. for: Check Balance");
            System.out.println("*************************************");
            System.out.println("Press B. to Deposit money");
            System.out.println("*************************************");
            System.out.println("Press C. to withdraw money");
            System.out.println("*************************************");
            System.out.println("Press E. to Exit");
            System.out.println("*************************************");

            do {
                System.out.println(" **********");
                System.out.println(" Chose an option ");
                System.out.println(" **********");
                option = scanner.next().charAt(0);
                char optionUc = Character.toUpperCase(option);

                switch (optionUc) {

                    case 'A':

                        System.out.println("The Balance is :" + balance);
                        System.out.println();
                        break;

                    case 'B':
                        System.out.println("Enter an amount to deposit ");
                        int amount = scanner.nextInt();
                        deposit$(amount);
                        System.out.println(" The new Balance is :" + balance);
                        break;

                    case 'C':
                        System.out.println("Enter an amount to withdraw ");
                        int amountw = scanner.nextInt();
                        withdraw$(amountw);
                        System.out.println(" The new Balance is :" + balance);
                        break;

                    case 'E':
                        System.out.println("*************************************");
                        break;

                    default:
                        System.out.println("Invalid option! Please try again ! ");
                        break;
                }

            } while (option != 'E');

            System.out.println("Thank you for visiting our bank");

        }

    }

}
