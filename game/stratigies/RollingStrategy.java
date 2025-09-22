package game.stratigies;

public class RollingStrategy implements GameStrategy {
    @Override
    public void execute() {
        System.out.println("Rolling the game with RollingStrategy!");
    }
}
