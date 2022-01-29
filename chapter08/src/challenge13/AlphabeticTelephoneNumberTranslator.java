package challenge_8_13;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticTelephoneNumberTranslator {


    // Alphabetic Telephone Number Translator



    public static void main(String[] args) {


        String [][] nums = {

                {"2", "A", "B", "C"},
                {"3", "D", "E", "F"},
                {"4", "G", "H", "I"},
                {"5", "J", "K", "L"},
                {"6", "M", "N", "O"},
                {"7", "P", "Q", "R", "S"},
                {"8", "T", "U", "V"},
                {"9", "W", "X", "Y", "Z"}
        };

        // 1-800-GOT-JUNK ->
        // User Input:  555-GET-FOOD
        // Result:      555-438-3663

        Scanner scanner = new Scanner(System.in);

        String phone = scanner.nextLine();

        char[] arr = phone.toCharArray();

        for (int i = 0; i < arr.length;i++){

            if (Character.isLetter(arr[i])){

                if (arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C'){
                    arr[i] = '2';
                }
                else if (arr[i] == 'D' || arr[i] == 'E' || arr[i] == 'F'){
                    arr[i] = '3';
                }
                else if (arr[i] == 'G' || arr[i] == 'H' || arr[i] == 'I'){
                    arr[i] = '4';
                }
                else if (arr[i] == 'J' || arr[i] == 'K' || arr[i] == 'L'){
                    arr[i] = '5';
                }
                else if (arr[i] == 'M' || arr[i] == 'N' || arr[i] == 'O'){
                    arr[i] = '6';
                }
                else if (arr[i] == 'P' || arr[i] == 'Q' || arr[i] == 'R' || arr[i] == 'S'){
                    arr[i] = '7';
                }

                else if (arr[i] == 'T' || arr[i] == 'U' || arr[i] == 'V'){
                    arr[i] = '8';
                }
                else if (arr[i] == 'W' || arr[i] == 'X' || arr[i] == 'Y' || arr[i] == 'Z'){
                    arr[i] = '9';
                }

            }


        }

        for (char ch : arr){
            System.out.print(ch);
        }



    }
}
