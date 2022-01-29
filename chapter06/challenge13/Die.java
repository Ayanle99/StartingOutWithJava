package challenge13;

import java.util.Random;

public class Die {
    private int sides;
    private int value;

    public Die(int numSides){
        sides =numSides;
        roll();
    }
    public void roll(){
        Random random = new Random();
        value = random.nextInt(sides) + 1;
    }
    public int getSides(){
        return sides;
    }
    public int getValue(){
        return value;
    }

}
