package challenge_8_7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckWriter {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the amount: $");

        double amount = sc.nextDouble();

        String [] parts = String.valueOf(amount).split("\\.");

        int wholeNumber = Integer.parseInt(parts[0]);
        int cents = Integer.parseInt(parts[1]);

        WordNumber wn = new WordNumber();

        System.out.println();

        System.out.println("Pay to the order of: " + name + "\t11/3/1992");
        System.out.println(wn.getThousands(wholeNumber) + " and " + wn.getTwos(cents)
                + " cents.\t$" + df.format(amount));



    }
}
