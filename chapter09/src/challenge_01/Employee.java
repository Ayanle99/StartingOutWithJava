package challenge_01;

public class Employee {

    private String empName, empNumber, hireDate;

    public Employee(){}


    public Employee(String empName, String empNumber, String hireDate) {
        this.empName = empName;

        // emp #: XXX XX chars
        // XXX = (0-9)
        // XX = (A-M)

        if (empNumber.length() < 5){
            System.out.println("Error: emp # must be 5 characters.");
            System.exit(0);
        }else {


            String part1 = empNumber.substring(0,3);
            String part2 = empNumber.substring(4);

            // XXX = (0-9) Regex

            if (part1.matches("^[0-9]*")) {
                this.empNumber = empNumber;
            }else {
                System.out.println("Error: emp # first 3 chars must (0-9)");
                System.exit(0);
            }

            // XX = (A-M)

            if (part2.matches("^[A-M]*$")) {
                this.empNumber = empNumber;
            }else {
                System.out.println("Error: emp # last two chars must be between (A-M)");
                System.exit(0);
            }



        }

        this.hireDate = hireDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {


        if (empNumber.length() < 5){
            System.out.println("Error: emp # must be 5 characters.");
            System.exit(0);
        }else {


            String part1 = empNumber.substring(0,3);
            String part2 = empNumber.substring(4);

            // XXX = (0-9) Regex

            if (part1.matches("^[0-9]*")) {
                this.empNumber = empNumber;
            }else {
                System.out.println("Error: emp # first 3 chars must (0-9)");
                System.exit(0);
            }

            // XX = (A-M)

            if (part2.matches("^[A-M]*$")) {
                this.empNumber = empNumber;
            }else {
                System.out.println("Error: emp # first 3 chars must (0-9)");
                System.exit(0);
            }



        }


    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
