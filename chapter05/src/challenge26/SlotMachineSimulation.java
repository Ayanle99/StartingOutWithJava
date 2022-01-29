package challenge26;

import java.util.*;

public class SlotMachineSimulation {


    /**
     *   A slot machine is a gambling device that the user insertss money into and then pulls a lever
     *   (or presses a button). The slot machine then displays a set of random images. If two or more
     *   of the images match, the user wins an amount of money that the slot machine dispenses
     *   back to the user.
     *
     *   Create a program that simulates a slot machine. When the program runs, it should do the
     *   following.
     *
     *   1) Ask the user to enter the amount of money he or she wants to enter into the slot
     *   machine.
     *   2) Instea of displaing images, have the program randomly select a word from the followiing list.
     *
     *      Cherries, Oranges, Plums, Bells, Melons, Bars
     *
     *   To select a word, the program can generate a random number in the range of 0
     *   through 5. If the number is 0, the selected word is Cherries, if the number is 1, the
     *   selected word is Oranges, and so forth. The program should randomly select a word
     *   from this list three times and display all three of the words.
     *
     *   If none of the randomly selected words match, the program informs the user that he
     *   or she has won $0. If two of the words match, the program informs the user that he or she
     *   won two times the amount entered. If three of the words match, the program informs the user
     *   that he or she has won three times the amount entered.
     *
     *   The program asks if the user wants to play again. If so, these  steps are repeated. If not,
     *   the program displays the total amount of money entered into the slot machine and the
     *   total amount won.
     *
     */


    static String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
    static Scanner sc = new Scanner(System.in);
    static int amount;

    public static void main(String[] args) {

        // 1) Enter money to play
        // 2) generate three random words from an array
        // 3) if 2 of the words match, you win double, if 3 match you win triple
        // 4) If none of them match you win $0
        // 5) Ask the user to play it again.

        getWords();


    }
    private static void getWords(){
        String again = "";

        do {

            Random random = new Random();

            System.out.println("Amount to enter to the slot machine: ");
            amount = sc.nextInt();

            String word_1 = words[random.nextInt(words.length)];
            String word_2 = words[random.nextInt(words.length)];
            String word_3 = words[random.nextInt(words.length)];

            sc.nextLine();
            System.out.println("Word 1: "+word_1+"\nWord 2: "+word_2+"\nWord 3: "+word_3);
            System.out.println(calculateWinning(word_1, word_2, word_3));
            System.out.print("Do you want to play again? (type n to quit). ");
            again = sc.nextLine();

        }while (!again.equalsIgnoreCase("n"));


    }

    private static String calculateWinning(String w1,String w2, String w3){

        String won = "";

        System.out.println();

        boolean word_1 = (w1.equalsIgnoreCase(w2) || w1.equalsIgnoreCase(w3));
        boolean word_2 = (w2.equalsIgnoreCase(w1) || w2.equalsIgnoreCase(w3));
        boolean word_3 = (w3.equalsIgnoreCase(w1) || w3.equalsIgnoreCase(w2));
        boolean none =   ((!w1.equalsIgnoreCase(w2)) && (!w1.equalsIgnoreCase(w3)));

        boolean allEqual = (w1.equalsIgnoreCase(w2)
                         && w1.equalsIgnoreCase(w3)
                         && w2.equalsIgnoreCase(w3));

        if (word_1 || word_2 || word_3){
            won = "You won $"+ String.valueOf(amount*2);
        }
        if (allEqual){
            won = "You won $"+ String.valueOf(amount*3);
        }
         if (none){
            won = "You won $0";
        }

        return won;
    }





}
