package challenge_8_1;

import java.util.Scanner;

public class BackwardString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(getBackwardString(str));


    }

    private static String getBackwardString(String str) {

        String output = "";

        for (int i = str.length()-1; i >= 0; i--){
            output += str.charAt(i);
        }

        return output;
    }
}
