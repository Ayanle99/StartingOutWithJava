package challenge_8_16;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConverter {

    public static void main(String[] args) {

        Map<Character, String> map =  new LinkedHashMap<>();

        map.put(' ', " ");
        map.put(',', "--..--");
        map.put('.', ".-.-.-");
        map.put('?', "..--..");
        map.put('0', "-----");
        map.put('1', ".----");
        map.put('2', "..---");
        map.put('3', "...--");
        map.put('4', "....-");
        map.put('5', ".....");
        map.put('6', "-....");
        map.put('7', "--...");
        map.put('8', "---..");
        map.put('9', "----.");
        map.put('A', ".-"); // .-
        map.put('B', "-...");
        map.put('C', "-.-.");
        map.put('D', "-..");
        map.put('E', ".");
        map.put('F', "..-.");
        map.put('G', "--.");
        map.put('H', "....");
        map.put('I', "..");
        map.put('J', ".---");
        map.put('K', "-.-");
        map.put('L', ".-..");
        map.put('M', "--");
        map.put('N', "-.");
        map.put('O', "---");
        map.put('P', ".--.");
        map.put('Q', "--.-");
        map.put('R', ".-.");
        map.put('S', "...");
        map.put('T', "-");
        map.put('U', "..-");
        map.put('V', "...-");
        map.put('W', ".--");
        map.put('X', "-..-");
        map.put('Y', "-.--");
        map.put('Z', "--..");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter english sentence: ");
        String english = sc.nextLine();

        char[] arr = english.toUpperCase().toCharArray();

        String result = "";

        for (char ch : arr){
            result += map.get(ch);
        }

        System.out.println("English:\t" + english
        +"\nMorse Code:\n" + result);

    }
}
