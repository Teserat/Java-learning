package the_basics;

public class NewSwitch2Pistol {
    private int bullets = 6;

    public String shoot(int shots) {
        return switch (shots) {
            case 0 -> "No shots fired.";
            case 1, 2, 3, 4, 5, 6 -> {
                if (shots > bullets) {
                    bullets = 0;
                    yield "Not enough bullets, you fired " + shots + " times. Now you have " + bullets + " bullets, please reload.";
                } else {
                    bullets -= shots;
                    if (bullets == 0) {
                        yield "All bullets fired. No bullets left. Please reload.";
                    } else {
                        yield shots + " shots fired. " + bullets + " bullets remaining.";
                    }
                }
            }
            default -> "Invalid number of shots.";
        };
    }

    public void reload() {
        bullets = 6;
        System.out.println("Pistol reloaded. 6 bullets available.");
    }

    public static void main(String[] args) {
        NewSwitch2Pistol pistol = new NewSwitch2Pistol();

        // Test cases
        System.out.println(pistol.shoot(3)); // Should output: "3 shots fired. 3 bullets remaining."
        System.out.println(pistol.shoot(2)); // Should output: "2 shots fired. 1 bullet remaining."
        System.out.println(pistol.shoot(2)); // Should output: "Not enough bullets. Please reload."
        pistol.reload();                     // Should output: "Pistol reloaded. 6 bullets available."
        System.out.println(pistol.shoot(6)); // Should output: "All bullets fired. No bullets left. Please reload."
    }
}