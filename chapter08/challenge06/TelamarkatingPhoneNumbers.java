package challenge_8_6;

import java.util.ArrayList;
import java.util.Scanner;

public class TelamarkatingPhoneNumbers {

    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> phoneNumbers = new ArrayList<>();

    public static void main(String[] args) {


        names.add("Harrison, Ross");
        names.add("James, Jean");
        names.add("Smith, William");
        names.add("Smith, Brad");

        phoneNumbers.add("555-2234");
        phoneNumbers.add("555-9098");
        phoneNumbers.add("555-1785");
        phoneNumbers.add("555-9224");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name or part of a name: ");
        String  name = sc.nextLine();

        searchName(name);

    }

    private static void searchName(String name) {

        int index = 0;

        System.out.println();
        System.out.println("____________________________________________________");
        for (String x : names){
            if (x.contains(name)){
                index++;
                System.out.println("Name: " + x + "\t" + phoneNumbers.get(index));
            }
        }


    }
}
