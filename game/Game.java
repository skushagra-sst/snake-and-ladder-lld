package game;

import java.util.List;

import game.entities.Board;
import game.entities.Cell;
import game.entities.Player;
import game.factories.BoardFactory;
import game.factories.PlayerFactory;
import game.stratigies.MoveStrategy.MoveStrategy;
import game.stratigies.PlayerChoosingStrategy.PlayerChoosingStrategy;
import game.stratigies.RollingStrategy.RollingStrategy;

public class Game {

    private RollingStrategy rollingStrategy;
    private MoveStrategy moveStrategy;
    private PlayerChoosingStrategy playerChoosingStrategy;
    private BoardFactory bFactory;
    private int numberOfPlayers;

    private Game() {

    }

    public void start() {
        System.out.println("Hello! Starting the game!!");
        Board b = this.bFactory.create();

        List<Player> players = PlayerFactory.create(this.numberOfPlayers);

        this.playerChoosingStrategy.setPlayers(players);

        while (true) {

            int roll = this.rollingStrategy.rollDice();
            Player turn = this.playerChoosingStrategy.get(roll);
            boolean didWin = this.moveStrategy.move(turn, roll);

            if (didWin) {
                System.out.println("Player " + turn.getName() + " has won the game!!");
                break;
            }

            Cell c = b.getCell(turn.getPosition());

            if (c != null)
                c.applyModifier(turn);

        }

    }

    public static class Builder {
        private MoveStrategy moveStrategy;
        private RollingStrategy rollingStrategy;
        private PlayerChoosingStrategy playerChoosingStrategy;
        private BoardFactory bFactory;
        private int numberOfPlayers;

        public Builder setMoveStrategy(MoveStrategy moveStrategy) {
            this.moveStrategy = moveStrategy;
            return this;
        }

        public Builder setRollingStrategy(RollingStrategy rollingStrategy) {
            this.rollingStrategy = rollingStrategy;
            return this;
        }

        public Builder setNumberOfPlayers(int numberOfPlayers) {
            this.numberOfPlayers = numberOfPlayers;
            return this;
        }

        public Builder setBoardFactory(BoardFactory bFactory) {
            this.bFactory = bFactory;
            return this;
        }

        public Builder setPlayerChoosingStrategy(PlayerChoosingStrategy playerChoosingStrategy) {
            this.playerChoosingStrategy = playerChoosingStrategy;
            return this;
        }

        public Game build() {
            Game game = new Game();
            game.moveStrategy = this.moveStrategy;
            game.rollingStrategy = this.rollingStrategy;
            game.bFactory = this.bFactory;
            game.numberOfPlayers = this.numberOfPlayers;
            game.playerChoosingStrategy = this.playerChoosingStrategy;
            return game;
        }
    }
}
