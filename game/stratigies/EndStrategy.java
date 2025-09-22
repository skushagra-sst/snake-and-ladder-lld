package game.stratigies;

public class EndStrategy implements GameStrategy {
    @Override
    public void execute() {
        System.out.println("Ending the game with EndStrategy!");
    }
}
