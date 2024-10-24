package tutorial.designpatterns.crational.FactoryMethod;

public class EmailMessage implements Message{
    @Override
    public void sendMessage(String recipient, String content){
        System.out.println("Email sent to " + recipient + ": "+content);
    }

}
