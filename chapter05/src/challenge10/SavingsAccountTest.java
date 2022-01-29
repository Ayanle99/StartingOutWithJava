package challenge10;

import challenge10.SavingsAccount;

import java.io.File;
import java.text.NumberFormat;
import java.util.Scanner;

public class SavingsAccountTest {


    static Scanner scanner;
    static SavingsAccount savingsAccount = new SavingsAccount(3,500.00);

    public static void main(String[] args) {

        Scanner scanner;

        double deposit = getDeposits();
        double withdrawals = getWithdrawals();

        savingsAccount.deposit(deposit);
        savingsAccount.monthlyInterest();
        savingsAccount.withdraw(withdrawals);
        savingsAccount.monthlyInterest();

        NumberFormat nf = NumberFormat.getIntegerInstance();
        nf.setMinimumFractionDigits(1);

        System.out.println("Balance: $" + nf.format(savingsAccount.getBalance()));
        System.out.println("Deposits: " + nf.format(deposit));
        System.out.println("Withdrawals: " + nf.format(withdrawals));
        System.out.println("Total interest: $" + nf.format(savingsAccount.getInterest()));





    }
    private static double getWithdrawals(){

        double totalWithdrawal = 0.0;

        try {

            scanner = new Scanner(new File("src/challenge11/Withdrawals.txt"));

            double total = 0;

            SavingsAccount savingsAccount = new SavingsAccount(3,500);

            while (scanner.hasNext()){

                String number = scanner.next();
                totalWithdrawal += Double.parseDouble(number);

            }


        }catch (Exception e){e.printStackTrace();}

        return totalWithdrawal;
    }

    private static double getDeposits(){

        double totalDeposit = 0.0;

        try {

            scanner = new Scanner(new File("src/challenge11/Deposits.txt"));

            double total = 0;

            SavingsAccount savingsAccount = new SavingsAccount(3,500);

            while (scanner.hasNext()){

                String number = scanner.next();
                totalDeposit += Double.parseDouble(number);

            }


        }catch (Exception e){e.printStackTrace();}

        return totalDeposit;
    }
}


