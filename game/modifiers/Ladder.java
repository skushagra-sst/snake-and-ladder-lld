package game.modifiers;

import game.entities.Player;

public class Ladder implements StateModifier {

    private int futurePosition;

    public Ladder(int futurePosition) {
        this.futurePosition = futurePosition;
    }

    @Override
    public void apply(Player player) {
        player.setPosition(this.futurePosition);
    }

}
