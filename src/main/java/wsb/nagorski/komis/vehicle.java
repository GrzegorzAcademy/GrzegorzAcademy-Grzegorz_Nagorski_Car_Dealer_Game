package wsb.nagorski.komis;

public abstract class vehicle {
    String brand;
    String model;
    Double value;
    abstract void sell();
    abstract void repair();
    abstract void showCarDataBase();
}
