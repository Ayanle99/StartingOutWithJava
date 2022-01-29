package challenge20;

import java.util.Random;

public class CoinTossSimulator {


    /**
     *  Write a class named Coin. The Coin class should have the following fields.
     *
     *      - A String named sideUp. The sideUp field will hold either will hold
     *      either "heads" or "tails" indicating the side of the coin that is facing up.
     *
     * The Coin class should have the following methods:
     *
     *      • A non-arg constructor that calls the toss method, described next.
     *      • A void method named toss that simulates the tossing of the coin.
     *      When the toss method is called, it generates a random number in the range
     *      of 0 through 1. If the random number is 0, then it sets the sideUp field to "heads". If
     *       the random number is 1, then it sets the sideUp field to "tails".
     *
     *      • A method named getSideUp that returns the value of the sideUp field.
     *
     *
     *  Write a program that demonstrates the Coin class. The program should create
     *  an instance of the class and display the side that is initially facing up.
     *  Then, use a loop to toss the coin 20 times. Each time the coin is tossed, display the side that is facing up.
     *  The program should keep count of the number of times a head is facing up and the number of times
     *  a tail is facing up and display those values after the loop finishes.
     *
     */

    private String sideUp;

    public CoinTossSimulator(){
        toss();
    }

    public void toss(){

        Random random = new Random();
        int num = random.nextInt(2-0);

        if (num == 0){
            sideUp = "heads";
        }
        if (num == 1){
            sideUp = "tails";
        }


    }
    public String getSideUp(){

        return sideUp;
    }

}

