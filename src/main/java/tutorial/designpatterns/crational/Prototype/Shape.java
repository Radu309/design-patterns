package tutorial.designpatterns.crational.Prototype;

public abstract class Shape implements Cloneable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    // Metoda clone care va fi implementată de subclase
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();
}
