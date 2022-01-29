package challenge_04;

public class InvalidMonth extends Exception{


    public InvalidMonth(){
        super("Error: the month name is invalid.");

    }
    public InvalidMonth(String month){
        super("Error: the month name ("+month+") is invalid.");

    }
}
