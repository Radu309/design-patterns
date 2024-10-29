package tutorial.designpatterns.behavioral.Strategy;

/**
 * Design pattern-ul Strategy este un pattern comportamental care permite alegerea unui algoritm dintr-o familie de
 * algoritmi la runtime, fără a modifica codul care utilizează algoritmul. Prin intermediul acestui pattern,
 * comportamentul unui obiect poate fi schimbat dinamic, aplicând diferite strategii sau metode pentru a îndeplini o
 * sarcină.
 */

public class Main {
    public static void main(String[] args) {
        CalculatorContext calculator = new CalculatorContext(new AdditionStrategy());

        System.out.println("Addition: " + calculator.executeStrategy(5, 3));

        calculator.setStrategy(new SubtractionStrategy());
        System.out.println("Subtraction: " + calculator.executeStrategy(5, 3));

        calculator.setStrategy(new MultiplicationStrategy());
        System.out.println("Multiplication: " + calculator.executeStrategy(5, 3));
    }
}
