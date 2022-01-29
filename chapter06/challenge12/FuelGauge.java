package challenge12;

public class FuelGauge {

    public static int MAXIMUM_GALLONS = 15;
    private int gallons;

    public FuelGauge(){}

    public FuelGauge(int gallons){
        if (gallons <= MAXIMUM_GALLONS){
            this.gallons = gallons;
        }else {
            gallons = MAXIMUM_GALLONS;
        }
    }

    public int getGallons(){
        return gallons;
    }
    public void addGallons(){
        if (gallons < MAXIMUM_GALLONS){
            gallons++;
        }else {
            System.out.println("Fuel Full.");
        }
    }

    public void burnFuel(){
        if (gallons > 0){
            gallons--;
        }else {
            System.out.println("Out of Fuel");
        }
    }


}
