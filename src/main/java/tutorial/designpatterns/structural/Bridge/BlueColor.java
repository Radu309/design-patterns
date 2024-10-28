package tutorial.designpatterns.structural.Bridge;

public class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}