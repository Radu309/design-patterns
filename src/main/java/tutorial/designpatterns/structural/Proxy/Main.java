package tutorial.designpatterns.structural.Proxy;

/**
 *
 Design pattern-ul Proxy este un pattern structural care furnizează un substitut sau un "înlocuitor" pentru alt obiect,
 permițându-i unui client să interacționeze cu acel obiect prin intermediul proxy-ului său. Proxy-ul controlează accesul
 la obiectul real, permițând adesea adăugarea de funcționalități suplimentare, cum ar fi logare, validare, controlul
 accesului sau inițializarea întârziată (lazy loading).
 */

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        System.out.println("First display:");
        image.display();

        System.out.println("\nSecond display:");
        image.display();
    }
}
