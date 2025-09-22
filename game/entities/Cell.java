package game.entities;

import game.modifiers.StateModifier;

public class Cell {
    private int value;
    private StateModifier modifier;

    public Cell(int value, StateModifier modifier) {
        this.value = value;
        this.modifier = modifier;
    }

    public Cell(int value) {
        this.value = value;
        this.modifier = null;
    }

    public int getValue() {
        return value;
    }

    public StateModifier getModifier() {
        return modifier;
    }

    public void setModifier(StateModifier modifier) {
        this.modifier = modifier;
    }

    public void applyModifier(Player player) {
        if (modifier != null) {
            modifier.apply(player);
        }
    }

}
