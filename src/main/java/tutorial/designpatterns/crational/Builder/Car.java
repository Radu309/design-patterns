package tutorial.designpatterns.crational.Builder;

public class Car {
    private String color;
    private String engine;
    private String transmission;
    private int year;

    public Car(CarBuilder builder) {
        this.color = builder.getColor();
        this.engine = builder.getEngine();
        this.transmission = builder.getTransmission();
        this.year = builder.getYear();
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", engine=" + engine + ", transmission=" + transmission + ", year=" + year + "]";
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }
}