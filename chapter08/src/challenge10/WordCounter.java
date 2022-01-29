package challenge_8_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {

      try {

          String filePath = "src/challenge_8_10/";

          Scanner keyboard = new Scanner(System.in);

          System.out.print("Enter a file name: ");
          String name = keyboard.nextLine();

          filePath += name;

          Scanner scanner  = new Scanner(new File(filePath));

          ArrayList<String > words = new ArrayList<>();

          while (scanner.hasNext()){
              String line = scanner.nextLine();
              words.add(line);

          }

          String[] parts = words.get(0).split(" ");

          for (String word : parts){
              System.out.println(word);
          }
          System.out.println("\nTotal words: " + parts.length);

      }catch (FileNotFoundException e){
          System.out.println(e.toString());
      }
    }
}
