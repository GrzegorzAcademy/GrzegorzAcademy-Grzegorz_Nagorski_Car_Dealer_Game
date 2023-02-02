package wsb.nagorski.advertisingAgency;

import wsb.nagorski.menu.MainMenu;

import java.util.Scanner;

public class Advertisement {
    static Scanner sc = new Scanner(System.in);

    static void addAdvertInNewspaper() {
        System.out.println("wydałeś swoje pieniadze na kampanie marketingowę w gazecie");
    }

    static void onlineAdvertising() {
        System.out.println("wydałeś swoje pieniadze na kampanie marketingowę w gazecie");
    }

    public static void byAdvertising() {

        int choice;
        do {
            menuAdvertising();
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> addAdvertInNewspaper();
                case 2 -> onlineAdvertising();
                case 0 -> MainMenu.run();
            }
        }
        while (choice != 0);
        MainMenu.run();
    }

    private static void menuAdvertising() {
        System.out.println("Wybrałeś opcję zakupu reklamy : ");
        System.out.println("Wybierz 1 by zakupić reklamę w gazecie ");
        System.out.println("Wybierz 2 by zakupić reklamę online ");
        System.out.println("Wybierz 0 by wrócić do menu głównego ");
    }
}
