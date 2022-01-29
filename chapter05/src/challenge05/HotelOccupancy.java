package challenge05;

import java.text.NumberFormat;
import java.util.Scanner;

public class HotelOccupancy {

    public static void main(String[] args) {

        /**
         *  A hotel's occupancy rate is calculated as follows:
         *
         *          Occupancy = number of rooms occupied / total number of rooms.
         *
         *  Write a program that calculates the occupancy rate for
         *  each floor of a hotel. The program start by asking
         *  for the number of floors that the hotel has.
         *  A loop should than iterate one for each floor. During each
         *  iteration the loop should ask the user for the the number
         *  of rooms on the floor and how many of them are occupied.
         *
         *
         *  After all the iteration, the program should display the
         *  number of rooms the hotel has, the number that are occupied
         *  the number that are vacant, and the occupancy rate for the
         *  hotel.
         *
         *  Input Validation: Do not accept a vlaue less than 1 for the
         *  number of floors. Do not accept a number less than 10 for
         *  the number of rooms on a floor.
         */


        // 1) The number of rooms the hotel has
        // 2) The number that are occupied
        // 3) The number that are vacant
        // 4) The occupancy rate for the hotel

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many floors the hotel has: ");
        int floors = scanner.nextInt();

        while (floors < 1){
            System.out.print("Error: Enter how many floors: ");
            floors = scanner.nextInt();
        }

        int numberOfRooms = 0;
        int occupied = 0;
        int vacant = 0;
        double occupancy_rate = 0;

        for (int i = 1; i <= floors;i++){
            System.out.print("How many rooms in " + i + " : ");
            numberOfRooms += scanner.nextInt();

            while (numberOfRooms < 10){
                System.out.print("Error: Enter number of rooms: ");
                numberOfRooms = scanner.nextInt();
            }

            System.out.print("How many of them are occupied: ");
            occupied += scanner.nextInt();

        }

        vacant = (numberOfRooms - occupied);
        occupancy_rate = ((double) occupied / numberOfRooms);

        String format = "%3s%20s%20s%20s\n";
        System.out.printf(format, "# Rooms", "# Occupied", "# Vacant", "Occupancy Rate");

        NumberFormat nf = NumberFormat.getPercentInstance();

        nf.setMinimumIntegerDigits(1);

        System.out.println();

        System.out.printf(format, numberOfRooms, occupied, vacant, nf.format(occupancy_rate));

    }
}
