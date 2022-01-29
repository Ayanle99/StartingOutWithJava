package challenge_7_06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] studentAnswers = new String[20];

        for (int i = 0; i < studentAnswers.length;i++){

            System.out.print("Enter your answer " + (i+1) + ": ");
            String answer = scanner.nextLine();

            while (!validAnswer(answer)){
                System.out.print("Error: only A,B,C,D are valid answers, please press enter to skip: ");
                answer = scanner.nextLine();
            }

            studentAnswers[i] = answer;

        }

        System.out.println();

        DriverExam driverExam = new DriverExam(studentAnswers);

        if (driverExam.passed()){
            System.out.println("Congrats! You passed.");
        }else {
            System.out.println("You failed.");
        }
        System.out.println();

        System.out.println("Correct Answers: " + driverExam.getCorrectAnswers()
        +"\nIncorrect Answers: " + driverExam.getIncorrectAnswers()
        +"\nMissed Questions: " + driverExam.getQuestionnsMissed());


    }
    public static boolean validAnswer(String answer){

        return answer.equalsIgnoreCase("A")
                || answer.equalsIgnoreCase("B")
                || answer.equalsIgnoreCase("C")
                || answer.equalsIgnoreCase("D")
                || answer.isEmpty();


    }
}
