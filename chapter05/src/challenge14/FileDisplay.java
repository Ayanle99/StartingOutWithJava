package challenge14;

import java.io.File;
import java.util.Scanner;

public class FileDisplay {

    /**
     * Write a class named challenge14.FileDisplay with the following methods;
     *
     * a -> Constructor: The class constructor should take the name of a
     * file as an argument.
     *
     * 1: DisplayHead: The method should display only the five lines of
     * the file's contents.If the file contains less than five lines, it should
     * display the file's entire contents.
     *
     * 2: Display Contents: This method should display the entire contents of
     * the file, the name of which was passed to the constructor.
     *
     * 3: DisplayWithLineNumbers: This method should display the contents of the
     * file, the name of which was passed to the constructor. Each line should be
     * preceeded with a line number followed by a colon. The line numbering should
     * start with 1.
     *
     */

    private File file;

    public FileDisplay(String filename){
        this.file = new File(filename);

    }
    public void displayHead(){
        try {
            Scanner scanner = new Scanner(file);
            int counter = 0;
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                counter++;
                if (counter <= 5){
                    System.out.println(counter + "\t\t" + data);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void diisplayContent(){

        try {
            Scanner scanner = new Scanner(file);
            int counter = 0;
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                counter++;
                System.out.println(counter + "\t\t" + data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void displayWithLineNumbers(){
        try {
            Scanner scanner = new Scanner(file);
            int counter = 0;
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                counter++;
                System.out.println(counter + "\t\t" + data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        FileDisplay fileDisplay = new FileDisplay("src/challenge15/textFile.txt");
        fileDisplay.displayWithLineNumbers();
    }

}
