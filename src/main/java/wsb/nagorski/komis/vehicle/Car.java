package wsb.nagorski.komis.vehicle;

import wsb.nagorski.human.Client;
import wsb.nagorski.human.Player;
import wsb.nagorski.komis.Color;
import wsb.nagorski.komis.Demage;
import wsb.nagorski.komis.Segment;

import java.util.*;

public class Car extends vehicle {
    static Scanner scanner = new Scanner(System.in);
    Client client;
    Demage demage;
Database database;
    static Random random = new Random();
    public static List<Car> carlist = new LinkedList<>();
    public static Set<Car> listCarToBay = new HashSet<>();
    public static Set<Car> listCarClient = new HashSet<>();


    public static void listOfCarsToBuy() {
        for (int i = 0; i <= 2; i++) {
            int randomNumber = random.ints(1, carlist.size()).findFirst().getAsInt();
            Car car = carlist.get(randomNumber);
            Car car1 = carlist.get(randomNumber);
            listCarToBay.add(car1);
        }
        for (Car car : listCarToBay) {
            System.out.println(car.toString());
            System.out.println("------------------------------------------------------------------------------" +
                    "---------------------------------------");

        }
    }

    public Car(int id, Double value, String model, String brand, Double millage, Color color,
               Segment segment, Demage demage) {
        super(id, value, model, brand, millage, color, segment, demage);
        this.demage = demage;
        Database.id++;
    }

    @Override
    public void sell(Player player, Client client) {
        System.out.println("podaj numer pojazdu który chcesz kupić : ");
        int numberCar = scanner.nextInt();
        {
            if (carlist.get(numberCar).getValue() > player.getCash()) {
                System.out.println("niestety nie masz mieniędzy na to auto. Zacznij wiećej pracować.");
            } else {
                listCarClient.add(carlist.get(numberCar));
                carlist.remove(carlist.get(numberCar));
            }
        }

    }

    @Override
    void repair() {

    }

    @Override
    public void showCarDataBase() {
        for (int i = 0; i < carlist.size(); i++) {
//            Car car = carlist.get(i);
            System.out.println(carlist.toString());
            System.out.println("------------------------------------------------------------------------------" +
                    "---------------------------------------");

        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID :").append(getId()).
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
