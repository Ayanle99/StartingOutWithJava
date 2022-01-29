package challenge07;

import java.text.NumberFormat;
import java.util.Scanner;

public class AverageRainfall {

    public static void main(String[] args) {

        // Ask the user number of years
        // Outer loop: one for each year
        // Inner loop: one for every month of the year.

        // Ask total inches for each month

        // number of months
        // total iinches of rainfall
        // average rainfall per month

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many years: ");
        int years = scanner.nextInt();

        while (years < 1){
            System.out.print("Error: Enter how many years: ");
            years = scanner.nextInt();
        }
        double total_inches_of_rain = 0.0;
        for (int i = 1; i <= years;i++){
            System.out.println("Year: " + i);
            for (int j = 1; j <= 12; j++){
                System.out.print("Enter the total inches of rain for month " + j + " : ");
                total_inches_of_rain += scanner.nextDouble();
            }
        }

        int total_months = years*12;
        double avg = total_inches_of_rain/total_months;

        String format = "%4s%20s%20s\n";
        System.out.println();

        NumberFormat nf  = NumberFormat.getIntegerInstance();
        nf.setMinimumFractionDigits(1);

        System.out.printf(format, "# Months", "Total Inches", "Average Rainfall");
        System.out.printf(format, total_months, nf.format(total_inches_of_rain), nf.format(avg));

    }
}
