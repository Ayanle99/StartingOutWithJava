package challenge_8_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SumOfDigitsInAString {

    public static void main(String[] args) {


        // 2514 = 12
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a series of numbers: ");
        String str = sc.nextLine();

        ArrayList<Integer> nums = new ArrayList<>();

        int total = 0, min = 0, max = 0;

        for (int i = 0; i < str.length();i++){


            if (Character.isDigit(str.charAt(i))){
                String temp = str.substring(i, i+1);
                total += Integer.parseInt(temp);
                nums.add(Integer.parseInt(temp));
            }
        }

        min = nums.get(0);
        max = nums.get(0);

        for (int i = 0; i < nums.size();i++){
            if (nums.get(i) < min){
                min = nums.get(i);
            }
            else if (nums.get(i) > max){
                max = nums.get(i);
            }
        }

        System.out.println("\nTotal: " + total
        +"\nHighest Number: " + max
        +"\nLowest Number: " + min);


    }
}
