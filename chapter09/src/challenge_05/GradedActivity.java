package challenge_05;

public class GradedActivity {
    private int score;
    private int maxScore;

    public GradedActivity(int score, int maxScore) {
        this.score = score;
        this.maxScore = maxScore;
    }

    public double getPercantage(){

        double percentage = getScore();
        percentage /= getMaxScore();
        percentage *= 100;

        return percentage;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

}
