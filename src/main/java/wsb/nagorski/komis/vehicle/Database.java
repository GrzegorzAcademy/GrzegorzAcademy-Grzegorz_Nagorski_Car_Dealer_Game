package wsb.nagorski.komis.vehicle;

import wsb.nagorski.komis.Color;
import wsb.nagorski.komis.Demage;
import wsb.nagorski.komis.Segment;
import static wsb.nagorski.komis.vehicle.Car.carListDatabase;
import static wsb.nagorski.komis.vehicle.Car.ownedCars;


public class Database {

    public static int id = 1;

    public static void addingOwnedCarsToTheCollection() {
        ownedCars.add(new Car(id, 55000.0, "BMW", "118", 168000.0, Color.YELLOW,
                Segment.STANDARD, Demage.BODY));

        ownedCars.add(new Car(id, 150000.0, "BMW", "318", 1680.0, Color.RED,
                Segment.STANDARD, Demage.BODY));

        ownedCars.add(new Car(id, 100000.0, "BMW", "518", 18000.0, Color.ORANGE,
                Segment.PREMIUM, Demage.NONE));


    }


    public static void addCarToDatabaseCar() {
        carListDatabase.add(new Car(id, 125000.0, "RENAULT", "MEGAN", 1600.0, Color.BLACK,
                Segment.STANDARD, Demage.BREAKS));

        carListDatabase.add(new Car(id, 80000.0, "RENAULT", "KADJAR", 60500.0, Color.ORANGE,
                Segment.STANDARD, Demage.BODY));

        carListDatabase.add(new Car(id, 100000.0, "RENAULT", "LATITIUDE", 1000.0, Color.BROWN,
                Segment.PREMIUM, Demage.NONE));

        carListDatabase.add(new Car(id, 5000.0, "TOYOTA", "YARIS", 268000.0, Color.BLACK,
                Segment.BUDGET, Demage.GEARBOX));

        carListDatabase.add(new Car(id, 45000.0, "TOYOTA", "CROSS", 100.0, Color.PINK,
                Segment.BUDGET, Demage.GEARBOX));

        carListDatabase.add(new Car(id, 25000.0, "ALFA", "ROMEO", 8000.0, Color.BLACK,
                Segment.STANDARD, Demage.ENGINE));
        carListDatabase.add(new Car(id, 155000.0, "OPEL", "INSIGNIA", 1600.0, Color.BLACK,
                Segment.PREMIUM, Demage.NONE));

        carListDatabase.add(new Car(id, 250000.0, "LEXUS", "ES", 1500.0, Color.BLACK,
                Segment.PREMIUM, Demage.NONE));

        carListDatabase.add(new Car(id, 25000.0, "LEXUS", "RX", 168000.0, Color.BLACK,
                Segment.PREMIUM, Demage.BODY));
        carListDatabase.add(new Car(id, 25000.0, "BMW", "318", 16000.0, Color.YELLOW,
                Segment.PREMIUM, Demage.BREAKS));
    }
}
