package challenge_03;

public class NegativePrice extends Exception{

    public NegativePrice(){
        super("Error: price cannot be negative.");
    }
    public NegativePrice(double amount){
        super("Error: price ("+amount+") cannot be negative.");
    }
}
