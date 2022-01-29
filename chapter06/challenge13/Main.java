package challenge13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int s1,s2;
        int diff1, diff2;
        String name1 , name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player 1 Name:");
        name1 = sc.next();
        System.out.println("Enter Player 2 Name: ");
        name2 = sc.next();

        Player p1 = new Player(name1);
        Player p2 = new Player(name2);
        int count = 1;
        while (p1.getScore() != 1 && p2.getScore() != 1){
            System.out.println();
            System.out.println();
            s1 = p1.roll();
            p1.modifyScore(s1);
            System.out.println(p1.getName() + " rolled a " + s1);
            diff1 = p1.getScore() - 1;
            s2 = p2.roll();
            p2.modifyScore(s2);
            System.out.println(p2.getName() + " rolled a " + s2);
            diff2 = p2.getScore() - 1;
            System.out.println(p1.getName() + " has " + p1.getScore() + " points.");
            System.out.println(p2.getName() + " has "+ p2.getScore() + " points.");
            if (diff1 == diff2){
                System.out.println("It is a tie");
            }
            else {
                if (diff1 < diff2){
                    System.out.println(p1.getName() + " wins.");
                }
                else {
                    System.out.println(p2.getName() +" wins.");
                }
            }
            count++;
        }

    }
}
