package tutorial.designpatterns.behavioral.Mediator;

/**
 * Design pattern-ul Mediator este un pattern comportamental care simplifică comunicarea dintre obiecte, prin
 * intermediul unui obiect central denumit "mediator". Acest pattern reduce legăturile directe dintre obiecte, care în
 * mod normal ar interacționa între ele. În loc să comunice direct, obiectele trimit cereri mediatorului, care
 * gestionează transmiterea mesajelor sau activităților între ele.
 */

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ConcreteChatMediator();

        User user1 = new ConcreteUser(chatMediator, "Alice");
        User user2 = new ConcreteUser(chatMediator, "Bob");
        User user3 = new ConcreteUser(chatMediator, "Charlie");
        User user4 = new ConcreteUser(chatMediator, "Diana");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hello everyone!");
        user3.send("Hi Alice!");
    }
}
