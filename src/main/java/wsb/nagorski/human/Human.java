package wsb.nagorski.human;

import java.util.Objects;

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
        this.cash = cash;
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Human() {
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double getCash() {
        return cash;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Imię : ").append(name).
                append(" Nazwisko : ").append(lastName).
                append(", Stan konta : ").append(cash);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName) && Objects.equals(cash, human.cash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, cash);
    }
}
