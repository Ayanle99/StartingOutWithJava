package challenge07;

import java.text.DecimalFormat;

public class RetailItemModifacation {

    /**
     *  Modify the chapter's RetailItem class (which uses an inner class named CostData) to
     *  include accessor and mutator methods for getting and setting an item's wholesale and retail
     *  cost. Demonstrate the methods in a program.
     *
     */

    private String description;
    private int itemNumber;
    private CostData cost;

    public RetailItemModifacation(){}
    public String getDescription(){
        return description;
    }

    public RetailItemModifacation(String desc, int itemNum,
                      double wholesale, double retail){
        description = desc;
        this.itemNumber = itemNum;
        cost = new CostData(wholesale, retail);
    }
    public String toString(){
        String str;
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        str = "Description: " + description + "\nItem Number: " + itemNumber
                + "\nWholesale: $"+ dollar.format(cost.wholesale)
                +"\nRetail: $"+dollar.format(cost.retail);

        return str;
    }

    public double getRetail(){
        return cost.getRetail();
    }
    public double getWholeSale(){
        return cost.getWholesale();
    }
    private class CostData {
        public double wholesale, retail;
        public CostData(double w, double r){
            wholesale = w;
            retail =r;
        }

        public double getWholesale() {
            return wholesale;
        }

        public void setWholesale(double wholesale) {
            this.wholesale = wholesale;
        }

        public double getRetail() {
            return retail;
        }

        public void setRetail(double retail) {
            this.retail = retail;
        }
    }





}