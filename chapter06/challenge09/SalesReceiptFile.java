package challenge09;

import challenge07.RetailItemModifacation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class SalesReceiptFile {


    /**
     * Modify the program you wrote in Programming Challange 8 to create a file containing
     * a sales recipet. The program should ask the user for the quantity of items being purchased,
     * and then generate a file with contents similar to the following:
     *
     *      SALES RECEIPT
     *      Unit Price: $10.00
     *      Quantity: 5
     *      Subtotal: $50.00
     *      Sales Tax: $ 3.00
     *      Total: $53.00
     *
     */

        // Create a text file containing sales recipet
    // ask the user for quantity being purchased
    // title: SALES RECEIPT
    // Unit Price:
    // Quantity:
    // Subtotal:
    // Sales Tax:
    // Total:

     private int quantity;
     private RetailItemModifacation retail;

     public SalesReceiptFile(int q){
         quantity = q;
         retail = new RetailItemModifacation("Candy bar", q, 2, 10.00);
     }

     public int getQuantity(){
         return  quantity;
     }
     public double getUnitPrice(){
         return retail.getRetail();
     }
     public double getSubtotal(){
         return retail.getRetail() * quantity;
     }
     public double getSalesTax(){
         return getSubtotal() * 0.06;
     }
     public double getTotal(){
         return getSubtotal() + getSalesTax();
     }


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

         RetailItemModifacation item = new RetailItemModifacation();
         Scanner sc = new Scanner(System.in);
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        SalesReceiptFile sales = new SalesReceiptFile(quantity);


        PrintWriter pw = new PrintWriter("salesRecipet.txt", "UTF-8");

        pw.println("SALES RECEIPT");
        pw.println("Unit Price: $" + sales.getUnitPrice());
        pw.println("Quantity: " + sales.getQuantity());
        pw.println("Subtotal Price: $" + sales.getSubtotal());
        pw.println("Total: $" + sales.getTotal());

        pw.close();




    }



}
