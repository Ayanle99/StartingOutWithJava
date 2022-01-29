package challenge25;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    /**
     *  Wriite a program that tests your ESP ( extraseonsory perception). The program should randomly
     *  select the name of a color from the following list of words.
     *
     *      Red,Green, Blue,Orange, Yellow
     *
     *  To select a word, the program can generate a random number. For example if the number is 0,
     *  the selected word is Red, if the number is 1, the selected word is Green, and so forth.
     *
     *  Next, the program should ask the user to enter the color that the computer has selected.
     *  After the user has enetered his or her guess, the program should display the name of the randomly
     *  selected color. The program should repeat this 10 times and then display the number of times
     *  the user correctly guessed the selected color.
     *
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        String[] colors = {

                "Red", "Green", "Blue", "Orange", "Yellow"
        };

        int guesses = 0;

        for (int i = 0; i < colors.length; i++){

            Random random = new Random();
            int rnd = random.nextInt(colors.length);
            String computerSelection = colors[rnd];

            System.out.println("Guess the word: ");
            String word = scanner.nextLine();
            System.out.println("Selected word: " + computerSelection);
            if (word.equalsIgnoreCase(computerSelection)){
               guesses++;
            }

            counter++;

            if (counter >= 10){
                break;
            }

        }

        System.out.println();
        System.out.println("Guess count: " + guesses);

    }





}
