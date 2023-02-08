package wsb.nagorski.human;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Client extends Human{
    static Set<Client> clientsList = new HashSet<Client>();

    public Client(String name, String lastName, Double cash) {
        super(name, lastName, cash);
    }

    String target = "Jan";

    public Client() {
    }

    public void addClientToList() {
        clientsList.add(new Client("Jan", "Kowalski", 50_000.0));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
        void removeClient(){
        for (Iterator<Client> iterator = clientsList.iterator(); iterator.hasNext();){
            Client client = iterator.next();{
                if (target.equals(client.getName())){
                    iterator.remove();
                }


            }
        }
    }
}
