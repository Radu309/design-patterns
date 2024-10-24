package tutorial.designpatterns.crational.FactoryMethod;

public class SMSMessageFactory extends MessageFactory {
    @Override
    public Message createMessage() {
        return new SMSMessage();
    }
}
