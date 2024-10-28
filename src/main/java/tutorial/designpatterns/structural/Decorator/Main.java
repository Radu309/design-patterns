package tutorial.designpatterns.structural.Decorator;

/**
 Design pattern-ul Decorator este un pattern structural care permite adăugarea dinamică a unor funcționalități
 suplimentare unui obiect existent, fără a modifica clasa acestuia. Spre deosebire de moștenire, unde extindem
 funcționalitatea prin subclase, Decorator utilizează compoziția pentru a "îmbrăca" un obiect existent cu noi
 funcționalități, păstrându-i în același timp interfața.
 */
public class Main {
    public static void main(String[] args) {
        // Cafea simplă
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " Cost: $" + simpleCoffee.getCost());

        // Cafea cu lapte
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.getCost());

        // Cafea cu lapte și zahăr
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " Cost: $" + milkSugarCoffee.getCost());
    }
}
