package challenge_7_15;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */

public class WorldSeriesChampions {


    public static void main(String[] args) {


        try {

            Scanner scanner = new Scanner(new File("src/challenge_7_15/WorldSeriesWinners.txt"));

            ArrayList<String> champions = new ArrayList<>();

            while (scanner.hasNext()){
                champions.add(scanner.nextLine());
            }

            Scanner keyboard = new Scanner(System.in);


            System.out.println("Please enter a team name: ");
            String team = keyboard.nextLine();

            int counter = 0;
            int year = 1903;

            System.out.printf("%1s%30s%20s\n", "Year", "Team", "Winning Counter");
            System.out.println();

            for (int i = 0; i < champions.size();i++){

                if (champions.get(i).contains(team)){
                    counter++;
                    System.out.printf("%1s%25s%20s\n", (year + i), champions.get(i), counter);

                }
            }

            System.out.println();
            System.out.println(team + " has won (" + counter + ") times in the period of 1903-2009 in World Series Championships.");



        }catch (Exception e){
            System.out.println(e.toString());
        }



    }
}
