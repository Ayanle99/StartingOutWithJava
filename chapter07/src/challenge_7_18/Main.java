package challenge_7_18;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        ArrayList<PhoneBookArrayList> info = new ArrayList<>();

        info.add(new PhoneBookArrayList("Mike", "000-000-0000"));
        info.add(new PhoneBookArrayList("Sara", "000-555-0000"));
        info.add(new PhoneBookArrayList("James", "666-000-9877"));
        info.add(new PhoneBookArrayList("Gufran", "111-888-9999"));
        info.add(new PhoneBookArrayList("Eliot", "777-999-0000"));


        System.out.println("\nPhoneBook Info");
        System.out.println();
        System.out.printf("%1s%15s\n", "Name", "Phone Number");
        System.out.println();


        for (PhoneBookArrayList ph : info){

            System.out.printf("%1s%15s\n", ph.getName(), ph.getPhoneNumber());
        }


    }
}
