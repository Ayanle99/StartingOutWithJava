package challenge_05.payroll;

public class InvalidID extends Exception{


    public InvalidID(){
        super("Error: ID numbers canno be negative or equal to 0.");
    }
    public InvalidID(int id){
        super("Error: ID numbers ("+id+") cannot be negative or equal to 0.");
    }

}
