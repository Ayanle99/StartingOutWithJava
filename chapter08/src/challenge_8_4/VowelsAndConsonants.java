package challenge_8_4;

public class VowelsAndConsonants {

    private String words;

    public VowelsAndConsonants(String str){
        this.words = str;
    }
    public int getVowels(){
        int count = 0;
        for(int i = 0; i < words.length();i++){

            if (words.charAt(i) == 'a' || words.charAt(i) == 'i'
            || words.charAt(i) == 'o' || words.charAt(i) == 'u' || words.charAt(i) == 'e'){
                count++;
            }
        }
        return count;
    }
    public int getCons(){

        int count = 0;

        for(int i = 0; i < words.length();i++){

            boolean check = !(words.charAt(i) == 'a' || words.charAt(i)== 'i' || words.charAt(i) == 'o'
            || words.charAt(i) == 'u' || words.charAt(i) == 'e' || words.charAt(i) == ' ');

            if (check){
                count++;
            }


        }
        return count;

    }
}
