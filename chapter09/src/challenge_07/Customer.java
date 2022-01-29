package challenge_07;

public class Customer extends Person {

    private String customer_number;
    private boolean isInMailingList;

    public Customer(String name, String address, String telephoneNumber,
                    String customer_number, boolean isInMailingList){
        super(name, address, telephoneNumber);

        this.customer_number = customer_number;
        this.isInMailingList = isInMailingList;
    }


    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public boolean isInMailingList() {
        return isInMailingList;
    }

    public void setInMailingList(boolean inMailingList) {
        isInMailingList = inMailingList;
    }
}
