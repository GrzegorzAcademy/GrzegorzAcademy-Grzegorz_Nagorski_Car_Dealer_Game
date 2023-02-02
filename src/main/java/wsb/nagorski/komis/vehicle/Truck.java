package wsb.nagorski.komis.vehicle;

import wsb.nagorski.komis.Color;
import wsb.nagorski.komis.Demage;
import wsb.nagorski.komis.Segment;
import wsb.nagorski.komis.vehicle.vehicle;

public class Truck extends vehicle {
    String cargoSpace;

    public Truck(Double value, String brand, String model, Double millage, Color color, Segment segment, Demage demage, String cargoSpace) {
        super(value, brand, model, millage, color, segment, demage);
        this.cargoSpace = cargoSpace;
    }

    @Override
    void sell() {

    }

    @Override
    void repair() {

    }

    @Override
    void showCarDataBase() {

    }
}
