package wsb.nagorski.komis;

public abstract class vehicle {
    private Double value;
    private String brand;
    private String model;
    private Double millage;
    Color color;
    Segment segment;
    Demage demage;

    abstract void sell();

    abstract void repair();

    abstract void showCarDataBase();

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getMillage() {
        return millage;
    }

    public void setMillage(Double millage) {
        this.millage = millage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public vehicle(Double value, String model, String brand, Double millage, Color color, Segment segment, Demage demage) {
        super();
        this.value = value;
        this.brand = brand;
        this.model = model;
        this.millage = millage;
        this.color = color;
        this.segment = segment;
        this.demage = demage;
    }

    public vehicle(Double value, String model, String brand, Double millage, Color color) {
        this.value = value;
        this.brand = brand;
        this.model = model;
        this.millage = millage;
        this.color = color;

    }
}
