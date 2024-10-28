package tutorial.designpatterns.crational.Builder;

public class CarBuilder {
    private String color;
    private String engine;
    private String transmission;
    private int year;

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    // Getters pentru a accesa valorile în constructorul Car
    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getYear() {
        return year;
    }

    // Metoda build care creează un obiect Car
    public Car build() {
        return new Car(this);
    }
}