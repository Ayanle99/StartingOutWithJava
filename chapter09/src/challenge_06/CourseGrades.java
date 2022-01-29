package challenge_06;


import challenge_05.FinalExam;
import challenge_05.GradedActivity;
import challenge_05.PassFail;

import java.text.DecimalFormat;


/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */

public class CourseGrades implements Analyzable {


    GradedActivity lab;
    PassFail passFail;
    GradedActivity essay;
    FinalExam finalExam;

    GradedActivity[] grades = new GradedActivity[4];


    public void setLab(GradedActivity lab) {

        grades[0] = lab;
    }

    public void setPassFail(PassFail passFail) {
        grades[1] = passFail;
    }

    public void setEssay(GradedActivity essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("##.#");

        String letterGrade = "";

        double percentage = 0;
        int index = 0;

        String[] testNames = {

                " (Lab test)", " (Pass/Fail test)",
                " (Essay test)", " (Final Exam)"
        };


        for (GradedActivity activity : grades){

            percentage = activity.getPercantage();


            if (percentage >= 90){
                letterGrade = "A";

            }else if (percentage >= 80){
                letterGrade = "B";
            }else if(percentage >= 70){
                letterGrade = "C";
            }else if(percentage >= 60){
                letterGrade = "D";
            }else {
                letterGrade = "F";
            }

            System.out.println("Grade for " + testNames[index]
                    + "\nScore: " + activity.getScore() + "/" + activity.getMaxScore()
                    +"\nPercentage: " + df.format(activity.getPercantage())+ "%"
                    +"\nGrade: " + letterGrade + "\n");


            index++;



        }


        return "";
    }

    public static void main(String[] args) {

        CourseGrades courseGrades = new CourseGrades();

        GradedActivity lab = new GradedActivity(27, 30);
        PassFail passFail = new PassFail(5);
        GradedActivity essay = new GradedActivity(29, 30);
        FinalExam finalExam = new FinalExam(39);

        courseGrades.setLab(lab);
        courseGrades.setPassFail(passFail);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);

        System.out.println(courseGrades.toString());

        System.out.println("______________________________");
        System.out.println("Highest Average: " + courseGrades.getHighest().getScore()
        +"\nLowest Average: " + courseGrades.getLowest().getScore()
        +"\nAverage: " + courseGrades.getAverage() + "%");


    }

    @Override
    public double getAverage() {

        // average of lab test and the essay
        double lab = grades[0].getScore();
        double essay = grades[2].getScore();

        return (lab+essay)/2;
    }

    @Override
    public GradedActivity getHighest() {


        // return the refence of the class the highest
        double lab = grades[0].getScore();
        double essay = grades[2].getScore();


        // return grades[highest];
        return (lab > essay ? grades[0] : grades[2]) ;
    }

    @Override
    public GradedActivity getLowest() {


        double lab = grades[0].getScore();
        double essay = grades[2].getScore();

        // lowest in

        return (lab < essay ? grades[0] : grades[2]);
    }
}
