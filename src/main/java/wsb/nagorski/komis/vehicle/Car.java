package wsb.nagorski.komis.vehicle;

import wsb.nagorski.human.Client;
import wsb.nagorski.human.Player;
import wsb.nagorski.komis.Color;
import wsb.nagorski.komis.Demage;
import wsb.nagorski.komis.Segment;
import wsb.nagorski.menu.MainMenu;

import java.util.*;

public class Car extends vehicle {
    static Scanner scanner = new Scanner(System.in);

    Player player = new Player("Karol", "Kołodziejczyk", 1_000000.0);
    Demage demage;
    static Random random = new Random();
    public static ArrayList<Car> carListDatabase = new ArrayList<>();
    static List<Car> listCarToBuy = new ArrayList<>();
    static List<Car> ownedCars = new LinkedList<>();


    public void menuBuyCar() {
        int choice;
        do {
            listMenuBuyCar();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> Car.showListCarToBuy();
                case 2 -> buyCarToComisSTatic();
                case 0 -> System.out.println("powrót do manin menu");

            }
        } while (choice != 0);

        MainMenu.run();
    }

    private void buyCarToComisSTatic() {
        System.out.println("podaj numer pojazdu który chcesz kupić : ");
        int numberCar = scanner.nextInt() - 1;
        {
            if (listCarToBuy.get(numberCar).getValue() > player.getCash()) {
                System.out.println("niestety nie masz mieniędzy na to auto. Zacznij wiecej pracować.");
            } else {
                ownedCars.add(listCarToBuy.get(numberCar));
                System.out.println("kupiłeś" + listCarToBuy.get(numberCar).toString());
                player.setCash(player.getCash() - carListDatabase.get(numberCar).getValue());
                deletaCArToDatabase(numberCar);
                listCarToBuy.clear();
                addCarToListToBay();
            }
        }
    }

    public Car(int id, Double value, String model, String brand, Double millage, Color color,
               Segment segment, Demage demage) {
        super(id, value, model, brand, millage, color, segment, demage);
        this.demage = demage;
        Database.id++;
    }

    @Override
    void buyCarToComis(Player player, Client client) {

    }

    @Override
    public void buyCarToComis() {
    }

    private static void deletaCArToDatabase(int numberCar) {
        System.out.println(carListDatabase.size());
        carListDatabase.remove(carListDatabase.get(numberCar).getId());
        System.out.println(carListDatabase.size());
    }

    @Override
    void repair() {

    }

    public static void listOfOwnedCars() {
        for (Car car : ownedCars) {
            System.out.println(car.toString());
            System.out.println("------------------------------------------------------------------------------" +
                    "---------------------------------------");

        }
    }

    @Override
    public void showCarDataBase() {
        for (Car car : carListDatabase) {
            System.out.println(car.toString());
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

    public static void addCarToListToBay() {
        for (int i = 0; i < 3; i++) {
            listCarToBuy.add(carListDatabase.get(random.nextInt(carListDatabase.size())));
//            Car car = listCarToBuy.get(i);
//            System.out.println(car.toString());

        }
    }

    public static void showListCarToBuy() {
        for (Car car : listCarToBuy) {
            System.out.println(car.toString());
        }
    }


    static void listMenuBuyCar() {
        System.out.println("Wybrałęś opcję przeglądaj samocgody do kupienia : ");
        System.out.println(" 1 : przeglądaj bazę dostęonych pojazdów");
        System.out.println(" 2 : KUP POJAZD");
        System.out.println(" 0 : powrót do manin menu");
    }
}
