package challenge_11.exceptions;

public class InvalidShift extends Exception{

    public InvalidShift(){
        super("Error: invalid shift #");
    }
    public InvalidShift(int shiftNumber){
        super("Error: The shift #"+shiftNumber+" is not a valid shift number.");
    }
}
