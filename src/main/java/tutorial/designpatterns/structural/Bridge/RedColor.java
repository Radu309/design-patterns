package tutorial.designpatterns.structural.Bridge;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red");
    }
}
