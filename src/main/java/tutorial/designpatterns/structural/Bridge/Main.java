package tutorial.designpatterns.structural.Bridge;

/**
 *
 Design pattern-ul Bridge este un pattern structural folosit pentru a separa abstractizarea de implementare, astfel
 încât cele două să poată varia independent. Este util în scenariile în care avem o ierarhie de clase și dorim să evităm
 o explozie de clase prin combinarea diferitelor tipuri de abstractizări și implementări.

 În loc să combinăm direct abstractizarea și implementarea într-o singură ierarhie de clase, le vom separa în două
 ierarhii diferite. Astfel, clasa abstractă de bază va conține un atribut de tipul interfeței implementării, creând un
 "pod" (de unde și numele "Bridge") între abstractizare și implementare.
 */
public class Main {
    public static void main(String[] args) {
        // Crearea unui cerc roșu
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();

        // Crearea unui pătrat albastru
        Shape blueSquare = new Square(new BlueColor());
        blueSquare.draw();
    }
}
