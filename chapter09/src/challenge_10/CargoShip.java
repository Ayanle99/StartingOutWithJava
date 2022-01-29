package challenge_10;

public class CargoShip extends Ship{

    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCap) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCap;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName()
                +"\nCargo Capacity: " + cargoCapacity
                +"\n__________________________\n";
    }
}
