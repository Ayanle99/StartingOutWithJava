package challenge08;

import challenge07.RetailItemModifacation;

import java.util.Scanner;

public class CashRegister {


    /**
     * Write a CashRegister class that can be used with the RetailItem class that you modified in
     * Programming CChallannge 7. The CashRegiister cclass hsould simulate the sale of a retail item.
     * It should have a constructor that accepts a RetailItem object as an argument. The constructor
     * should also accept in integer that repressents the quanitity
     * of items being purchased. In addition, the class should have the following methods:
     *
     * 1) The getSubTotal method should return the subtotal of the sale, which is the quanity
     * multiplied by the retail cost. This method must get the retail cost from the RetailItem
     * object that was passed as an argument to the constructor.
     *
     * 2) the getTax method should return the amount of  sales tax on the purchase. The sales
     * tax rate is 6% of a retail sale.
     *
     * 3) The getTotal method should return the total of the salewhich is the subtotal plus
     * the sales tax.
     *
     * Demonstrate the class in a program that asks the quanitity of the items being purchased.
     * and then displays the sales's subtotal, amount of sales tax, and total.
     *
     */

    // Notes:
         // constructor: RetailItemModifacation, int quanity.
        //  getSubTotal() -> retailItem.getRetail() * quantity;
       //   getTax() -> getSubTotal() * 0.06
      //    getTotal() => getSubTotal() + getTax()

    // ask the user for quantity, and display subtotal, tax, and total.

    private RetailItemModifacation retail;
    private int quantity;

    public CashRegister(RetailItemModifacation ri, int quantity){

        retail = new RetailItemModifacation("Candy bar",quantity, 0.75, 1.5 );
        this.quantity = quantity;

    }
    public double getSubTotal(){
        return retail.getRetail() * quantity;
    }
    public double getTax(){
        return getSubTotal() * 0.06;
    }
    public double getTotal(){
        return getSubTotal() + getTax();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RetailItemModifacation item = new RetailItemModifacation();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        CashRegister cashRegister = new CashRegister(item, quantity );

        System.out.println();

        System.out.println("Sub Total: $" + cashRegister.getSubTotal());
        System.out.println("Sales Tax: $" + cashRegister.getTax());
        System.out.println("Total Amount: $" + cashRegister.getTotal());




    }




}
