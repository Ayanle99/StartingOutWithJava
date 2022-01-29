package challenge_7_01;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RainfallClass {

    /**
     *  Write a RainFall class that stores that total rainfall for each of 12 months into an array of
     *  doubles. The program should have methods that return the following:
     *
     *  1)  total rainfall for the year
     *  2)  the average monthly rainfall
     *  3)  the month with the most rain
     *  4)  the month with the least rain
     *
     *
     *  Demonstrate the class in a complete program
     *
     *  Input Validation: Do not accept negative numbers for monthly rainfall figures.
     *
     */
    private  ArrayList<Double> rainfall = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("###.##");

    public double getTotalRainfall(){

        double total = 0.0;

        for (int i = 1; i <= 12; i++){
            System.out.print("Enter rainfall for month " + i + ": ");
            double rainfall_inch = scanner.nextDouble();
            total += rainfall_inch;

            while (rainfall_inch < 0){
                System.out.println("Error: rainfall inches cannot be negative: ");
                rainfall_inch = scanner.nextDouble();
            }

            rainfall.add(rainfall_inch);
        }

        System.out.println();

        for (double rainfall : rainfall){
            rainfall += total;
        }

        return Double.parseDouble(df.format(total));
    }
    public double averageMonthlyRainfall(){

        double total = 0;

        for (int i = 0; i < rainfall.size();i++){
            total += rainfall.get(i);
        }
        total = Double.parseDouble(df.format(total/ 12.0));

        return total;
    }
    public double mostRain(){

        return Collections.max(rainfall);
    }
    public double leastRain(){

        return  Collections.min(rainfall);
    }

}

