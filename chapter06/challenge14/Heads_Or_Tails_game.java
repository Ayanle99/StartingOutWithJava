package challenge14;


public class Heads_Or_Tails_game {

    /**
     *  This game is meant for two or more players. In this game, the players take turns flipping a
     *  coin. Before the coin is flipped, players should guess if the coin will land headsup or tailsup.
     *  If player guesses correctly, then that player is awarded a point.
     *  If the player guesses incorrectly, the player loses a point.
     *  The first player to score five points is the winner.
     *
     *  Write a program that simulates the game being played by two players. Use the Coin class
     *  that you wrote as an assignment in Chapter 5 ( Programming Challenge 20) to simulate the
     *  coin. Write a Player class to simulate the players.
     *
     */

    public static void main(String[] args) {

        Players players = new Players();
        players.startGame();

    }
}
