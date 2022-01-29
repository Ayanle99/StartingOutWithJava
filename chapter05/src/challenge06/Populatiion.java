package challenge06;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Please subscribe to my youtube channel "The Blind Programmer"
 * the link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 */
public class Populatiion {

    /**
     * Write a class that will predict the size of a population of organisms. The class should store the starting number  of organisms, their average daily population increase (as a percentage),and the number of days they will multiply. The class should have a method that uses a loop to display the size of the population for each day.
     *
     * Test the class in a. Program that asks the user for the starting size of the population , their average daily increase, and the number of days they will multiply. The program should display the daily population.
     *
     * Input Validation: Do not accept a number less than 2 for the starting size of the population.
     * Do not accept a negative number for average daily population increase. Do not accept a number less than 1 for the number of days they will multiply.
     */
    private double startPop;
    private double per_increase;
    private int days;

    public Populatiion(double start, double increase, int d){
        this.startPop = start;
        this.per_increase = increase/100;
        this.days = d;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Starting population: ");
        double startingPopulation = sc.nextDouble();

        while (startingPopulation < 2){
            System.out.print("Error: Starting population cannot be less than 2: ");
            startingPopulation = sc.nextDouble();
        }

        System.out.print("% increase: ");
        double dailyPercentageIncrease = sc.nextDouble();

        while (dailyPercentageIncrease < 0){
            System.out.print("Error: % increase cannot be negative: ");
            dailyPercentageIncrease = sc.nextDouble();
        }

        System.out.print("days: ");
        int days = sc.nextInt();

        while (days < 1){
            System.out.print("Error: days must be 1 day or higher");
            days = sc.nextInt();
        }


        Populatiion pop = new Populatiion(startingPopulation,
                dailyPercentageIncrease,days);

        pop.getSizeOf();
    }

    public void getSizeOf(){

        String format = "%1s%20s\n";

        System.out.printf(format, "Day", "Population");

        NumberFormat nf = NumberFormat.getIntegerInstance();
        nf.setMinimumFractionDigits(1);

        for (int i = 1; i <= days;i++)
        {
            System.out.printf(format, i , nf.format(startPop));
            startPop += startPop * per_increase;
        }



    }
}
