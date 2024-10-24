package tutorial.designpatterns.crational.FactoryMethod;

public class EmailMessageFactory extends MessageFactory {

    @Override
    public Message createMessage() {
        return new EmailMessage();
    }
}
