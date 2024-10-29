package tutorial.designpatterns.behavioral.ChainOfResponsability;

/**
 * Design pattern-ul Chain of Responsibility este un pattern comportamental care permite transmiterea unei cereri de la
 * un obiect la altul, printr-un lanț de manipulatoare (handlers). Fiecare handler din lanț decide dacă va procesa
 * cererea sau o va trimite mai departe către următorul handler din lanț. Acest pattern permite evitarea legăturii
 * directe între client și handler-ul specific, permițând handler-elor să fie adăugate sau eliminate din lanț fără a
 * afecta clientul.
 */

public class Main {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        System.out.println("Logging at INFO level:");
        loggerChain.logMessage(Logger.INFO, "This is an information message.");

        System.out.println("\nLogging at DEBUG level:");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug message.");

        System.out.println("\nLogging at ERROR level:");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
    }}
