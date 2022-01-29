package challenge04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PenniesForDay {


    public static void main(String[] args) {
        /**
         *  Write a program that calculates how much a person
         *  would earn over a period of time if his or her
         *  salary is one penny the first day, two pennies
         *  the second day, and continues to double each day.
         *  The program should display a table showing the salary
         *  for each day, and show the total pay at the end of the period.
         *  The output should be displayed in a dollar ammount, not the number of pennies.
         *
         *
         *  Input Validation: Do not accept a number less than one for the number of hours worked.
         */

        DecimalFormat df = new DecimalFormat("#,###,###.00");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of days worked: ");
        int days = scanner.nextInt();

        while (days <= 0){
            System.out.println("Error: Enter the number of days worked: ");
            days = scanner.nextInt();
        }

        int currentDay = 1;
        double total_pennies = 0.0;
        double penny = 0.01;

        for (int i = 1; i <= days;i++){

            System.out.printf("%-15s%s\n", currentDay, df.format(penny));
            total_pennies += penny;
            currentDay++;
            penny *= 2;

        }

        System.out.println();
        System.out.println("Total: $" + df.format(total_pennies));;





    }
}
