package challenge_02;

public class TestScoreCustomException {

    private int[] testScores;

    public TestScoreCustomException(int[] testScores) throws InvalidTestScore {


        for (int i = 0; i < testScores.length;i++){
            int score = testScores[i];

            if (score < 0){
                throw new InvalidTestScore();
            }
            if (score > 100){
                throw new InvalidTestScore(score);
            }
        }

        this.testScores=testScores;
    }
    public double getAverage(){

        double total = 0;

        for (int i = 0; i < testScores.length;i++){
           total+= testScores[i];
        }
        return total/testScores.length;
    }



}
