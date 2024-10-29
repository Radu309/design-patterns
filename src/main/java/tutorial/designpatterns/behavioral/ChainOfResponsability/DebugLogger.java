package tutorial.designpatterns.behavioral.ChainOfResponsability;

public class DebugLogger extends Logger {
    public DebugLogger() {
        this.level = Logger.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG Logger: " + message);
    }
}
