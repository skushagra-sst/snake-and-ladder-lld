import game.Game;
import game.DefaultGameFacade.DefaultGameFacade;
import game.DefaultGameFacade.GameFacade;

public class Main {

    public static void main(String[] args) {
        GameFacade facade = new DefaultGameFacade();

        Game game = facade.createGame();

        game.start();
    }
}