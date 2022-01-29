package challenge_09;

import challenge_01.TestScores;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeTestScores {

    static String filePath = "/Users/max/IdeaProjects/Chapter10/src/challenge_09/TestScores.dat";

    public static void main(String[] args) {

        try {


            TestScores[] testScores = new TestScores[5];

            ObjectInputStream obj =
                    new ObjectInputStream(new FileInputStream(filePath));

            for (int i =0;i<testScores.length;i++){
                testScores[i] = (TestScores) obj.readObject();
            }

            obj.close();

            for (TestScores test : testScores){
                System.out.println("Average score: " + test.getAverage()
                + "\t"+ (test.getAverage() >= 70 ? "Pass" : "Fail"));
            }

            obj.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
