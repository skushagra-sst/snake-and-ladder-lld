package game.stratigies.ModifierStrategy;

import java.util.List;
import java.util.Random;

import game.modifiers.StateModifier;

public class RandomModifierAllocation implements ModifierStrategy {

    private List<StateModifier> availableModifiers;

    public RandomModifierAllocation(List<StateModifier> availableModifiers) {
        this.availableModifiers = availableModifiers;
    }

    public StateModifier get() {
        if (this.availableModifiers == null || this.availableModifiers.isEmpty()) {
            return null;
        }

        if (this.availableModifiers.size() == 1) {
            return this.availableModifiers.get(0);
        }

        Random random = new Random();
        int randomIndex = random.nextInt(this.availableModifiers.size());
        return this.availableModifiers.get(randomIndex);
    }

}
