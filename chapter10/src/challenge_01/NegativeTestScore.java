package challenge_01;

public class NegativeTestScore extends IllegalArgumentException{

    public NegativeTestScore(){
        super("Error: the test score cannot be negative.");
    }
    public NegativeTestScore(double amount){
        super("Error: the test score (" + amount + ") cannot be negative. ");
    }


}
