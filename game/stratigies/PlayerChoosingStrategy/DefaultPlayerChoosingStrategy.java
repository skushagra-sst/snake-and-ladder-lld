package game.stratigies.PlayerChoosingStrategy;

import java.util.List;

import game.entities.Player;

public class DefaultPlayerChoosingStrategy implements PlayerChoosingStrategy {
    List<Player> players;
    int runningIndex;

    public DefaultPlayerChoosingStrategy() {
        this.players = null;
        this.runningIndex = 0;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public Player get(int roll) {
        Player turn = this.players.get(runningIndex);
        if (roll != 6) {
            this.runningIndex = (this.runningIndex + 1) % this.players.size();
        }
        return turn;
    }

}