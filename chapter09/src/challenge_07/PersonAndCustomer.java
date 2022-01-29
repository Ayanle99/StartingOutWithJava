package challenge_07;

/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */
public class PersonAndCustomer {

    public static void main(String[] args) {


        Customer customer = new Customer(
                "Mike",
                "123 Main St",
                "1800-TELEPHONE",
                "19848",
                true
        );

        System.out.println("Customer info: " +
                "\n\n\t Name: " + customer.getName()
        +"\n\t Address: " + customer.getAddress()
        +"\n\t Telephone #: " + customer.getTelephoneNumber()
        +"\n\t Customer #: " + customer.getCustomer_number()
        +"\n\t Wish to be in maling list: " + (customer.isInMailingList() ? "Yes" : "No") );


    }
}
