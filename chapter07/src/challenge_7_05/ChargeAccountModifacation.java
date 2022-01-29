package challenge_7_05;

import java.io.File;
import java.util.Scanner;

public class ChargeAccountModifacation {

    static String filePath = "src/challenge_7_05/valid_account_numbers";


    public static void main(String[] args) {

        try {

            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }



        }catch (Exception e){
            System.out.println(e.toString());
        }




    }

}
