package org.fasttrackit;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer name ");
        String custName = scanner.nextLine();
        System.out.println("customer name is  " + custName);

        System.out.println("Enter the customer Surname ");
        String custSurname = scanner.nextLine();
        System.out.println("customer Surname is  " + custSurname);


        BankAccount bankAccount = new BankAccount(custName, custSurname);

        bankAccount.showMenu();

    }
}
