package LLDSnakeLadder.src;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    
    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int value = 0;

        for(int i=0; i<diceCount; i++){
            value += (ThreadLocalRandom.current().nextInt(min, max+1));
        }

        return value;
    }
}
