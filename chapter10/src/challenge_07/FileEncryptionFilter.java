package challenge_07;


import java.io.*;
import java.util.Scanner;
/**

 Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */
public class FileEncryptionFilter {

    public static void main(String[] args) {
        
        
        // Read text file
        // Encrypt the file
        // Write a new File

        try {

            // open the text file

            String filePath_1 = "src/challenge_07/file_1.txt";
            String filePath_2 = "src/challenge_07/file_2.txt";

            Scanner sc = new Scanner(new File(filePath_1));
            StringBuilder sb = new StringBuilder();

            while (sc.hasNext()){
                sb.append(sc.nextLine());
            }

           // encrypt the file

            String line = "";

            for (int i = 0; i < sb.length();i++){

                char ch = sb.toString().charAt(i);
                line += ((char) (ch + 10) );

            }

            // write a file

            FileWriter fw = new FileWriter(filePath_2);
            fw.write(line);

            fw.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
    }


}
