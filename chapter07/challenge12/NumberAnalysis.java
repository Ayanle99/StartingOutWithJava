package challenge_7_12;

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
public class NumberAnalysis {

    private ArrayList<Integer> numbers = new ArrayList<>();

    public NumberAnalysis(File file){

        file = new File("src/challenge_7_12/Numbers.txt");

        try {

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){

                numbers.add(scanner.nextInt());
            }


        }catch (Exception e){
            System.out.println(e.toString());
        }

    }

    public int getTotal(){

        int total = 0;

        for (int i =0; i < numbers.size();i++){
            total += numbers.get(i);
        }
        return total;
    }


    public int getAverage(){

        int total = 0;

        for (int i =0; i < numbers.size();i++){
            total += numbers.get(i);
        }
        return (total/numbers.size());
    }


    public int getHighest(){

        int max = numbers.get(0);

        for (int i =0; i < numbers.size();i++){

            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }


    public int getLowest(){

        int min = numbers.get(0);

        for (int i =0; i < numbers.size();i++){
           if (numbers.get(i) < min){
               min = numbers.get(i);
           }
        }
        return min;
    }

}
