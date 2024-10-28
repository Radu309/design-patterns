package tutorial.designpatterns.crational.Singleton;

public class Singleton {
    // Instanță privată și statică de tip Singleton
    private static Singleton instance;

    // Constructor privat pentru a preveni instanțierea directă
    private Singleton() {
        // Cod de inițializare, dacă este necesar
    }

    // Metodă publică și sincronizată pentru a returna instanța Singleton (thread-safe)
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Metodă exemplu care va fi accesată prin instanța singleton
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
