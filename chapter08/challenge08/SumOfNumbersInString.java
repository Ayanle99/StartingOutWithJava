package challenge_8_8;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNumbersInString {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a series of numbers: ");
        String str = sc.nextLine();

        String[] parts = str.split(",");

        int total = 0;

        for (String p : parts){
            total += Integer.parseInt(p);
        }
        System.out.println("\nTotal: " + total);


    }
}
