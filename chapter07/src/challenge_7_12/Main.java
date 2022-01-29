package challenge_7_12;

import java.io.File;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */


public class Main {

    static String filePath = "src/challenge_7_12/Numbers.txt";


    public static void main(String[] args) {


        NumberAnalysis num = new NumberAnalysis(new File(filePath));

        System.out.println("Total: " + num.getTotal()
        +"\nAverage: " + num.getAverage()
        +"\nHighest: " + num.getHighest()
        +"\nLowest: " + num.getLowest());


    }


}
