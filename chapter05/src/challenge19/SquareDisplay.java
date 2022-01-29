package challenge19;

import java.util.Scanner;

public class SquareDisplay {

    /**
     *   Write a program that asks the user for a positive integer no greater than 15.
     *   The program should than display a square on the screen using the character 'X'.
     *   The number entered by the user will be the length of each
     *   side of the square. For example, if the user enters 5, the
     *   program should display the following.
     *
     *   XXXXX
     *   XXXXX
     *   XXXXX
     *   XXXXX
     *   XXXXX
     *
     *   If the user enters 8, the following should be diisplayed.
     *
     *   XXXXXXXX
     *   XXXXXXXX
     *   XXXXXXXX
     *   XXXXXXXX
     *   XXXXXXXX
     *   XXXXXXXX
     *   XXXXXXXX
     *   XXXXXXXX
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number less than 15: ");
        int num = scanner.nextInt();

        while (num > 15){
            System.out.print("Enter a number less than 15: ");
            num = scanner.nextInt();
        }
        System.out.println();

        for (int row = 0; row < num; row++){
            for (int col = 0; col < num; col++){
                System.out.print("X");
            }
            System.out.println();
        }


    }




}
