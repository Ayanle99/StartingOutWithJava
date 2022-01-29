package challenge_11.ch01;

import challenge_11.exceptions.InvalidEmployeeNumber;

public class Employee {

    private String empName,hireDate;
    private int empNumber;

    public Employee(){}


    public Employee(String empName, int empNumber, String hireDate) throws InvalidEmployeeNumber {
        this.empName = empName;

        if (empNumber < 0 || empNumber >9999){
            throw new InvalidEmployeeNumber(empNumber);
        }

        else {
            this.empNumber = empNumber;
        }

        this.hireDate = hireDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) throws InvalidEmployeeNumber {

        if (empNumber < 0 || empNumber > 9999){
            throw new InvalidEmployeeNumber(empNumber);
        }else {
            this.empNumber = empNumber;
        }


    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
