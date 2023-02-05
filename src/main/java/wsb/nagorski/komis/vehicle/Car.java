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
    Client client;
    Demage demage;
    Database database;
    static Random random = new Random();
    public static List<Car> carlist = new LinkedList<>();
    public static ArrayList<Car> listCarToBay = new ArrayList<>();


    public static void menuBuyCar() {

        int choce;
        do {
            listMenuBuyCar();
            choce = scanner.nextInt();
            switch (choce) {
                case 1 -> writeListCarToBay();
//                case 2 -> ;
                case 0 -> System.out.println("powrót do manin menu");

            }
        } while (choce != 0);

        MainMenu.run();
    }

    public Car(int id, Double value, String model, String brand, Double millage, Color color,
               Segment segment, Demage demage) {
        super(id, value, model, brand, millage, color, segment, demage);
        this.demage = demage;
        Database.id++;
    }


    public void buyCarToComis2() {
        List<Player> listPlayer = new LinkedList<>();
        listPlayer.add(new Player("Karol", "Kołodziej", 1_000_000.0));
        System.out.println(listPlayer.get(0));
        Double cash = listPlayer.get(0).getCash();

        System.out.println("podaj numer pojazdu który chcesz kupić : ");
        int numberCar = scanner.nextInt();
        {
            if (listCarToBay.get(numberCar).getValue() > cash) {
                System.out.println("niestety nie masz mieniędzy na to auto. Zacznij wiećej pracować.");
            } else {
                carlist.add(listCarToBay.get(numberCar));
                double v = cash + listCarToBay.get(numberCar).getValue();
                listCarToBay.remove(carlist.get(numberCar));
            }
            System.out.println(listPlayer.get(0).toString());
        }

    }

    @Override
    void buyCarToComis(Player player, Client client) {

    }

    @Override
    void repair() {

    }

    @Override
    public void showCarDataBase() {
        for (int i = 0; i < carlist.size(); i++) {
            Car car = carlist.get(i);
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

    static void writeListCarToBay() {
        for (int i = 0; i < 3; i++) {

            System.out.println(listCarToBay.get(random.nextInt(listCarToBay.size())));
        }
    }

    static void listMenuBuyCar() {
        System.out.println("Wybrałęś opcję przeglądaj samocgody do kupienia : ");
        System.out.println(" 1 : przeglądaj bazę dostęonych pojazdów");
        System.out.println(" 2 : kup pojazd");
        System.out.println(" 0 : powrót do manin menu");
    }
}
