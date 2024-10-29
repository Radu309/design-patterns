package tutorial.designpatterns.behavioral.TemplateMethod;

public abstract class HotBeverage {

    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Primitive operations (abstract methods)
    protected abstract void brew();
    protected abstract void addCondiments();
}
