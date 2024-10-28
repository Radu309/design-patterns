package tutorial.designpatterns.crational.AbstractFactory;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Window createWindow() {
        return new DarkWindow();
    }
}
