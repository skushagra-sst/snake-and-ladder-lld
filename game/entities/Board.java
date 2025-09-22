package game.entities;

import java.util.List;

public class Board {

    private List<Cell> board;

    public Board(List<Cell> board) {
        this.board = board;
    }

    public List<Cell> getBoard() {
        return this.board;
    }

    public Cell getCell(int position) {
        return position > 0 ? this.board.get(position - 1) : null;
    }

}
