package challenge12;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {


        /**
         *
         *  Write a program that asks the user to enter
         *  today's sales for the store. The program should
         *  then display a bar chart comparing each store's sales.
         *  Create each bar in the bar chart by displaying a row
         *  of asterisks. Each asterisk should represent $100 of sales.
         *  Her is an example of the program's output.
         *
         *  Enter today's sales for store 1: 1000 [Enter]
         *  Enter today's sales for store 2: 1200 [Enter]
         *  Enter today's sales for store 3: 1800 [Enter]
         *  Enter today's sales for store 4: 800 [Enter]
         *  Enter today's sales for store 5: 1900 [Enter]
            Store 1: **********
            Store 2: ************
            Store 3: ******************
            Store 4: ********
            Store 5: *******************

         */

        Scanner scanner = new Scanner(System.in);

        int[] sales = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Enter today's sales for store " + (i+1) + " : ");
            sales[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("SALES BAR CHART");
        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.printf("Store %d : ", (i+1));
            // 1000 = 1000/100 = 10 = *******
            // 1200 = 1200/100 = 12 = *********
            for (int j = 0; j < sales[i]/100; j++){
                System.out.print("*");
            }
            System.out.println();

        }

// SG.u-KX8g4MS2iDQ7bAzAkTaQ.t11MbKvt5zoQ9lebaFw7btE9ZIoQaiWJivF038mWOgYPress Cmd - C to copy
    }
}
