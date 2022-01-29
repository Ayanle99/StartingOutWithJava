package challenge_7_02;

import java.util.Scanner;


/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */


public class PayrollDemo {

    static Payroll payroll = new Payroll();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         start();

    }
    public static void start(){

        System.out.println("1. Add Employee Data." +
                "\n2. View Employee Data" +
                "\n3. Finish." +
                "\nYour choice: ");

        int choice = scanner.nextInt();

        switch (choice){

            case 1:
                addEmployee();
                break;
            case 2:
                viewEmployee();
                break;
            case 3:
                System.exit(0);
                break;
            default:

        }

        System.out.println();

    }
    public static void addEmployee(){

        System.out.println();

        int[] ids = payroll.getEmployeeId();

        for (int i = 0; i < 7; i++){

            System.out.print("Enter employee #"+ (ids[i]) + " worked hours: ");
            int hours = scanner.nextInt();

            while (hours < 0){
                System.out.print("Error: hours cannot be a negative number: ");
                hours = scanner.nextInt();
            }

            payroll.setHours(i, hours);

            System.out.print("\tEnter pay rate $");
            double payrate = scanner.nextDouble();

            while (payrate < 6.00){
                System.out.print("Error: pay rate cannot be less than $6: ");
                payrate = scanner.nextDouble();
            }

            payroll.setPayRate(i, payrate);

        }

        System.out.println();

        payroll.calculateWages();

        viewEmployee();

    }
    public static void viewEmployee(){

        System.out.println();

        System.out.println("Employee Data\n");

        try {
            for (int i = 0; i < 7; i++) {

                System.out.println("Employee ID #" + payroll.getEmployeeId(i)
                        + "\nHours: " + payroll.getHours(i)
                        + "\nPay rate: $" + payroll.getPayrate(i)
                        + "\nGross wage: $" + payroll.getWages(i)
                        + "\n");
            }

        }catch (NullPointerException ex) {
            System.out.println("\tSome fields are not filled correctly.");
        }

    }
}