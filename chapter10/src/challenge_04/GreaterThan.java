package challenge_04;

public class GreaterThan extends Exception{


    public GreaterThan(){
        super("Error: the month number cannot be greater than 12.");

    }
    public GreaterThan(int month){
        super("Error: the month number ("+month+") caanot be greater than 12.");

    }
}
