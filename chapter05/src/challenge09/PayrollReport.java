package challenge09;

public class PayrollReport {


    /**
     *    Design a Payroll class that stores an
     *    employee's ID number, state tax, fed tax,
     *    and FICA withholdings. The class should
     *    have a method the employee's net pay as
     *    fallows:
     *
     *    net pay = gross pay - ( state tax + fed tax + FICA)
     *
     *    Use the class in a program that displays a weekly payroll
     *    report. A loop in the program should ask the user for the
     *    employee ID, gross pay, state tax, federal tax, and
     *    FICA withholdings and should pass these values to an
     *    instance oof the Payroll class. The net pay should be
     *    displayed. The loop should terminate when 0 is entered for
     *    the employee ID number. After the data is entered, the
     *    program should display the totals for gross pay, state tax,
     *    fed tax, and fica withholdings, and net pay.
     *
     *    Input validation: Do not accept negative numbers for any
     *    of the items entered.
     *
     */

     private int empID;
     private  double grossPay;
     private  double stateTax;
     private double fedTex;
     private  double FICA;

     public PayrollReport(int empID,
                          double grossPay,
                          double stateTax,
                          double fedTex,
                          double FICA){
         this.empID = empID;
         this.grossPay = grossPay;
         this.stateTax = stateTax;
         this.fedTex = fedTex;
         this.FICA = FICA;
     }

     public double getNetPay(){

         double netPay = 0.0;


         double totalTax = (stateTax/100) * grossPay + (fedTex/100) * grossPay +
                 (FICA /100) * grossPay;

         netPay = grossPay - totalTax;
         return netPay;


     }




}
