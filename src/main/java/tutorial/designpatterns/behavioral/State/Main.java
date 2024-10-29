package tutorial.designpatterns.behavioral.State;

/**
 * Design pattern-ul State este un pattern comportamental care permite unui obiect să își schimbe comportamentul atunci
 * când starea sa internă se schimbă. Pattern-ul State implică crearea unor clase care reprezintă diferitele stări ale
 * unui obiect și utilizarea acestora pentru a determina comportamentul obiectului în funcție de starea actuală.
 */
public class Main {
    public static void main(String[] args) {
        PrinterContext printer = new PrinterContext();

        // Trying to print in Ready State
        printer.printDocument();

        // After first print, printer is now in Printing State
        printer.printDocument();

        // Setting state to OutOfPaper and trying to print
        printer.setState(new OutOfPaperState());
        printer.printDocument();

        // Reload paper (setting back to Ready) and try again
        printer.setState(new ReadyState());
        printer.printDocument();
    }
}
