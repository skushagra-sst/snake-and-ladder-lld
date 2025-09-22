package game.stratigies.RollingStrategy;

import game.entities.Dice;

public class DefaultRollingStrategy implements RollingStrategy {

    private Dice dice;

    public DefaultRollingStrategy() {
        this.dice = new Dice(6);
    }

    @Override
    public int rollDice() {
        return this.dice.roll();
    }
}
