package game.stratigies;

public class StartStrategy implements GameStrategy {
    @Override
    public void execute() {
        System.out.println("Starting the game with StartStrategy!");
    }
}
