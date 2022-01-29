package challenge_02;

public class InvalidTestScore extends Exception{


    public InvalidTestScore(){
        super("Error: test score is invalid.");
    }
    public InvalidTestScore(double score){
        super("Error: test score (" + score+") is invalid score.");
    }
}
