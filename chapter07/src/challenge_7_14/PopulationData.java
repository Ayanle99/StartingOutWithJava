package challenge_7_14;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */
public class PopulationData {

    static DecimalFormat df = new DecimalFormat("#,###.00");
    static int[] changes = new int[40];

    public static void main(String[] args) {

        ArrayList<Integer> population = getPopulation();

        int total = 0;
        int lowestYear = changes[1];
        int greatestYear = changes[0];

        int year1 = 0, year2 = 0;

        for(int i = 0; i < changes.length;i++ ){
            System.out.println((i+1) + "\t" + df.format(changes[i]));
        }

        for (int i = 1; i< changes.length;i++){
            total += changes[i];

            if (changes[i] > greatestYear){
                greatestYear = changes[i];
                year1 = i;
            }
            if (changes[i] < lowestYear){
                lowestYear = changes[i];
                year2 = i;
            }
        }

        System.out.println("\nAverage: " + df.format(total/changes.length)
        +"\nLowest Change: " + df.format(lowestYear) + "\t from the year " + (1950 + year2) + " to " + (1950 + (year2+1))
        +"\nGreatest Change: " + df.format(greatestYear)
        +"\t from " + (1950 + year1) + " to " + (1950 + (year1-1)));

    }

    private static ArrayList<Integer> getPopulation() {

        ArrayList<Integer> population = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(new File("/Users/max/IdeaProjects/chapter07/src/USPopulation.txt"));

            while (scanner.hasNext()){
                population.add(scanner.nextInt());
            }


        }catch (Exception e){
            System.out.println(e.toString());
        }

        for (int i = 1; i < population.size();i++){

            int diff = population.get(i) - population.get(i-1);
            changes[i] = diff;

        }

        return population;
    }


}
