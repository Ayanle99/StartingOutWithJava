package challenge_7_07;

import java.util.ArrayList;
import java.util.Scanner;

public class QuarterlySales {

    /**
     *
     * 707
     * Write a program that lets the user enter four quarterly sales figures for six divisions of a company. The figures should be stored in a two-dimensional array. Once the figures are entered, the program should display the following data for each quarter:
     *
     * A list of the sales figures by division.
     * Each division’s increase or decrease form the previous quarter (this will not be displayed for the first quarter)
     * The total sales for the quarter
     * The average sales for all divisions that quarter
     * The division with the highest sales for that quarter
     *
     * Input Validation: Do not accept negative numbers for sales figures.
     *
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] companySales = new int[6][4];

        getCompanySales(companySales);



    }

    private static void getCompanySales(int[][] companySales) {

        for (int i = 0; i < 6; i++){
            System.out.println("Division: #"+(i+1));
            System.out.println();
            for (int j=0;j<4;j++){
                System.out.print("\t\tQuarter: #"+(j+1) +": " );
                companySales[i][j] = scanner.nextInt();

                while (companySales[i][j] < 0){
                    System.out.println("Error: only positive numbers allowed.");
                    companySales[i][j] = scanner.nextInt();
                }
            }
            System.out.println();
        }

        showCompanySales(companySales);


    }

    private static void showCompanySales(int[][] companySales) {

        System.out.println();
        System.out.println("Company Sales figures.\n");

        int change;

        for (int i = 0; i < 6; i++){
            System.out.println("Division: #" +(i+1));
            change = 0;
            for (int j = 0; j < 4; j++){

                if (j >=1){
                    change = companySales[i][j] - companySales[i][j-1];
                    System.out.println("\t\tQuarter: #" +(j+1) + " "+companySales[i][j] + " ("+change+")");
                }else {
                    System.out.println("\t\tQuarter: " +(j+1) +" " + companySales[i][j]);
                }
            }

            System.out.println();
        }

        getStatistics(companySales);

    }
    public static void getStatistics(int[][] companySales){

        System.out.println();
        System.out.println("Statistics\n");

        int total, change;
        ArrayList<Integer> quarterTotals = new ArrayList<>();

        for(int i = 0; i < 4; i++){

            total = 0;

            for (int j = 0; j < 6;j++){
                total += companySales[j][i];
            }

            quarterTotals.add(total);

            change = 0;

            System.out.println("Quarter: #" +(i+1));

            if (i >=1){
                change = quarterTotals.get(i) - quarterTotals.get(i-1);
                System.out.println("\t\tTotal: $"+ quarterTotals.get(i) + " ("+change+")");
            }else {
                System.out.println("\t\tTotal: $"+quarterTotals.get(i));
            }

            double avg = (quarterTotals.get(i)/6);
            System.out.println("\t\tAverage: $"+avg);

            int highestSale = 0;
            int divisionIndex = 0;

            for (int x = 0; x < 6; x++){
                if (companySales[x][i] > highestSale){
                    highestSale = companySales[x][i];
                    divisionIndex = x+1;
                }
            }

            System.out.println("\t\tHighest Sales: " +highestSale + "\tDivision: #"+divisionIndex);


        }



    }
}
