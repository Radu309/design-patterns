package tutorial.designpatterns.crational.AbstractFactory;

public class Application {
    private Button button;
    private Window window;

    public Application(UIFactory uiFactory) {
        button = uiFactory.createButton();
        window = uiFactory.createWindow();
    }
    public void displayUI(){
        button.paint();
        window.render();
    }
}
