package challenge_8_15;

import java.beans.PropertyEditorSupport;

public class PigLatin {

    public static void main(String[] args) {

        String sentence = "I SLEPT MOST OF THE NIGHT";
        //                 IAY LEPTSAY OSTMAY FOAY HETAY IGHTNAY


        String[] arr = sentence.split(" ");

        String result = "";

        for (int i = 0; i < arr.length;i++){

            if (i == 0){
                result += arr[i] + "AY ";
            }else {
                char ch = arr[i].charAt(0);
                result += arr[i].substring(1) + "" + ch + "AY ";
            }

        }

        System.out.println("English:\t" + sentence
        +"\nPig Latin:\t" + result);



    }

}
