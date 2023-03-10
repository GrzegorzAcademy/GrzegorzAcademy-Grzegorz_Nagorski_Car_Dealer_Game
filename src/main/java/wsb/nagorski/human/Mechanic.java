package wsb.nagorski.human;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mechanic extends Human {
    static Scanner sc = new Scanner(System.in);
    static List<Mechanic> mechanics = new LinkedList<>();

    Integer effectiveness;
    int id;

    public void setEffectiveness(Integer effectiveness) {
        this.effectiveness = effectiveness;
    }

    public Integer getEffectiveness() {
        return effectiveness;
    }

    public Mechanic(int id, String name, String lastName, Integer effectiveness) {
        super(name, lastName);
        this.effectiveness = effectiveness;
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mechanik nr : ").append(id)
                .append(" imię : ").append(getName())
                .append(", nazwisko : ").append(getLastName()).
                append(", skuteczność ").append(effectiveness)
                .append(" %");
        return sb.toString();
    }

    public static void selectAndsendMechanics() {
        Mechanic.printListMechanics();
        System.out.println("Wybierz Mechanika");
        int numberOfMechanik = sc.nextInt();
        if (numberOfMechanik - 1 >= mechanics.size())
            System.out.println("przykro nam ale nia mechanika o numerze :" + numberOfMechanik);
        else
            System.out.println("Wybrałeś mechanika nr "
                    + numberOfMechanik + " " + mechanics.get(numberOfMechanik).toString());

    }


    static void addMechanicToComapnySet() {
        mechanics.add(new Mechanic(1, "Janusz", "Kowalski", 100));
        mechanics.add(new Mechanic(2, "Marian", "Kowalski", 90));
        mechanics.add(new Mechanic(3, "Adrian", "Kowalski", 80));

    }
    public static void addMechanicToComapny() {
    addMechanicToComapnySet();
    }

    public static void printListMechanics() {
        for (Mechanic mechanik : mechanics) {
            System.out.println(mechanik.toString());
        }
    }

    public static void hireMechanicsToCarRepair() {
        System.out.println("Zafrudnij mechaników");
        String line = sc.nextLine();
        Mechanic.printListMechanics();
        sc.nextLine();
    }
}


