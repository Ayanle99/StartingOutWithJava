package challenge_05.payroll;

public class InvalidName extends Exception{

    public InvalidName(){
        super("Error: empty name, that is invalid.");
    }
    public InvalidName(String n){
        super("Error: the name ("+ n+") cannot be empty.");
    }
}
