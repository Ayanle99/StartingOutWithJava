package challenge04;

import java.util.Scanner;
/**
 * Please subscribe to my youtube channel: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or look up the name "The blind programmer" to see more tutorials.
 */

public class LandTract {

    /**
     * Make a LandTract class that has two fields: one for the tract's length and one for the width.
     * The class should have a method that returns the tract's area,
     * as well as an equals method and a toString method. Demonstrate the class in a program that asks the user
     * to enter the dimensions for two tracts of land. The program should display the
     * area of each tract of land and indicate whether the tracts are of equal size.
     */

     // 1. fields: length, width
    // 2. method: area(), tostring
    // 3. create program to ask user lt dimension
     //  display area of each land and whether they are equal size

    private int length;
    private int width;

    public LandTract(int l, int w){
        this.length = l;
        this.width = w;
    }
    public int getArea(){
        return length * width;
    }
    public boolean equals(LandTract lt){

        return length == (lt.length) && width == (lt.width) ||
                length == (lt.width) && width == (lt.width);
    }

    public String toString() {
        return "The land trackt length is " + length + "\nAnd the width is " + width
                + "\nAnd the area is: " + getArea();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length for land 1: ");
        int length1 = sc.nextInt();
        System.out.print("Enter width for land 1: ");
        int width1 = sc.nextInt();

        LandTract l1 = new LandTract(length1, width1);
        int area1 = l1.getArea();

        System.out.print("Enter length for land 2: ");
        int length2 = sc.nextInt();
        System.out.print("Enter width for land 2: ");
        int width2 = sc.nextInt();

        LandTract l2 = new LandTract(length2, width2);
        int area2 = l2.getArea();

        System.out.println("\n");

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println();

        if (l1.equals(l2)){
            System.out.println("The landtract size is equal.");
        }else{
            System.out.println("The landtract are not equal size.");
        }








    }
}
