package challenge_01;


/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */
public class ProductionWorker extends Employee{

    private int shift; // 1 or 2
    private double payRate;

    public ProductionWorker(String name, String empNumber, String hireDate,
                            int shit, double payRate){
        super(name, empNumber, hireDate);

        if (shit == 1 || shit == 2){
            this.shift = shit;
        }else {
            System.out.println("Error: shift can only be 1 or 2.");
            System.exit(0);
        }

        if (payRate <= 0){
            System.out.println("Error: pay rate must be greater than 0.");
            System.exit(0);
        }else {
            this.payRate = payRate;
        }

    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift == 1 || shift == 2){
            this.shift = shift;
        }else {
            System.out.println("Error: shift can only be 1 or 2.");
            System.exit(0);
        }



    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {


        if (payRate <= 0){
            System.out.println("Error: pay rate must be greater than 0.");
            System.exit(0);
        }else {
            this.payRate = payRate;
        }


    }

    public static void main(String[] args) {

        ProductionWorker p = new ProductionWorker(
                "Mike", "123-AB", "01/01/1933",
                2, 10
        );

        System.out.println("Emp name: " + p.getEmpName()
        +"\nEmp #: " + p.getEmpNumber()
        +"\nEmp hire date: " + p.getHireDate()
        +"\nEmp shift: " + (p.getShift() == 1 || p.getShift() == 2 ? "Day" : "Night")
        +"\nEmp pay rate: $" + p.getPayRate());


    }
}
