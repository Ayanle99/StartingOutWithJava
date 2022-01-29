package challenge_7_10;

import java.util.ArrayList;
import java.util.Random;

public class LotteryApplication {

    private int[] lotteryNumbers = new int[5];

    public LotteryApplication(){

        Random random = new Random();

        for (int i =0; i < 5;i++){
            lotteryNumbers[i] = random.nextInt(10);
        }
        System.out.println();
    }

    public int[] getLotteryNumbers() {
        return lotteryNumbers;
    }
    public ArrayList<Integer> checkNumbers(int[] picks){

        ArrayList<Integer> indexes = new ArrayList<>();

        int counter = 0;
        boolean match;


        System.out.printf("%1s%20s\n", "Your Numbers", "Winning Numbers");
        System.out.println();

        for (int i = 0; i < 5;i++){

            match = false;

            if (picks[i] == lotteryNumbers[i]){

                match = true;
                counter++;
                indexes.add(i);

                System.out.printf("%1s%19s%5s\n", picks[i], lotteryNumbers[i], (match ? " (match)" : " (no match)") );

            }else {

                System.out.printf("%1s%19s\n", picks[i], lotteryNumbers[i]);
            }

        }

        if (counter == 5){
            System.out.println("You win the grand prize!");
        }

        return indexes;

    }
}
