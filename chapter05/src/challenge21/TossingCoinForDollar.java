package challenge21;

import challenge20.CoinTossSimulator;

public class TossingCoinForDollar {

    /**
     *
     *    For this assignment you will create a game program using the coin
     *    class from Programming Challange 20. The program should have three
     *    instances of the Coinn class: one repressing a quarter, one repressenting
     *    a dime, and one repressenting a nickel.
     *
     *
     *    When the begins, your starting balance is $0. During each round of the
     *    game, the program will toss the simulated coins. When a coin is tossed the value of the coin is added
     *    to your balance if it lands heads up. For example, if the quarter lands
     *    heads-up, 25 cents is added to your balance. Nothing is added to your balance
     *    for coins that land tails up. The game is over when your balance reaches
     *    one dollar or more.If your balance is exactly one dollar, you win the game. You lose the game if your balance exceeds one dollar.
     *
     */

    static double QUARTER = 0.25;
    static double DIME = 0.10;
    static double NICLE = 0.05;
    static double LIMIT = 1.00;

    public static void main(String[] args) {


        CoinTossSimulator quarter = new CoinTossSimulator();
        CoinTossSimulator dime = new CoinTossSimulator();
        CoinTossSimulator nicle = new CoinTossSimulator();

        double balance = 0.0;

        while (balance < LIMIT){

            quarter.toss();
            dime.toss();
            nicle.toss();

            if (isHeadsUp(quarter)){
                balance += QUARTER;
            }
            if (isHeadsUp(dime)){
                balance += DIME;
            } if (isHeadsUp(nicle)){
                balance += NICLE;
            }

        }

        System.out.printf("Your Balance is: $%.2f\n", balance);

        if (balance == LIMIT){
            System.out.println("You win.");
        }
        if (balance > LIMIT){
            System.out.println("You Lose.");
        }

    }
    public static boolean isHeadsUp(CoinTossSimulator coin){

        if (coin.getSideUp().equals("heads")){
            return true;
        }
        else {
            return false;
        }


    }


}
