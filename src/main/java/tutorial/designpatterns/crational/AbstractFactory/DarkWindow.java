package tutorial.designpatterns.crational.AbstractFactory;

public class DarkWindow implements Window {
    @Override
    public void render() {
        System.out.println("Dark window");
    }
}
