package tutorial.designpatterns.crational.AbstractFactory;

public class LightButton implements Button {
    @Override
    public void paint() {
        System.out.println("Light Button");
    }
}
