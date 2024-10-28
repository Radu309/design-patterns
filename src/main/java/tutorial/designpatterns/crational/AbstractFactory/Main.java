package tutorial.designpatterns.crational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Creare aplicație cu temă Light
        UIFactory lightFactory = new LightThemeFactory();
        Application lightApp = new Application(lightFactory);
        System.out.println("Light Theme:");
        lightApp.displayUI();

        // Creare aplicație cu temă Dark
        UIFactory darkFactory = new DarkThemeFactory();
        Application darkApp = new Application(darkFactory);
        System.out.println("\nDark Theme:");
        darkApp.displayUI();
    }
}
