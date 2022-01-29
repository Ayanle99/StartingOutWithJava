package challenge_11.exceptions;

public class InvalidEmployeeNumber extends Exception{

    public InvalidEmployeeNumber(){
        super("Error: invalid emp #");
    }

    public InvalidEmployeeNumber(int empNumber){
        super("Error: The emp # ("+empNumber + ") is not valid employee number");
    }



}
