package challenge_01;


import java.io.Serializable;

public class TestScores implements Serializable {

    private int[] testScores;


    public TestScores(int[] testScores) throws NegativeTestScore, GreaterThanHunderend{

        for (int i = 0; i < testScores.length;i++){
            int num = testScores[i];

            if (num < 0){
                throw new NegativeTestScore(num);
            }
            if (num > 100){
                throw new GreaterThanHunderend(num);
            }


        }

        this.testScores = testScores;
    }
    public double getAverage(){
        double total = 0;
        for (int i = 0; i < testScores.length;i++){
            total += testScores[i];
        }
        return total/testScores.length;
    }


}
