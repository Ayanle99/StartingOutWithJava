package challenge_8_3;

import java.util.Scanner;

public class SentenceCapitalizer {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        capitalize(str);

    }
    public static void capitalize(String str){

        String[] split = str.split("\\.");

        for (String sentence : split){
            System.out.print(sentence.substring(0,1).toUpperCase() + sentence.substring(1) + ". ");
        }

    }
}
