package tutorial.designpatterns.crational.AbstractFactory;

public class DarkButton implements Button {
    @Override
    public void paint() {
        System.out.println("Dark Button");
    }
}
