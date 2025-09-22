package game.stratigies.MoveStrategy;

import game.entities.Player;
import game.stratigies.EndStrategy.EndStrategy;
import game.stratigies.StartStrategy.StartStrategy;

public class DefaultMoveStrategy implements MoveStrategy {

    private StartStrategy startStrategy;
    private EndStrategy endStrategy;

    public DefaultMoveStrategy(StartStrategy startStrategy, EndStrategy endStrategy) {
        this.startStrategy = startStrategy;
        this.endStrategy = endStrategy;
    }

    @Override
    public boolean move(Player p, int roll) {

        int moveBy = this.startStrategy.validate(p, roll);

        p.setPosition(p.getPosition() + moveBy);

        boolean didWin = this.endStrategy.didWin(p);

        boolean requiresRevert = this.endStrategy.requiresRevert(p);

        if (requiresRevert) {
            p.setPosition(p.getPosition() - moveBy);
        }

        return didWin;
    }

}
