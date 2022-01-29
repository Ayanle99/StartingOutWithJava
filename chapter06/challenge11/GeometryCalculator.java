package challenge11;

import java.util.Scanner;

public class GeometryCalculator {

    /**
     *  Design a Geometry class with the following methods:
     *
     *  1) A static method the accepts the radius of a circle and returns the area of the circle.
     *  Use the following formula:
     *         Area = PI * r squared
     *  Use Math.PI for pi and the radius of the circle for r.
     *
     *  2) A static method that accepts the length and width of a rectangle
     *  and returns the area of the rectangle. use the following formula:
     *       Area = Length x width
     * 3) A static method that accepts the length of a triangle's base and the triangle's height.
     * The method should return the area of the triangle. Use the following formula:
     *      Area = Base x Height x 0.5
     *
     *
     * The methods should display an error message if negative values are used for the circle's
     * radius, the rectangle's length or width, or the triangle's base or height.
     * Next, write a program to test the class, which displays the following menu and responds
     * to the user's selection:
     *
     *      Geometry Calculator
     *      1. Calculate the Area of a Circle
     *      2. Calculate the Area of a Rectangle
     *      3. Calculate the Area of a Triangle
     *      4. Quit
     *
     *      Enter your choice (1-4):
     *
     *
     *  Display a error message if the user enters number outside the range of 1 through 4 when
     *  selecting an item from the menu.
     *
     */

    // getArea() - Circle
    // getArea() - Rectangle
    // getArea() - Triangle
    // Test it in a class
    public static void main(String[] args) {

        System.out.println("1. Calculate the Area of Circle: ");
        System.out.println("2. Calculate the Area of Rectangle: ");
        System.out.println("3. Calculate the Area of Triangle: ");
        System.out.println("4. Quit");
        System.out.println();
        System.out.println("Enter your choice (1-4): ");

        Scanner sc =  new Scanner(System.in);
        int choice = sc.nextInt();

        while (choice < 0 || choice > 4){
            System.out.println("Error: negative numbers are not allowed: ");
            System.out.println();

            System.out.println("1. Calculate the Area of Circle: ");
            System.out.println("2. Calculate the Area of Rectangle: ");
            System.out.println("3. Calculate the Area of Triangle: ");
            System.out.println("4. Quit");
            System.out.println();
            System.out.println("Enter your choice (1-4): ");

            choice = sc.nextInt();

        }

        switch (choice){
            case 1:
                System.out.println("Enter the radius of the circle: ");
                int radius = sc.nextInt();
                System.out.println("The Area of circle is: " + getAreaOfCircle(radius));
                break;
            case 2:
                System.out.println("Enter the length of the rectangle: ");
                int length = sc.nextInt();
                System.out.println("Enter the width of the rectangle: ");
                int width = sc.nextInt();
                System.out.println("The Area of rectangle is: " + getAreaOfRectangle(length, width));

                break;
            case 3:
                System.out.println("Enter the base of the Triangle: ");
                int base = sc.nextInt();
                System.out.println("Enter the height of the Triangle: ");
                int height = sc.nextInt();
                System.out.println("The area of the Triangle is: " + getAreaOfTriangle(base, height));

                break;
            default:

        }


    }

    public static double getAreaOfCircle(int radius){
        if ( radius < 0){
            System.out.println("Error: negative numbers are not valid.");
        }
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    public static double getAreaOfRectangle(int l, int w){
        if (l < 0 || w < 0){
            System.out.println("Error: negative numbers are not valid.");
        }
        return Math.round(l * w);
    }
    public static double getAreaOfTriangle(int base, int h){
        if (base < 0 || h < 0){
            System.out.println("Error: negative numbers are not valid.");
        }
        return Math.round(base * h * 0.5);
    }




}
