package tutorial.designpatterns.structural.Bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Square with color: ");
        color.applyColor();  // Apelarea metodei de culoare
    }
}
