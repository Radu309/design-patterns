package tutorial.designpatterns.crational.FactoryMethod;

public class SMSMessage implements Message {
    @Override
    public void sendMessage(String recipient, String content) {
        System.out.println("Sending SMS to: " + recipient + ": " + content);
    }
}
