package challenge_11.exceptions;

public class InvalidPayRate extends Exception{

    public InvalidPayRate(){
        super("Error: invalid pay rate.");
    }
    public InvalidPayRate(double pay){
        super("Error: the pay rate $" + pay + " is invalid pay rate.");
    }
}
