package challenge_05;

public class PassFail extends GradedActivity {

    private static int MIN_PASS = 70;
    private static int MAX_QUESTIONS = 10;

    public PassFail(int correctCount){
        super(correctCount, MAX_QUESTIONS);
    }

    public boolean isPassed() {

        return (super.getScore() / super.getMaxScore() * 100) > MIN_PASS;
    }

}
