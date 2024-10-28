package tutorial.designpatterns.crational.AbstractFactory;

public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Window createWindow() {
        return new LightWindow();
    }
}
