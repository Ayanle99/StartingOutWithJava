package challenge_8_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char option = ' ';

        do {

            VowelsAndConsonants vc = new VowelsAndConsonants(str);

            System.out.println("\n\nChoose from the menu." +
                    "\n\n\ta. Count the number of vowels in the String." +
                    "\n\tb. Count the number of consonants in the string." +
                    "\n\tc. Count both the vowels and consonants in the string" +
                    "\n\td. Enter another string" +
                    "\n\te. Exit the program.");

            System.out.print("\n\tYour option: ");
            option = sc.nextLine().charAt(0);

            switch (option){
                case 'a':
                    System.out.println("The number of vowels in ("+ str+") is: " + vc.getVowels());
                    break;

                case 'b':
                    System.out.println("The number of consonants in ("+ str+") is: " + vc.getCons());
                    break;
                case 'c':
                    System.out.println("Vowels: " + vc.getVowels() + "\nConsonants: " + vc.getCons());
                    break;
                case 'd':
                    System.out.println("Enter another string: ");
                    str = sc.nextLine();
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default:
            }

        }while (option != 'e');
    }
}
