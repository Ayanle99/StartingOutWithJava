package challenge_04;


/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */
public class GradeActivity {

    private double score;

    public void setScore(double s){
        score = s;
    }

    public double getScore() {
        return score;
    }

    public GradeActivity() {
    }

    public GradeActivity(double score) {
        this.score = score;
    }

    public char getGrade(){

        char letterGrade;

        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        return letterGrade;

    }




}
