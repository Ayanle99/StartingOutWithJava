package challenge_7_16;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */
public class Main {

    public static void main(String[] args) {


        int[][] arr = {

                {1, 2, 3, 4, 5},
                {20, 1200, 40, 50}
        };

        System.out.println("Total: " + TwoDArrayOperations.getTotal(arr)
        +"\nAverage: " + TwoDArrayOperations.getAverage(arr)
        +"\nTotal Row: " + TwoDArrayOperations.getRowTotal(arr, 1)
        +"\nTotal Column: " + TwoDArrayOperations.getColumnTotal(arr, 1)
        +"\nHighest in Row: " + TwoDArrayOperations.getHighestInRow(arr, 1)
        +"\nLowest in Row: " + TwoDArrayOperations.getLowestInRow(arr, 1));

    }
}
