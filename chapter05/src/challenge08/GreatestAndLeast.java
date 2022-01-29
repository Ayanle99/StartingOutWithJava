package challenge08;

import java.util.Scanner;

public class GreatestAndLeast {

    public static void main(String[] args) {

        /**
         * Write a program with a loop that lets the user enter
         * a series of integers. The user should enter -99
         * to signal  the end of the series. After all the number
         * have been entered, the program should display the larger and smallest numbers entered.
         *
         *
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int min = number;
        int max = number;


        while (number != -99){

            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }

            System.out.print("Enter the next number: ");
            number = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Min: " + min
        + "\nMax: " + max);

    }
}
