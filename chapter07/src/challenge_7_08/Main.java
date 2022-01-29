package challenge_7_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        double[][] scores = new double[5][4];

        for (int i =0; i < 5;i++){
            System.out.print("Student #"+(i+1) + " name: ");
            names.add(scanner.nextLine());
            System.out.println();
            for (int j =0; j<4;j++){

                System.out.print("\t\tScore #" +(j+1) +": ");
                double score = scanner.nextDouble();
                scores[i][j] = score;

                while (score < 0 || score > 100){
                    System.out.print("Error: score can only be  between 0 and 100: ");
                    score = scanner.nextDouble();
                }
                scanner.nextLine();
                System.out.println();
            }
        }

        GradeBook gradeBook = new GradeBook(names, scores);

        gradeBook.getStudents();



    }



}
