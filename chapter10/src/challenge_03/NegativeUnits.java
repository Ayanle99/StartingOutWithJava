package challenge_03;

public class NegativeUnits extends Exception{


    public NegativeUnits(){
        super("Error: units on hand cannot be negative.");
    }
    public NegativeUnits(double amt){
        super("Error: units on hand ("+amt+") cannot be negative.");
    }

}
