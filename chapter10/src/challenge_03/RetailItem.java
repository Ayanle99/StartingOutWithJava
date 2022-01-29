package challenge_03;

public class RetailItem {

    private String description;
    private int unitsOnHand;
    private double price;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }


    public double getPrice() {
        return price;
    }

    public void setUnitsOnHand(int unitsOnHand) throws NegativeUnits{

        if (unitsOnHand < 0){
            throw new NegativeUnits(unitsOnHand);
        }

        this.unitsOnHand = unitsOnHand;
    }


    public void setPrice(double price) throws NegativePrice {

        if (price < 0){
            throw new NegativePrice(price);
        }

        this.price = price;
    }
}
