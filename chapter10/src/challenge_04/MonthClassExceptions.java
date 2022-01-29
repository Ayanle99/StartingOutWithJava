package challenge_04;
/**

 Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */
public class MonthClassExceptions {

    public static void main(String[] args) {

        /**
         *
         *  InvalidMonth
         *  LessThan
         *  GreaterThan
         *
         */

        try
        {

            Month month = new Month(1);

            month.setMonthNumber(1);
            month.setMonthName("January");

            System.out.println("Month #: " + month.getMonthNumber()
            +"\nMonth Name: " + month.getMonthName());

        }catch (InvalidMonth | LessThan | GreaterThan e){
            System.out.println(e.getMessage());
        }




    }




}
