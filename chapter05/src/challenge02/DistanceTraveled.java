package challenge02;

public class DistanceTraveled {


    /**
     * The distance a vehicle travels can be calculated
     * as follows:
     *
     * DISTANCE = SPEED * TIME
     *
     * For example, if a train travels 40
     * miles per hour (mph) for three hours,
     * the distance traveled is 120 miles.
     *
     * Design a class  that stores the speed of a vehicle
     * ( in miles per hour ) and the number of hours
     * it has traveled. It should have a method named
     * getDistance() that returns the distance, in miles
     * that the vehicle has traveled.
     *
     *
     * Demonstrate the class in a program that uses a loop
     * to display the distance a vehicle has traveled for each
     * hour of a time period specified by the user. For example
     * if the vehicle is traveling 40  mph for a three-hour
     * time period, it should display a report similar to one
     * shown here.
     *
     *
     *      Hour       Distance Traveled
     *      .................................
     *      1              40
     *      2              80
     *      3             120
     *
     */
    private int speed;
    private int hours;

    public DistanceTraveled(int speed, int hours){
        this.speed =speed;
        this.hours = hours;
    }

    public int getDistance(){
        return speed * hours;
    }




}
