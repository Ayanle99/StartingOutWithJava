package challenge06;

public class Employee {

    /**
     *  Write a class named Employee that has the following fields.
     *  name: The name field is a String object that that holds employee's name
     *  idNumber: The idNumber is an int variable that holds the employee's ID number
     *  department:  The department field is a String object that holds the name of the department
     *  where the employee works.
     *  position: The positiion field is a String object that holds the employee's job title.
     *
     *
     *  Write appropriate mutator methods that store values in these fields and accessor methods
     *  that return the value in these fields. Once you have the written the class, write a separate
     *  program that creates three Employee objects to hold the following data.
     *
     *  Name                ID Number           Department          Position
     *  ___________________________________________________________________________
     *  Susan Meyers        47899               Accounting          Vice President
     *  Mark Jones          39119               IT                  Programmer
     *  Joy Rogers          81774               Manufacturing       Engineer
     *
     *  The program should store this data in the three objects and then display the data for each
     *  employee on the screen.
     *
     *
     */
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
