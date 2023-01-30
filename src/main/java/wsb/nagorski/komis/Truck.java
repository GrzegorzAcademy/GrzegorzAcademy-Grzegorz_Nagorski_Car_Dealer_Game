package wsb.nagorski.komis;

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
