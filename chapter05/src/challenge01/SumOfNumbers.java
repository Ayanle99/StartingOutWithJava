package challenge01;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        /**
         * Write a program that asks the user for a postive nonzero
         * integer value. The program should use a loop to get the sum
         * of all the integers from 1 up to the number entered. For
         * example, if the user enters 50, the loop will find the sum of
         * 1, 2, 3, 4,.....50.
         *
         *
         */

       // while loop

        int counter = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a nonzero positive integer: ");
        int number = scanner.nextInt();

//        while (counter <= number){
//            sum += counter;
//            counter++;
//        }
//        System.out.println("Total: " + sum);

        // for loop

         for (int i = 1; i <= number; i++){
             sum += i;
         }

        System.out.println("Total: " + sum);



    }
}
