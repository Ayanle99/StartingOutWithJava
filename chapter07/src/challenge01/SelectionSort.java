package challenge_7_01;

public class SelectionSort {

    public static void main(String[] args) {


        int[] arr = {

                99, 44, 1, -3, 122, 22, 55, 11
        };

        for (int num : arr){
            System.out.print(num + "\t");
        }

        System.out.println();

        System.out.println("_______________________________");

        for (int num : sort(arr)){
            System.out.print(num + "\t");
        }


    }
    public static int[] sort(int[] arr){


        for (int i = 0; i < (arr.length-1); i++){

            int index = i;

            for (int j = i+1; j< arr.length;j++){

                if (arr[j] < arr[index]){
                    index = j;
                }

            }

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }

        return arr;

    }
}
