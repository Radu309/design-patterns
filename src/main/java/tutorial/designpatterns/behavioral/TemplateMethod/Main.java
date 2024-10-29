package tutorial.designpatterns.behavioral.TemplateMethod;

/**
 * Design pattern-ul Template Method este un pattern comportamental care definește scheletul unui algoritm într-o metodă
 * dintr-o clasă abstractă și permite subclaselor să modifice anumite etape ale algoritmului fără a schimba structura sa
 * generală. Astfel, clasele derivate pot redefini anumite părți ale algoritmului, dar ordinea execuției și pașii
 * generali rămân stabilite de metoda din clasa de bază.
 */
public class Main {
    public static void main(String[] args) {
        HotBeverage tea = new Tea();
        System.out.println("Preparing tea:");
        tea.prepareRecipe();

        System.out.println("\nPreparing coffee:");
        HotBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
