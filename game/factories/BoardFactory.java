package game.factories;

import java.util.ArrayList;
import java.util.List;

import game.entities.Board;
import game.entities.Cell;
import game.modifiers.StateModifier;
import game.stratigies.ModifierStrategy.ModifierStrategy;

public class BoardFactory {
    private int start;
    private int end;
    private ModifierStrategy modifierStrategy;

    public BoardFactory(ModifierStrategy modifierStrategy) {
        this.start = 1;
        this.end = 100;
        this.modifierStrategy = modifierStrategy;
    }

    public void setStart(int n) {
        this.start = n;
    }

    public void setEnd(int n) {
        this.end = n;
    }

    public Board create() {

        List<Cell> temp = new ArrayList<>();

        for (int i = this.start; i <= this.end; i++) {

            StateModifier modifier = this.modifierStrategy.get();

            Cell ithCell = new Cell(i, modifier);
            temp.add(ithCell);
        }

        return new Board(temp);
    }

}
