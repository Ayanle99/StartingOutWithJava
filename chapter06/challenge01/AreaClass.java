 package challenge01;

import java.text.DecimalFormat;

 /**
  * Please subscribe to my youtube channel: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
  * or look up the name "The blind programmer" to see more tutorials.
  */

 public class AreaClass {


    /**
     *
     *  Write a class that hass three overloaded static method for calculating the areas of the following geometric shapes.
     *
     *      1) Circle
     *      2) Rectangles
     *      3) Cylinders
     *  Here are the formulas for calculating the area of the shapes.
     *      Area of circle: Area = πr2
     *      where π is Math.PI and r is the circle's radius
     *
     *  Area of a rectangle: Area = Width X Height
     *  Area of a cyclinder: Area = πr2h
     *
     *
     *  where π is Math.PI, r is the radius of the cyclinder's base, and h is the cyclinder's height
     *  because the three methods are to be overloaded, they should each have the same name, but
     *  different  parameter lists. Demonstrate the class in a complete program.
     *
     * @param args
     */

    static DecimalFormat df = new DecimalFormat();

    public static void main(String[] args) {


        df.applyPattern("#0.##");

        System.out.println("Area of circle is: " + getArea(9));
        System.out.println("Area of rectangle is: " + getArea(9,9));
        System.out.println("Area of cylinder is: " + getArea( 3.0, 2.0));

    }
    private static double getArea(int radius) {

        return Double.parseDouble(df.format( Math.PI * Math.pow(radius, 2)));
    }

    private static double getArea(int width, int height){


        return Double.parseDouble(df.format((width*height)));
    }

    private static double getArea(double radius, double height){

        return Double.parseDouble(df.format((2 * Math.PI * radius*height) + 2 * Math.PI * Math.pow(radius,2)));
    }




}
