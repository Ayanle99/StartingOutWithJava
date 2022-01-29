package challenge_05.payroll;

public class InvalidHoursWorked extends Exception{


    public InvalidHoursWorked(){
        super("Error: invalid hours worked.");
    }
    public InvalidHoursWorked(int hours){
        super("Error: the hours worked ("+hours+") cannot be negative or greater than 84.");
    }

}
