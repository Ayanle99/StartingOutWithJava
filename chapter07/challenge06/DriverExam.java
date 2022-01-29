package challenge_7_06;

import java.util.ArrayList;

public class DriverExam {

    private String[] answers = {

            "B", "D", "A", "A", "C", "A", "B", "A", "C", "D",
            "B", "C", "D", "A", "D", "C", "C", "B",  "D",  "A"
    };
    private String [] studentAnswers = new String[20];

    public DriverExam(String[] studentAnswers){
        this.studentAnswers = studentAnswers;
    }
    public boolean passed(){

        int count = 0;

        for (int i = 0; i < answers.length;i++){
            if (answers[i].equals(studentAnswers[i])){
                count++;
            }
        }

        return count >= 15;
    }
    public int getCorrectAnswers(){
        int count = 0;
        for (int i = 0; i < answers.length;i++){
            if (answers[i].equalsIgnoreCase(studentAnswers[i])){
                count++;
            }
        }
        return count;
    }

    public int getIncorrectAnswers(){
        int count = 0;
        for (int i = 0; i < answers.length;i++){
            if (!(answers[i].equalsIgnoreCase(studentAnswers[i]))){
                count++;
            }
        }
        return count;
    }
    public ArrayList<Integer> getQuestionnsMissed(){

        ArrayList<Integer> missed = new ArrayList<>();

        for (int i = 0; i < studentAnswers.length;i++){

            if (studentAnswers[i].isEmpty()){
                missed.add(i+1);
            }
        }

        return missed;

    }
}
