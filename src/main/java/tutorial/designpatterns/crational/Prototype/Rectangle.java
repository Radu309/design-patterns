package tutorial.designpatterns.crational.Prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    // Suprascrierea metodei clone() pentru a crea o copie a Rectangle
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor() + " rectangle with width " + width + " and height " + height);
    }

    // Getter și Setter pentru width și height
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}