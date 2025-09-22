package game;

import java.util.ArrayList;
import java.util.List;

import game.entities.Cell;
import game.stratigies.GameStrategy;

public class Game {

    private GameStrategy startStrategy;
    private GameStrategy endStrategy;
    private GameStrategy rollingStrategy;
    private int gameLength;
    private int numberOfPlayers;

    private Game() {
    }

    public void start() {
        System.out.println("Hello! Starting the game with " + this.numberOfPlayers + " players and game length of "
                + this.gameLength);

        List<Cell> board = new ArrayList<>();

        for (int i = 1; i <= this.gameLength; i++) {
            board.add(new Cell(i));
        }

    }

    static class Builder {
        private GameStrategy startStrategy;
        private GameStrategy endStrategy;
        private GameStrategy rollingStrategy;
        private int gameLength;
        private int numberOfPlayers;

        public Builder setStartStrategy(GameStrategy startStrategy) {
            this.startStrategy = startStrategy;
            return this;
        }

        public Builder setEndStrategy(GameStrategy endStrategy) {
            this.endStrategy = endStrategy;
            return this;
        }

        public Builder setRollingStrategy(GameStrategy rollingStrategy) {
            this.rollingStrategy = rollingStrategy;
            return this;
        }

        public Builder setGameLength(int gameLength) {
            this.gameLength = gameLength;
            return this;
        }

        public Builder setNumberOfPlayers(int numberOfPlayers) {
            this.numberOfPlayers = numberOfPlayers;
            return this;
        }

        public Game build() {
            Game game = new Game();
            game.startStrategy = this.startStrategy;
            game.endStrategy = this.endStrategy;
            game.rollingStrategy = this.rollingStrategy;
            game.gameLength = this.gameLength;
            game.numberOfPlayers = this.numberOfPlayers;
            return game;
        }
    }

}
