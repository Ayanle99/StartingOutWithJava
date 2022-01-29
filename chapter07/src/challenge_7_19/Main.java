package challenge_7_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */

public class Main {

    public static void main(String[] args) {


        ArrayList<TriviaGame> triviaGames = new ArrayList<>();

        triviaGames.add(new TriviaGame("What is the capital city of Alabama?",
                "1) Montgomery",
                "2) Little Rock",
                "3) Dover",
                "4) None of the above",
                1));

        triviaGames.add(new TriviaGame("What is the capital City of Alaska?",
                "1) Frankfort",
                "2) Topeka",
                "3) Hartford",
                "4) Juneau",
                4));

        triviaGames.add(new TriviaGame("What is the capital city of Arizona?",
                "1) Albany",
                "2) Pheonix",
                "3) Pierre",
                "4) Salem",
                2));


        triviaGames.add(new TriviaGame("What is the capital city of Arkansas?",
                "1) Nashvile",
                "2) Austin",
                "3) Little Rock",
                "4) Olympia",
                3));

        triviaGames.add(new TriviaGame("What is the capital city of California?",
                "1) Des Moines",
                "2) Lansing",
                "3) Sacramento",
                "4) Concord",
                3));


        triviaGames.add(new TriviaGame("What is the capital city of Colorado?",
                "1) Denver",
                "2) Boise",
                "3) Atlanta",
                "4) Indianapolis",
                1));

        triviaGames.add(new TriviaGame("What is the capital city of Connecticut?",
                "1) Annapolis",
                "2) Helena",
                "3) Hartford",
                "4) Saint Paul",
                3));

        triviaGames.add(new TriviaGame("What is the capital city of Delaware?",
                "1) Dover",
                "2) Carson City",
                "3) Lincoln",
                "4) Jackson",
                1));
        triviaGames.add(new TriviaGame("What is the capital city of Florida?",
                "1) Cheyenne",
                "2) Madison",
                "3) Richmond",
                "4) Tallahassee",
                4));
        triviaGames.add(new TriviaGame("What is the capital city of Georgia?",
                "1) Atlanta",
                "2) Boston",
                "3) Trenton",
                "4) Montpelier",
                1));


        Collections.shuffle(triviaGames);

        Scanner scanner = new Scanner(System.in);

        double player_1 = 0, player_2 = 0;

        for (int i = 0; i < 2; i++){

            System.out.println("\nPlayer #" + (i+1));
            System.out.println();

            double total = 0;

            for (int j = 0; j < triviaGames.size();j++){

                System.out.println(triviaGames.get(j).getQuestion()
                +"\n\n"+triviaGames.get(j).getOption_1() +
                        "\n"+triviaGames.get(j).getOption_2()
                +"\n"+triviaGames.get(j).getOption_3()
                +"\n"+triviaGames.get(j).getOption_4());

                System.out.println("\nYour answer: ");

                int answer = scanner.nextInt();

                if (triviaGames.get(j).getCorrectAnswer() == answer){
                    System.out.println("Correct!");
                    total += 1;
                }else
                {

                    switch (triviaGames.get(j).getCorrectAnswer()){

                        case 1:
                            System.out.println("Wrong! Option " + triviaGames.get(j).getOption_1() + " was correct!");
                            break;

                        case 2:
                            System.out.println("Wrong! Option " + triviaGames.get(j).getOption_2() + " was correct!");
                            break;

                        case 3:
                            System.out.println("Wrong! Option " + triviaGames.get(j).getOption_3() + " was correct!");
                            break;

                        case 4:
                            System.out.println("Wrong! Option " + triviaGames.get(j).getOption_4() + " was correct!");
                            break;

                        default:


                    }

                }

                if (i == 0){
                    player_1 = total;
                }else if (i == 1){
                    player_2 = total;
                }


            }


        }

        System.out.println();

        System.out.println("Player #1's Total points: "+player_1
        +"\nPlayer #2's Total Points: " + player_2);

        if (player_1 > player_2){
            System.out.println("PLayer #1 won.");
        }else if (player_2 > player_1){
            System.out.println("Player #2 won.");
        }else {
            System.out.println("It is a draw.");
        }

    }
}
