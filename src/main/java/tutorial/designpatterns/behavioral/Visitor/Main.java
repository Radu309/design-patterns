package tutorial.designpatterns.behavioral.Visitor;

/**
 * Design pattern-ul Visitor este un pattern comportamental care permite adăugarea de noi operații asupra obiectelor
 * dintr-o structură, fără a modifica clasele acestor obiecte. Acest pattern separă algoritmul de obiectele asupra
 * cărora operează, permițând adăugarea de noi comportamente prin implementarea de noi clase vizitator. Visitor este
 * util atunci când avem o structură complexă de obiecte și vrem să aplicăm diverse operații asupra acestor obiecte
 * fără a schimba structura lor internă.
 */
public class Main {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book(50, "1234"),
                new Book(100, "5678"),
                new Fruit(2, 3, "Banana"),
                new Fruit(5, 2, "Apple")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum += item.accept(visitor);
        }
        return sum;
    }
}
