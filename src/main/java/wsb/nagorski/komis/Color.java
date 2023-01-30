package wsb.nagorski.komis;

public enum Color {

    WHITE("Biały"),BLACK("Czarny"),
    YELLOW("Żółty"),ORANGE("Pomarańczowy"),
    BROWN("Brązawy"),RED("Czrewony"),PINK("Różowy");
    private final String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
