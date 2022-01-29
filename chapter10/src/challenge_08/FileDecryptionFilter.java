package challenge_08;

import java.io.File;
import java.io.FileWriter;
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
public class FileDecryptionFilter {

    static String filePath = "src/challenge_08/file_2.txt";
    static String f2 = "src/challenge_08/file_3.txt";



    public static void main(String[] args) {


        try {

            // open the file
            Scanner sc = new Scanner(new File(filePath));
            StringBuilder sb = new StringBuilder();

            while (sc.hasNext()){
                sb.append(sc.nextLine());
            }

            String line = "";

            for (int i = 0; i < sb.length();i++){
                char ch = sb.toString().charAt(i);
                line += ((char) (ch - 10));
            }

            // write new file

            FileWriter fw = new FileWriter(f2);
            fw.write(line);

            fw.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
