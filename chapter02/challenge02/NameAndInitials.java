package challenge_02;

public class NameAndInitials {

    public static void main(String[] args) {

        String firstName = "George";
        String middleName = "Bob";
        String lastName = "Alex";

        char firstInitials = firstName.charAt(0);
        char middleInitials = middleName.charAt(0);
        char lastInitials = lastName.charAt(0);

        System.out.println("First name: " + firstName
        +"\nMiddle name: " + middleName
        +"\nLast name: " + lastName
        +"\nFirst name initials: " + firstInitials
        +"\nMiddle name initials: " + middleInitials
        +"\nLast name initials: " + lastInitials);
    }


}
