package challenge10;

public class SavingsAccount {

    /**
     *
     *
     * Design a Savings Account class that stores a savings account's annual interest rate and starting balance. The class constructor should accept the amount of the saving account's starting balance, The class should also have methods for subtracting the amount of withdrawal, adding the amount of a deposit, and adding the amount of monthly interest to the balance. The monthly interest rate is the annual interest rate divided by 12. To add to the monthly interest to the balance, multiply the monthly interest rate by the balance and add the result to the balance.
     *
     * Test the class in a program that calculates the balance of a savings account at the end of a period of time. It should ask the user for the annual interest rate, starting balance and the number of months that have passed since the account was established. A loop should then iterate once for every month, performing the following:
     *
     * a) Ask the user for the amount deposited into the account during the month. Use the class method to add this amount to the account balance.
     * b) Ask the user for the amount withdrawn from the account during the month. Use the class method to subtract this amount from the account balance.
     * c) Use the class method to calculate the monthly interest.
     *
     * After the last iteration, the program should display the ending balance, the total of deposits, the total amount of withdrawals, and the total interest earned.

     */


    private double rate;
    private double balance;

    public SavingsAccount(double rate,
                          double balance){
        this.rate = rate;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double monthlyInterest(){

        rate = (rate/100/12) * balance;
        balance += rate;

        return  rate;

    }
    public double getBalance(){

        return balance;
    }
    public double getInterest(){

        return (rate/100/12)* balance;

    }





}
