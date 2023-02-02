package human;

public abstract class Human {

    private String name;
    private String lastName;
    private Double cash;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Human(String name, String lastName, Double cash) {
        this.name = name;
        this.lastName = lastName;
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
