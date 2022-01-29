package challenge_08;

import challenge_07.Customer;

import java.text.DecimalFormat;

/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */

public class PreferredCustomer  extends Customer {

    /**
     *
     *      $500 => 5%
     *  	$1,000 => 6%
     * 	    $1,500 => 7%
     * 	    $2,000 => 10%

     */

    private static final double FIVE_PERCENT = 0.05;
    private static final double SIX_PERCENT = 0.06;
    private static final double SEVEN_PERCENT = 0.07;
    private static final double TEN_PERCENT = 0.10;

    private double purchaseAmount;

    public PreferredCustomer(String name, String address, String telephoneNumber, String customer_number,
                             boolean isInMailingList, double spending) {
        super(name, address, telephoneNumber, customer_number, isInMailingList);
        this.purchaseAmount = spending;

    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getDiscount(){

        double discount = 0;

        if (purchaseAmount >= 500 && purchaseAmount < 1000){
            discount = purchaseAmount * FIVE_PERCENT;
        }else if (purchaseAmount >= 1000 && purchaseAmount < 1500){
            discount = purchaseAmount * SIX_PERCENT;
        }else if (purchaseAmount >= 1500 && purchaseAmount < 2000){
            discount = purchaseAmount * SEVEN_PERCENT;
        }else if(purchaseAmount >= 2000){
            discount = purchaseAmount * TEN_PERCENT;
        }

        DecimalFormat df = new DecimalFormat("#,###.00");

        return df.format(discount);
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###.00");

        PreferredCustomer pc = new PreferredCustomer(
                "Mike",
                "123 Main St",
                "1-1800-TELEPHONE",
                "93848",
                false,
                1100
        );

        System.out.println("Customer info\n" +
                "\tName: " + pc.getName()
        +"\n\tAddress: " + pc.getAddress()
        +"\n\tTelephone #: " + pc.getTelephoneNumber()
        +"\n\tCumter #: " + pc.getCustomer_number()
        +"\n\tMailing List: " + (pc.isInMailingList() ?  "Yes": "No"));

        System.out.println("______________________________________");

        System.out.println("Preferred customer" +
                "\n\tPurchase amount: $" + df.format(pc.getPurchaseAmount())
        +"\n\tDiscount: $" + df.format(Double.parseDouble(pc.getDiscount())));


    }
}
