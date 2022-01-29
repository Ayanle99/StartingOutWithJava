package challenge16;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BudgetAnalysis {


    /**
     *
     * Write a program that asks the usser to enter the amount
     * that he or she has budgeted for the month.
     * A loop should then prompt the user to enter each of his or her expensses
     * for the month and keep a running total. When the loop finishes, the
     * program should display the amount that the user is over or under.
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the budget amount: ");
        double budget = scanner.nextDouble();

        double expense;
        double runningTotal = 0.0;

        do {
            System.out.print("Enter the expenses or enter negative number to quit: ");
            expense = scanner.nextDouble();
            runningTotal += expense;

        }while (expense >= 0);

        double balance = budget - runningTotal;

        if (balance < 0){
            System.out.println("The user is over budget: $" + String.valueOf(balance));
        }
        else if (balance > 0 ){
            System.out.println("The user is under budget: $" + String.valueOf(balance));
        }
        else {
            System.out.println("The user is on budget.");
        }





    }

}
