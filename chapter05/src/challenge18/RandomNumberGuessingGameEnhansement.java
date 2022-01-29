package challenge18;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGameEnhansement {

    /**
     *
     *  Enhance the program that you wrote for Programming challange
     *  17 so it keeps a count of the number of guesses that the user
     *  makes. When the user correctly guesses the random number, the program should display the number of guesses.
     */

    public static void main(String[] args) {

        int guess, answer;
        int counter = 0;

        do {
            System.out.println("Enter your Guess: ");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            counter ++;

            Random random = new Random();
            answer = random.nextInt(100-1) + 1;

            if (guess > answer){
                System.out.println("Too high, Try again! " + String.valueOf(answer));
            }
            if (guess < answer){
                System.out.println("Too Low, Try again! " +String.valueOf(answer));
            }
            if (guess == answer){
                System.out.println("Correct! " + String.valueOf(counter));
            }


        }while (guess != answer);






    }


}
