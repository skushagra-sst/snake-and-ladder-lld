
package game.stratigies.StartStrategy;

import game.entities.Player;

public interface StartStrategy {

    public int validate(Player p, int roll);

}