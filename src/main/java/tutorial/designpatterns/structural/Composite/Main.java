package tutorial.designpatterns.structural.Composite;

/**
 * Design pattern-ul Composite este un pattern structural care permite tratarea obiectelor individuale și a
 * compozițiilor de obiecte în mod uniform. Acest pattern este util atunci când ai o structură ierarhică de tip arbore,
 * cum ar fi un sistem de fișiere sau un meniu de aplicație, și vrei să aplici aceleași operațiuni asupra fiecărui
 * element (fie el o compoziție sau un obiect individual).
 */
public class Main {
    public static void main(String[] args) {
        // Crearea angajaților individuali (frunze)
        Employee dev1 = new Developer("Alice", "Frontend Developer");
        Employee dev2 = new Developer("Bob", "Backend Developer");

        // Crearea unui manager care îi gestionează pe dev1 și dev2
        Manager manager1 = new Manager("Charlie", "Project Manager");
        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);

        // Crearea unui alt manager
        Employee dev3 = new Developer("David", "Full Stack Developer");
        Manager generalManager = new Manager("Eve", "General Manager");
        generalManager.addEmployee(manager1);
        generalManager.addEmployee(dev3);

        // Afișarea structurii angajaților
        System.out.println("Organizație:");
        generalManager.showEmployeeDetails();
    }
}
