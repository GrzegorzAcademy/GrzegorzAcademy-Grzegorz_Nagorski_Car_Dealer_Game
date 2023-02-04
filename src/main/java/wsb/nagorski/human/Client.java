package wsb.nagorski.human;

import java.util.HashSet;
import java.util.Set;

public class Client extends Human {
    static Set<Client> clientsList = new HashSet<>();

    public Client(String name, String lastName, Double cash) {

        super(name, lastName, cash);
    }

    public Client() {
    }

    public void addClientToList() {
        clientsList.add(new Client("Jan ", "Kowalski", 50_000.0));
//        clientsList.add(new Client("Karol ", "Kołodziejczyk", 65000.0));
    }

    public void defaultListClient() {
        for (Client client : clientsList) {
            System.out.println("----------------------------------------------------" +
                    "-------------------------------");
            System.out.println(client.toString());
            System.out.println("----------------------------------------------------" +
                    "-------------------------------");
        }
    }
}
