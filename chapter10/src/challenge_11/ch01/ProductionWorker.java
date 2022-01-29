package challenge_11.ch01;

import challenge_11.exceptions.InvalidEmployeeNumber;
import challenge_11.exceptions.InvalidPayRate;
import challenge_11.exceptions.InvalidShift;


/**

  Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */

public class ProductionWorker extends Employee{

    private int shift; // 1 or 2
    private double payRate;

    public ProductionWorker(String name, int empNumber, String hireDate,
                            int shit, double payRate) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber {

        super(name, empNumber, hireDate);

        if (shit == 1 || shit == 2){
            this.shift = shit;
        }else {
           throw new InvalidShift(shit);
        }

        if (payRate <= 0){
            throw new InvalidPayRate(payRate);
        }else {
            this.payRate = payRate;
        }

    }

    public int getShift() {
        return shift;
    }

    /**
     *
     * @param shift
     * @throws InvalidShift
     */
    public void setShift(int shift) throws InvalidShift {

        // Check if the shift is valid.
        if (shift == 1 || shift == 2){
            this.shift = shift;
        }else {
            throw new InvalidShift(shift);

        }



    }

    public double getPayRate() {
        return payRate;
    }

    /**
     *
     * @param payRate
     * @throws InvalidPayRate
     */
    public void setPayRate(double payRate) throws InvalidPayRate{

        // check if payrate is negative
        if (payRate < 0){
            throw new InvalidPayRate(payRate);
        }else {
            this.payRate = payRate;
        }


    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        try {

            ProductionWorker p = new ProductionWorker (
                    "Mike",
                    -0,
                    "01/01/1933",
                    2,
                    7.22
            );


            System.out.println("Emp name: " + p.getEmpName()
                    +"\nEmp #: " + p.getEmpNumber()
                    +"\nEmp hire date: " + p.getHireDate()
                    +"\nEmp shift: " + (p.getShift() == 1 || p.getShift() == 2 ? "Day" : "Night")
                    +"\nEmp pay rate: $" + p.getPayRate());


        }catch (InvalidShift | InvalidPayRate | InvalidEmployeeNumber e){
            System.out.println(e.getMessage());
        }


    }
}
