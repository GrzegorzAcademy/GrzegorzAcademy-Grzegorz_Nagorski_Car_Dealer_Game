package human;

public class Player extends Human {
    private Player(String name, String lastName, Double cash) {
        super(name, lastName, cash);
    }

    public Player p1 = new Player("Karol", "Kołodziejczyk", 1_000_000.0);

}
