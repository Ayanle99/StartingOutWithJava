package challenge_06;

/**

 Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */
public class Main {


    public static void main(String[] args) {


        String filePath = "src/challenge_06/Numbers.dat";

        int[] numbers = {10, 100, 1000, 3000};

        FileArray.readArray(filePath, numbers);


    }
}
