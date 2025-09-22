package game.entities;

import java.util.Random;

public class Dice {

    private int numFaces;

    public Dice(int numFaces) {
        this.numFaces = numFaces;
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(this.numFaces) + 1;
    }

}
