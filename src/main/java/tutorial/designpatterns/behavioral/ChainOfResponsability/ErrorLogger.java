package tutorial.designpatterns.behavioral.ChainOfResponsability;

public class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.level = Logger.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR Logger: " + message);
    }
}

