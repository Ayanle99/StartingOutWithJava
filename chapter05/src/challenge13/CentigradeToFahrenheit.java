package challenge13;

public class CentigradeToFahrenheit {


    /**
     *
     *    Write a program that displays a table of the centigrade
     *    temperatures from 0 through 20 and their Fehranheit equivelent,
     *    The formula for converting temperature from centigrade to
     *    fahrenheit is: F = 9/5 + 32
     *
     *    F = Fahrenheit
     *    C = Centigrade
     *
     *    Your program must use a loop to display the table
     *
     */

    public static void main(String[] args) {


        System.out.printf("%1s%20s\n", "Centigrade", "Fahrenheit");
        for (int i = 0; i < 21; i ++){
            double temp = (i * 9/5) + 32;
            System.out.printf("%1s%26s\n", i, temp);
        }

    }


}
