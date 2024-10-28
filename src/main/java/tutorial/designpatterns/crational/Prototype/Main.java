package tutorial.designpatterns.crational.Prototype;

/**
 * Design pattern-ul Prototype este folosit pentru a crea copii ale unui obiect existent în loc să fie create noi
 * instanțe de la zero. Este util când instanțierea unui obiect este costisitoare (în termeni de timp sau resurse) și
 * dorim să creăm mai multe obiecte similare. În Java, Prototype este de obicei implementat folosind metoda clone() din
 * interfața Cloneable.
 */

public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect prototip de tip Rectangle
        Rectangle originalRectangle = new Rectangle("Blue", 10, 20);
        originalRectangle.draw();

        // Crearea unei clone a obiectului originalRectangle
        try {
            Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
            clonedRectangle.setColor("Red"); // Modificăm culoarea clonei
            clonedRectangle.draw();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
