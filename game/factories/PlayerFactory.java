package game.factories;

import java.util.ArrayList;
import java.util.List;

import game.entities.Player;
import game.utils.RandomName;

public class PlayerFactory {

    public static Player create() {

        String name = RandomName.get();

        Player p = new Player(name);
        return p;
    }

    public static List<Player> create(int n) {
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Player p = new Player(RandomName.get());
            players.add(p);
        }
        return players;

    }

}
