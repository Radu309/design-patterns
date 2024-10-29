package tutorial.designpatterns.behavioral.State;

public class PrintingState implements PrinterState {
    @Override
    public void printDocument(PrinterContext context) {
        System.out.println("Printing in progress...");
        context.setState(new ReadyState());  // After printing, the printer goes back to ready
    }
}
