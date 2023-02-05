package wsb.nagorski.human;

import java.util.LinkedList;
import java.util.List;

public class Player extends Human {
    public static List<Player> listPlayer = new LinkedList<>();


    public static void addPlayerToList() {
        listPlayer.add(new Player("Karol", "Kołodziej", 1_000_000.0));
    }

    public Player(String name, String lastName, Double cash) {
        super(name, lastName, cash);


    }

    public Player() {

    }
}
