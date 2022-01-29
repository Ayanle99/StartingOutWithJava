package challenge_7_08;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeBook {


    private char[] letterGrade = {'A', 'B', 'C', 'D','F'};
    private ArrayList<String> names = new ArrayList<>();
    private double[][] scores = new double[5][4];

    public GradeBook(ArrayList<String> studentNames, double[][] studentScores){

        this.names = studentNames;

        for (int i = 0; i < 5;i++){
            for (int j =0; j < 4;j++){
                scores[i][j] = studentScores[i][j];
            }
        }
    }

    public void dropTheLowestScore(){

        DecimalFormat df = new DecimalFormat("#,###.00");

        for (int i = 0; i < 5;i++){

            System.out.println("Student #" + (i+1));
            System.out.println("\t\tName: " + names.get(i));
            System.out.println();

            double total = 0;
            double lowest = Arrays.stream(scores[i]).min().getAsDouble();

            for (int j =0; j < 4; j++){

                if (lowest != scores[i][j]){

                    total += scores[i][j];
                    System.out.println("\t\tScore: " + scores[i][j]);
                }else {
                    System.out.println("\t\tScore: " + scores[i][j] + " (dropped)");
                }


            }

            double avg = (total / 3);

            System.out.println("\t\tAverage: " + df.format(avg)
            +"\n\t\tLetter Grade: " + getLetterGrade(avg));
            System.out.println();

        }



    }


    public double[][] getScores() {
        return scores;
    }

    public String getName(int studentIndex){
        return names.get(studentIndex);
    }

    public double getAverage(int studentIndex){

        double total = 0;

        for (int i = 0; i < 4;i++){

            total += scores[studentIndex][i];
        }

        return (total / 4);
    }
    public char getLetterGrade(double avgScore){

        if (avgScore >= 90 && avgScore <= 100){
            return letterGrade[0];
        }
        else if (avgScore >= 80 && avgScore <= 89){
            return letterGrade[1];
        }
        else if (avgScore >= 70 && avgScore <= 79){
            return letterGrade[2];
        }
        else if (avgScore >= 60 && avgScore <= 69){
            return letterGrade[3];
        }
        else if (avgScore >= 0 && avgScore <= 59){
            return letterGrade[4];
        }

        return ' ';
    }
    public void getStudents(){

        for (int i =0; i < names.size();i++){

            System.out.println("\nStudent #" +(i+1)
            +"\n\t\tName: " + names.get(i)
            +"\n\t\tAverage: " + getAverage(i) + "%"
            +"\n\t\tLetter Grade: " + getLetterGrade(getAverage(i))
            +"\n\n");

        }

    }


}
