package challenge_7_17;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */
public class SearchBenchmarks {

    public static void main(String[] args) {


        int[] arr = {

                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20

        };

        double binaryAvg = 0;
        double sq_avg = 0;

        for (int i = 0; i < arr.length;i++){

            System.out.println("Number to be searched is: " + arr[i]);
            System.out.println("It took " + binarySearch(arr, arr[i]) + " times for BINARY." +
                    "\nAnd it took "+sequentialSearch(arr, arr[i]) + " times for SEQUENTIAL SEARCH.\n\n");

            binaryAvg += binarySearch(arr, arr[i]);
            sq_avg += sequentialSearch(arr, arr[i]);

            if (i >= 4){
                break;
            }

        }

        System.out.println("\n_____________________________\n");

        System.out.println("Binary Average: " + (binaryAvg/5)
        +"\nSequential Average: " + (sq_avg/5));

    }
    private static int sequentialSearch(int[] arr, int value){
        int counter = 0;
        for (int i = 0; i < arr.length;i++){
            counter++;
            if (arr[i] == value){
                return counter;
            }
        }
        return counter;
    }
    private static int binarySearch(int[] arr, int value){

        int first = 0, last = arr.length;
        int middle;
        boolean found = false;
        int counter = 0;

        while (!found && first <= last){

            middle = (first+last) / 2;

            counter++;

            if (arr[middle] == value){
                found = true;
                return counter;
            }else if (arr[middle] > value){
                last = middle -1;
            }else {
                first = middle + 1;
            }

        }

        return counter;
    }
}
