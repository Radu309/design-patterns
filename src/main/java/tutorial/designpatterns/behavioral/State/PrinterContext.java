package tutorial.designpatterns.behavioral.State;

public class PrinterContext {
    private PrinterState currentState;

    public PrinterContext() {
        currentState = new ReadyState(); // initial state
    }

    public void setState(PrinterState state) {
        this.currentState = state;
    }

    public void printDocument() {
        currentState.printDocument(this);
    }
}
