package challenge_01;

public class GreaterThanHunderend extends IllegalArgumentException{

    public GreaterThanHunderend(){
        super("Error: the test score cannot be greater than 100.");
    }
    public GreaterThanHunderend(double amount){
        super("Error: the test score (" + amount + ") cannot be greater than 100. ");
    }



}
