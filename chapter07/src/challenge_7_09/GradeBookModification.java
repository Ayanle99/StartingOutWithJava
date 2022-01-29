package challenge_7_09;

import challenge_7_08.GradeBook;

import java.util.ArrayList;

public class GradeBookModification {


    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("Mike");
        names.add("Sarah");
        names.add("Max");
        names.add("James");
        names.add("Gufran");

        double[][] scores = {

                {33, 88, 100, 99},
                {77, 88, 55, 99},
                {99,99,77,100},
                {88,88,77,60},
                {30,55,99,100}
        };

        GradeBook gradeBook = new GradeBook(names, scores);

        gradeBook.dropTheLowestScore();




    }
}
