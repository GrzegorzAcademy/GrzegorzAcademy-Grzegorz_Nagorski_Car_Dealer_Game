package wsb.nagorski.komis.vehicle;

import wsb.nagorski.human.Client;
import wsb.nagorski.human.Player;
import wsb.nagorski.komis.Color;

import java.util.List;

public class Motorbike extends vehicle {
    public Motorbike(Double value, String brand, String model, Double millage, Color color) {
        super(value, brand,model, millage, color);
    }

    @Override
    void buyCarToComis(Player player, Client client) {


    }

    @Override
    void repair() {
    }

    @Override
    void showCarDataBase() {

    }
}
