package tutorial.designpatterns.behavioral.State;

public class OutOfPaperState implements PrinterState {
    @Override
    public void printDocument(PrinterContext context) {
        System.out.println("Error: Out of paper! Please load paper to continue.");
    }
}
