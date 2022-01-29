package challenge11;

import challenge10.SavingsAccount;

import java.io.File;
import java.text.NumberFormat;
import java.util.Scanner;

public class DepositAndWithdrawalFiles {

    static Scanner scanner;
    static final String DEPOSIT_PATH = "src/challenge11/Deposits.txt";
    static final String WITHDRAWAL_PATH = "src/challenge11/Withdrawals.txt";
    static SavingsAccount sa = new SavingsAccount(3, 500);
    static double totalInterest = 0;
    static double totalWithdrawals = 0;
    static double totalDeposits = 0;



    public static void main(String[] args) {


        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(1);


        deposit_money();
        withdraw_money();

        System.out.println("Balance: $" + nf.format(sa.getBalance()));
        System.out.println("Total Deposits: $" + nf.format(totalDeposits));
        System.out.println("Total Withdrawals: $" + nf.format(totalWithdrawals));
        System.out.println("Total Interest: $" + nf.format(totalInterest));


    }
    public static void deposit_money(){

        try
        {
            scanner = new Scanner(new File(DEPOSIT_PATH));


            while (scanner.hasNext()){

                String str = scanner.next();
                double number = Double.parseDouble(str);
                sa.deposit(number);
                totalDeposits += sa.monthlyInterest();
                totalDeposits += number;

            }


        }catch (Exception e){e.printStackTrace();}
        scanner.close();

    }
    public static  void withdraw_money(){


        try{

            scanner = new Scanner(new File(WITHDRAWAL_PATH));

            while (scanner.hasNext()){

                String str = scanner.next();
                double number = Double.parseDouble(str);
                sa.withdraw(number);
                totalWithdrawals += number;
                totalInterest += sa.monthlyInterest();

            }

        }catch (Exception e){e.printStackTrace();};

        scanner.close();

    }
}
