package tutorial.designpatterns.behavioral.State;

public class ReadyState implements PrinterState {
    @Override
    public void printDocument(PrinterContext context) {
        System.out.println("Printer is ready. Starting to print...");
        context.setState(new PrintingState());
    }
}
