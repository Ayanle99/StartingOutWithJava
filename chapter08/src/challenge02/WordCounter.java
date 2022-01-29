package challenge_8_2;

public class WordCounter {

    public static void main(String[] args) {


        String str = "Just Do It!";

        System.out.println("There are " + getWordCount(str) + " words.");


    }
    public static int getWordCount(String str){

        String[] split = str.split(" ");
        return split.length;


    }
}
