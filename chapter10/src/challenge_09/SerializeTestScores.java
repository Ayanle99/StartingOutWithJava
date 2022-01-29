package challenge_09;

import challenge_01.TestScores;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**

 Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */
public class SerializeTestScores {


    static  int[][] studentTestScores = {

            {98, 77, 47, 88, 92},
            {77, 69, 55, 94, 88},
            {81, 71, 59, 64, 75},
            {85, 92, 94, 98, 97},
            {52, 34, 67, 72, 84},

    };

    public static void main(String[] args) {


        try {


            TestScores[] testScores = new TestScores[5];

            for (int i = 0; i < studentTestScores.length;i++){
                testScores[i] = new TestScores(studentTestScores[i]);
            }

            // Serialize
            String filePath = "src/challenge_09/TestScores.dat";

            ObjectOutputStream obj =
                    new ObjectOutputStream(new FileOutputStream(filePath));

            for (int i = 0; i < testScores.length;i++){
                obj.writeObject(testScores[i]);
            }

            obj.close();
            System.out.println("We write the TestScores.dat file.");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }





}
