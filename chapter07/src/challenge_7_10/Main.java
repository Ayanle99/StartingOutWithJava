package challenge_7_10;

import java.util.ArrayList;
import java.util.Scanner


/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */        ;

public class Main {


    public static void main(String[] args) {


        int[] userNumbers = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5;i++) {
            System.out.print("Enter #" + (i+1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        LotteryApplication app = new LotteryApplication();

        ArrayList<Integer> result = app.checkNumbers(userNumbers);

        System.out.println("\nThe indexes that matched are: " + result);




    }
}
