package challenge_05;

import challenge_05.payroll.*;
/**

 Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */
public class PayrollClassExceptions {


    public static void main(String[] args) {

        /**
         * Exceptions:
         *
         *  if the name is empty
         *  if empID is <= 0
         *  if hoursWorked < 0 || hw > 84
         *  if hoursPay < 0 || hp > 25
         *
         *
         */

        Payroll payroll = new Payroll();

        try {


            payroll.setName("James");
            payroll.setIdNumber(1);
            payroll.setHoursWorked(40);
            payroll.setHourlyPay(21);

            System.out.println(payroll.toString());


        }catch (InvalidName | InvalidID | InvalidHoursWorked |
                InvalidHoursPay e){
            System.out.println(e.getMessage());
        }


    }



}
