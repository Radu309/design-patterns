package tutorial.designpatterns.behavioral.Visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
