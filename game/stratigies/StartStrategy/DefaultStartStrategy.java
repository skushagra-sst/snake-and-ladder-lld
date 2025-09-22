package game.stratigies.StartStrategy;

import game.entities.Player;
import game.stratigies.GameStrategy;

public class DefaultStartStrategy implements StartStrategy {
    @Override
    public int validate(Player p, int roll) {
        if (p.getPosition() == 0 && roll == 6) {
            return 1;
        }

        if (p.getPosition() > 0) {
            return roll;
        }

        return 0;
    }
}
