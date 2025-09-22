package game.stratigies.EndStrategy;

import game.entities.Player;

public interface EndStrategy {

    public boolean didWin(Player p);

    public boolean requiresRevert(Player p);

}