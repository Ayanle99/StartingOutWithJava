package challenge_8_11;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalessAnalysis {

    static File file = new File("src/challenge_8_11/salesData.txt");
    static DecimalFormat df = new DecimalFormat("#,###.00");
    static Scanner sc;


    public static void main(String[] args) {


        try {

            sc = new Scanner(file);

            int count = 1, allWeeksTotal = 0,
                    num1 = 0, num2 = 0;

            double greatestSale = 0, lowestSales = Double.MAX_VALUE;

            while (sc.hasNext()){

                String [] parts = sc.nextLine().split(",");
                double total = 0;
                System.out.println("\nWeek #" + count);
                System.out.println();

                for (int i = 0; i < 7;i++){
                    double sales = Double.parseDouble(parts[i]);
                    System.out.println("Day #" + (i+1) +": $" + df.format(sales));
                    total += sales;
                }
                allWeeksTotal += total;

                if (total > greatestSale){
                    greatestSale = total;
                    num1 = count;
                }
                if (total < greatestSale){
                    lowestSales = total;
                    num2 = count;
                }


                System.out.println("\nTotal: $" + df.format(total)
                +"\nAverage: " + df.format(total/7));


                count++;
            }

            System.out.println("\nTotal: $" + df.format(allWeeksTotal)
            +"\nAverage: $" + df.format(allWeeksTotal/3)
            +"\nGreatest Sales: $" + df.format(greatestSale) + "\tWeek #" +num1
            +"\nLowest Sales: $" + df.format(lowestSales) + "\tWeek #" + num2);


        }catch (Exception e){
            System.out.println(e.toString());
        }


    }
}
