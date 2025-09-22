package game.utils;

import java.util.Random;

public class RandomName {

    // Arrays of adjectives and animals for easy-to-remember name combinations
    private static final String[] ADJECTIVES = {
            "Brave", "Clever", "Swift", "Mighty", "Wise", "Bold", "Quick", "Strong",
            "Smart", "Fierce", "Noble", "Rapid", "Sharp", "Bright", "Calm", "Wild",
            "Lucky", "Happy", "Silent", "Golden", "Silver", "Royal", "Epic", "Super"
    };

    private static final String[] ANIMALS = {
            "Wolf", "Eagle", "Tiger", "Lion", "Fox", "Bear", "Hawk", "Shark",
            "Panther", "Falcon", "Dragon", "Phoenix", "Leopard", "Jaguar", "Cobra",
            "Raven", "Stallion", "Rhino", "Puma", "Lynx", "Viper", "Owl", "Whale", "Dolphin"
    };

    public static String get() {
        Random random = new Random();

        // Pick random adjective and animal
        String adjective = ADJECTIVES[random.nextInt(ADJECTIVES.length)];
        String animal = ANIMALS[random.nextInt(ANIMALS.length)];

        // Add random number for uniqueness (optional)
        int number = random.nextInt(100); // 0-99

        // Format: AdjectiveAnimal + Number (e.g., "BraveWolf42")
        return adjective + animal + number;
    }
}
