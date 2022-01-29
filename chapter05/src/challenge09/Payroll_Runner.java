package challenge09;

import challenge09.PayrollReport;

import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll_Runner {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int empID = sc.nextInt();

        while (empID < 0){
            System.out.print("Error: Employee ID: ");
            empID = sc.nextInt();
        }

        while (empID != 0){


            System.out.print("Gross pay: ");
            double grossPay = sc.nextDouble();

            while (grossPay < 0){
                System.out.print("Error: Gross pay: ");
                grossPay = sc.nextDouble();
            }
            System.out.print("State tax: ");
            double stateTax = sc.nextDouble();

            while (stateTax < 0){
                System.out.print("Error: State tax: ");
                stateTax = sc.nextDouble();
            }

            System.out.print("Fed tax: ");
            double fedTax = sc.nextDouble();
            while (fedTax < 0){
                System.out.print("Error: Fed tax: ");
                fedTax = sc.nextInt();
            }

            System.out.print("FICA withholdings: ");
            double fica = sc.nextDouble();

            while (fica < 0){
                System.out.print("Error: FICA withholdings: ");
                fica = sc.nextDouble();
            }

            PayrollReport payrollReport = new PayrollReport(
                    empID, grossPay, stateTax, fedTax, fica
            );

            double netPay = payrollReport.getNetPay();

            NumberFormat nf = NumberFormat.getIntegerInstance();
            nf.setMinimumFractionDigits(1);

            stateTax = (stateTax/100) * grossPay;
            fedTax = (fedTax/100) * grossPay;
            fica = (fica/100) * grossPay;


            System.out.println("\n");
            System.out.println("Gross pay: $" + nf.format(grossPay));
            System.out.println("State tax: $" + nf.format(stateTax));
            System.out.println("Federal tax: $" + nf.format(fedTax));
            System.out.println("FICA withholdings: $" + nf.format(fica));
            System.out.println("Net Pay: " + nf.format(netPay));


            System.out.println("\n");
            System.out.print("Employee ID: ");
            empID = sc.nextInt();


        }

    }
}
