package tutorial.designpatterns.behavioral.Visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book ISBN::" + book.getIsbn() + " cost =" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit " + fruit.getName() + " cost = " + cost);
        return cost;
    }
}
