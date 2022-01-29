package challenge_7_20;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 *
 *
 *
 */
public class LoShuMagicSquare {

    public static void main(String[] args) {

        int[][] nums = {

                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6}
        };

        int[][] notValid = {

                {4, 9, 2},
                {3, 11, 7},
                {8, 1, 6}
        };

        if (isMagicSquare(notValid)){
            System.out.println("It is a magic square.");
        }else {
            System.out.println("It is NOT A MAGIC SQUARE.");
        }

    }
    public static boolean isMagicSquare(int[][] arr){

        int firstTotal = 0, secondTotal =0, thirdTotal = 0;

        for (int row = 0; row < arr.length;row++){

            int firstColumn = arr[row][0];
            int secondColumn = arr[row][1];
            int thirdColumn = arr[row][2];


            firstTotal += firstColumn;
            secondTotal += secondColumn;
            thirdTotal += thirdColumn;

        }


        return firstTotal == 15 && secondTotal == 15 && thirdTotal == 15;

    }
}
