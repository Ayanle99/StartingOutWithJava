package challenge03;

import challenge02.DistanceTraveled;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DistanceFile {

    /**
     * Modify the program you wrote for programming Challange 2 ( Distance Traveled )
     * so it writes the report to a file instead of the screen.
     * Open the file in Notepad or another texteditor to confirm output.
     */

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed: ");
        int speed = scanner.nextInt();
        while (speed <= 0){
            System.out.println("Error: Enter the speed: ");
            speed = scanner.nextInt();
        }
        System.out.println("Enter the hours: ");
        int hours = scanner.nextInt();
        while (hours <= 0){
            System.out.println("Error: Enter hours: ");
            hours = scanner.nextInt();
        }

        DistanceTraveled distanceTraveled = new DistanceTraveled(speed, hours);

        String format = "%-20s%s\n";

        FileWriter fw = new FileWriter("src/challenge03/travels.txt");

        fw.write(String.format(format, "Hours", "Distance Traveled"));
        for (int i = 1; i <= hours;i++){
           fw.write(String.format(format, String.valueOf(i), String.valueOf(i* speed)));
        }

        fw.close();


    }
}
