package challenge24;

import java.util.Scanner;

public class AGameOf21 {

    /**
     *  Write a program that uses the challenge24.Dice class that was presented in Chapter 4 to write a program
     *  that lets the user play against the computer in a variation of the popular blackjack card game.
     *  In this variation of the game, two six-sided dice are used instead of cards. The dice are rolled,
     *  and the player tries to beat the computer's hidden total without going over 21.
     *
     *  Her are some suggesrtions for the game's design:
     *
     *  1) Each round of the game is performed as an iteration of a loop that repeats as long as the player agress to roll the dice,
     *  and the player's total does not exceed 21.
     *  2) At the begining of each round, the program will ask the user whether he or she wants to roll the dice to acculate points.
     *
     *  3) During each round, the program simulates the rolling of two six-sided dice. It rolls
     *  the dice first for the computer, and then it asks the user if he or she wants to roll.
     *  (Use the challenge24.Dice class that was domonstrated in Chapter 4 to simulate the dice).
     *
     *  4) The loop keeps a running total of both the computer and the user's points.
     *  5) The computer's total should remain hidden until the loop has finished.
     *  6) After the loop has finished, the computer's total is revealed, and whoever the
     *  the player with the most points without going over 21 wins.
     *
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int computerTotal = 0;
        int playerTotal = 0;

        String quit = "";

        do {

            if (computerTotal >= 21){
                break;
            }
            if (playerTotal >= 21){
                break;
            }

            Dice computer = new Dice(6);
            Dice player = new Dice(6);

            computer.roll();
            int computerRound = computer.getValue();
            computerTotal += computerRound;

            System.out.print("Roll again? enter any key or ( type q to quit): ");
            quit = scanner.nextLine();

            player.roll();
            int playerRound = player.getValue();
            playerTotal += playerRound;


            System.out.println("Player total: " + playerTotal);


        }while (!quit.equalsIgnoreCase("q"));

        System.out.println();

        System.out.println("Computer total points: " + computerTotal
        + "\nPlayer total points: " + playerTotal);

        if (computerTotal < playerTotal){
            System.out.println("Computer won!");
        }
        if (playerTotal < computerTotal){
            System.out.println("Player won!");
        }


    }


}
