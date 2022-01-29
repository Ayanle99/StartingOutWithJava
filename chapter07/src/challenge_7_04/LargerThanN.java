package challenge_7_04;

public class LargerThanN {


    public static void main(String[] args) {

        int[] arr = new int[100];

        for (int i = 0; i < arr.length;i++){
            arr[i] = i;
        }

        LargerThanN largerThanN = new LargerThanN();
        largerThanN.getArray(arr, 75);


    }

    private  void getArray(int[] arr, int index){

        for (int i = index; i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
