package challenge12;

public class Odometer {

    final int MAXIMUM_MILAGE = 999999;
    final int MILES_PER_GALLON = 24;

    private int initialMillage;
    private int milage;

    private FuelGauge fuelGauge;

    public Odometer(int milage, FuelGauge fuelGauge){
        this.initialMillage = milage;
        this.milage = milage;
        this.fuelGauge = fuelGauge;
    }

    public int getMilage() {
        return milage;
    }
    public void addMillage(){
        if (milage < MAXIMUM_MILAGE){
            milage++;
        }
        else {
            milage = 0;
        }

        int driven = initialMillage - milage;
        if (driven % MILES_PER_GALLON ==0){
            fuelGauge.burnFuel();
        }
    }

    public static void main(String[] args) {


        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(0, fuelGauge);

        for (int i = 0; i < fuelGauge.MAXIMUM_GALLONS; i++){
            fuelGauge.addGallons();
        }


        while (fuelGauge.getGallons() > 0){
            odometer.addMillage();
            System.out.println("Millage " + odometer.getMilage());
            System.out.println("Fuel level: "+fuelGauge.getGallons() + " gallons");
            System.out.println("____________________________________________________");
        }


    }
}
