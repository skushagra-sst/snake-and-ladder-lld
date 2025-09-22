package game.modifiers;

import game.entities.Player;

public interface StateModifier {
    void apply(Player player);
}
