package challenge23;

import challenge22.DiceGame;

import java.util.Scanner;

public class FishingGameSimulator {

    /**
     *
     * Write a program that uses the challenge24.Dice class that was presented in Chapter 4 to simulate a fish
     * ing game. In the game, a six sided die is rolled to determine what the user has caught. Each
     * possible item is worth a certain number of fishing points. The points will remain hidden
     * untiil the user is finished fishing, and then a message is displayed congratulating the user
     * depending on the number of fishing points gained.
     *
     * Here are some suggestioins for the game's design:
     *
     * 1) Each round of the game is performed as an iteration of a loop that repeats as long as
     * the player wants to fish for more items.
     * 2) At tje beginning of each round, the program will ask the user whether or not they
     * want to continue fishing.
     * 3) The program simulates the rolling of a six-sided die, ( Use the Die class that was demonstrated in Chapter 4.)
     *
     * 4) Each item that can be caught is represented by a number generated from the die. For
     * example, 1 for "a huge fiish", 2 for "an old shoe", 3 for "a little fish", and so on.
     * 5) Each item the user catches is worth a different amount of points.
     * 6) The loop keeps a runing total of the user's fishing points.
     * 7) After the loop has finished, the total number of fishing points
     * is displayed, along with a message that varies depending on the number of points earned.
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String quit = "";
        int total = 0;

        do {

            System.out.print("Want to continue ( enter q to quit) : ");
            quit = scanner.nextLine();

            DiceGame diceGame = new DiceGame();
            int num = diceGame.getFace();

            switch (num){

                case 1:
                    System.out.println("A huge fish");
                    total += 100;
                    break;

                case 2:
                    System.out.println("A little fish");
                    total += 50;
                    break;

                case 3:
                    System.out.println("An old shoe");
                    total += 0;
                    break;

                case 4:
                    System.out.println("A ring");
                    total += 30;
                    break;

                case 5:
                    System.out.println("A small rock");
                    total += 0;
                    break;

                case 6:
                    System.out.println("Plastic!");
                    total += 0;
                    break;

                default:
            }


        }while (!quit.equalsIgnoreCase("q"));


        System.out.println();

        System.out.println("Grand total: " + total);


    }

}
