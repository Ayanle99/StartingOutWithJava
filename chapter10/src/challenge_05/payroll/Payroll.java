package challenge_05.payroll;

import java.text.DecimalFormat;

public class Payroll {

    private String name;
    private int idNumber;
    private int hoursWorked;
    private double hourlyPay;

    public Payroll(){}

    public Payroll(String name, int idNumber, int hoursWorked, double hourlyPay) {
        this.name = name;
        this.idNumber = idNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public double getHourlyPay() {
        return hourlyPay;
    }
    public double getGrossPay(){
        return hoursWorked * hourlyPay;
    }


    /**
     * check if the name is empty
     * @param name
     */
    public void setName(String name) throws InvalidName{

        if (name.equalsIgnoreCase("")){
            throw new InvalidName(name);
        }else {
            this.name = name;
        }

    }

    /**
     * chek idNumber
     * @param idNumber
     */
    public void setIdNumber(int idNumber) throws InvalidID{

        if (idNumber <= 0){
            throw new InvalidID(idNumber);
        }else {

            this.idNumber = idNumber;
        }


    }


    /**
     * check hours worked
     * @param hoursWorked
     */

    public void setHoursWorked(int hoursWorked) throws InvalidHoursWorked{
        /**
         *  if hoursWorked < 0 AND hoursWorked > 84
         */
        if (hoursWorked < 0 || hoursWorked > 84){
            throw new InvalidHoursWorked(hoursWorked);
        }else {
            this.hoursWorked = hoursWorked;
        }
    }


    /**
     * check hourly pay
     * @param hourlyPay
     */
    public void setHourlyPay(double hourlyPay) throws InvalidHoursPay{

        if (hourlyPay < 0 || hourlyPay > 25){
            throw new InvalidHoursPay(hourlyPay);
        }else {
            this.hourlyPay = hourlyPay;
        }

    }






    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("#,###.00");

        return "Name: " + name
                +"\nID #: " + idNumber
                +"\nHours Worked: " + hoursWorked
                +"\nPay Rate: $" + hourlyPay
                +"\nGross Pay: $" + df.format(getGrossPay()) + "\n";

    }
}
