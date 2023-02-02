package wsb.nagorski.komis.vehicle;

import wsb.nagorski.komis.Color;
import wsb.nagorski.komis.Demage;
import wsb.nagorski.komis.Segment;

import java.util.*;

public class Car extends vehicle {

    Demage demage;
    static Random random = new Random();
    public static List<Car> carlist = new LinkedList<>();
    public static Set<Car> listCarToBay = new HashSet<>();
    static int id = 1;

    public static void addCarToMap() {
        carlist.add(new Car(id, 55000.0, "BMW", "118", 168000.0, Color.BLACK,
                Segment.STANDARD, Demage.BODY));

        carlist.add(new Car(id, 150000.0, "BMW", "318", 1680.0, Color.RED,
                Segment.STANDARD, Demage.BODY));

        carlist.add(new Car(id, 100000.0, "BMW", "518", 18000.0, Color.ORANGE,
                Segment.PREMIUM, Demage.NONE));

        carlist.add(new Car(id, 125000.0, "RENAULT", "MEGAN", 1600.0, Color.BLACK,
                Segment.STANDARD, Demage.BREAKS));

        carlist.add(new Car(id, 80000.0, "RENAULT", "KADJAR", 60500.0, Color.ORANGE,
                Segment.STANDARD, Demage.BODY));

        carlist.add(new Car(id, 100000.0, "RENAULT", "LATITIUDE", 1000.0, Color.BROWN,
                Segment.PREMIUM, Demage.NONE));

        carlist.add(new Car(id, 5000.0, "TOYOTA", "YARIS", 268000.0, Color.BLACK,
                Segment.BUDGET, Demage.GEARBOX));

        carlist.add(new Car(id, 45000.0, "TOYOTA", "CROSS", 100.0, Color.PINK,
                Segment.BUDGET, Demage.GEARBOX));

        carlist.add(new Car(id, 25000.0, "ALFA", "ROMEO", 8000.0, Color.BLACK,
                Segment.STANDARD, Demage.ENGINE));
        carlist.add(new Car(id, 155000.0, "OPEL", "INSIGNIA", 1600.0, Color.BLACK,
                Segment.PREMIUM, Demage.NONE));

        carlist.add(new Car(id, 250000.0, "LEXUS", "ES", 1500.0, Color.BLACK,
                Segment.PREMIUM, Demage.NONE));

        carlist.add(new Car(id, 25000.0, "LEXUS", "RX", 168000.0, Color.BLACK,
                Segment.PREMIUM, Demage.BODY));
        carlist.add(new Car(id, 25000.0, "BMW", "318", 168000.0, Color.BLACK,
                Segment.PREMIUM, Demage.BREAKS));

    }

    //    @Override
//    public void setId(int id) {
//        Car.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }

    public static void listOfCarsToBuy() {
        for (int i = 0; i <= 2; i++) {
            int randomNumber = random.ints(1, carlist.size()).findFirst().getAsInt();
            Car car = carlist.get(randomNumber);
            Car car1 = carlist.get(randomNumber);
            listCarToBay.add(car1);
        }
        for (Car car : listCarToBay) {
            System.out.println("------------------------------------------------------------------------------" +
                    "---------------------------------------");
            System.out.println(car.toString());
            System.out.println("------------------------------------------------------------------------------" +
                    "---------------------------------------");

        }
    }

    public Car(int id, Double value, String model, String brand, Double millage, Color color, Segment segment, Demage demage) {
        super(value, model, brand, millage, color, segment, demage);
        Car.id = id + 1;
        this.demage = demage;

    }
    @Override
    void sell() {

    }

    @Override
    void repair() {

    }

    @Override
    public void showCarDataBase() {
        for (Car car : carlist) {
            System.out.println("------------------------------------------------------------------------------" +
                    "---------------------------------------");
            System.out.println(car.toString());

        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID :").
//                append(Car.id).
        append(" Marka : ").append(getBrand())
                .append(", Model : ").append(getModel())
                .append(", Wartość : ").append(getValue())
                .append(", Kolor : ").append(getColor())
                .append(", Segment : ").append(getSegment())
                .append(", Uszkodzenia : ").append(demage.toString());

        return sb.toString();
    }

    public Car() {
    }
}
