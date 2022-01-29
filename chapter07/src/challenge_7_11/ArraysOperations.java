package challenge_7_11;

public class ArraysOperations {


    // getTotal()

    public static void getTotal(int[] arr){

        int total = 0;

        for (int i =0;i<arr.length;i++){
            total += arr[i];
        }
        System.out.println("The total is: " + total);
    }

    public static void getTotal(float[] arr){

        float total = 0;

        for (int i =0;i<arr.length;i++){
            total += arr[i];
        }
        System.out.println("The total is: " + total);
    }

    public static void getTotal(double[] arr){

        double total = 0;

        for (int i =0;i<arr.length;i++){
            total += arr[i];
        }
        System.out.println("The total is: " + total);
    }

    public static void getTotal(long[] arr){

        long total = 0;

        for (int i =0;i<arr.length;i++){
            total += arr[i];
        }
        System.out.println("The total is: " + total);
    }

    // getAverage()
    public static void getAverage(int[] arr){

        int total = 0;

        for (int i =0; i<arr.length;i++){
            total += arr[i];
        }
        System.out.println("The average is: " + (total/arr.length));
    }
    // getHighest()
    public static void getHighest(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("The highest number is: " + max);
    }
    // getLowest();
    public static void getLowest(int[] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The lowest number is: " + min);
    }
}
