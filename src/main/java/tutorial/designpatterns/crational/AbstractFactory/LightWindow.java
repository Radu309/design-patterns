package tutorial.designpatterns.crational.AbstractFactory;

public class LightWindow implements Window {
    @Override
    public void render() {
        System.out.println("Light Window");
    }
}
