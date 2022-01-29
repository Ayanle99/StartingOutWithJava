package challenge_8_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class WordSeparator {

    public static void main(String[] args) {


        // StopAndSmellTheRoses -> Stop and smell the roses

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words: ");
        String words = scanner.nextLine();

        int index = 0;

        String result = "";

        for (int i = 0; i < words.length();i++){

            if (Character.isUpperCase(words.charAt(i)) && index > 0){
                result += " ";
                result += Character.toLowerCase(words.charAt(i));
            }else {
                result += words.charAt(i);
            }

            index++;
        }

        System.out.println("Original sentence: " + words
        +"\nFormated sentence: " + result);

    }
}
