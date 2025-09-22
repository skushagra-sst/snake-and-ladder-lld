package game.stratigies.EndStrategy;

import game.entities.Player;

public class DefaultEndStrategy implements EndStrategy {

    @Override
    public boolean didWin(Player p) {
        return p.getPosition() == 100;
    }

    public boolean requiresRevert(Player p) {
        return p.getPosition() > 100;
    }
}
