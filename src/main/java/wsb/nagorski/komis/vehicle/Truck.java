package wsb.nagorski.komis.vehicle;

import wsb.nagorski.human.Client;
import wsb.nagorski.human.Player;
import wsb.nagorski.komis.Color;
import wsb.nagorski.komis.Demage;
import wsb.nagorski.komis.Segment;

public class Truck extends vehicle {
    String cargoSpace;

    public Truck(int id, Double value, String brand, String model, Double millage, Color color, Segment segment, Demage demage, String cargoSpace) {
        super(id++, value, brand, model, millage, color, segment, demage);
        this.cargoSpace = cargoSpace;
    }

    @Override
    void sell(Player player, Client client) {

    }

    @Override
    void repair() {

    }

    @Override
    void showCarDataBase() {

    }
}
