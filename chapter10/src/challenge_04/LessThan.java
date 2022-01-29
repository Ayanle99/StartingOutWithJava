package challenge_04;

public class LessThan extends Exception{


    public LessThan(){
        super("Error: the month number cannot be negative.");

    }
    public LessThan(int month){
        super("Error: the month number ("+month+") caanot be negative.");

    }

}
