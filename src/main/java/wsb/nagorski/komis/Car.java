package wsb.nagorski.komis;

import java.util.LinkedList;
import java.util.List;

public class Car extends vehicle {
    Demage demage;
    static List<Car> carlist = new LinkedList<>();
    public static void privateCarList() {
        carlist.add(new Car(55000.0, "BMW", "118", 168000.0, Color.BLACK,
                Segment.STANDARD, Demage.BODY));
        carlist.add(new Car(150000.0, "BMW", "318", 1680.0, Color.RED,
                Segment.STANDARD, Demage.BODY));
        carlist.add(new Car(100000.0, "BMW", "518", 18000.0, Color.ORANGE,
                Segment.PREMIUM, Demage.NONE));
        carlist.add(new Car(125000.0, "RENAULT", "MEGAN", 1600.0, Color.BLACK,
                Segment.STANDARD, Demage.BREAKS));
        carlist.add(new Car(80000.0, "RENAULT", "KADJAR", 60500.0, Color.ORANGE,
                Segment.STANDARD, Demage.ENGINE));
        carlist.add(new Car(100000.0, "RENAULT", "LATITIUDE", 1000.0, Color.BROWN,
                Segment.PREMIUM, Demage.NONE));
        carlist.add(new Car(5000.0, "TOYOTA", "YARIS", 268000.0, Color.BLACK,
                Segment.BUDGET, Demage.GEARBOX));
        carlist.add(new Car(45000.0, "TOYOTA", "CROSS", 100.0, Color.PINK,
                Segment.BUDGET, Demage.GEARBOX));
        carlist.add(new Car(25000.0, "ALFA", "ROMEO", 8000.0, Color.BLACK,
                Segment.STANDARD, Demage.ENGINE));
        carlist.add(new Car(155000.0, "OPEL", "INSIGNIA", 1600.0, Color.BLACK,
                Segment.PREMIUM, Demage.NONE));
        carlist.add(new Car(250000.0, "LEXUS", "ES", 1500.0, Color.BLACK,
                Segment.PREMIUM, Demage.NONE));
        carlist.add(new Car(25000.0, "LEXUS", "RX", 168000.0, Color.BLACK,
                Segment.PREMIUM, Demage.BODY));
        carlist.add(new Car(25000.0, "BMW", "318", 168000.0, Color.BLACK,
                Segment.PREMIUM, Demage.BREAKS));
        for (Car car : carlist) {
            System.out.println("____________________________________________________________________________________" +
                    "___________________________________________");
            System.out.println(car.toString());
        }

    }

    public Car(Double value, String model, String brand, Double millage, Color color, Segment segment, Demage demage) {
        super(value, model, brand, millage, color, segment, demage);
//        this.segment = segment;
        this.demage = demage;
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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Marka : ").append(getBrand())
                .append(", Model : ").append(getModel())
                .append(", Wartość : ").append(getValue())
                .append(", Kolor : ").append(getColor())
                .append(", Segment : ").append(getSegment())
                .append(", Uszkodzenia : ").append(demage.toString());
        return sb.toString();
    }
}