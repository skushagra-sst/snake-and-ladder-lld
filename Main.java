import java.util.List;

import game.Game;
import game.factories.BoardFactory;
import game.modifiers.Ladder;
import game.modifiers.Snake;
import game.stratigies.EndStrategy.DefaultEndStrategy;
import game.stratigies.EndStrategy.EndStrategy;
import game.stratigies.ModifierStrategy.ModifierStrategy;
import game.stratigies.ModifierStrategy.RandomModifierAllocation;
import game.stratigies.MoveStrategy.DefaultMoveStrategy;
import game.stratigies.MoveStrategy.MoveStrategy;
import game.stratigies.PlayerChoosingStrategy.DefaultPlayerChoosingStrategy;
import game.stratigies.PlayerChoosingStrategy.PlayerChoosingStrategy;
import game.stratigies.RollingStrategy.DefaultRollingStrategy;
import game.stratigies.RollingStrategy.RollingStrategy;
import game.stratigies.StartStrategy.DefaultStartStrategy;
import game.stratigies.StartStrategy.StartStrategy;

public class Main {

    public static void main(String[] args) {
        StartStrategy startStrategy = new DefaultStartStrategy();
        EndStrategy endStrategy = new DefaultEndStrategy();
        MoveStrategy moveStrategy = new DefaultMoveStrategy(startStrategy, endStrategy);

        RollingStrategy rollingStrategy = new DefaultRollingStrategy();

        PlayerChoosingStrategy playerChoosingStrategy = new DefaultPlayerChoosingStrategy();

        ModifierStrategy modifierStrategy = new RandomModifierAllocation(null);
        BoardFactory bFactory = new BoardFactory(modifierStrategy);

        Game game = new Game.Builder()
                .setNumberOfPlayers(2)
                .setMoveStrategy(moveStrategy)
                .setRollingStrategy(rollingStrategy)
                .setPlayerChoosingStrategy(playerChoosingStrategy)
                .setBoardFactory(bFactory)
                .build();

        game.start();
    }
}