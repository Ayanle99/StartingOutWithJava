package challenge_09;

/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */
public class BankAccountAndSavingsAcc {


    public static void main(String[] args) {


        BankAccount savingsAccount = new SavingsAccount(
                100, 2.1
        );

        savingsAccount.withdraw(50);

        System.out.println("Balance: $" + savingsAccount.getBalance()
        +"\nInterest: $" + savingsAccount.getInterest_rate()
        +"\n # Deposits: " + savingsAccount.getNumber_deposit()
        +"\n # Withdrawals: " + savingsAccount.getNumber_withdrawals()
        );




    }



}
