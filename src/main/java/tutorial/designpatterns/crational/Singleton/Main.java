package tutorial.designpatterns.crational.Singleton;

/**
 * Singleton Design Pattern este un design pattern care asigură că o clasă are o singură instanță pe
 * durata vieții aplicației și oferă un punct global de acces la această instanță. Este util atunci când avem nevoie de
 * un singur obiect pentru a coordona anumite acțiuni, cum ar fi o conexiune la baza de date, un manager de configurări
 * sau un cache centralizat.
 */

public class Main {
    public static void main(String[] args) {
        // Obține instanța singleton și utilizează-o
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
