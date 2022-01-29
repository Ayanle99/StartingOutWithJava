package challenge14;

import java.util.Random;

public class Coin {

    private String sideUp;
    private Random rand = new Random();

    public Coin() {
        toss();
    }

    public void toss() {

        /**
         * Generate a random number between 0 and 2 (exclusive)
         */
        int randomNumber = rand.nextInt(2);

        if (randomNumber == 0) {
            // set the sideUP string to heads
            this.sideUp = "heads";
        } else {
            // or set the sideUp string to tails
            this.sideUp = "tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }
}
