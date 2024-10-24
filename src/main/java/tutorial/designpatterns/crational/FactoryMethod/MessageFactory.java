package tutorial.designpatterns.crational.FactoryMethod;

public abstract class MessageFactory {
    public abstract Message createMessage();

    public void send(String recipient, String content){
        Message message = createMessage();
        message.sendMessage(recipient, content);
    }
}
