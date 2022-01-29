package challenge17;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {


    /**
     *  Write a program that generates a random number
     *  that asks the user to guess what the number is.
     *  if the user's guess is higher then the random number,
     *  the program should display "Too High, Try again!",
     *  if the user's guess is lower than the random number,
     *  the program should display  "Too low, Try again!",
     *  The program should use a loop that repeats until the user correctly guesses the random number.
     */
    public static void main(String[] args) {

        int guess,answer;

        do {
            System.out.println("Enter your guess.");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();

            Random random = new Random();
            answer = random.nextInt(100 - 1) + 1;

            if (guess > answer){
                System.out.println("Too high, Try again! " + String.valueOf(answer));
            }
            if (guess < answer){
                System.out.println("Too Low, Try again! " + String.valueOf(answer));
            }

        }while (guess != answer);



    }

}
