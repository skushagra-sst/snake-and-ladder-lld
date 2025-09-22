package game.modifiers;

import game.entities.Player;

public class Snake implements StateModifier {

    private int futurePosition;

    public Snake(int futurePosition) {
        this.futurePosition = futurePosition;
    }

    @Override
    public void apply(Player player) {
        player.setPosition(this.futurePosition);
    }

}
