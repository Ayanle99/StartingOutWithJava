package challenge_7_13;

import java.io.File;
import java.util.Scanner;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */

public class SearchNames {

    static File boysNamesFilePath = new File("src/challenge_7_13/BoysNames.txt");
    static File girlsNamesFilePath = new File("src/challenge_7_13/GirlsNames.txt");

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you want to look up boys or girls' names? \n(type b for boys or g for girls)");

        String userChoice = keyboard.nextLine();

        if (userChoice.charAt(0) == 'b' || userChoice.charAt(0)== 'B'){
            getBoysNames();
        }
        if (userChoice.charAt(0) == 'g' || userChoice.charAt(0)== 'G'){
            getGirlsnames();
        }

    }

    private static void getBoysNames() {


        try {

            Scanner boysNames = new Scanner(boysNamesFilePath);
            Scanner sc  = new Scanner(System.in);


            int ccounter = 0;

            System.out.print("\nEnter the boy's name: ");
            String name = sc.nextLine();
            System.out.println();

            while (boysNames.hasNext()){

                String currentName = boysNames.nextLine();

                if (currentName.equalsIgnoreCase(name)){
                    System.out.println("We found him! The name '" + currentName + "'\nis #" +(ccounter+1) + "" +
                            " of the most popular name given to boys in the U.S between the years (2000-2009)");

                }
                ccounter++;



            }



        }catch (Exception e){
            System.out.println(e.toString());
        }

    }

    private static void getGirlsnames() {


        try {

            Scanner girlsNames = new Scanner(girlsNamesFilePath);
            Scanner sc  = new Scanner(System.in);

            int ccounter = 0;

            System.out.print("\nEnter the girl's name: ");
            String name = sc.nextLine();
            System.out.println();

            while (girlsNames.hasNext()){

                String currentName = girlsNames.nextLine();

                if (currentName.equalsIgnoreCase(name)){
                    System.out.println("We found her! the name '" + currentName + "'" +
                            "\nis #" +(ccounter+1) + " of the most popular name given to girls in the U.S between the years of (2000-2009)");

                }
                ccounter++;



            }

        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
