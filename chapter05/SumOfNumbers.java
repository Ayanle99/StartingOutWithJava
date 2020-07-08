public class SumOfNumbers {
    /**
     *  Write a program that asks the user for a
     *  positive nonzero number integer value. The
     *  program should use a loop to get the sum
     *  of all the integers from 1 up to the number
     *  entered.
     *
     *  For example:
     *
     *  If the user enters 50, the loop will find the
     *  sum of 1,2,3,4....50.
     *
     */
    
    // Instantiate a scanner object to get user's input from the keyboard
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a nonzero integer");
        // Store the user's input in the num variable 
        int num = scanner.nextInt();
        
        // The total variable will hold the values
        double total = 0.0;

        // We'll check if the number entered by the user is negative.
        // and if it is negative, then prompt the user the number again.
        
        while (num < 1){
            System.out.print("Error: the number must be positive and NOT be zero: ");
            num = scanner.nextInt();
        }

        // We add the numbers between 1 up to the num to the total variable each time the loop run.
        for (int i = 1; i <= num; i ++){
            total += i;
        }
        
        // Print the total here. 
        System.out.println("The sum is: " + total);

    }


}
