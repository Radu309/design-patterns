package tutorial.designpatterns.structural.Decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
