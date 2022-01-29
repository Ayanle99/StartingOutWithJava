package challenge_02;

import challenge_01.Employee;

import java.text.DecimalFormat;

/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */

public class ShiftSuppervisor extends Employee {

    private double annualSalar;
    private double productionBonus;

    public double getAnnualSalar() {
        return annualSalar;
    }

    public void setAnnualSalar(double annualSalar) {
        if (annualSalar <= 0){
            System.out.println("Error: annual salary cannot be negative.");
            System.exit(0);
        }else {
            this.annualSalar = annualSalar;
        }
    }

    public double getProductionBonus() {
        return productionBonus;
    }

    public void setProductionBonus(double productionBonus) {

        if (productionBonus <= 0){
            System.out.println("Error: bonus cannot be negative or $0.");
            System.exit(0);
        }else {
            this.productionBonus = productionBonus;
        }
    }

    public ShiftSuppervisor(String empName, String empNumber, String hireDate, double annualSalar, double productionBonus) {
        super(empName, empNumber, hireDate);

        if (productionBonus <= 0){
            System.out.println("Error: bonus cannot be negative or $0.");
            System.exit(0);
        }else {
            this.productionBonus = productionBonus;
        }
        if (annualSalar <= 0){
            System.out.println("Error: annual salary cannot be negative.");
            System.exit(0);
        }else {
            this.annualSalar = annualSalar;
        }
    }

    public static void main(String[] args) {

        ShiftSuppervisor shift = new ShiftSuppervisor(
                "Mike",
                "123-AE", // XXX = 0-9, XX = A-M
                "01/01/1988",
                40000,
                871
        );


        DecimalFormat df = new DecimalFormat("#,###.00");


        System.out.println("Emp name: " + shift.getEmpName()
        +"\nEmp #: " + shift.getEmpNumber()
        +"\nEmp hire date: " + shift.getHireDate()
        +"\nEmp Salary: $" + df.format(shift.getAnnualSalar())
        +"\nEmp bonus: $" + df.format(shift.getProductionBonus()) );




    }
}
