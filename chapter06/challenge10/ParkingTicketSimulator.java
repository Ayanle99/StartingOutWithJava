package challenge10;


public class ParkingTicketSimulator {

    /**
     *
     *  For this assingment you will design a set of classes that work together to simulate a police
     *  officer issuing a parking ticket. The classes you should design are:
     *
     *  1) TheParkedCar Class: This class should simulate a parked car. The class's responsibilites
     *  are:
     *      - To know the car's make, model, color, license number and the number of minutes
     *      that the car has been parked.
     * 2) TheParkingMeter class: This class should simulate a parking meter. The class's only
     * responsibility is:
     *      - To know the number of minutes of parking time that has been purchased.
     * 3) TheParkingTicket Class: This class should simulate a parking ticket. The class's
     * responsibilities are:
     *    - To report the make, model,color, and license number of the iillegally parked ccar
     *    - To report the amount of the fire, which is $25 for the first hour or part of an hour
     *    that the car is illegally parked, plus $10 for every additional hour or part an hour
     *    hour that the car is illegally parked
     *    - To report the name and badge number of the police officer issuing the ticket
     *
     * 4) ThePoliceOfficer class: This class should simulate a police office r inspecting parked cars.
     * The class's responsiblities are:
     *
     *      - To know the police officer's name and badge number
     *      = To examine a ParkedCar object and a ParkingMeter object, and determine whether
     *      the car's time has expired.
     *      - To issue a parking ticket (generate a ParkingTicket object) if the car's time has
     *      expired.
     *
     * Write a program that demonstrate how those classes collaborate.
     *
     *
     */

    public static void main(String[] args) {
        ParkingTicketSimulator ps = new ParkingTicketSimulator();
        ps.simulate();
    }

    class ParkedCar {

        private String make, model, color,licenseNumber;

        ParkedCar(){}
        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getLicenseNumber() {
            return licenseNumber;
        }

        public void setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
        }

        public int getNumberOfMinutesParked() {
            return numberOfMinutesParked;
        }

        public void setNumberOfMinutesParked(int numberOfMinutesParked) {
            this.numberOfMinutesParked = numberOfMinutesParked;
        }

        private int numberOfMinutesParked;

        public ParkedCar(String make, String model, String color, String licenseNumber, int numberOfMinutesParked) {
            this.make = make;
            this.model = model;
            this.color = color;
            this.licenseNumber = licenseNumber;
            this.numberOfMinutesParked = numberOfMinutesParked;
        }
    }

    class ParkingMeter {
        private int minutesPurchased;

        public ParkingMeter(){}
        public ParkingMeter(int minutesPurchased) {
            this.minutesPurchased = minutesPurchased;
        }

        public int getMinutesPurchased() {
            return minutesPurchased;
        }

        public void setMinutesPurchased(int minutesPurchased) {
            this.minutesPurchased = minutesPurchased;
        }
    }

    class ParkingTicket {
        private ParkedCar car;
        private PoliceOfficer policeOfficer;
        private ParkingMeter parkingMeter;
        private double fine;

        ParkingTicket(){}

        public ParkingTicket(ParkedCar car, PoliceOfficer policeOfficer){
            this.car = car;
            this.policeOfficer = policeOfficer;
            this.parkingMeter = parkingMeter;
        }

        public ParkedCar getCar() {
            return car;
        }

        public void setCar(ParkedCar car) {
            this.car = car;
        }

        public PoliceOfficer getPoliceOfficer() {
            return policeOfficer;
        }

        public void setPoliceOfficer(PoliceOfficer policeOfficer) {
            this.policeOfficer = policeOfficer;
        }

        public ParkingMeter getParkingMeter() {
            return parkingMeter;
        }

        public void setParkingMeter(ParkingMeter parkingMeter) {
            this.parkingMeter = parkingMeter;
        }

        @Override
        public String toString() {


            return "\nLicense Number: " + car.getLicenseNumber()
                    +"\nMake: " + car.getMake() + "\nModel: " + car.getModel()
                    +"\nColor: " +car.getColor()
                    +"\nFine: $"+ String.format("%.2f", this.fine)
                    +"\nPolice Officer: " + policeOfficer.getName()
                    +"\nBadge: " + policeOfficer.getBadge()
                    +"\n";
        }
    }
    class PoliceOfficer {

        PoliceOfficer(){}

        public PoliceOfficer(String name, String badge) {
            this.name = name;
            this.badge = badge;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBadge() {
            return badge;
        }

        public void setBadge(String badge) {
            this.badge = badge;
        }

        String name, badge;

        public boolean isIllegallyParked(ParkedCar car, ParkingMeter pm){
            return car.getNumberOfMinutesParked() > pm.getMinutesPurchased();
        }

        public ParkingTicket writeTicket(ParkedCar car, ParkingMeter meter){

            ParkingTicket ticket = new ParkingTicket(car, this);
            int rm = car.getNumberOfMinutesParked() - meter.getMinutesPurchased();

            if (isIllegallyParked(car, meter)){
                if (rm <= 60){
                    ticket.fine = 25;
                }else {
                    ticket.fine = 25 + (10 * (rm/60));
                }
            }

            return ticket;

        }

    }
    public void simulate(){

        ParkedCar car = new ParkedCar();
        car.setMake("Buick");
        car.setModel("LeSabre");
        car.setColor("Silver");
        car.setLicenseNumber("ABC 123");
        car.setNumberOfMinutesParked(105);


        ParkingMeter meter = new ParkingMeter();
        meter.setMinutesPurchased(15);

        PoliceOfficer officer = new PoliceOfficer();
        officer.setName("Jim Lahey");
        officer.setBadge("AB12345");

        // The Interaction b/w Officer and Parked Car
        if (officer.isIllegallyParked(car, meter)) {
            ParkingTicket ticket = officer.writeTicket(car, meter);
            System.out.println("Ticket generated.");
            System.out.println(ticket);

        }
        else {
            System.out.println("No Ticket Needed");
        }


    }


}
