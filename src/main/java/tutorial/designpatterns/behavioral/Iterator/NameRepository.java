package tutorial.designpatterns.behavioral.Iterator;

public class NameRepository {
    private String[] names = { "John", "Paul", "George", "Ringo" };

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
