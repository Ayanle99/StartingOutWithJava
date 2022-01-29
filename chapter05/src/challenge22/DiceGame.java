package challenge22;

import java.util.Random;

public class DiceGame {


    /**
     * Write a program that uses the challenge24.Dice class that was pressented in chapter 4 to play a simple
     * dice game between the computer and the user. The program should  create two instances of
     * the challenge24.Dice class ( each a six-sided die). One Die object is the computer's die, and the other Die
     * object is the user's die.
     *
     * The program should have a loop that iterates 10 times. Each time the loop iterates, it should
     * roll both dice. The dice with the highest value wins, ( in case of a tie, there is no winner for
     * that particular roll of the dice.)
     *
     * As the loop iterates, the program should keep count of the number of times the computer
     * wins and the number of times that the user wins. After the loop performs all
     * of its iterations,
     * the program should display who was the grand winner,the computer or the user.
     *
     */

    public static void main(String[] args) {


        DiceGame computer = new DiceGame();
        DiceGame user = new DiceGame();

        int computerWins = 0;
        int userWins = 0;

        System.out.printf("%1s%20s%20s%20s\n", "Round", "User Round", "Computer Round", "Who Won" );
        System.out.println();

        for (int i = 0; i < 10; i++){

            int userRound = user.getFace();
            int computerRound = computer.getFace();

            if (userRound > computerRound){
                userWins++;
            }
            if (computerRound > userRound){
                computerWins++;
            }
            if (computerRound == userRound){
                userWins = 0;
                computerWins = 0;
            }

            System.out.printf("%1s%20s%20s%26s\n", String.valueOf(i), userRound, computerRound, whoWon(userRound, computerRound));


        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Grand winner: " + whoWon(userWins, computerWins));



    }
    public static String whoWon(int usr, int c){
        String output = "";

        if (usr > c){
           output = "User Wins!";
        }
        if (c > usr){
            output = "Computer Wins!";
        }
        if (usr == c){
            output = "TIE!";
        }
        return output;
    }
    public int getFace(){


        Random random = new Random();
        int num = random.nextInt(6-1)+1;

        return num;
    }





}
