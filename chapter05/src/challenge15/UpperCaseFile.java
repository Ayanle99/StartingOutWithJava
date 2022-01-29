package challenge15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpperCaseFile {

    /**
     *   Write a class named challenge15.UpperCaseFile. The class's constructor should
     *   accept two file names as arguments. The first file should be opened
     *   for reading and the second file should be opened for writing.
     *   The class should read the contents of the first file, change all
     *   characters to uppercase, and store the results in the second file.
     *   the second fiile will be a copy of the first file, except all the
     *   characters will be uppercase. Use notepad or another text ediitor to
     *   create a simple file that can be used to test the class.
     *
     */

    private File firstFile;
    private File secondFile;

    public UpperCaseFile(String ff, String sf){
        this.firstFile = new File(ff);
        this.secondFile = new File(sf);
    }
    public String openFirstFile(){

        String line = "";

        try {

            Scanner scanner = new Scanner(firstFile);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                line += data + "\n";
            }
            scanner.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        return line;
    }

    public void openSecondFile(){
        try {
            String data = openFirstFile();
            PrintWriter writer = new PrintWriter(secondFile, "UTF-8");
            writer.println(data.toUpperCase());
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        UpperCaseFile upperCaseFile = new UpperCaseFile("src/challenge15/textFile.txt", "src/challenge15/secondFile.txt");
        upperCaseFile.openSecondFile();

    }
}
