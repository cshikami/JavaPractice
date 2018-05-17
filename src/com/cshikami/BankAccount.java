package com.cshikami;

import java.util.Scanner;

public class BankAccount {
    private int account_number;
    private int account_balance;

    public BankAccount(int account_number, int account_balance) {
        this.account_number = account_number;
        this.account_balance = account_balance;




        System.out.println("You created account " + this.account_number + ".");
    }

    public int getAccount_balance() {
        System.out.println("Account balance is $" + account_balance);
        return account_balance;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
        System.out.println("Account balance is $" + this.account_balance);
    }

    public int getAccount_number() {
        System.out.println("Your account number is: " + this.account_number);
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
        System.out.println("Your account number is: " + this.account_number);
    }



    public void deposit(int addMoney) {
        if (addMoney < 0) {
            System.out.println("You cannot deposit a negative amount.");
        } else {
            this.account_balance = this.account_balance + addMoney;
            System.out.println("$" + addMoney + " deposited into account " +
            this.account_number + ".");
        }
    }

    public void withdraw(int removeMoney) {
        if (removeMoney > this.account_balance) {
            System.out.println("You cannot remove more than what is in your account.");
        } else {
            this.account_balance = this.account_balance - removeMoney;
            System.out.println("$" + removeMoney + " removed from account " +
            this.account_number + ".");
        }
    }

    public void userInterface(int userEntry) {

        if (userEntry == 0) {
            System.out.println("Thank you for banking with us. Have a great day!");
        }

        while (userEntry != 0) {
            switch (userEntry) {
                case 1:
                    getAccount_balance();
                    break;
                case 2:
                    System.out.print("How much would you like to deposit?: ");
                    Scanner depositScanner = new Scanner(System.in);
                    int amountToDeposit = depositScanner.nextInt();
                    deposit(amountToDeposit);
                    break;
                case 3:
                    System.out.print("How much would you like to withdraw?: ");
                    Scanner withdrawScanner = new Scanner(System.in);
                    int amountToWithdraw = withdrawScanner.nextInt();
                    withdraw(amountToWithdraw);
                    break;
                default:
                    System.out.println("Error. Please press 1, 2, or 3.");
                    break;
            }

            System.out.println("Welcome.\n*Press 1 to check account balance\n*Press 2 to deposit\n*Press 3 to withdraw\n*And 0 to exit");
            Scanner newUserInterfaceScanner = new Scanner(System.in);
            userEntry = newUserInterfaceScanner.nextInt();
        }
    }


}
