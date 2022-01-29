package challenge_10;

public class CruiseShip extends Ship{

    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers){
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;

    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName()
                +"\nMax Passengers: " + maxPassengers
                +"\n__________________________\n";
    }
}
