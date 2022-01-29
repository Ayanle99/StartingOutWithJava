package challenge_06;

import java.io.*;

public class FileArray {


    public static void writeArray(String filePath, int[] nums){


        try{

            DataOutputStream output =
                    new DataOutputStream(new FileOutputStream(filePath));

            for (int num : nums){
                output.writeInt(num);
            }

            output.close();
            System.out.println("\nDone.");


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void readArray(String filePath, int[] nums){

        int numbers;
        boolean isEndFile = false;

        try {

            DataInputStream input = new DataInputStream(new FileInputStream(filePath));

            while (!isEndFile){

                try {

                    numbers = input.readInt();
                    System.out.print(numbers + " ");

                }catch (EOFException e){
                    isEndFile = true;
                }

            }

            input.close();
            System.out.println("\nFinished.");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }






    }
}
