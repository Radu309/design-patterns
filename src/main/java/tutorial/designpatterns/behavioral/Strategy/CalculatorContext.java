package tutorial.designpatterns.behavioral.Strategy;

public class CalculatorContext {
    private Strategy strategy;

    public CalculatorContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.execute(num1, num2);
    }
}
