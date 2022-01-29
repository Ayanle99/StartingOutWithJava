package challenge_05.payroll;

public class InvalidHoursPay extends Exception{


    public InvalidHoursPay(){
        super("Error: invalid hourly pay");
    }
    public InvalidHoursPay(double pay){
        super("Error: the hourly pay ("+pay+") cannot be negative or greater than 25.");
    }

}
