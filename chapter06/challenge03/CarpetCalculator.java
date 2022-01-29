package challenge03;

import java.util.Scanner;
/**
 * Please subscribe to my youtube channel: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or look up the name "The blind programmer" to see more tutorials.
 */

public class CarpetCalculator {

    /**
     * The Westfield Carpet Company has asked you to write an application that calculates the
     * price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the
     * floar  ( width times height) by the price per square foot of carpet. For example, the area of floor
     *  that is 12 feet long and 10 feet wide is 120 square feet. to cover that floor with carpet
     *  that costs $8 per square foot would cost $960. ( 12 x 10 x 8)
     *
     *  First you should  create a class named RoomDimension that has two fields: one for the length
     *  of the room and one for the width. The RoomDimension class should have a method that
     *  that returns the the area of the room. ( The area of the room is the room's length multiplied by the room's width)
     *
     *  Next you should create a RoomCarpet class that has a RoomDimension object as a field. It
     *  should also have a field for the cost of the carpet per square foot.
     *  The RoomCarpet class should have a method that returns the total cost of the carpet.
     *
     *  Figure 6-21 is a UML diagram showing possible class designs and depicting  the relationship
     *  between the classes. Once you have written these classes , use them in an applicaiton that asks
     *  the user to enter the dimensions of a room  and the price per square foot of the
     *  desired carpeting. The application should display the total cost of the carpet. 
     */


    // 1. Create RoomDimension -> fields: length, width
         // method: getArea()
    // 2. Create RoomCarpet -> fields: RoomDimension Object, cost per square foot
         // method: getTotalCost()
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the room: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the room: ");
        double width = sc.nextDouble();

        System.out.print("Enter the cost per sq feet: ");
        double cost = sc.nextDouble();

        RoomDimension rd = new RoomDimension(length, width);
        RoomCarpet rc = new RoomCarpet(rd, cost);

        System.out.println("The total cost is: $" + rc.getTotalCost());


    }

}
