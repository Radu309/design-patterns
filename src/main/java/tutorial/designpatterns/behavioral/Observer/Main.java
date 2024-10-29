package tutorial.designpatterns.behavioral.Observer;

/**
 * Design pattern-ul Observer este un pattern comportamental care definește o relație de tipul unu-la-mai-mulți între
 * obiecte. În această relație, când un obiect (numit Subject) își schimbă starea, toate obiectele dependente (numite
 * Observers) sunt notificate automat și își actualizează starea. Acest pattern este foarte util atunci când dorim să
 * actualizăm mai multe componente în funcție de modificările unuia.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject youtubeChannel = new ConcreteSubject();

        Observer subscriber1 = new ConcreteObserver("Alice");
        Observer subscriber2 = new ConcreteObserver("Bob");
        Observer subscriber3 = new ConcreteObserver("Charlie");

        youtubeChannel.addObserver(subscriber1);
        youtubeChannel.addObserver(subscriber2);
        youtubeChannel.addObserver(subscriber3);

        youtubeChannel.uploadNewVideo("Observer Pattern Tutorial");

        youtubeChannel.removeObserver(subscriber2);

        youtubeChannel.uploadNewVideo("Design Patterns in Java");
    }
}
