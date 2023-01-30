package wsb.nagorski.menu;

import wsb.nagorski.human.Mechanic;
import wsb.nagorski.komis.Car;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    static Scanner sc = new Scanner(System.in);
    static Integer choice = 13;

    private static void printMenu() {

        System.out.println(" 1 - Przeglądaj bazę samochodów do kupienia");
        System.out.println(" 2-  Kup samochód ");
        System.out.println(" 3 - Przeglądaj bazę posiadanych samochdów");
        System.out.println(" 4 - Napraw samochód");
        System.out.println(" 5 - Przejrzyj potencjalnych klientów");
        System.out.println(" 6 - Sprzedaj samochód potencjalnemu klientowi");
        System.out.println(" 7 - Kup reklamę");
        System.out.println(" 8 - Sprawdz stan konta");
        System.out.println(" 9 - Sprawdz historię transakcji");
        System.out.println(" 10 - Sprawdz historię naprawy każdego pojazdu");
        System.out.println(" 11 - sprawdz sumę kosztów napraw i mycia dla każdego z posiadanych pojazdów");
        System.out.println(" 12 - zatrudnij mechaników");
        System.out.println(" 0 - wyjście z gry");

    }


    public static void run() {

        do {
            printMenu();
            try {
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1 -> System.out.println("Baza samochodów");
                    case 2 -> System.out.println("Kup samochód");
                    case 3 -> {System.out.println("Przeglądaj bazę samochodów");
                     Car.privateCarList();}
                    case 4 -> {
                        System.out.println("Wybrałeś opcje : Napraw pojazd");
                        System.out.println("A oto Lista dostępnych mechaników :");
                        System.out.println("Wybierz mądrze !!");
                        Mechanic.selectAndsendMechanics();

                    }
                    case 5 -> System.out.println("Przejzyj potencjalncyh klientów");
                    case 6 -> System.out.println("sprzedaj samochód potencjalnemu klientowi");
                    case 7 -> System.out.println("Kup reklamę");
                    case 8 -> System.out.println("sprawdz stan konta");
                    case 9 -> System.out.println("sprawdz historie transkacji");
                    case 10 -> System.out.println("sprawdz historię naprawy każdego pojazdu");
                    case 11 -> System.out.println("suma kosztów napraw kazdego pojazdu");
                    case 12 -> Mechanic.hireMechanicsToCarRepair();
                    default -> System.out.println("Zły wybór, spróbuj jeszcze raz");
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("wprowadzono nieprawidłową wartość, Wprowadz liczbę naturalna ");
                sc.nextLine();
            }
        }
        while (choice != 0);
        {
            System.out.println("Bay Bay");
        }
    }


}
