package tutorial.designpatterns.structural.Flyweight;

/**
 * Design pattern-ul Flyweight este un pattern structural care permite reducerea utilizării memoriei și îmbunătățirea
 * performanței prin partajarea obiectelor care sunt similare sau repetitive. În loc să creeze mai multe instanțe
 * separate ale obiectelor identice, pattern-ul Flyweight creează o singură instanță care este reutilizată de mai multe
 * ori, reducând astfel încărcarea asupra memoriei.
 */
public class Main {
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(10);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random() * 100);
    }

    private static int getRandomY() {
        return (int)(Math.random() * 100);
    }
}
