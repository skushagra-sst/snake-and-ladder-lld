package game.stratigies.PlayerChoosingStrategy;

import java.util.List;

import game.entities.Player;

public interface PlayerChoosingStrategy {

    public void setPlayers(List<Player> players);

    public Player get(int roll);
}
