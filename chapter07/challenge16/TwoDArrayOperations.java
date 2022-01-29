package challenge_7_16;

public class TwoDArrayOperations {


    public static double getTotal(int[][] arr){

        double total = 0;

        for (int i = 0; i < arr.length;i++){

            for (int j = 0; j < arr[i].length;j++){
                total += arr[i][j];
            }


        }
        return total;
    }

    public static double getAverage(int[][] arr){

        double total = 0;
        double counter = 0;

        for (int i = 0; i < arr.length;i++){

            for (int j = 0; j < arr[i].length;j++){
                total += arr[i][j];
                counter++;
            }


        }
        return total / counter;
    }

    public static double getRowTotal(int[][] arr, int index){

        int[] temp = arr[index];
        double total = 0;

        for (int i = 0; i < temp.length;i++){

            total += temp[i];

        }
        return total;
    }

    public static double getColumnTotal(int[][] arr, int index){


        double total = 0;

        for (int i = 0; i < arr.length;i++){

            total += arr[i][index];

        }
        return total;
    }

    public static double getHighestInRow(int[][] arr, int index){

        int[] temp = arr[index];
        double max = temp[0];

        for (int num : temp){
            if (num > max){
                max = num;
            }

        }
        return max;
    }

    public static double getLowestInRow(int[][] arr, int index){

        int[] temp = arr[index];
        double min = temp[0];

        for (int num : temp){
            if (num < min){
                min = num;
            }

        }
        return min;
    }



}
