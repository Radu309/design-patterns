package tutorial.designpatterns.behavioral.ChainOfResponsability;

public class InfoLogger extends Logger {
    public InfoLogger() {
        this.level = Logger.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO Logger: " + message);
    }
}
