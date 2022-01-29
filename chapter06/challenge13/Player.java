package challenge13;



import java.util.Random;

public class Player {

    private String name;
    private int score;
    private Die die;
    public Player(String a){
        name = a;
        score = 50;
        die = new Die(6);
    }

    public int roll(){
        die.roll();
        return (die.getValue());
    }

    public void modifyScore(int a){

        if ((score - a) < 1) {

        }else {
            score = score -a;
        }

    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }

}
