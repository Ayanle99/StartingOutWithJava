package challenge_03;

/**

 Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */

public class RetailItemDemo {

    public static void main(String[] args) {


        RetailItem item = new RetailItem();

        try{

            item.setDescription("Jacket");
            item.setUnitsOnHand(10);
            item.setPrice(44.88);

            System.out.println("Description: " + item.getDescription()
            +"\nUnits: " + item.getUnitsOnHand()
            +"\nPrice: $" +item.getPrice());

        }catch (NegativeUnits | NegativePrice e){
            System.out.println(e.getMessage());
        }

        // try and catch exceptions


    }
}
