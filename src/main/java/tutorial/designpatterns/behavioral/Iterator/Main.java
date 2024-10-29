package tutorial.designpatterns.behavioral.Iterator;

/**
 * Design pattern-ul Iterator este un pattern comportamental care furnizează o modalitate uniformă de a parcurge
 * elementele unei colecții, fără a expune structura internă a colecției. Astfel, Iterator permite accesarea fiecărui
 * element al colecției secvențial, fără ca utilizatorul să știe cum este implementată colecția (de exemplu, ca listă,
 * set, arbore etc.).
 */

public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();

        System.out.println("Name list:");
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
